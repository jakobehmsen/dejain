package jasy.interceptors.transcription;

import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Session {
    public abstract static class SessionedTask implements Callable<Object> {
        public Session session;
    }

    public static class SessionedFuture<T> implements RunnableScheduledFuture<T> {

        public Session session = SessionFactory.current.createSession();
        private RunnableScheduledFuture<T> implementer;

        public SessionedFuture(RunnableScheduledFuture<T> implementer) {
            this.implementer = implementer;
        }

        @Override
        public boolean cancel(boolean mayInterruptIfRunning) {
            return implementer.cancel(mayInterruptIfRunning);
        }

        @Override
        public boolean isCancelled() {
            return implementer.isCancelled();
        }

        @Override
        public boolean isDone() {
            return implementer.isDone();
        }

        @Override
        public T get() throws InterruptedException, ExecutionException {
            return implementer.get();
        }

        @Override
        public T get(long timeout, TimeUnit unit) throws InterruptedException,
                ExecutionException, TimeoutException {
            return implementer.get(timeout, unit);
        }

        @Override
        public void run() {
            implementer.run();
        }

        @Override
        public long getDelay(TimeUnit unit) {
            return implementer.getDelay(unit);
        }

        @Override
        public int compareTo(Delayed o) {
            return implementer.compareTo(o);
        }

        @Override
        public boolean isPeriodic() {
            return implementer.isPeriodic();
        }
    }

    public static ScheduledThreadPoolExecutor Executor = new ScheduledThreadPoolExecutor(1) {
        @Override
        protected <V> RunnableScheduledFuture<V> decorateTask(Callable<V> callable, RunnableScheduledFuture<V> task) {
            return new SessionedFuture<V>(task);
        }

        protected void beforeExecute(Thread t, Runnable r) {
            @SuppressWarnings("unchecked")
            SessionedFuture<Object> futureTask = (SessionedFuture<Object>) r;
            Session.set(futureTask.session);
        }

        protected void afterExecute(Runnable r, Throwable t) {
            Session.set(null);
        }
    };

    private static ThreadLocal<Session> Session = new ThreadLocal<Session>();

    private Store store;

    public Session(Store store) {
        this.store = store;
    }

    public Store getStore() {
        return store;
    }
    
    public static Session getCurrentSession() {
        return Session.get();
    }
}

package jasy;

import java.security.ProtectionDomain;

public interface ClassFileTransformationFilter {
    boolean shouldTransform(ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer);
}

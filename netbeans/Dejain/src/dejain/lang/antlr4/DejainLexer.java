// Generated from C:\github\dejain\netbeans\Dejain\src\dejain\lang\antlr4\Dejain.g4 by ANTLR 4.1
package dejain.lang.antlr4;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DejainLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ELLIPSES=1, COMMA=2, OPEN_PAR=3, CLOSE_PAR=4, AT=5, PLUS=6, MINUS=7, ASSIGN_OP=8, 
		REPLACE_OP=9, KW_THIS_RESULT=10, KW_TRY=11, KW_CATCH=12, KW_FINALLY=13, 
		KW_IF=14, KW_ELSE=15, KW_RETURN=16, KW_THROW=17, KW_CLASS=18, KW_TRUE=19, 
		KW_FALSE=20, WILD_CARD=21, SEMI_COLON=22, COLON=23, DOT=24, ACC_MOD_PUBLIC=25, 
		ACC_MOD_PRIVATE=26, ACC_MOD_PROTECTED=27, MOD_STATIC=28, ID=29, OPEN_BRA=30, 
		CLOSE_BRA=31, INTEGER=32, STRING=33, WS=34, SINGLELINE_COMMENT=35, MULTI_LINE_COMMENT=36;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'...'", "','", "'('", "')'", "'@'", "'+'", "'-'", "'='", "'=>'", "'thisResult'", 
		"'try'", "'catch'", "'finally'", "'if'", "'else'", "'return'", "'throw'", 
		"'class'", "'true'", "'false'", "'*'", "';'", "':'", "'.'", "'public'", 
		"'private'", "'protected'", "'static'", "ID", "'{'", "'}'", "INTEGER", 
		"STRING", "WS", "SINGLELINE_COMMENT", "MULTI_LINE_COMMENT"
	};
	public static final String[] ruleNames = {
		"ELLIPSES", "COMMA", "OPEN_PAR", "CLOSE_PAR", "AT", "PLUS", "MINUS", "ASSIGN_OP", 
		"REPLACE_OP", "KW_THIS_RESULT", "KW_TRY", "KW_CATCH", "KW_FINALLY", "KW_IF", 
		"KW_ELSE", "KW_RETURN", "KW_THROW", "KW_CLASS", "KW_TRUE", "KW_FALSE", 
		"WILD_CARD", "SEMI_COLON", "COLON", "DOT", "ACC_MOD_PUBLIC", "ACC_MOD_PRIVATE", 
		"ACC_MOD_PROTECTED", "MOD_STATIC", "DIGIT", "LETTER", "ID", "OPEN_BRA", 
		"CLOSE_BRA", "INTEGER", "STRING", "HexDigit", "EscapeSequence", "OctalEscape", 
		"UnicodeEscape", "WS", "SINGLELINE_COMMENT", "MULTI_LINE_COMMENT"
	};


	public DejainLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Dejain.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 39: WS_action((RuleContext)_localctx, actionIndex); break;

		case 40: SINGLELINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 41: MULTI_LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void MULTI_LINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: skip();  break;
		}
	}
	private void SINGLELINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2&\u0135\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3"+
		"\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\37\5\37\u00db"+
		"\n\37\3 \3 \5 \u00df\n \3 \3 \3 \7 \u00e4\n \f \16 \u00e7\13 \3!\3!\3"+
		"\"\3\"\3#\6#\u00ee\n#\r#\16#\u00ef\3$\3$\3$\7$\u00f5\n$\f$\16$\u00f8\13"+
		"$\3$\3$\3%\3%\3&\3&\3&\3&\5&\u0102\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\5\'\u010d\n\'\3(\3(\3(\3(\3(\3(\3(\3)\6)\u0117\n)\r)\16)\u0118\3"+
		")\3)\3*\3*\3*\3*\7*\u0121\n*\f*\16*\u0124\13*\3*\3*\3+\3+\3+\3+\7+\u012c"+
		"\n+\f+\16+\u012f\13+\3+\3+\3+\3+\3+\3\u012d,\3\3\1\5\4\1\7\5\1\t\6\1\13"+
		"\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1"+
		"\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33"+
		"\1\65\34\1\67\35\19\36\1;\2\1=\2\1?\37\1A \1C!\1E\"\1G#\1I\2\1K\2\1M\2"+
		"\1O\2\1Q$\2S%\3U&\4\3\2\13\3\2\62;\4\2C\\c|\4\2$$^^\5\2\62;CHch\n\2$$"+
		"))^^ddhhppttvv\3\2\62\65\3\2\629\5\2\13\f\17\17\"\"\4\2\f\f\17\17\u013c"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2Q\3\2\2\2\2S\3\2\2"+
		"\2\2U\3\2\2\2\3W\3\2\2\2\5[\3\2\2\2\7]\3\2\2\2\t_\3\2\2\2\13a\3\2\2\2"+
		"\rc\3\2\2\2\17e\3\2\2\2\21g\3\2\2\2\23i\3\2\2\2\25l\3\2\2\2\27w\3\2\2"+
		"\2\31{\3\2\2\2\33\u0081\3\2\2\2\35\u0089\3\2\2\2\37\u008c\3\2\2\2!\u0091"+
		"\3\2\2\2#\u0098\3\2\2\2%\u009e\3\2\2\2\'\u00a4\3\2\2\2)\u00a9\3\2\2\2"+
		"+\u00af\3\2\2\2-\u00b1\3\2\2\2/\u00b3\3\2\2\2\61\u00b5\3\2\2\2\63\u00b7"+
		"\3\2\2\2\65\u00be\3\2\2\2\67\u00c6\3\2\2\29\u00d0\3\2\2\2;\u00d7\3\2\2"+
		"\2=\u00da\3\2\2\2?\u00de\3\2\2\2A\u00e8\3\2\2\2C\u00ea\3\2\2\2E\u00ed"+
		"\3\2\2\2G\u00f1\3\2\2\2I\u00fb\3\2\2\2K\u0101\3\2\2\2M\u010c\3\2\2\2O"+
		"\u010e\3\2\2\2Q\u0116\3\2\2\2S\u011c\3\2\2\2U\u0127\3\2\2\2WX\7\60\2\2"+
		"XY\7\60\2\2YZ\7\60\2\2Z\4\3\2\2\2[\\\7.\2\2\\\6\3\2\2\2]^\7*\2\2^\b\3"+
		"\2\2\2_`\7+\2\2`\n\3\2\2\2ab\7B\2\2b\f\3\2\2\2cd\7-\2\2d\16\3\2\2\2ef"+
		"\7/\2\2f\20\3\2\2\2gh\7?\2\2h\22\3\2\2\2ij\7?\2\2jk\7@\2\2k\24\3\2\2\2"+
		"lm\7v\2\2mn\7j\2\2no\7k\2\2op\7u\2\2pq\7T\2\2qr\7g\2\2rs\7u\2\2st\7w\2"+
		"\2tu\7n\2\2uv\7v\2\2v\26\3\2\2\2wx\7v\2\2xy\7t\2\2yz\7{\2\2z\30\3\2\2"+
		"\2{|\7e\2\2|}\7c\2\2}~\7v\2\2~\177\7e\2\2\177\u0080\7j\2\2\u0080\32\3"+
		"\2\2\2\u0081\u0082\7h\2\2\u0082\u0083\7k\2\2\u0083\u0084\7p\2\2\u0084"+
		"\u0085\7c\2\2\u0085\u0086\7n\2\2\u0086\u0087\7n\2\2\u0087\u0088\7{\2\2"+
		"\u0088\34\3\2\2\2\u0089\u008a\7k\2\2\u008a\u008b\7h\2\2\u008b\36\3\2\2"+
		"\2\u008c\u008d\7g\2\2\u008d\u008e\7n\2\2\u008e\u008f\7u\2\2\u008f\u0090"+
		"\7g\2\2\u0090 \3\2\2\2\u0091\u0092\7t\2\2\u0092\u0093\7g\2\2\u0093\u0094"+
		"\7v\2\2\u0094\u0095\7w\2\2\u0095\u0096\7t\2\2\u0096\u0097\7p\2\2\u0097"+
		"\"\3\2\2\2\u0098\u0099\7v\2\2\u0099\u009a\7j\2\2\u009a\u009b\7t\2\2\u009b"+
		"\u009c\7q\2\2\u009c\u009d\7y\2\2\u009d$\3\2\2\2\u009e\u009f\7e\2\2\u009f"+
		"\u00a0\7n\2\2\u00a0\u00a1\7c\2\2\u00a1\u00a2\7u\2\2\u00a2\u00a3\7u\2\2"+
		"\u00a3&\3\2\2\2\u00a4\u00a5\7v\2\2\u00a5\u00a6\7t\2\2\u00a6\u00a7\7w\2"+
		"\2\u00a7\u00a8\7g\2\2\u00a8(\3\2\2\2\u00a9\u00aa\7h\2\2\u00aa\u00ab\7"+
		"c\2\2\u00ab\u00ac\7n\2\2\u00ac\u00ad\7u\2\2\u00ad\u00ae\7g\2\2\u00ae*"+
		"\3\2\2\2\u00af\u00b0\7,\2\2\u00b0,\3\2\2\2\u00b1\u00b2\7=\2\2\u00b2.\3"+
		"\2\2\2\u00b3\u00b4\7<\2\2\u00b4\60\3\2\2\2\u00b5\u00b6\7\60\2\2\u00b6"+
		"\62\3\2\2\2\u00b7\u00b8\7r\2\2\u00b8\u00b9\7w\2\2\u00b9\u00ba\7d\2\2\u00ba"+
		"\u00bb\7n\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd\7e\2\2\u00bd\64\3\2\2\2\u00be"+
		"\u00bf\7r\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1\7k\2\2\u00c1\u00c2\7x\2\2"+
		"\u00c2\u00c3\7c\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5\7g\2\2\u00c5\66\3\2"+
		"\2\2\u00c6\u00c7\7r\2\2\u00c7\u00c8\7t\2\2\u00c8\u00c9\7q\2\2\u00c9\u00ca"+
		"\7v\2\2\u00ca\u00cb\7g\2\2\u00cb\u00cc\7e\2\2\u00cc\u00cd\7v\2\2\u00cd"+
		"\u00ce\7g\2\2\u00ce\u00cf\7f\2\2\u00cf8\3\2\2\2\u00d0\u00d1\7u\2\2\u00d1"+
		"\u00d2\7v\2\2\u00d2\u00d3\7c\2\2\u00d3\u00d4\7v\2\2\u00d4\u00d5\7k\2\2"+
		"\u00d5\u00d6\7e\2\2\u00d6:\3\2\2\2\u00d7\u00d8\t\2\2\2\u00d8<\3\2\2\2"+
		"\u00d9\u00db\t\3\2\2\u00da\u00d9\3\2\2\2\u00db>\3\2\2\2\u00dc\u00df\5"+
		"=\37\2\u00dd\u00df\7a\2\2\u00de\u00dc\3\2\2\2\u00de\u00dd\3\2\2\2\u00df"+
		"\u00e5\3\2\2\2\u00e0\u00e4\5=\37\2\u00e1\u00e4\7a\2\2\u00e2\u00e4\5;\36"+
		"\2\u00e3\u00e0\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e7"+
		"\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6@\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e8\u00e9\7}\2\2\u00e9B\3\2\2\2\u00ea\u00eb\7\177\2\2"+
		"\u00ebD\3\2\2\2\u00ec\u00ee\5;\36\2\u00ed\u00ec\3\2\2\2\u00ee\u00ef\3"+
		"\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0F\3\2\2\2\u00f1\u00f6"+
		"\7$\2\2\u00f2\u00f5\5K&\2\u00f3\u00f5\n\4\2\2\u00f4\u00f2\3\2\2\2\u00f4"+
		"\u00f3\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2"+
		"\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fa\7$\2\2\u00fa"+
		"H\3\2\2\2\u00fb\u00fc\t\5\2\2\u00fcJ\3\2\2\2\u00fd\u00fe\7^\2\2\u00fe"+
		"\u0102\t\6\2\2\u00ff\u0102\5O(\2\u0100\u0102\5M\'\2\u0101\u00fd\3\2\2"+
		"\2\u0101\u00ff\3\2\2\2\u0101\u0100\3\2\2\2\u0102L\3\2\2\2\u0103\u0104"+
		"\7^\2\2\u0104\u0105\t\7\2\2\u0105\u0106\t\b\2\2\u0106\u010d\t\b\2\2\u0107"+
		"\u0108\7^\2\2\u0108\u0109\t\b\2\2\u0109\u010d\t\b\2\2\u010a\u010b\7^\2"+
		"\2\u010b\u010d\t\b\2\2\u010c\u0103\3\2\2\2\u010c\u0107\3\2\2\2\u010c\u010a"+
		"\3\2\2\2\u010dN\3\2\2\2\u010e\u010f\7^\2\2\u010f\u0110\7w\2\2\u0110\u0111"+
		"\5I%\2\u0111\u0112\5I%\2\u0112\u0113\5I%\2\u0113\u0114\5I%\2\u0114P\3"+
		"\2\2\2\u0115\u0117\t\t\2\2\u0116\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118"+
		"\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\b)"+
		"\2\2\u011bR\3\2\2\2\u011c\u011d\7\61\2\2\u011d\u011e\7\61\2\2\u011e\u0122"+
		"\3\2\2\2\u011f\u0121\n\n\2\2\u0120\u011f\3\2\2\2\u0121\u0124\3\2\2\2\u0122"+
		"\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0125\3\2\2\2\u0124\u0122\3\2"+
		"\2\2\u0125\u0126\b*\3\2\u0126T\3\2\2\2\u0127\u0128\7\61\2\2\u0128\u0129"+
		"\7,\2\2\u0129\u012d\3\2\2\2\u012a\u012c\13\2\2\2\u012b\u012a\3\2\2\2\u012c"+
		"\u012f\3\2\2\2\u012d\u012e\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u0130\3\2"+
		"\2\2\u012f\u012d\3\2\2\2\u0130\u0131\7,\2\2\u0131\u0132\7\61\2\2\u0132"+
		"\u0133\3\2\2\2\u0133\u0134\b+\4\2\u0134V\3\2\2\2\17\2\u00da\u00de\u00e3"+
		"\u00e5\u00ef\u00f4\u00f6\u0101\u010c\u0118\u0122\u012d";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
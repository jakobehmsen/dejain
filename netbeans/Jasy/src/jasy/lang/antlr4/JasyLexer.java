// Generated from /home/jakob/github/jasy/netbeans/Jasy/src/jasy/lang/antlr4/Jasy.g4 by ANTLR 4.1
package jasy.lang.antlr4;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JasyLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ELLIPSES=1, COMMA=2, OPEN_PAR=3, CLOSE_PAR=4, HAT=5, AT=6, DOLLAR=7, HASH=8, 
		PLUS=9, MINUS=10, ASSIGN_OP=11, REPLACE_OP=12, KW_THIS_RESULT=13, KW_TRY=14, 
		KW_CATCH=15, KW_FINALLY=16, KW_IF=17, KW_ELSE=18, KW_RETURN=19, KW_THROW=20, 
		KW_CLASS=21, KW_TRUE=22, KW_FALSE=23, KW_WHILE=24, WILD_CARD=25, SEMI_COLON=26, 
		COLON=27, DOT=28, ACC_MOD_PUBLIC=29, ACC_MOD_PRIVATE=30, ACC_MOD_PROTECTED=31, 
		MOD_STATIC=32, ID=33, OPEN_BRA=34, CLOSE_BRA=35, INTEGER=36, LONG=37, 
		STRING=38, WS=39, SINGLELINE_COMMENT=40, MULTI_LINE_COMMENT=41;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'...'", "','", "'('", "')'", "'^'", "'@'", "'$'", "'#'", "'+'", "'-'", 
		"'='", "'=>'", "'thisResult'", "'try'", "'catch'", "'finally'", "'if'", 
		"'else'", "'return'", "'throw'", "'class'", "'true'", "'false'", "'while'", 
		"'*'", "';'", "':'", "'.'", "'public'", "'private'", "'protected'", "'static'", 
		"ID", "'{'", "'}'", "INTEGER", "LONG", "STRING", "WS", "SINGLELINE_COMMENT", 
		"MULTI_LINE_COMMENT"
	};
	public static final String[] ruleNames = {
		"ELLIPSES", "COMMA", "OPEN_PAR", "CLOSE_PAR", "HAT", "AT", "DOLLAR", "HASH", 
		"PLUS", "MINUS", "ASSIGN_OP", "REPLACE_OP", "KW_THIS_RESULT", "KW_TRY", 
		"KW_CATCH", "KW_FINALLY", "KW_IF", "KW_ELSE", "KW_RETURN", "KW_THROW", 
		"KW_CLASS", "KW_TRUE", "KW_FALSE", "KW_WHILE", "WILD_CARD", "SEMI_COLON", 
		"COLON", "DOT", "ACC_MOD_PUBLIC", "ACC_MOD_PRIVATE", "ACC_MOD_PROTECTED", 
		"MOD_STATIC", "DIGIT", "LETTER", "ID", "OPEN_BRA", "CLOSE_BRA", "INTEGER", 
		"LONG", "STRING", "HexDigit", "EscapeSequence", "OctalEscape", "UnicodeEscape", 
		"WS", "SINGLELINE_COMMENT", "MULTI_LINE_COMMENT"
	};


	public JasyLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Jasy.g4"; }

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
		case 44: WS_action((RuleContext)_localctx, actionIndex); break;

		case 45: SINGLELINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 46: MULTI_LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2+\u0152\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3#\5#\u00f1\n#\3"+
		"$\3$\5$\u00f5\n$\3$\3$\3$\7$\u00fa\n$\f$\16$\u00fd\13$\3%\3%\3&\3&\3\'"+
		"\6\'\u0104\n\'\r\'\16\'\u0105\3(\6(\u0109\n(\r(\16(\u010a\3(\3(\3)\3)"+
		"\3)\7)\u0112\n)\f)\16)\u0115\13)\3)\3)\3*\3*\3+\3+\3+\3+\5+\u011f\n+\3"+
		",\3,\3,\3,\3,\3,\3,\3,\3,\5,\u012a\n,\3-\3-\3-\3-\3-\3-\3-\3.\6.\u0134"+
		"\n.\r.\16.\u0135\3.\3.\3/\3/\3/\3/\7/\u013e\n/\f/\16/\u0141\13/\3/\3/"+
		"\3\60\3\60\3\60\3\60\7\60\u0149\n\60\f\60\16\60\u014c\13\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\u014a\61\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1"+
		"\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23"+
		"\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35"+
		"\19\36\1;\37\1= \1?!\1A\"\1C\2\1E\2\1G#\1I$\1K%\1M&\1O\'\1Q(\1S\2\1U\2"+
		"\1W\2\1Y\2\1[)\2]*\3_+\4\3\2\13\3\2\62;\4\2C\\c|\4\2$$^^\5\2\62;CHch\n"+
		"\2$$))^^ddhhppttvv\3\2\62\65\3\2\629\5\2\13\f\17\17\"\"\4\2\f\f\17\17"+
		"\u015a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3"+
		"\2\2\2\3a\3\2\2\2\5e\3\2\2\2\7g\3\2\2\2\ti\3\2\2\2\13k\3\2\2\2\rm\3\2"+
		"\2\2\17o\3\2\2\2\21q\3\2\2\2\23s\3\2\2\2\25u\3\2\2\2\27w\3\2\2\2\31y\3"+
		"\2\2\2\33|\3\2\2\2\35\u0087\3\2\2\2\37\u008b\3\2\2\2!\u0091\3\2\2\2#\u0099"+
		"\3\2\2\2%\u009c\3\2\2\2\'\u00a1\3\2\2\2)\u00a8\3\2\2\2+\u00ae\3\2\2\2"+
		"-\u00b4\3\2\2\2/\u00b9\3\2\2\2\61\u00bf\3\2\2\2\63\u00c5\3\2\2\2\65\u00c7"+
		"\3\2\2\2\67\u00c9\3\2\2\29\u00cb\3\2\2\2;\u00cd\3\2\2\2=\u00d4\3\2\2\2"+
		"?\u00dc\3\2\2\2A\u00e6\3\2\2\2C\u00ed\3\2\2\2E\u00f0\3\2\2\2G\u00f4\3"+
		"\2\2\2I\u00fe\3\2\2\2K\u0100\3\2\2\2M\u0103\3\2\2\2O\u0108\3\2\2\2Q\u010e"+
		"\3\2\2\2S\u0118\3\2\2\2U\u011e\3\2\2\2W\u0129\3\2\2\2Y\u012b\3\2\2\2["+
		"\u0133\3\2\2\2]\u0139\3\2\2\2_\u0144\3\2\2\2ab\7\60\2\2bc\7\60\2\2cd\7"+
		"\60\2\2d\4\3\2\2\2ef\7.\2\2f\6\3\2\2\2gh\7*\2\2h\b\3\2\2\2ij\7+\2\2j\n"+
		"\3\2\2\2kl\7`\2\2l\f\3\2\2\2mn\7B\2\2n\16\3\2\2\2op\7&\2\2p\20\3\2\2\2"+
		"qr\7%\2\2r\22\3\2\2\2st\7-\2\2t\24\3\2\2\2uv\7/\2\2v\26\3\2\2\2wx\7?\2"+
		"\2x\30\3\2\2\2yz\7?\2\2z{\7@\2\2{\32\3\2\2\2|}\7v\2\2}~\7j\2\2~\177\7"+
		"k\2\2\177\u0080\7u\2\2\u0080\u0081\7T\2\2\u0081\u0082\7g\2\2\u0082\u0083"+
		"\7u\2\2\u0083\u0084\7w\2\2\u0084\u0085\7n\2\2\u0085\u0086\7v\2\2\u0086"+
		"\34\3\2\2\2\u0087\u0088\7v\2\2\u0088\u0089\7t\2\2\u0089\u008a\7{\2\2\u008a"+
		"\36\3\2\2\2\u008b\u008c\7e\2\2\u008c\u008d\7c\2\2\u008d\u008e\7v\2\2\u008e"+
		"\u008f\7e\2\2\u008f\u0090\7j\2\2\u0090 \3\2\2\2\u0091\u0092\7h\2\2\u0092"+
		"\u0093\7k\2\2\u0093\u0094\7p\2\2\u0094\u0095\7c\2\2\u0095\u0096\7n\2\2"+
		"\u0096\u0097\7n\2\2\u0097\u0098\7{\2\2\u0098\"\3\2\2\2\u0099\u009a\7k"+
		"\2\2\u009a\u009b\7h\2\2\u009b$\3\2\2\2\u009c\u009d\7g\2\2\u009d\u009e"+
		"\7n\2\2\u009e\u009f\7u\2\2\u009f\u00a0\7g\2\2\u00a0&\3\2\2\2\u00a1\u00a2"+
		"\7t\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4\7v\2\2\u00a4\u00a5\7w\2\2\u00a5"+
		"\u00a6\7t\2\2\u00a6\u00a7\7p\2\2\u00a7(\3\2\2\2\u00a8\u00a9\7v\2\2\u00a9"+
		"\u00aa\7j\2\2\u00aa\u00ab\7t\2\2\u00ab\u00ac\7q\2\2\u00ac\u00ad\7y\2\2"+
		"\u00ad*\3\2\2\2\u00ae\u00af\7e\2\2\u00af\u00b0\7n\2\2\u00b0\u00b1\7c\2"+
		"\2\u00b1\u00b2\7u\2\2\u00b2\u00b3\7u\2\2\u00b3,\3\2\2\2\u00b4\u00b5\7"+
		"v\2\2\u00b5\u00b6\7t\2\2\u00b6\u00b7\7w\2\2\u00b7\u00b8\7g\2\2\u00b8."+
		"\3\2\2\2\u00b9\u00ba\7h\2\2\u00ba\u00bb\7c\2\2\u00bb\u00bc\7n\2\2\u00bc"+
		"\u00bd\7u\2\2\u00bd\u00be\7g\2\2\u00be\60\3\2\2\2\u00bf\u00c0\7y\2\2\u00c0"+
		"\u00c1\7j\2\2\u00c1\u00c2\7k\2\2\u00c2\u00c3\7n\2\2\u00c3\u00c4\7g\2\2"+
		"\u00c4\62\3\2\2\2\u00c5\u00c6\7,\2\2\u00c6\64\3\2\2\2\u00c7\u00c8\7=\2"+
		"\2\u00c8\66\3\2\2\2\u00c9\u00ca\7<\2\2\u00ca8\3\2\2\2\u00cb\u00cc\7\60"+
		"\2\2\u00cc:\3\2\2\2\u00cd\u00ce\7r\2\2\u00ce\u00cf\7w\2\2\u00cf\u00d0"+
		"\7d\2\2\u00d0\u00d1\7n\2\2\u00d1\u00d2\7k\2\2\u00d2\u00d3\7e\2\2\u00d3"+
		"<\3\2\2\2\u00d4\u00d5\7r\2\2\u00d5\u00d6\7t\2\2\u00d6\u00d7\7k\2\2\u00d7"+
		"\u00d8\7x\2\2\u00d8\u00d9\7c\2\2\u00d9\u00da\7v\2\2\u00da\u00db\7g\2\2"+
		"\u00db>\3\2\2\2\u00dc\u00dd\7r\2\2\u00dd\u00de\7t\2\2\u00de\u00df\7q\2"+
		"\2\u00df\u00e0\7v\2\2\u00e0\u00e1\7g\2\2\u00e1\u00e2\7e\2\2\u00e2\u00e3"+
		"\7v\2\2\u00e3\u00e4\7g\2\2\u00e4\u00e5\7f\2\2\u00e5@\3\2\2\2\u00e6\u00e7"+
		"\7u\2\2\u00e7\u00e8\7v\2\2\u00e8\u00e9\7c\2\2\u00e9\u00ea\7v\2\2\u00ea"+
		"\u00eb\7k\2\2\u00eb\u00ec\7e\2\2\u00ecB\3\2\2\2\u00ed\u00ee\t\2\2\2\u00ee"+
		"D\3\2\2\2\u00ef\u00f1\t\3\2\2\u00f0\u00ef\3\2\2\2\u00f1F\3\2\2\2\u00f2"+
		"\u00f5\5E#\2\u00f3\u00f5\7a\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f3\3\2\2"+
		"\2\u00f5\u00fb\3\2\2\2\u00f6\u00fa\5E#\2\u00f7\u00fa\7a\2\2\u00f8\u00fa"+
		"\5C\"\2\u00f9\u00f6\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa"+
		"\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fcH\3\2\2\2"+
		"\u00fd\u00fb\3\2\2\2\u00fe\u00ff\7}\2\2\u00ffJ\3\2\2\2\u0100\u0101\7\177"+
		"\2\2\u0101L\3\2\2\2\u0102\u0104\5C\"\2\u0103\u0102\3\2\2\2\u0104\u0105"+
		"\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106N\3\2\2\2\u0107"+
		"\u0109\5C\"\2\u0108\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u0108\3\2"+
		"\2\2\u010a\u010b\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\7N\2\2\u010d"+
		"P\3\2\2\2\u010e\u0113\7$\2\2\u010f\u0112\5U+\2\u0110\u0112\n\4\2\2\u0111"+
		"\u010f\3\2\2\2\u0111\u0110\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2"+
		"\2\2\u0113\u0114\3\2\2\2\u0114\u0116\3\2\2\2\u0115\u0113\3\2\2\2\u0116"+
		"\u0117\7$\2\2\u0117R\3\2\2\2\u0118\u0119\t\5\2\2\u0119T\3\2\2\2\u011a"+
		"\u011b\7^\2\2\u011b\u011f\t\6\2\2\u011c\u011f\5Y-\2\u011d\u011f\5W,\2"+
		"\u011e\u011a\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011d\3\2\2\2\u011fV\3"+
		"\2\2\2\u0120\u0121\7^\2\2\u0121\u0122\t\7\2\2\u0122\u0123\t\b\2\2\u0123"+
		"\u012a\t\b\2\2\u0124\u0125\7^\2\2\u0125\u0126\t\b\2\2\u0126\u012a\t\b"+
		"\2\2\u0127\u0128\7^\2\2\u0128\u012a\t\b\2\2\u0129\u0120\3\2\2\2\u0129"+
		"\u0124\3\2\2\2\u0129\u0127\3\2\2\2\u012aX\3\2\2\2\u012b\u012c\7^\2\2\u012c"+
		"\u012d\7w\2\2\u012d\u012e\5S*\2\u012e\u012f\5S*\2\u012f\u0130\5S*\2\u0130"+
		"\u0131\5S*\2\u0131Z\3\2\2\2\u0132\u0134\t\t\2\2\u0133\u0132\3\2\2\2\u0134"+
		"\u0135\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137\3\2"+
		"\2\2\u0137\u0138\b.\2\2\u0138\\\3\2\2\2\u0139\u013a\7\61\2\2\u013a\u013b"+
		"\7\61\2\2\u013b\u013f\3\2\2\2\u013c\u013e\n\n\2\2\u013d\u013c\3\2\2\2"+
		"\u013e\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0142"+
		"\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u0143\b/\3\2\u0143^\3\2\2\2\u0144\u0145"+
		"\7\61\2\2\u0145\u0146\7,\2\2\u0146\u014a\3\2\2\2\u0147\u0149\13\2\2\2"+
		"\u0148\u0147\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u014b\3\2\2\2\u014a\u0148"+
		"\3\2\2\2\u014b\u014d\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u014e\7,\2\2\u014e"+
		"\u014f\7\61\2\2\u014f\u0150\3\2\2\2\u0150\u0151\b\60\4\2\u0151`\3\2\2"+
		"\2\20\2\u00f0\u00f4\u00f9\u00fb\u0105\u010a\u0111\u0113\u011e\u0129\u0135"+
		"\u013f\u014a";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
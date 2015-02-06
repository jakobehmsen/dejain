// Generated from C:\github\dejain\netbeans\Dejain\src\dejain\lang\antlr4\Dejain.g4 by ANTLR 4.1
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
public class DejainLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ELLIPSES=1, COMMA=2, OPEN_PAR=3, CLOSE_PAR=4, AT=5, DOLLAR=6, HASH=7, 
		PLUS=8, MINUS=9, ASSIGN_OP=10, REPLACE_OP=11, KW_THIS_RESULT=12, KW_TRY=13, 
		KW_CATCH=14, KW_FINALLY=15, KW_IF=16, KW_ELSE=17, KW_RETURN=18, KW_THROW=19, 
		KW_CLASS=20, KW_TRUE=21, KW_FALSE=22, WILD_CARD=23, SEMI_COLON=24, COLON=25, 
		DOT=26, ACC_MOD_PUBLIC=27, ACC_MOD_PRIVATE=28, ACC_MOD_PROTECTED=29, MOD_STATIC=30, 
		ID=31, OPEN_BRA=32, CLOSE_BRA=33, INTEGER=34, LONG=35, STRING=36, WS=37, 
		SINGLELINE_COMMENT=38, MULTI_LINE_COMMENT=39;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'...'", "','", "'('", "')'", "'@'", "'$'", "'#'", "'+'", "'-'", "'='", 
		"'=>'", "'thisResult'", "'try'", "'catch'", "'finally'", "'if'", "'else'", 
		"'return'", "'throw'", "'class'", "'true'", "'false'", "'*'", "';'", "':'", 
		"'.'", "'public'", "'private'", "'protected'", "'static'", "ID", "'{'", 
		"'}'", "INTEGER", "LONG", "STRING", "WS", "SINGLELINE_COMMENT", "MULTI_LINE_COMMENT"
	};
	public static final String[] ruleNames = {
		"ELLIPSES", "COMMA", "OPEN_PAR", "CLOSE_PAR", "AT", "DOLLAR", "HASH", 
		"PLUS", "MINUS", "ASSIGN_OP", "REPLACE_OP", "KW_THIS_RESULT", "KW_TRY", 
		"KW_CATCH", "KW_FINALLY", "KW_IF", "KW_ELSE", "KW_RETURN", "KW_THROW", 
		"KW_CLASS", "KW_TRUE", "KW_FALSE", "WILD_CARD", "SEMI_COLON", "COLON", 
		"DOT", "ACC_MOD_PUBLIC", "ACC_MOD_PRIVATE", "ACC_MOD_PROTECTED", "MOD_STATIC", 
		"DIGIT", "LETTER", "ID", "OPEN_BRA", "CLOSE_BRA", "INTEGER", "LONG", "STRING", 
		"HexDigit", "EscapeSequence", "OctalEscape", "UnicodeEscape", "WS", "SINGLELINE_COMMENT", 
		"MULTI_LINE_COMMENT"
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
		case 42: WS_action((RuleContext)_localctx, actionIndex); break;

		case 43: SINGLELINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 44: MULTI_LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2)\u0146\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3 \3 \3!\5!\u00e5\n!\3\"\3\"\5\"\u00e9\n\"\3\"\3\"\3\"\7"+
		"\"\u00ee\n\"\f\"\16\"\u00f1\13\"\3#\3#\3$\3$\3%\6%\u00f8\n%\r%\16%\u00f9"+
		"\3&\6&\u00fd\n&\r&\16&\u00fe\3&\3&\3\'\3\'\3\'\7\'\u0106\n\'\f\'\16\'"+
		"\u0109\13\'\3\'\3\'\3(\3(\3)\3)\3)\3)\5)\u0113\n)\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\5*\u011e\n*\3+\3+\3+\3+\3+\3+\3+\3,\6,\u0128\n,\r,\16,\u0129\3"+
		",\3,\3-\3-\3-\3-\7-\u0132\n-\f-\16-\u0135\13-\3-\3-\3.\3.\3.\3.\7.\u013d"+
		"\n.\f.\16.\u0140\13.\3.\3.\3.\3.\3.\3\u013e/\3\3\1\5\4\1\7\5\1\t\6\1\13"+
		"\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1"+
		"\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33"+
		"\1\65\34\1\67\35\19\36\1;\37\1= \1?\2\1A\2\1C!\1E\"\1G#\1I$\1K%\1M&\1"+
		"O\2\1Q\2\1S\2\1U\2\1W\'\2Y(\3[)\4\3\2\13\3\2\62;\4\2C\\c|\4\2$$^^\5\2"+
		"\62;CHch\n\2$$))^^ddhhppttvv\3\2\62\65\3\2\629\5\2\13\f\17\17\"\"\4\2"+
		"\f\f\17\17\u014e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\3]\3\2"+
		"\2\2\5a\3\2\2\2\7c\3\2\2\2\te\3\2\2\2\13g\3\2\2\2\ri\3\2\2\2\17k\3\2\2"+
		"\2\21m\3\2\2\2\23o\3\2\2\2\25q\3\2\2\2\27s\3\2\2\2\31v\3\2\2\2\33\u0081"+
		"\3\2\2\2\35\u0085\3\2\2\2\37\u008b\3\2\2\2!\u0093\3\2\2\2#\u0096\3\2\2"+
		"\2%\u009b\3\2\2\2\'\u00a2\3\2\2\2)\u00a8\3\2\2\2+\u00ae\3\2\2\2-\u00b3"+
		"\3\2\2\2/\u00b9\3\2\2\2\61\u00bb\3\2\2\2\63\u00bd\3\2\2\2\65\u00bf\3\2"+
		"\2\2\67\u00c1\3\2\2\29\u00c8\3\2\2\2;\u00d0\3\2\2\2=\u00da\3\2\2\2?\u00e1"+
		"\3\2\2\2A\u00e4\3\2\2\2C\u00e8\3\2\2\2E\u00f2\3\2\2\2G\u00f4\3\2\2\2I"+
		"\u00f7\3\2\2\2K\u00fc\3\2\2\2M\u0102\3\2\2\2O\u010c\3\2\2\2Q\u0112\3\2"+
		"\2\2S\u011d\3\2\2\2U\u011f\3\2\2\2W\u0127\3\2\2\2Y\u012d\3\2\2\2[\u0138"+
		"\3\2\2\2]^\7\60\2\2^_\7\60\2\2_`\7\60\2\2`\4\3\2\2\2ab\7.\2\2b\6\3\2\2"+
		"\2cd\7*\2\2d\b\3\2\2\2ef\7+\2\2f\n\3\2\2\2gh\7B\2\2h\f\3\2\2\2ij\7&\2"+
		"\2j\16\3\2\2\2kl\7%\2\2l\20\3\2\2\2mn\7-\2\2n\22\3\2\2\2op\7/\2\2p\24"+
		"\3\2\2\2qr\7?\2\2r\26\3\2\2\2st\7?\2\2tu\7@\2\2u\30\3\2\2\2vw\7v\2\2w"+
		"x\7j\2\2xy\7k\2\2yz\7u\2\2z{\7T\2\2{|\7g\2\2|}\7u\2\2}~\7w\2\2~\177\7"+
		"n\2\2\177\u0080\7v\2\2\u0080\32\3\2\2\2\u0081\u0082\7v\2\2\u0082\u0083"+
		"\7t\2\2\u0083\u0084\7{\2\2\u0084\34\3\2\2\2\u0085\u0086\7e\2\2\u0086\u0087"+
		"\7c\2\2\u0087\u0088\7v\2\2\u0088\u0089\7e\2\2\u0089\u008a\7j\2\2\u008a"+
		"\36\3\2\2\2\u008b\u008c\7h\2\2\u008c\u008d\7k\2\2\u008d\u008e\7p\2\2\u008e"+
		"\u008f\7c\2\2\u008f\u0090\7n\2\2\u0090\u0091\7n\2\2\u0091\u0092\7{\2\2"+
		"\u0092 \3\2\2\2\u0093\u0094\7k\2\2\u0094\u0095\7h\2\2\u0095\"\3\2\2\2"+
		"\u0096\u0097\7g\2\2\u0097\u0098\7n\2\2\u0098\u0099\7u\2\2\u0099\u009a"+
		"\7g\2\2\u009a$\3\2\2\2\u009b\u009c\7t\2\2\u009c\u009d\7g\2\2\u009d\u009e"+
		"\7v\2\2\u009e\u009f\7w\2\2\u009f\u00a0\7t\2\2\u00a0\u00a1\7p\2\2\u00a1"+
		"&\3\2\2\2\u00a2\u00a3\7v\2\2\u00a3\u00a4\7j\2\2\u00a4\u00a5\7t\2\2\u00a5"+
		"\u00a6\7q\2\2\u00a6\u00a7\7y\2\2\u00a7(\3\2\2\2\u00a8\u00a9\7e\2\2\u00a9"+
		"\u00aa\7n\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ac\7u\2\2\u00ac\u00ad\7u\2\2"+
		"\u00ad*\3\2\2\2\u00ae\u00af\7v\2\2\u00af\u00b0\7t\2\2\u00b0\u00b1\7w\2"+
		"\2\u00b1\u00b2\7g\2\2\u00b2,\3\2\2\2\u00b3\u00b4\7h\2\2\u00b4\u00b5\7"+
		"c\2\2\u00b5\u00b6\7n\2\2\u00b6\u00b7\7u\2\2\u00b7\u00b8\7g\2\2\u00b8."+
		"\3\2\2\2\u00b9\u00ba\7,\2\2\u00ba\60\3\2\2\2\u00bb\u00bc\7=\2\2\u00bc"+
		"\62\3\2\2\2\u00bd\u00be\7<\2\2\u00be\64\3\2\2\2\u00bf\u00c0\7\60\2\2\u00c0"+
		"\66\3\2\2\2\u00c1\u00c2\7r\2\2\u00c2\u00c3\7w\2\2\u00c3\u00c4\7d\2\2\u00c4"+
		"\u00c5\7n\2\2\u00c5\u00c6\7k\2\2\u00c6\u00c7\7e\2\2\u00c78\3\2\2\2\u00c8"+
		"\u00c9\7r\2\2\u00c9\u00ca\7t\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc\7x\2\2"+
		"\u00cc\u00cd\7c\2\2\u00cd\u00ce\7v\2\2\u00ce\u00cf\7g\2\2\u00cf:\3\2\2"+
		"\2\u00d0\u00d1\7r\2\2\u00d1\u00d2\7t\2\2\u00d2\u00d3\7q\2\2\u00d3\u00d4"+
		"\7v\2\2\u00d4\u00d5\7g\2\2\u00d5\u00d6\7e\2\2\u00d6\u00d7\7v\2\2\u00d7"+
		"\u00d8\7g\2\2\u00d8\u00d9\7f\2\2\u00d9<\3\2\2\2\u00da\u00db\7u\2\2\u00db"+
		"\u00dc\7v\2\2\u00dc\u00dd\7c\2\2\u00dd\u00de\7v\2\2\u00de\u00df\7k\2\2"+
		"\u00df\u00e0\7e\2\2\u00e0>\3\2\2\2\u00e1\u00e2\t\2\2\2\u00e2@\3\2\2\2"+
		"\u00e3\u00e5\t\3\2\2\u00e4\u00e3\3\2\2\2\u00e5B\3\2\2\2\u00e6\u00e9\5"+
		"A!\2\u00e7\u00e9\7a\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e7\3\2\2\2\u00e9"+
		"\u00ef\3\2\2\2\u00ea\u00ee\5A!\2\u00eb\u00ee\7a\2\2\u00ec\u00ee\5? \2"+
		"\u00ed\u00ea\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ee\u00f1"+
		"\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0D\3\2\2\2\u00f1"+
		"\u00ef\3\2\2\2\u00f2\u00f3\7}\2\2\u00f3F\3\2\2\2\u00f4\u00f5\7\177\2\2"+
		"\u00f5H\3\2\2\2\u00f6\u00f8\5? \2\u00f7\u00f6\3\2\2\2\u00f8\u00f9\3\2"+
		"\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00faJ\3\2\2\2\u00fb\u00fd"+
		"\5? \2\u00fc\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\7N\2\2\u0101L\3\2\2\2\u0102"+
		"\u0107\7$\2\2\u0103\u0106\5Q)\2\u0104\u0106\n\4\2\2\u0105\u0103\3\2\2"+
		"\2\u0105\u0104\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108"+
		"\3\2\2\2\u0108\u010a\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010b\7$\2\2\u010b"+
		"N\3\2\2\2\u010c\u010d\t\5\2\2\u010dP\3\2\2\2\u010e\u010f\7^\2\2\u010f"+
		"\u0113\t\6\2\2\u0110\u0113\5U+\2\u0111\u0113\5S*\2\u0112\u010e\3\2\2\2"+
		"\u0112\u0110\3\2\2\2\u0112\u0111\3\2\2\2\u0113R\3\2\2\2\u0114\u0115\7"+
		"^\2\2\u0115\u0116\t\7\2\2\u0116\u0117\t\b\2\2\u0117\u011e\t\b\2\2\u0118"+
		"\u0119\7^\2\2\u0119\u011a\t\b\2\2\u011a\u011e\t\b\2\2\u011b\u011c\7^\2"+
		"\2\u011c\u011e\t\b\2\2\u011d\u0114\3\2\2\2\u011d\u0118\3\2\2\2\u011d\u011b"+
		"\3\2\2\2\u011eT\3\2\2\2\u011f\u0120\7^\2\2\u0120\u0121\7w\2\2\u0121\u0122"+
		"\5O(\2\u0122\u0123\5O(\2\u0123\u0124\5O(\2\u0124\u0125\5O(\2\u0125V\3"+
		"\2\2\2\u0126\u0128\t\t\2\2\u0127\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129"+
		"\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\b,"+
		"\2\2\u012cX\3\2\2\2\u012d\u012e\7\61\2\2\u012e\u012f\7\61\2\2\u012f\u0133"+
		"\3\2\2\2\u0130\u0132\n\n\2\2\u0131\u0130\3\2\2\2\u0132\u0135\3\2\2\2\u0133"+
		"\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0136\3\2\2\2\u0135\u0133\3\2"+
		"\2\2\u0136\u0137\b-\3\2\u0137Z\3\2\2\2\u0138\u0139\7\61\2\2\u0139\u013a"+
		"\7,\2\2\u013a\u013e\3\2\2\2\u013b\u013d\13\2\2\2\u013c\u013b\3\2\2\2\u013d"+
		"\u0140\3\2\2\2\u013e\u013f\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0141\3\2"+
		"\2\2\u0140\u013e\3\2\2\2\u0141\u0142\7,\2\2\u0142\u0143\7\61\2\2\u0143"+
		"\u0144\3\2\2\2\u0144\u0145\b.\4\2\u0145\\\3\2\2\2\20\2\u00e4\u00e8\u00ed"+
		"\u00ef\u00f9\u00fe\u0105\u0107\u0112\u011d\u0129\u0133\u013e";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
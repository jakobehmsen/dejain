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
		PLUS=9, MINUS=10, MULT=11, DIV=12, LT=13, LTE=14, GT=15, GTE=16, ASSIGN_OP=17, 
		REPLACE_OP=18, KW_THIS_RESULT=19, KW_TRY=20, KW_CATCH=21, KW_FINALLY=22, 
		KW_IF=23, KW_ELSE=24, KW_RETURN=25, KW_THROW=26, KW_CLASS=27, KW_TRUE=28, 
		KW_FALSE=29, KW_WHILE=30, WILD_CARD=31, SEMI_COLON=32, COLON=33, DOT=34, 
		ACC_MOD_PUBLIC=35, ACC_MOD_PRIVATE=36, ACC_MOD_PROTECTED=37, MOD_STATIC=38, 
		ID=39, OPEN_BRA=40, CLOSE_BRA=41, INTEGER=42, LONG=43, STRING=44, WS=45, 
		SINGLELINE_COMMENT=46, MULTI_LINE_COMMENT=47;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'...'", "','", "'('", "')'", "'^'", "'@'", "'$'", "'#'", "'+'", "'-'", 
		"MULT", "'/'", "'<'", "'<='", "'>'", "'>='", "'='", "'=>'", "'thisResult'", 
		"'try'", "'catch'", "'finally'", "'if'", "'else'", "'return'", "'throw'", 
		"'class'", "'true'", "'false'", "'while'", "WILD_CARD", "';'", "':'", 
		"'.'", "'public'", "'private'", "'protected'", "'static'", "ID", "'{'", 
		"'}'", "INTEGER", "LONG", "STRING", "WS", "SINGLELINE_COMMENT", "MULTI_LINE_COMMENT"
	};
	public static final String[] ruleNames = {
		"ELLIPSES", "COMMA", "OPEN_PAR", "CLOSE_PAR", "HAT", "AT", "DOLLAR", "HASH", 
		"PLUS", "MINUS", "MULT", "DIV", "LT", "LTE", "GT", "GTE", "ASSIGN_OP", 
		"REPLACE_OP", "KW_THIS_RESULT", "KW_TRY", "KW_CATCH", "KW_FINALLY", "KW_IF", 
		"KW_ELSE", "KW_RETURN", "KW_THROW", "KW_CLASS", "KW_TRUE", "KW_FALSE", 
		"KW_WHILE", "WILD_CARD", "SEMI_COLON", "COLON", "DOT", "ACC_MOD_PUBLIC", 
		"ACC_MOD_PRIVATE", "ACC_MOD_PROTECTED", "MOD_STATIC", "DIGIT", "LETTER", 
		"ID", "OPEN_BRA", "CLOSE_BRA", "INTEGER", "LONG", "STRING", "HexDigit", 
		"EscapeSequence", "OctalEscape", "UnicodeEscape", "WS", "SINGLELINE_COMMENT", 
		"MULTI_LINE_COMMENT"
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
		case 50: WS_action((RuleContext)_localctx, actionIndex); break;

		case 51: SINGLELINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 52: MULTI_LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\61\u016c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3(\3(\3)\5)\u010b\n)\3*\3*\5*\u010f\n*\3*\3*\3*\7*\u0114\n*\f*\16"+
		"*\u0117\13*\3+\3+\3,\3,\3-\6-\u011e\n-\r-\16-\u011f\3.\6.\u0123\n.\r."+
		"\16.\u0124\3.\3.\3/\3/\3/\7/\u012c\n/\f/\16/\u012f\13/\3/\3/\3\60\3\60"+
		"\3\61\3\61\3\61\3\61\5\61\u0139\n\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\5\62\u0144\n\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\6\64"+
		"\u014e\n\64\r\64\16\64\u014f\3\64\3\64\3\65\3\65\3\65\3\65\7\65\u0158"+
		"\n\65\f\65\16\65\u015b\13\65\3\65\3\65\3\66\3\66\3\66\3\66\7\66\u0163"+
		"\n\66\f\66\16\66\u0166\13\66\3\66\3\66\3\66\3\66\3\66\3\u0164\67\3\3\1"+
		"\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31"+
		"\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30"+
		"\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1"+
		"E$\1G%\1I&\1K\'\1M(\1O\2\1Q\2\1S)\1U*\1W+\1Y,\1[-\1].\1_\2\1a\2\1c\2\1"+
		"e\2\1g/\2i\60\3k\61\4\3\2\13\3\2\62;\4\2C\\c|\4\2$$^^\5\2\62;CHch\n\2"+
		"$$))^^ddhhppttvv\3\2\62\65\3\2\629\5\2\13\f\17\17\"\"\4\2\f\f\17\17\u0174"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\3m\3"+
		"\2\2\2\5q\3\2\2\2\7s\3\2\2\2\tu\3\2\2\2\13w\3\2\2\2\ry\3\2\2\2\17{\3\2"+
		"\2\2\21}\3\2\2\2\23\177\3\2\2\2\25\u0081\3\2\2\2\27\u0083\3\2\2\2\31\u0085"+
		"\3\2\2\2\33\u0087\3\2\2\2\35\u0089\3\2\2\2\37\u008c\3\2\2\2!\u008e\3\2"+
		"\2\2#\u0091\3\2\2\2%\u0093\3\2\2\2\'\u0096\3\2\2\2)\u00a1\3\2\2\2+\u00a5"+
		"\3\2\2\2-\u00ab\3\2\2\2/\u00b3\3\2\2\2\61\u00b6\3\2\2\2\63\u00bb\3\2\2"+
		"\2\65\u00c2\3\2\2\2\67\u00c8\3\2\2\29\u00ce\3\2\2\2;\u00d3\3\2\2\2=\u00d9"+
		"\3\2\2\2?\u00df\3\2\2\2A\u00e1\3\2\2\2C\u00e3\3\2\2\2E\u00e5\3\2\2\2G"+
		"\u00e7\3\2\2\2I\u00ee\3\2\2\2K\u00f6\3\2\2\2M\u0100\3\2\2\2O\u0107\3\2"+
		"\2\2Q\u010a\3\2\2\2S\u010e\3\2\2\2U\u0118\3\2\2\2W\u011a\3\2\2\2Y\u011d"+
		"\3\2\2\2[\u0122\3\2\2\2]\u0128\3\2\2\2_\u0132\3\2\2\2a\u0138\3\2\2\2c"+
		"\u0143\3\2\2\2e\u0145\3\2\2\2g\u014d\3\2\2\2i\u0153\3\2\2\2k\u015e\3\2"+
		"\2\2mn\7\60\2\2no\7\60\2\2op\7\60\2\2p\4\3\2\2\2qr\7.\2\2r\6\3\2\2\2s"+
		"t\7*\2\2t\b\3\2\2\2uv\7+\2\2v\n\3\2\2\2wx\7`\2\2x\f\3\2\2\2yz\7B\2\2z"+
		"\16\3\2\2\2{|\7&\2\2|\20\3\2\2\2}~\7%\2\2~\22\3\2\2\2\177\u0080\7-\2\2"+
		"\u0080\24\3\2\2\2\u0081\u0082\7/\2\2\u0082\26\3\2\2\2\u0083\u0084\7,\2"+
		"\2\u0084\30\3\2\2\2\u0085\u0086\7\61\2\2\u0086\32\3\2\2\2\u0087\u0088"+
		"\7>\2\2\u0088\34\3\2\2\2\u0089\u008a\7>\2\2\u008a\u008b\7?\2\2\u008b\36"+
		"\3\2\2\2\u008c\u008d\7@\2\2\u008d \3\2\2\2\u008e\u008f\7@\2\2\u008f\u0090"+
		"\7?\2\2\u0090\"\3\2\2\2\u0091\u0092\7?\2\2\u0092$\3\2\2\2\u0093\u0094"+
		"\7?\2\2\u0094\u0095\7@\2\2\u0095&\3\2\2\2\u0096\u0097\7v\2\2\u0097\u0098"+
		"\7j\2\2\u0098\u0099\7k\2\2\u0099\u009a\7u\2\2\u009a\u009b\7T\2\2\u009b"+
		"\u009c\7g\2\2\u009c\u009d\7u\2\2\u009d\u009e\7w\2\2\u009e\u009f\7n\2\2"+
		"\u009f\u00a0\7v\2\2\u00a0(\3\2\2\2\u00a1\u00a2\7v\2\2\u00a2\u00a3\7t\2"+
		"\2\u00a3\u00a4\7{\2\2\u00a4*\3\2\2\2\u00a5\u00a6\7e\2\2\u00a6\u00a7\7"+
		"c\2\2\u00a7\u00a8\7v\2\2\u00a8\u00a9\7e\2\2\u00a9\u00aa\7j\2\2\u00aa,"+
		"\3\2\2\2\u00ab\u00ac\7h\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae\7p\2\2\u00ae"+
		"\u00af\7c\2\2\u00af\u00b0\7n\2\2\u00b0\u00b1\7n\2\2\u00b1\u00b2\7{\2\2"+
		"\u00b2.\3\2\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5\7h\2\2\u00b5\60\3\2\2\2"+
		"\u00b6\u00b7\7g\2\2\u00b7\u00b8\7n\2\2\u00b8\u00b9\7u\2\2\u00b9\u00ba"+
		"\7g\2\2\u00ba\62\3\2\2\2\u00bb\u00bc\7t\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be"+
		"\7v\2\2\u00be\u00bf\7w\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1\7p\2\2\u00c1"+
		"\64\3\2\2\2\u00c2\u00c3\7v\2\2\u00c3\u00c4\7j\2\2\u00c4\u00c5\7t\2\2\u00c5"+
		"\u00c6\7q\2\2\u00c6\u00c7\7y\2\2\u00c7\66\3\2\2\2\u00c8\u00c9\7e\2\2\u00c9"+
		"\u00ca\7n\2\2\u00ca\u00cb\7c\2\2\u00cb\u00cc\7u\2\2\u00cc\u00cd\7u\2\2"+
		"\u00cd8\3\2\2\2\u00ce\u00cf\7v\2\2\u00cf\u00d0\7t\2\2\u00d0\u00d1\7w\2"+
		"\2\u00d1\u00d2\7g\2\2\u00d2:\3\2\2\2\u00d3\u00d4\7h\2\2\u00d4\u00d5\7"+
		"c\2\2\u00d5\u00d6\7n\2\2\u00d6\u00d7\7u\2\2\u00d7\u00d8\7g\2\2\u00d8<"+
		"\3\2\2\2\u00d9\u00da\7y\2\2\u00da\u00db\7j\2\2\u00db\u00dc\7k\2\2\u00dc"+
		"\u00dd\7n\2\2\u00dd\u00de\7g\2\2\u00de>\3\2\2\2\u00df\u00e0\7,\2\2\u00e0"+
		"@\3\2\2\2\u00e1\u00e2\7=\2\2\u00e2B\3\2\2\2\u00e3\u00e4\7<\2\2\u00e4D"+
		"\3\2\2\2\u00e5\u00e6\7\60\2\2\u00e6F\3\2\2\2\u00e7\u00e8\7r\2\2\u00e8"+
		"\u00e9\7w\2\2\u00e9\u00ea\7d\2\2\u00ea\u00eb\7n\2\2\u00eb\u00ec\7k\2\2"+
		"\u00ec\u00ed\7e\2\2\u00edH\3\2\2\2\u00ee\u00ef\7r\2\2\u00ef\u00f0\7t\2"+
		"\2\u00f0\u00f1\7k\2\2\u00f1\u00f2\7x\2\2\u00f2\u00f3\7c\2\2\u00f3\u00f4"+
		"\7v\2\2\u00f4\u00f5\7g\2\2\u00f5J\3\2\2\2\u00f6\u00f7\7r\2\2\u00f7\u00f8"+
		"\7t\2\2\u00f8\u00f9\7q\2\2\u00f9\u00fa\7v\2\2\u00fa\u00fb\7g\2\2\u00fb"+
		"\u00fc\7e\2\2\u00fc\u00fd\7v\2\2\u00fd\u00fe\7g\2\2\u00fe\u00ff\7f\2\2"+
		"\u00ffL\3\2\2\2\u0100\u0101\7u\2\2\u0101\u0102\7v\2\2\u0102\u0103\7c\2"+
		"\2\u0103\u0104\7v\2\2\u0104\u0105\7k\2\2\u0105\u0106\7e\2\2\u0106N\3\2"+
		"\2\2\u0107\u0108\t\2\2\2\u0108P\3\2\2\2\u0109\u010b\t\3\2\2\u010a\u0109"+
		"\3\2\2\2\u010bR\3\2\2\2\u010c\u010f\5Q)\2\u010d\u010f\7a\2\2\u010e\u010c"+
		"\3\2\2\2\u010e\u010d\3\2\2\2\u010f\u0115\3\2\2\2\u0110\u0114\5Q)\2\u0111"+
		"\u0114\7a\2\2\u0112\u0114\5O(\2\u0113\u0110\3\2\2\2\u0113\u0111\3\2\2"+
		"\2\u0113\u0112\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116"+
		"\3\2\2\2\u0116T\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u0119\7}\2\2\u0119V"+
		"\3\2\2\2\u011a\u011b\7\177\2\2\u011bX\3\2\2\2\u011c\u011e\5O(\2\u011d"+
		"\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2"+
		"\2\2\u0120Z\3\2\2\2\u0121\u0123\5O(\2\u0122\u0121\3\2\2\2\u0123\u0124"+
		"\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\3\2\2\2\u0126"+
		"\u0127\7N\2\2\u0127\\\3\2\2\2\u0128\u012d\7$\2\2\u0129\u012c\5a\61\2\u012a"+
		"\u012c\n\4\2\2\u012b\u0129\3\2\2\2\u012b\u012a\3\2\2\2\u012c\u012f\3\2"+
		"\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0130\3\2\2\2\u012f"+
		"\u012d\3\2\2\2\u0130\u0131\7$\2\2\u0131^\3\2\2\2\u0132\u0133\t\5\2\2\u0133"+
		"`\3\2\2\2\u0134\u0135\7^\2\2\u0135\u0139\t\6\2\2\u0136\u0139\5e\63\2\u0137"+
		"\u0139\5c\62\2\u0138\u0134\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0137\3\2"+
		"\2\2\u0139b\3\2\2\2\u013a\u013b\7^\2\2\u013b\u013c\t\7\2\2\u013c\u013d"+
		"\t\b\2\2\u013d\u0144\t\b\2\2\u013e\u013f\7^\2\2\u013f\u0140\t\b\2\2\u0140"+
		"\u0144\t\b\2\2\u0141\u0142\7^\2\2\u0142\u0144\t\b\2\2\u0143\u013a\3\2"+
		"\2\2\u0143\u013e\3\2\2\2\u0143\u0141\3\2\2\2\u0144d\3\2\2\2\u0145\u0146"+
		"\7^\2\2\u0146\u0147\7w\2\2\u0147\u0148\5_\60\2\u0148\u0149\5_\60\2\u0149"+
		"\u014a\5_\60\2\u014a\u014b\5_\60\2\u014bf\3\2\2\2\u014c\u014e\t\t\2\2"+
		"\u014d\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150"+
		"\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152\b\64\2\2\u0152h\3\2\2\2\u0153"+
		"\u0154\7\61\2\2\u0154\u0155\7\61\2\2\u0155\u0159\3\2\2\2\u0156\u0158\n"+
		"\n\2\2\u0157\u0156\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u0159"+
		"\u015a\3\2\2\2\u015a\u015c\3\2\2\2\u015b\u0159\3\2\2\2\u015c\u015d\b\65"+
		"\3\2\u015dj\3\2\2\2\u015e\u015f\7\61\2\2\u015f\u0160\7,\2\2\u0160\u0164"+
		"\3\2\2\2\u0161\u0163\13\2\2\2\u0162\u0161\3\2\2\2\u0163\u0166\3\2\2\2"+
		"\u0164\u0165\3\2\2\2\u0164\u0162\3\2\2\2\u0165\u0167\3\2\2\2\u0166\u0164"+
		"\3\2\2\2\u0167\u0168\7,\2\2\u0168\u0169\7\61\2\2\u0169\u016a\3\2\2\2\u016a"+
		"\u016b\b\66\4\2\u016bl\3\2\2\2\20\2\u010a\u010e\u0113\u0115\u011f\u0124"+
		"\u012b\u012d\u0138\u0143\u014f\u0159\u0164";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
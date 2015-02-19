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
		PLUS=9, MINUS=10, MULT=11, DIV=12, LT=13, LTE=14, GT=15, GTE=16, EQUALS=17, 
		NOT_EQUALS=18, ASSIGN_OP=19, ASSIGN_ADD=20, ASSIGN_SUB=21, ASSIGN_MULT=22, 
		ASSIGN_DIV=23, REPLACE_OP=24, KW_THIS_RESULT=25, KW_NEW=26, KW_TRY=27, 
		KW_CATCH=28, KW_FINALLY=29, KW_IF=30, KW_ELSE=31, KW_RETURN=32, KW_THROW=33, 
		KW_CLASS=34, KW_TRUE=35, KW_FALSE=36, KW_WHILE=37, KW_FOR=38, WILD_CARD=39, 
		SEMI_COLON=40, COLON=41, DOT=42, ACC_MOD_PUBLIC=43, ACC_MOD_PRIVATE=44, 
		ACC_MOD_PROTECTED=45, MOD_STATIC=46, ID=47, OPEN_BRA=48, CLOSE_BRA=49, 
		INTEGER=50, LONG=51, STRING=52, WS=53, SINGLELINE_COMMENT=54, MULTI_LINE_COMMENT=55;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'...'", "','", "'('", "')'", "'^'", "'@'", "'$'", "'#'", "'+'", "'-'", 
		"MULT", "'/'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'='", "'+='", 
		"'-='", "'*='", "'/='", "'=>'", "'thisResult'", "'new'", "'try'", "'catch'", 
		"'finally'", "'if'", "'else'", "'return'", "'throw'", "'class'", "'true'", 
		"'false'", "'while'", "'for'", "WILD_CARD", "';'", "':'", "'.'", "'public'", 
		"'private'", "'protected'", "'static'", "ID", "'{'", "'}'", "INTEGER", 
		"LONG", "STRING", "WS", "SINGLELINE_COMMENT", "MULTI_LINE_COMMENT"
	};
	public static final String[] ruleNames = {
		"ELLIPSES", "COMMA", "OPEN_PAR", "CLOSE_PAR", "HAT", "AT", "DOLLAR", "HASH", 
		"PLUS", "MINUS", "MULT", "DIV", "LT", "LTE", "GT", "GTE", "EQUALS", "NOT_EQUALS", 
		"ASSIGN_OP", "ASSIGN_ADD", "ASSIGN_SUB", "ASSIGN_MULT", "ASSIGN_DIV", 
		"REPLACE_OP", "KW_THIS_RESULT", "KW_NEW", "KW_TRY", "KW_CATCH", "KW_FINALLY", 
		"KW_IF", "KW_ELSE", "KW_RETURN", "KW_THROW", "KW_CLASS", "KW_TRUE", "KW_FALSE", 
		"KW_WHILE", "KW_FOR", "WILD_CARD", "SEMI_COLON", "COLON", "DOT", "ACC_MOD_PUBLIC", 
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
		case 58: WS_action((RuleContext)_localctx, actionIndex); break;

		case 59: SINGLELINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 60: MULTI_LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\29\u0196\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3"+
		"\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3"+
		"\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3"+
		"\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3"+
		"!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3"+
		"%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3"+
		",\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3"+
		".\3.\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\61\5\61\u0135\n\61\3\62\3\62\5\62"+
		"\u0139\n\62\3\62\3\62\3\62\7\62\u013e\n\62\f\62\16\62\u0141\13\62\3\63"+
		"\3\63\3\64\3\64\3\65\6\65\u0148\n\65\r\65\16\65\u0149\3\66\6\66\u014d"+
		"\n\66\r\66\16\66\u014e\3\66\3\66\3\67\3\67\3\67\7\67\u0156\n\67\f\67\16"+
		"\67\u0159\13\67\3\67\3\67\38\38\39\39\39\39\59\u0163\n9\3:\3:\3:\3:\3"+
		":\3:\3:\3:\3:\5:\u016e\n:\3;\3;\3;\3;\3;\3;\3;\3<\6<\u0178\n<\r<\16<\u0179"+
		"\3<\3<\3=\3=\3=\3=\7=\u0182\n=\f=\16=\u0185\13=\3=\3=\3>\3>\3>\3>\7>\u018d"+
		"\n>\f>\16>\u0190\13>\3>\3>\3>\3>\3>\3\u018e?\3\3\1\5\4\1\7\5\1\t\6\1\13"+
		"\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1"+
		"\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33"+
		"\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\1K\'\1M(\1O"+
		")\1Q*\1S+\1U,\1W-\1Y.\1[/\1]\60\1_\2\1a\2\1c\61\1e\62\1g\63\1i\64\1k\65"+
		"\1m\66\1o\2\1q\2\1s\2\1u\2\1w\67\2y8\3{9\4\3\2\13\3\2\62;\4\2C\\c|\4\2"+
		"$$^^\5\2\62;CHch\n\2$$))^^ddhhppttvv\3\2\62\65\3\2\629\5\2\13\f\17\17"+
		"\"\"\4\2\f\f\17\17\u019e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\3}\3\2\2\2\5\u0081\3\2\2\2\7\u0083"+
		"\3\2\2\2\t\u0085\3\2\2\2\13\u0087\3\2\2\2\r\u0089\3\2\2\2\17\u008b\3\2"+
		"\2\2\21\u008d\3\2\2\2\23\u008f\3\2\2\2\25\u0091\3\2\2\2\27\u0093\3\2\2"+
		"\2\31\u0095\3\2\2\2\33\u0097\3\2\2\2\35\u0099\3\2\2\2\37\u009c\3\2\2\2"+
		"!\u009e\3\2\2\2#\u00a1\3\2\2\2%\u00a4\3\2\2\2\'\u00a7\3\2\2\2)\u00a9\3"+
		"\2\2\2+\u00ac\3\2\2\2-\u00af\3\2\2\2/\u00b2\3\2\2\2\61\u00b5\3\2\2\2\63"+
		"\u00b8\3\2\2\2\65\u00c3\3\2\2\2\67\u00c7\3\2\2\29\u00cb\3\2\2\2;\u00d1"+
		"\3\2\2\2=\u00d9\3\2\2\2?\u00dc\3\2\2\2A\u00e1\3\2\2\2C\u00e8\3\2\2\2E"+
		"\u00ee\3\2\2\2G\u00f4\3\2\2\2I\u00f9\3\2\2\2K\u00ff\3\2\2\2M\u0105\3\2"+
		"\2\2O\u0109\3\2\2\2Q\u010b\3\2\2\2S\u010d\3\2\2\2U\u010f\3\2\2\2W\u0111"+
		"\3\2\2\2Y\u0118\3\2\2\2[\u0120\3\2\2\2]\u012a\3\2\2\2_\u0131\3\2\2\2a"+
		"\u0134\3\2\2\2c\u0138\3\2\2\2e\u0142\3\2\2\2g\u0144\3\2\2\2i\u0147\3\2"+
		"\2\2k\u014c\3\2\2\2m\u0152\3\2\2\2o\u015c\3\2\2\2q\u0162\3\2\2\2s\u016d"+
		"\3\2\2\2u\u016f\3\2\2\2w\u0177\3\2\2\2y\u017d\3\2\2\2{\u0188\3\2\2\2}"+
		"~\7\60\2\2~\177\7\60\2\2\177\u0080\7\60\2\2\u0080\4\3\2\2\2\u0081\u0082"+
		"\7.\2\2\u0082\6\3\2\2\2\u0083\u0084\7*\2\2\u0084\b\3\2\2\2\u0085\u0086"+
		"\7+\2\2\u0086\n\3\2\2\2\u0087\u0088\7`\2\2\u0088\f\3\2\2\2\u0089\u008a"+
		"\7B\2\2\u008a\16\3\2\2\2\u008b\u008c\7&\2\2\u008c\20\3\2\2\2\u008d\u008e"+
		"\7%\2\2\u008e\22\3\2\2\2\u008f\u0090\7-\2\2\u0090\24\3\2\2\2\u0091\u0092"+
		"\7/\2\2\u0092\26\3\2\2\2\u0093\u0094\7,\2\2\u0094\30\3\2\2\2\u0095\u0096"+
		"\7\61\2\2\u0096\32\3\2\2\2\u0097\u0098\7>\2\2\u0098\34\3\2\2\2\u0099\u009a"+
		"\7>\2\2\u009a\u009b\7?\2\2\u009b\36\3\2\2\2\u009c\u009d\7@\2\2\u009d "+
		"\3\2\2\2\u009e\u009f\7@\2\2\u009f\u00a0\7?\2\2\u00a0\"\3\2\2\2\u00a1\u00a2"+
		"\7?\2\2\u00a2\u00a3\7?\2\2\u00a3$\3\2\2\2\u00a4\u00a5\7#\2\2\u00a5\u00a6"+
		"\7?\2\2\u00a6&\3\2\2\2\u00a7\u00a8\7?\2\2\u00a8(\3\2\2\2\u00a9\u00aa\7"+
		"-\2\2\u00aa\u00ab\7?\2\2\u00ab*\3\2\2\2\u00ac\u00ad\7/\2\2\u00ad\u00ae"+
		"\7?\2\2\u00ae,\3\2\2\2\u00af\u00b0\7,\2\2\u00b0\u00b1\7?\2\2\u00b1.\3"+
		"\2\2\2\u00b2\u00b3\7\61\2\2\u00b3\u00b4\7?\2\2\u00b4\60\3\2\2\2\u00b5"+
		"\u00b6\7?\2\2\u00b6\u00b7\7@\2\2\u00b7\62\3\2\2\2\u00b8\u00b9\7v\2\2\u00b9"+
		"\u00ba\7j\2\2\u00ba\u00bb\7k\2\2\u00bb\u00bc\7u\2\2\u00bc\u00bd\7T\2\2"+
		"\u00bd\u00be\7g\2\2\u00be\u00bf\7u\2\2\u00bf\u00c0\7w\2\2\u00c0\u00c1"+
		"\7n\2\2\u00c1\u00c2\7v\2\2\u00c2\64\3\2\2\2\u00c3\u00c4\7p\2\2\u00c4\u00c5"+
		"\7g\2\2\u00c5\u00c6\7y\2\2\u00c6\66\3\2\2\2\u00c7\u00c8\7v\2\2\u00c8\u00c9"+
		"\7t\2\2\u00c9\u00ca\7{\2\2\u00ca8\3\2\2\2\u00cb\u00cc\7e\2\2\u00cc\u00cd"+
		"\7c\2\2\u00cd\u00ce\7v\2\2\u00ce\u00cf\7e\2\2\u00cf\u00d0\7j\2\2\u00d0"+
		":\3\2\2\2\u00d1\u00d2\7h\2\2\u00d2\u00d3\7k\2\2\u00d3\u00d4\7p\2\2\u00d4"+
		"\u00d5\7c\2\2\u00d5\u00d6\7n\2\2\u00d6\u00d7\7n\2\2\u00d7\u00d8\7{\2\2"+
		"\u00d8<\3\2\2\2\u00d9\u00da\7k\2\2\u00da\u00db\7h\2\2\u00db>\3\2\2\2\u00dc"+
		"\u00dd\7g\2\2\u00dd\u00de\7n\2\2\u00de\u00df\7u\2\2\u00df\u00e0\7g\2\2"+
		"\u00e0@\3\2\2\2\u00e1\u00e2\7t\2\2\u00e2\u00e3\7g\2\2\u00e3\u00e4\7v\2"+
		"\2\u00e4\u00e5\7w\2\2\u00e5\u00e6\7t\2\2\u00e6\u00e7\7p\2\2\u00e7B\3\2"+
		"\2\2\u00e8\u00e9\7v\2\2\u00e9\u00ea\7j\2\2\u00ea\u00eb\7t\2\2\u00eb\u00ec"+
		"\7q\2\2\u00ec\u00ed\7y\2\2\u00edD\3\2\2\2\u00ee\u00ef\7e\2\2\u00ef\u00f0"+
		"\7n\2\2\u00f0\u00f1\7c\2\2\u00f1\u00f2\7u\2\2\u00f2\u00f3\7u\2\2\u00f3"+
		"F\3\2\2\2\u00f4\u00f5\7v\2\2\u00f5\u00f6\7t\2\2\u00f6\u00f7\7w\2\2\u00f7"+
		"\u00f8\7g\2\2\u00f8H\3\2\2\2\u00f9\u00fa\7h\2\2\u00fa\u00fb\7c\2\2\u00fb"+
		"\u00fc\7n\2\2\u00fc\u00fd\7u\2\2\u00fd\u00fe\7g\2\2\u00feJ\3\2\2\2\u00ff"+
		"\u0100\7y\2\2\u0100\u0101\7j\2\2\u0101\u0102\7k\2\2\u0102\u0103\7n\2\2"+
		"\u0103\u0104\7g\2\2\u0104L\3\2\2\2\u0105\u0106\7h\2\2\u0106\u0107\7q\2"+
		"\2\u0107\u0108\7t\2\2\u0108N\3\2\2\2\u0109\u010a\7,\2\2\u010aP\3\2\2\2"+
		"\u010b\u010c\7=\2\2\u010cR\3\2\2\2\u010d\u010e\7<\2\2\u010eT\3\2\2\2\u010f"+
		"\u0110\7\60\2\2\u0110V\3\2\2\2\u0111\u0112\7r\2\2\u0112\u0113\7w\2\2\u0113"+
		"\u0114\7d\2\2\u0114\u0115\7n\2\2\u0115\u0116\7k\2\2\u0116\u0117\7e\2\2"+
		"\u0117X\3\2\2\2\u0118\u0119\7r\2\2\u0119\u011a\7t\2\2\u011a\u011b\7k\2"+
		"\2\u011b\u011c\7x\2\2\u011c\u011d\7c\2\2\u011d\u011e\7v\2\2\u011e\u011f"+
		"\7g\2\2\u011fZ\3\2\2\2\u0120\u0121\7r\2\2\u0121\u0122\7t\2\2\u0122\u0123"+
		"\7q\2\2\u0123\u0124\7v\2\2\u0124\u0125\7g\2\2\u0125\u0126\7e\2\2\u0126"+
		"\u0127\7v\2\2\u0127\u0128\7g\2\2\u0128\u0129\7f\2\2\u0129\\\3\2\2\2\u012a"+
		"\u012b\7u\2\2\u012b\u012c\7v\2\2\u012c\u012d\7c\2\2\u012d\u012e\7v\2\2"+
		"\u012e\u012f\7k\2\2\u012f\u0130\7e\2\2\u0130^\3\2\2\2\u0131\u0132\t\2"+
		"\2\2\u0132`\3\2\2\2\u0133\u0135\t\3\2\2\u0134\u0133\3\2\2\2\u0135b\3\2"+
		"\2\2\u0136\u0139\5a\61\2\u0137\u0139\7a\2\2\u0138\u0136\3\2\2\2\u0138"+
		"\u0137\3\2\2\2\u0139\u013f\3\2\2\2\u013a\u013e\5a\61\2\u013b\u013e\7a"+
		"\2\2\u013c\u013e\5_\60\2\u013d\u013a\3\2\2\2\u013d\u013b\3\2\2\2\u013d"+
		"\u013c\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2"+
		"\2\2\u0140d\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u0143\7}\2\2\u0143f\3\2"+
		"\2\2\u0144\u0145\7\177\2\2\u0145h\3\2\2\2\u0146\u0148\5_\60\2\u0147\u0146"+
		"\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a"+
		"j\3\2\2\2\u014b\u014d\5_\60\2\u014c\u014b\3\2\2\2\u014d\u014e\3\2\2\2"+
		"\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151"+
		"\7N\2\2\u0151l\3\2\2\2\u0152\u0157\7$\2\2\u0153\u0156\5q9\2\u0154\u0156"+
		"\n\4\2\2\u0155\u0153\3\2\2\2\u0155\u0154\3\2\2\2\u0156\u0159\3\2\2\2\u0157"+
		"\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015a\3\2\2\2\u0159\u0157\3\2"+
		"\2\2\u015a\u015b\7$\2\2\u015bn\3\2\2\2\u015c\u015d\t\5\2\2\u015dp\3\2"+
		"\2\2\u015e\u015f\7^\2\2\u015f\u0163\t\6\2\2\u0160\u0163\5u;\2\u0161\u0163"+
		"\5s:\2\u0162\u015e\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0161\3\2\2\2\u0163"+
		"r\3\2\2\2\u0164\u0165\7^\2\2\u0165\u0166\t\7\2\2\u0166\u0167\t\b\2\2\u0167"+
		"\u016e\t\b\2\2\u0168\u0169\7^\2\2\u0169\u016a\t\b\2\2\u016a\u016e\t\b"+
		"\2\2\u016b\u016c\7^\2\2\u016c\u016e\t\b\2\2\u016d\u0164\3\2\2\2\u016d"+
		"\u0168\3\2\2\2\u016d\u016b\3\2\2\2\u016et\3\2\2\2\u016f\u0170\7^\2\2\u0170"+
		"\u0171\7w\2\2\u0171\u0172\5o8\2\u0172\u0173\5o8\2\u0173\u0174\5o8\2\u0174"+
		"\u0175\5o8\2\u0175v\3\2\2\2\u0176\u0178\t\t\2\2\u0177\u0176\3\2\2\2\u0178"+
		"\u0179\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017b\3\2"+
		"\2\2\u017b\u017c\b<\2\2\u017cx\3\2\2\2\u017d\u017e\7\61\2\2\u017e\u017f"+
		"\7\61\2\2\u017f\u0183\3\2\2\2\u0180\u0182\n\n\2\2\u0181\u0180\3\2\2\2"+
		"\u0182\u0185\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0186"+
		"\3\2\2\2\u0185\u0183\3\2\2\2\u0186\u0187\b=\3\2\u0187z\3\2\2\2\u0188\u0189"+
		"\7\61\2\2\u0189\u018a\7,\2\2\u018a\u018e\3\2\2\2\u018b\u018d\13\2\2\2"+
		"\u018c\u018b\3\2\2\2\u018d\u0190\3\2\2\2\u018e\u018f\3\2\2\2\u018e\u018c"+
		"\3\2\2\2\u018f\u0191\3\2\2\2\u0190\u018e\3\2\2\2\u0191\u0192\7,\2\2\u0192"+
		"\u0193\7\61\2\2\u0193\u0194\3\2\2\2\u0194\u0195\b>\4\2\u0195|\3\2\2\2"+
		"\20\2\u0134\u0138\u013d\u013f\u0149\u014e\u0155\u0157\u0162\u016d\u0179"+
		"\u0183\u018e";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
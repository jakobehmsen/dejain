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
		ELLIPSES=1, COMMA=2, OPEN_PAR=3, CLOSE_PAR=4, HAT=5, AT=6, INC=7, DEC=8, 
		TILDE=9, EXCLA=10, DOLLAR=11, HASH=12, PLUS=13, MINUS=14, MULT=15, DIV=16, 
		REM=17, LT=18, LTE=19, GT=20, GTE=21, EQUALS=22, NOT_EQUALS=23, ASSIGN_OP=24, 
		ASSIGN_ADD=25, ASSIGN_SUB=26, ASSIGN_MULT=27, ASSIGN_DIV=28, REPLACE_OP=29, 
		KW_THIS_RESULT=30, KW_NEW=31, KW_TRY=32, KW_CATCH=33, KW_FINALLY=34, KW_IF=35, 
		KW_ELSE=36, KW_RETURN=37, KW_THROW=38, KW_CLASS=39, KW_TRUE=40, KW_FALSE=41, 
		KW_WHILE=42, KW_FOR=43, WILD_CARD=44, SEMI_COLON=45, COLON=46, DOT=47, 
		ACC_MOD_PUBLIC=48, ACC_MOD_PRIVATE=49, ACC_MOD_PROTECTED=50, MOD_STATIC=51, 
		ID=52, OPEN_BRA=53, CLOSE_BRA=54, INTEGER=55, LONG=56, STRING=57, WS=58, 
		SINGLELINE_COMMENT=59, MULTI_LINE_COMMENT=60;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'...'", "','", "'('", "')'", "'^'", "'@'", "'++'", "'--'", "'~'", "'!'", 
		"'$'", "'#'", "'+'", "'-'", "MULT", "'/'", "'%'", "'<'", "'<='", "'>'", 
		"'>='", "'=='", "'!='", "'='", "'+='", "'-='", "'*='", "'/='", "'=>'", 
		"'thisResult'", "'new'", "'try'", "'catch'", "'finally'", "'if'", "'else'", 
		"'return'", "'throw'", "'class'", "'true'", "'false'", "'while'", "'for'", 
		"WILD_CARD", "';'", "':'", "'.'", "'public'", "'private'", "'protected'", 
		"'static'", "ID", "'{'", "'}'", "INTEGER", "LONG", "STRING", "WS", "SINGLELINE_COMMENT", 
		"MULTI_LINE_COMMENT"
	};
	public static final String[] ruleNames = {
		"ELLIPSES", "COMMA", "OPEN_PAR", "CLOSE_PAR", "HAT", "AT", "INC", "DEC", 
		"TILDE", "EXCLA", "DOLLAR", "HASH", "PLUS", "MINUS", "MULT", "DIV", "REM", 
		"LT", "LTE", "GT", "GTE", "EQUALS", "NOT_EQUALS", "ASSIGN_OP", "ASSIGN_ADD", 
		"ASSIGN_SUB", "ASSIGN_MULT", "ASSIGN_DIV", "REPLACE_OP", "KW_THIS_RESULT", 
		"KW_NEW", "KW_TRY", "KW_CATCH", "KW_FINALLY", "KW_IF", "KW_ELSE", "KW_RETURN", 
		"KW_THROW", "KW_CLASS", "KW_TRUE", "KW_FALSE", "KW_WHILE", "KW_FOR", "WILD_CARD", 
		"SEMI_COLON", "COLON", "DOT", "ACC_MOD_PUBLIC", "ACC_MOD_PRIVATE", "ACC_MOD_PROTECTED", 
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
		case 63: WS_action((RuleContext)_localctx, actionIndex); break;

		case 64: SINGLELINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 65: MULTI_LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2>\u01ac\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3"+
		"\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3"+
		"+\3,\3,\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65"+
		"\3\66\5\66\u014b\n\66\3\67\3\67\5\67\u014f\n\67\3\67\3\67\3\67\7\67\u0154"+
		"\n\67\f\67\16\67\u0157\13\67\38\38\39\39\3:\6:\u015e\n:\r:\16:\u015f\3"+
		";\6;\u0163\n;\r;\16;\u0164\3;\3;\3<\3<\3<\7<\u016c\n<\f<\16<\u016f\13"+
		"<\3<\3<\3=\3=\3>\3>\3>\3>\5>\u0179\n>\3?\3?\3?\3?\3?\3?\3?\3?\3?\5?\u0184"+
		"\n?\3@\3@\3@\3@\3@\3@\3@\3A\6A\u018e\nA\rA\16A\u018f\3A\3A\3B\3B\3B\3"+
		"B\7B\u0198\nB\fB\16B\u019b\13B\3B\3B\3C\3C\3C\3C\7C\u01a3\nC\fC\16C\u01a6"+
		"\13C\3C\3C\3C\3C\3C\3\u01a4D\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t"+
		"\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1"+
		"#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67"+
		"\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\1K\'\1M(\1O)\1Q*\1S+\1U,"+
		"\1W-\1Y.\1[/\1]\60\1_\61\1a\62\1c\63\1e\64\1g\65\1i\2\1k\2\1m\66\1o\67"+
		"\1q8\1s9\1u:\1w;\1y\2\1{\2\1}\2\1\177\2\1\u0081<\2\u0083=\3\u0085>\4\3"+
		"\2\f\3\2\62;\4\2C\\c|\4\2NNnn\4\2$$^^\5\2\62;CHch\n\2$$))^^ddhhppttvv"+
		"\3\2\62\65\3\2\629\5\2\13\f\17\17\"\"\4\2\f\f\17\17\u01b4\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W"+
		"\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2"+
		"\2\2\2e\3\2\2\2\2g\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2"+
		"\2u\3\2\2\2\2w\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2"+
		"\3\u0087\3\2\2\2\5\u008b\3\2\2\2\7\u008d\3\2\2\2\t\u008f\3\2\2\2\13\u0091"+
		"\3\2\2\2\r\u0093\3\2\2\2\17\u0095\3\2\2\2\21\u0098\3\2\2\2\23\u009b\3"+
		"\2\2\2\25\u009d\3\2\2\2\27\u009f\3\2\2\2\31\u00a1\3\2\2\2\33\u00a3\3\2"+
		"\2\2\35\u00a5\3\2\2\2\37\u00a7\3\2\2\2!\u00a9\3\2\2\2#\u00ab\3\2\2\2%"+
		"\u00ad\3\2\2\2\'\u00af\3\2\2\2)\u00b2\3\2\2\2+\u00b4\3\2\2\2-\u00b7\3"+
		"\2\2\2/\u00ba\3\2\2\2\61\u00bd\3\2\2\2\63\u00bf\3\2\2\2\65\u00c2\3\2\2"+
		"\2\67\u00c5\3\2\2\29\u00c8\3\2\2\2;\u00cb\3\2\2\2=\u00ce\3\2\2\2?\u00d9"+
		"\3\2\2\2A\u00dd\3\2\2\2C\u00e1\3\2\2\2E\u00e7\3\2\2\2G\u00ef\3\2\2\2I"+
		"\u00f2\3\2\2\2K\u00f7\3\2\2\2M\u00fe\3\2\2\2O\u0104\3\2\2\2Q\u010a\3\2"+
		"\2\2S\u010f\3\2\2\2U\u0115\3\2\2\2W\u011b\3\2\2\2Y\u011f\3\2\2\2[\u0121"+
		"\3\2\2\2]\u0123\3\2\2\2_\u0125\3\2\2\2a\u0127\3\2\2\2c\u012e\3\2\2\2e"+
		"\u0136\3\2\2\2g\u0140\3\2\2\2i\u0147\3\2\2\2k\u014a\3\2\2\2m\u014e\3\2"+
		"\2\2o\u0158\3\2\2\2q\u015a\3\2\2\2s\u015d\3\2\2\2u\u0162\3\2\2\2w\u0168"+
		"\3\2\2\2y\u0172\3\2\2\2{\u0178\3\2\2\2}\u0183\3\2\2\2\177\u0185\3\2\2"+
		"\2\u0081\u018d\3\2\2\2\u0083\u0193\3\2\2\2\u0085\u019e\3\2\2\2\u0087\u0088"+
		"\7\60\2\2\u0088\u0089\7\60\2\2\u0089\u008a\7\60\2\2\u008a\4\3\2\2\2\u008b"+
		"\u008c\7.\2\2\u008c\6\3\2\2\2\u008d\u008e\7*\2\2\u008e\b\3\2\2\2\u008f"+
		"\u0090\7+\2\2\u0090\n\3\2\2\2\u0091\u0092\7`\2\2\u0092\f\3\2\2\2\u0093"+
		"\u0094\7B\2\2\u0094\16\3\2\2\2\u0095\u0096\7-\2\2\u0096\u0097\7-\2\2\u0097"+
		"\20\3\2\2\2\u0098\u0099\7/\2\2\u0099\u009a\7/\2\2\u009a\22\3\2\2\2\u009b"+
		"\u009c\7\u0080\2\2\u009c\24\3\2\2\2\u009d\u009e\7#\2\2\u009e\26\3\2\2"+
		"\2\u009f\u00a0\7&\2\2\u00a0\30\3\2\2\2\u00a1\u00a2\7%\2\2\u00a2\32\3\2"+
		"\2\2\u00a3\u00a4\7-\2\2\u00a4\34\3\2\2\2\u00a5\u00a6\7/\2\2\u00a6\36\3"+
		"\2\2\2\u00a7\u00a8\7,\2\2\u00a8 \3\2\2\2\u00a9\u00aa\7\61\2\2\u00aa\""+
		"\3\2\2\2\u00ab\u00ac\7\'\2\2\u00ac$\3\2\2\2\u00ad\u00ae\7>\2\2\u00ae&"+
		"\3\2\2\2\u00af\u00b0\7>\2\2\u00b0\u00b1\7?\2\2\u00b1(\3\2\2\2\u00b2\u00b3"+
		"\7@\2\2\u00b3*\3\2\2\2\u00b4\u00b5\7@\2\2\u00b5\u00b6\7?\2\2\u00b6,\3"+
		"\2\2\2\u00b7\u00b8\7?\2\2\u00b8\u00b9\7?\2\2\u00b9.\3\2\2\2\u00ba\u00bb"+
		"\7#\2\2\u00bb\u00bc\7?\2\2\u00bc\60\3\2\2\2\u00bd\u00be\7?\2\2\u00be\62"+
		"\3\2\2\2\u00bf\u00c0\7-\2\2\u00c0\u00c1\7?\2\2\u00c1\64\3\2\2\2\u00c2"+
		"\u00c3\7/\2\2\u00c3\u00c4\7?\2\2\u00c4\66\3\2\2\2\u00c5\u00c6\7,\2\2\u00c6"+
		"\u00c7\7?\2\2\u00c78\3\2\2\2\u00c8\u00c9\7\61\2\2\u00c9\u00ca\7?\2\2\u00ca"+
		":\3\2\2\2\u00cb\u00cc\7?\2\2\u00cc\u00cd\7@\2\2\u00cd<\3\2\2\2\u00ce\u00cf"+
		"\7v\2\2\u00cf\u00d0\7j\2\2\u00d0\u00d1\7k\2\2\u00d1\u00d2\7u\2\2\u00d2"+
		"\u00d3\7T\2\2\u00d3\u00d4\7g\2\2\u00d4\u00d5\7u\2\2\u00d5\u00d6\7w\2\2"+
		"\u00d6\u00d7\7n\2\2\u00d7\u00d8\7v\2\2\u00d8>\3\2\2\2\u00d9\u00da\7p\2"+
		"\2\u00da\u00db\7g\2\2\u00db\u00dc\7y\2\2\u00dc@\3\2\2\2\u00dd\u00de\7"+
		"v\2\2\u00de\u00df\7t\2\2\u00df\u00e0\7{\2\2\u00e0B\3\2\2\2\u00e1\u00e2"+
		"\7e\2\2\u00e2\u00e3\7c\2\2\u00e3\u00e4\7v\2\2\u00e4\u00e5\7e\2\2\u00e5"+
		"\u00e6\7j\2\2\u00e6D\3\2\2\2\u00e7\u00e8\7h\2\2\u00e8\u00e9\7k\2\2\u00e9"+
		"\u00ea\7p\2\2\u00ea\u00eb\7c\2\2\u00eb\u00ec\7n\2\2\u00ec\u00ed\7n\2\2"+
		"\u00ed\u00ee\7{\2\2\u00eeF\3\2\2\2\u00ef\u00f0\7k\2\2\u00f0\u00f1\7h\2"+
		"\2\u00f1H\3\2\2\2\u00f2\u00f3\7g\2\2\u00f3\u00f4\7n\2\2\u00f4\u00f5\7"+
		"u\2\2\u00f5\u00f6\7g\2\2\u00f6J\3\2\2\2\u00f7\u00f8\7t\2\2\u00f8\u00f9"+
		"\7g\2\2\u00f9\u00fa\7v\2\2\u00fa\u00fb\7w\2\2\u00fb\u00fc\7t\2\2\u00fc"+
		"\u00fd\7p\2\2\u00fdL\3\2\2\2\u00fe\u00ff\7v\2\2\u00ff\u0100\7j\2\2\u0100"+
		"\u0101\7t\2\2\u0101\u0102\7q\2\2\u0102\u0103\7y\2\2\u0103N\3\2\2\2\u0104"+
		"\u0105\7e\2\2\u0105\u0106\7n\2\2\u0106\u0107\7c\2\2\u0107\u0108\7u\2\2"+
		"\u0108\u0109\7u\2\2\u0109P\3\2\2\2\u010a\u010b\7v\2\2\u010b\u010c\7t\2"+
		"\2\u010c\u010d\7w\2\2\u010d\u010e\7g\2\2\u010eR\3\2\2\2\u010f\u0110\7"+
		"h\2\2\u0110\u0111\7c\2\2\u0111\u0112\7n\2\2\u0112\u0113\7u\2\2\u0113\u0114"+
		"\7g\2\2\u0114T\3\2\2\2\u0115\u0116\7y\2\2\u0116\u0117\7j\2\2\u0117\u0118"+
		"\7k\2\2\u0118\u0119\7n\2\2\u0119\u011a\7g\2\2\u011aV\3\2\2\2\u011b\u011c"+
		"\7h\2\2\u011c\u011d\7q\2\2\u011d\u011e\7t\2\2\u011eX\3\2\2\2\u011f\u0120"+
		"\7,\2\2\u0120Z\3\2\2\2\u0121\u0122\7=\2\2\u0122\\\3\2\2\2\u0123\u0124"+
		"\7<\2\2\u0124^\3\2\2\2\u0125\u0126\7\60\2\2\u0126`\3\2\2\2\u0127\u0128"+
		"\7r\2\2\u0128\u0129\7w\2\2\u0129\u012a\7d\2\2\u012a\u012b\7n\2\2\u012b"+
		"\u012c\7k\2\2\u012c\u012d\7e\2\2\u012db\3\2\2\2\u012e\u012f\7r\2\2\u012f"+
		"\u0130\7t\2\2\u0130\u0131\7k\2\2\u0131\u0132\7x\2\2\u0132\u0133\7c\2\2"+
		"\u0133\u0134\7v\2\2\u0134\u0135\7g\2\2\u0135d\3\2\2\2\u0136\u0137\7r\2"+
		"\2\u0137\u0138\7t\2\2\u0138\u0139\7q\2\2\u0139\u013a\7v\2\2\u013a\u013b"+
		"\7g\2\2\u013b\u013c\7e\2\2\u013c\u013d\7v\2\2\u013d\u013e\7g\2\2\u013e"+
		"\u013f\7f\2\2\u013ff\3\2\2\2\u0140\u0141\7u\2\2\u0141\u0142\7v\2\2\u0142"+
		"\u0143\7c\2\2\u0143\u0144\7v\2\2\u0144\u0145\7k\2\2\u0145\u0146\7e\2\2"+
		"\u0146h\3\2\2\2\u0147\u0148\t\2\2\2\u0148j\3\2\2\2\u0149\u014b\t\3\2\2"+
		"\u014a\u0149\3\2\2\2\u014bl\3\2\2\2\u014c\u014f\5k\66\2\u014d\u014f\7"+
		"a\2\2\u014e\u014c\3\2\2\2\u014e\u014d\3\2\2\2\u014f\u0155\3\2\2\2\u0150"+
		"\u0154\5k\66\2\u0151\u0154\7a\2\2\u0152\u0154\5i\65\2\u0153\u0150\3\2"+
		"\2\2\u0153\u0151\3\2\2\2\u0153\u0152\3\2\2\2\u0154\u0157\3\2\2\2\u0155"+
		"\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156n\3\2\2\2\u0157\u0155\3\2\2\2"+
		"\u0158\u0159\7}\2\2\u0159p\3\2\2\2\u015a\u015b\7\177\2\2\u015br\3\2\2"+
		"\2\u015c\u015e\5i\65\2\u015d\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u015d"+
		"\3\2\2\2\u015f\u0160\3\2\2\2\u0160t\3\2\2\2\u0161\u0163\5i\65\2\u0162"+
		"\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2"+
		"\2\2\u0165\u0166\3\2\2\2\u0166\u0167\t\4\2\2\u0167v\3\2\2\2\u0168\u016d"+
		"\7$\2\2\u0169\u016c\5{>\2\u016a\u016c\n\5\2\2\u016b\u0169\3\2\2\2\u016b"+
		"\u016a\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2"+
		"\2\2\u016e\u0170\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0171\7$\2\2\u0171"+
		"x\3\2\2\2\u0172\u0173\t\6\2\2\u0173z\3\2\2\2\u0174\u0175\7^\2\2\u0175"+
		"\u0179\t\7\2\2\u0176\u0179\5\177@\2\u0177\u0179\5}?\2\u0178\u0174\3\2"+
		"\2\2\u0178\u0176\3\2\2\2\u0178\u0177\3\2\2\2\u0179|\3\2\2\2\u017a\u017b"+
		"\7^\2\2\u017b\u017c\t\b\2\2\u017c\u017d\t\t\2\2\u017d\u0184\t\t\2\2\u017e"+
		"\u017f\7^\2\2\u017f\u0180\t\t\2\2\u0180\u0184\t\t\2\2\u0181\u0182\7^\2"+
		"\2\u0182\u0184\t\t\2\2\u0183\u017a\3\2\2\2\u0183\u017e\3\2\2\2\u0183\u0181"+
		"\3\2\2\2\u0184~\3\2\2\2\u0185\u0186\7^\2\2\u0186\u0187\7w\2\2\u0187\u0188"+
		"\5y=\2\u0188\u0189\5y=\2\u0189\u018a\5y=\2\u018a\u018b\5y=\2\u018b\u0080"+
		"\3\2\2\2\u018c\u018e\t\n\2\2\u018d\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f"+
		"\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\bA"+
		"\2\2\u0192\u0082\3\2\2\2\u0193\u0194\7\61\2\2\u0194\u0195\7\61\2\2\u0195"+
		"\u0199\3\2\2\2\u0196\u0198\n\13\2\2\u0197\u0196\3\2\2\2\u0198\u019b\3"+
		"\2\2\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019c\3\2\2\2\u019b"+
		"\u0199\3\2\2\2\u019c\u019d\bB\3\2\u019d\u0084\3\2\2\2\u019e\u019f\7\61"+
		"\2\2\u019f\u01a0\7,\2\2\u01a0\u01a4\3\2\2\2\u01a1\u01a3\13\2\2\2\u01a2"+
		"\u01a1\3\2\2\2\u01a3\u01a6\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a4\u01a2\3\2"+
		"\2\2\u01a5\u01a7\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a7\u01a8\7,\2\2\u01a8"+
		"\u01a9\7\61\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\bC\4\2\u01ab\u0086\3\2"+
		"\2\2\20\2\u014a\u014e\u0153\u0155\u015f\u0164\u016b\u016d\u0178\u0183"+
		"\u018f\u0199\u01a4";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
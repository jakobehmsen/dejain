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
		LT=17, LTE=18, GT=19, GTE=20, EQUALS=21, NOT_EQUALS=22, ASSIGN_OP=23, 
		ASSIGN_ADD=24, ASSIGN_SUB=25, ASSIGN_MULT=26, ASSIGN_DIV=27, REPLACE_OP=28, 
		KW_THIS_RESULT=29, KW_NEW=30, KW_TRY=31, KW_CATCH=32, KW_FINALLY=33, KW_IF=34, 
		KW_ELSE=35, KW_RETURN=36, KW_THROW=37, KW_CLASS=38, KW_TRUE=39, KW_FALSE=40, 
		KW_WHILE=41, KW_FOR=42, WILD_CARD=43, SEMI_COLON=44, COLON=45, DOT=46, 
		ACC_MOD_PUBLIC=47, ACC_MOD_PRIVATE=48, ACC_MOD_PROTECTED=49, MOD_STATIC=50, 
		ID=51, OPEN_BRA=52, CLOSE_BRA=53, INTEGER=54, LONG=55, STRING=56, WS=57, 
		SINGLELINE_COMMENT=58, MULTI_LINE_COMMENT=59;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'...'", "','", "'('", "')'", "'^'", "'@'", "'++'", "'--'", "'~'", "'!'", 
		"'$'", "'#'", "'+'", "'-'", "MULT", "'/'", "'<'", "'<='", "'>'", "'>='", 
		"'=='", "'!='", "'='", "'+='", "'-='", "'*='", "'/='", "'=>'", "'thisResult'", 
		"'new'", "'try'", "'catch'", "'finally'", "'if'", "'else'", "'return'", 
		"'throw'", "'class'", "'true'", "'false'", "'while'", "'for'", "WILD_CARD", 
		"';'", "':'", "'.'", "'public'", "'private'", "'protected'", "'static'", 
		"ID", "'{'", "'}'", "INTEGER", "LONG", "STRING", "WS", "SINGLELINE_COMMENT", 
		"MULTI_LINE_COMMENT"
	};
	public static final String[] ruleNames = {
		"ELLIPSES", "COMMA", "OPEN_PAR", "CLOSE_PAR", "HAT", "AT", "INC", "DEC", 
		"TILDE", "EXCLA", "DOLLAR", "HASH", "PLUS", "MINUS", "MULT", "DIV", "LT", 
		"LTE", "GT", "GTE", "EQUALS", "NOT_EQUALS", "ASSIGN_OP", "ASSIGN_ADD", 
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
		case 62: WS_action((RuleContext)_localctx, actionIndex); break;

		case 63: SINGLELINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 64: MULTI_LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2=\u01a8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3"+
		"+\3+\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\65"+
		"\5\65\u0147\n\65\3\66\3\66\5\66\u014b\n\66\3\66\3\66\3\66\7\66\u0150\n"+
		"\66\f\66\16\66\u0153\13\66\3\67\3\67\38\38\39\69\u015a\n9\r9\169\u015b"+
		"\3:\6:\u015f\n:\r:\16:\u0160\3:\3:\3;\3;\3;\7;\u0168\n;\f;\16;\u016b\13"+
		";\3;\3;\3<\3<\3=\3=\3=\3=\5=\u0175\n=\3>\3>\3>\3>\3>\3>\3>\3>\3>\5>\u0180"+
		"\n>\3?\3?\3?\3?\3?\3?\3?\3@\6@\u018a\n@\r@\16@\u018b\3@\3@\3A\3A\3A\3"+
		"A\7A\u0194\nA\fA\16A\u0197\13A\3A\3A\3B\3B\3B\3B\7B\u019f\nB\fB\16B\u01a2"+
		"\13B\3B\3B\3B\3B\3B\3\u01a0C\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t"+
		"\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1"+
		"#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67"+
		"\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\1K\'\1M(\1O)\1Q*\1S+\1U,"+
		"\1W-\1Y.\1[/\1]\60\1_\61\1a\62\1c\63\1e\64\1g\2\1i\2\1k\65\1m\66\1o\67"+
		"\1q8\1s9\1u:\1w\2\1y\2\1{\2\1}\2\1\177;\2\u0081<\3\u0083=\4\3\2\f\3\2"+
		"\62;\4\2C\\c|\4\2NNnn\4\2$$^^\5\2\62;CHch\n\2$$))^^ddhhppttvv\3\2\62\65"+
		"\3\2\629\5\2\13\f\17\17\"\"\4\2\f\f\17\17\u01b0\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2"+
		"\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\3\u0085\3\2\2\2\5\u0089"+
		"\3\2\2\2\7\u008b\3\2\2\2\t\u008d\3\2\2\2\13\u008f\3\2\2\2\r\u0091\3\2"+
		"\2\2\17\u0093\3\2\2\2\21\u0096\3\2\2\2\23\u0099\3\2\2\2\25\u009b\3\2\2"+
		"\2\27\u009d\3\2\2\2\31\u009f\3\2\2\2\33\u00a1\3\2\2\2\35\u00a3\3\2\2\2"+
		"\37\u00a5\3\2\2\2!\u00a7\3\2\2\2#\u00a9\3\2\2\2%\u00ab\3\2\2\2\'\u00ae"+
		"\3\2\2\2)\u00b0\3\2\2\2+\u00b3\3\2\2\2-\u00b6\3\2\2\2/\u00b9\3\2\2\2\61"+
		"\u00bb\3\2\2\2\63\u00be\3\2\2\2\65\u00c1\3\2\2\2\67\u00c4\3\2\2\29\u00c7"+
		"\3\2\2\2;\u00ca\3\2\2\2=\u00d5\3\2\2\2?\u00d9\3\2\2\2A\u00dd\3\2\2\2C"+
		"\u00e3\3\2\2\2E\u00eb\3\2\2\2G\u00ee\3\2\2\2I\u00f3\3\2\2\2K\u00fa\3\2"+
		"\2\2M\u0100\3\2\2\2O\u0106\3\2\2\2Q\u010b\3\2\2\2S\u0111\3\2\2\2U\u0117"+
		"\3\2\2\2W\u011b\3\2\2\2Y\u011d\3\2\2\2[\u011f\3\2\2\2]\u0121\3\2\2\2_"+
		"\u0123\3\2\2\2a\u012a\3\2\2\2c\u0132\3\2\2\2e\u013c\3\2\2\2g\u0143\3\2"+
		"\2\2i\u0146\3\2\2\2k\u014a\3\2\2\2m\u0154\3\2\2\2o\u0156\3\2\2\2q\u0159"+
		"\3\2\2\2s\u015e\3\2\2\2u\u0164\3\2\2\2w\u016e\3\2\2\2y\u0174\3\2\2\2{"+
		"\u017f\3\2\2\2}\u0181\3\2\2\2\177\u0189\3\2\2\2\u0081\u018f\3\2\2\2\u0083"+
		"\u019a\3\2\2\2\u0085\u0086\7\60\2\2\u0086\u0087\7\60\2\2\u0087\u0088\7"+
		"\60\2\2\u0088\4\3\2\2\2\u0089\u008a\7.\2\2\u008a\6\3\2\2\2\u008b\u008c"+
		"\7*\2\2\u008c\b\3\2\2\2\u008d\u008e\7+\2\2\u008e\n\3\2\2\2\u008f\u0090"+
		"\7`\2\2\u0090\f\3\2\2\2\u0091\u0092\7B\2\2\u0092\16\3\2\2\2\u0093\u0094"+
		"\7-\2\2\u0094\u0095\7-\2\2\u0095\20\3\2\2\2\u0096\u0097\7/\2\2\u0097\u0098"+
		"\7/\2\2\u0098\22\3\2\2\2\u0099\u009a\7\u0080\2\2\u009a\24\3\2\2\2\u009b"+
		"\u009c\7#\2\2\u009c\26\3\2\2\2\u009d\u009e\7&\2\2\u009e\30\3\2\2\2\u009f"+
		"\u00a0\7%\2\2\u00a0\32\3\2\2\2\u00a1\u00a2\7-\2\2\u00a2\34\3\2\2\2\u00a3"+
		"\u00a4\7/\2\2\u00a4\36\3\2\2\2\u00a5\u00a6\7,\2\2\u00a6 \3\2\2\2\u00a7"+
		"\u00a8\7\61\2\2\u00a8\"\3\2\2\2\u00a9\u00aa\7>\2\2\u00aa$\3\2\2\2\u00ab"+
		"\u00ac\7>\2\2\u00ac\u00ad\7?\2\2\u00ad&\3\2\2\2\u00ae\u00af\7@\2\2\u00af"+
		"(\3\2\2\2\u00b0\u00b1\7@\2\2\u00b1\u00b2\7?\2\2\u00b2*\3\2\2\2\u00b3\u00b4"+
		"\7?\2\2\u00b4\u00b5\7?\2\2\u00b5,\3\2\2\2\u00b6\u00b7\7#\2\2\u00b7\u00b8"+
		"\7?\2\2\u00b8.\3\2\2\2\u00b9\u00ba\7?\2\2\u00ba\60\3\2\2\2\u00bb\u00bc"+
		"\7-\2\2\u00bc\u00bd\7?\2\2\u00bd\62\3\2\2\2\u00be\u00bf\7/\2\2\u00bf\u00c0"+
		"\7?\2\2\u00c0\64\3\2\2\2\u00c1\u00c2\7,\2\2\u00c2\u00c3\7?\2\2\u00c3\66"+
		"\3\2\2\2\u00c4\u00c5\7\61\2\2\u00c5\u00c6\7?\2\2\u00c68\3\2\2\2\u00c7"+
		"\u00c8\7?\2\2\u00c8\u00c9\7@\2\2\u00c9:\3\2\2\2\u00ca\u00cb\7v\2\2\u00cb"+
		"\u00cc\7j\2\2\u00cc\u00cd\7k\2\2\u00cd\u00ce\7u\2\2\u00ce\u00cf\7T\2\2"+
		"\u00cf\u00d0\7g\2\2\u00d0\u00d1\7u\2\2\u00d1\u00d2\7w\2\2\u00d2\u00d3"+
		"\7n\2\2\u00d3\u00d4\7v\2\2\u00d4<\3\2\2\2\u00d5\u00d6\7p\2\2\u00d6\u00d7"+
		"\7g\2\2\u00d7\u00d8\7y\2\2\u00d8>\3\2\2\2\u00d9\u00da\7v\2\2\u00da\u00db"+
		"\7t\2\2\u00db\u00dc\7{\2\2\u00dc@\3\2\2\2\u00dd\u00de\7e\2\2\u00de\u00df"+
		"\7c\2\2\u00df\u00e0\7v\2\2\u00e0\u00e1\7e\2\2\u00e1\u00e2\7j\2\2\u00e2"+
		"B\3\2\2\2\u00e3\u00e4\7h\2\2\u00e4\u00e5\7k\2\2\u00e5\u00e6\7p\2\2\u00e6"+
		"\u00e7\7c\2\2\u00e7\u00e8\7n\2\2\u00e8\u00e9\7n\2\2\u00e9\u00ea\7{\2\2"+
		"\u00eaD\3\2\2\2\u00eb\u00ec\7k\2\2\u00ec\u00ed\7h\2\2\u00edF\3\2\2\2\u00ee"+
		"\u00ef\7g\2\2\u00ef\u00f0\7n\2\2\u00f0\u00f1\7u\2\2\u00f1\u00f2\7g\2\2"+
		"\u00f2H\3\2\2\2\u00f3\u00f4\7t\2\2\u00f4\u00f5\7g\2\2\u00f5\u00f6\7v\2"+
		"\2\u00f6\u00f7\7w\2\2\u00f7\u00f8\7t\2\2\u00f8\u00f9\7p\2\2\u00f9J\3\2"+
		"\2\2\u00fa\u00fb\7v\2\2\u00fb\u00fc\7j\2\2\u00fc\u00fd\7t\2\2\u00fd\u00fe"+
		"\7q\2\2\u00fe\u00ff\7y\2\2\u00ffL\3\2\2\2\u0100\u0101\7e\2\2\u0101\u0102"+
		"\7n\2\2\u0102\u0103\7c\2\2\u0103\u0104\7u\2\2\u0104\u0105\7u\2\2\u0105"+
		"N\3\2\2\2\u0106\u0107\7v\2\2\u0107\u0108\7t\2\2\u0108\u0109\7w\2\2\u0109"+
		"\u010a\7g\2\2\u010aP\3\2\2\2\u010b\u010c\7h\2\2\u010c\u010d\7c\2\2\u010d"+
		"\u010e\7n\2\2\u010e\u010f\7u\2\2\u010f\u0110\7g\2\2\u0110R\3\2\2\2\u0111"+
		"\u0112\7y\2\2\u0112\u0113\7j\2\2\u0113\u0114\7k\2\2\u0114\u0115\7n\2\2"+
		"\u0115\u0116\7g\2\2\u0116T\3\2\2\2\u0117\u0118\7h\2\2\u0118\u0119\7q\2"+
		"\2\u0119\u011a\7t\2\2\u011aV\3\2\2\2\u011b\u011c\7,\2\2\u011cX\3\2\2\2"+
		"\u011d\u011e\7=\2\2\u011eZ\3\2\2\2\u011f\u0120\7<\2\2\u0120\\\3\2\2\2"+
		"\u0121\u0122\7\60\2\2\u0122^\3\2\2\2\u0123\u0124\7r\2\2\u0124\u0125\7"+
		"w\2\2\u0125\u0126\7d\2\2\u0126\u0127\7n\2\2\u0127\u0128\7k\2\2\u0128\u0129"+
		"\7e\2\2\u0129`\3\2\2\2\u012a\u012b\7r\2\2\u012b\u012c\7t\2\2\u012c\u012d"+
		"\7k\2\2\u012d\u012e\7x\2\2\u012e\u012f\7c\2\2\u012f\u0130\7v\2\2\u0130"+
		"\u0131\7g\2\2\u0131b\3\2\2\2\u0132\u0133\7r\2\2\u0133\u0134\7t\2\2\u0134"+
		"\u0135\7q\2\2\u0135\u0136\7v\2\2\u0136\u0137\7g\2\2\u0137\u0138\7e\2\2"+
		"\u0138\u0139\7v\2\2\u0139\u013a\7g\2\2\u013a\u013b\7f\2\2\u013bd\3\2\2"+
		"\2\u013c\u013d\7u\2\2\u013d\u013e\7v\2\2\u013e\u013f\7c\2\2\u013f\u0140"+
		"\7v\2\2\u0140\u0141\7k\2\2\u0141\u0142\7e\2\2\u0142f\3\2\2\2\u0143\u0144"+
		"\t\2\2\2\u0144h\3\2\2\2\u0145\u0147\t\3\2\2\u0146\u0145\3\2\2\2\u0147"+
		"j\3\2\2\2\u0148\u014b\5i\65\2\u0149\u014b\7a\2\2\u014a\u0148\3\2\2\2\u014a"+
		"\u0149\3\2\2\2\u014b\u0151\3\2\2\2\u014c\u0150\5i\65\2\u014d\u0150\7a"+
		"\2\2\u014e\u0150\5g\64\2\u014f\u014c\3\2\2\2\u014f\u014d\3\2\2\2\u014f"+
		"\u014e\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2"+
		"\2\2\u0152l\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0155\7}\2\2\u0155n\3\2"+
		"\2\2\u0156\u0157\7\177\2\2\u0157p\3\2\2\2\u0158\u015a\5g\64\2\u0159\u0158"+
		"\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c"+
		"r\3\2\2\2\u015d\u015f\5g\64\2\u015e\u015d\3\2\2\2\u015f\u0160\3\2\2\2"+
		"\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0163"+
		"\t\4\2\2\u0163t\3\2\2\2\u0164\u0169\7$\2\2\u0165\u0168\5y=\2\u0166\u0168"+
		"\n\5\2\2\u0167\u0165\3\2\2\2\u0167\u0166\3\2\2\2\u0168\u016b\3\2\2\2\u0169"+
		"\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016c\3\2\2\2\u016b\u0169\3\2"+
		"\2\2\u016c\u016d\7$\2\2\u016dv\3\2\2\2\u016e\u016f\t\6\2\2\u016fx\3\2"+
		"\2\2\u0170\u0171\7^\2\2\u0171\u0175\t\7\2\2\u0172\u0175\5}?\2\u0173\u0175"+
		"\5{>\2\u0174\u0170\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0173\3\2\2\2\u0175"+
		"z\3\2\2\2\u0176\u0177\7^\2\2\u0177\u0178\t\b\2\2\u0178\u0179\t\t\2\2\u0179"+
		"\u0180\t\t\2\2\u017a\u017b\7^\2\2\u017b\u017c\t\t\2\2\u017c\u0180\t\t"+
		"\2\2\u017d\u017e\7^\2\2\u017e\u0180\t\t\2\2\u017f\u0176\3\2\2\2\u017f"+
		"\u017a\3\2\2\2\u017f\u017d\3\2\2\2\u0180|\3\2\2\2\u0181\u0182\7^\2\2\u0182"+
		"\u0183\7w\2\2\u0183\u0184\5w<\2\u0184\u0185\5w<\2\u0185\u0186\5w<\2\u0186"+
		"\u0187\5w<\2\u0187~\3\2\2\2\u0188\u018a\t\n\2\2\u0189\u0188\3\2\2\2\u018a"+
		"\u018b\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018d\3\2"+
		"\2\2\u018d\u018e\b@\2\2\u018e\u0080\3\2\2\2\u018f\u0190\7\61\2\2\u0190"+
		"\u0191\7\61\2\2\u0191\u0195\3\2\2\2\u0192\u0194\n\13\2\2\u0193\u0192\3"+
		"\2\2\2\u0194\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196"+
		"\u0198\3\2\2\2\u0197\u0195\3\2\2\2\u0198\u0199\bA\3\2\u0199\u0082\3\2"+
		"\2\2\u019a\u019b\7\61\2\2\u019b\u019c\7,\2\2\u019c\u01a0\3\2\2\2\u019d"+
		"\u019f\13\2\2\2\u019e\u019d\3\2\2\2\u019f\u01a2\3\2\2\2\u01a0\u01a1\3"+
		"\2\2\2\u01a0\u019e\3\2\2\2\u01a1\u01a3\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a3"+
		"\u01a4\7,\2\2\u01a4\u01a5\7\61\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a7\bB"+
		"\4\2\u01a7\u0084\3\2\2\2\20\2\u0146\u014a\u014f\u0151\u015b\u0160\u0167"+
		"\u0169\u0174\u017f\u018b\u0195\u01a0";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
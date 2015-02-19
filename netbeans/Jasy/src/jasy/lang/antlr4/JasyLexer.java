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
		NOT_EQUALS=18, ASSIGN_OP=19, REPLACE_OP=20, KW_THIS_RESULT=21, KW_NEW=22, 
		KW_TRY=23, KW_CATCH=24, KW_FINALLY=25, KW_IF=26, KW_ELSE=27, KW_RETURN=28, 
		KW_THROW=29, KW_CLASS=30, KW_TRUE=31, KW_FALSE=32, KW_WHILE=33, WILD_CARD=34, 
		SEMI_COLON=35, COLON=36, DOT=37, ACC_MOD_PUBLIC=38, ACC_MOD_PRIVATE=39, 
		ACC_MOD_PROTECTED=40, MOD_STATIC=41, ID=42, OPEN_BRA=43, CLOSE_BRA=44, 
		INTEGER=45, LONG=46, STRING=47, WS=48, SINGLELINE_COMMENT=49, MULTI_LINE_COMMENT=50;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'...'", "','", "'('", "')'", "'^'", "'@'", "'$'", "'#'", "'+'", "'-'", 
		"MULT", "'/'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'='", "'=>'", 
		"'thisResult'", "'new'", "'try'", "'catch'", "'finally'", "'if'", "'else'", 
		"'return'", "'throw'", "'class'", "'true'", "'false'", "'while'", "WILD_CARD", 
		"';'", "':'", "'.'", "'public'", "'private'", "'protected'", "'static'", 
		"ID", "'{'", "'}'", "INTEGER", "LONG", "STRING", "WS", "SINGLELINE_COMMENT", 
		"MULTI_LINE_COMMENT"
	};
	public static final String[] ruleNames = {
		"ELLIPSES", "COMMA", "OPEN_PAR", "CLOSE_PAR", "HAT", "AT", "DOLLAR", "HASH", 
		"PLUS", "MINUS", "MULT", "DIV", "LT", "LTE", "GT", "GTE", "EQUALS", "NOT_EQUALS", 
		"ASSIGN_OP", "REPLACE_OP", "KW_THIS_RESULT", "KW_NEW", "KW_TRY", "KW_CATCH", 
		"KW_FINALLY", "KW_IF", "KW_ELSE", "KW_RETURN", "KW_THROW", "KW_CLASS", 
		"KW_TRUE", "KW_FALSE", "KW_WHILE", "WILD_CARD", "SEMI_COLON", "COLON", 
		"DOT", "ACC_MOD_PUBLIC", "ACC_MOD_PRIVATE", "ACC_MOD_PROTECTED", "MOD_STATIC", 
		"DIGIT", "LETTER", "ID", "OPEN_BRA", "CLOSE_BRA", "INTEGER", "LONG", "STRING", 
		"HexDigit", "EscapeSequence", "OctalEscape", "UnicodeEscape", "WS", "SINGLELINE_COMMENT", 
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
		case 53: WS_action((RuleContext)_localctx, actionIndex); break;

		case 54: SINGLELINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 55: MULTI_LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\64\u017c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3$\3$"+
		"\3%\3%\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3+\3+\3,\5,\u011b\n,\3"+
		"-\3-\5-\u011f\n-\3-\3-\3-\7-\u0124\n-\f-\16-\u0127\13-\3.\3.\3/\3/\3\60"+
		"\6\60\u012e\n\60\r\60\16\60\u012f\3\61\6\61\u0133\n\61\r\61\16\61\u0134"+
		"\3\61\3\61\3\62\3\62\3\62\7\62\u013c\n\62\f\62\16\62\u013f\13\62\3\62"+
		"\3\62\3\63\3\63\3\64\3\64\3\64\3\64\5\64\u0149\n\64\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\5\65\u0154\n\65\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\67\6\67\u015e\n\67\r\67\16\67\u015f\3\67\3\67\38\38\38\38\78\u0168"+
		"\n8\f8\168\u016b\138\38\38\39\39\39\39\79\u0173\n9\f9\169\u0176\139\3"+
		"9\39\39\39\39\3\u0174:\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21"+
		"\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1"+
		"%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\1"+
		"9\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\1K\'\1M(\1O)\1Q*\1S+\1U\2\1W\2"+
		"\1Y,\1[-\1].\1_/\1a\60\1c\61\1e\2\1g\2\1i\2\1k\2\1m\62\2o\63\3q\64\4\3"+
		"\2\13\3\2\62;\4\2C\\c|\4\2$$^^\5\2\62;CHch\n\2$$))^^ddhhppttvv\3\2\62"+
		"\65\3\2\629\5\2\13\f\17\17\"\"\4\2\f\f\17\17\u0184\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2"+
		"]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3"+
		"\2\2\2\3s\3\2\2\2\5w\3\2\2\2\7y\3\2\2\2\t{\3\2\2\2\13}\3\2\2\2\r\177\3"+
		"\2\2\2\17\u0081\3\2\2\2\21\u0083\3\2\2\2\23\u0085\3\2\2\2\25\u0087\3\2"+
		"\2\2\27\u0089\3\2\2\2\31\u008b\3\2\2\2\33\u008d\3\2\2\2\35\u008f\3\2\2"+
		"\2\37\u0092\3\2\2\2!\u0094\3\2\2\2#\u0097\3\2\2\2%\u009a\3\2\2\2\'\u009d"+
		"\3\2\2\2)\u009f\3\2\2\2+\u00a2\3\2\2\2-\u00ad\3\2\2\2/\u00b1\3\2\2\2\61"+
		"\u00b5\3\2\2\2\63\u00bb\3\2\2\2\65\u00c3\3\2\2\2\67\u00c6\3\2\2\29\u00cb"+
		"\3\2\2\2;\u00d2\3\2\2\2=\u00d8\3\2\2\2?\u00de\3\2\2\2A\u00e3\3\2\2\2C"+
		"\u00e9\3\2\2\2E\u00ef\3\2\2\2G\u00f1\3\2\2\2I\u00f3\3\2\2\2K\u00f5\3\2"+
		"\2\2M\u00f7\3\2\2\2O\u00fe\3\2\2\2Q\u0106\3\2\2\2S\u0110\3\2\2\2U\u0117"+
		"\3\2\2\2W\u011a\3\2\2\2Y\u011e\3\2\2\2[\u0128\3\2\2\2]\u012a\3\2\2\2_"+
		"\u012d\3\2\2\2a\u0132\3\2\2\2c\u0138\3\2\2\2e\u0142\3\2\2\2g\u0148\3\2"+
		"\2\2i\u0153\3\2\2\2k\u0155\3\2\2\2m\u015d\3\2\2\2o\u0163\3\2\2\2q\u016e"+
		"\3\2\2\2st\7\60\2\2tu\7\60\2\2uv\7\60\2\2v\4\3\2\2\2wx\7.\2\2x\6\3\2\2"+
		"\2yz\7*\2\2z\b\3\2\2\2{|\7+\2\2|\n\3\2\2\2}~\7`\2\2~\f\3\2\2\2\177\u0080"+
		"\7B\2\2\u0080\16\3\2\2\2\u0081\u0082\7&\2\2\u0082\20\3\2\2\2\u0083\u0084"+
		"\7%\2\2\u0084\22\3\2\2\2\u0085\u0086\7-\2\2\u0086\24\3\2\2\2\u0087\u0088"+
		"\7/\2\2\u0088\26\3\2\2\2\u0089\u008a\7,\2\2\u008a\30\3\2\2\2\u008b\u008c"+
		"\7\61\2\2\u008c\32\3\2\2\2\u008d\u008e\7>\2\2\u008e\34\3\2\2\2\u008f\u0090"+
		"\7>\2\2\u0090\u0091\7?\2\2\u0091\36\3\2\2\2\u0092\u0093\7@\2\2\u0093 "+
		"\3\2\2\2\u0094\u0095\7@\2\2\u0095\u0096\7?\2\2\u0096\"\3\2\2\2\u0097\u0098"+
		"\7?\2\2\u0098\u0099\7?\2\2\u0099$\3\2\2\2\u009a\u009b\7#\2\2\u009b\u009c"+
		"\7?\2\2\u009c&\3\2\2\2\u009d\u009e\7?\2\2\u009e(\3\2\2\2\u009f\u00a0\7"+
		"?\2\2\u00a0\u00a1\7@\2\2\u00a1*\3\2\2\2\u00a2\u00a3\7v\2\2\u00a3\u00a4"+
		"\7j\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6\7u\2\2\u00a6\u00a7\7T\2\2\u00a7"+
		"\u00a8\7g\2\2\u00a8\u00a9\7u\2\2\u00a9\u00aa\7w\2\2\u00aa\u00ab\7n\2\2"+
		"\u00ab\u00ac\7v\2\2\u00ac,\3\2\2\2\u00ad\u00ae\7p\2\2\u00ae\u00af\7g\2"+
		"\2\u00af\u00b0\7y\2\2\u00b0.\3\2\2\2\u00b1\u00b2\7v\2\2\u00b2\u00b3\7"+
		"t\2\2\u00b3\u00b4\7{\2\2\u00b4\60\3\2\2\2\u00b5\u00b6\7e\2\2\u00b6\u00b7"+
		"\7c\2\2\u00b7\u00b8\7v\2\2\u00b8\u00b9\7e\2\2\u00b9\u00ba\7j\2\2\u00ba"+
		"\62\3\2\2\2\u00bb\u00bc\7h\2\2\u00bc\u00bd\7k\2\2\u00bd\u00be\7p\2\2\u00be"+
		"\u00bf\7c\2\2\u00bf\u00c0\7n\2\2\u00c0\u00c1\7n\2\2\u00c1\u00c2\7{\2\2"+
		"\u00c2\64\3\2\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5\7h\2\2\u00c5\66\3\2\2"+
		"\2\u00c6\u00c7\7g\2\2\u00c7\u00c8\7n\2\2\u00c8\u00c9\7u\2\2\u00c9\u00ca"+
		"\7g\2\2\u00ca8\3\2\2\2\u00cb\u00cc\7t\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce"+
		"\7v\2\2\u00ce\u00cf\7w\2\2\u00cf\u00d0\7t\2\2\u00d0\u00d1\7p\2\2\u00d1"+
		":\3\2\2\2\u00d2\u00d3\7v\2\2\u00d3\u00d4\7j\2\2\u00d4\u00d5\7t\2\2\u00d5"+
		"\u00d6\7q\2\2\u00d6\u00d7\7y\2\2\u00d7<\3\2\2\2\u00d8\u00d9\7e\2\2\u00d9"+
		"\u00da\7n\2\2\u00da\u00db\7c\2\2\u00db\u00dc\7u\2\2\u00dc\u00dd\7u\2\2"+
		"\u00dd>\3\2\2\2\u00de\u00df\7v\2\2\u00df\u00e0\7t\2\2\u00e0\u00e1\7w\2"+
		"\2\u00e1\u00e2\7g\2\2\u00e2@\3\2\2\2\u00e3\u00e4\7h\2\2\u00e4\u00e5\7"+
		"c\2\2\u00e5\u00e6\7n\2\2\u00e6\u00e7\7u\2\2\u00e7\u00e8\7g\2\2\u00e8B"+
		"\3\2\2\2\u00e9\u00ea\7y\2\2\u00ea\u00eb\7j\2\2\u00eb\u00ec\7k\2\2\u00ec"+
		"\u00ed\7n\2\2\u00ed\u00ee\7g\2\2\u00eeD\3\2\2\2\u00ef\u00f0\7,\2\2\u00f0"+
		"F\3\2\2\2\u00f1\u00f2\7=\2\2\u00f2H\3\2\2\2\u00f3\u00f4\7<\2\2\u00f4J"+
		"\3\2\2\2\u00f5\u00f6\7\60\2\2\u00f6L\3\2\2\2\u00f7\u00f8\7r\2\2\u00f8"+
		"\u00f9\7w\2\2\u00f9\u00fa\7d\2\2\u00fa\u00fb\7n\2\2\u00fb\u00fc\7k\2\2"+
		"\u00fc\u00fd\7e\2\2\u00fdN\3\2\2\2\u00fe\u00ff\7r\2\2\u00ff\u0100\7t\2"+
		"\2\u0100\u0101\7k\2\2\u0101\u0102\7x\2\2\u0102\u0103\7c\2\2\u0103\u0104"+
		"\7v\2\2\u0104\u0105\7g\2\2\u0105P\3\2\2\2\u0106\u0107\7r\2\2\u0107\u0108"+
		"\7t\2\2\u0108\u0109\7q\2\2\u0109\u010a\7v\2\2\u010a\u010b\7g\2\2\u010b"+
		"\u010c\7e\2\2\u010c\u010d\7v\2\2\u010d\u010e\7g\2\2\u010e\u010f\7f\2\2"+
		"\u010fR\3\2\2\2\u0110\u0111\7u\2\2\u0111\u0112\7v\2\2\u0112\u0113\7c\2"+
		"\2\u0113\u0114\7v\2\2\u0114\u0115\7k\2\2\u0115\u0116\7e\2\2\u0116T\3\2"+
		"\2\2\u0117\u0118\t\2\2\2\u0118V\3\2\2\2\u0119\u011b\t\3\2\2\u011a\u0119"+
		"\3\2\2\2\u011bX\3\2\2\2\u011c\u011f\5W,\2\u011d\u011f\7a\2\2\u011e\u011c"+
		"\3\2\2\2\u011e\u011d\3\2\2\2\u011f\u0125\3\2\2\2\u0120\u0124\5W,\2\u0121"+
		"\u0124\7a\2\2\u0122\u0124\5U+\2\u0123\u0120\3\2\2\2\u0123\u0121\3\2\2"+
		"\2\u0123\u0122\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126"+
		"\3\2\2\2\u0126Z\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u0129\7}\2\2\u0129\\"+
		"\3\2\2\2\u012a\u012b\7\177\2\2\u012b^\3\2\2\2\u012c\u012e\5U+\2\u012d"+
		"\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2"+
		"\2\2\u0130`\3\2\2\2\u0131\u0133\5U+\2\u0132\u0131\3\2\2\2\u0133\u0134"+
		"\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u0137\7N\2\2\u0137b\3\2\2\2\u0138\u013d\7$\2\2\u0139\u013c\5g\64\2\u013a"+
		"\u013c\n\4\2\2\u013b\u0139\3\2\2\2\u013b\u013a\3\2\2\2\u013c\u013f\3\2"+
		"\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0140\3\2\2\2\u013f"+
		"\u013d\3\2\2\2\u0140\u0141\7$\2\2\u0141d\3\2\2\2\u0142\u0143\t\5\2\2\u0143"+
		"f\3\2\2\2\u0144\u0145\7^\2\2\u0145\u0149\t\6\2\2\u0146\u0149\5k\66\2\u0147"+
		"\u0149\5i\65\2\u0148\u0144\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0147\3\2"+
		"\2\2\u0149h\3\2\2\2\u014a\u014b\7^\2\2\u014b\u014c\t\7\2\2\u014c\u014d"+
		"\t\b\2\2\u014d\u0154\t\b\2\2\u014e\u014f\7^\2\2\u014f\u0150\t\b\2\2\u0150"+
		"\u0154\t\b\2\2\u0151\u0152\7^\2\2\u0152\u0154\t\b\2\2\u0153\u014a\3\2"+
		"\2\2\u0153\u014e\3\2\2\2\u0153\u0151\3\2\2\2\u0154j\3\2\2\2\u0155\u0156"+
		"\7^\2\2\u0156\u0157\7w\2\2\u0157\u0158\5e\63\2\u0158\u0159\5e\63\2\u0159"+
		"\u015a\5e\63\2\u015a\u015b\5e\63\2\u015bl\3\2\2\2\u015c\u015e\t\t\2\2"+
		"\u015d\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160"+
		"\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0162\b\67\2\2\u0162n\3\2\2\2\u0163"+
		"\u0164\7\61\2\2\u0164\u0165\7\61\2\2\u0165\u0169\3\2\2\2\u0166\u0168\n"+
		"\n\2\2\u0167\u0166\3\2\2\2\u0168\u016b\3\2\2\2\u0169\u0167\3\2\2\2\u0169"+
		"\u016a\3\2\2\2\u016a\u016c\3\2\2\2\u016b\u0169\3\2\2\2\u016c\u016d\b8"+
		"\3\2\u016dp\3\2\2\2\u016e\u016f\7\61\2\2\u016f\u0170\7,\2\2\u0170\u0174"+
		"\3\2\2\2\u0171\u0173\13\2\2\2\u0172\u0171\3\2\2\2\u0173\u0176\3\2\2\2"+
		"\u0174\u0175\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u0177\3\2\2\2\u0176\u0174"+
		"\3\2\2\2\u0177\u0178\7,\2\2\u0178\u0179\7\61\2\2\u0179\u017a\3\2\2\2\u017a"+
		"\u017b\b9\4\2\u017br\3\2\2\2\20\2\u011a\u011e\u0123\u0125\u012f\u0134"+
		"\u013b\u013d\u0148\u0153\u015f\u0169\u0174";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
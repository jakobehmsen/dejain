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
		ID=52, OPEN_BRA=53, CLOSE_BRA=54, INTEGER=55, LONG=56, DOUBLE=57, FLOAT=58, 
		STRING=59, WS=60, SINGLELINE_COMMENT=61, MULTI_LINE_COMMENT=62;
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
		"'static'", "ID", "'{'", "'}'", "INTEGER", "LONG", "DOUBLE", "FLOAT", 
		"STRING", "WS", "SINGLELINE_COMMENT", "MULTI_LINE_COMMENT"
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
		"LONG", "DOUBLE", "FLOAT", "STRING", "HexDigit", "EscapeSequence", "OctalEscape", 
		"UnicodeEscape", "WS", "SINGLELINE_COMMENT", "MULTI_LINE_COMMENT"
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
		case 65: WS_action((RuleContext)_localctx, actionIndex); break;

		case 66: SINGLELINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 67: MULTI_LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2@\u01ca\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+"+
		"\3+\3+\3+\3+\3,\3,\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3"+
		"\64\3\65\3\65\3\66\5\66\u014f\n\66\3\67\3\67\5\67\u0153\n\67\3\67\3\67"+
		"\3\67\7\67\u0158\n\67\f\67\16\67\u015b\13\67\38\38\39\39\3:\6:\u0162\n"+
		":\r:\16:\u0163\3;\6;\u0167\n;\r;\16;\u0168\3;\3;\3<\7<\u016e\n<\f<\16"+
		"<\u0171\13<\3<\3<\6<\u0175\n<\r<\16<\u0176\3=\7=\u017a\n=\f=\16=\u017d"+
		"\13=\3=\3=\6=\u0181\n=\r=\16=\u0182\3=\3=\3>\3>\3>\7>\u018a\n>\f>\16>"+
		"\u018d\13>\3>\3>\3?\3?\3@\3@\3@\3@\5@\u0197\n@\3A\3A\3A\3A\3A\3A\3A\3"+
		"A\3A\5A\u01a2\nA\3B\3B\3B\3B\3B\3B\3B\3C\6C\u01ac\nC\rC\16C\u01ad\3C\3"+
		"C\3D\3D\3D\3D\7D\u01b6\nD\fD\16D\u01b9\13D\3D\3D\3E\3E\3E\3E\7E\u01c1"+
		"\nE\fE\16E\u01c4\13E\3E\3E\3E\3E\3E\3\u01c2F\3\3\1\5\4\1\7\5\1\t\6\1\13"+
		"\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1"+
		"\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33"+
		"\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\1K\'\1M(\1O"+
		")\1Q*\1S+\1U,\1W-\1Y.\1[/\1]\60\1_\61\1a\62\1c\63\1e\64\1g\65\1i\2\1k"+
		"\2\1m\66\1o\67\1q8\1s9\1u:\1w;\1y<\1{=\1}\2\1\177\2\1\u0081\2\1\u0083"+
		"\2\1\u0085>\2\u0087?\3\u0089@\4\3\2\r\3\2\62;\4\2C\\c|\4\2NNnn\4\2HHh"+
		"h\4\2$$^^\5\2\62;CHch\n\2$$))^^ddhhppttvv\3\2\62\65\3\2\629\5\2\13\f\17"+
		"\17\"\"\4\2\f\f\17\17\u01d6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2"+
		"\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2m"+
		"\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2"+
		"\2\2\2{\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\3\u008b"+
		"\3\2\2\2\5\u008f\3\2\2\2\7\u0091\3\2\2\2\t\u0093\3\2\2\2\13\u0095\3\2"+
		"\2\2\r\u0097\3\2\2\2\17\u0099\3\2\2\2\21\u009c\3\2\2\2\23\u009f\3\2\2"+
		"\2\25\u00a1\3\2\2\2\27\u00a3\3\2\2\2\31\u00a5\3\2\2\2\33\u00a7\3\2\2\2"+
		"\35\u00a9\3\2\2\2\37\u00ab\3\2\2\2!\u00ad\3\2\2\2#\u00af\3\2\2\2%\u00b1"+
		"\3\2\2\2\'\u00b3\3\2\2\2)\u00b6\3\2\2\2+\u00b8\3\2\2\2-\u00bb\3\2\2\2"+
		"/\u00be\3\2\2\2\61\u00c1\3\2\2\2\63\u00c3\3\2\2\2\65\u00c6\3\2\2\2\67"+
		"\u00c9\3\2\2\29\u00cc\3\2\2\2;\u00cf\3\2\2\2=\u00d2\3\2\2\2?\u00dd\3\2"+
		"\2\2A\u00e1\3\2\2\2C\u00e5\3\2\2\2E\u00eb\3\2\2\2G\u00f3\3\2\2\2I\u00f6"+
		"\3\2\2\2K\u00fb\3\2\2\2M\u0102\3\2\2\2O\u0108\3\2\2\2Q\u010e\3\2\2\2S"+
		"\u0113\3\2\2\2U\u0119\3\2\2\2W\u011f\3\2\2\2Y\u0123\3\2\2\2[\u0125\3\2"+
		"\2\2]\u0127\3\2\2\2_\u0129\3\2\2\2a\u012b\3\2\2\2c\u0132\3\2\2\2e\u013a"+
		"\3\2\2\2g\u0144\3\2\2\2i\u014b\3\2\2\2k\u014e\3\2\2\2m\u0152\3\2\2\2o"+
		"\u015c\3\2\2\2q\u015e\3\2\2\2s\u0161\3\2\2\2u\u0166\3\2\2\2w\u016f\3\2"+
		"\2\2y\u017b\3\2\2\2{\u0186\3\2\2\2}\u0190\3\2\2\2\177\u0196\3\2\2\2\u0081"+
		"\u01a1\3\2\2\2\u0083\u01a3\3\2\2\2\u0085\u01ab\3\2\2\2\u0087\u01b1\3\2"+
		"\2\2\u0089\u01bc\3\2\2\2\u008b\u008c\7\60\2\2\u008c\u008d\7\60\2\2\u008d"+
		"\u008e\7\60\2\2\u008e\4\3\2\2\2\u008f\u0090\7.\2\2\u0090\6\3\2\2\2\u0091"+
		"\u0092\7*\2\2\u0092\b\3\2\2\2\u0093\u0094\7+\2\2\u0094\n\3\2\2\2\u0095"+
		"\u0096\7`\2\2\u0096\f\3\2\2\2\u0097\u0098\7B\2\2\u0098\16\3\2\2\2\u0099"+
		"\u009a\7-\2\2\u009a\u009b\7-\2\2\u009b\20\3\2\2\2\u009c\u009d\7/\2\2\u009d"+
		"\u009e\7/\2\2\u009e\22\3\2\2\2\u009f\u00a0\7\u0080\2\2\u00a0\24\3\2\2"+
		"\2\u00a1\u00a2\7#\2\2\u00a2\26\3\2\2\2\u00a3\u00a4\7&\2\2\u00a4\30\3\2"+
		"\2\2\u00a5\u00a6\7%\2\2\u00a6\32\3\2\2\2\u00a7\u00a8\7-\2\2\u00a8\34\3"+
		"\2\2\2\u00a9\u00aa\7/\2\2\u00aa\36\3\2\2\2\u00ab\u00ac\7,\2\2\u00ac \3"+
		"\2\2\2\u00ad\u00ae\7\61\2\2\u00ae\"\3\2\2\2\u00af\u00b0\7\'\2\2\u00b0"+
		"$\3\2\2\2\u00b1\u00b2\7>\2\2\u00b2&\3\2\2\2\u00b3\u00b4\7>\2\2\u00b4\u00b5"+
		"\7?\2\2\u00b5(\3\2\2\2\u00b6\u00b7\7@\2\2\u00b7*\3\2\2\2\u00b8\u00b9\7"+
		"@\2\2\u00b9\u00ba\7?\2\2\u00ba,\3\2\2\2\u00bb\u00bc\7?\2\2\u00bc\u00bd"+
		"\7?\2\2\u00bd.\3\2\2\2\u00be\u00bf\7#\2\2\u00bf\u00c0\7?\2\2\u00c0\60"+
		"\3\2\2\2\u00c1\u00c2\7?\2\2\u00c2\62\3\2\2\2\u00c3\u00c4\7-\2\2\u00c4"+
		"\u00c5\7?\2\2\u00c5\64\3\2\2\2\u00c6\u00c7\7/\2\2\u00c7\u00c8\7?\2\2\u00c8"+
		"\66\3\2\2\2\u00c9\u00ca\7,\2\2\u00ca\u00cb\7?\2\2\u00cb8\3\2\2\2\u00cc"+
		"\u00cd\7\61\2\2\u00cd\u00ce\7?\2\2\u00ce:\3\2\2\2\u00cf\u00d0\7?\2\2\u00d0"+
		"\u00d1\7@\2\2\u00d1<\3\2\2\2\u00d2\u00d3\7v\2\2\u00d3\u00d4\7j\2\2\u00d4"+
		"\u00d5\7k\2\2\u00d5\u00d6\7u\2\2\u00d6\u00d7\7T\2\2\u00d7\u00d8\7g\2\2"+
		"\u00d8\u00d9\7u\2\2\u00d9\u00da\7w\2\2\u00da\u00db\7n\2\2\u00db\u00dc"+
		"\7v\2\2\u00dc>\3\2\2\2\u00dd\u00de\7p\2\2\u00de\u00df\7g\2\2\u00df\u00e0"+
		"\7y\2\2\u00e0@\3\2\2\2\u00e1\u00e2\7v\2\2\u00e2\u00e3\7t\2\2\u00e3\u00e4"+
		"\7{\2\2\u00e4B\3\2\2\2\u00e5\u00e6\7e\2\2\u00e6\u00e7\7c\2\2\u00e7\u00e8"+
		"\7v\2\2\u00e8\u00e9\7e\2\2\u00e9\u00ea\7j\2\2\u00eaD\3\2\2\2\u00eb\u00ec"+
		"\7h\2\2\u00ec\u00ed\7k\2\2\u00ed\u00ee\7p\2\2\u00ee\u00ef\7c\2\2\u00ef"+
		"\u00f0\7n\2\2\u00f0\u00f1\7n\2\2\u00f1\u00f2\7{\2\2\u00f2F\3\2\2\2\u00f3"+
		"\u00f4\7k\2\2\u00f4\u00f5\7h\2\2\u00f5H\3\2\2\2\u00f6\u00f7\7g\2\2\u00f7"+
		"\u00f8\7n\2\2\u00f8\u00f9\7u\2\2\u00f9\u00fa\7g\2\2\u00faJ\3\2\2\2\u00fb"+
		"\u00fc\7t\2\2\u00fc\u00fd\7g\2\2\u00fd\u00fe\7v\2\2\u00fe\u00ff\7w\2\2"+
		"\u00ff\u0100\7t\2\2\u0100\u0101\7p\2\2\u0101L\3\2\2\2\u0102\u0103\7v\2"+
		"\2\u0103\u0104\7j\2\2\u0104\u0105\7t\2\2\u0105\u0106\7q\2\2\u0106\u0107"+
		"\7y\2\2\u0107N\3\2\2\2\u0108\u0109\7e\2\2\u0109\u010a\7n\2\2\u010a\u010b"+
		"\7c\2\2\u010b\u010c\7u\2\2\u010c\u010d\7u\2\2\u010dP\3\2\2\2\u010e\u010f"+
		"\7v\2\2\u010f\u0110\7t\2\2\u0110\u0111\7w\2\2\u0111\u0112\7g\2\2\u0112"+
		"R\3\2\2\2\u0113\u0114\7h\2\2\u0114\u0115\7c\2\2\u0115\u0116\7n\2\2\u0116"+
		"\u0117\7u\2\2\u0117\u0118\7g\2\2\u0118T\3\2\2\2\u0119\u011a\7y\2\2\u011a"+
		"\u011b\7j\2\2\u011b\u011c\7k\2\2\u011c\u011d\7n\2\2\u011d\u011e\7g\2\2"+
		"\u011eV\3\2\2\2\u011f\u0120\7h\2\2\u0120\u0121\7q\2\2\u0121\u0122\7t\2"+
		"\2\u0122X\3\2\2\2\u0123\u0124\7,\2\2\u0124Z\3\2\2\2\u0125\u0126\7=\2\2"+
		"\u0126\\\3\2\2\2\u0127\u0128\7<\2\2\u0128^\3\2\2\2\u0129\u012a\7\60\2"+
		"\2\u012a`\3\2\2\2\u012b\u012c\7r\2\2\u012c\u012d\7w\2\2\u012d\u012e\7"+
		"d\2\2\u012e\u012f\7n\2\2\u012f\u0130\7k\2\2\u0130\u0131\7e\2\2\u0131b"+
		"\3\2\2\2\u0132\u0133\7r\2\2\u0133\u0134\7t\2\2\u0134\u0135\7k\2\2\u0135"+
		"\u0136\7x\2\2\u0136\u0137\7c\2\2\u0137\u0138\7v\2\2\u0138\u0139\7g\2\2"+
		"\u0139d\3\2\2\2\u013a\u013b\7r\2\2\u013b\u013c\7t\2\2\u013c\u013d\7q\2"+
		"\2\u013d\u013e\7v\2\2\u013e\u013f\7g\2\2\u013f\u0140\7e\2\2\u0140\u0141"+
		"\7v\2\2\u0141\u0142\7g\2\2\u0142\u0143\7f\2\2\u0143f\3\2\2\2\u0144\u0145"+
		"\7u\2\2\u0145\u0146\7v\2\2\u0146\u0147\7c\2\2\u0147\u0148\7v\2\2\u0148"+
		"\u0149\7k\2\2\u0149\u014a\7e\2\2\u014ah\3\2\2\2\u014b\u014c\t\2\2\2\u014c"+
		"j\3\2\2\2\u014d\u014f\t\3\2\2\u014e\u014d\3\2\2\2\u014fl\3\2\2\2\u0150"+
		"\u0153\5k\66\2\u0151\u0153\7a\2\2\u0152\u0150\3\2\2\2\u0152\u0151\3\2"+
		"\2\2\u0153\u0159\3\2\2\2\u0154\u0158\5k\66\2\u0155\u0158\7a\2\2\u0156"+
		"\u0158\5i\65\2\u0157\u0154\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0156\3\2"+
		"\2\2\u0158\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a"+
		"n\3\2\2\2\u015b\u0159\3\2\2\2\u015c\u015d\7}\2\2\u015dp\3\2\2\2\u015e"+
		"\u015f\7\177\2\2\u015fr\3\2\2\2\u0160\u0162\5i\65\2\u0161\u0160\3\2\2"+
		"\2\u0162\u0163\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164t"+
		"\3\2\2\2\u0165\u0167\5i\65\2\u0166\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168"+
		"\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016b\t\4"+
		"\2\2\u016bv\3\2\2\2\u016c\u016e\5i\65\2\u016d\u016c\3\2\2\2\u016e\u0171"+
		"\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0172\3\2\2\2\u0171"+
		"\u016f\3\2\2\2\u0172\u0174\5_\60\2\u0173\u0175\5i\65\2\u0174\u0173\3\2"+
		"\2\2\u0175\u0176\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177"+
		"x\3\2\2\2\u0178\u017a\5i\65\2\u0179\u0178\3\2\2\2\u017a\u017d\3\2\2\2"+
		"\u017b\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017e\3\2\2\2\u017d\u017b"+
		"\3\2\2\2\u017e\u0180\5_\60\2\u017f\u0181\5i\65\2\u0180\u017f\3\2\2\2\u0181"+
		"\u0182\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0184\3\2"+
		"\2\2\u0184\u0185\t\5\2\2\u0185z\3\2\2\2\u0186\u018b\7$\2\2\u0187\u018a"+
		"\5\177@\2\u0188\u018a\n\6\2\2\u0189\u0187\3\2\2\2\u0189\u0188\3\2\2\2"+
		"\u018a\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018e"+
		"\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u018f\7$\2\2\u018f|\3\2\2\2\u0190\u0191"+
		"\t\7\2\2\u0191~\3\2\2\2\u0192\u0193\7^\2\2\u0193\u0197\t\b\2\2\u0194\u0197"+
		"\5\u0083B\2\u0195\u0197\5\u0081A\2\u0196\u0192\3\2\2\2\u0196\u0194\3\2"+
		"\2\2\u0196\u0195\3\2\2\2\u0197\u0080\3\2\2\2\u0198\u0199\7^\2\2\u0199"+
		"\u019a\t\t\2\2\u019a\u019b\t\n\2\2\u019b\u01a2\t\n\2\2\u019c\u019d\7^"+
		"\2\2\u019d\u019e\t\n\2\2\u019e\u01a2\t\n\2\2\u019f\u01a0\7^\2\2\u01a0"+
		"\u01a2\t\n\2\2\u01a1\u0198\3\2\2\2\u01a1\u019c\3\2\2\2\u01a1\u019f\3\2"+
		"\2\2\u01a2\u0082\3\2\2\2\u01a3\u01a4\7^\2\2\u01a4\u01a5\7w\2\2\u01a5\u01a6"+
		"\5}?\2\u01a6\u01a7\5}?\2\u01a7\u01a8\5}?\2\u01a8\u01a9\5}?\2\u01a9\u0084"+
		"\3\2\2\2\u01aa\u01ac\t\13\2\2\u01ab\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2"+
		"\u01ad\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b0"+
		"\bC\2\2\u01b0\u0086\3\2\2\2\u01b1\u01b2\7\61\2\2\u01b2\u01b3\7\61\2\2"+
		"\u01b3\u01b7\3\2\2\2\u01b4\u01b6\n\f\2\2\u01b5\u01b4\3\2\2\2\u01b6\u01b9"+
		"\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01ba\3\2\2\2\u01b9"+
		"\u01b7\3\2\2\2\u01ba\u01bb\bD\3\2\u01bb\u0088\3\2\2\2\u01bc\u01bd\7\61"+
		"\2\2\u01bd\u01be\7,\2\2\u01be\u01c2\3\2\2\2\u01bf\u01c1\13\2\2\2\u01c0"+
		"\u01bf\3\2\2\2\u01c1\u01c4\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c2\u01c0\3\2"+
		"\2\2\u01c3\u01c5\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c5\u01c6\7,\2\2\u01c6"+
		"\u01c7\7\61\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9\bE\4\2\u01c9\u008a\3\2"+
		"\2\2\24\2\u014e\u0152\u0157\u0159\u0163\u0168\u016f\u0176\u017b\u0182"+
		"\u0189\u018b\u0196\u01a1\u01ad\u01b7\u01c2";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
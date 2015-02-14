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
		REPLACE_OP=18, KW_THIS_RESULT=19, KW_NEW=20, KW_TRY=21, KW_CATCH=22, KW_FINALLY=23, 
		KW_IF=24, KW_ELSE=25, KW_RETURN=26, KW_THROW=27, KW_CLASS=28, KW_TRUE=29, 
		KW_FALSE=30, KW_WHILE=31, WILD_CARD=32, SEMI_COLON=33, COLON=34, DOT=35, 
		ACC_MOD_PUBLIC=36, ACC_MOD_PRIVATE=37, ACC_MOD_PROTECTED=38, MOD_STATIC=39, 
		ID=40, OPEN_BRA=41, CLOSE_BRA=42, INTEGER=43, LONG=44, STRING=45, WS=46, 
		SINGLELINE_COMMENT=47, MULTI_LINE_COMMENT=48;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'...'", "','", "'('", "')'", "'^'", "'@'", "'$'", "'#'", "'+'", "'-'", 
		"MULT", "'/'", "'<'", "'<='", "'>'", "'>='", "'='", "'=>'", "'thisResult'", 
		"'new'", "'try'", "'catch'", "'finally'", "'if'", "'else'", "'return'", 
		"'throw'", "'class'", "'true'", "'false'", "'while'", "WILD_CARD", "';'", 
		"':'", "'.'", "'public'", "'private'", "'protected'", "'static'", "ID", 
		"'{'", "'}'", "INTEGER", "LONG", "STRING", "WS", "SINGLELINE_COMMENT", 
		"MULTI_LINE_COMMENT"
	};
	public static final String[] ruleNames = {
		"ELLIPSES", "COMMA", "OPEN_PAR", "CLOSE_PAR", "HAT", "AT", "DOLLAR", "HASH", 
		"PLUS", "MINUS", "MULT", "DIV", "LT", "LTE", "GT", "GTE", "ASSIGN_OP", 
		"REPLACE_OP", "KW_THIS_RESULT", "KW_NEW", "KW_TRY", "KW_CATCH", "KW_FINALLY", 
		"KW_IF", "KW_ELSE", "KW_RETURN", "KW_THROW", "KW_CLASS", "KW_TRUE", "KW_FALSE", 
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
		case 51: WS_action((RuleContext)_localctx, actionIndex); break;

		case 52: SINGLELINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 53: MULTI_LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\62\u0172\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3"+
		"\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3%"+
		"\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3*\5*\u0111\n*\3+\3+\5+\u0115\n+\3+\3"+
		"+\3+\7+\u011a\n+\f+\16+\u011d\13+\3,\3,\3-\3-\3.\6.\u0124\n.\r.\16.\u0125"+
		"\3/\6/\u0129\n/\r/\16/\u012a\3/\3/\3\60\3\60\3\60\7\60\u0132\n\60\f\60"+
		"\16\60\u0135\13\60\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\62\5\62\u013f"+
		"\n\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u014a\n\63\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\65\6\65\u0154\n\65\r\65\16\65\u0155\3"+
		"\65\3\65\3\66\3\66\3\66\3\66\7\66\u015e\n\66\f\66\16\66\u0161\13\66\3"+
		"\66\3\66\3\67\3\67\3\67\3\67\7\67\u0169\n\67\f\67\16\67\u016c\13\67\3"+
		"\67\3\67\3\67\3\67\3\67\3\u016a8\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1"+
		"\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!"+
		"\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34"+
		"\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\1K\'\1M(\1O)\1Q\2\1"+
		"S\2\1U*\1W+\1Y,\1[-\1].\1_/\1a\2\1c\2\1e\2\1g\2\1i\60\2k\61\3m\62\4\3"+
		"\2\13\3\2\62;\4\2C\\c|\4\2$$^^\5\2\62;CHch\n\2$$))^^ddhhppttvv\3\2\62"+
		"\65\3\2\629\5\2\13\f\17\17\"\"\4\2\f\f\17\17\u017a\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2"+
		"]\3\2\2\2\2_\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\3o\3\2\2\2\5s\3"+
		"\2\2\2\7u\3\2\2\2\tw\3\2\2\2\13y\3\2\2\2\r{\3\2\2\2\17}\3\2\2\2\21\177"+
		"\3\2\2\2\23\u0081\3\2\2\2\25\u0083\3\2\2\2\27\u0085\3\2\2\2\31\u0087\3"+
		"\2\2\2\33\u0089\3\2\2\2\35\u008b\3\2\2\2\37\u008e\3\2\2\2!\u0090\3\2\2"+
		"\2#\u0093\3\2\2\2%\u0095\3\2\2\2\'\u0098\3\2\2\2)\u00a3\3\2\2\2+\u00a7"+
		"\3\2\2\2-\u00ab\3\2\2\2/\u00b1\3\2\2\2\61\u00b9\3\2\2\2\63\u00bc\3\2\2"+
		"\2\65\u00c1\3\2\2\2\67\u00c8\3\2\2\29\u00ce\3\2\2\2;\u00d4\3\2\2\2=\u00d9"+
		"\3\2\2\2?\u00df\3\2\2\2A\u00e5\3\2\2\2C\u00e7\3\2\2\2E\u00e9\3\2\2\2G"+
		"\u00eb\3\2\2\2I\u00ed\3\2\2\2K\u00f4\3\2\2\2M\u00fc\3\2\2\2O\u0106\3\2"+
		"\2\2Q\u010d\3\2\2\2S\u0110\3\2\2\2U\u0114\3\2\2\2W\u011e\3\2\2\2Y\u0120"+
		"\3\2\2\2[\u0123\3\2\2\2]\u0128\3\2\2\2_\u012e\3\2\2\2a\u0138\3\2\2\2c"+
		"\u013e\3\2\2\2e\u0149\3\2\2\2g\u014b\3\2\2\2i\u0153\3\2\2\2k\u0159\3\2"+
		"\2\2m\u0164\3\2\2\2op\7\60\2\2pq\7\60\2\2qr\7\60\2\2r\4\3\2\2\2st\7.\2"+
		"\2t\6\3\2\2\2uv\7*\2\2v\b\3\2\2\2wx\7+\2\2x\n\3\2\2\2yz\7`\2\2z\f\3\2"+
		"\2\2{|\7B\2\2|\16\3\2\2\2}~\7&\2\2~\20\3\2\2\2\177\u0080\7%\2\2\u0080"+
		"\22\3\2\2\2\u0081\u0082\7-\2\2\u0082\24\3\2\2\2\u0083\u0084\7/\2\2\u0084"+
		"\26\3\2\2\2\u0085\u0086\7,\2\2\u0086\30\3\2\2\2\u0087\u0088\7\61\2\2\u0088"+
		"\32\3\2\2\2\u0089\u008a\7>\2\2\u008a\34\3\2\2\2\u008b\u008c\7>\2\2\u008c"+
		"\u008d\7?\2\2\u008d\36\3\2\2\2\u008e\u008f\7@\2\2\u008f \3\2\2\2\u0090"+
		"\u0091\7@\2\2\u0091\u0092\7?\2\2\u0092\"\3\2\2\2\u0093\u0094\7?\2\2\u0094"+
		"$\3\2\2\2\u0095\u0096\7?\2\2\u0096\u0097\7@\2\2\u0097&\3\2\2\2\u0098\u0099"+
		"\7v\2\2\u0099\u009a\7j\2\2\u009a\u009b\7k\2\2\u009b\u009c\7u\2\2\u009c"+
		"\u009d\7T\2\2\u009d\u009e\7g\2\2\u009e\u009f\7u\2\2\u009f\u00a0\7w\2\2"+
		"\u00a0\u00a1\7n\2\2\u00a1\u00a2\7v\2\2\u00a2(\3\2\2\2\u00a3\u00a4\7p\2"+
		"\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7y\2\2\u00a6*\3\2\2\2\u00a7\u00a8\7"+
		"v\2\2\u00a8\u00a9\7t\2\2\u00a9\u00aa\7{\2\2\u00aa,\3\2\2\2\u00ab\u00ac"+
		"\7e\2\2\u00ac\u00ad\7c\2\2\u00ad\u00ae\7v\2\2\u00ae\u00af\7e\2\2\u00af"+
		"\u00b0\7j\2\2\u00b0.\3\2\2\2\u00b1\u00b2\7h\2\2\u00b2\u00b3\7k\2\2\u00b3"+
		"\u00b4\7p\2\2\u00b4\u00b5\7c\2\2\u00b5\u00b6\7n\2\2\u00b6\u00b7\7n\2\2"+
		"\u00b7\u00b8\7{\2\2\u00b8\60\3\2\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb\7"+
		"h\2\2\u00bb\62\3\2\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be\7n\2\2\u00be\u00bf"+
		"\7u\2\2\u00bf\u00c0\7g\2\2\u00c0\64\3\2\2\2\u00c1\u00c2\7t\2\2\u00c2\u00c3"+
		"\7g\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5\7w\2\2\u00c5\u00c6\7t\2\2\u00c6"+
		"\u00c7\7p\2\2\u00c7\66\3\2\2\2\u00c8\u00c9\7v\2\2\u00c9\u00ca\7j\2\2\u00ca"+
		"\u00cb\7t\2\2\u00cb\u00cc\7q\2\2\u00cc\u00cd\7y\2\2\u00cd8\3\2\2\2\u00ce"+
		"\u00cf\7e\2\2\u00cf\u00d0\7n\2\2\u00d0\u00d1\7c\2\2\u00d1\u00d2\7u\2\2"+
		"\u00d2\u00d3\7u\2\2\u00d3:\3\2\2\2\u00d4\u00d5\7v\2\2\u00d5\u00d6\7t\2"+
		"\2\u00d6\u00d7\7w\2\2\u00d7\u00d8\7g\2\2\u00d8<\3\2\2\2\u00d9\u00da\7"+
		"h\2\2\u00da\u00db\7c\2\2\u00db\u00dc\7n\2\2\u00dc\u00dd\7u\2\2\u00dd\u00de"+
		"\7g\2\2\u00de>\3\2\2\2\u00df\u00e0\7y\2\2\u00e0\u00e1\7j\2\2\u00e1\u00e2"+
		"\7k\2\2\u00e2\u00e3\7n\2\2\u00e3\u00e4\7g\2\2\u00e4@\3\2\2\2\u00e5\u00e6"+
		"\7,\2\2\u00e6B\3\2\2\2\u00e7\u00e8\7=\2\2\u00e8D\3\2\2\2\u00e9\u00ea\7"+
		"<\2\2\u00eaF\3\2\2\2\u00eb\u00ec\7\60\2\2\u00ecH\3\2\2\2\u00ed\u00ee\7"+
		"r\2\2\u00ee\u00ef\7w\2\2\u00ef\u00f0\7d\2\2\u00f0\u00f1\7n\2\2\u00f1\u00f2"+
		"\7k\2\2\u00f2\u00f3\7e\2\2\u00f3J\3\2\2\2\u00f4\u00f5\7r\2\2\u00f5\u00f6"+
		"\7t\2\2\u00f6\u00f7\7k\2\2\u00f7\u00f8\7x\2\2\u00f8\u00f9\7c\2\2\u00f9"+
		"\u00fa\7v\2\2\u00fa\u00fb\7g\2\2\u00fbL\3\2\2\2\u00fc\u00fd\7r\2\2\u00fd"+
		"\u00fe\7t\2\2\u00fe\u00ff\7q\2\2\u00ff\u0100\7v\2\2\u0100\u0101\7g\2\2"+
		"\u0101\u0102\7e\2\2\u0102\u0103\7v\2\2\u0103\u0104\7g\2\2\u0104\u0105"+
		"\7f\2\2\u0105N\3\2\2\2\u0106\u0107\7u\2\2\u0107\u0108\7v\2\2\u0108\u0109"+
		"\7c\2\2\u0109\u010a\7v\2\2\u010a\u010b\7k\2\2\u010b\u010c\7e\2\2\u010c"+
		"P\3\2\2\2\u010d\u010e\t\2\2\2\u010eR\3\2\2\2\u010f\u0111\t\3\2\2\u0110"+
		"\u010f\3\2\2\2\u0111T\3\2\2\2\u0112\u0115\5S*\2\u0113\u0115\7a\2\2\u0114"+
		"\u0112\3\2\2\2\u0114\u0113\3\2\2\2\u0115\u011b\3\2\2\2\u0116\u011a\5S"+
		"*\2\u0117\u011a\7a\2\2\u0118\u011a\5Q)\2\u0119\u0116\3\2\2\2\u0119\u0117"+
		"\3\2\2\2\u0119\u0118\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b"+
		"\u011c\3\2\2\2\u011cV\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u011f\7}\2\2\u011f"+
		"X\3\2\2\2\u0120\u0121\7\177\2\2\u0121Z\3\2\2\2\u0122\u0124\5Q)\2\u0123"+
		"\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2"+
		"\2\2\u0126\\\3\2\2\2\u0127\u0129\5Q)\2\u0128\u0127\3\2\2\2\u0129\u012a"+
		"\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\3\2\2\2\u012c"+
		"\u012d\7N\2\2\u012d^\3\2\2\2\u012e\u0133\7$\2\2\u012f\u0132\5c\62\2\u0130"+
		"\u0132\n\4\2\2\u0131\u012f\3\2\2\2\u0131\u0130\3\2\2\2\u0132\u0135\3\2"+
		"\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0136\3\2\2\2\u0135"+
		"\u0133\3\2\2\2\u0136\u0137\7$\2\2\u0137`\3\2\2\2\u0138\u0139\t\5\2\2\u0139"+
		"b\3\2\2\2\u013a\u013b\7^\2\2\u013b\u013f\t\6\2\2\u013c\u013f\5g\64\2\u013d"+
		"\u013f\5e\63\2\u013e\u013a\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013d\3\2"+
		"\2\2\u013fd\3\2\2\2\u0140\u0141\7^\2\2\u0141\u0142\t\7\2\2\u0142\u0143"+
		"\t\b\2\2\u0143\u014a\t\b\2\2\u0144\u0145\7^\2\2\u0145\u0146\t\b\2\2\u0146"+
		"\u014a\t\b\2\2\u0147\u0148\7^\2\2\u0148\u014a\t\b\2\2\u0149\u0140\3\2"+
		"\2\2\u0149\u0144\3\2\2\2\u0149\u0147\3\2\2\2\u014af\3\2\2\2\u014b\u014c"+
		"\7^\2\2\u014c\u014d\7w\2\2\u014d\u014e\5a\61\2\u014e\u014f\5a\61\2\u014f"+
		"\u0150\5a\61\2\u0150\u0151\5a\61\2\u0151h\3\2\2\2\u0152\u0154\t\t\2\2"+
		"\u0153\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156"+
		"\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0158\b\65\2\2\u0158j\3\2\2\2\u0159"+
		"\u015a\7\61\2\2\u015a\u015b\7\61\2\2\u015b\u015f\3\2\2\2\u015c\u015e\n"+
		"\n\2\2\u015d\u015c\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3\2\2\2\u015f"+
		"\u0160\3\2\2\2\u0160\u0162\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0163\b\66"+
		"\3\2\u0163l\3\2\2\2\u0164\u0165\7\61\2\2\u0165\u0166\7,\2\2\u0166\u016a"+
		"\3\2\2\2\u0167\u0169\13\2\2\2\u0168\u0167\3\2\2\2\u0169\u016c\3\2\2\2"+
		"\u016a\u016b\3\2\2\2\u016a\u0168\3\2\2\2\u016b\u016d\3\2\2\2\u016c\u016a"+
		"\3\2\2\2\u016d\u016e\7,\2\2\u016e\u016f\7\61\2\2\u016f\u0170\3\2\2\2\u0170"+
		"\u0171\b\67\4\2\u0171n\3\2\2\2\20\2\u0110\u0114\u0119\u011b\u0125\u012a"+
		"\u0131\u0133\u013e\u0149\u0155\u015f\u016a";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
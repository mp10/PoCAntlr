// Generated from Test.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TestLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, MAIN=2, UPPERCASE=3, LOWERCASE=4, NUMBERS=5, NEWLINE=6, ALPHANUMERIC=7, 
		WS=8;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "MAIN", "UPPERCASE", "LOWERCASE", "NUMBERS", "NEWLINE", "ALPHANUMERIC", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'TestType:'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "MAIN", "UPPERCASE", "LOWERCASE", "NUMBERS", "NEWLINE", "ALPHANUMERIC", 
		"WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public TestLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Test.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\nB\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\7\3 \n\3\f\3\16\3#\13\3\5\3%\n\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\6\7\61\n\7\r\7\16\7\62\3\b\3\b\3"+
		"\b\6\b8\n\b\r\b\16\b9\3\t\6\t=\n\t\r\t\16\t>\3\t\3\t\2\2\n\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\3\2\7\3\2C\\\3\2c|\3\2\62;\4\2\f\f\17\17\3\2\13"+
		"\13H\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r"+
		"\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\3\23\3\2\2\2\5$\3\2\2\2\7)\3\2\2\2"+
		"\t+\3\2\2\2\13-\3\2\2\2\r\60\3\2\2\2\17\67\3\2\2\2\21<\3\2\2\2\23\24\7"+
		"V\2\2\24\25\7g\2\2\25\26\7u\2\2\26\27\7v\2\2\27\30\7V\2\2\30\31\7{\2\2"+
		"\31\32\7r\2\2\32\33\7g\2\2\33\34\7<\2\2\34\4\3\2\2\2\35%\5\17\b\2\36 "+
		"\7a\2\2\37\36\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"%\3\2\2\2#!\3"+
		"\2\2\2$\35\3\2\2\2$!\3\2\2\2%&\3\2\2\2&\'\7*\2\2\'(\7+\2\2(\6\3\2\2\2"+
		")*\t\2\2\2*\b\3\2\2\2+,\t\3\2\2,\n\3\2\2\2-.\t\4\2\2.\f\3\2\2\2/\61\t"+
		"\5\2\2\60/\3\2\2\2\61\62\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\16\3\2"+
		"\2\2\648\5\t\5\2\658\5\7\4\2\668\5\13\6\2\67\64\3\2\2\2\67\65\3\2\2\2"+
		"\67\66\3\2\2\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:\20\3\2\2\2;=\t\6\2\2<"+
		";\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?@\3\2\2\2@A\b\t\2\2A\22\3\2\2"+
		"\2\t\2!$\62\679>\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
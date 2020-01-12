package com.jfk.assembler;// Generated from C:/Users/lgorczynski98/OneDrive - Wojskowa Akademia Techniczna/Materialy_FTP/Semestr 5/JFK/insterpreterAssemblera/assemblyInterpreter\g.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, INT=8, PUSH=9, 
		MOV=10, XOR=11, NUMBER=12, REGISTER=13, WS=14, IDENTIFIER=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "INT", "PUSH", 
			"MOV", "XOR", "NUMBER", "REGISTER", "WS", "IDENTIFIER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\n'", "','", "'+'", "'-'", "'*'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "INT", "PUSH", "MOV", 
			"XOR", "NUMBER", "REGISTER", "WS", "IDENTIFIER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public gLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "g.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21e\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\6\rJ\n\r\r\r\16\rK\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16^\n\16\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\2\2\21\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21\3\2\4\3\2\62;\5\2\13\13\17\17\"\"\2h\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5#\3\2\2\2\7%\3\2\2\2"+
		"\t\'\3\2\2\2\13)\3\2\2\2\r+\3\2\2\2\17-\3\2\2\2\21/\3\2\2\2\238\3\2\2"+
		"\2\25>\3\2\2\2\27C\3\2\2\2\31I\3\2\2\2\33]\3\2\2\2\35_\3\2\2\2\37c\3\2"+
		"\2\2!\"\7\f\2\2\"\4\3\2\2\2#$\7.\2\2$\6\3\2\2\2%&\7-\2\2&\b\3\2\2\2\'"+
		"(\7/\2\2(\n\3\2\2\2)*\7,\2\2*\f\3\2\2\2+,\7*\2\2,\16\3\2\2\2-.\7+\2\2"+
		".\20\3\2\2\2/\60\7k\2\2\60\61\7p\2\2\61\62\7v\2\2\62\63\7\"\2\2\63\64"+
		"\7\62\2\2\64\65\7z\2\2\65\66\7:\2\2\66\67\7\62\2\2\67\22\3\2\2\289\7r"+
		"\2\29:\7w\2\2:;\7u\2\2;<\7j\2\2<=\7\"\2\2=\24\3\2\2\2>?\7o\2\2?@\7q\2"+
		"\2@A\7x\2\2AB\7\"\2\2B\26\3\2\2\2CD\7z\2\2DE\7q\2\2EF\7t\2\2FG\7\"\2\2"+
		"G\30\3\2\2\2HJ\t\2\2\2IH\3\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\32\3\2"+
		"\2\2MN\7\'\2\2NO\7g\2\2OP\7c\2\2P^\7z\2\2QR\7\'\2\2RS\7g\2\2ST\7d\2\2"+
		"T^\7z\2\2UV\7\'\2\2VW\7g\2\2WX\7e\2\2X^\7z\2\2YZ\7\'\2\2Z[\7g\2\2[\\\7"+
		"f\2\2\\^\7z\2\2]M\3\2\2\2]Q\3\2\2\2]U\3\2\2\2]Y\3\2\2\2^\34\3\2\2\2_`"+
		"\t\3\2\2`a\3\2\2\2ab\b\17\2\2b\36\3\2\2\2cd\13\2\2\2d \3\2\2\2\5\2K]\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
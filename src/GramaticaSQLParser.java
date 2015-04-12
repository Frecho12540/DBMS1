// Generated from GramaticaSQL.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaSQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, CREATE=8, DATABASE=9, 
		DATABASES=10, ALTER=11, DROP=12, SHOW=13, USE=14, CHECK=15, CONSTRAINT=16, 
		PRIMARY=17, FOREIGN=18, KEY=19, REFERENCES=20, INT=21, FLOAT=22, DATE=23, 
		CHAR=24, AND=25, OR=26, NOT=27, TABLE=28, TABLES=29, RENAME=30, TO=31, 
		ADD=32, COLUMN=33, COLUMNS=34, INSERT=35, INTO=36, VALUES=37, NULL=38, 
		UPDATE=39, SET=40, WHERE=41, DELETE=42, SELECT=43, FROM=44, ORDER=45, 
		BY=46, ASC=47, DESC=48, NUM=49, ID=50, LOGICAL=51, COMMENTS=52, WS=53;
	public static final String[] tokenNames = {
		"<INVALID>", "'_'", "'('", "')'", "'*'", "';'", "','", "'='", "CREATE", 
		"DATABASE", "DATABASES", "ALTER", "DROP", "SHOW", "USE", "CHECK", "CONSTRAINT", 
		"PRIMARY", "FOREIGN", "KEY", "REFERENCES", "INT", "FLOAT", "DATE", "CHAR", 
		"AND", "OR", "NOT", "TABLE", "TABLES", "RENAME", "TO", "ADD", "COLUMN", 
		"COLUMNS", "INSERT", "INTO", "VALUES", "NULL", "UPDATE", "SET", "WHERE", 
		"DELETE", "SELECT", "FROM", "ORDER", "BY", "ASC", "DESC", "NUM", "ID", 
		"LOGICAL", "COMMENTS", "WS"
	};
	public static final int
		RULE_principal = 0, RULE_statements = 1, RULE_statementDatabase = 2, RULE_createDatabase = 3, 
		RULE_alterDatabase = 4, RULE_dropDatabase = 5, RULE_showDatabases = 6, 
		RULE_useDatabase = 7, RULE_createTable = 8, RULE_tipoId = 9, RULE_cKey = 10, 
		RULE_booleanExpression = 11, RULE_or = 12, RULE_and = 13, RULE_not = 14, 
		RULE_atom = 15, RULE_statementTable = 16, RULE_alterTable = 17, RULE_renameTable = 18, 
		RULE_actionTable = 19, RULE_addColumn = 20, RULE_addConstraint = 21, RULE_dropColumn = 22, 
		RULE_dropConstraint = 23, RULE_showTables = 24, RULE_dropTable = 25, RULE_showColumnsFrom = 26, 
		RULE_statementData = 27, RULE_insert = 28, RULE_update = 29, RULE_delete = 30, 
		RULE_select = 31, RULE_condicion = 32, RULE_extra = 33;
	public static final String[] ruleNames = {
		"principal", "statements", "statementDatabase", "createDatabase", "alterDatabase", 
		"dropDatabase", "showDatabases", "useDatabase", "createTable", "tipoId", 
		"cKey", "booleanExpression", "or", "and", "not", "atom", "statementTable", 
		"alterTable", "renameTable", "actionTable", "addColumn", "addConstraint", 
		"dropColumn", "dropConstraint", "showTables", "dropTable", "showColumnsFrom", 
		"statementData", "insert", "update", "delete", "select", "condicion", 
		"extra"
	};

	@Override
	public String getGrammarFileName() { return "GramaticaSQL.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GramaticaSQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PrincipalContext extends ParserRuleContext {
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public PrincipalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_principal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterPrincipal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitPrincipal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitPrincipal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrincipalContext principal() throws RecognitionException {
		PrincipalContext _localctx = new PrincipalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_principal);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(68); statements();
			setState(73);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(69); match(T__2);
					setState(70); statements();
					}
					} 
				}
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(77);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(76); match(T__2);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	 
		public StatementsContext() { }
		public void copyFrom(StatementsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StmtPrincipalDBContext extends StatementsContext {
		public StatementDatabaseContext statementDatabase() {
			return getRuleContext(StatementDatabaseContext.class,0);
		}
		public StmtPrincipalDBContext(StatementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterStmtPrincipalDB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitStmtPrincipalDB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitStmtPrincipalDB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtPrincipalDataContext extends StatementsContext {
		public StatementDataContext statementData() {
			return getRuleContext(StatementDataContext.class,0);
		}
		public StmtPrincipalDataContext(StatementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterStmtPrincipalData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitStmtPrincipalData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitStmtPrincipalData(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtPrincipalTableContext extends StatementsContext {
		public StatementTableContext statementTable() {
			return getRuleContext(StatementTableContext.class,0);
		}
		public StmtPrincipalTableContext(StatementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterStmtPrincipalTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitStmtPrincipalTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitStmtPrincipalTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		try {
			setState(82);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new StmtPrincipalDBContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(79); statementDatabase();
				}
				break;
			case 2:
				_localctx = new StmtPrincipalTableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(80); statementTable();
				}
				break;
			case 3:
				_localctx = new StmtPrincipalDataContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(81); statementData();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementDatabaseContext extends ParserRuleContext {
		public StatementDatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementDatabase; }
	 
		public StatementDatabaseContext() { }
		public void copyFrom(StatementDatabaseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StmtShowDBContext extends StatementDatabaseContext {
		public ShowDatabasesContext showDatabases() {
			return getRuleContext(ShowDatabasesContext.class,0);
		}
		public StmtShowDBContext(StatementDatabaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterStmtShowDB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitStmtShowDB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitStmtShowDB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtDropDBContext extends StatementDatabaseContext {
		public DropDatabaseContext dropDatabase() {
			return getRuleContext(DropDatabaseContext.class,0);
		}
		public StmtDropDBContext(StatementDatabaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterStmtDropDB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitStmtDropDB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitStmtDropDB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtCreateDBContext extends StatementDatabaseContext {
		public CreateDatabaseContext createDatabase() {
			return getRuleContext(CreateDatabaseContext.class,0);
		}
		public StmtCreateDBContext(StatementDatabaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterStmtCreateDB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitStmtCreateDB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitStmtCreateDB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtAlterDBContext extends StatementDatabaseContext {
		public AlterDatabaseContext alterDatabase() {
			return getRuleContext(AlterDatabaseContext.class,0);
		}
		public StmtAlterDBContext(StatementDatabaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterStmtAlterDB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitStmtAlterDB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitStmtAlterDB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtUseDBContext extends StatementDatabaseContext {
		public UseDatabaseContext useDatabase() {
			return getRuleContext(UseDatabaseContext.class,0);
		}
		public StmtUseDBContext(StatementDatabaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterStmtUseDB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitStmtUseDB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitStmtUseDB(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementDatabaseContext statementDatabase() throws RecognitionException {
		StatementDatabaseContext _localctx = new StatementDatabaseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statementDatabase);
		try {
			setState(89);
			switch (_input.LA(1)) {
			case CREATE:
				_localctx = new StmtCreateDBContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(84); createDatabase();
				}
				break;
			case ALTER:
				_localctx = new StmtAlterDBContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(85); alterDatabase();
				}
				break;
			case DROP:
				_localctx = new StmtDropDBContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(86); dropDatabase();
				}
				break;
			case USE:
				_localctx = new StmtUseDBContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(87); useDatabase();
				}
				break;
			case SHOW:
				_localctx = new StmtShowDBContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(88); showDatabases();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateDatabaseContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaSQLParser.ID, 0); }
		public TerminalNode DATABASE() { return getToken(GramaticaSQLParser.DATABASE, 0); }
		public TerminalNode CREATE() { return getToken(GramaticaSQLParser.CREATE, 0); }
		public CreateDatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDatabase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterCreateDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitCreateDatabase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitCreateDatabase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateDatabaseContext createDatabase() throws RecognitionException {
		CreateDatabaseContext _localctx = new CreateDatabaseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_createDatabase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91); match(CREATE);
			setState(92); match(DATABASE);
			setState(93); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterDatabaseContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(GramaticaSQLParser.RENAME, 0); }
		public List<TerminalNode> ID() { return getTokens(GramaticaSQLParser.ID); }
		public TerminalNode DATABASE() { return getToken(GramaticaSQLParser.DATABASE, 0); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaSQLParser.ID, i);
		}
		public TerminalNode TO() { return getToken(GramaticaSQLParser.TO, 0); }
		public TerminalNode ALTER() { return getToken(GramaticaSQLParser.ALTER, 0); }
		public AlterDatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterDatabase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterAlterDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitAlterDatabase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitAlterDatabase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterDatabaseContext alterDatabase() throws RecognitionException {
		AlterDatabaseContext _localctx = new AlterDatabaseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_alterDatabase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95); match(ALTER);
			setState(96); match(DATABASE);
			setState(97); match(ID);
			setState(98); match(RENAME);
			setState(99); match(TO);
			setState(100); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropDatabaseContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaSQLParser.ID, 0); }
		public TerminalNode DATABASE() { return getToken(GramaticaSQLParser.DATABASE, 0); }
		public TerminalNode DROP() { return getToken(GramaticaSQLParser.DROP, 0); }
		public DropDatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropDatabase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterDropDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitDropDatabase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitDropDatabase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropDatabaseContext dropDatabase() throws RecognitionException {
		DropDatabaseContext _localctx = new DropDatabaseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dropDatabase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102); match(DROP);
			setState(103); match(DATABASE);
			setState(104); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowDatabasesContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(GramaticaSQLParser.SHOW, 0); }
		public TerminalNode ID() { return getToken(GramaticaSQLParser.ID, 0); }
		public TerminalNode DATABASES() { return getToken(GramaticaSQLParser.DATABASES, 0); }
		public ShowDatabasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showDatabases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterShowDatabases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitShowDatabases(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitShowDatabases(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowDatabasesContext showDatabases() throws RecognitionException {
		ShowDatabasesContext _localctx = new ShowDatabasesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_showDatabases);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106); match(SHOW);
			setState(107); match(DATABASES);
			setState(108); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UseDatabaseContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaSQLParser.ID, 0); }
		public TerminalNode DATABASE() { return getToken(GramaticaSQLParser.DATABASE, 0); }
		public TerminalNode USE() { return getToken(GramaticaSQLParser.USE, 0); }
		public UseDatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useDatabase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterUseDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitUseDatabase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitUseDatabase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseDatabaseContext useDatabase() throws RecognitionException {
		UseDatabaseContext _localctx = new UseDatabaseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_useDatabase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110); match(USE);
			setState(111); match(DATABASE);
			setState(112); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateTableContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GramaticaSQLParser.ID); }
		public List<TipoIdContext> tipoId() {
			return getRuleContexts(TipoIdContext.class);
		}
		public TerminalNode CONSTRAINT() { return getToken(GramaticaSQLParser.CONSTRAINT, 0); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaSQLParser.ID, i);
		}
		public CKeyContext cKey() {
			return getRuleContext(CKeyContext.class,0);
		}
		public TerminalNode CREATE() { return getToken(GramaticaSQLParser.CREATE, 0); }
		public TipoIdContext tipoId(int i) {
			return getRuleContext(TipoIdContext.class,i);
		}
		public TerminalNode TABLE() { return getToken(GramaticaSQLParser.TABLE, 0); }
		public CreateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableContext createTable() throws RecognitionException {
		CreateTableContext _localctx = new CreateTableContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_createTable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(114); match(CREATE);
			setState(115); match(TABLE);
			setState(116); match(ID);
			setState(117); match(T__5);
			setState(124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(118); match(ID);
					setState(119); tipoId();
					setState(120); match(T__1);
					}
					} 
				}
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(127); match(ID);
			setState(128); tipoId();
			setState(129); match(CONSTRAINT);
			setState(130); cKey();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoIdContext extends ParserRuleContext {
		public TipoIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoId; }
	 
		public TipoIdContext() { }
		public void copyFrom(TipoIdContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TipoIdFloatContext extends TipoIdContext {
		public TerminalNode FLOAT() { return getToken(GramaticaSQLParser.FLOAT, 0); }
		public TipoIdFloatContext(TipoIdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterTipoIdFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitTipoIdFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitTipoIdFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TipoIdIntContext extends TipoIdContext {
		public TerminalNode INT() { return getToken(GramaticaSQLParser.INT, 0); }
		public TipoIdIntContext(TipoIdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterTipoIdInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitTipoIdInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitTipoIdInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TipoIdCharContext extends TipoIdContext {
		public TerminalNode NUM() { return getToken(GramaticaSQLParser.NUM, 0); }
		public TerminalNode CHAR() { return getToken(GramaticaSQLParser.CHAR, 0); }
		public TipoIdCharContext(TipoIdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterTipoIdChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitTipoIdChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitTipoIdChar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TipoIdDateContext extends TipoIdContext {
		public TerminalNode DATE() { return getToken(GramaticaSQLParser.DATE, 0); }
		public TipoIdDateContext(TipoIdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterTipoIdDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitTipoIdDate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitTipoIdDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoIdContext tipoId() throws RecognitionException {
		TipoIdContext _localctx = new TipoIdContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tipoId);
		try {
			setState(139);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new TipoIdIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(132); match(INT);
				}
				break;
			case FLOAT:
				_localctx = new TipoIdFloatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(133); match(FLOAT);
				}
				break;
			case DATE:
				_localctx = new TipoIdDateContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(134); match(DATE);
				}
				break;
			case CHAR:
				_localctx = new TipoIdCharContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(135); match(CHAR);
				setState(136); match(T__5);
				setState(137); match(NUM);
				setState(138); match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CKeyContext extends ParserRuleContext {
		public CKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cKey; }
	 
		public CKeyContext() { }
		public void copyFrom(CKeyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CKeyFKContext extends CKeyContext {
		public TerminalNode KEY() { return getToken(GramaticaSQLParser.KEY, 0); }
		public List<TerminalNode> ID() { return getTokens(GramaticaSQLParser.ID); }
		public TerminalNode REFERENCES() { return getToken(GramaticaSQLParser.REFERENCES, 0); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaSQLParser.ID, i);
		}
		public TerminalNode FOREIGN() { return getToken(GramaticaSQLParser.FOREIGN, 0); }
		public CKeyFKContext(CKeyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterCKeyFK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitCKeyFK(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitCKeyFK(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CKeyCHKContext extends CKeyContext {
		public TerminalNode CHECK() { return getToken(GramaticaSQLParser.CHECK, 0); }
		public TerminalNode ID() { return getToken(GramaticaSQLParser.ID, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public CKeyCHKContext(CKeyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterCKeyCHK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitCKeyCHK(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitCKeyCHK(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CKeyPKContext extends CKeyContext {
		public TerminalNode PRIMARY() { return getToken(GramaticaSQLParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(GramaticaSQLParser.KEY, 0); }
		public List<TerminalNode> ID() { return getTokens(GramaticaSQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaSQLParser.ID, i);
		}
		public CKeyPKContext(CKeyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterCKeyPK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitCKeyPK(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitCKeyPK(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CKeyContext cKey() throws RecognitionException {
		CKeyContext _localctx = new CKeyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cKey);
		try {
			int _alt;
			setState(185);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new CKeyPKContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(141); match(ID);
				setState(142); match(PRIMARY);
				setState(143); match(KEY);
				setState(144); match(T__5);
				setState(149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(145); match(ID);
						setState(146); match(T__1);
						}
						} 
					}
					setState(151);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				setState(152); match(ID);
				setState(153); match(T__4);
				}
				break;
			case 2:
				_localctx = new CKeyFKContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(154); match(ID);
				setState(155); match(FOREIGN);
				setState(156); match(KEY);
				setState(157); match(T__5);
				setState(162);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(158); match(ID);
						setState(159); match(T__1);
						}
						} 
					}
					setState(164);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(165); match(ID);
				setState(166); match(T__4);
				setState(167); match(REFERENCES);
				setState(168); match(ID);
				setState(169); match(T__5);
				setState(174);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(170); match(ID);
						setState(171); match(T__1);
						}
						} 
					}
					setState(176);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				setState(177); match(ID);
				setState(178); match(T__4);
				}
				break;
			case 3:
				_localctx = new CKeyCHKContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(179); match(ID);
				setState(180); match(CHECK);
				setState(181); match(T__5);
				setState(182); atom();
				setState(183); match(T__4);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanExpressionContext extends ParserRuleContext {
		public OrContext or() {
			return getRuleContext(OrContext.class,0);
		}
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterBooleanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitBooleanExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitBooleanExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_booleanExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187); or();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrContext extends ParserRuleContext {
		public List<TerminalNode> OR() { return getTokens(GramaticaSQLParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(GramaticaSQLParser.OR, i);
		}
		public AndContext and(int i) {
			return getRuleContext(AndContext.class,i);
		}
		public List<AndContext> and() {
			return getRuleContexts(AndContext.class);
		}
		public OrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrContext or() throws RecognitionException {
		OrContext _localctx = new OrContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_or);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189); and();
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(190); match(OR);
				setState(191); and();
				}
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndContext extends ParserRuleContext {
		public TerminalNode AND(int i) {
			return getToken(GramaticaSQLParser.AND, i);
		}
		public NotContext not(int i) {
			return getRuleContext(NotContext.class,i);
		}
		public List<NotContext> not() {
			return getRuleContexts(NotContext.class);
		}
		public List<TerminalNode> AND() { return getTokens(GramaticaSQLParser.AND); }
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_and);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197); not();
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(198); match(AND);
				setState(199); not();
				}
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotContext extends ParserRuleContext {
		public NotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not; }
	 
		public NotContext() { }
		public void copyFrom(NotContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NotNotAtomContext extends NotContext {
		public TerminalNode NOT() { return getToken(GramaticaSQLParser.NOT, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public NotNotAtomContext(NotContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterNotNotAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitNotNotAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitNotNotAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotAtomContext extends NotContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public NotAtomContext(NotContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterNotAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitNotAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitNotAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotContext not() throws RecognitionException {
		NotContext _localctx = new NotContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_not);
		try {
			setState(208);
			switch (_input.LA(1)) {
			case NOT:
				_localctx = new NotNotAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(205); match(NOT);
				setState(206); atom();
				}
				break;
			case T__5:
			case ID:
				_localctx = new NotAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(207); atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AtomIDContext extends AtomContext {
		public TerminalNode ID() { return getToken(GramaticaSQLParser.ID, 0); }
		public AtomIDContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterAtomID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitAtomID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitAtomID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomExpContext extends AtomContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public AtomExpContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterAtomExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitAtomExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitAtomExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_atom);
		try {
			setState(215);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new AtomIDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(210); match(ID);
				}
				break;
			case T__5:
				_localctx = new AtomExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(211); match(T__5);
				setState(212); booleanExpression();
				setState(213); match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementTableContext extends ParserRuleContext {
		public StatementTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementTable; }
	 
		public StatementTableContext() { }
		public void copyFrom(StatementTableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StmtDropTableContext extends StatementTableContext {
		public DropTableContext dropTable() {
			return getRuleContext(DropTableContext.class,0);
		}
		public StmtDropTableContext(StatementTableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterStmtDropTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitStmtDropTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitStmtDropTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtRenameTableContext extends StatementTableContext {
		public RenameTableContext renameTable() {
			return getRuleContext(RenameTableContext.class,0);
		}
		public StmtRenameTableContext(StatementTableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterStmtRenameTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitStmtRenameTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitStmtRenameTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtActionTableContext extends StatementTableContext {
		public ActionTableContext actionTable() {
			return getRuleContext(ActionTableContext.class,0);
		}
		public StmtActionTableContext(StatementTableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterStmtActionTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitStmtActionTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitStmtActionTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtAlterTableContext extends StatementTableContext {
		public AlterTableContext alterTable() {
			return getRuleContext(AlterTableContext.class,0);
		}
		public StmtAlterTableContext(StatementTableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterStmtAlterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitStmtAlterTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitStmtAlterTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtShowTablesContext extends StatementTableContext {
		public ShowTablesContext showTables() {
			return getRuleContext(ShowTablesContext.class,0);
		}
		public StmtShowTablesContext(StatementTableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterStmtShowTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitStmtShowTables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitStmtShowTables(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtShowColsFromContext extends StatementTableContext {
		public ShowColumnsFromContext showColumnsFrom() {
			return getRuleContext(ShowColumnsFromContext.class,0);
		}
		public StmtShowColsFromContext(StatementTableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterStmtShowColsFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitStmtShowColsFrom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitStmtShowColsFrom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementTableContext statementTable() throws RecognitionException {
		StatementTableContext _localctx = new StatementTableContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_statementTable);
		try {
			setState(223);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new StmtAlterTableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(217); alterTable();
				}
				break;
			case 2:
				_localctx = new StmtRenameTableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(218); renameTable();
				}
				break;
			case 3:
				_localctx = new StmtActionTableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(219); actionTable();
				}
				break;
			case 4:
				_localctx = new StmtShowTablesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(220); showTables();
				}
				break;
			case 5:
				_localctx = new StmtDropTableContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(221); dropTable();
				}
				break;
			case 6:
				_localctx = new StmtShowColsFromContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(222); showColumnsFrom();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterTableContext extends ParserRuleContext {
		public AlterTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTable; }
	 
		public AlterTableContext() { }
		public void copyFrom(AlterTableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AlterTableRenameContext extends AlterTableContext {
		public TerminalNode ID() { return getToken(GramaticaSQLParser.ID, 0); }
		public TerminalNode ALTER() { return getToken(GramaticaSQLParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(GramaticaSQLParser.TABLE, 0); }
		public RenameTableContext renameTable() {
			return getRuleContext(RenameTableContext.class,0);
		}
		public AlterTableRenameContext(AlterTableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterAlterTableRename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitAlterTableRename(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitAlterTableRename(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableActionContext extends AlterTableContext {
		public TerminalNode ID() { return getToken(GramaticaSQLParser.ID, 0); }
		public List<ActionTableContext> actionTable() {
			return getRuleContexts(ActionTableContext.class);
		}
		public TerminalNode ALTER() { return getToken(GramaticaSQLParser.ALTER, 0); }
		public ActionTableContext actionTable(int i) {
			return getRuleContext(ActionTableContext.class,i);
		}
		public TerminalNode TABLE() { return getToken(GramaticaSQLParser.TABLE, 0); }
		public AlterTableActionContext(AlterTableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterAlterTableAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitAlterTableAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitAlterTableAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterTableContext alterTable() throws RecognitionException {
		AlterTableContext _localctx = new AlterTableContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_alterTable);
		int _la;
		try {
			setState(241);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new AlterTableRenameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(225); match(ALTER);
				setState(226); match(TABLE);
				setState(227); match(ID);
				setState(228); renameTable();
				}
				break;
			case 2:
				_localctx = new AlterTableActionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(229); match(ALTER);
				setState(230); match(TABLE);
				setState(231); match(ID);
				{
				setState(232); actionTable();
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(233); match(T__1);
					}
					}
					setState(238);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(239); actionTable();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RenameTableContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(GramaticaSQLParser.RENAME, 0); }
		public TerminalNode ID() { return getToken(GramaticaSQLParser.ID, 0); }
		public TerminalNode TO() { return getToken(GramaticaSQLParser.TO, 0); }
		public RenameTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterRenameTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitRenameTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitRenameTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RenameTableContext renameTable() throws RecognitionException {
		RenameTableContext _localctx = new RenameTableContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_renameTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243); match(RENAME);
			setState(244); match(TO);
			setState(245); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActionTableContext extends ParserRuleContext {
		public ActionTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionTable; }
	 
		public ActionTableContext() { }
		public void copyFrom(ActionTableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ActTableAddCnstContext extends ActionTableContext {
		public CKeyContext cKey() {
			return getRuleContext(CKeyContext.class,0);
		}
		public AddConstraintContext addConstraint() {
			return getRuleContext(AddConstraintContext.class,0);
		}
		public ActTableAddCnstContext(ActionTableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterActTableAddCnst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitActTableAddCnst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitActTableAddCnst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ActTableAddColContext extends ActionTableContext {
		public AddColumnContext addColumn() {
			return getRuleContext(AddColumnContext.class,0);
		}
		public TipoIdContext tipoId() {
			return getRuleContext(TipoIdContext.class,0);
		}
		public CKeyContext cKey(int i) {
			return getRuleContext(CKeyContext.class,i);
		}
		public List<CKeyContext> cKey() {
			return getRuleContexts(CKeyContext.class);
		}
		public ActTableAddColContext(ActionTableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterActTableAddCol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitActTableAddCol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitActTableAddCol(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ActTableDropColContext extends ActionTableContext {
		public DropColumnContext dropColumn() {
			return getRuleContext(DropColumnContext.class,0);
		}
		public ActTableDropColContext(ActionTableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterActTableDropCol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitActTableDropCol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitActTableDropCol(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ActTableDropCnstContext extends ActionTableContext {
		public DropConstraintContext dropConstraint() {
			return getRuleContext(DropConstraintContext.class,0);
		}
		public ActTableDropCnstContext(ActionTableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterActTableDropCnst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitActTableDropCnst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitActTableDropCnst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionTableContext actionTable() throws RecognitionException {
		ActionTableContext _localctx = new ActionTableContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_actionTable);
		try {
			int _alt;
			setState(264);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new ActTableAddColContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(247); addColumn();
				setState(248); tipoId();
				setState(254);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(249); cKey();
						setState(250); match(T__1);
						}
						} 
					}
					setState(256);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				setState(257); cKey();
				}
				break;
			case 2:
				_localctx = new ActTableAddCnstContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(259); addConstraint();
				setState(260); cKey();
				}
				break;
			case 3:
				_localctx = new ActTableDropColContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(262); dropColumn();
				}
				break;
			case 4:
				_localctx = new ActTableDropCnstContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(263); dropConstraint();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddColumnContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaSQLParser.ID, 0); }
		public TerminalNode COLUMN() { return getToken(GramaticaSQLParser.COLUMN, 0); }
		public TerminalNode ADD() { return getToken(GramaticaSQLParser.ADD, 0); }
		public AddColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addColumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterAddColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitAddColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitAddColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddColumnContext addColumn() throws RecognitionException {
		AddColumnContext _localctx = new AddColumnContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_addColumn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266); match(ADD);
			setState(267); match(COLUMN);
			setState(268); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddConstraintContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaSQLParser.ID, 0); }
		public TerminalNode ADD() { return getToken(GramaticaSQLParser.ADD, 0); }
		public TerminalNode CONSTRAINT() { return getToken(GramaticaSQLParser.CONSTRAINT, 0); }
		public AddConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterAddConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitAddConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitAddConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddConstraintContext addConstraint() throws RecognitionException {
		AddConstraintContext _localctx = new AddConstraintContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_addConstraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270); match(ADD);
			setState(271); match(CONSTRAINT);
			setState(272); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropColumnContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaSQLParser.ID, 0); }
		public TerminalNode COLUMN() { return getToken(GramaticaSQLParser.COLUMN, 0); }
		public TerminalNode DROP() { return getToken(GramaticaSQLParser.DROP, 0); }
		public DropColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropColumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterDropColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitDropColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitDropColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropColumnContext dropColumn() throws RecognitionException {
		DropColumnContext _localctx = new DropColumnContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_dropColumn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274); match(DROP);
			setState(275); match(COLUMN);
			setState(276); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropConstraintContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GramaticaSQLParser.ID); }
		public TerminalNode DROP() { return getToken(GramaticaSQLParser.DROP, 0); }
		public TerminalNode CONSTRAINT() { return getToken(GramaticaSQLParser.CONSTRAINT, 0); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaSQLParser.ID, i);
		}
		public DropConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterDropConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitDropConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitDropConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropConstraintContext dropConstraint() throws RecognitionException {
		DropConstraintContext _localctx = new DropConstraintContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_dropConstraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278); match(DROP);
			setState(279); match(CONSTRAINT);
			setState(280); match(ID);
			setState(281); match(T__6);
			setState(282); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowTablesContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(GramaticaSQLParser.SHOW, 0); }
		public TerminalNode ID() { return getToken(GramaticaSQLParser.ID, 0); }
		public TerminalNode TABLES() { return getToken(GramaticaSQLParser.TABLES, 0); }
		public ShowTablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showTables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterShowTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitShowTables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitShowTables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowTablesContext showTables() throws RecognitionException {
		ShowTablesContext _localctx = new ShowTablesContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_showTables);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284); match(SHOW);
			setState(285); match(TABLES);
			setState(286); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropTableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaSQLParser.ID, 0); }
		public TerminalNode DROP() { return getToken(GramaticaSQLParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(GramaticaSQLParser.TABLE, 0); }
		public DropTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterDropTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitDropTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitDropTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropTableContext dropTable() throws RecognitionException {
		DropTableContext _localctx = new DropTableContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_dropTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288); match(DROP);
			setState(289); match(TABLE);
			setState(290); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowColumnsFromContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(GramaticaSQLParser.SHOW, 0); }
		public TerminalNode ID() { return getToken(GramaticaSQLParser.ID, 0); }
		public TerminalNode COLUMNS() { return getToken(GramaticaSQLParser.COLUMNS, 0); }
		public TerminalNode FROM() { return getToken(GramaticaSQLParser.FROM, 0); }
		public ShowColumnsFromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showColumnsFrom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterShowColumnsFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitShowColumnsFrom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitShowColumnsFrom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowColumnsFromContext showColumnsFrom() throws RecognitionException {
		ShowColumnsFromContext _localctx = new ShowColumnsFromContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_showColumnsFrom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292); match(SHOW);
			setState(293); match(COLUMNS);
			setState(294); match(FROM);
			setState(295); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementDataContext extends ParserRuleContext {
		public InsertContext insert() {
			return getRuleContext(InsertContext.class,0);
		}
		public UpdateContext update() {
			return getRuleContext(UpdateContext.class,0);
		}
		public DeleteContext delete() {
			return getRuleContext(DeleteContext.class,0);
		}
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public StatementDataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementData; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterStatementData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitStatementData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitStatementData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementDataContext statementData() throws RecognitionException {
		StatementDataContext _localctx = new StatementDataContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_statementData);
		try {
			setState(301);
			switch (_input.LA(1)) {
			case INSERT:
				enterOuterAlt(_localctx, 1);
				{
				setState(297); insert();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(298); update();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 3);
				{
				setState(299); delete();
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 4);
				{
				setState(300); select();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GramaticaSQLParser.ID); }
		public TerminalNode VALUES() { return getToken(GramaticaSQLParser.VALUES, 0); }
		public List<TipoIdContext> tipoId() {
			return getRuleContexts(TipoIdContext.class);
		}
		public TerminalNode ID(int i) {
			return getToken(GramaticaSQLParser.ID, i);
		}
		public TipoIdContext tipoId(int i) {
			return getRuleContext(TipoIdContext.class,i);
		}
		public TerminalNode INSERT() { return getToken(GramaticaSQLParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(GramaticaSQLParser.INTO, 0); }
		public InsertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterInsert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitInsert(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitInsert(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertContext insert() throws RecognitionException {
		InsertContext _localctx = new InsertContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_insert);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303); match(INSERT);
			setState(304); match(INTO);
			setState(305); match(ID);
			setState(306); match(T__5);
			setState(307); match(ID);
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(308); match(T__1);
				setState(309); match(ID);
				}
				}
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(315); match(T__4);
			setState(316); match(VALUES);
			setState(317); match(T__5);
			setState(318); tipoId();
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(319); match(T__1);
				setState(320); tipoId();
				}
				}
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(326); match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpdateContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GramaticaSQLParser.ID); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode UPDATE() { return getToken(GramaticaSQLParser.UPDATE, 0); }
		public List<TipoIdContext> tipoId() {
			return getRuleContexts(TipoIdContext.class);
		}
		public TerminalNode WHERE() { return getToken(GramaticaSQLParser.WHERE, 0); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaSQLParser.ID, i);
		}
		public TipoIdContext tipoId(int i) {
			return getRuleContext(TipoIdContext.class,i);
		}
		public TerminalNode SET() { return getToken(GramaticaSQLParser.SET, 0); }
		public UpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateContext update() throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_update);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328); match(UPDATE);
			setState(329); match(ID);
			setState(330); match(SET);
			setState(331); match(ID);
			setState(332); match(T__0);
			setState(333); tipoId();
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(334); match(T__1);
				setState(335); tipoId();
				}
				}
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(343);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(341); match(WHERE);
				setState(342); condicion();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeleteContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaSQLParser.ID, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode DELETE() { return getToken(GramaticaSQLParser.DELETE, 0); }
		public TerminalNode WHERE() { return getToken(GramaticaSQLParser.WHERE, 0); }
		public TerminalNode FROM() { return getToken(GramaticaSQLParser.FROM, 0); }
		public DeleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterDelete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitDelete(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitDelete(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteContext delete() throws RecognitionException {
		DeleteContext _localctx = new DeleteContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_delete);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345); match(DELETE);
			setState(346); match(FROM);
			setState(347); match(ID);
			setState(350);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(348); match(WHERE);
				setState(349); condicion();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GramaticaSQLParser.ID); }
		public List<TerminalNode> ASC() { return getTokens(GramaticaSQLParser.ASC); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode ORDER() { return getToken(GramaticaSQLParser.ORDER, 0); }
		public TerminalNode ASC(int i) {
			return getToken(GramaticaSQLParser.ASC, i);
		}
		public TerminalNode WHERE() { return getToken(GramaticaSQLParser.WHERE, 0); }
		public TerminalNode DESC(int i) {
			return getToken(GramaticaSQLParser.DESC, i);
		}
		public TerminalNode FROM() { return getToken(GramaticaSQLParser.FROM, 0); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaSQLParser.ID, i);
		}
		public TerminalNode SELECT() { return getToken(GramaticaSQLParser.SELECT, 0); }
		public List<TerminalNode> DESC() { return getTokens(GramaticaSQLParser.DESC); }
		public TerminalNode BY() { return getToken(GramaticaSQLParser.BY, 0); }
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352); match(SELECT);
			setState(362);
			switch (_input.LA(1)) {
			case T__3:
				{
				setState(353); match(T__3);
				}
				break;
			case ID:
				{
				setState(354); match(ID);
				setState(359);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(355); match(T__1);
					setState(356); match(ID);
					}
					}
					setState(361);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(364); match(FROM);
			setState(365); match(ID);
			setState(368);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(366); match(WHERE);
				setState(367); condicion();
				}
			}

			setState(382);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(370); match(ORDER);
				setState(371); match(BY);
				setState(372); match(ID);
				setState(373);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(374); match(T__1);
					setState(375); match(ID);
					setState(376);
					_la = _input.LA(1);
					if ( !(_la==ASC || _la==DESC) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					setState(381);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondicionContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(GramaticaSQLParser.NOT, 0); }
		public List<TerminalNode> ID() { return getTokens(GramaticaSQLParser.ID); }
		public TerminalNode LOGICAL() { return getToken(GramaticaSQLParser.LOGICAL, 0); }
		public TerminalNode AND() { return getToken(GramaticaSQLParser.AND, 0); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaSQLParser.ID, i);
		}
		public TerminalNode OR() { return getToken(GramaticaSQLParser.OR, 0); }
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitCondicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_condicion);
		try {
			setState(395);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(384); match(ID);
				setState(385); match(AND);
				setState(386); match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(387); match(ID);
				setState(388); match(OR);
				setState(389); match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(390); match(NOT);
				setState(391); match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(392); match(ID);
				setState(393); match(LOGICAL);
				setState(394); match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtraContext extends ParserRuleContext {
		public TerminalNode AND(int i) {
			return getToken(GramaticaSQLParser.AND, i);
		}
		public List<CondicionContext> condicion() {
			return getRuleContexts(CondicionContext.class);
		}
		public List<TerminalNode> AND() { return getTokens(GramaticaSQLParser.AND); }
		public CondicionContext condicion(int i) {
			return getRuleContext(CondicionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(GramaticaSQLParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(GramaticaSQLParser.OR, i);
		}
		public ExtraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extra; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).enterExtra(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSQLListener ) ((GramaticaSQLListener)listener).exitExtra(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSQLVisitor ) return ((GramaticaSQLVisitor<? extends T>)visitor).visitExtra(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtraContext extra() throws RecognitionException {
		ExtraContext _localctx = new ExtraContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_extra);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(397); match(AND);
				setState(398); condicion();
				}
				}
				setState(401); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==AND );
			setState(405); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(403); match(OR);
				setState(404); condicion();
				}
				}
				setState(407); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OR );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\67\u019c\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\7\2J\n\2\f\2\16\2M\13\2\3\2\5\2P\n\2\3\3"+
		"\3\3\3\3\5\3U\n\3\3\4\3\4\3\4\3\4\3\4\5\4\\\n\4\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n}\n\n\f\n\16\n\u0080\13\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u008e\n\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\7\f\u0096\n\f\f\f\16\f\u0099\13\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\7\f\u00a3\n\f\f\f\16\f\u00a6\13\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\7\f\u00af\n\f\f\f\16\f\u00b2\13\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\5\f\u00bc\n\f\3\r\3\r\3\16\3\16\3\16\7\16\u00c3\n\16\f\16\16\16\u00c6"+
		"\13\16\3\17\3\17\3\17\7\17\u00cb\n\17\f\17\16\17\u00ce\13\17\3\20\3\20"+
		"\3\20\5\20\u00d3\n\20\3\21\3\21\3\21\3\21\3\21\5\21\u00da\n\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\5\22\u00e2\n\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\7\23\u00ed\n\23\f\23\16\23\u00f0\13\23\3\23\3\23\5\23"+
		"\u00f4\n\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\7\25\u00ff\n"+
		"\25\f\25\16\25\u0102\13\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u010b"+
		"\n\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\5\35\u0130\n\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\7\36\u0139\n\36\f\36\16\36\u013c\13\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\7\36\u0144\n\36\f\36\16\36\u0147\13\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0153\n\37\f\37\16\37\u0156"+
		"\13\37\3\37\3\37\5\37\u015a\n\37\3 \3 \3 \3 \3 \5 \u0161\n \3!\3!\3!\3"+
		"!\3!\7!\u0168\n!\f!\16!\u016b\13!\5!\u016d\n!\3!\3!\3!\3!\5!\u0173\n!"+
		"\3!\3!\3!\3!\3!\3!\3!\7!\u017c\n!\f!\16!\u017f\13!\5!\u0181\n!\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u018e\n\"\3#\3#\6#\u0192\n#\r"+
		"#\16#\u0193\3#\3#\6#\u0198\n#\r#\16#\u0199\3#\2\2$\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\3\3\2\61\62\u01ab\2F"+
		"\3\2\2\2\4T\3\2\2\2\6[\3\2\2\2\b]\3\2\2\2\na\3\2\2\2\fh\3\2\2\2\16l\3"+
		"\2\2\2\20p\3\2\2\2\22t\3\2\2\2\24\u008d\3\2\2\2\26\u00bb\3\2\2\2\30\u00bd"+
		"\3\2\2\2\32\u00bf\3\2\2\2\34\u00c7\3\2\2\2\36\u00d2\3\2\2\2 \u00d9\3\2"+
		"\2\2\"\u00e1\3\2\2\2$\u00f3\3\2\2\2&\u00f5\3\2\2\2(\u010a\3\2\2\2*\u010c"+
		"\3\2\2\2,\u0110\3\2\2\2.\u0114\3\2\2\2\60\u0118\3\2\2\2\62\u011e\3\2\2"+
		"\2\64\u0122\3\2\2\2\66\u0126\3\2\2\28\u012f\3\2\2\2:\u0131\3\2\2\2<\u014a"+
		"\3\2\2\2>\u015b\3\2\2\2@\u0162\3\2\2\2B\u018d\3\2\2\2D\u0191\3\2\2\2F"+
		"K\5\4\3\2GH\7\7\2\2HJ\5\4\3\2IG\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2"+
		"LO\3\2\2\2MK\3\2\2\2NP\7\7\2\2ON\3\2\2\2OP\3\2\2\2P\3\3\2\2\2QU\5\6\4"+
		"\2RU\5\"\22\2SU\58\35\2TQ\3\2\2\2TR\3\2\2\2TS\3\2\2\2U\5\3\2\2\2V\\\5"+
		"\b\5\2W\\\5\n\6\2X\\\5\f\7\2Y\\\5\20\t\2Z\\\5\16\b\2[V\3\2\2\2[W\3\2\2"+
		"\2[X\3\2\2\2[Y\3\2\2\2[Z\3\2\2\2\\\7\3\2\2\2]^\7\n\2\2^_\7\13\2\2_`\7"+
		"\64\2\2`\t\3\2\2\2ab\7\r\2\2bc\7\13\2\2cd\7\64\2\2de\7 \2\2ef\7!\2\2f"+
		"g\7\64\2\2g\13\3\2\2\2hi\7\16\2\2ij\7\13\2\2jk\7\64\2\2k\r\3\2\2\2lm\7"+
		"\17\2\2mn\7\f\2\2no\7\64\2\2o\17\3\2\2\2pq\7\20\2\2qr\7\13\2\2rs\7\64"+
		"\2\2s\21\3\2\2\2tu\7\n\2\2uv\7\36\2\2vw\7\64\2\2w~\7\4\2\2xy\7\64\2\2"+
		"yz\5\24\13\2z{\7\b\2\2{}\3\2\2\2|x\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177"+
		"\3\2\2\2\177\u0081\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\7\64\2\2\u0082\u0083"+
		"\5\24\13\2\u0083\u0084\7\22\2\2\u0084\u0085\5\26\f\2\u0085\23\3\2\2\2"+
		"\u0086\u008e\7\27\2\2\u0087\u008e\7\30\2\2\u0088\u008e\7\31\2\2\u0089"+
		"\u008a\7\32\2\2\u008a\u008b\7\4\2\2\u008b\u008c\7\63\2\2\u008c\u008e\7"+
		"\5\2\2\u008d\u0086\3\2\2\2\u008d\u0087\3\2\2\2\u008d\u0088\3\2\2\2\u008d"+
		"\u0089\3\2\2\2\u008e\25\3\2\2\2\u008f\u0090\7\64\2\2\u0090\u0091\7\23"+
		"\2\2\u0091\u0092\7\25\2\2\u0092\u0097\7\4\2\2\u0093\u0094\7\64\2\2\u0094"+
		"\u0096\7\b\2\2\u0095\u0093\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2"+
		"\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0097\3\2\2\2\u009a"+
		"\u009b\7\64\2\2\u009b\u00bc\7\5\2\2\u009c\u009d\7\64\2\2\u009d\u009e\7"+
		"\24\2\2\u009e\u009f\7\25\2\2\u009f\u00a4\7\4\2\2\u00a0\u00a1\7\64\2\2"+
		"\u00a1\u00a3\7\b\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2"+
		"\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7"+
		"\u00a8\7\64\2\2\u00a8\u00a9\7\5\2\2\u00a9\u00aa\7\26\2\2\u00aa\u00ab\7"+
		"\64\2\2\u00ab\u00b0\7\4\2\2\u00ac\u00ad\7\64\2\2\u00ad\u00af\7\b\2\2\u00ae"+
		"\u00ac\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2"+
		"\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\7\64\2\2\u00b4"+
		"\u00bc\7\5\2\2\u00b5\u00b6\7\64\2\2\u00b6\u00b7\7\21\2\2\u00b7\u00b8\7"+
		"\4\2\2\u00b8\u00b9\5 \21\2\u00b9\u00ba\7\5\2\2\u00ba\u00bc\3\2\2\2\u00bb"+
		"\u008f\3\2\2\2\u00bb\u009c\3\2\2\2\u00bb\u00b5\3\2\2\2\u00bc\27\3\2\2"+
		"\2\u00bd\u00be\5\32\16\2\u00be\31\3\2\2\2\u00bf\u00c4\5\34\17\2\u00c0"+
		"\u00c1\7\34\2\2\u00c1\u00c3\5\34\17\2\u00c2\u00c0\3\2\2\2\u00c3\u00c6"+
		"\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\33\3\2\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c7\u00cc\5\36\20\2\u00c8\u00c9\7\33\2\2\u00c9\u00cb"+
		"\5\36\20\2\u00ca\u00c8\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2"+
		"\u00cc\u00cd\3\2\2\2\u00cd\35\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0"+
		"\7\35\2\2\u00d0\u00d3\5 \21\2\u00d1\u00d3\5 \21\2\u00d2\u00cf\3\2\2\2"+
		"\u00d2\u00d1\3\2\2\2\u00d3\37\3\2\2\2\u00d4\u00da\7\64\2\2\u00d5\u00d6"+
		"\7\4\2\2\u00d6\u00d7\5\30\r\2\u00d7\u00d8\7\5\2\2\u00d8\u00da\3\2\2\2"+
		"\u00d9\u00d4\3\2\2\2\u00d9\u00d5\3\2\2\2\u00da!\3\2\2\2\u00db\u00e2\5"+
		"$\23\2\u00dc\u00e2\5&\24\2\u00dd\u00e2\5(\25\2\u00de\u00e2\5\62\32\2\u00df"+
		"\u00e2\5\64\33\2\u00e0\u00e2\5\66\34\2\u00e1\u00db\3\2\2\2\u00e1\u00dc"+
		"\3\2\2\2\u00e1\u00dd\3\2\2\2\u00e1\u00de\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1"+
		"\u00e0\3\2\2\2\u00e2#\3\2\2\2\u00e3\u00e4\7\r\2\2\u00e4\u00e5\7\36\2\2"+
		"\u00e5\u00e6\7\64\2\2\u00e6\u00f4\5&\24\2\u00e7\u00e8\7\r\2\2\u00e8\u00e9"+
		"\7\36\2\2\u00e9\u00ea\7\64\2\2\u00ea\u00ee\5(\25\2\u00eb\u00ed\7\b\2\2"+
		"\u00ec\u00eb\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef"+
		"\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f2\5(\25\2\u00f2"+
		"\u00f4\3\2\2\2\u00f3\u00e3\3\2\2\2\u00f3\u00e7\3\2\2\2\u00f4%\3\2\2\2"+
		"\u00f5\u00f6\7 \2\2\u00f6\u00f7\7!\2\2\u00f7\u00f8\7\64\2\2\u00f8\'\3"+
		"\2\2\2\u00f9\u00fa\5*\26\2\u00fa\u0100\5\24\13\2\u00fb\u00fc\5\26\f\2"+
		"\u00fc\u00fd\7\b\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00fb\3\2\2\2\u00ff\u0102"+
		"\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\3\2\2\2\u0102"+
		"\u0100\3\2\2\2\u0103\u0104\5\26\f\2\u0104\u010b\3\2\2\2\u0105\u0106\5"+
		",\27\2\u0106\u0107\5\26\f\2\u0107\u010b\3\2\2\2\u0108\u010b\5.\30\2\u0109"+
		"\u010b\5\60\31\2\u010a\u00f9\3\2\2\2\u010a\u0105\3\2\2\2\u010a\u0108\3"+
		"\2\2\2\u010a\u0109\3\2\2\2\u010b)\3\2\2\2\u010c\u010d\7\"\2\2\u010d\u010e"+
		"\7#\2\2\u010e\u010f\7\64\2\2\u010f+\3\2\2\2\u0110\u0111\7\"\2\2\u0111"+
		"\u0112\7\22\2\2\u0112\u0113\7\64\2\2\u0113-\3\2\2\2\u0114\u0115\7\16\2"+
		"\2\u0115\u0116\7#\2\2\u0116\u0117\7\64\2\2\u0117/\3\2\2\2\u0118\u0119"+
		"\7\16\2\2\u0119\u011a\7\22\2\2\u011a\u011b\7\64\2\2\u011b\u011c\7\3\2"+
		"\2\u011c\u011d\7\64\2\2\u011d\61\3\2\2\2\u011e\u011f\7\17\2\2\u011f\u0120"+
		"\7\37\2\2\u0120\u0121\7\64\2\2\u0121\63\3\2\2\2\u0122\u0123\7\16\2\2\u0123"+
		"\u0124\7\36\2\2\u0124\u0125\7\64\2\2\u0125\65\3\2\2\2\u0126\u0127\7\17"+
		"\2\2\u0127\u0128\7$\2\2\u0128\u0129\7.\2\2\u0129\u012a\7\64\2\2\u012a"+
		"\67\3\2\2\2\u012b\u0130\5:\36\2\u012c\u0130\5<\37\2\u012d\u0130\5> \2"+
		"\u012e\u0130\5@!\2\u012f\u012b\3\2\2\2\u012f\u012c\3\2\2\2\u012f\u012d"+
		"\3\2\2\2\u012f\u012e\3\2\2\2\u01309\3\2\2\2\u0131\u0132\7%\2\2\u0132\u0133"+
		"\7&\2\2\u0133\u0134\7\64\2\2\u0134\u0135\7\4\2\2\u0135\u013a\7\64\2\2"+
		"\u0136\u0137\7\b\2\2\u0137\u0139\7\64\2\2\u0138\u0136\3\2\2\2\u0139\u013c"+
		"\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013d\3\2\2\2\u013c"+
		"\u013a\3\2\2\2\u013d\u013e\7\5\2\2\u013e\u013f\7\'\2\2\u013f\u0140\7\4"+
		"\2\2\u0140\u0145\5\24\13\2\u0141\u0142\7\b\2\2\u0142\u0144\5\24\13\2\u0143"+
		"\u0141\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2"+
		"\2\2\u0146\u0148\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u0149\7\5\2\2\u0149"+
		";\3\2\2\2\u014a\u014b\7)\2\2\u014b\u014c\7\64\2\2\u014c\u014d\7*\2\2\u014d"+
		"\u014e\7\64\2\2\u014e\u014f\7\t\2\2\u014f\u0154\5\24\13\2\u0150\u0151"+
		"\7\b\2\2\u0151\u0153\5\24\13\2\u0152\u0150\3\2\2\2\u0153\u0156\3\2\2\2"+
		"\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0159\3\2\2\2\u0156\u0154"+
		"\3\2\2\2\u0157\u0158\7+\2\2\u0158\u015a\5B\"\2\u0159\u0157\3\2\2\2\u0159"+
		"\u015a\3\2\2\2\u015a=\3\2\2\2\u015b\u015c\7,\2\2\u015c\u015d\7.\2\2\u015d"+
		"\u0160\7\64\2\2\u015e\u015f\7+\2\2\u015f\u0161\5B\"\2\u0160\u015e\3\2"+
		"\2\2\u0160\u0161\3\2\2\2\u0161?\3\2\2\2\u0162\u016c\7-\2\2\u0163\u016d"+
		"\7\6\2\2\u0164\u0169\7\64\2\2\u0165\u0166\7\b\2\2\u0166\u0168\7\64\2\2"+
		"\u0167\u0165\3\2\2\2\u0168\u016b\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a"+
		"\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016c\u0163\3\2\2\2\u016c"+
		"\u0164\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016f\7.\2\2\u016f\u0172\7\64"+
		"\2\2\u0170\u0171\7+\2\2\u0171\u0173\5B\"\2\u0172\u0170\3\2\2\2\u0172\u0173"+
		"\3\2\2\2\u0173\u0180\3\2\2\2\u0174\u0175\7/\2\2\u0175\u0176\7\60\2\2\u0176"+
		"\u0177\7\64\2\2\u0177\u017d\t\2\2\2\u0178\u0179\7\b\2\2\u0179\u017a\7"+
		"\64\2\2\u017a\u017c\t\2\2\2\u017b\u0178\3\2\2\2\u017c\u017f\3\2\2\2\u017d"+
		"\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u017d\3\2"+
		"\2\2\u0180\u0174\3\2\2\2\u0180\u0181\3\2\2\2\u0181A\3\2\2\2\u0182\u0183"+
		"\7\64\2\2\u0183\u0184\7\33\2\2\u0184\u018e\7\64\2\2\u0185\u0186\7\64\2"+
		"\2\u0186\u0187\7\34\2\2\u0187\u018e\7\64\2\2\u0188\u0189\7\35\2\2\u0189"+
		"\u018e\7\64\2\2\u018a\u018b\7\64\2\2\u018b\u018c\7\65\2\2\u018c\u018e"+
		"\7\64\2\2\u018d\u0182\3\2\2\2\u018d\u0185\3\2\2\2\u018d\u0188\3\2\2\2"+
		"\u018d\u018a\3\2\2\2\u018eC\3\2\2\2\u018f\u0190\7\33\2\2\u0190\u0192\5"+
		"B\"\2\u0191\u018f\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0191\3\2\2\2\u0193"+
		"\u0194\3\2\2\2\u0194\u0197\3\2\2\2\u0195\u0196\7\34\2\2\u0196\u0198\5"+
		"B\"\2\u0197\u0195\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u0197\3\2\2\2\u0199"+
		"\u019a\3\2\2\2\u019aE\3\2\2\2#KOT[~\u008d\u0097\u00a4\u00b0\u00bb\u00c4"+
		"\u00cc\u00d2\u00d9\u00e1\u00ee\u00f3\u0100\u010a\u012f\u013a\u0145\u0154"+
		"\u0159\u0160\u0169\u016c\u0172\u017d\u0180\u018d\u0193\u0199";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
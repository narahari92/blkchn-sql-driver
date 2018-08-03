// Generated from BlkchnSql.g4 by ANTLR 4.5
package com.impetus.blkch.sql.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BlkchnSqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, SELECT=8, FROM=9, 
		ADD=10, AS=11, ALL=12, DISTINCT=13, WHERE=14, GROUP=15, BY=16, GROUPING=17, 
		SETS=18, CUBE=19, ROLLUP=20, ORDER=21, HAVING=22, LIMIT=23, AT=24, OR=25, 
		AND=26, IN=27, NOT=28, NO=29, EXISTS=30, BETWEEN=31, LIKE=32, RLIKE=33, 
		IS=34, NULL=35, TRUE=36, FALSE=37, NULLS=38, ASC=39, DESC=40, FOR=41, 
		INTERVAL=42, CASE=43, WHEN=44, THEN=45, ELSE=46, END=47, JOIN=48, CROSS=49, 
		OUTER=50, INNER=51, LEFT=52, SEMI=53, RIGHT=54, FULL=55, NATURAL=56, ON=57, 
		FIRST=58, AFTER=59, LAST=60, VALUES=61, CREATE=62, TABLE=63, VIEW=64, 
		REPLACE=65, INSERT=66, DELETE=67, INTO=68, DESCRIBE=69, EXPLAIN=70, CAST=71, 
		SHOW=72, TABLES=73, COLUMNS=74, COLUMN=75, USE=76, FUNCTIONS=77, DROP=78, 
		UNION=79, EXCEPT=80, SETMINUS=81, INTERSECT=82, TO=83, ALTER=84, RENAME=85, 
		ARRAY=86, MAP=87, STRUCT=88, COMMENT=89, SET=90, RESET=91, COMMIT=92, 
		ROLLBACK=93, IGNORE=94, CALL=95, WITH=96, VERSION=97, ENDORSEMENT=98, 
		POLICY=99, FILE=100, ARGS=101, ASSET=102, CHAINCODE=103, SMARTCONTRACT=104, 
		STORAGE=105, TYPE=106, JSON=107, CSV=108, FIELDS=109, RECORDS=110, DELIMITED=111, 
		UPGRADE=112, USER=113, IDENTIFIED=114, AFFILIATED=115, IF=116, EQ=117, 
		NSEQ=118, NEQ=119, NEQJ=120, LT=121, LTE=122, GT=123, GTE=124, PLUS=125, 
		MINUS=126, ASTERISK=127, SLASH=128, PERCENT=129, DIV=130, TILDE=131, AMPERSAND=132, 
		PIPE=133, HAT=134, PERCENTLIT=135, OUT=136, OF=137, FUNCTION=138, DATABASE=139, 
		DATABASES=140, TRUNCATE=141, ANALYZE=142, COMPUTE=143, LIST=144, REVOKE=145, 
		GRANT=146, EXPORT=147, IMPORT=148, LOAD=149, ROLE=150, ROLES=151, INDEX=152, 
		INDEXES=153, CURRENT_DATE=154, CURRENT_TIMESTAMP=155, INSTALL_ONLY=156, 
		INSTANTIATE_ONLY=157, UPGRADE_ONLY=158, STRING=159, BIGINT_LITERAL=160, 
		SMALLINT_LITERAL=161, TINYINT_LITERAL=162, BYTELENGTH_LITERAL=163, INTEGER_VALUE=164, 
		DECIMAL_VALUE=165, DOUBLE_LITERAL=166, BIGDECIMAL_LITERAL=167, IDENTIFIER=168, 
		NESTED_IDENTIFIER=169, BACKQUOTED_IDENTIFIER=170, SIMPLE_COMMENT=171, 
		BRACKETED_EMPTY_COMMENT=172, BRACKETED_COMMENT=173, WS=174, UNRECOGNIZED=175, 
		DELIMITER=176;
	public static final int
		RULE_singleStatement = 0, RULE_statement = 1, RULE_createUser = 2, RULE_secret = 3, 
		RULE_affiliation = 4, RULE_insertInto = 5, RULE_columnNames = 6, RULE_columnValues = 7, 
		RULE_constantSeq = 8, RULE_createFunction = 9, RULE_upgradeFunction = 10, 
		RULE_createAsset = 11, RULE_createFlag = 12, RULE_upgradeFlag = 13, RULE_asset = 14, 
		RULE_storageType = 15, RULE_fieldDelimiter = 16, RULE_recordDelimiter = 17, 
		RULE_deleteFunction = 18, RULE_dropAsset = 19, RULE_className = 20, RULE_version = 21, 
		RULE_endorsersFile = 22, RULE_policyFile = 23, RULE_args = 24, RULE_argParamSeq = 25, 
		RULE_argParam = 26, RULE_callFunction = 27, RULE_parameterValues = 28, 
		RULE_query = 29, RULE_queryOrganization = 30, RULE_orderByClause = 31, 
		RULE_limitClause = 32, RULE_queryTerm = 33, RULE_queryPrimary = 34, RULE_sortItem = 35, 
		RULE_querySpecification = 36, RULE_selectClause = 37, RULE_whereClause = 38, 
		RULE_havingClause = 39, RULE_fromClause = 40, RULE_groupByClause = 41, 
		RULE_setQuantifier = 42, RULE_relation = 43, RULE_joinRelation = 44, RULE_joinType = 45, 
		RULE_joinCriteria = 46, RULE_identifierList = 47, RULE_identifierSeq = 48, 
		RULE_relationPrimary = 49, RULE_inlineTable = 50, RULE_tableIdentifier = 51, 
		RULE_namedExpression = 52, RULE_namedExpressionSeq = 53, RULE_expression = 54, 
		RULE_booleanExpression = 55, RULE_predicated = 56, RULE_predicate = 57, 
		RULE_valueExpression = 58, RULE_primaryExpression = 59, RULE_constant = 60, 
		RULE_comparisonOperator = 61, RULE_arithmeticOperator = 62, RULE_predicateOperator = 63, 
		RULE_booleanValue = 64, RULE_interval = 65, RULE_intervalField = 66, RULE_intervalValue = 67, 
		RULE_dataType = 68, RULE_colTypeList = 69, RULE_colType = 70, RULE_complexColTypeList = 71, 
		RULE_complexColType = 72, RULE_whenClause = 73, RULE_qualifiedName = 74, 
		RULE_identifier = 75, RULE_strictIdentifier = 76, RULE_quotedIdentifier = 77, 
		RULE_number = 78, RULE_nonReserved = 79;
	public static final String[] ruleNames = {
		"singleStatement", "statement", "createUser", "secret", "affiliation", 
		"insertInto", "columnNames", "columnValues", "constantSeq", "createFunction", 
		"upgradeFunction", "createAsset", "createFlag", "upgradeFlag", "asset", 
		"storageType", "fieldDelimiter", "recordDelimiter", "deleteFunction", 
		"dropAsset", "className", "version", "endorsersFile", "policyFile", "args", 
		"argParamSeq", "argParam", "callFunction", "parameterValues", "query", 
		"queryOrganization", "orderByClause", "limitClause", "queryTerm", "queryPrimary", 
		"sortItem", "querySpecification", "selectClause", "whereClause", "havingClause", 
		"fromClause", "groupByClause", "setQuantifier", "relation", "joinRelation", 
		"joinType", "joinCriteria", "identifierList", "identifierSeq", "relationPrimary", 
		"inlineTable", "tableIdentifier", "namedExpression", "namedExpressionSeq", 
		"expression", "booleanExpression", "predicated", "predicate", "valueExpression", 
		"primaryExpression", "constant", "comparisonOperator", "arithmeticOperator", 
		"predicateOperator", "booleanValue", "interval", "intervalField", "intervalValue", 
		"dataType", "colTypeList", "colType", "complexColTypeList", "complexColType", 
		"whenClause", "qualifiedName", "identifier", "strictIdentifier", "quotedIdentifier", 
		"number", "nonReserved"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "','", "'.'", "'['", "']'", "':'", "'SELECT'", "'FROM'", 
		"'ADD'", "'AS'", "'ALL'", "'DISTINCT'", "'WHERE'", "'GROUP'", "'BY'", 
		"'GROUPING'", "'SETS'", "'CUBE'", "'ROLLUP'", "'ORDER'", "'HAVING'", "'LIMIT'", 
		"'AT'", "'OR'", "'AND'", "'IN'", null, "'NO'", "'EXISTS'", "'BETWEEN'", 
		"'LIKE'", null, "'IS'", "'NULL'", "'TRUE'", "'FALSE'", "'NULLS'", "'ASC'", 
		"'DESC'", "'FOR'", "'INTERVAL'", "'CASE'", "'WHEN'", "'THEN'", "'ELSE'", 
		"'END'", "'JOIN'", "'CROSS'", "'OUTER'", "'INNER'", "'LEFT'", "'SEMI'", 
		"'RIGHT'", "'FULL'", "'NATURAL'", "'ON'", "'FIRST'", "'AFTER'", "'LAST'", 
		"'VALUES'", "'CREATE'", "'TABLE'", "'VIEW'", "'REPLACE'", "'INSERT'", 
		"'DELETE'", "'INTO'", "'DESCRIBE'", "'EXPLAIN'", "'CAST'", "'SHOW'", "'TABLES'", 
		"'COLUMNS'", "'COLUMN'", "'USE'", "'FUNCTIONS'", "'DROP'", "'UNION'", 
		"'EXCEPT'", "'MINUS'", "'INTERSECT'", "'TO'", "'ALTER'", "'RENAME'", "'ARRAY'", 
		"'MAP'", "'STRUCT'", "'COMMENT'", "'SET'", "'RESET'", "'COMMIT'", "'ROLLBACK'", 
		"'IGNORE'", "'CALL'", "'WITH'", "'VERSION'", "'ENDORSEMENT'", "'POLICY'", 
		"'FILE'", "'ARGS'", "'ASSET'", "'CHAINCODE'", "'SMARTCONTRACT'", "'STORAGE'", 
		"'TYPE'", "'JSON'", "'CSV'", "'FIELDS'", "'RECORDS'", "'DELIMITED'", "'UPGRADE'", 
		"'USER'", "'IDENTIFIED'", "'AFFILIATED'", "'IF'", null, "'<=>'", "'<>'", 
		"'!='", "'<'", null, "'>'", null, "'+'", "'-'", "'*'", "'/'", "'%'", "'DIV'", 
		"'~'", "'&'", "'|'", "'^'", "'PERCENT'", "'OUT'", "'OF'", "'FUNCTION'", 
		null, null, "'TRUNCATE'", "'ANALYZE'", "'COMPUTE'", "'LIST'", "'REVOKE'", 
		"'GRANT'", "'EXPORT'", "'IMPORT'", "'LOAD'", "'ROLE'", "'ROLES'", "'INDEX'", 
		"'INDEXES'", "'CURRENT_DATE'", "'CURRENT_TIMESTAMP'", "'INSTALL ONLY'", 
		"'INSTANTIATE ONLY'", "'UPGRADE ONLY'", null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "'/**/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "SELECT", "FROM", "ADD", 
		"AS", "ALL", "DISTINCT", "WHERE", "GROUP", "BY", "GROUPING", "SETS", "CUBE", 
		"ROLLUP", "ORDER", "HAVING", "LIMIT", "AT", "OR", "AND", "IN", "NOT", 
		"NO", "EXISTS", "BETWEEN", "LIKE", "RLIKE", "IS", "NULL", "TRUE", "FALSE", 
		"NULLS", "ASC", "DESC", "FOR", "INTERVAL", "CASE", "WHEN", "THEN", "ELSE", 
		"END", "JOIN", "CROSS", "OUTER", "INNER", "LEFT", "SEMI", "RIGHT", "FULL", 
		"NATURAL", "ON", "FIRST", "AFTER", "LAST", "VALUES", "CREATE", "TABLE", 
		"VIEW", "REPLACE", "INSERT", "DELETE", "INTO", "DESCRIBE", "EXPLAIN", 
		"CAST", "SHOW", "TABLES", "COLUMNS", "COLUMN", "USE", "FUNCTIONS", "DROP", 
		"UNION", "EXCEPT", "SETMINUS", "INTERSECT", "TO", "ALTER", "RENAME", "ARRAY", 
		"MAP", "STRUCT", "COMMENT", "SET", "RESET", "COMMIT", "ROLLBACK", "IGNORE", 
		"CALL", "WITH", "VERSION", "ENDORSEMENT", "POLICY", "FILE", "ARGS", "ASSET", 
		"CHAINCODE", "SMARTCONTRACT", "STORAGE", "TYPE", "JSON", "CSV", "FIELDS", 
		"RECORDS", "DELIMITED", "UPGRADE", "USER", "IDENTIFIED", "AFFILIATED", 
		"IF", "EQ", "NSEQ", "NEQ", "NEQJ", "LT", "LTE", "GT", "GTE", "PLUS", "MINUS", 
		"ASTERISK", "SLASH", "PERCENT", "DIV", "TILDE", "AMPERSAND", "PIPE", "HAT", 
		"PERCENTLIT", "OUT", "OF", "FUNCTION", "DATABASE", "DATABASES", "TRUNCATE", 
		"ANALYZE", "COMPUTE", "LIST", "REVOKE", "GRANT", "EXPORT", "IMPORT", "LOAD", 
		"ROLE", "ROLES", "INDEX", "INDEXES", "CURRENT_DATE", "CURRENT_TIMESTAMP", 
		"INSTALL_ONLY", "INSTANTIATE_ONLY", "UPGRADE_ONLY", "STRING", "BIGINT_LITERAL", 
		"SMALLINT_LITERAL", "TINYINT_LITERAL", "BYTELENGTH_LITERAL", "INTEGER_VALUE", 
		"DECIMAL_VALUE", "DOUBLE_LITERAL", "BIGDECIMAL_LITERAL", "IDENTIFIER", 
		"NESTED_IDENTIFIER", "BACKQUOTED_IDENTIFIER", "SIMPLE_COMMENT", "BRACKETED_EMPTY_COMMENT", 
		"BRACKETED_COMMENT", "WS", "UNRECOGNIZED", "DELIMITER"
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

	@Override
	public String getGrammarFileName() { return "BlkchnSql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	  /**
	   * Verify whether current token is a valid decimal token (which contains dot).
	   * Returns true if the character that follows the token is not a digit or letter or underscore.
	   *
	   * For example:
	   * For char stream "2.3", "2." is not a valid decimal token, because it is followed by digit '3'.
	   * For char stream "2.3_", "2.3" is not a valid decimal token, because it is followed by '_'.
	   * For char stream "2.3W", "2.3" is not a valid decimal token, because it is followed by 'W'.
	   * For char stream "12.0D 34.E2+0.12 "  12.0D is a valid decimal token because it is folllowed
	   * by a space. 34.E2 is a valid decimal token because it is followed by symbol '+'
	   * which is not a digit or letter or underscore.
	   */
	  public boolean isValidDecimal() {
	    int nextChar = _input.LA(1);
	    if (nextChar >= 'A' && nextChar <= 'Z' || nextChar >= '0' && nextChar <= '9' ||
	      nextChar == '_') {
	      return false;
	    } else {
	      return true;
	    }
	  }

	public BlkchnSqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SingleStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(BlkchnSqlParser.EOF, 0); }
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitSingleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitSingleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_singleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			statement();
			setState(161);
			match(EOF);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CreateAssetRuleContext extends StatementContext {
		public CreateAssetContext createAsset() {
			return getRuleContext(CreateAssetContext.class,0);
		}
		public CreateAssetRuleContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterCreateAssetRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitCreateAssetRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitCreateAssetRule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropAssetRuleContext extends StatementContext {
		public DropAssetContext dropAsset() {
			return getRuleContext(DropAssetContext.class,0);
		}
		public DropAssetRuleContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterDropAssetRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitDropAssetRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitDropAssetRule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateFunctionRuleContext extends StatementContext {
		public CreateFunctionContext createFunction() {
			return getRuleContext(CreateFunctionContext.class,0);
		}
		public CreateFunctionRuleContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterCreateFunctionRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitCreateFunctionRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitCreateFunctionRule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementDefaultContext extends StatementContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public StatementDefaultContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterStatementDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitStatementDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitStatementDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateUserRuleContext extends StatementContext {
		public CreateUserContext createUser() {
			return getRuleContext(CreateUserContext.class,0);
		}
		public CreateUserRuleContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterCreateUserRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitCreateUserRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitCreateUserRule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleInsertContext extends StatementContext {
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public SingleInsertContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterSingleInsert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitSingleInsert(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitSingleInsert(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallFunctionRuleContext extends StatementContext {
		public CallFunctionContext callFunction() {
			return getRuleContext(CallFunctionContext.class,0);
		}
		public CallFunctionRuleContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterCallFunctionRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitCallFunctionRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitCallFunctionRule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UpgradeFunctionRuleContext extends StatementContext {
		public UpgradeFunctionContext upgradeFunction() {
			return getRuleContext(UpgradeFunctionContext.class,0);
		}
		public UpgradeFunctionRuleContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterUpgradeFunctionRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitUpgradeFunctionRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitUpgradeFunctionRule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeleteFunctionRuleContext extends StatementContext {
		public DeleteFunctionContext deleteFunction() {
			return getRuleContext(DeleteFunctionContext.class,0);
		}
		public DeleteFunctionRuleContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterDeleteFunctionRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitDeleteFunctionRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitDeleteFunctionRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(172);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new StatementDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				query();
				}
				break;
			case 2:
				_localctx = new SingleInsertContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				insertInto();
				}
				break;
			case 3:
				_localctx = new CreateFunctionRuleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(165);
				createFunction();
				}
				break;
			case 4:
				_localctx = new CallFunctionRuleContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(166);
				callFunction();
				}
				break;
			case 5:
				_localctx = new CreateAssetRuleContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(167);
				createAsset();
				}
				break;
			case 6:
				_localctx = new DeleteFunctionRuleContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(168);
				deleteFunction();
				}
				break;
			case 7:
				_localctx = new DropAssetRuleContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(169);
				dropAsset();
				}
				break;
			case 8:
				_localctx = new UpgradeFunctionRuleContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(170);
				upgradeFunction();
				}
				break;
			case 9:
				_localctx = new CreateUserRuleContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(171);
				createUser();
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

	public static class CreateUserContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(BlkchnSqlParser.CREATE, 0); }
		public TerminalNode USER() { return getToken(BlkchnSqlParser.USER, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode IDENTIFIED() { return getToken(BlkchnSqlParser.IDENTIFIED, 0); }
		public TerminalNode BY() { return getToken(BlkchnSqlParser.BY, 0); }
		public SecretContext secret() {
			return getRuleContext(SecretContext.class,0);
		}
		public TerminalNode AFFILIATED() { return getToken(BlkchnSqlParser.AFFILIATED, 0); }
		public TerminalNode TO() { return getToken(BlkchnSqlParser.TO, 0); }
		public AffiliationContext affiliation() {
			return getRuleContext(AffiliationContext.class,0);
		}
		public CreateUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createUser; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterCreateUser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitCreateUser(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitCreateUser(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateUserContext createUser() throws RecognitionException {
		CreateUserContext _localctx = new CreateUserContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_createUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(CREATE);
			setState(175);
			match(USER);
			setState(176);
			identifier();
			setState(177);
			match(IDENTIFIED);
			setState(178);
			match(BY);
			setState(179);
			secret();
			setState(180);
			match(AFFILIATED);
			setState(181);
			match(TO);
			setState(182);
			affiliation();
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

	public static class SecretContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(BlkchnSqlParser.STRING, 0); }
		public SecretContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secret; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterSecret(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitSecret(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitSecret(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SecretContext secret() throws RecognitionException {
		SecretContext _localctx = new SecretContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_secret);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(STRING);
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

	public static class AffiliationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(BlkchnSqlParser.IDENTIFIER, 0); }
		public TerminalNode NESTED_IDENTIFIER() { return getToken(BlkchnSqlParser.NESTED_IDENTIFIER, 0); }
		public AffiliationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_affiliation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterAffiliation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitAffiliation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitAffiliation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AffiliationContext affiliation() throws RecognitionException {
		AffiliationContext _localctx = new AffiliationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_affiliation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==NESTED_IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class InsertIntoContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(BlkchnSqlParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(BlkchnSqlParser.INTO, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode VALUES() { return getToken(BlkchnSqlParser.VALUES, 0); }
		public ColumnValuesContext columnValues() {
			return getRuleContext(ColumnValuesContext.class,0);
		}
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public InsertIntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertInto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterInsertInto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitInsertInto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitInsertInto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertIntoContext insertInto() throws RecognitionException {
		InsertIntoContext _localctx = new InsertIntoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_insertInto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(INSERT);
			setState(189);
			match(INTO);
			setState(190);
			tableIdentifier();
			setState(195);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(191);
				match(T__0);
				setState(192);
				columnNames();
				setState(193);
				match(T__1);
				}
			}

			setState(197);
			match(VALUES);
			setState(198);
			match(T__0);
			setState(199);
			columnValues();
			setState(200);
			match(T__1);
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

	public static class ColumnNamesContext extends ParserRuleContext {
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public ColumnNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNames; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterColumnNames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitColumnNames(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitColumnNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNamesContext columnNames() throws RecognitionException {
		ColumnNamesContext _localctx = new ColumnNamesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_columnNames);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			identifierSeq();
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

	public static class ColumnValuesContext extends ParserRuleContext {
		public ConstantSeqContext constantSeq() {
			return getRuleContext(ConstantSeqContext.class,0);
		}
		public ColumnValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterColumnValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitColumnValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitColumnValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnValuesContext columnValues() throws RecognitionException {
		ColumnValuesContext _localctx = new ColumnValuesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_columnValues);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			constantSeq();
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

	public static class ConstantSeqContext extends ParserRuleContext {
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public ConstantSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterConstantSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitConstantSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitConstantSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantSeqContext constantSeq() throws RecognitionException {
		ConstantSeqContext _localctx = new ConstantSeqContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_constantSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			constant();
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(207);
				match(T__2);
				setState(208);
				constant();
				}
				}
				setState(213);
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

	public static class CreateFunctionContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(BlkchnSqlParser.CREATE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(BlkchnSqlParser.AS, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public TerminalNode FUNCTION() { return getToken(BlkchnSqlParser.FUNCTION, 0); }
		public TerminalNode CHAINCODE() { return getToken(BlkchnSqlParser.CHAINCODE, 0); }
		public TerminalNode SMARTCONTRACT() { return getToken(BlkchnSqlParser.SMARTCONTRACT, 0); }
		public VersionContext version() {
			return getRuleContext(VersionContext.class,0);
		}
		public EndorsersFileContext endorsersFile() {
			return getRuleContext(EndorsersFileContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public CreateFlagContext createFlag() {
			return getRuleContext(CreateFlagContext.class,0);
		}
		public CreateFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterCreateFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitCreateFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitCreateFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateFunctionContext createFunction() throws RecognitionException {
		CreateFunctionContext _localctx = new CreateFunctionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_createFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(CREATE);
			setState(215);
			_la = _input.LA(1);
			if ( !(((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (CHAINCODE - 103)) | (1L << (SMARTCONTRACT - 103)) | (1L << (FUNCTION - 103)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(216);
			qualifiedName();
			setState(217);
			match(AS);
			setState(218);
			className();
			setState(220);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(219);
				version();
				}
				break;
			}
			setState(223);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(222);
				endorsersFile();
				}
				break;
			}
			setState(226);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(225);
				args();
				}
			}

			setState(229);
			_la = _input.LA(1);
			if (_la==INSTALL_ONLY || _la==INSTANTIATE_ONLY) {
				{
				setState(228);
				createFlag();
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

	public static class UpgradeFunctionContext extends ParserRuleContext {
		public TerminalNode UPGRADE() { return getToken(BlkchnSqlParser.UPGRADE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(BlkchnSqlParser.AS, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public TerminalNode FUNCTION() { return getToken(BlkchnSqlParser.FUNCTION, 0); }
		public TerminalNode CHAINCODE() { return getToken(BlkchnSqlParser.CHAINCODE, 0); }
		public TerminalNode SMARTCONTRACT() { return getToken(BlkchnSqlParser.SMARTCONTRACT, 0); }
		public VersionContext version() {
			return getRuleContext(VersionContext.class,0);
		}
		public EndorsersFileContext endorsersFile() {
			return getRuleContext(EndorsersFileContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public UpgradeFlagContext upgradeFlag() {
			return getRuleContext(UpgradeFlagContext.class,0);
		}
		public UpgradeFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_upgradeFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterUpgradeFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitUpgradeFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitUpgradeFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpgradeFunctionContext upgradeFunction() throws RecognitionException {
		UpgradeFunctionContext _localctx = new UpgradeFunctionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_upgradeFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(UPGRADE);
			setState(232);
			_la = _input.LA(1);
			if ( !(((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (CHAINCODE - 103)) | (1L << (SMARTCONTRACT - 103)) | (1L << (FUNCTION - 103)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(233);
			qualifiedName();
			setState(234);
			match(AS);
			setState(235);
			className();
			setState(237);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(236);
				version();
				}
				break;
			}
			setState(240);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(239);
				endorsersFile();
				}
				break;
			}
			setState(243);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(242);
				args();
				}
			}

			setState(246);
			_la = _input.LA(1);
			if (_la==INSTALL_ONLY || _la==UPGRADE_ONLY) {
				{
				setState(245);
				upgradeFlag();
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

	public static class CreateAssetContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(BlkchnSqlParser.CREATE, 0); }
		public AssetContext asset() {
			return getRuleContext(AssetContext.class,0);
		}
		public TerminalNode WITH() { return getToken(BlkchnSqlParser.WITH, 0); }
		public TerminalNode STORAGE() { return getToken(BlkchnSqlParser.STORAGE, 0); }
		public TerminalNode TYPE() { return getToken(BlkchnSqlParser.TYPE, 0); }
		public StorageTypeContext storageType() {
			return getRuleContext(StorageTypeContext.class,0);
		}
		public TerminalNode ASSET() { return getToken(BlkchnSqlParser.ASSET, 0); }
		public TerminalNode TABLE() { return getToken(BlkchnSqlParser.TABLE, 0); }
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public FieldDelimiterContext fieldDelimiter() {
			return getRuleContext(FieldDelimiterContext.class,0);
		}
		public RecordDelimiterContext recordDelimiter() {
			return getRuleContext(RecordDelimiterContext.class,0);
		}
		public CreateAssetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createAsset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterCreateAsset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitCreateAsset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitCreateAsset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateAssetContext createAsset() throws RecognitionException {
		CreateAssetContext _localctx = new CreateAssetContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_createAsset);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(CREATE);
			setState(249);
			_la = _input.LA(1);
			if ( !(_la==TABLE || _la==ASSET) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(250);
			asset();
			setState(255);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(251);
				match(T__0);
				setState(252);
				colTypeList();
				setState(253);
				match(T__1);
				}
			}

			setState(257);
			match(WITH);
			setState(258);
			match(STORAGE);
			setState(259);
			match(TYPE);
			setState(260);
			storageType();
			setState(262);
			_la = _input.LA(1);
			if (_la==FIELDS) {
				{
				setState(261);
				fieldDelimiter();
				}
			}

			setState(265);
			_la = _input.LA(1);
			if (_la==RECORDS) {
				{
				setState(264);
				recordDelimiter();
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

	public static class CreateFlagContext extends ParserRuleContext {
		public TerminalNode INSTALL_ONLY() { return getToken(BlkchnSqlParser.INSTALL_ONLY, 0); }
		public TerminalNode INSTANTIATE_ONLY() { return getToken(BlkchnSqlParser.INSTANTIATE_ONLY, 0); }
		public CreateFlagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createFlag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterCreateFlag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitCreateFlag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitCreateFlag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateFlagContext createFlag() throws RecognitionException {
		CreateFlagContext _localctx = new CreateFlagContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_createFlag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			_la = _input.LA(1);
			if ( !(_la==INSTALL_ONLY || _la==INSTANTIATE_ONLY) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class UpgradeFlagContext extends ParserRuleContext {
		public TerminalNode INSTALL_ONLY() { return getToken(BlkchnSqlParser.INSTALL_ONLY, 0); }
		public TerminalNode UPGRADE_ONLY() { return getToken(BlkchnSqlParser.UPGRADE_ONLY, 0); }
		public UpgradeFlagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_upgradeFlag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterUpgradeFlag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitUpgradeFlag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitUpgradeFlag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpgradeFlagContext upgradeFlag() throws RecognitionException {
		UpgradeFlagContext _localctx = new UpgradeFlagContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_upgradeFlag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			_la = _input.LA(1);
			if ( !(_la==INSTALL_ONLY || _la==UPGRADE_ONLY) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class AssetContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterAsset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitAsset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitAsset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssetContext asset() throws RecognitionException {
		AssetContext _localctx = new AssetContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_asset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			identifier();
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

	public static class StorageTypeContext extends ParserRuleContext {
		public TerminalNode JSON() { return getToken(BlkchnSqlParser.JSON, 0); }
		public TerminalNode CSV() { return getToken(BlkchnSqlParser.CSV, 0); }
		public StorageTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterStorageType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitStorageType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitStorageType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageTypeContext storageType() throws RecognitionException {
		StorageTypeContext _localctx = new StorageTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_storageType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			_la = _input.LA(1);
			if ( !(_la==JSON || _la==CSV) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class FieldDelimiterContext extends ParserRuleContext {
		public TerminalNode FIELDS() { return getToken(BlkchnSqlParser.FIELDS, 0); }
		public TerminalNode DELIMITED() { return getToken(BlkchnSqlParser.DELIMITED, 0); }
		public TerminalNode BY() { return getToken(BlkchnSqlParser.BY, 0); }
		public TerminalNode STRING() { return getToken(BlkchnSqlParser.STRING, 0); }
		public FieldDelimiterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDelimiter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterFieldDelimiter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitFieldDelimiter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitFieldDelimiter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDelimiterContext fieldDelimiter() throws RecognitionException {
		FieldDelimiterContext _localctx = new FieldDelimiterContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_fieldDelimiter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(FIELDS);
			setState(276);
			match(DELIMITED);
			setState(277);
			match(BY);
			setState(278);
			match(STRING);
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

	public static class RecordDelimiterContext extends ParserRuleContext {
		public TerminalNode RECORDS() { return getToken(BlkchnSqlParser.RECORDS, 0); }
		public TerminalNode DELIMITED() { return getToken(BlkchnSqlParser.DELIMITED, 0); }
		public TerminalNode BY() { return getToken(BlkchnSqlParser.BY, 0); }
		public TerminalNode STRING() { return getToken(BlkchnSqlParser.STRING, 0); }
		public RecordDelimiterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordDelimiter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterRecordDelimiter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitRecordDelimiter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitRecordDelimiter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordDelimiterContext recordDelimiter() throws RecognitionException {
		RecordDelimiterContext _localctx = new RecordDelimiterContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_recordDelimiter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(RECORDS);
			setState(281);
			match(DELIMITED);
			setState(282);
			match(BY);
			setState(283);
			match(STRING);
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

	public static class DeleteFunctionContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(BlkchnSqlParser.DELETE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ParameterValuesContext parameterValues() {
			return getRuleContext(ParameterValuesContext.class,0);
		}
		public DeleteFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterDeleteFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitDeleteFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitDeleteFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteFunctionContext deleteFunction() throws RecognitionException {
		DeleteFunctionContext _localctx = new DeleteFunctionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_deleteFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(DELETE);
			setState(286);
			qualifiedName();
			setState(287);
			match(T__0);
			setState(289);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << FIRST) | (1L << AFTER) | (1L << LAST) | (1L << VALUES) | (1L << CREATE) | (1L << TABLE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (IGNORE - 64)) | (1L << (IF - 64)) | (1L << (MINUS - 64)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (DIV - 130)) | (1L << (PERCENTLIT - 130)) | (1L << (OUT - 130)) | (1L << (OF - 130)) | (1L << (FUNCTION - 130)) | (1L << (DATABASE - 130)) | (1L << (DATABASES - 130)) | (1L << (TRUNCATE - 130)) | (1L << (ANALYZE - 130)) | (1L << (COMPUTE - 130)) | (1L << (LIST - 130)) | (1L << (REVOKE - 130)) | (1L << (GRANT - 130)) | (1L << (EXPORT - 130)) | (1L << (IMPORT - 130)) | (1L << (LOAD - 130)) | (1L << (ROLE - 130)) | (1L << (ROLES - 130)) | (1L << (INDEX - 130)) | (1L << (INDEXES - 130)) | (1L << (CURRENT_DATE - 130)) | (1L << (CURRENT_TIMESTAMP - 130)) | (1L << (STRING - 130)) | (1L << (BIGINT_LITERAL - 130)) | (1L << (SMALLINT_LITERAL - 130)) | (1L << (TINYINT_LITERAL - 130)) | (1L << (INTEGER_VALUE - 130)) | (1L << (DECIMAL_VALUE - 130)) | (1L << (DOUBLE_LITERAL - 130)) | (1L << (BIGDECIMAL_LITERAL - 130)) | (1L << (IDENTIFIER - 130)) | (1L << (BACKQUOTED_IDENTIFIER - 130)))) != 0)) {
				{
				setState(288);
				parameterValues();
				}
			}

			setState(291);
			match(T__1);
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

	public static class DropAssetContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(BlkchnSqlParser.DROP, 0); }
		public AssetContext asset() {
			return getRuleContext(AssetContext.class,0);
		}
		public TerminalNode ASSET() { return getToken(BlkchnSqlParser.ASSET, 0); }
		public TerminalNode TABLE() { return getToken(BlkchnSqlParser.TABLE, 0); }
		public DropAssetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropAsset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterDropAsset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitDropAsset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitDropAsset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropAssetContext dropAsset() throws RecognitionException {
		DropAssetContext _localctx = new DropAssetContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_dropAsset);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(DROP);
			setState(294);
			_la = _input.LA(1);
			if ( !(_la==TABLE || _la==ASSET) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(295);
			asset();
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

	public static class ClassNameContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(BlkchnSqlParser.STRING, 0); }
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(STRING);
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

	public static class VersionContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(BlkchnSqlParser.WITH, 0); }
		public TerminalNode VERSION() { return getToken(BlkchnSqlParser.VERSION, 0); }
		public TerminalNode STRING() { return getToken(BlkchnSqlParser.STRING, 0); }
		public VersionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_version; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterVersion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitVersion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitVersion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VersionContext version() throws RecognitionException {
		VersionContext _localctx = new VersionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_version);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(WITH);
			setState(300);
			match(VERSION);
			setState(301);
			match(STRING);
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

	public static class EndorsersFileContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(BlkchnSqlParser.WITH, 0); }
		public TerminalNode ENDORSEMENT() { return getToken(BlkchnSqlParser.ENDORSEMENT, 0); }
		public TerminalNode POLICY() { return getToken(BlkchnSqlParser.POLICY, 0); }
		public TerminalNode FILE() { return getToken(BlkchnSqlParser.FILE, 0); }
		public PolicyFileContext policyFile() {
			return getRuleContext(PolicyFileContext.class,0);
		}
		public EndorsersFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endorsersFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterEndorsersFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitEndorsersFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitEndorsersFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndorsersFileContext endorsersFile() throws RecognitionException {
		EndorsersFileContext _localctx = new EndorsersFileContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_endorsersFile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(WITH);
			setState(304);
			match(ENDORSEMENT);
			setState(305);
			match(POLICY);
			setState(306);
			match(FILE);
			setState(307);
			policyFile();
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

	public static class PolicyFileContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(BlkchnSqlParser.STRING, 0); }
		public PolicyFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_policyFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterPolicyFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitPolicyFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitPolicyFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PolicyFileContext policyFile() throws RecognitionException {
		PolicyFileContext _localctx = new PolicyFileContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_policyFile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(STRING);
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

	public static class ArgsContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(BlkchnSqlParser.WITH, 0); }
		public TerminalNode ARGS() { return getToken(BlkchnSqlParser.ARGS, 0); }
		public ArgParamSeqContext argParamSeq() {
			return getRuleContext(ArgParamSeqContext.class,0);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_args);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(WITH);
			setState(312);
			match(ARGS);
			setState(313);
			argParamSeq();
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

	public static class ArgParamSeqContext extends ParserRuleContext {
		public List<ArgParamContext> argParam() {
			return getRuleContexts(ArgParamContext.class);
		}
		public ArgParamContext argParam(int i) {
			return getRuleContext(ArgParamContext.class,i);
		}
		public ArgParamSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argParamSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterArgParamSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitArgParamSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitArgParamSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgParamSeqContext argParamSeq() throws RecognitionException {
		ArgParamSeqContext _localctx = new ArgParamSeqContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_argParamSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			argParam();
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(316);
				match(T__2);
				setState(317);
				argParam();
				}
				}
				setState(322);
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

	public static class ArgParamContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ArgParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterArgParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitArgParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitArgParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgParamContext argParam() throws RecognitionException {
		ArgParamContext _localctx = new ArgParamContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_argParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			constant();
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

	public static class CallFunctionContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(BlkchnSqlParser.CALL, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ParameterValuesContext parameterValues() {
			return getRuleContext(ParameterValuesContext.class,0);
		}
		public TerminalNode AS() { return getToken(BlkchnSqlParser.AS, 0); }
		public AssetContext asset() {
			return getRuleContext(AssetContext.class,0);
		}
		public TerminalNode ASSET() { return getToken(BlkchnSqlParser.ASSET, 0); }
		public TerminalNode TABLE() { return getToken(BlkchnSqlParser.TABLE, 0); }
		public CallFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterCallFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitCallFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitCallFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallFunctionContext callFunction() throws RecognitionException {
		CallFunctionContext _localctx = new CallFunctionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_callFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(CALL);
			setState(326);
			qualifiedName();
			setState(327);
			match(T__0);
			setState(329);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << FIRST) | (1L << AFTER) | (1L << LAST) | (1L << VALUES) | (1L << CREATE) | (1L << TABLE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (IGNORE - 64)) | (1L << (IF - 64)) | (1L << (MINUS - 64)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (DIV - 130)) | (1L << (PERCENTLIT - 130)) | (1L << (OUT - 130)) | (1L << (OF - 130)) | (1L << (FUNCTION - 130)) | (1L << (DATABASE - 130)) | (1L << (DATABASES - 130)) | (1L << (TRUNCATE - 130)) | (1L << (ANALYZE - 130)) | (1L << (COMPUTE - 130)) | (1L << (LIST - 130)) | (1L << (REVOKE - 130)) | (1L << (GRANT - 130)) | (1L << (EXPORT - 130)) | (1L << (IMPORT - 130)) | (1L << (LOAD - 130)) | (1L << (ROLE - 130)) | (1L << (ROLES - 130)) | (1L << (INDEX - 130)) | (1L << (INDEXES - 130)) | (1L << (CURRENT_DATE - 130)) | (1L << (CURRENT_TIMESTAMP - 130)) | (1L << (STRING - 130)) | (1L << (BIGINT_LITERAL - 130)) | (1L << (SMALLINT_LITERAL - 130)) | (1L << (TINYINT_LITERAL - 130)) | (1L << (INTEGER_VALUE - 130)) | (1L << (DECIMAL_VALUE - 130)) | (1L << (DOUBLE_LITERAL - 130)) | (1L << (BIGDECIMAL_LITERAL - 130)) | (1L << (IDENTIFIER - 130)) | (1L << (BACKQUOTED_IDENTIFIER - 130)))) != 0)) {
				{
				setState(328);
				parameterValues();
				}
			}

			setState(331);
			match(T__1);
			setState(335);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(332);
				match(AS);
				setState(333);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==ASSET) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(334);
				asset();
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

	public static class ParameterValuesContext extends ParserRuleContext {
		public ArgParamSeqContext argParamSeq() {
			return getRuleContext(ArgParamSeqContext.class,0);
		}
		public ParameterValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterParameterValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitParameterValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitParameterValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterValuesContext parameterValues() throws RecognitionException {
		ParameterValuesContext _localctx = new ParameterValuesContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_parameterValues);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			argParamSeq();
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

	public static class QueryContext extends ParserRuleContext {
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
	 
		public QueryContext() { }
		public void copyFrom(QueryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SimpleQueryContext extends QueryContext {
		public QueryTermContext queryTerm() {
			return getRuleContext(QueryTermContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public SimpleQueryContext(QueryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterSimpleQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitSimpleQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitSimpleQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_query);
		try {
			_localctx = new SimpleQueryContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			queryTerm(0);
			setState(340);
			queryOrganization();
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

	public static class QueryOrganizationContext extends ParserRuleContext {
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public QueryOrganizationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryOrganization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterQueryOrganization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitQueryOrganization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitQueryOrganization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryOrganizationContext queryOrganization() throws RecognitionException {
		QueryOrganizationContext _localctx = new QueryOrganizationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_queryOrganization);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(342);
				orderByClause();
				}
			}

			setState(346);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(345);
				limitClause();
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

	public static class OrderByClauseContext extends ParserRuleContext {
		public SortItemContext sortItem;
		public List<SortItemContext> order = new ArrayList<SortItemContext>();
		public TerminalNode ORDER() { return getToken(BlkchnSqlParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(BlkchnSqlParser.BY, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterOrderByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitOrderByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitOrderByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_orderByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(ORDER);
			setState(349);
			match(BY);
			setState(350);
			((OrderByClauseContext)_localctx).sortItem = sortItem();
			((OrderByClauseContext)_localctx).order.add(((OrderByClauseContext)_localctx).sortItem);
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(351);
				match(T__2);
				setState(352);
				((OrderByClauseContext)_localctx).sortItem = sortItem();
				((OrderByClauseContext)_localctx).order.add(((OrderByClauseContext)_localctx).sortItem);
				}
				}
				setState(357);
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

	public static class LimitClauseContext extends ParserRuleContext {
		public ExpressionContext limit;
		public TerminalNode LIMIT() { return getToken(BlkchnSqlParser.LIMIT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LimitClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterLimitClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitLimitClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitLimitClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitClauseContext limitClause() throws RecognitionException {
		LimitClauseContext _localctx = new LimitClauseContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_limitClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(358);
			match(LIMIT);
			setState(359);
			((LimitClauseContext)_localctx).limit = expression();
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

	public static class QueryTermContext extends ParserRuleContext {
		public QueryTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryTerm; }
	 
		public QueryTermContext() { }
		public void copyFrom(QueryTermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QueryTermDefaultContext extends QueryTermContext {
		public QueryPrimaryContext queryPrimary() {
			return getRuleContext(QueryPrimaryContext.class,0);
		}
		public QueryTermDefaultContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterQueryTermDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitQueryTermDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitQueryTermDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetOperationContext extends QueryTermContext {
		public QueryTermContext left;
		public Token operator;
		public QueryTermContext right;
		public List<QueryTermContext> queryTerm() {
			return getRuleContexts(QueryTermContext.class);
		}
		public QueryTermContext queryTerm(int i) {
			return getRuleContext(QueryTermContext.class,i);
		}
		public TerminalNode INTERSECT() { return getToken(BlkchnSqlParser.INTERSECT, 0); }
		public TerminalNode UNION() { return getToken(BlkchnSqlParser.UNION, 0); }
		public TerminalNode EXCEPT() { return getToken(BlkchnSqlParser.EXCEPT, 0); }
		public TerminalNode SETMINUS() { return getToken(BlkchnSqlParser.SETMINUS, 0); }
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public SetOperationContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterSetOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitSetOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitSetOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryTermContext queryTerm() throws RecognitionException {
		return queryTerm(0);
	}

	private QueryTermContext queryTerm(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		QueryTermContext _localctx = new QueryTermContext(_ctx, _parentState);
		QueryTermContext _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_queryTerm, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new QueryTermDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(362);
			queryPrimary();
			}
			_ctx.stop = _input.LT(-1);
			setState(372);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
					((SetOperationContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
					setState(364);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(365);
					((SetOperationContext)_localctx).operator = _input.LT(1);
					_la = _input.LA(1);
					if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (UNION - 79)) | (1L << (EXCEPT - 79)) | (1L << (SETMINUS - 79)) | (1L << (INTERSECT - 79)))) != 0)) ) {
						((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(367);
					_la = _input.LA(1);
					if (_la==ALL || _la==DISTINCT) {
						{
						setState(366);
						setQuantifier();
						}
					}

					setState(369);
					((SetOperationContext)_localctx).right = queryTerm(2);
					}
					} 
				}
				setState(374);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class QueryPrimaryContext extends ParserRuleContext {
		public QueryPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryPrimary; }
	 
		public QueryPrimaryContext() { }
		public void copyFrom(QueryPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubqueryContext extends QueryPrimaryContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QueryPrimaryDefaultContext extends QueryPrimaryContext {
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public QueryPrimaryDefaultContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterQueryPrimaryDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitQueryPrimaryDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitQueryPrimaryDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryPrimaryContext queryPrimary() throws RecognitionException {
		QueryPrimaryContext _localctx = new QueryPrimaryContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_queryPrimary);
		try {
			setState(380);
			switch (_input.LA(1)) {
			case SELECT:
				_localctx = new QueryPrimaryDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				querySpecification();
				}
				break;
			case T__0:
				_localctx = new SubqueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(376);
				match(T__0);
				setState(377);
				query();
				setState(378);
				match(T__1);
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

	public static class SortItemContext extends ParserRuleContext {
		public Token ordering;
		public Token nullOrder;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(BlkchnSqlParser.NULLS, 0); }
		public TerminalNode ASC() { return getToken(BlkchnSqlParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(BlkchnSqlParser.DESC, 0); }
		public TerminalNode LAST() { return getToken(BlkchnSqlParser.LAST, 0); }
		public TerminalNode FIRST() { return getToken(BlkchnSqlParser.FIRST, 0); }
		public SortItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterSortItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitSortItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitSortItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortItemContext sortItem() throws RecognitionException {
		SortItemContext _localctx = new SortItemContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_sortItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			expression();
			setState(384);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(383);
				((SortItemContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((SortItemContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(388);
			_la = _input.LA(1);
			if (_la==NULLS) {
				{
				setState(386);
				match(NULLS);
				setState(387);
				((SortItemContext)_localctx).nullOrder = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==LAST) ) {
					((SortItemContext)_localctx).nullOrder = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
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

	public static class QuerySpecificationContext extends ParserRuleContext {
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public QuerySpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_querySpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterQuerySpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitQuerySpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitQuerySpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuerySpecificationContext querySpecification() throws RecognitionException {
		QuerySpecificationContext _localctx = new QuerySpecificationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_querySpecification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			selectClause();
			setState(391);
			fromClause();
			setState(393);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(392);
				whereClause();
				}
				break;
			}
			setState(396);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(395);
				groupByClause();
				}
				break;
			}
			setState(399);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(398);
				havingClause();
				}
				break;
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

	public static class SelectClauseContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(BlkchnSqlParser.SELECT, 0); }
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public SelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterSelectClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitSelectClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitSelectClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_selectClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(SELECT);
			setState(403);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(402);
				setQuantifier();
				}
				break;
			}
			setState(405);
			namedExpressionSeq();
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

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(BlkchnSqlParser.WHERE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(WHERE);
			setState(408);
			booleanExpression(0);
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

	public static class HavingClauseContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(BlkchnSqlParser.HAVING, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterHavingClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitHavingClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitHavingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			match(HAVING);
			setState(411);
			booleanExpression(0);
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

	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(BlkchnSqlParser.FROM, 0); }
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitFromClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_fromClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(FROM);
			setState(414);
			relation();
			setState(419);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(415);
					match(T__2);
					setState(416);
					relation();
					}
					} 
				}
				setState(421);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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

	public static class GroupByClauseContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> groupingExpressions = new ArrayList<ExpressionContext>();
		public TerminalNode GROUP() { return getToken(BlkchnSqlParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(BlkchnSqlParser.BY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterGroupByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitGroupByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitGroupByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_groupByClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(GROUP);
			setState(423);
			match(BY);
			setState(424);
			((GroupByClauseContext)_localctx).expression = expression();
			((GroupByClauseContext)_localctx).groupingExpressions.add(((GroupByClauseContext)_localctx).expression);
			setState(429);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(425);
					match(T__2);
					setState(426);
					((GroupByClauseContext)_localctx).expression = expression();
					((GroupByClauseContext)_localctx).groupingExpressions.add(((GroupByClauseContext)_localctx).expression);
					}
					} 
				}
				setState(431);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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

	public static class SetQuantifierContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(BlkchnSqlParser.DISTINCT, 0); }
		public TerminalNode ALL() { return getToken(BlkchnSqlParser.ALL, 0); }
		public SetQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setQuantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterSetQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitSetQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitSetQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetQuantifierContext setQuantifier() throws RecognitionException {
		SetQuantifierContext _localctx = new SetQuantifierContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_setQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==DISTINCT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class RelationContext extends ParserRuleContext {
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public List<JoinRelationContext> joinRelation() {
			return getRuleContexts(JoinRelationContext.class);
		}
		public JoinRelationContext joinRelation(int i) {
			return getRuleContext(JoinRelationContext.class,i);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_relation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			relationPrimary();
			setState(438);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(435);
					joinRelation();
					}
					} 
				}
				setState(440);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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

	public static class JoinRelationContext extends ParserRuleContext {
		public RelationPrimaryContext right;
		public TerminalNode JOIN() { return getToken(BlkchnSqlParser.JOIN, 0); }
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public JoinTypeContext joinType() {
			return getRuleContext(JoinTypeContext.class,0);
		}
		public JoinCriteriaContext joinCriteria() {
			return getRuleContext(JoinCriteriaContext.class,0);
		}
		public JoinRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinRelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterJoinRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitJoinRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitJoinRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinRelationContext joinRelation() throws RecognitionException {
		JoinRelationContext _localctx = new JoinRelationContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_joinRelation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(441);
			joinType();
			}
			setState(442);
			match(JOIN);
			setState(443);
			((JoinRelationContext)_localctx).right = relationPrimary();
			setState(445);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(444);
				joinCriteria();
				}
				break;
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

	public static class JoinTypeContext extends ParserRuleContext {
		public TerminalNode INNER() { return getToken(BlkchnSqlParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(BlkchnSqlParser.CROSS, 0); }
		public TerminalNode LEFT() { return getToken(BlkchnSqlParser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(BlkchnSqlParser.OUTER, 0); }
		public TerminalNode RIGHT() { return getToken(BlkchnSqlParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(BlkchnSqlParser.FULL, 0); }
		public JoinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterJoinType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitJoinType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitJoinType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinTypeContext joinType() throws RecognitionException {
		JoinTypeContext _localctx = new JoinTypeContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_joinType);
		int _la;
		try {
			setState(463);
			switch (_input.LA(1)) {
			case JOIN:
			case INNER:
				enterOuterAlt(_localctx, 1);
				{
				setState(448);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(447);
					match(INNER);
					}
				}

				}
				break;
			case CROSS:
				enterOuterAlt(_localctx, 2);
				{
				setState(450);
				match(CROSS);
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 3);
				{
				setState(451);
				match(LEFT);
				setState(453);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(452);
					match(OUTER);
					}
				}

				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 4);
				{
				setState(455);
				match(RIGHT);
				setState(457);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(456);
					match(OUTER);
					}
				}

				}
				break;
			case FULL:
				enterOuterAlt(_localctx, 5);
				{
				setState(459);
				match(FULL);
				setState(461);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(460);
					match(OUTER);
					}
				}

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

	public static class JoinCriteriaContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(BlkchnSqlParser.ON, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public JoinCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCriteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterJoinCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitJoinCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitJoinCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinCriteriaContext joinCriteria() throws RecognitionException {
		JoinCriteriaContext _localctx = new JoinCriteriaContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_joinCriteria);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(ON);
			setState(466);
			booleanExpression(0);
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

	public static class IdentifierListContext extends ParserRuleContext {
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_identifierList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(T__0);
			setState(469);
			identifierSeq();
			setState(470);
			match(T__1);
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

	public static class IdentifierSeqContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public IdentifierSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterIdentifierSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitIdentifierSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitIdentifierSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierSeqContext identifierSeq() throws RecognitionException {
		IdentifierSeqContext _localctx = new IdentifierSeqContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_identifierSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			identifier();
			setState(477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(473);
				match(T__2);
				setState(474);
				identifier();
				}
				}
				setState(479);
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

	public static class RelationPrimaryContext extends ParserRuleContext {
		public RelationPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationPrimary; }
	 
		public RelationPrimaryContext() { }
		public void copyFrom(RelationPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InlineTableDefault2Context extends RelationPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public InlineTableDefault2Context(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterInlineTableDefault2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitInlineTableDefault2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitInlineTableDefault2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AliasedRelationContext extends RelationPrimaryContext {
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(BlkchnSqlParser.AS, 0); }
		public AliasedRelationContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterAliasedRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitAliasedRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitAliasedRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AliasedQueryContext extends RelationPrimaryContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(BlkchnSqlParser.AS, 0); }
		public AliasedQueryContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterAliasedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitAliasedQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitAliasedQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableNameContext extends RelationPrimaryContext {
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(BlkchnSqlParser.AS, 0); }
		public TableNameContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationPrimaryContext relationPrimary() throws RecognitionException {
		RelationPrimaryContext _localctx = new RelationPrimaryContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_relationPrimary);
		try {
			setState(506);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				_localctx = new TableNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(480);
				tableIdentifier();
				setState(485);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(482);
					switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
					case 1:
						{
						setState(481);
						match(AS);
						}
						break;
					}
					setState(484);
					strictIdentifier();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new AliasedQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(487);
				match(T__0);
				setState(488);
				query();
				setState(489);
				match(T__1);
				setState(494);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(491);
					switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
					case 1:
						{
						setState(490);
						match(AS);
						}
						break;
					}
					setState(493);
					strictIdentifier();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new InlineTableDefault2Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(496);
				inlineTable();
				}
				break;
			case 4:
				_localctx = new AliasedRelationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(497);
				match(T__0);
				setState(498);
				relation();
				setState(499);
				match(T__1);
				setState(504);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(501);
					switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
					case 1:
						{
						setState(500);
						match(AS);
						}
						break;
					}
					setState(503);
					strictIdentifier();
					}
					break;
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

	public static class InlineTableContext extends ParserRuleContext {
		public TerminalNode VALUES() { return getToken(BlkchnSqlParser.VALUES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(BlkchnSqlParser.AS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public InlineTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterInlineTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitInlineTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitInlineTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineTableContext inlineTable() throws RecognitionException {
		InlineTableContext _localctx = new InlineTableContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_inlineTable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			match(VALUES);
			setState(509);
			expression();
			setState(514);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(510);
					match(T__2);
					setState(511);
					expression();
					}
					} 
				}
				setState(516);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			}
			setState(524);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(518);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(517);
					match(AS);
					}
					break;
				}
				setState(520);
				identifier();
				setState(522);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(521);
					identifierList();
					}
					break;
				}
				}
				break;
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

	public static class TableIdentifierContext extends ParserRuleContext {
		public IdentifierContext db;
		public IdentifierContext table;
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitTableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitTableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableIdentifierContext tableIdentifier() throws RecognitionException {
		TableIdentifierContext _localctx = new TableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_tableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(526);
				((TableIdentifierContext)_localctx).db = identifier();
				setState(527);
				match(T__3);
				}
				break;
			}
			setState(531);
			((TableIdentifierContext)_localctx).table = identifier();
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

	public static class NamedExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode AS() { return getToken(BlkchnSqlParser.AS, 0); }
		public NamedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterNamedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitNamedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitNamedExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExpressionContext namedExpression() throws RecognitionException {
		NamedExpressionContext _localctx = new NamedExpressionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_namedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			expression();
			setState(541);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(535);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(534);
					match(AS);
					}
					break;
				}
				setState(539);
				switch (_input.LA(1)) {
				case SELECT:
				case FROM:
				case ADD:
				case AS:
				case ALL:
				case DISTINCT:
				case WHERE:
				case GROUP:
				case BY:
				case GROUPING:
				case SETS:
				case CUBE:
				case ROLLUP:
				case ORDER:
				case HAVING:
				case LIMIT:
				case AT:
				case OR:
				case AND:
				case IN:
				case NOT:
				case NO:
				case EXISTS:
				case BETWEEN:
				case LIKE:
				case RLIKE:
				case IS:
				case NULL:
				case TRUE:
				case FALSE:
				case NULLS:
				case ASC:
				case DESC:
				case FOR:
				case INTERVAL:
				case CASE:
				case WHEN:
				case THEN:
				case ELSE:
				case END:
				case JOIN:
				case CROSS:
				case OUTER:
				case INNER:
				case LEFT:
				case SEMI:
				case RIGHT:
				case FULL:
				case NATURAL:
				case ON:
				case FIRST:
				case AFTER:
				case LAST:
				case VALUES:
				case CREATE:
				case TABLE:
				case VIEW:
				case REPLACE:
				case INSERT:
				case DELETE:
				case INTO:
				case DESCRIBE:
				case EXPLAIN:
				case CAST:
				case SHOW:
				case TABLES:
				case COLUMNS:
				case COLUMN:
				case USE:
				case FUNCTIONS:
				case DROP:
				case UNION:
				case EXCEPT:
				case SETMINUS:
				case INTERSECT:
				case TO:
				case ALTER:
				case RENAME:
				case ARRAY:
				case MAP:
				case STRUCT:
				case COMMENT:
				case SET:
				case RESET:
				case COMMIT:
				case ROLLBACK:
				case IGNORE:
				case IF:
				case DIV:
				case PERCENTLIT:
				case OUT:
				case OF:
				case FUNCTION:
				case DATABASE:
				case DATABASES:
				case TRUNCATE:
				case ANALYZE:
				case COMPUTE:
				case LIST:
				case REVOKE:
				case GRANT:
				case EXPORT:
				case IMPORT:
				case LOAD:
				case ROLE:
				case ROLES:
				case INDEX:
				case INDEXES:
				case CURRENT_DATE:
				case CURRENT_TIMESTAMP:
				case IDENTIFIER:
				case BACKQUOTED_IDENTIFIER:
					{
					setState(537);
					identifier();
					}
					break;
				case T__0:
					{
					setState(538);
					identifierList();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
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

	public static class NamedExpressionSeqContext extends ParserRuleContext {
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public NamedExpressionSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpressionSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterNamedExpressionSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitNamedExpressionSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitNamedExpressionSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExpressionSeqContext namedExpressionSeq() throws RecognitionException {
		NamedExpressionSeqContext _localctx = new NamedExpressionSeqContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_namedExpressionSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			namedExpression();
			setState(548);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(544);
				match(T__2);
				setState(545);
				namedExpression();
				}
				}
				setState(550);
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

	public static class ExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			booleanExpression(0);
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
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
	 
		public BooleanExpressionContext() { }
		public void copyFrom(BooleanExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalNotContext extends BooleanExpressionContext {
		public TerminalNode NOT() { return getToken(BlkchnSqlParser.NOT, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public LogicalNotContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterLogicalNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitLogicalNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitLogicalNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanDefaultContext extends BooleanExpressionContext {
		public PredicatedContext predicated() {
			return getRuleContext(PredicatedContext.class,0);
		}
		public BooleanDefaultContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterBooleanDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitBooleanDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitBooleanDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalBinaryContext extends BooleanExpressionContext {
		public BooleanExpressionContext left;
		public Token operator;
		public BooleanExpressionContext right;
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(BlkchnSqlParser.AND, 0); }
		public TerminalNode OR() { return getToken(BlkchnSqlParser.OR, 0); }
		public LogicalBinaryContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterLogicalBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitLogicalBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitLogicalBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		return booleanExpression(0);
	}

	private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
		BooleanExpressionContext _prevctx = _localctx;
		int _startState = 110;
		enterRecursionRule(_localctx, 110, RULE_booleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				_localctx = new LogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(554);
				match(NOT);
				setState(555);
				booleanExpression(4);
				}
				break;
			case 2:
				{
				_localctx = new BooleanDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(556);
				predicated();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(567);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(565);
					switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(559);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(560);
						((LogicalBinaryContext)_localctx).operator = match(AND);
						setState(561);
						((LogicalBinaryContext)_localctx).right = booleanExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(562);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(563);
						((LogicalBinaryContext)_localctx).operator = match(OR);
						setState(564);
						((LogicalBinaryContext)_localctx).right = booleanExpression(2);
						}
						break;
					}
					} 
				}
				setState(569);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PredicatedContext extends ParserRuleContext {
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicatedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicated; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterPredicated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitPredicated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitPredicated(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicatedContext predicated() throws RecognitionException {
		PredicatedContext _localctx = new PredicatedContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_predicated);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			valueExpression(0);
			setState(572);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(571);
				predicate();
				}
				break;
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

	public static class PredicateContext extends ParserRuleContext {
		public Token kind;
		public ValueExpressionContext lower;
		public ValueExpressionContext upper;
		public ValueExpressionContext pattern;
		public TerminalNode AND() { return getToken(BlkchnSqlParser.AND, 0); }
		public TerminalNode BETWEEN() { return getToken(BlkchnSqlParser.BETWEEN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(BlkchnSqlParser.NOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IN() { return getToken(BlkchnSqlParser.IN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RLIKE() { return getToken(BlkchnSqlParser.RLIKE, 0); }
		public TerminalNode LIKE() { return getToken(BlkchnSqlParser.LIKE, 0); }
		public TerminalNode IS() { return getToken(BlkchnSqlParser.IS, 0); }
		public TerminalNode NULL() { return getToken(BlkchnSqlParser.NULL, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_predicate);
		int _la;
		try {
			setState(615);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(575);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(574);
					match(NOT);
					}
				}

				setState(577);
				((PredicateContext)_localctx).kind = match(BETWEEN);
				setState(578);
				((PredicateContext)_localctx).lower = valueExpression(0);
				setState(579);
				match(AND);
				setState(580);
				((PredicateContext)_localctx).upper = valueExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(583);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(582);
					match(NOT);
					}
				}

				setState(585);
				((PredicateContext)_localctx).kind = match(IN);
				setState(586);
				match(T__0);
				setState(587);
				expression();
				setState(592);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(588);
					match(T__2);
					setState(589);
					expression();
					}
					}
					setState(594);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(595);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(598);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(597);
					match(NOT);
					}
				}

				setState(600);
				((PredicateContext)_localctx).kind = match(IN);
				setState(601);
				match(T__0);
				setState(602);
				query();
				setState(603);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(606);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(605);
					match(NOT);
					}
				}

				setState(608);
				((PredicateContext)_localctx).kind = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LIKE || _la==RLIKE) ) {
					((PredicateContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(609);
				((PredicateContext)_localctx).pattern = valueExpression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(610);
				match(IS);
				setState(612);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(611);
					match(NOT);
					}
				}

				setState(614);
				((PredicateContext)_localctx).kind = match(NULL);
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

	public static class ValueExpressionContext extends ParserRuleContext {
		public ValueExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpression; }
	 
		public ValueExpressionContext() { }
		public void copyFrom(ValueExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValueExpressionDefaultContext extends ValueExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionDefaultContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterValueExpressionDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitValueExpressionDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitValueExpressionDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public ValueExpressionContext right;
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public ComparisonContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticBinaryContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public Token operator;
		public ValueExpressionContext right;
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(BlkchnSqlParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(BlkchnSqlParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(BlkchnSqlParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(BlkchnSqlParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(BlkchnSqlParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(BlkchnSqlParser.MINUS, 0); }
		public TerminalNode AMPERSAND() { return getToken(BlkchnSqlParser.AMPERSAND, 0); }
		public TerminalNode HAT() { return getToken(BlkchnSqlParser.HAT, 0); }
		public TerminalNode PIPE() { return getToken(BlkchnSqlParser.PIPE, 0); }
		public ArithmeticBinaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterArithmeticBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitArithmeticBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitArithmeticBinary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticUnaryContext extends ValueExpressionContext {
		public Token operator;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(BlkchnSqlParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(BlkchnSqlParser.TILDE, 0); }
		public ArithmeticUnaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterArithmeticUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitArithmeticUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitArithmeticUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueExpressionContext valueExpression() throws RecognitionException {
		return valueExpression(0);
	}

	private ValueExpressionContext valueExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, _parentState);
		ValueExpressionContext _prevctx = _localctx;
		int _startState = 116;
		enterRecursionRule(_localctx, 116, RULE_valueExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			switch (_input.LA(1)) {
			case PLUS:
			case TILDE:
				{
				_localctx = new ArithmeticUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(618);
				((ArithmeticUnaryContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==TILDE) ) {
					((ArithmeticUnaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(619);
				valueExpression(7);
				}
				break;
			case T__0:
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case JOIN:
			case CROSS:
			case OUTER:
			case INNER:
			case LEFT:
			case SEMI:
			case RIGHT:
			case FULL:
			case NATURAL:
			case ON:
			case FIRST:
			case AFTER:
			case LAST:
			case VALUES:
			case CREATE:
			case TABLE:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case FUNCTIONS:
			case DROP:
			case UNION:
			case EXCEPT:
			case SETMINUS:
			case INTERSECT:
			case TO:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case COMMIT:
			case ROLLBACK:
			case IGNORE:
			case IF:
			case MINUS:
			case ASTERISK:
			case DIV:
			case PERCENTLIT:
			case OUT:
			case OF:
			case FUNCTION:
			case DATABASE:
			case DATABASES:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case REVOKE:
			case GRANT:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case INDEX:
			case INDEXES:
			case CURRENT_DATE:
			case CURRENT_TIMESTAMP:
			case STRING:
			case BIGINT_LITERAL:
			case SMALLINT_LITERAL:
			case TINYINT_LITERAL:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
			case DOUBLE_LITERAL:
			case BIGDECIMAL_LITERAL:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				{
				_localctx = new ValueExpressionDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(620);
				primaryExpression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(644);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(642);
					switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(623);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(624);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 127)) & ~0x3f) == 0 && ((1L << (_la - 127)) & ((1L << (ASTERISK - 127)) | (1L << (SLASH - 127)) | (1L << (PERCENT - 127)) | (1L << (DIV - 127)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(625);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(626);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(627);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(628);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(6);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(629);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(630);
						((ArithmeticBinaryContext)_localctx).operator = match(AMPERSAND);
						setState(631);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(5);
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(632);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(633);
						((ArithmeticBinaryContext)_localctx).operator = match(HAT);
						setState(634);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(4);
						}
						break;
					case 5:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(635);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(636);
						((ArithmeticBinaryContext)_localctx).operator = match(PIPE);
						setState(637);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(3);
						}
						break;
					case 6:
						{
						_localctx = new ComparisonContext(new ValueExpressionContext(_parentctx, _parentState));
						((ComparisonContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(638);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(639);
						comparisonOperator();
						setState(640);
						((ComparisonContext)_localctx).right = valueExpression(2);
						}
						break;
					}
					} 
				}
				setState(646);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DereferenceContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext base;
		public IdentifierContext fieldName;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DereferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterDereference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitDereference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitDereference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleCaseContext extends PrimaryExpressionContext {
		public ExpressionContext value;
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(BlkchnSqlParser.CASE, 0); }
		public TerminalNode END() { return getToken(BlkchnSqlParser.END, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(BlkchnSqlParser.ELSE, 0); }
		public SimpleCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterSimpleCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitSimpleCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitSimpleCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnReferenceContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnReferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterColumnReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitColumnReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitColumnReference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RowConstructorContext extends PrimaryExpressionContext {
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public RowConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterRowConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitRowConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitRowConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LastContext extends PrimaryExpressionContext {
		public TerminalNode LAST() { return getToken(BlkchnSqlParser.LAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(BlkchnSqlParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(BlkchnSqlParser.NULLS, 0); }
		public LastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterLast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitLast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitLast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StarContext extends PrimaryExpressionContext {
		public TerminalNode ASTERISK() { return getToken(BlkchnSqlParser.ASTERISK, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public StarContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitStar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubscriptContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext value;
		public ValueExpressionContext index;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public SubscriptContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitSubscript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitSubscript(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TimeFunctionCallContext extends PrimaryExpressionContext {
		public Token name;
		public TerminalNode CURRENT_DATE() { return getToken(BlkchnSqlParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(BlkchnSqlParser.CURRENT_TIMESTAMP, 0); }
		public TimeFunctionCallContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterTimeFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitTimeFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitTimeFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubqueryExpressionContext extends PrimaryExpressionContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterSubqueryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitSubqueryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitSubqueryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CastContext extends PrimaryExpressionContext {
		public TerminalNode CAST() { return getToken(BlkchnSqlParser.CAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(BlkchnSqlParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public CastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitCast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantDefaultContext extends PrimaryExpressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantDefaultContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterConstantDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitConstantDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitConstantDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesizedExpressionContext extends PrimaryExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesizedExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends PrimaryExpressionContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public FunctionCallContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SearchedCaseContext extends PrimaryExpressionContext {
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(BlkchnSqlParser.CASE, 0); }
		public TerminalNode END() { return getToken(BlkchnSqlParser.END, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(BlkchnSqlParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SearchedCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterSearchedCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitSearchedCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitSearchedCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FirstContext extends PrimaryExpressionContext {
		public TerminalNode FIRST() { return getToken(BlkchnSqlParser.FIRST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(BlkchnSqlParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(BlkchnSqlParser.NULLS, 0); }
		public FirstContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterFirst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitFirst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitFirst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		return primaryExpression(0);
	}

	private PrimaryExpressionContext primaryExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, _parentState);
		PrimaryExpressionContext _prevctx = _localctx;
		int _startState = 118;
		enterRecursionRule(_localctx, 118, RULE_primaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				_localctx = new TimeFunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(648);
				((TimeFunctionCallContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==CURRENT_DATE || _la==CURRENT_TIMESTAMP) ) {
					((TimeFunctionCallContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case 2:
				{
				_localctx = new SearchedCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(649);
				match(CASE);
				setState(651); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(650);
					whenClause();
					}
					}
					setState(653); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(657);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(655);
					match(ELSE);
					setState(656);
					((SearchedCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(659);
				match(END);
				}
				break;
			case 3:
				{
				_localctx = new SimpleCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(661);
				match(CASE);
				setState(662);
				((SimpleCaseContext)_localctx).value = expression();
				setState(664); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(663);
					whenClause();
					}
					}
					setState(666); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(670);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(668);
					match(ELSE);
					setState(669);
					((SimpleCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(672);
				match(END);
				}
				break;
			case 4:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(674);
				match(CAST);
				setState(675);
				match(T__0);
				setState(676);
				expression();
				setState(677);
				match(AS);
				setState(678);
				dataType();
				setState(679);
				match(T__1);
				}
				break;
			case 5:
				{
				_localctx = new FirstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(681);
				match(FIRST);
				setState(682);
				match(T__0);
				setState(683);
				expression();
				setState(686);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(684);
					match(IGNORE);
					setState(685);
					match(NULLS);
					}
				}

				setState(688);
				match(T__1);
				}
				break;
			case 6:
				{
				_localctx = new LastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(690);
				match(LAST);
				setState(691);
				match(T__0);
				setState(692);
				expression();
				setState(695);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(693);
					match(IGNORE);
					setState(694);
					match(NULLS);
					}
				}

				setState(697);
				match(T__1);
				}
				break;
			case 7:
				{
				_localctx = new ConstantDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(699);
				constant();
				}
				break;
			case 8:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(700);
				match(ASTERISK);
				}
				break;
			case 9:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(701);
				qualifiedName();
				setState(702);
				match(T__3);
				setState(703);
				match(ASTERISK);
				}
				break;
			case 10:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(705);
				match(T__0);
				setState(706);
				namedExpression();
				setState(709); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(707);
					match(T__2);
					setState(708);
					namedExpression();
					}
					}
					setState(711); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__2 );
				setState(713);
				match(T__1);
				}
				break;
			case 11:
				{
				_localctx = new SubqueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(715);
				match(T__0);
				setState(716);
				query();
				setState(717);
				match(T__1);
				}
				break;
			case 12:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(719);
				qualifiedName();
				setState(720);
				match(T__0);
				setState(732);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << FIRST) | (1L << AFTER) | (1L << LAST) | (1L << VALUES) | (1L << CREATE) | (1L << TABLE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (IGNORE - 64)) | (1L << (IF - 64)) | (1L << (PLUS - 64)) | (1L << (MINUS - 64)) | (1L << (ASTERISK - 64)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (DIV - 130)) | (1L << (TILDE - 130)) | (1L << (PERCENTLIT - 130)) | (1L << (OUT - 130)) | (1L << (OF - 130)) | (1L << (FUNCTION - 130)) | (1L << (DATABASE - 130)) | (1L << (DATABASES - 130)) | (1L << (TRUNCATE - 130)) | (1L << (ANALYZE - 130)) | (1L << (COMPUTE - 130)) | (1L << (LIST - 130)) | (1L << (REVOKE - 130)) | (1L << (GRANT - 130)) | (1L << (EXPORT - 130)) | (1L << (IMPORT - 130)) | (1L << (LOAD - 130)) | (1L << (ROLE - 130)) | (1L << (ROLES - 130)) | (1L << (INDEX - 130)) | (1L << (INDEXES - 130)) | (1L << (CURRENT_DATE - 130)) | (1L << (CURRENT_TIMESTAMP - 130)) | (1L << (STRING - 130)) | (1L << (BIGINT_LITERAL - 130)) | (1L << (SMALLINT_LITERAL - 130)) | (1L << (TINYINT_LITERAL - 130)) | (1L << (INTEGER_VALUE - 130)) | (1L << (DECIMAL_VALUE - 130)) | (1L << (DOUBLE_LITERAL - 130)) | (1L << (BIGDECIMAL_LITERAL - 130)) | (1L << (IDENTIFIER - 130)) | (1L << (BACKQUOTED_IDENTIFIER - 130)))) != 0)) {
					{
					setState(722);
					switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
					case 1:
						{
						setState(721);
						setQuantifier();
						}
						break;
					}
					setState(724);
					namedExpression();
					setState(729);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(725);
						match(T__2);
						setState(726);
						namedExpression();
						}
						}
						setState(731);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(734);
				match(T__1);
				}
				break;
			case 13:
				{
				_localctx = new ColumnReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(736);
				identifier();
				}
				break;
			case 14:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(737);
				match(T__0);
				setState(738);
				expression();
				setState(739);
				match(T__1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(753);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(751);
					switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
					case 1:
						{
						_localctx = new SubscriptContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((SubscriptContext)_localctx).value = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(743);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(744);
						match(T__4);
						setState(745);
						((SubscriptContext)_localctx).index = valueExpression(0);
						setState(746);
						match(T__5);
						}
						break;
					case 2:
						{
						_localctx = new DereferenceContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((DereferenceContext)_localctx).base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(748);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(749);
						match(T__3);
						setState(750);
						((DereferenceContext)_localctx).fieldName = identifier();
						}
						break;
					}
					} 
				}
				setState(755);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	 
		public ConstantContext() { }
		public void copyFrom(ConstantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NullLiteralContext extends ConstantContext {
		public TerminalNode NULL() { return getToken(BlkchnSqlParser.NULL, 0); }
		public NullLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLiteralContext extends ConstantContext {
		public List<TerminalNode> STRING() { return getTokens(BlkchnSqlParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(BlkchnSqlParser.STRING, i);
		}
		public StringLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeConstructorContext extends ConstantContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(BlkchnSqlParser.STRING, 0); }
		public TypeConstructorContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterTypeConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitTypeConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitTypeConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntervalLiteralContext extends ConstantContext {
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public IntervalLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterIntervalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitIntervalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitIntervalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericLiteralContext extends ConstantContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumericLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitNumericLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLiteralContext extends ConstantContext {
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public BooleanLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_constant);
		try {
			int _alt;
			setState(768);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(756);
				match(NULL);
				}
				break;
			case 2:
				_localctx = new IntervalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(757);
				interval();
				}
				break;
			case 3:
				_localctx = new TypeConstructorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(758);
				identifier();
				setState(759);
				match(STRING);
				}
				break;
			case 4:
				_localctx = new NumericLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(761);
				number();
				}
				break;
			case 5:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(762);
				booleanValue();
				}
				break;
			case 6:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(764); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(763);
						match(STRING);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(766); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(BlkchnSqlParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(BlkchnSqlParser.NEQ, 0); }
		public TerminalNode NEQJ() { return getToken(BlkchnSqlParser.NEQJ, 0); }
		public TerminalNode LT() { return getToken(BlkchnSqlParser.LT, 0); }
		public TerminalNode LTE() { return getToken(BlkchnSqlParser.LTE, 0); }
		public TerminalNode GT() { return getToken(BlkchnSqlParser.GT, 0); }
		public TerminalNode GTE() { return getToken(BlkchnSqlParser.GTE, 0); }
		public TerminalNode NSEQ() { return getToken(BlkchnSqlParser.NSEQ, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(770);
			_la = _input.LA(1);
			if ( !(((((_la - 117)) & ~0x3f) == 0 && ((1L << (_la - 117)) & ((1L << (EQ - 117)) | (1L << (NSEQ - 117)) | (1L << (NEQ - 117)) | (1L << (NEQJ - 117)) | (1L << (LT - 117)) | (1L << (LTE - 117)) | (1L << (GT - 117)) | (1L << (GTE - 117)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class ArithmeticOperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(BlkchnSqlParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(BlkchnSqlParser.MINUS, 0); }
		public TerminalNode ASTERISK() { return getToken(BlkchnSqlParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(BlkchnSqlParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(BlkchnSqlParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(BlkchnSqlParser.DIV, 0); }
		public TerminalNode TILDE() { return getToken(BlkchnSqlParser.TILDE, 0); }
		public TerminalNode AMPERSAND() { return getToken(BlkchnSqlParser.AMPERSAND, 0); }
		public TerminalNode PIPE() { return getToken(BlkchnSqlParser.PIPE, 0); }
		public TerminalNode HAT() { return getToken(BlkchnSqlParser.HAT, 0); }
		public ArithmeticOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterArithmeticOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitArithmeticOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitArithmeticOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticOperatorContext arithmeticOperator() throws RecognitionException {
		ArithmeticOperatorContext _localctx = new ArithmeticOperatorContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_arithmeticOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(772);
			_la = _input.LA(1);
			if ( !(((((_la - 125)) & ~0x3f) == 0 && ((1L << (_la - 125)) & ((1L << (PLUS - 125)) | (1L << (MINUS - 125)) | (1L << (ASTERISK - 125)) | (1L << (SLASH - 125)) | (1L << (PERCENT - 125)) | (1L << (DIV - 125)) | (1L << (TILDE - 125)) | (1L << (AMPERSAND - 125)) | (1L << (PIPE - 125)) | (1L << (HAT - 125)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class PredicateOperatorContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(BlkchnSqlParser.OR, 0); }
		public TerminalNode AND() { return getToken(BlkchnSqlParser.AND, 0); }
		public TerminalNode IN() { return getToken(BlkchnSqlParser.IN, 0); }
		public TerminalNode NOT() { return getToken(BlkchnSqlParser.NOT, 0); }
		public PredicateOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterPredicateOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitPredicateOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitPredicateOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateOperatorContext predicateOperator() throws RecognitionException {
		PredicateOperatorContext _localctx = new PredicateOperatorContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_predicateOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(774);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class BooleanValueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(BlkchnSqlParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(BlkchnSqlParser.FALSE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(776);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class IntervalContext extends ParserRuleContext {
		public TerminalNode INTERVAL() { return getToken(BlkchnSqlParser.INTERVAL, 0); }
		public List<IntervalFieldContext> intervalField() {
			return getRuleContexts(IntervalFieldContext.class);
		}
		public IntervalFieldContext intervalField(int i) {
			return getRuleContext(IntervalFieldContext.class,i);
		}
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_interval);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
			match(INTERVAL);
			setState(782);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(779);
					intervalField();
					}
					} 
				}
				setState(784);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
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

	public static class IntervalFieldContext extends ParserRuleContext {
		public IntervalValueContext value;
		public IdentifierContext unit;
		public IdentifierContext to;
		public IntervalValueContext intervalValue() {
			return getRuleContext(IntervalValueContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode TO() { return getToken(BlkchnSqlParser.TO, 0); }
		public IntervalFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterIntervalField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitIntervalField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitIntervalField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalFieldContext intervalField() throws RecognitionException {
		IntervalFieldContext _localctx = new IntervalFieldContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_intervalField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(785);
			((IntervalFieldContext)_localctx).value = intervalValue();
			setState(786);
			((IntervalFieldContext)_localctx).unit = identifier();
			setState(789);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(787);
				match(TO);
				setState(788);
				((IntervalFieldContext)_localctx).to = identifier();
				}
				break;
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

	public static class IntervalValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(BlkchnSqlParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(BlkchnSqlParser.DECIMAL_VALUE, 0); }
		public TerminalNode PLUS() { return getToken(BlkchnSqlParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(BlkchnSqlParser.MINUS, 0); }
		public TerminalNode STRING() { return getToken(BlkchnSqlParser.STRING, 0); }
		public IntervalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterIntervalValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitIntervalValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitIntervalValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalValueContext intervalValue() throws RecognitionException {
		IntervalValueContext _localctx = new IntervalValueContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_intervalValue);
		int _la;
		try {
			setState(796);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(792);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(791);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(794);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(795);
				match(STRING);
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

	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	 
		public DataTypeContext() { }
		public void copyFrom(DataTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComplexDataTypeContext extends DataTypeContext {
		public Token complex;
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public TerminalNode ARRAY() { return getToken(BlkchnSqlParser.ARRAY, 0); }
		public TerminalNode MAP() { return getToken(BlkchnSqlParser.MAP, 0); }
		public TerminalNode STRUCT() { return getToken(BlkchnSqlParser.STRUCT, 0); }
		public TerminalNode NEQ() { return getToken(BlkchnSqlParser.NEQ, 0); }
		public ComplexColTypeListContext complexColTypeList() {
			return getRuleContext(ComplexColTypeListContext.class,0);
		}
		public ComplexDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterComplexDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitComplexDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitComplexDataType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimitiveDataTypeContext extends DataTypeContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(BlkchnSqlParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(BlkchnSqlParser.INTEGER_VALUE, i);
		}
		public PrimitiveDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterPrimitiveDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitPrimitiveDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitPrimitiveDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_dataType);
		int _la;
		try {
			setState(832);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(798);
				((ComplexDataTypeContext)_localctx).complex = match(ARRAY);
				setState(799);
				match(LT);
				setState(800);
				dataType();
				setState(801);
				match(GT);
				}
				break;
			case 2:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(803);
				((ComplexDataTypeContext)_localctx).complex = match(MAP);
				setState(804);
				match(LT);
				setState(805);
				dataType();
				setState(806);
				match(T__2);
				setState(807);
				dataType();
				setState(808);
				match(GT);
				}
				break;
			case 3:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(810);
				((ComplexDataTypeContext)_localctx).complex = match(STRUCT);
				setState(817);
				switch (_input.LA(1)) {
				case LT:
					{
					setState(811);
					match(LT);
					setState(813);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << FIRST) | (1L << AFTER) | (1L << LAST) | (1L << VALUES) | (1L << CREATE) | (1L << TABLE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (IGNORE - 64)) | (1L << (IF - 64)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (DIV - 130)) | (1L << (PERCENTLIT - 130)) | (1L << (OUT - 130)) | (1L << (OF - 130)) | (1L << (FUNCTION - 130)) | (1L << (DATABASE - 130)) | (1L << (DATABASES - 130)) | (1L << (TRUNCATE - 130)) | (1L << (ANALYZE - 130)) | (1L << (COMPUTE - 130)) | (1L << (LIST - 130)) | (1L << (REVOKE - 130)) | (1L << (GRANT - 130)) | (1L << (EXPORT - 130)) | (1L << (IMPORT - 130)) | (1L << (LOAD - 130)) | (1L << (ROLE - 130)) | (1L << (ROLES - 130)) | (1L << (INDEX - 130)) | (1L << (INDEXES - 130)) | (1L << (CURRENT_DATE - 130)) | (1L << (CURRENT_TIMESTAMP - 130)) | (1L << (IDENTIFIER - 130)) | (1L << (BACKQUOTED_IDENTIFIER - 130)))) != 0)) {
						{
						setState(812);
						complexColTypeList();
						}
					}

					setState(815);
					match(GT);
					}
					break;
				case NEQ:
					{
					setState(816);
					match(NEQ);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				_localctx = new PrimitiveDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(819);
				identifier();
				setState(830);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(820);
					match(T__0);
					setState(821);
					match(INTEGER_VALUE);
					setState(826);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(822);
						match(T__2);
						setState(823);
						match(INTEGER_VALUE);
						}
						}
						setState(828);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(829);
					match(T__1);
					}
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

	public static class ColTypeListContext extends ParserRuleContext {
		public List<ColTypeContext> colType() {
			return getRuleContexts(ColTypeContext.class);
		}
		public ColTypeContext colType(int i) {
			return getRuleContext(ColTypeContext.class,i);
		}
		public ColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitColTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitColTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColTypeListContext colTypeList() throws RecognitionException {
		ColTypeListContext _localctx = new ColTypeListContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_colTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(834);
			colType();
			setState(839);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(835);
				match(T__2);
				setState(836);
				colType();
				}
				}
				setState(841);
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

	public static class ColTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(BlkchnSqlParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(BlkchnSqlParser.STRING, 0); }
		public ColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitColType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitColType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColTypeContext colType() throws RecognitionException {
		ColTypeContext _localctx = new ColTypeContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_colType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
			identifier();
			setState(843);
			dataType();
			setState(846);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(844);
				match(COMMENT);
				setState(845);
				match(STRING);
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

	public static class ComplexColTypeListContext extends ParserRuleContext {
		public List<ComplexColTypeContext> complexColType() {
			return getRuleContexts(ComplexColTypeContext.class);
		}
		public ComplexColTypeContext complexColType(int i) {
			return getRuleContext(ComplexColTypeContext.class,i);
		}
		public ComplexColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexColTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterComplexColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitComplexColTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitComplexColTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexColTypeListContext complexColTypeList() throws RecognitionException {
		ComplexColTypeListContext _localctx = new ComplexColTypeListContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_complexColTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(848);
			complexColType();
			setState(853);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(849);
				match(T__2);
				setState(850);
				complexColType();
				}
				}
				setState(855);
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

	public static class ComplexColTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(BlkchnSqlParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(BlkchnSqlParser.STRING, 0); }
		public ComplexColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexColType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterComplexColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitComplexColType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitComplexColType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexColTypeContext complexColType() throws RecognitionException {
		ComplexColTypeContext _localctx = new ComplexColTypeContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_complexColType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(856);
			identifier();
			setState(857);
			match(T__6);
			setState(858);
			dataType();
			setState(861);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(859);
				match(COMMENT);
				setState(860);
				match(STRING);
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

	public static class WhenClauseContext extends ParserRuleContext {
		public ExpressionContext condition;
		public ExpressionContext result;
		public TerminalNode WHEN() { return getToken(BlkchnSqlParser.WHEN, 0); }
		public TerminalNode THEN() { return getToken(BlkchnSqlParser.THEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WhenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterWhenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitWhenClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitWhenClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenClauseContext whenClause() throws RecognitionException {
		WhenClauseContext _localctx = new WhenClauseContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(863);
			match(WHEN);
			setState(864);
			((WhenClauseContext)_localctx).condition = expression();
			setState(865);
			match(THEN);
			setState(866);
			((WhenClauseContext)_localctx).result = expression();
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

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(868);
			identifier();
			setState(873);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(869);
					match(T__3);
					setState(870);
					identifier();
					}
					} 
				}
				setState(875);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
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

	public static class IdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode FULL() { return getToken(BlkchnSqlParser.FULL, 0); }
		public TerminalNode INNER() { return getToken(BlkchnSqlParser.INNER, 0); }
		public TerminalNode LEFT() { return getToken(BlkchnSqlParser.LEFT, 0); }
		public TerminalNode SEMI() { return getToken(BlkchnSqlParser.SEMI, 0); }
		public TerminalNode RIGHT() { return getToken(BlkchnSqlParser.RIGHT, 0); }
		public TerminalNode NATURAL() { return getToken(BlkchnSqlParser.NATURAL, 0); }
		public TerminalNode JOIN() { return getToken(BlkchnSqlParser.JOIN, 0); }
		public TerminalNode CROSS() { return getToken(BlkchnSqlParser.CROSS, 0); }
		public TerminalNode ON() { return getToken(BlkchnSqlParser.ON, 0); }
		public TerminalNode UNION() { return getToken(BlkchnSqlParser.UNION, 0); }
		public TerminalNode INTERSECT() { return getToken(BlkchnSqlParser.INTERSECT, 0); }
		public TerminalNode EXCEPT() { return getToken(BlkchnSqlParser.EXCEPT, 0); }
		public TerminalNode SETMINUS() { return getToken(BlkchnSqlParser.SETMINUS, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_identifier);
		try {
			setState(890);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case OUTER:
			case FIRST:
			case AFTER:
			case LAST:
			case VALUES:
			case CREATE:
			case TABLE:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case FUNCTIONS:
			case DROP:
			case TO:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case COMMIT:
			case ROLLBACK:
			case IGNORE:
			case IF:
			case DIV:
			case PERCENTLIT:
			case OUT:
			case OF:
			case FUNCTION:
			case DATABASE:
			case DATABASES:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case REVOKE:
			case GRANT:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case INDEX:
			case INDEXES:
			case CURRENT_DATE:
			case CURRENT_TIMESTAMP:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(876);
				strictIdentifier();
				}
				break;
			case FULL:
				enterOuterAlt(_localctx, 2);
				{
				setState(877);
				match(FULL);
				}
				break;
			case INNER:
				enterOuterAlt(_localctx, 3);
				{
				setState(878);
				match(INNER);
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 4);
				{
				setState(879);
				match(LEFT);
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 5);
				{
				setState(880);
				match(SEMI);
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 6);
				{
				setState(881);
				match(RIGHT);
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(882);
				match(NATURAL);
				}
				break;
			case JOIN:
				enterOuterAlt(_localctx, 8);
				{
				setState(883);
				match(JOIN);
				}
				break;
			case CROSS:
				enterOuterAlt(_localctx, 9);
				{
				setState(884);
				match(CROSS);
				}
				break;
			case ON:
				enterOuterAlt(_localctx, 10);
				{
				setState(885);
				match(ON);
				}
				break;
			case UNION:
				enterOuterAlt(_localctx, 11);
				{
				setState(886);
				match(UNION);
				}
				break;
			case INTERSECT:
				enterOuterAlt(_localctx, 12);
				{
				setState(887);
				match(INTERSECT);
				}
				break;
			case EXCEPT:
				enterOuterAlt(_localctx, 13);
				{
				setState(888);
				match(EXCEPT);
				}
				break;
			case SETMINUS:
				enterOuterAlt(_localctx, 14);
				{
				setState(889);
				match(SETMINUS);
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

	public static class StrictIdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strictIdentifier; }
	 
		public StrictIdentifierContext() { }
		public void copyFrom(StrictIdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QuotedIdentifierAlternativeContext extends StrictIdentifierContext {
		public QuotedIdentifierContext quotedIdentifier() {
			return getRuleContext(QuotedIdentifierContext.class,0);
		}
		public QuotedIdentifierAlternativeContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterQuotedIdentifierAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitQuotedIdentifierAlternative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitQuotedIdentifierAlternative(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnquotedIdentifierContext extends StrictIdentifierContext {
		public TerminalNode IDENTIFIER() { return getToken(BlkchnSqlParser.IDENTIFIER, 0); }
		public NonReservedContext nonReserved() {
			return getRuleContext(NonReservedContext.class,0);
		}
		public UnquotedIdentifierContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterUnquotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitUnquotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitUnquotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrictIdentifierContext strictIdentifier() throws RecognitionException {
		StrictIdentifierContext _localctx = new StrictIdentifierContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_strictIdentifier);
		try {
			setState(895);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(892);
				match(IDENTIFIER);
				}
				break;
			case BACKQUOTED_IDENTIFIER:
				_localctx = new QuotedIdentifierAlternativeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(893);
				quotedIdentifier();
				}
				break;
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case OUTER:
			case FIRST:
			case AFTER:
			case LAST:
			case VALUES:
			case CREATE:
			case TABLE:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case FUNCTIONS:
			case DROP:
			case TO:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case COMMIT:
			case ROLLBACK:
			case IGNORE:
			case IF:
			case DIV:
			case PERCENTLIT:
			case OUT:
			case OF:
			case FUNCTION:
			case DATABASE:
			case DATABASES:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case REVOKE:
			case GRANT:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case INDEX:
			case INDEXES:
			case CURRENT_DATE:
			case CURRENT_TIMESTAMP:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(894);
				nonReserved();
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

	public static class QuotedIdentifierContext extends ParserRuleContext {
		public TerminalNode BACKQUOTED_IDENTIFIER() { return getToken(BlkchnSqlParser.BACKQUOTED_IDENTIFIER, 0); }
		public QuotedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitQuotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitQuotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuotedIdentifierContext quotedIdentifier() throws RecognitionException {
		QuotedIdentifierContext _localctx = new QuotedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_quotedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(897);
			match(BACKQUOTED_IDENTIFIER);
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

	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecimalLiteralContext extends NumberContext {
		public TerminalNode DECIMAL_VALUE() { return getToken(BlkchnSqlParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(BlkchnSqlParser.MINUS, 0); }
		public DecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BigIntLiteralContext extends NumberContext {
		public TerminalNode BIGINT_LITERAL() { return getToken(BlkchnSqlParser.BIGINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(BlkchnSqlParser.MINUS, 0); }
		public BigIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterBigIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitBigIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitBigIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TinyIntLiteralContext extends NumberContext {
		public TerminalNode TINYINT_LITERAL() { return getToken(BlkchnSqlParser.TINYINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(BlkchnSqlParser.MINUS, 0); }
		public TinyIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterTinyIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitTinyIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitTinyIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BigDecimalLiteralContext extends NumberContext {
		public TerminalNode BIGDECIMAL_LITERAL() { return getToken(BlkchnSqlParser.BIGDECIMAL_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(BlkchnSqlParser.MINUS, 0); }
		public BigDecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterBigDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitBigDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitBigDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleLiteralContext extends NumberContext {
		public TerminalNode DOUBLE_LITERAL() { return getToken(BlkchnSqlParser.DOUBLE_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(BlkchnSqlParser.MINUS, 0); }
		public DoubleLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterDoubleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitDoubleLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitDoubleLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerLiteralContext extends NumberContext {
		public TerminalNode INTEGER_VALUE() { return getToken(BlkchnSqlParser.INTEGER_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(BlkchnSqlParser.MINUS, 0); }
		public IntegerLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SmallIntLiteralContext extends NumberContext {
		public TerminalNode SMALLINT_LITERAL() { return getToken(BlkchnSqlParser.SMALLINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(BlkchnSqlParser.MINUS, 0); }
		public SmallIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterSmallIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitSmallIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitSmallIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_number);
		int _la;
		try {
			setState(927);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(900);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(899);
					match(MINUS);
					}
				}

				setState(902);
				match(DECIMAL_VALUE);
				}
				break;
			case 2:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(904);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(903);
					match(MINUS);
					}
				}

				setState(906);
				match(INTEGER_VALUE);
				}
				break;
			case 3:
				_localctx = new BigIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(908);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(907);
					match(MINUS);
					}
				}

				setState(910);
				match(BIGINT_LITERAL);
				}
				break;
			case 4:
				_localctx = new SmallIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(912);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(911);
					match(MINUS);
					}
				}

				setState(914);
				match(SMALLINT_LITERAL);
				}
				break;
			case 5:
				_localctx = new TinyIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(916);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(915);
					match(MINUS);
					}
				}

				setState(918);
				match(TINYINT_LITERAL);
				}
				break;
			case 6:
				_localctx = new DoubleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(920);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(919);
					match(MINUS);
					}
				}

				setState(922);
				match(DOUBLE_LITERAL);
				}
				break;
			case 7:
				_localctx = new BigDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(924);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(923);
					match(MINUS);
					}
				}

				setState(926);
				match(BIGDECIMAL_LITERAL);
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

	public static class NonReservedContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(BlkchnSqlParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(BlkchnSqlParser.TABLES, 0); }
		public TerminalNode COLUMNS() { return getToken(BlkchnSqlParser.COLUMNS, 0); }
		public TerminalNode COLUMN() { return getToken(BlkchnSqlParser.COLUMN, 0); }
		public TerminalNode FUNCTIONS() { return getToken(BlkchnSqlParser.FUNCTIONS, 0); }
		public TerminalNode DATABASES() { return getToken(BlkchnSqlParser.DATABASES, 0); }
		public TerminalNode ADD() { return getToken(BlkchnSqlParser.ADD, 0); }
		public TerminalNode LAST() { return getToken(BlkchnSqlParser.LAST, 0); }
		public TerminalNode FIRST() { return getToken(BlkchnSqlParser.FIRST, 0); }
		public TerminalNode AFTER() { return getToken(BlkchnSqlParser.AFTER, 0); }
		public TerminalNode MAP() { return getToken(BlkchnSqlParser.MAP, 0); }
		public TerminalNode ARRAY() { return getToken(BlkchnSqlParser.ARRAY, 0); }
		public TerminalNode STRUCT() { return getToken(BlkchnSqlParser.STRUCT, 0); }
		public TerminalNode GROUPING() { return getToken(BlkchnSqlParser.GROUPING, 0); }
		public TerminalNode CUBE() { return getToken(BlkchnSqlParser.CUBE, 0); }
		public TerminalNode ROLLUP() { return getToken(BlkchnSqlParser.ROLLUP, 0); }
		public TerminalNode EXPLAIN() { return getToken(BlkchnSqlParser.EXPLAIN, 0); }
		public TerminalNode USE() { return getToken(BlkchnSqlParser.USE, 0); }
		public List<TerminalNode> TO() { return getTokens(BlkchnSqlParser.TO); }
		public TerminalNode TO(int i) {
			return getToken(BlkchnSqlParser.TO, i);
		}
		public TerminalNode PERCENTLIT() { return getToken(BlkchnSqlParser.PERCENTLIT, 0); }
		public TerminalNode OUT() { return getToken(BlkchnSqlParser.OUT, 0); }
		public TerminalNode OF() { return getToken(BlkchnSqlParser.OF, 0); }
		public TerminalNode SET() { return getToken(BlkchnSqlParser.SET, 0); }
		public TerminalNode RESET() { return getToken(BlkchnSqlParser.RESET, 0); }
		public TerminalNode VIEW() { return getToken(BlkchnSqlParser.VIEW, 0); }
		public TerminalNode REPLACE() { return getToken(BlkchnSqlParser.REPLACE, 0); }
		public TerminalNode IF() { return getToken(BlkchnSqlParser.IF, 0); }
		public TerminalNode NO() { return getToken(BlkchnSqlParser.NO, 0); }
		public TerminalNode COMMIT() { return getToken(BlkchnSqlParser.COMMIT, 0); }
		public TerminalNode ROLLBACK() { return getToken(BlkchnSqlParser.ROLLBACK, 0); }
		public TerminalNode IGNORE() { return getToken(BlkchnSqlParser.IGNORE, 0); }
		public TerminalNode TRUNCATE() { return getToken(BlkchnSqlParser.TRUNCATE, 0); }
		public TerminalNode COMPUTE() { return getToken(BlkchnSqlParser.COMPUTE, 0); }
		public TerminalNode LIST() { return getToken(BlkchnSqlParser.LIST, 0); }
		public TerminalNode ANALYZE() { return getToken(BlkchnSqlParser.ANALYZE, 0); }
		public TerminalNode REVOKE() { return getToken(BlkchnSqlParser.REVOKE, 0); }
		public TerminalNode GRANT() { return getToken(BlkchnSqlParser.GRANT, 0); }
		public TerminalNode EXPORT() { return getToken(BlkchnSqlParser.EXPORT, 0); }
		public TerminalNode IMPORT() { return getToken(BlkchnSqlParser.IMPORT, 0); }
		public TerminalNode LOAD() { return getToken(BlkchnSqlParser.LOAD, 0); }
		public TerminalNode VALUES() { return getToken(BlkchnSqlParser.VALUES, 0); }
		public TerminalNode COMMENT() { return getToken(BlkchnSqlParser.COMMENT, 0); }
		public TerminalNode ROLE() { return getToken(BlkchnSqlParser.ROLE, 0); }
		public TerminalNode ROLES() { return getToken(BlkchnSqlParser.ROLES, 0); }
		public TerminalNode INDEX() { return getToken(BlkchnSqlParser.INDEX, 0); }
		public TerminalNode INDEXES() { return getToken(BlkchnSqlParser.INDEXES, 0); }
		public TerminalNode ASC() { return getToken(BlkchnSqlParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(BlkchnSqlParser.DESC, 0); }
		public TerminalNode LIMIT() { return getToken(BlkchnSqlParser.LIMIT, 0); }
		public TerminalNode RENAME() { return getToken(BlkchnSqlParser.RENAME, 0); }
		public TerminalNode SETS() { return getToken(BlkchnSqlParser.SETS, 0); }
		public TerminalNode AT() { return getToken(BlkchnSqlParser.AT, 0); }
		public TerminalNode NULLS() { return getToken(BlkchnSqlParser.NULLS, 0); }
		public TerminalNode ALL() { return getToken(BlkchnSqlParser.ALL, 0); }
		public TerminalNode ALTER() { return getToken(BlkchnSqlParser.ALTER, 0); }
		public TerminalNode AS() { return getToken(BlkchnSqlParser.AS, 0); }
		public TerminalNode BETWEEN() { return getToken(BlkchnSqlParser.BETWEEN, 0); }
		public TerminalNode BY() { return getToken(BlkchnSqlParser.BY, 0); }
		public TerminalNode CREATE() { return getToken(BlkchnSqlParser.CREATE, 0); }
		public TerminalNode DELETE() { return getToken(BlkchnSqlParser.DELETE, 0); }
		public TerminalNode DESCRIBE() { return getToken(BlkchnSqlParser.DESCRIBE, 0); }
		public TerminalNode DROP() { return getToken(BlkchnSqlParser.DROP, 0); }
		public TerminalNode EXISTS() { return getToken(BlkchnSqlParser.EXISTS, 0); }
		public TerminalNode FALSE() { return getToken(BlkchnSqlParser.FALSE, 0); }
		public TerminalNode FOR() { return getToken(BlkchnSqlParser.FOR, 0); }
		public TerminalNode GROUP() { return getToken(BlkchnSqlParser.GROUP, 0); }
		public TerminalNode IN() { return getToken(BlkchnSqlParser.IN, 0); }
		public TerminalNode INSERT() { return getToken(BlkchnSqlParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(BlkchnSqlParser.INTO, 0); }
		public TerminalNode IS() { return getToken(BlkchnSqlParser.IS, 0); }
		public TerminalNode LIKE() { return getToken(BlkchnSqlParser.LIKE, 0); }
		public TerminalNode NULL() { return getToken(BlkchnSqlParser.NULL, 0); }
		public TerminalNode ORDER() { return getToken(BlkchnSqlParser.ORDER, 0); }
		public TerminalNode OUTER() { return getToken(BlkchnSqlParser.OUTER, 0); }
		public List<TerminalNode> TABLE() { return getTokens(BlkchnSqlParser.TABLE); }
		public TerminalNode TABLE(int i) {
			return getToken(BlkchnSqlParser.TABLE, i);
		}
		public TerminalNode TRUE() { return getToken(BlkchnSqlParser.TRUE, 0); }
		public TerminalNode RLIKE() { return getToken(BlkchnSqlParser.RLIKE, 0); }
		public TerminalNode AND() { return getToken(BlkchnSqlParser.AND, 0); }
		public TerminalNode CASE() { return getToken(BlkchnSqlParser.CASE, 0); }
		public TerminalNode CAST() { return getToken(BlkchnSqlParser.CAST, 0); }
		public TerminalNode DISTINCT() { return getToken(BlkchnSqlParser.DISTINCT, 0); }
		public TerminalNode DIV() { return getToken(BlkchnSqlParser.DIV, 0); }
		public TerminalNode ELSE() { return getToken(BlkchnSqlParser.ELSE, 0); }
		public TerminalNode END() { return getToken(BlkchnSqlParser.END, 0); }
		public TerminalNode FUNCTION() { return getToken(BlkchnSqlParser.FUNCTION, 0); }
		public TerminalNode INTERVAL() { return getToken(BlkchnSqlParser.INTERVAL, 0); }
		public TerminalNode OR() { return getToken(BlkchnSqlParser.OR, 0); }
		public TerminalNode THEN() { return getToken(BlkchnSqlParser.THEN, 0); }
		public TerminalNode WHEN() { return getToken(BlkchnSqlParser.WHEN, 0); }
		public TerminalNode DATABASE() { return getToken(BlkchnSqlParser.DATABASE, 0); }
		public TerminalNode SELECT() { return getToken(BlkchnSqlParser.SELECT, 0); }
		public TerminalNode FROM() { return getToken(BlkchnSqlParser.FROM, 0); }
		public TerminalNode WHERE() { return getToken(BlkchnSqlParser.WHERE, 0); }
		public TerminalNode HAVING() { return getToken(BlkchnSqlParser.HAVING, 0); }
		public TerminalNode NOT() { return getToken(BlkchnSqlParser.NOT, 0); }
		public TerminalNode CURRENT_DATE() { return getToken(BlkchnSqlParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(BlkchnSqlParser.CURRENT_TIMESTAMP, 0); }
		public NonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).enterNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlkchnSqlListener ) ((BlkchnSqlListener)listener).exitNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlkchnSqlVisitor ) return ((BlkchnSqlVisitor<? extends T>)visitor).visitNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonReservedContext nonReserved() throws RecognitionException {
		NonReservedContext _localctx = new NonReservedContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_nonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(929);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << OUTER) | (1L << FIRST) | (1L << AFTER) | (1L << LAST) | (1L << VALUES) | (1L << CREATE) | (1L << TABLE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (TO - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (IGNORE - 64)) | (1L << (IF - 64)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (DIV - 130)) | (1L << (PERCENTLIT - 130)) | (1L << (OUT - 130)) | (1L << (OF - 130)) | (1L << (FUNCTION - 130)) | (1L << (DATABASE - 130)) | (1L << (DATABASES - 130)) | (1L << (TRUNCATE - 130)) | (1L << (ANALYZE - 130)) | (1L << (COMPUTE - 130)) | (1L << (LIST - 130)) | (1L << (REVOKE - 130)) | (1L << (GRANT - 130)) | (1L << (EXPORT - 130)) | (1L << (IMPORT - 130)) | (1L << (LOAD - 130)) | (1L << (ROLE - 130)) | (1L << (ROLES - 130)) | (1L << (INDEX - 130)) | (1L << (INDEXES - 130)) | (1L << (CURRENT_DATE - 130)) | (1L << (CURRENT_TIMESTAMP - 130)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 33:
			return queryTerm_sempred((QueryTermContext)_localctx, predIndex);
		case 55:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 58:
			return valueExpression_sempred((ValueExpressionContext)_localctx, predIndex);
		case 59:
			return primaryExpression_sempred((PrimaryExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean queryTerm_sempred(QueryTermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean valueExpression_sempred(ValueExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean primaryExpression_sempred(PrimaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 4);
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u00b2\u03a6\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00af\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00c6\n"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\7\n\u00d4\n\n\f\n\16"+
		"\n\u00d7\13\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00df\n\13\3\13\5\13"+
		"\u00e2\n\13\3\13\5\13\u00e5\n\13\3\13\5\13\u00e8\n\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\5\f\u00f0\n\f\3\f\5\f\u00f3\n\f\3\f\5\f\u00f6\n\f\3\f\5\f\u00f9"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0102\n\r\3\r\3\r\3\r\3\r\3\r\5\r"+
		"\u0109\n\r\3\r\5\r\u010c\n\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\5"+
		"\24\u0124\n\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\7\33\u0141\n\33\f\33\16\33\u0144\13\33\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\5\35\u014c\n\35\3\35\3\35\3\35\3\35\5\35\u0152\n\35\3\36\3"+
		"\36\3\37\3\37\3\37\3 \5 \u015a\n \3 \5 \u015d\n \3!\3!\3!\3!\3!\7!\u0164"+
		"\n!\f!\16!\u0167\13!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\5#\u0172\n#\3#\7#\u0175"+
		"\n#\f#\16#\u0178\13#\3$\3$\3$\3$\3$\5$\u017f\n$\3%\3%\5%\u0183\n%\3%\3"+
		"%\5%\u0187\n%\3&\3&\3&\5&\u018c\n&\3&\5&\u018f\n&\3&\5&\u0192\n&\3\'\3"+
		"\'\5\'\u0196\n\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3*\7*\u01a4\n*\f*"+
		"\16*\u01a7\13*\3+\3+\3+\3+\3+\7+\u01ae\n+\f+\16+\u01b1\13+\3,\3,\3-\3"+
		"-\7-\u01b7\n-\f-\16-\u01ba\13-\3.\3.\3.\3.\5.\u01c0\n.\3/\5/\u01c3\n/"+
		"\3/\3/\3/\5/\u01c8\n/\3/\3/\5/\u01cc\n/\3/\3/\5/\u01d0\n/\5/\u01d2\n/"+
		"\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62\7\62\u01de\n\62\f\62"+
		"\16\62\u01e1\13\62\3\63\3\63\5\63\u01e5\n\63\3\63\5\63\u01e8\n\63\3\63"+
		"\3\63\3\63\3\63\5\63\u01ee\n\63\3\63\5\63\u01f1\n\63\3\63\3\63\3\63\3"+
		"\63\3\63\5\63\u01f8\n\63\3\63\5\63\u01fb\n\63\5\63\u01fd\n\63\3\64\3\64"+
		"\3\64\3\64\7\64\u0203\n\64\f\64\16\64\u0206\13\64\3\64\5\64\u0209\n\64"+
		"\3\64\3\64\5\64\u020d\n\64\5\64\u020f\n\64\3\65\3\65\3\65\5\65\u0214\n"+
		"\65\3\65\3\65\3\66\3\66\5\66\u021a\n\66\3\66\3\66\5\66\u021e\n\66\5\66"+
		"\u0220\n\66\3\67\3\67\3\67\7\67\u0225\n\67\f\67\16\67\u0228\13\67\38\3"+
		"8\39\39\39\39\59\u0230\n9\39\39\39\39\39\39\79\u0238\n9\f9\169\u023b\13"+
		"9\3:\3:\5:\u023f\n:\3;\5;\u0242\n;\3;\3;\3;\3;\3;\3;\5;\u024a\n;\3;\3"+
		";\3;\3;\3;\7;\u0251\n;\f;\16;\u0254\13;\3;\3;\3;\5;\u0259\n;\3;\3;\3;"+
		"\3;\3;\3;\5;\u0261\n;\3;\3;\3;\3;\5;\u0267\n;\3;\5;\u026a\n;\3<\3<\3<"+
		"\3<\5<\u0270\n<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<"+
		"\3<\7<\u0285\n<\f<\16<\u0288\13<\3=\3=\3=\3=\6=\u028e\n=\r=\16=\u028f"+
		"\3=\3=\5=\u0294\n=\3=\3=\3=\3=\3=\6=\u029b\n=\r=\16=\u029c\3=\3=\5=\u02a1"+
		"\n=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u02b1\n=\3=\3=\3=\3="+
		"\3=\3=\3=\5=\u02ba\n=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\6=\u02c8\n="+
		"\r=\16=\u02c9\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u02d5\n=\3=\3=\3=\7=\u02da"+
		"\n=\f=\16=\u02dd\13=\5=\u02df\n=\3=\3=\3=\3=\3=\3=\3=\5=\u02e8\n=\3=\3"+
		"=\3=\3=\3=\3=\3=\3=\7=\u02f2\n=\f=\16=\u02f5\13=\3>\3>\3>\3>\3>\3>\3>"+
		"\3>\6>\u02ff\n>\r>\16>\u0300\5>\u0303\n>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3"+
		"C\7C\u030f\nC\fC\16C\u0312\13C\3D\3D\3D\3D\5D\u0318\nD\3E\5E\u031b\nE"+
		"\3E\3E\5E\u031f\nE\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\5F\u0330"+
		"\nF\3F\3F\5F\u0334\nF\3F\3F\3F\3F\3F\7F\u033b\nF\fF\16F\u033e\13F\3F\5"+
		"F\u0341\nF\5F\u0343\nF\3G\3G\3G\7G\u0348\nG\fG\16G\u034b\13G\3H\3H\3H"+
		"\3H\5H\u0351\nH\3I\3I\3I\7I\u0356\nI\fI\16I\u0359\13I\3J\3J\3J\3J\3J\5"+
		"J\u0360\nJ\3K\3K\3K\3K\3K\3L\3L\3L\7L\u036a\nL\fL\16L\u036d\13L\3M\3M"+
		"\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\5M\u037d\nM\3N\3N\3N\5N\u0382\nN"+
		"\3O\3O\3P\5P\u0387\nP\3P\3P\5P\u038b\nP\3P\3P\5P\u038f\nP\3P\3P\5P\u0393"+
		"\nP\3P\3P\5P\u0397\nP\3P\3P\5P\u039b\nP\3P\3P\5P\u039f\nP\3P\5P\u03a2"+
		"\nP\3Q\3Q\3Q\2\6DpvxR\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,."+
		"\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\2\27\3\2\u00aa\u00ab\4\2ij\u008c\u008c\4\2AAhh\3\2\u009e\u009f"+
		"\4\2\u009e\u009e\u00a0\u00a0\3\2mn\3\2QT\3\2)*\4\2<<>>\3\2\16\17\3\2\""+
		"#\4\2\177\177\u0085\u0085\3\2\u0081\u0084\3\2\177\u0080\3\2\u009c\u009d"+
		"\3\2w~\3\2\177\u0088\3\2\33\36\3\2&\'\3\2\u00a6\u00a7\t\2\n\61\64\64<"+
		"PU`vv\u0084\u0084\u0089\u009d\u03f9\2\u00a2\3\2\2\2\4\u00ae\3\2\2\2\6"+
		"\u00b0\3\2\2\2\b\u00ba\3\2\2\2\n\u00bc\3\2\2\2\f\u00be\3\2\2\2\16\u00cc"+
		"\3\2\2\2\20\u00ce\3\2\2\2\22\u00d0\3\2\2\2\24\u00d8\3\2\2\2\26\u00e9\3"+
		"\2\2\2\30\u00fa\3\2\2\2\32\u010d\3\2\2\2\34\u010f\3\2\2\2\36\u0111\3\2"+
		"\2\2 \u0113\3\2\2\2\"\u0115\3\2\2\2$\u011a\3\2\2\2&\u011f\3\2\2\2(\u0127"+
		"\3\2\2\2*\u012b\3\2\2\2,\u012d\3\2\2\2.\u0131\3\2\2\2\60\u0137\3\2\2\2"+
		"\62\u0139\3\2\2\2\64\u013d\3\2\2\2\66\u0145\3\2\2\28\u0147\3\2\2\2:\u0153"+
		"\3\2\2\2<\u0155\3\2\2\2>\u0159\3\2\2\2@\u015e\3\2\2\2B\u0168\3\2\2\2D"+
		"\u016b\3\2\2\2F\u017e\3\2\2\2H\u0180\3\2\2\2J\u0188\3\2\2\2L\u0193\3\2"+
		"\2\2N\u0199\3\2\2\2P\u019c\3\2\2\2R\u019f\3\2\2\2T\u01a8\3\2\2\2V\u01b2"+
		"\3\2\2\2X\u01b4\3\2\2\2Z\u01bb\3\2\2\2\\\u01d1\3\2\2\2^\u01d3\3\2\2\2"+
		"`\u01d6\3\2\2\2b\u01da\3\2\2\2d\u01fc\3\2\2\2f\u01fe\3\2\2\2h\u0213\3"+
		"\2\2\2j\u0217\3\2\2\2l\u0221\3\2\2\2n\u0229\3\2\2\2p\u022f\3\2\2\2r\u023c"+
		"\3\2\2\2t\u0269\3\2\2\2v\u026f\3\2\2\2x\u02e7\3\2\2\2z\u0302\3\2\2\2|"+
		"\u0304\3\2\2\2~\u0306\3\2\2\2\u0080\u0308\3\2\2\2\u0082\u030a\3\2\2\2"+
		"\u0084\u030c\3\2\2\2\u0086\u0313\3\2\2\2\u0088\u031e\3\2\2\2\u008a\u0342"+
		"\3\2\2\2\u008c\u0344\3\2\2\2\u008e\u034c\3\2\2\2\u0090\u0352\3\2\2\2\u0092"+
		"\u035a\3\2\2\2\u0094\u0361\3\2\2\2\u0096\u0366\3\2\2\2\u0098\u037c\3\2"+
		"\2\2\u009a\u0381\3\2\2\2\u009c\u0383\3\2\2\2\u009e\u03a1\3\2\2\2\u00a0"+
		"\u03a3\3\2\2\2\u00a2\u00a3\5\4\3\2\u00a3\u00a4\7\2\2\3\u00a4\3\3\2\2\2"+
		"\u00a5\u00af\5<\37\2\u00a6\u00af\5\f\7\2\u00a7\u00af\5\24\13\2\u00a8\u00af"+
		"\58\35\2\u00a9\u00af\5\30\r\2\u00aa\u00af\5&\24\2\u00ab\u00af\5(\25\2"+
		"\u00ac\u00af\5\26\f\2\u00ad\u00af\5\6\4\2\u00ae\u00a5\3\2\2\2\u00ae\u00a6"+
		"\3\2\2\2\u00ae\u00a7\3\2\2\2\u00ae\u00a8\3\2\2\2\u00ae\u00a9\3\2\2\2\u00ae"+
		"\u00aa\3\2\2\2\u00ae\u00ab\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00ad\3\2"+
		"\2\2\u00af\5\3\2\2\2\u00b0\u00b1\7@\2\2\u00b1\u00b2\7s\2\2\u00b2\u00b3"+
		"\5\u0098M\2\u00b3\u00b4\7t\2\2\u00b4\u00b5\7\22\2\2\u00b5\u00b6\5\b\5"+
		"\2\u00b6\u00b7\7u\2\2\u00b7\u00b8\7U\2\2\u00b8\u00b9\5\n\6\2\u00b9\7\3"+
		"\2\2\2\u00ba\u00bb\7\u00a1\2\2\u00bb\t\3\2\2\2\u00bc\u00bd\t\2\2\2\u00bd"+
		"\13\3\2\2\2\u00be\u00bf\7D\2\2\u00bf\u00c0\7F\2\2\u00c0\u00c5\5h\65\2"+
		"\u00c1\u00c2\7\3\2\2\u00c2\u00c3\5\16\b\2\u00c3\u00c4\7\4\2\2\u00c4\u00c6"+
		"\3\2\2\2\u00c5\u00c1\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\u00c8\7?\2\2\u00c8\u00c9\7\3\2\2\u00c9\u00ca\5\20\t\2\u00ca\u00cb\7\4"+
		"\2\2\u00cb\r\3\2\2\2\u00cc\u00cd\5b\62\2\u00cd\17\3\2\2\2\u00ce\u00cf"+
		"\5\22\n\2\u00cf\21\3\2\2\2\u00d0\u00d5\5z>\2\u00d1\u00d2\7\5\2\2\u00d2"+
		"\u00d4\5z>\2\u00d3\u00d1\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2"+
		"\2\u00d5\u00d6\3\2\2\2\u00d6\23\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00d9"+
		"\7@\2\2\u00d9\u00da\t\3\2\2\u00da\u00db\5\u0096L\2\u00db\u00dc\7\r\2\2"+
		"\u00dc\u00de\5*\26\2\u00dd\u00df\5,\27\2\u00de\u00dd\3\2\2\2\u00de\u00df"+
		"\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0\u00e2\5.\30\2\u00e1\u00e0\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00e5\5\62\32\2\u00e4\u00e3\3"+
		"\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e8\5\32\16\2\u00e7"+
		"\u00e6\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\25\3\2\2\2\u00e9\u00ea\7r\2\2"+
		"\u00ea\u00eb\t\3\2\2\u00eb\u00ec\5\u0096L\2\u00ec\u00ed\7\r\2\2\u00ed"+
		"\u00ef\5*\26\2\u00ee\u00f0\5,\27\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3\2"+
		"\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00f3\5.\30\2\u00f2\u00f1\3\2\2\2\u00f2"+
		"\u00f3\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00f6\5\62\32\2\u00f5\u00f4\3"+
		"\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00f9\5\34\17\2\u00f8"+
		"\u00f7\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\27\3\2\2\2\u00fa\u00fb\7@\2\2"+
		"\u00fb\u00fc\t\4\2\2\u00fc\u0101\5\36\20\2\u00fd\u00fe\7\3\2\2\u00fe\u00ff"+
		"\5\u008cG\2\u00ff\u0100\7\4\2\2\u0100\u0102\3\2\2\2\u0101\u00fd\3\2\2"+
		"\2\u0101\u0102\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\7b\2\2\u0104\u0105"+
		"\7k\2\2\u0105\u0106\7l\2\2\u0106\u0108\5 \21\2\u0107\u0109\5\"\22\2\u0108"+
		"\u0107\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010b\3\2\2\2\u010a\u010c\5$"+
		"\23\2\u010b\u010a\3\2\2\2\u010b\u010c\3\2\2\2\u010c\31\3\2\2\2\u010d\u010e"+
		"\t\5\2\2\u010e\33\3\2\2\2\u010f\u0110\t\6\2\2\u0110\35\3\2\2\2\u0111\u0112"+
		"\5\u0098M\2\u0112\37\3\2\2\2\u0113\u0114\t\7\2\2\u0114!\3\2\2\2\u0115"+
		"\u0116\7o\2\2\u0116\u0117\7q\2\2\u0117\u0118\7\22\2\2\u0118\u0119\7\u00a1"+
		"\2\2\u0119#\3\2\2\2\u011a\u011b\7p\2\2\u011b\u011c\7q\2\2\u011c\u011d"+
		"\7\22\2\2\u011d\u011e\7\u00a1\2\2\u011e%\3\2\2\2\u011f\u0120\7E\2\2\u0120"+
		"\u0121\5\u0096L\2\u0121\u0123\7\3\2\2\u0122\u0124\5:\36\2\u0123\u0122"+
		"\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\7\4\2\2\u0126"+
		"\'\3\2\2\2\u0127\u0128\7P\2\2\u0128\u0129\t\4\2\2\u0129\u012a\5\36\20"+
		"\2\u012a)\3\2\2\2\u012b\u012c\7\u00a1\2\2\u012c+\3\2\2\2\u012d\u012e\7"+
		"b\2\2\u012e\u012f\7c\2\2\u012f\u0130\7\u00a1\2\2\u0130-\3\2\2\2\u0131"+
		"\u0132\7b\2\2\u0132\u0133\7d\2\2\u0133\u0134\7e\2\2\u0134\u0135\7f\2\2"+
		"\u0135\u0136\5\60\31\2\u0136/\3\2\2\2\u0137\u0138\7\u00a1\2\2\u0138\61"+
		"\3\2\2\2\u0139\u013a\7b\2\2\u013a\u013b\7g\2\2\u013b\u013c\5\64\33\2\u013c"+
		"\63\3\2\2\2\u013d\u0142\5\66\34\2\u013e\u013f\7\5\2\2\u013f\u0141\5\66"+
		"\34\2\u0140\u013e\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142"+
		"\u0143\3\2\2\2\u0143\65\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u0146\5z>\2"+
		"\u0146\67\3\2\2\2\u0147\u0148\7a\2\2\u0148\u0149\5\u0096L\2\u0149\u014b"+
		"\7\3\2\2\u014a\u014c\5:\36\2\u014b\u014a\3\2\2\2\u014b\u014c\3\2\2\2\u014c"+
		"\u014d\3\2\2\2\u014d\u0151\7\4\2\2\u014e\u014f\7\r\2\2\u014f\u0150\t\4"+
		"\2\2\u0150\u0152\5\36\20\2\u0151\u014e\3\2\2\2\u0151\u0152\3\2\2\2\u0152"+
		"9\3\2\2\2\u0153\u0154\5\64\33\2\u0154;\3\2\2\2\u0155\u0156\5D#\2\u0156"+
		"\u0157\5> \2\u0157=\3\2\2\2\u0158\u015a\5@!\2\u0159\u0158\3\2\2\2\u0159"+
		"\u015a\3\2\2\2\u015a\u015c\3\2\2\2\u015b\u015d\5B\"\2\u015c\u015b\3\2"+
		"\2\2\u015c\u015d\3\2\2\2\u015d?\3\2\2\2\u015e\u015f\7\27\2\2\u015f\u0160"+
		"\7\22\2\2\u0160\u0165\5H%\2\u0161\u0162\7\5\2\2\u0162\u0164\5H%\2\u0163"+
		"\u0161\3\2\2\2\u0164\u0167\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2"+
		"\2\2\u0166A\3\2\2\2\u0167\u0165\3\2\2\2\u0168\u0169\7\31\2\2\u0169\u016a"+
		"\5n8\2\u016aC\3\2\2\2\u016b\u016c\b#\1\2\u016c\u016d\5F$\2\u016d\u0176"+
		"\3\2\2\2\u016e\u016f\f\3\2\2\u016f\u0171\t\b\2\2\u0170\u0172\5V,\2\u0171"+
		"\u0170\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0175\5D"+
		"#\4\u0174\u016e\3\2\2\2\u0175\u0178\3\2\2\2\u0176\u0174\3\2\2\2\u0176"+
		"\u0177\3\2\2\2\u0177E\3\2\2\2\u0178\u0176\3\2\2\2\u0179\u017f\5J&\2\u017a"+
		"\u017b\7\3\2\2\u017b\u017c\5<\37\2\u017c\u017d\7\4\2\2\u017d\u017f\3\2"+
		"\2\2\u017e\u0179\3\2\2\2\u017e\u017a\3\2\2\2\u017fG\3\2\2\2\u0180\u0182"+
		"\5n8\2\u0181\u0183\t\t\2\2\u0182\u0181\3\2\2\2\u0182\u0183\3\2\2\2\u0183"+
		"\u0186\3\2\2\2\u0184\u0185\7(\2\2\u0185\u0187\t\n\2\2\u0186\u0184\3\2"+
		"\2\2\u0186\u0187\3\2\2\2\u0187I\3\2\2\2\u0188\u0189\5L\'\2\u0189\u018b"+
		"\5R*\2\u018a\u018c\5N(\2\u018b\u018a\3\2\2\2\u018b\u018c\3\2\2\2\u018c"+
		"\u018e\3\2\2\2\u018d\u018f\5T+\2\u018e\u018d\3\2\2\2\u018e\u018f\3\2\2"+
		"\2\u018f\u0191\3\2\2\2\u0190\u0192\5P)\2\u0191\u0190\3\2\2\2\u0191\u0192"+
		"\3\2\2\2\u0192K\3\2\2\2\u0193\u0195\7\n\2\2\u0194\u0196\5V,\2\u0195\u0194"+
		"\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198\5l\67\2\u0198"+
		"M\3\2\2\2\u0199\u019a\7\20\2\2\u019a\u019b\5p9\2\u019bO\3\2\2\2\u019c"+
		"\u019d\7\30\2\2\u019d\u019e\5p9\2\u019eQ\3\2\2\2\u019f\u01a0\7\13\2\2"+
		"\u01a0\u01a5\5X-\2\u01a1\u01a2\7\5\2\2\u01a2\u01a4\5X-\2\u01a3\u01a1\3"+
		"\2\2\2\u01a4\u01a7\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6"+
		"S\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a8\u01a9\7\21\2\2\u01a9\u01aa\7\22\2"+
		"\2\u01aa\u01af\5n8\2\u01ab\u01ac\7\5\2\2\u01ac\u01ae\5n8\2\u01ad\u01ab"+
		"\3\2\2\2\u01ae\u01b1\3\2\2\2\u01af\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0"+
		"U\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2\u01b3\t\13\2\2\u01b3W\3\2\2\2\u01b4"+
		"\u01b8\5d\63\2\u01b5\u01b7\5Z.\2\u01b6\u01b5\3\2\2\2\u01b7\u01ba\3\2\2"+
		"\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9Y\3\2\2\2\u01ba\u01b8"+
		"\3\2\2\2\u01bb\u01bc\5\\/\2\u01bc\u01bd\7\62\2\2\u01bd\u01bf\5d\63\2\u01be"+
		"\u01c0\5^\60\2\u01bf\u01be\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0[\3\2\2\2"+
		"\u01c1\u01c3\7\65\2\2\u01c2\u01c1\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01d2"+
		"\3\2\2\2\u01c4\u01d2\7\63\2\2\u01c5\u01c7\7\66\2\2\u01c6\u01c8\7\64\2"+
		"\2\u01c7\u01c6\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01d2\3\2\2\2\u01c9\u01cb"+
		"\78\2\2\u01ca\u01cc\7\64\2\2\u01cb\u01ca\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc"+
		"\u01d2\3\2\2\2\u01cd\u01cf\79\2\2\u01ce\u01d0\7\64\2\2\u01cf\u01ce\3\2"+
		"\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d2\3\2\2\2\u01d1\u01c2\3\2\2\2\u01d1"+
		"\u01c4\3\2\2\2\u01d1\u01c5\3\2\2\2\u01d1\u01c9\3\2\2\2\u01d1\u01cd\3\2"+
		"\2\2\u01d2]\3\2\2\2\u01d3\u01d4\7;\2\2\u01d4\u01d5\5p9\2\u01d5_\3\2\2"+
		"\2\u01d6\u01d7\7\3\2\2\u01d7\u01d8\5b\62\2\u01d8\u01d9\7\4\2\2\u01d9a"+
		"\3\2\2\2\u01da\u01df\5\u0098M\2\u01db\u01dc\7\5\2\2\u01dc\u01de\5\u0098"+
		"M\2\u01dd\u01db\3\2\2\2\u01de\u01e1\3\2\2\2\u01df\u01dd\3\2\2\2\u01df"+
		"\u01e0\3\2\2\2\u01e0c\3\2\2\2\u01e1\u01df\3\2\2\2\u01e2\u01e7\5h\65\2"+
		"\u01e3\u01e5\7\r\2\2\u01e4\u01e3\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e6"+
		"\3\2\2\2\u01e6\u01e8\5\u009aN\2\u01e7\u01e4\3\2\2\2\u01e7\u01e8\3\2\2"+
		"\2\u01e8\u01fd\3\2\2\2\u01e9\u01ea\7\3\2\2\u01ea\u01eb\5<\37\2\u01eb\u01f0"+
		"\7\4\2\2\u01ec\u01ee\7\r\2\2\u01ed\u01ec\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee"+
		"\u01ef\3\2\2\2\u01ef\u01f1\5\u009aN\2\u01f0\u01ed\3\2\2\2\u01f0\u01f1"+
		"\3\2\2\2\u01f1\u01fd\3\2\2\2\u01f2\u01fd\5f\64\2\u01f3\u01f4\7\3\2\2\u01f4"+
		"\u01f5\5X-\2\u01f5\u01fa\7\4\2\2\u01f6\u01f8\7\r\2\2\u01f7\u01f6\3\2\2"+
		"\2\u01f7\u01f8\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fb\5\u009aN\2\u01fa"+
		"\u01f7\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fd\3\2\2\2\u01fc\u01e2\3\2"+
		"\2\2\u01fc\u01e9\3\2\2\2\u01fc\u01f2\3\2\2\2\u01fc\u01f3\3\2\2\2\u01fd"+
		"e\3\2\2\2\u01fe\u01ff\7?\2\2\u01ff\u0204\5n8\2\u0200\u0201\7\5\2\2\u0201"+
		"\u0203\5n8\2\u0202\u0200\3\2\2\2\u0203\u0206\3\2\2\2\u0204\u0202\3\2\2"+
		"\2\u0204\u0205\3\2\2\2\u0205\u020e\3\2\2\2\u0206\u0204\3\2\2\2\u0207\u0209"+
		"\7\r\2\2\u0208\u0207\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020a\3\2\2\2\u020a"+
		"\u020c\5\u0098M\2\u020b\u020d\5`\61\2\u020c\u020b\3\2\2\2\u020c\u020d"+
		"\3\2\2\2\u020d\u020f\3\2\2\2\u020e\u0208\3\2\2\2\u020e\u020f\3\2\2\2\u020f"+
		"g\3\2\2\2\u0210\u0211\5\u0098M\2\u0211\u0212\7\6\2\2\u0212\u0214\3\2\2"+
		"\2\u0213\u0210\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0216"+
		"\5\u0098M\2\u0216i\3\2\2\2\u0217\u021f\5n8\2\u0218\u021a\7\r\2\2\u0219"+
		"\u0218\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021d\3\2\2\2\u021b\u021e\5\u0098"+
		"M\2\u021c\u021e\5`\61\2\u021d\u021b\3\2\2\2\u021d\u021c\3\2\2\2\u021e"+
		"\u0220\3\2\2\2\u021f\u0219\3\2\2\2\u021f\u0220\3\2\2\2\u0220k\3\2\2\2"+
		"\u0221\u0226\5j\66\2\u0222\u0223\7\5\2\2\u0223\u0225\5j\66\2\u0224\u0222"+
		"\3\2\2\2\u0225\u0228\3\2\2\2\u0226\u0224\3\2\2\2\u0226\u0227\3\2\2\2\u0227"+
		"m\3\2\2\2\u0228\u0226\3\2\2\2\u0229\u022a\5p9\2\u022ao\3\2\2\2\u022b\u022c"+
		"\b9\1\2\u022c\u022d\7\36\2\2\u022d\u0230\5p9\6\u022e\u0230\5r:\2\u022f"+
		"\u022b\3\2\2\2\u022f\u022e\3\2\2\2\u0230\u0239\3\2\2\2\u0231\u0232\f\4"+
		"\2\2\u0232\u0233\7\34\2\2\u0233\u0238\5p9\5\u0234\u0235\f\3\2\2\u0235"+
		"\u0236\7\33\2\2\u0236\u0238\5p9\4\u0237\u0231\3\2\2\2\u0237\u0234\3\2"+
		"\2\2\u0238\u023b\3\2\2\2\u0239\u0237\3\2\2\2\u0239\u023a\3\2\2\2\u023a"+
		"q\3\2\2\2\u023b\u0239\3\2\2\2\u023c\u023e\5v<\2\u023d\u023f\5t;\2\u023e"+
		"\u023d\3\2\2\2\u023e\u023f\3\2\2\2\u023fs\3\2\2\2\u0240\u0242\7\36\2\2"+
		"\u0241\u0240\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0244"+
		"\7!\2\2\u0244\u0245\5v<\2\u0245\u0246\7\34\2\2\u0246\u0247\5v<\2\u0247"+
		"\u026a\3\2\2\2\u0248\u024a\7\36\2\2\u0249\u0248\3\2\2\2\u0249\u024a\3"+
		"\2\2\2\u024a\u024b\3\2\2\2\u024b\u024c\7\35\2\2\u024c\u024d\7\3\2\2\u024d"+
		"\u0252\5n8\2\u024e\u024f\7\5\2\2\u024f\u0251\5n8\2\u0250\u024e\3\2\2\2"+
		"\u0251\u0254\3\2\2\2\u0252\u0250\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0255"+
		"\3\2\2\2\u0254\u0252\3\2\2\2\u0255\u0256\7\4\2\2\u0256\u026a\3\2\2\2\u0257"+
		"\u0259\7\36\2\2\u0258\u0257\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025a\3"+
		"\2\2\2\u025a\u025b\7\35\2\2\u025b\u025c\7\3\2\2\u025c\u025d\5<\37\2\u025d"+
		"\u025e\7\4\2\2\u025e\u026a\3\2\2\2\u025f\u0261\7\36\2\2\u0260\u025f\3"+
		"\2\2\2\u0260\u0261\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u0263\t\f\2\2\u0263"+
		"\u026a\5v<\2\u0264\u0266\7$\2\2\u0265\u0267\7\36\2\2\u0266\u0265\3\2\2"+
		"\2\u0266\u0267\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u026a\7%\2\2\u0269\u0241"+
		"\3\2\2\2\u0269\u0249\3\2\2\2\u0269\u0258\3\2\2\2\u0269\u0260\3\2\2\2\u0269"+
		"\u0264\3\2\2\2\u026au\3\2\2\2\u026b\u026c\b<\1\2\u026c\u026d\t\r\2\2\u026d"+
		"\u0270\5v<\t\u026e\u0270\5x=\2\u026f\u026b\3\2\2\2\u026f\u026e\3\2\2\2"+
		"\u0270\u0286\3\2\2\2\u0271\u0272\f\b\2\2\u0272\u0273\t\16\2\2\u0273\u0285"+
		"\5v<\t\u0274\u0275\f\7\2\2\u0275\u0276\t\17\2\2\u0276\u0285\5v<\b\u0277"+
		"\u0278\f\6\2\2\u0278\u0279\7\u0086\2\2\u0279\u0285\5v<\7\u027a\u027b\f"+
		"\5\2\2\u027b\u027c\7\u0088\2\2\u027c\u0285\5v<\6\u027d\u027e\f\4\2\2\u027e"+
		"\u027f\7\u0087\2\2\u027f\u0285\5v<\5\u0280\u0281\f\3\2\2\u0281\u0282\5"+
		"|?\2\u0282\u0283\5v<\4\u0283\u0285\3\2\2\2\u0284\u0271\3\2\2\2\u0284\u0274"+
		"\3\2\2\2\u0284\u0277\3\2\2\2\u0284\u027a\3\2\2\2\u0284\u027d\3\2\2\2\u0284"+
		"\u0280\3\2\2\2\u0285\u0288\3\2\2\2\u0286\u0284\3\2\2\2\u0286\u0287\3\2"+
		"\2\2\u0287w\3\2\2\2\u0288\u0286\3\2\2\2\u0289\u028a\b=\1\2\u028a\u02e8"+
		"\t\20\2\2\u028b\u028d\7-\2\2\u028c\u028e\5\u0094K\2\u028d\u028c\3\2\2"+
		"\2\u028e\u028f\3\2\2\2\u028f\u028d\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0293"+
		"\3\2\2\2\u0291\u0292\7\60\2\2\u0292\u0294\5n8\2\u0293\u0291\3\2\2\2\u0293"+
		"\u0294\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0296\7\61\2\2\u0296\u02e8\3"+
		"\2\2\2\u0297\u0298\7-\2\2\u0298\u029a\5n8\2\u0299\u029b\5\u0094K\2\u029a"+
		"\u0299\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u029a\3\2\2\2\u029c\u029d\3\2"+
		"\2\2\u029d\u02a0\3\2\2\2\u029e\u029f\7\60\2\2\u029f\u02a1\5n8\2\u02a0"+
		"\u029e\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a3\7\61"+
		"\2\2\u02a3\u02e8\3\2\2\2\u02a4\u02a5\7I\2\2\u02a5\u02a6\7\3\2\2\u02a6"+
		"\u02a7\5n8\2\u02a7\u02a8\7\r\2\2\u02a8\u02a9\5\u008aF\2\u02a9\u02aa\7"+
		"\4\2\2\u02aa\u02e8\3\2\2\2\u02ab\u02ac\7<\2\2\u02ac\u02ad\7\3\2\2\u02ad"+
		"\u02b0\5n8\2\u02ae\u02af\7`\2\2\u02af\u02b1\7(\2\2\u02b0\u02ae\3\2\2\2"+
		"\u02b0\u02b1\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02b3\7\4\2\2\u02b3\u02e8"+
		"\3\2\2\2\u02b4\u02b5\7>\2\2\u02b5\u02b6\7\3\2\2\u02b6\u02b9\5n8\2\u02b7"+
		"\u02b8\7`\2\2\u02b8\u02ba\7(\2\2\u02b9\u02b7\3\2\2\2\u02b9\u02ba\3\2\2"+
		"\2\u02ba\u02bb\3\2\2\2\u02bb\u02bc\7\4\2\2\u02bc\u02e8\3\2\2\2\u02bd\u02e8"+
		"\5z>\2\u02be\u02e8\7\u0081\2\2\u02bf\u02c0\5\u0096L\2\u02c0\u02c1\7\6"+
		"\2\2\u02c1\u02c2\7\u0081\2\2\u02c2\u02e8\3\2\2\2\u02c3\u02c4\7\3\2\2\u02c4"+
		"\u02c7\5j\66\2\u02c5\u02c6\7\5\2\2\u02c6\u02c8\5j\66\2\u02c7\u02c5\3\2"+
		"\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02c7\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca"+
		"\u02cb\3\2\2\2\u02cb\u02cc\7\4\2\2\u02cc\u02e8\3\2\2\2\u02cd\u02ce\7\3"+
		"\2\2\u02ce\u02cf\5<\37\2\u02cf\u02d0\7\4\2\2\u02d0\u02e8\3\2\2\2\u02d1"+
		"\u02d2\5\u0096L\2\u02d2\u02de\7\3\2\2\u02d3\u02d5\5V,\2\u02d4\u02d3\3"+
		"\2\2\2\u02d4\u02d5\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02db\5j\66\2\u02d7"+
		"\u02d8\7\5\2\2\u02d8\u02da\5j\66\2\u02d9\u02d7\3\2\2\2\u02da\u02dd\3\2"+
		"\2\2\u02db\u02d9\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02df\3\2\2\2\u02dd"+
		"\u02db\3\2\2\2\u02de\u02d4\3\2\2\2\u02de\u02df\3\2\2\2\u02df\u02e0\3\2"+
		"\2\2\u02e0\u02e1\7\4\2\2\u02e1\u02e8\3\2\2\2\u02e2\u02e8\5\u0098M\2\u02e3"+
		"\u02e4\7\3\2\2\u02e4\u02e5\5n8\2\u02e5\u02e6\7\4\2\2\u02e6\u02e8\3\2\2"+
		"\2\u02e7\u0289\3\2\2\2\u02e7\u028b\3\2\2\2\u02e7\u0297\3\2\2\2\u02e7\u02a4"+
		"\3\2\2\2\u02e7\u02ab\3\2\2\2\u02e7\u02b4\3\2\2\2\u02e7\u02bd\3\2\2\2\u02e7"+
		"\u02be\3\2\2\2\u02e7\u02bf\3\2\2\2\u02e7\u02c3\3\2\2\2\u02e7\u02cd\3\2"+
		"\2\2\u02e7\u02d1\3\2\2\2\u02e7\u02e2\3\2\2\2\u02e7\u02e3\3\2\2\2\u02e8"+
		"\u02f3\3\2\2\2\u02e9\u02ea\f\6\2\2\u02ea\u02eb\7\7\2\2\u02eb\u02ec\5v"+
		"<\2\u02ec\u02ed\7\b\2\2\u02ed\u02f2\3\2\2\2\u02ee\u02ef\f\4\2\2\u02ef"+
		"\u02f0\7\6\2\2\u02f0\u02f2\5\u0098M\2\u02f1\u02e9\3\2\2\2\u02f1\u02ee"+
		"\3\2\2\2\u02f2\u02f5\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4"+
		"y\3\2\2\2\u02f5\u02f3\3\2\2\2\u02f6\u0303\7%\2\2\u02f7\u0303\5\u0084C"+
		"\2\u02f8\u02f9\5\u0098M\2\u02f9\u02fa\7\u00a1\2\2\u02fa\u0303\3\2\2\2"+
		"\u02fb\u0303\5\u009eP\2\u02fc\u0303\5\u0082B\2\u02fd\u02ff\7\u00a1\2\2"+
		"\u02fe\u02fd\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u02fe\3\2\2\2\u0300\u0301"+
		"\3\2\2\2\u0301\u0303\3\2\2\2\u0302\u02f6\3\2\2\2\u0302\u02f7\3\2\2\2\u0302"+
		"\u02f8\3\2\2\2\u0302\u02fb\3\2\2\2\u0302\u02fc\3\2\2\2\u0302\u02fe\3\2"+
		"\2\2\u0303{\3\2\2\2\u0304\u0305\t\21\2\2\u0305}\3\2\2\2\u0306\u0307\t"+
		"\22\2\2\u0307\177\3\2\2\2\u0308\u0309\t\23\2\2\u0309\u0081\3\2\2\2\u030a"+
		"\u030b\t\24\2\2\u030b\u0083\3\2\2\2\u030c\u0310\7,\2\2\u030d\u030f\5\u0086"+
		"D\2\u030e\u030d\3\2\2\2\u030f\u0312\3\2\2\2\u0310\u030e\3\2\2\2\u0310"+
		"\u0311\3\2\2\2\u0311\u0085\3\2\2\2\u0312\u0310\3\2\2\2\u0313\u0314\5\u0088"+
		"E\2\u0314\u0317\5\u0098M\2\u0315\u0316\7U\2\2\u0316\u0318\5\u0098M\2\u0317"+
		"\u0315\3\2\2\2\u0317\u0318\3\2\2\2\u0318\u0087\3\2\2\2\u0319\u031b\t\17"+
		"\2\2\u031a\u0319\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u031c\3\2\2\2\u031c"+
		"\u031f\t\25\2\2\u031d\u031f\7\u00a1\2\2\u031e\u031a\3\2\2\2\u031e\u031d"+
		"\3\2\2\2\u031f\u0089\3\2\2\2\u0320\u0321\7X\2\2\u0321\u0322\7{\2\2\u0322"+
		"\u0323\5\u008aF\2\u0323\u0324\7}\2\2\u0324\u0343\3\2\2\2\u0325\u0326\7"+
		"Y\2\2\u0326\u0327\7{\2\2\u0327\u0328\5\u008aF\2\u0328\u0329\7\5\2\2\u0329"+
		"\u032a\5\u008aF\2\u032a\u032b\7}\2\2\u032b\u0343\3\2\2\2\u032c\u0333\7"+
		"Z\2\2\u032d\u032f\7{\2\2\u032e\u0330\5\u0090I\2\u032f\u032e\3\2\2\2\u032f"+
		"\u0330\3\2\2\2\u0330\u0331\3\2\2\2\u0331\u0334\7}\2\2\u0332\u0334\7y\2"+
		"\2\u0333\u032d\3\2\2\2\u0333\u0332\3\2\2\2\u0334\u0343\3\2\2\2\u0335\u0340"+
		"\5\u0098M\2\u0336\u0337\7\3\2\2\u0337\u033c\7\u00a6\2\2\u0338\u0339\7"+
		"\5\2\2\u0339\u033b\7\u00a6\2\2\u033a\u0338\3\2\2\2\u033b\u033e\3\2\2\2"+
		"\u033c\u033a\3\2\2\2\u033c\u033d\3\2\2\2\u033d\u033f\3\2\2\2\u033e\u033c"+
		"\3\2\2\2\u033f\u0341\7\4\2\2\u0340\u0336\3\2\2\2\u0340\u0341\3\2\2\2\u0341"+
		"\u0343\3\2\2\2\u0342\u0320\3\2\2\2\u0342\u0325\3\2\2\2\u0342\u032c\3\2"+
		"\2\2\u0342\u0335\3\2\2\2\u0343\u008b\3\2\2\2\u0344\u0349\5\u008eH\2\u0345"+
		"\u0346\7\5\2\2\u0346\u0348\5\u008eH\2\u0347\u0345\3\2\2\2\u0348\u034b"+
		"\3\2\2\2\u0349\u0347\3\2\2\2\u0349\u034a\3\2\2\2\u034a\u008d\3\2\2\2\u034b"+
		"\u0349\3\2\2\2\u034c\u034d\5\u0098M\2\u034d\u0350\5\u008aF\2\u034e\u034f"+
		"\7[\2\2\u034f\u0351\7\u00a1\2\2\u0350\u034e\3\2\2\2\u0350\u0351\3\2\2"+
		"\2\u0351\u008f\3\2\2\2\u0352\u0357\5\u0092J\2\u0353\u0354\7\5\2\2\u0354"+
		"\u0356\5\u0092J\2\u0355\u0353\3\2\2\2\u0356\u0359\3\2\2\2\u0357\u0355"+
		"\3\2\2\2\u0357\u0358\3\2\2\2\u0358\u0091\3\2\2\2\u0359\u0357\3\2\2\2\u035a"+
		"\u035b\5\u0098M\2\u035b\u035c\7\t\2\2\u035c\u035f\5\u008aF\2\u035d\u035e"+
		"\7[\2\2\u035e\u0360\7\u00a1\2\2\u035f\u035d\3\2\2\2\u035f\u0360\3\2\2"+
		"\2\u0360\u0093\3\2\2\2\u0361\u0362\7.\2\2\u0362\u0363\5n8\2\u0363\u0364"+
		"\7/\2\2\u0364\u0365\5n8\2\u0365\u0095\3\2\2\2\u0366\u036b\5\u0098M\2\u0367"+
		"\u0368\7\6\2\2\u0368\u036a\5\u0098M\2\u0369\u0367\3\2\2\2\u036a\u036d"+
		"\3\2\2\2\u036b\u0369\3\2\2\2\u036b\u036c\3\2\2\2\u036c\u0097\3\2\2\2\u036d"+
		"\u036b\3\2\2\2\u036e\u037d\5\u009aN\2\u036f\u037d\79\2\2\u0370\u037d\7"+
		"\65\2\2\u0371\u037d\7\66\2\2\u0372\u037d\7\67\2\2\u0373\u037d\78\2\2\u0374"+
		"\u037d\7:\2\2\u0375\u037d\7\62\2\2\u0376\u037d\7\63\2\2\u0377\u037d\7"+
		";\2\2\u0378\u037d\7Q\2\2\u0379\u037d\7T\2\2\u037a\u037d\7R\2\2\u037b\u037d"+
		"\7S\2\2\u037c\u036e\3\2\2\2\u037c\u036f\3\2\2\2\u037c\u0370\3\2\2\2\u037c"+
		"\u0371\3\2\2\2\u037c\u0372\3\2\2\2\u037c\u0373\3\2\2\2\u037c\u0374\3\2"+
		"\2\2\u037c\u0375\3\2\2\2\u037c\u0376\3\2\2\2\u037c\u0377\3\2\2\2\u037c"+
		"\u0378\3\2\2\2\u037c\u0379\3\2\2\2\u037c\u037a\3\2\2\2\u037c\u037b\3\2"+
		"\2\2\u037d\u0099\3\2\2\2\u037e\u0382\7\u00aa\2\2\u037f\u0382\5\u009cO"+
		"\2\u0380\u0382\5\u00a0Q\2\u0381\u037e\3\2\2\2\u0381\u037f\3\2\2\2\u0381"+
		"\u0380\3\2\2\2\u0382\u009b\3\2\2\2\u0383\u0384\7\u00ac\2\2\u0384\u009d"+
		"\3\2\2\2\u0385\u0387\7\u0080\2\2\u0386\u0385\3\2\2\2\u0386\u0387\3\2\2"+
		"\2\u0387\u0388\3\2\2\2\u0388\u03a2\7\u00a7\2\2\u0389\u038b\7\u0080\2\2"+
		"\u038a\u0389\3\2\2\2\u038a\u038b\3\2\2\2\u038b\u038c\3\2\2\2\u038c\u03a2"+
		"\7\u00a6\2\2\u038d\u038f\7\u0080\2\2\u038e\u038d\3\2\2\2\u038e\u038f\3"+
		"\2\2\2\u038f\u0390\3\2\2\2\u0390\u03a2\7\u00a2\2\2\u0391\u0393\7\u0080"+
		"\2\2\u0392\u0391\3\2\2\2\u0392\u0393\3\2\2\2\u0393\u0394\3\2\2\2\u0394"+
		"\u03a2\7\u00a3\2\2\u0395\u0397\7\u0080\2\2\u0396\u0395\3\2\2\2\u0396\u0397"+
		"\3\2\2\2\u0397\u0398\3\2\2\2\u0398\u03a2\7\u00a4\2\2\u0399\u039b\7\u0080"+
		"\2\2\u039a\u0399\3\2\2\2\u039a\u039b\3\2\2\2\u039b\u039c\3\2\2\2\u039c"+
		"\u03a2\7\u00a8\2\2\u039d\u039f\7\u0080\2\2\u039e\u039d\3\2\2\2\u039e\u039f"+
		"\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a2\7\u00a9\2\2\u03a1\u0386\3\2\2"+
		"\2\u03a1\u038a\3\2\2\2\u03a1\u038e\3\2\2\2\u03a1\u0392\3\2\2\2\u03a1\u0396"+
		"\3\2\2\2\u03a1\u039a\3\2\2\2\u03a1\u039e\3\2\2\2\u03a2\u009f\3\2\2\2\u03a3"+
		"\u03a4\t\26\2\2\u03a4\u00a1\3\2\2\2o\u00ae\u00c5\u00d5\u00de\u00e1\u00e4"+
		"\u00e7\u00ef\u00f2\u00f5\u00f8\u0101\u0108\u010b\u0123\u0142\u014b\u0151"+
		"\u0159\u015c\u0165\u0171\u0176\u017e\u0182\u0186\u018b\u018e\u0191\u0195"+
		"\u01a5\u01af\u01b8\u01bf\u01c2\u01c7\u01cb\u01cf\u01d1\u01df\u01e4\u01e7"+
		"\u01ed\u01f0\u01f7\u01fa\u01fc\u0204\u0208\u020c\u020e\u0213\u0219\u021d"+
		"\u021f\u0226\u022f\u0237\u0239\u023e\u0241\u0249\u0252\u0258\u0260\u0266"+
		"\u0269\u026f\u0284\u0286\u028f\u0293\u029c\u02a0\u02b0\u02b9\u02c9\u02d4"+
		"\u02db\u02de\u02e7\u02f1\u02f3\u0300\u0302\u0310\u0317\u031a\u031e\u032f"+
		"\u0333\u033c\u0340\u0342\u0349\u0350\u0357\u035f\u036b\u037c\u0381\u0386"+
		"\u038a\u038e\u0392\u0396\u039a\u039e\u03a1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
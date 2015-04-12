// Generated from GramaticaSQL.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GramaticaSQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GramaticaSQLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code tipoIdFloat}
	 * labeled alternative in {@link GramaticaSQLParser#tipoId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoIdFloat(@NotNull GramaticaSQLParser.TipoIdFloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cKeyFK}
	 * labeled alternative in {@link GramaticaSQLParser#cKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCKeyFK(@NotNull GramaticaSQLParser.CKeyFKContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterTableRename}
	 * labeled alternative in {@link GramaticaSQLParser#alterTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableRename(@NotNull GramaticaSQLParser.AlterTableRenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#dropDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropDatabase(@NotNull GramaticaSQLParser.DropDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtDropTable}
	 * labeled alternative in {@link GramaticaSQLParser#statementTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtDropTable(@NotNull GramaticaSQLParser.StmtDropTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(@NotNull GramaticaSQLParser.SelectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tipoIdChar}
	 * labeled alternative in {@link GramaticaSQLParser#tipoId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoIdChar(@NotNull GramaticaSQLParser.TipoIdCharContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#addConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddConstraint(@NotNull GramaticaSQLParser.AddConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#renameTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameTable(@NotNull GramaticaSQLParser.RenameTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtPrincipalTable}
	 * labeled alternative in {@link GramaticaSQLParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtPrincipalTable(@NotNull GramaticaSQLParser.StmtPrincipalTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#dropColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropColumn(@NotNull GramaticaSQLParser.DropColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#showTables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowTables(@NotNull GramaticaSQLParser.ShowTablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#statementData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementData(@NotNull GramaticaSQLParser.StatementDataContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#setting}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetting(@NotNull GramaticaSQLParser.SettingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code actTableAddCnst}
	 * labeled alternative in {@link GramaticaSQLParser#actionTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActTableAddCnst(@NotNull GramaticaSQLParser.ActTableAddCnstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code actTableDropCol}
	 * labeled alternative in {@link GramaticaSQLParser#actionTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActTableDropCol(@NotNull GramaticaSQLParser.ActTableDropColContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notAtom}
	 * labeled alternative in {@link GramaticaSQLParser#not}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotAtom(@NotNull GramaticaSQLParser.NotAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#alterDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterDatabase(@NotNull GramaticaSQLParser.AlterDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtPrincipalDB}
	 * labeled alternative in {@link GramaticaSQLParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtPrincipalDB(@NotNull GramaticaSQLParser.StmtPrincipalDBContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#addColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddColumn(@NotNull GramaticaSQLParser.AddColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtDropDB}
	 * labeled alternative in {@link GramaticaSQLParser#statementDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtDropDB(@NotNull GramaticaSQLParser.StmtDropDBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RelMayor}
	 * labeled alternative in {@link GramaticaSQLParser#opeRelacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelMayor(@NotNull GramaticaSQLParser.RelMayorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#useDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseDatabase(@NotNull GramaticaSQLParser.UseDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notNotAtom}
	 * labeled alternative in {@link GramaticaSQLParser#not}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotNotAtom(@NotNull GramaticaSQLParser.NotNotAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#dropConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropConstraint(@NotNull GramaticaSQLParser.DropConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code actTableAddCol}
	 * labeled alternative in {@link GramaticaSQLParser#actionTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActTableAddCol(@NotNull GramaticaSQLParser.ActTableAddColContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtAlterDB}
	 * labeled alternative in {@link GramaticaSQLParser#statementDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtAlterDB(@NotNull GramaticaSQLParser.StmtAlterDBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtShowColsFrom}
	 * labeled alternative in {@link GramaticaSQLParser#statementTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtShowColsFrom(@NotNull GramaticaSQLParser.StmtShowColsFromContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#createDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDatabase(@NotNull GramaticaSQLParser.CreateDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterTableAction}
	 * labeled alternative in {@link GramaticaSQLParser#alterTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableAction(@NotNull GramaticaSQLParser.AlterTableActionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtRenameTable}
	 * labeled alternative in {@link GramaticaSQLParser#statementTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtRenameTable(@NotNull GramaticaSQLParser.StmtRenameTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tipoIdInt}
	 * labeled alternative in {@link GramaticaSQLParser#tipoId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoIdInt(@NotNull GramaticaSQLParser.TipoIdIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cKeyPK}
	 * labeled alternative in {@link GramaticaSQLParser#cKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCKeyPK(@NotNull GramaticaSQLParser.CKeyPKContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtAlterTable}
	 * labeled alternative in {@link GramaticaSQLParser#statementTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtAlterTable(@NotNull GramaticaSQLParser.StmtAlterTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RelMayorIgual}
	 * labeled alternative in {@link GramaticaSQLParser#opeRelacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelMayorIgual(@NotNull GramaticaSQLParser.RelMayorIgualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cKeyCHK}
	 * labeled alternative in {@link GramaticaSQLParser#cKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCKeyCHK(@NotNull GramaticaSQLParser.CKeyCHKContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#createTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTable(@NotNull GramaticaSQLParser.CreateTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelacional(@NotNull GramaticaSQLParser.RelacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#insert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert(@NotNull GramaticaSQLParser.InsertContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate(@NotNull GramaticaSQLParser.UpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#delete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete(@NotNull GramaticaSQLParser.DeleteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtShowTables}
	 * labeled alternative in {@link GramaticaSQLParser#statementTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtShowTables(@NotNull GramaticaSQLParser.StmtShowTablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#principal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrincipal(@NotNull GramaticaSQLParser.PrincipalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RelMenorIgual}
	 * labeled alternative in {@link GramaticaSQLParser#opeRelacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelMenorIgual(@NotNull GramaticaSQLParser.RelMenorIgualContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#showColumnsFrom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowColumnsFrom(@NotNull GramaticaSQLParser.ShowColumnsFromContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#insertConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertConstraint(@NotNull GramaticaSQLParser.InsertConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtActionTable}
	 * labeled alternative in {@link GramaticaSQLParser#statementTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtActionTable(@NotNull GramaticaSQLParser.StmtActionTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tipoIdText}
	 * labeled alternative in {@link GramaticaSQLParser#tipoId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoIdText(@NotNull GramaticaSQLParser.TipoIdTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(@NotNull GramaticaSQLParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#extra}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtra(@NotNull GramaticaSQLParser.ExtraContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tipoIdDate}
	 * labeled alternative in {@link GramaticaSQLParser#tipoId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoIdDate(@NotNull GramaticaSQLParser.TipoIdDateContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#dropTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTable(@NotNull GramaticaSQLParser.DropTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtShowDB}
	 * labeled alternative in {@link GramaticaSQLParser#statementDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtShowDB(@NotNull GramaticaSQLParser.StmtShowDBContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(@NotNull GramaticaSQLParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#showDatabases}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowDatabases(@NotNull GramaticaSQLParser.ShowDatabasesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code actTableDropCnst}
	 * labeled alternative in {@link GramaticaSQLParser#actionTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActTableDropCnst(@NotNull GramaticaSQLParser.ActTableDropCnstContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpression(@NotNull GramaticaSQLParser.BooleanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RelMenor}
	 * labeled alternative in {@link GramaticaSQLParser#opeRelacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelMenor(@NotNull GramaticaSQLParser.RelMenorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(@NotNull GramaticaSQLParser.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtPrincipalData}
	 * labeled alternative in {@link GramaticaSQLParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtPrincipalData(@NotNull GramaticaSQLParser.StmtPrincipalDataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RelDiferentes}
	 * labeled alternative in {@link GramaticaSQLParser#opeRelacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelDiferentes(@NotNull GramaticaSQLParser.RelDiferentesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtCreateDB}
	 * labeled alternative in {@link GramaticaSQLParser#statementDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtCreateDB(@NotNull GramaticaSQLParser.StmtCreateDBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtCreateTable}
	 * labeled alternative in {@link GramaticaSQLParser#statementTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtCreateTable(@NotNull GramaticaSQLParser.StmtCreateTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#insertColumns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertColumns(@NotNull GramaticaSQLParser.InsertColumnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint(@NotNull GramaticaSQLParser.ConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(@NotNull GramaticaSQLParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtUseDB}
	 * labeled alternative in {@link GramaticaSQLParser#statementDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtUseDB(@NotNull GramaticaSQLParser.StmtUseDBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RelIgual}
	 * labeled alternative in {@link GramaticaSQLParser#opeRelacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelIgual(@NotNull GramaticaSQLParser.RelIgualContext ctx);
}
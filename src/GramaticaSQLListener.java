// Generated from GramaticaSQL.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramaticaSQLParser}.
 */
public interface GramaticaSQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code tipoIdFloat}
	 * labeled alternative in {@link GramaticaSQLParser#tipoId}.
	 * @param ctx the parse tree
	 */
	void enterTipoIdFloat(@NotNull GramaticaSQLParser.TipoIdFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tipoIdFloat}
	 * labeled alternative in {@link GramaticaSQLParser#tipoId}.
	 * @param ctx the parse tree
	 */
	void exitTipoIdFloat(@NotNull GramaticaSQLParser.TipoIdFloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cKeyFK}
	 * labeled alternative in {@link GramaticaSQLParser#cKey}.
	 * @param ctx the parse tree
	 */
	void enterCKeyFK(@NotNull GramaticaSQLParser.CKeyFKContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cKeyFK}
	 * labeled alternative in {@link GramaticaSQLParser#cKey}.
	 * @param ctx the parse tree
	 */
	void exitCKeyFK(@NotNull GramaticaSQLParser.CKeyFKContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterTableRename}
	 * labeled alternative in {@link GramaticaSQLParser#alterTable}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableRename(@NotNull GramaticaSQLParser.AlterTableRenameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterTableRename}
	 * labeled alternative in {@link GramaticaSQLParser#alterTable}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableRename(@NotNull GramaticaSQLParser.AlterTableRenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSQLParser#dropDatabase}.
	 * @param ctx the parse tree
	 */
	void enterDropDatabase(@NotNull GramaticaSQLParser.DropDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSQLParser#dropDatabase}.
	 * @param ctx the parse tree
	 */
	void exitDropDatabase(@NotNull GramaticaSQLParser.DropDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtDropTable}
	 * labeled alternative in {@link GramaticaSQLParser#statementTable}.
	 * @param ctx the parse tree
	 */
	void enterStmtDropTable(@NotNull GramaticaSQLParser.StmtDropTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtDropTable}
	 * labeled alternative in {@link GramaticaSQLParser#statementTable}.
	 * @param ctx the parse tree
	 */
	void exitStmtDropTable(@NotNull GramaticaSQLParser.StmtDropTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSQLParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(@NotNull GramaticaSQLParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSQLParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(@NotNull GramaticaSQLParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tipoIdChar}
	 * labeled alternative in {@link GramaticaSQLParser#tipoId}.
	 * @param ctx the parse tree
	 */
	void enterTipoIdChar(@NotNull GramaticaSQLParser.TipoIdCharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tipoIdChar}
	 * labeled alternative in {@link GramaticaSQLParser#tipoId}.
	 * @param ctx the parse tree
	 */
	void exitTipoIdChar(@NotNull GramaticaSQLParser.TipoIdCharContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSQLParser#addConstraint}.
	 * @param ctx the parse tree
	 */
	void enterAddConstraint(@NotNull GramaticaSQLParser.AddConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSQLParser#addConstraint}.
	 * @param ctx the parse tree
	 */
	void exitAddConstraint(@NotNull GramaticaSQLParser.AddConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSQLParser#renameTable}.
	 * @param ctx the parse tree
	 */
	void enterRenameTable(@NotNull GramaticaSQLParser.RenameTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSQLParser#renameTable}.
	 * @param ctx the parse tree
	 */
	void exitRenameTable(@NotNull GramaticaSQLParser.RenameTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtPrincipalTable}
	 * labeled alternative in {@link GramaticaSQLParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStmtPrincipalTable(@NotNull GramaticaSQLParser.StmtPrincipalTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtPrincipalTable}
	 * labeled alternative in {@link GramaticaSQLParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStmtPrincipalTable(@NotNull GramaticaSQLParser.StmtPrincipalTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSQLParser#dropColumn}.
	 * @param ctx the parse tree
	 */
	void enterDropColumn(@NotNull GramaticaSQLParser.DropColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSQLParser#dropColumn}.
	 * @param ctx the parse tree
	 */
	void exitDropColumn(@NotNull GramaticaSQLParser.DropColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSQLParser#showTables}.
	 * @param ctx the parse tree
	 */
	void enterShowTables(@NotNull GramaticaSQLParser.ShowTablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSQLParser#showTables}.
	 * @param ctx the parse tree
	 */
	void exitShowTables(@NotNull GramaticaSQLParser.ShowTablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSQLParser#statementData}.
	 * @param ctx the parse tree
	 */
	void enterStatementData(@NotNull GramaticaSQLParser.StatementDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSQLParser#statementData}.
	 * @param ctx the parse tree
	 */
	void exitStatementData(@NotNull GramaticaSQLParser.StatementDataContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSQLParser#setting}.
	 * @param ctx the parse tree
	 */
	void enterSetting(@NotNull GramaticaSQLParser.SettingContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSQLParser#setting}.
	 * @param ctx the parse tree
	 */
	void exitSetting(@NotNull GramaticaSQLParser.SettingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code actTableAddCnst}
	 * labeled alternative in {@link GramaticaSQLParser#actionTable}.
	 * @param ctx the parse tree
	 */
	void enterActTableAddCnst(@NotNull GramaticaSQLParser.ActTableAddCnstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code actTableAddCnst}
	 * labeled alternative in {@link GramaticaSQLParser#actionTable}.
	 * @param ctx the parse tree
	 */
	void exitActTableAddCnst(@NotNull GramaticaSQLParser.ActTableAddCnstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code actTableDropCol}
	 * labeled alternative in {@link GramaticaSQLParser#actionTable}.
	 * @param ctx the parse tree
	 */
	void enterActTableDropCol(@NotNull GramaticaSQLParser.ActTableDropColContext ctx);
	/**
	 * Exit a parse tree produced by the {@code actTableDropCol}
	 * labeled alternative in {@link GramaticaSQLParser#actionTable}.
	 * @param ctx the parse tree
	 */
	void exitActTableDropCol(@NotNull GramaticaSQLParser.ActTableDropColContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notAtom}
	 * labeled alternative in {@link GramaticaSQLParser#not}.
	 * @param ctx the parse tree
	 */
	void enterNotAtom(@NotNull GramaticaSQLParser.NotAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notAtom}
	 * labeled alternative in {@link GramaticaSQLParser#not}.
	 * @param ctx the parse tree
	 */
	void exitNotAtom(@NotNull GramaticaSQLParser.NotAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSQLParser#alterDatabase}.
	 * @param ctx the parse tree
	 */
	void enterAlterDatabase(@NotNull GramaticaSQLParser.AlterDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSQLParser#alterDatabase}.
	 * @param ctx the parse tree
	 */
	void exitAlterDatabase(@NotNull GramaticaSQLParser.AlterDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtPrincipalDB}
	 * labeled alternative in {@link GramaticaSQLParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStmtPrincipalDB(@NotNull GramaticaSQLParser.StmtPrincipalDBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtPrincipalDB}
	 * labeled alternative in {@link GramaticaSQLParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStmtPrincipalDB(@NotNull GramaticaSQLParser.StmtPrincipalDBContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSQLParser#addColumn}.
	 * @param ctx the parse tree
	 */
	void enterAddColumn(@NotNull GramaticaSQLParser.AddColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSQLParser#addColumn}.
	 * @param ctx the parse tree
	 */
	void exitAddColumn(@NotNull GramaticaSQLParser.AddColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtDropDB}
	 * labeled alternative in {@link GramaticaSQLParser#statementDatabase}.
	 * @param ctx the parse tree
	 */
	void enterStmtDropDB(@NotNull GramaticaSQLParser.StmtDropDBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtDropDB}
	 * labeled alternative in {@link GramaticaSQLParser#statementDatabase}.
	 * @param ctx the parse tree
	 */
	void exitStmtDropDB(@NotNull GramaticaSQLParser.StmtDropDBContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelMayor}
	 * labeled alternative in {@link GramaticaSQLParser#opeRelacional}.
	 * @param ctx the parse tree
	 */
	void enterRelMayor(@NotNull GramaticaSQLParser.RelMayorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelMayor}
	 * labeled alternative in {@link GramaticaSQLParser#opeRelacional}.
	 * @param ctx the parse tree
	 */
	void exitRelMayor(@NotNull GramaticaSQLParser.RelMayorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSQLParser#useDatabase}.
	 * @param ctx the parse tree
	 */
	void enterUseDatabase(@NotNull GramaticaSQLParser.UseDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSQLParser#useDatabase}.
	 * @param ctx the parse tree
	 */
	void exitUseDatabase(@NotNull GramaticaSQLParser.UseDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notNotAtom}
	 * labeled alternative in {@link GramaticaSQLParser#not}.
	 * @param ctx the parse tree
	 */
	void enterNotNotAtom(@NotNull GramaticaSQLParser.NotNotAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notNotAtom}
	 * labeled alternative in {@link GramaticaSQLParser#not}.
	 * @param ctx the parse tree
	 */
	void exitNotNotAtom(@NotNull GramaticaSQLParser.NotNotAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSQLParser#dropConstraint}.
	 * @param ctx the parse tree
	 */
	void enterDropConstraint(@NotNull GramaticaSQLParser.DropConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSQLParser#dropConstraint}.
	 * @param ctx the parse tree
	 */
	void exitDropConstraint(@NotNull GramaticaSQLParser.DropConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code actTableAddCol}
	 * labeled alternative in {@link GramaticaSQLParser#actionTable}.
	 * @param ctx the parse tree
	 */
	void enterActTableAddCol(@NotNull GramaticaSQLParser.ActTableAddColContext ctx);
	/**
	 * Exit a parse tree produced by the {@code actTableAddCol}
	 * labeled alternative in {@link GramaticaSQLParser#actionTable}.
	 * @param ctx the parse tree
	 */
	void exitActTableAddCol(@NotNull GramaticaSQLParser.ActTableAddColContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtAlterDB}
	 * labeled alternative in {@link GramaticaSQLParser#statementDatabase}.
	 * @param ctx the parse tree
	 */
	void enterStmtAlterDB(@NotNull GramaticaSQLParser.StmtAlterDBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtAlterDB}
	 * labeled alternative in {@link GramaticaSQLParser#statementDatabase}.
	 * @param ctx the parse tree
	 */
	void exitStmtAlterDB(@NotNull GramaticaSQLParser.StmtAlterDBContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtShowColsFrom}
	 * labeled alternative in {@link GramaticaSQLParser#statementTable}.
	 * @param ctx the parse tree
	 */
	void enterStmtShowColsFrom(@NotNull GramaticaSQLParser.StmtShowColsFromContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtShowColsFrom}
	 * labeled alternative in {@link GramaticaSQLParser#statementTable}.
	 * @param ctx the parse tree
	 */
	void exitStmtShowColsFrom(@NotNull GramaticaSQLParser.StmtShowColsFromContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSQLParser#createDatabase}.
	 * @param ctx the parse tree
	 */
	void enterCreateDatabase(@NotNull GramaticaSQLParser.CreateDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSQLParser#createDatabase}.
	 * @param ctx the parse tree
	 */
	void exitCreateDatabase(@NotNull GramaticaSQLParser.CreateDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterTableAction}
	 * labeled alternative in {@link GramaticaSQLParser#alterTable}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableAction(@NotNull GramaticaSQLParser.AlterTableActionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterTableAction}
	 * labeled alternative in {@link GramaticaSQLParser#alterTable}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableAction(@NotNull GramaticaSQLParser.AlterTableActionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtRenameTable}
	 * labeled alternative in {@link GramaticaSQLParser#statementTable}.
	 * @param ctx the parse tree
	 */
	void enterStmtRenameTable(@NotNull GramaticaSQLParser.StmtRenameTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtRenameTable}
	 * labeled alternative in {@link GramaticaSQLParser#statementTable}.
	 * @param ctx the parse tree
	 */
	void exitStmtRenameTable(@NotNull GramaticaSQLParser.StmtRenameTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tipoIdInt}
	 * labeled alternative in {@link GramaticaSQLParser#tipoId}.
	 * @param ctx the parse tree
	 */
	void enterTipoIdInt(@NotNull GramaticaSQLParser.TipoIdIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tipoIdInt}
	 * labeled alternative in {@link GramaticaSQLParser#tipoId}.
	 * @param ctx the parse tree
	 */
	void exitTipoIdInt(@NotNull GramaticaSQLParser.TipoIdIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cKeyPK}
	 * labeled alternative in {@link GramaticaSQLParser#cKey}.
	 * @param ctx the parse tree
	 */
	void enterCKeyPK(@NotNull GramaticaSQLParser.CKeyPKContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cKeyPK}
	 * labeled alternative in {@link GramaticaSQLParser#cKey}.
	 * @param ctx the parse tree
	 */
	void exitCKeyPK(@NotNull GramaticaSQLParser.CKeyPKContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtAlterTable}
	 * labeled alternative in {@link GramaticaSQLParser#statementTable}.
	 * @param ctx the parse tree
	 */
	void enterStmtAlterTable(@NotNull GramaticaSQLParser.StmtAlterTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtAlterTable}
	 * labeled alternative in {@link GramaticaSQLParser#statementTable}.
	 * @param ctx the parse tree
	 */
	void exitStmtAlterTable(@NotNull GramaticaSQLParser.StmtAlterTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelMayorIgual}
	 * labeled alternative in {@link GramaticaSQLParser#opeRelacional}.
	 * @param ctx the parse tree
	 */
	void enterRelMayorIgual(@NotNull GramaticaSQLParser.RelMayorIgualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelMayorIgual}
	 * labeled alternative in {@link GramaticaSQLParser#opeRelacional}.
	 * @param ctx the parse tree
	 */
	void exitRelMayorIgual(@NotNull GramaticaSQLParser.RelMayorIgualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cKeyCHK}
	 * labeled alternative in {@link GramaticaSQLParser#cKey}.
	 * @param ctx the parse tree
	 */
	void enterCKeyCHK(@NotNull GramaticaSQLParser.CKeyCHKContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cKeyCHK}
	 * labeled alternative in {@link GramaticaSQLParser#cKey}.
	 * @param ctx the parse tree
	 */
	void exitCKeyCHK(@NotNull GramaticaSQLParser.CKeyCHKContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSQLParser#createTable}.
	 * @param ctx the parse tree
	 */
	void enterCreateTable(@NotNull GramaticaSQLParser.CreateTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSQLParser#createTable}.
	 * @param ctx the parse tree
	 */
	void exitCreateTable(@NotNull GramaticaSQLParser.CreateTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSQLParser#relacional}.
	 * @param ctx the parse tree
	 */
	void enterRelacional(@NotNull GramaticaSQLParser.RelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSQLParser#relacional}.
	 * @param ctx the parse tree
	 */
	void exitRelacional(@NotNull GramaticaSQLParser.RelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSQLParser#insert}.
	 * @param ctx the parse tree
	 */
	void enterInsert(@NotNull GramaticaSQLParser.InsertContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSQLParser#insert}.
	 * @param ctx the parse tree
	 */
	void exitInsert(@NotNull GramaticaSQLParser.InsertContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSQLParser#update}.
	 * @param ctx the parse tree
	 */
	void enterUpdate(@NotNull GramaticaSQLParser.UpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSQLParser#update}.
	 * @param ctx the parse tree
	 */
	void exitUpdate(@NotNull GramaticaSQLParser.UpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSQLParser#delete}.
	 * @param ctx the parse tree
	 */
	void enterDelete(@NotNull GramaticaSQLParser.DeleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSQLParser#delete}.
	 * @param ctx the parse tree
	 */
	void exitDelete(@NotNull GramaticaSQLParser.DeleteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtShowTables}
	 * labeled alternative in {@link GramaticaSQLParser#statementTable}.
	 * @param ctx the parse tree
	 */
	void enterStmtShowTables(@NotNull GramaticaSQLParser.StmtShowTablesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtShowTables}
	 * labeled alternative in {@link GramaticaSQLParser#statementTable}.
	 * @param ctx the parse tree
	 */
	void exitStmtShowTables(@NotNull GramaticaSQLParser.StmtShowTablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSQLParser#principal}.
	 * @param ctx the parse tree
	 */
	void enterPrincipal(@NotNull GramaticaSQLParser.PrincipalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSQLParser#principal}.
	 * @param ctx the parse tree
	 */
	void exitPrincipal(@NotNull GramaticaSQLParser.PrincipalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelMenorIgual}
	 * labeled alternative in {@link GramaticaSQLParser#opeRelacional}.
	 * @param ctx the parse tree
	 */
	void enterRelMenorIgual(@NotNull GramaticaSQLParser.RelMenorIgualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelMenorIgual}
	 * labeled alternative in {@link GramaticaSQLParser#opeRelacional}.
	 * @param ctx the parse tree
	 */
	void exitRelMenorIgual(@NotNull GramaticaSQLParser.RelMenorIgualContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSQLParser#showColumnsFrom}.
	 * @param ctx the parse tree
	 */
	void enterShowColumnsFrom(@NotNull GramaticaSQLParser.ShowColumnsFromContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSQLParser#showColumnsFrom}.
	 * @param ctx the parse tree
	 */
	void exitShowColumnsFrom(@NotNull GramaticaSQLParser.ShowColumnsFromContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSQLParser#insertConstraint}.
	 * @param ctx the parse tree
	 */
	void enterInsertConstraint(@NotNull GramaticaSQLParser.InsertConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSQLParser#insertConstraint}.
	 * @param ctx the parse tree
	 */
	void exitInsertConstraint(@NotNull GramaticaSQLParser.InsertConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtActionTable}
	 * labeled alternative in {@link GramaticaSQLParser#statementTable}.
	 * @param ctx the parse tree
	 */
	void enterStmtActionTable(@NotNull GramaticaSQLParser.StmtActionTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtActionTable}
	 * labeled alternative in {@link GramaticaSQLParser#statementTable}.
	 * @param ctx the parse tree
	 */
	void exitStmtActionTable(@NotNull GramaticaSQLParser.StmtActionTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tipoIdText}
	 * labeled alternative in {@link GramaticaSQLParser#tipoId}.
	 * @param ctx the parse tree
	 */
	void enterTipoIdText(@NotNull GramaticaSQLParser.TipoIdTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tipoIdText}
	 * labeled alternative in {@link GramaticaSQLParser#tipoId}.
	 * @param ctx the parse tree
	 */
	void exitTipoIdText(@NotNull GramaticaSQLParser.TipoIdTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSQLParser#and}.
	 * @param ctx the parse tree
	 */
	void enterAnd(@NotNull GramaticaSQLParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSQLParser#and}.
	 * @param ctx the parse tree
	 */
	void exitAnd(@NotNull GramaticaSQLParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSQLParser#extra}.
	 * @param ctx the parse tree
	 */
	void enterExtra(@NotNull GramaticaSQLParser.ExtraContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSQLParser#extra}.
	 * @param ctx the parse tree
	 */
	void exitExtra(@NotNull GramaticaSQLParser.ExtraContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tipoIdDate}
	 * labeled alternative in {@link GramaticaSQLParser#tipoId}.
	 * @param ctx the parse tree
	 */
	void enterTipoIdDate(@NotNull GramaticaSQLParser.TipoIdDateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tipoIdDate}
	 * labeled alternative in {@link GramaticaSQLParser#tipoId}.
	 * @param ctx the parse tree
	 */
	void exitTipoIdDate(@NotNull GramaticaSQLParser.TipoIdDateContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSQLParser#dropTable}.
	 * @param ctx the parse tree
	 */
	void enterDropTable(@NotNull GramaticaSQLParser.DropTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSQLParser#dropTable}.
	 * @param ctx the parse tree
	 */
	void exitDropTable(@NotNull GramaticaSQLParser.DropTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtShowDB}
	 * labeled alternative in {@link GramaticaSQLParser#statementDatabase}.
	 * @param ctx the parse tree
	 */
	void enterStmtShowDB(@NotNull GramaticaSQLParser.StmtShowDBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtShowDB}
	 * labeled alternative in {@link GramaticaSQLParser#statementDatabase}.
	 * @param ctx the parse tree
	 */
	void exitStmtShowDB(@NotNull GramaticaSQLParser.StmtShowDBContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSQLParser#or}.
	 * @param ctx the parse tree
	 */
	void enterOr(@NotNull GramaticaSQLParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSQLParser#or}.
	 * @param ctx the parse tree
	 */
	void exitOr(@NotNull GramaticaSQLParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSQLParser#showDatabases}.
	 * @param ctx the parse tree
	 */
	void enterShowDatabases(@NotNull GramaticaSQLParser.ShowDatabasesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSQLParser#showDatabases}.
	 * @param ctx the parse tree
	 */
	void exitShowDatabases(@NotNull GramaticaSQLParser.ShowDatabasesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code actTableDropCnst}
	 * labeled alternative in {@link GramaticaSQLParser#actionTable}.
	 * @param ctx the parse tree
	 */
	void enterActTableDropCnst(@NotNull GramaticaSQLParser.ActTableDropCnstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code actTableDropCnst}
	 * labeled alternative in {@link GramaticaSQLParser#actionTable}.
	 * @param ctx the parse tree
	 */
	void exitActTableDropCnst(@NotNull GramaticaSQLParser.ActTableDropCnstContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSQLParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpression(@NotNull GramaticaSQLParser.BooleanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSQLParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpression(@NotNull GramaticaSQLParser.BooleanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelMenor}
	 * labeled alternative in {@link GramaticaSQLParser#opeRelacional}.
	 * @param ctx the parse tree
	 */
	void enterRelMenor(@NotNull GramaticaSQLParser.RelMenorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelMenor}
	 * labeled alternative in {@link GramaticaSQLParser#opeRelacional}.
	 * @param ctx the parse tree
	 */
	void exitRelMenor(@NotNull GramaticaSQLParser.RelMenorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSQLParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(@NotNull GramaticaSQLParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSQLParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(@NotNull GramaticaSQLParser.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtPrincipalData}
	 * labeled alternative in {@link GramaticaSQLParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStmtPrincipalData(@NotNull GramaticaSQLParser.StmtPrincipalDataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtPrincipalData}
	 * labeled alternative in {@link GramaticaSQLParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStmtPrincipalData(@NotNull GramaticaSQLParser.StmtPrincipalDataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelDiferentes}
	 * labeled alternative in {@link GramaticaSQLParser#opeRelacional}.
	 * @param ctx the parse tree
	 */
	void enterRelDiferentes(@NotNull GramaticaSQLParser.RelDiferentesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelDiferentes}
	 * labeled alternative in {@link GramaticaSQLParser#opeRelacional}.
	 * @param ctx the parse tree
	 */
	void exitRelDiferentes(@NotNull GramaticaSQLParser.RelDiferentesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtCreateDB}
	 * labeled alternative in {@link GramaticaSQLParser#statementDatabase}.
	 * @param ctx the parse tree
	 */
	void enterStmtCreateDB(@NotNull GramaticaSQLParser.StmtCreateDBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtCreateDB}
	 * labeled alternative in {@link GramaticaSQLParser#statementDatabase}.
	 * @param ctx the parse tree
	 */
	void exitStmtCreateDB(@NotNull GramaticaSQLParser.StmtCreateDBContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtCreateTable}
	 * labeled alternative in {@link GramaticaSQLParser#statementTable}.
	 * @param ctx the parse tree
	 */
	void enterStmtCreateTable(@NotNull GramaticaSQLParser.StmtCreateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtCreateTable}
	 * labeled alternative in {@link GramaticaSQLParser#statementTable}.
	 * @param ctx the parse tree
	 */
	void exitStmtCreateTable(@NotNull GramaticaSQLParser.StmtCreateTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSQLParser#insertColumns}.
	 * @param ctx the parse tree
	 */
	void enterInsertColumns(@NotNull GramaticaSQLParser.InsertColumnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSQLParser#insertColumns}.
	 * @param ctx the parse tree
	 */
	void exitInsertColumns(@NotNull GramaticaSQLParser.InsertColumnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSQLParser#constraint}.
	 * @param ctx the parse tree
	 */
	void enterConstraint(@NotNull GramaticaSQLParser.ConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSQLParser#constraint}.
	 * @param ctx the parse tree
	 */
	void exitConstraint(@NotNull GramaticaSQLParser.ConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSQLParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(@NotNull GramaticaSQLParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSQLParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(@NotNull GramaticaSQLParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtUseDB}
	 * labeled alternative in {@link GramaticaSQLParser#statementDatabase}.
	 * @param ctx the parse tree
	 */
	void enterStmtUseDB(@NotNull GramaticaSQLParser.StmtUseDBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtUseDB}
	 * labeled alternative in {@link GramaticaSQLParser#statementDatabase}.
	 * @param ctx the parse tree
	 */
	void exitStmtUseDB(@NotNull GramaticaSQLParser.StmtUseDBContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelIgual}
	 * labeled alternative in {@link GramaticaSQLParser#opeRelacional}.
	 * @param ctx the parse tree
	 */
	void enterRelIgual(@NotNull GramaticaSQLParser.RelIgualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelIgual}
	 * labeled alternative in {@link GramaticaSQLParser#opeRelacional}.
	 * @param ctx the parse tree
	 */
	void exitRelIgual(@NotNull GramaticaSQLParser.RelIgualContext ctx);
}
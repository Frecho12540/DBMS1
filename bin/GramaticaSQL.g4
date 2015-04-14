grammar GramaticaSQL;

CREATE : 'create' | 'CREATE' | 'Create' ;
DATABASE: 'database' |'DATABASE' | 'Database' ;
DATABASES : 'databases' | 'DATABASES' |'Databases' ;
ALTER : 'alter' |'ALTER'| 'Alter' ;
DROP: 'drop' | 'DROP'| 'Drop' ;
SHOW : 'show' | 'SHOW' | 'Show' ;
USE : 'use' | 'USE' | 'Use' ;
CHECK : 'check' | 'CHECK' | 'Check' ;
CONSTRAINT : 'constraint' | 'CONSTRAINT' | 'Constraint' ;
PRIMARY : 'primary' | 'PRIMARY' | 'Primary' ;
FOREIGN : 'foreign' | 'FOREIGN' | 'Foreign' ;
KEY : 'key'| 'KEY' | 'Key' ;
REFERENCES : 'references' | 'REFERENCES' | 'References' ;
INT : 'int' |'INT' | 'Int' ;
FLOAT : 'float' | 'FLOAT' | 'Float' ;
DATE : 'date' | 'DATE' | 'Date' ;
CHAR : 'char' | 'CHAR' | 'Char' ;
AND : 'and' |'AND' | 'And' ;
OR : 'or' |'OR' | 'Or' ;
NOT : 'not' | 'NOT' |'Not' ;
TABLE : 'table' |'TABLE' | 'Table' ;
TABLES : 'tables' | 'TABLES' | 'Tables' ;
RENAME : 'rename' | 'RENAME' | 'Rename' ;
TO : 'to' | 'TO' | 'To' ;
ADD : 'add' | 'ADD' | 'Add' ;
COLUMN : 'column' | 'COLUMN' | 'Column' ;
COLUMNS : 'columns' | 'COLUMNS' | 'Columns' ;
INSERT : 'insert' | 'INSERT' | 'Insert' ;
INTO : 'into' | 'INTO' | 'Into' ;
VALUES : 'values' | 'VALUES' | 'Values' ;
NULL : 'null' | 'NULL' | 'Null' ;
UPDATE : 'update' | 'UPDATE' | 'Update' ;
SET : 'set' | 'SET' | 'Set' ;
WHERE : 'where' | 'WHERE' | 'Where' ;
DELETE : 'delete' | 'DELETE' | 'Delete' ;
SELECT : 'select' | 'SELECT' | 'Select' ;
FROM : 'from' | 'FROM' | 'From' ;
ORDER : 'order' | 'ORDER' |'Order' ;
BY : 'by' | 'BY' | 'By' ;
ASC : 'asc' | 'ASC' | 'Asc' ;
DESC : 'desc' | 'DESC' | 'Desc';
NUM : Digit(Digit)* ;
ID : Letter (Letter | Digit)* ;
TEXT : Letter (Letter | Digit)* ;
VALOR: Letter (Letter)* ;
LOGICAL : Relational ;  

COMMENTS: '//' ~('\r' | '\n' )* -> channel(HIDDEN) ;
WS: [ \t\r\n\f]+  -> channel(HIDDEN);

fragment Letter : ('a'..'z' | 'A'..'Z') ;
fragment Digit : '0'..'9' ;
fragment Any : '!' | '@' | '#' | '$' | '%' | '^' | '*' | '(' | ')' | '{' | '}' ;
fragment Operator : '+' | '-' | '*' | '/' ;
fragment Relational : '<' | '<=' | '>' | '>=' | '<>' | '=' ;
fragment Special :  '\t' | '\n' | '\'' | '\"' | '?' | ',' | '.' ;

principal
:	statements (';' statements)* (';')?
;

statements
:	statementDatabase 		#stmtPrincipalDB
|	statementTable			#stmtPrincipalTable
|	statementData			#stmtPrincipalData
;

/*************************DDL*************************/

statementDatabase
:	createDatabase		#stmtCreateDB
|	alterDatabase		#stmtAlterDB
|	dropDatabase		#stmtDropDB
|	useDatabase			#stmtUseDB
|	showDatabases		#stmtShowDB
;

createDatabase
:	CREATE DATABASE ID
;

alterDatabase
:	ALTER DATABASE ID RENAME TO ID
;


dropDatabase
:	DROP DATABASE ID
;

showDatabases
:	SHOW DATABASES
;

useDatabase
:	USE DATABASE ID
;

createTable
:	CREATE TABLE ID '(' insertColumns constraint  ')' 
;

insertColumns
:	ID tipoId (',' ID tipoId)*
;

constraint
:	(CONSTRAINT cKey (',' CONSTRAINT cKey)*)?
;

tipoId
:	INT										#tipoIdInt
|	TEXT									#tipoIdText
|	FLOAT									#tipoIdFloat
|	DATE									#tipoIdDate
|	CHAR '(' NUM ')'						#tipoIdChar
;

cKey
:	ID PRIMARY KEY '('  insertConstraint ')'												#cKeyPK
|	ID FOREIGN KEY '('  insertConstraint ')' REFERENCES ID '('  insertConstraint ')'		#cKeyFK
|	ID CHECK '(' atom ')'																	#cKeyCHK
;
 
insertConstraint
:	ID (',' ID)*
;
booleanExpression
:	or
;

or
:	and (OR and)*
;

and
:	not (AND not)*
;

opeRelacional
: '<' 		#RelMenor
| '<=' 		#RelMenorIgual
| '>' 		#RelMayor
| '>=' 		#RelMayorIgual
| '<>' 		#RelDiferentes
| '='		#RelIgual
;

relacional
:	ID opeRelacional  NUM
|	ID opeRelacional '\'' VALOR '\''
;

not
:	NOT atom		#notNotAtom
|	atom			#notAtom
;

atom
:	'(' booleanExpression ')'		
;


 
statementTable
:	createTable			#stmtCreateTable
|	alterTable			#stmtAlterTable
|	renameTable			#stmtRenameTable
|	actionTable			#stmtActionTable
|	showTables			#stmtShowTables
|	dropTable			#stmtDropTable
|	showColumnsFrom		#stmtShowColsFrom
;

alterTable
:	ALTER TABLE ID renameTable							#alterTableRename
|	ALTER TABLE ID actionTable (',' actionTable)*		#alterTableAction
;

renameTable
:	RENAME TO ID
;

actionTable
:	addColumn tipoId constraint				#actTableAddCol
|	addConstraint cKey						#actTableAddCnst
|	dropColumn								#actTableDropCol
|	dropConstraint							#actTableDropCnst
;

addColumn
:	ADD COLUMN ID
;

addConstraint
:	ADD CONSTRAINT ID
;

dropColumn
:	DROP COLUMN ID
;

dropConstraint
:	DROP CONSTRAINT ID
;

showTables
:	SHOW TABLES
;

dropTable
:	DROP TABLE ID
;

showColumnsFrom
:	SHOW COLUMNS FROM ID
;

/*************************DML*************************/

statementData
:	insert
|	update
|	delete
|	select
;

insert
:	INSERT INTO ID '(' ID (',' ID)* ')' VALUES '(' tipoId (',' tipoId)* ')'
;

update
:	UPDATE ID SET setting
;

setting
:	ID '=' tipoId (',' ID '=' tipoId)* (WHERE condicion)? 
;

delete
:	DELETE FROM ID (WHERE condicion)? 
;

select
:	SELECT ('*' | ID (',' ID)* ) FROM ID (WHERE condicion)? (ORDER BY ID (ASC | DESC) ( ',' ID (ASC | DESC))*)?
;

condicion
:	ID AND ID
|	ID OR ID
|	NOT ID
|	ID LOGICAL ID 
;

extra
:	(AND condicion)+ (OR condicion)+
;

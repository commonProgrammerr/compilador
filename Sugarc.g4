grammar Sugarc;

program: (varDecl | classDecl | functionDecl)* EOF;

classDecl: 
    'class' ID (classInherence)? 
    '{' (field | method)* 
    '}'
;

classInherence:
    'extends' ID
;

functionDecl: 
    (type | 'void') ID '(' params? ')' block
;

field: 
    type ID ('=' expr)? ';' 
;

method: 
    (type | 'void') ID '(' params? ')' block
;

params: 
    param (',' param)* 
;

param: 
    type ID 
;

type: 
    'int' 
    | 'string' 
    | 'bool' 
    | 'float' 
    | ID 
;

varDecl: 
    type ID ('=' expr)? ';' 
;

ifStmt: 
    'if' '(' expr ')' block ('else' block)?
;

whileStmt: 
    'while' '(' expr ')' block
;

forStmt: 
    'for' '(' (varDecl | expr ';')? expr? ';' expr? ')' block
;

forEachStmt: 
    'for' '(' type ID ':' expr ')' block
;

controlStmt:
    'break' ';'           # breakStmt
    | 'continue' ';'      # continueStmt
    | 'return' expr? ';'  # returnStmt
;

stmt: 
    varDecl 
    | expr ';' 
    | ifStmt
    | whileStmt
    | forStmt
    | forEachStmt
    | block
    | controlStmt
;

block: 
    '{' stmt* '}' 
;

expr: 
    expr '.' ID                          # memberAccess
    | expr '.' ID '(' exprList? ')'      # methodCall
    | 'new' ID '(' exprList? ')'         # objectInstantiation
    | ID '(' exprList? ')'               # functionCall
    | 'this'                             # thisReference
    | 'super' '(' exprList? ')'          # superCall
    | expr '[' expr ']'                  # arrayAccess
    | '!' expr                           # notExpr
    | expr op=('*'|'/') expr             # mulDivExpr
    | expr op=('+'|'-') expr             # addSubExpr
    | expr op=('<'|'>'|'<='|'>=') expr   # relationalExpr
    | expr op=('=='|'!=') expr           # equalityExpr
    | expr '&&' expr                     # andExpr
    | expr '||' expr                     # orExpr
    | ID '=' expr                        # assignment
    | literal                            # literalExpr
    // | ID '++'                           # VarIncrement
    // | ID '--'                           # VarDecrement
    | ID                                 #VarReference
    | '(' expr ')'                       #GroupedExpr
;

exprList: 
    expr (',' expr)* 
;

literal: 
    INT
    | FLOAT 
    | STRING 
    | BOOLEAN 
    | 'null' 
;

// Tokens
INT: [0-9]+;
STRING: '"' .*? '"';
BOOLEAN: 'true' | 'false';
FLOAT: [0-9]+ '.' [0-9]+;

// Identificadores
ID: [a-zA-Z_][a-zA-Z0-9_]*;

// Comentários e espaços
WS: [ \t\r\n]+ -> skip;
COMMENT: '/*' .*? '*/' -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;
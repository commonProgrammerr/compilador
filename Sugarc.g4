grammar Sugarc;

program: (PREPROCESSOR | varDecl | classDecl | functionDecl)* EOF;

// Declarações de classes, funções e variáveis
classDecl: 
    'class' ID (classInherence)? 
    '{' (classAttrDecl | methodDecl | classContructorDecl)* '}'
;

classInherence:
    'extends' ID
;

// Declarações de construtores de classe
classContructorDecl: 
    'constructor' '(' params? ')' block
;

// Declarações de métodos
methodDecl: 
    type ID '(' params? ')' block
;

// declarações de atributos de classe
classAttrDecl: 
    type ID ';'                             # attributeDeclaration
    | type ID '[' size=INT? ']' ';'         # arrayAttributeDeclaration
;

// declarações de funções
functionDecl: 
    type ID '(' params? ')' block
;

/* Declarações de variáveis

Variáveis podem ser declaradas dentro de funções, classes ou globalmente,
podem ser de tipos primitivos, arrays ou objetos, podem ser inicializadas.
*/
varDecl: 
    type ID ('=' expr)? ';'                          # variableDeclaration
    // | type ID ('=' expr)? ',' varDecl               # multipleVariableDeclaration
    | type ID '[' size=INT? ']' ';'                       # arrayDeclaration
    | type ID '[' size=INT ']' '=' '{' exprList? '}' ';'  # arrayInitialization
;

// Declarações de tipos
typdefDecl: 
    'typedef' type ID ';'
;

//////////////////////////////////////////////////////////////////////////////////////////////

// declarações de parâmetros para funções e construtores
params: 
    param (',' param)* 
;

param: 
    type ID 
;

type: 
    ('const'|'volatile'|'static')? ('unsigned'|'signed')? basicTypes ('*')? # primitiveType
    | ID        # deviatedType
;

basicTypes: 
    ('short')? 'int' 
    | 'short'
    | 'long' ('long')?
    | 'bool' 
    | 'char'
    | 'float'
    | 'double'
    | 'void'
;

ifStmt: 
    'if' '(' expr ')' stmt (elseStmt)?
;

elseStmt: 
    'else' stmt
;

whileStmt: 
    'while' '(' expr ')' stmt
;

forStmt: 
    'for' '(' varDecl? ';' expr? ';' expr? ')' stmt
;

controlStmt:
    'break' ';'           # breakStmt
    | 'continue' ';'      # continueStmt
    | 'return' expr? ';'  # returnStmt
;

stmt: 
    varDecl
    | typdefDecl
    | expr ';' 
    | ifStmt
    | whileStmt
    | forStmt
    | block
    | controlStmt
    | PREPROCESSOR
;

block: 
    '{' stmt* '}' 
;

expr: 
    ID                                   # varReference
    | expr '.' ID                        # memberAccess
    | expr '.' ID '(' exprList? ')'      # methodCall
    | 'new' ID '(' exprList? ')'         # objectInstantiation
    | 'super' '(' exprList? ')'          # superCall
    | 'this' '.' expr                    # selfReference
    | ID '(' exprList? ')'               # functionCall
    | expr '[' expr ']'                  # arrayAccess
    | '!' expr                           # notExpr
    | expr op=('*'|'/') expr             # mulDivExpr
    | expr op=('+'|'-') expr             # addSubExpr
    | expr op=('<'|'>'|'<='|'>=') expr   # relationalExpr
    | expr op=('=='|'!=') expr           # equalityExpr
    | expr '&&' expr                     # andExpr
    | expr '||' expr                     # orExpr
    | ID '=' expr                        # assignment
    | ID '[' expr ']' '=' expr           # indexAssignment
    | literal                            # literalExpr
    | '(' expr ')'                       # groupedExpr
    | '(' type ')' expr                  # typeCast
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

// Sintaxe pre-compilador do c
PREPROCESSOR: '#' ID (' ' | '\t')* ~[\r\n]*('\\\n')?
    | '#' ID (' ' | '\t')* ~[\r\n]*('\\\r\n')?
    | '#' ID (' ' | '\t')* ~[\r\n]*('\\\n\r')?
    | '#' ID (' ' | '\t')* ~[\r\n]*('\\\n\r')?
    | '#' ID (' ' | '\t')* ~[\r\n]*('\\\r')?
    | '#' ID 
;

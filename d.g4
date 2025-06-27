grammar d;

program     : (statement)* EOF ;

statement
    : varDecl ';'
    | assignStat ';'
    | ifStat
    | whileStat
    | printStat ';'
    | forStat
    | block
    ;
varType     : 'int' | 'float' | 'string' | 'bool' | 'void' ;
varDecl     : varType ID ;
varIntDecl  : 'int' ID '=' INT ;
varFloatDecl: 'float' ID '=' FLOAT ;
varStringDecl: 'string' ID '=' STRING ;
varBoolDecl : 'bool' ID '=' ('true' | 'false') ;
assignStat  : ID '=' expr ;
ifStat      : 'if' '(' expr ')' statement ('else' statement)? ;
whileStat   : 'while' '(' expr ')' statement ;
block       : '{' (statement)* '}' ;
printStat   : 'print' '(' expr ')';
forStat     : 'for' '(' assignStat ';' expr ';' assignStat ')' statement ;

functionDef : varType ID '(' (ID (',' ID)*)? ')' block ;
functionCall : ID '(' (expr (',' expr)*)? ')' ;

expr
    : expr op=('*'|'/') expr
    | expr op=('+'|'-') expr
    | INT
    | STRING
    | ID
    | '(' expr ')'
    ;

ID          : [a-zA-Z_][a-zA-Z_0-9]* ;
INT         : [0-9]+;
FLOAT         : [0-9]+(.[0-9]+)? ;
STRING      : '"' ( ~["\\] | '\\' . )* '"' ;
WS          : [ \t\r\n]+ -> skip ;
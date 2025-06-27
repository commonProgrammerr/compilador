grammar clshell;

// Regras do parser
program
    : (classDef | functionDef | statement)* EOF
    ;

classDef
    : 'class' IDENTIFIER ('extends' IDENTIFIER)? '{'
        propsDef?
        (methodDef)*
      '}'
    ;

propsDef
    : 'props' '(' (IDENTIFIER (',' IDENTIFIER)*)? ')' 
    ;

methodDef
    : accessModifier? 'function' IDENTIFIER '(' params? ')' '{'
        statement*
      '}'
    ;

accessModifier
    : 'public'
    | 'private'
    | 'protected'
    ;

functionDef
    : 'function' IDENTIFIER '(' params? ')' '{'
        statement*
      '}'
    ;

params
    : IDENTIFIER (',' IDENTIFIER)*
    ;

statement
    : variableDeclaration
    | assignment
    | methodCall
    | ifStatement
    | pipeline
    | echoStatement
    | block
    ;

variableDeclaration
    : 'local' IDENTIFIER '=' expression
    ;

assignment
    : IDENTIFIER '=' expression
    ;

methodCall
    : expression '.' IDENTIFIER '(' (expression (',' expression)*)? ')'
    ;

ifStatement
    : 'if' '[' condition ']' 'then' block
    ;

condition
    : expression op=('-' 'gt' | '-' 'lt' | '-' 'eq' | '==' | '!=' | '>' | '<' | '>=' | '<=') expression
    | expression
    ;

pipeline
    : command ('|' command)*
    ;

echoStatement
    : 'echo' STRING
    ;

command
    : IDENTIFIER (argument)*
    ;

argument
    : STRING
    | IDENTIFIER
    | NUMBER
    ;

block
    : '{' statement* '}'
    ;

expression
    : STRING
    | NUMBER
    | IDENTIFIER
    | 'new' IDENTIFIER (expression (',' expression)*)?
    | expression '.' IDENTIFIER
    | '${' expression '}'
    | '(' expression ')'
    ;

// Regras do lexer
STRING
    : '"' (~["\\] | '\\' .)* '"'
    | '\'' (~['\\] | '\\' .)* '\''
    | '`' (~[`\\] | '\\' .)* '`'
    ;

NUMBER
    : [0-9]+
    ;

IDENTIFIER
    : [a-zA-Z_][a-zA-Z0-9_]*
    ;

WS
    : [ \t\r\n]+ -> skip
    ;

COMMENT
    : '#' ~[\r\n]* -> skip
    ;

// Operadores e símbolos
PIPE: '|';
DOT: '.';
LBRACE: '{';
RBRACE: '}';
LPAREN: '(';
RPAREN: ')';
LBRACK: '[';
RBRACK: ']';
EQUALS: '=';
GT: '>';
LT: '<';
BANG: '!';
MINUS: '-';
DOLLAR: '$';
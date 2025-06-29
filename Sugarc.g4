grammar Sugarc;

program: (stmt | class_decl | function_decl)* EOF;

class_decl: 
    'class' ID ('extends' ID)? 
    '{' (field | method)* 
    '}'
;

function_decl: 
    (type | 'void') ID '(' params? ')' block
;

field: 
    type ID ';' 
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

var_decl: 
    type ID ('=' expr)? ';' 
;

if_stmt: 
    'if' '(' expr ')' block ('else' block)?
;

while_stmt: 
    'while' '(' expr ')' block
;

for_stmt: 
    'for' '(' (var_decl | expr ';')? expr? ';' expr? ')' block
;

for_each_stmt: 
    'for' '(' type ID ':' expr ')' block
;

stmt: 
    var_decl 
    | expr ';' 
    | if_stmt
    | while_stmt
    | for_stmt
    | for_each_stmt
    | block
    | 'break' ';'           //# break_stmt
    | 'continue' ';'        //# continue_stmt
    | 'return' expr? ';'    //# return_stmt
;

block: 
    '{' stmt* '}' 
;

expr: 
    expr '.' ID                          # member_access
    | expr '.' ID '(' expr_list? ')'     # method_call
    | 'new' ID '(' expr_list? ')'        # object_instantiation
    | ID '(' expr_list? ')'              # function_call
    | 'this'                             # this_reference
    | 'super' '(' expr_list? ')'         # super_call
    | expr '[' expr ']'                  # array_access
    | '!' expr                           # not_expr
    | expr op=('*'|'/') expr             # mul_div_expr
    | expr op=('+'|'-') expr             # add_sub_expr
    | expr op=('<'|'>'|'<='|'>=') expr   # relational_expr
    | expr op=('=='|'!=') expr           # equality_expr
    | expr '&&' expr                     # and_expr
    | expr '||' expr                     # or_expr
    | ID '=' expr                        # assignment
    | literal                            # literal_expr
    | ID                                 # var_reference
    | '(' expr ')'                       # grouped_expr
;

expr_list: 
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
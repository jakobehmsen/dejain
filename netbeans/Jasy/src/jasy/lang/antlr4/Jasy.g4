grammar Jasy;

program: classTransformer*;
classTransformer:
    (variableId=identifier ASSIGN_OP)? annotations accessModifier? KW_CLASS typeQualifier? 
    (OPEN_BRA members=classTransformerMembers CLOSE_BRA)?;
classTransformerMembers: classTransformerMemberDefinition*;
classTransformerMemberDefinition: (PLUS | (variableId=identifier ASSIGN_OP))? member = classTransformerMember;
classTransformerMember: 
    classTransformerMemberField | classTransformerMemberMethod;

classTransformerMemberField:
    annotations accessModifier? modStatic? typeQualifier? identifier? 
    (ASSIGN_OP value=expression)? SEMI_COLON;

classTransformerMemberMethod: 
    annotations accessModifier? modStatic? typeQualifier? identifier?
    OPEN_PAR parameters CLOSE_PAR body=classTransformerMemberMethodBlody;
classTransformerMemberMethodBlody: metaBlock | block;

block: OPEN_BRA statements CLOSE_BRA;
parameters: (parameter (COMMA parameter)*)?;
parameter: typeQualifier identifier;
expression: variableAssignment;
variableAssignment: identifier ASSIGN_OP value=variableAssignment | relationalExpression;
relationalExpression: 
    first=additiveExpression (relationalOperator rest=additiveExpression)*;
relationalOperator: operator=(LT | LTE | GT | GTE);
additiveExpression: first=multiplicativeExpression (additiveOperator rest=multiplicativeExpression)*;
additiveOperator: operator=(PLUS | MINUS);
multiplicativeExpression: first=leafExpression (multiplicativeOperator rest=leafExpression)*;
multiplicativeOperator: operator=(MULT | DIV);
leafExpression: 
    (invocation | literal | lookup | thisResult | proceedStatement | 
    metaExpression | quotedExpression | OPEN_PAR expression CLOSE_PAR) 
    leafExpressionChain;
leafExpressionChain: (DOT (lookup|invocation))*;
thisResult: KW_THIS_RESULT;
invocation: identifier OPEN_PAR arguments CLOSE_PAR;
arguments: (expression (COMMA expression)*)?;
lookup: identifier;
statements: statement*;
statement: metaBlock | nonDelimitedStatement | delimitedStatement SEMI_COLON;
nonDelimitedStatement: tryCatchStatement | ifElseStatement | whileStatement;
proceedStatement: ELLIPSES;
metaExpression: DOLLAR (expression | OPEN_BRA statements CLOSE_BRA);
quotedExpression: HASH (expression | nonDelimitedStatement | delimitedStatement | block);
tryCatchStatement: 
    tryStatement ((catchStatement finallyStatement?) | finallyStatement);
tryStatement: KW_TRY OPEN_BRA statements CLOSE_BRA;
catchStatement: 
    KW_CATCH OPEN_PAR parameter CLOSE_PAR OPEN_BRA statements CLOSE_BRA;
finallyStatement: KW_FINALLY OPEN_BRA statements CLOSE_BRA;
ifElseStatement: 
    KW_IF OPEN_PAR condition=expression CLOSE_PAR 
    ifTrueBlock
    ifFalseBlock?;
whileStatement:
    KW_WHILE OPEN_PAR condition=expression CLOSE_PAR 
    whileBody;
whileBody:
    OPEN_BRA statement* CLOSE_BRA | statement;
ifTrueBlock:
    OPEN_BRA statement* CLOSE_BRA | statement;
ifFalseBlock: KW_ELSE (OPEN_BRA statement* CLOSE_BRA | statement);
delimitedStatement: 
    returnStatement | throwStatement | variableDeclaration | 
    injectStatement | expression;
variableDeclaration: typeQualifier id=identifier (ASSIGN_OP value=expression)?;
returnStatement: KW_RETURN expression;
throwStatement: KW_THROW expression;
injectStatement: HAT expression;
literal: stringLiteral | integerLiteral | longLiteral | booleanLiteral;
stringLiteral: STRING;
integerLiteral: INTEGER;
longLiteral: LONG;
booleanLiteral: KW_TRUE | KW_FALSE;
metaBlock: DOLLAR OPEN_BRA statements CLOSE_BRA;

annotation: AT PLUS? typeQualifier;
annotations: annotation*;

typeQualifier: identifier (DOT identifier)*;
modStatic: MOD_STATIC;
accessModifier: ACC_MOD_PUBLIC | ACC_MOD_PRIVATE | ACC_MOD_PROTECTED;
identifier: ID;

ELLIPSES: '...';
COMMA: ',';
OPEN_PAR: '(';
CLOSE_PAR: ')';
HAT: '^';
AT: '@';
DOLLAR: '$';
HASH: '#';
PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
LT: '<';
LTE: '<=';
GT: '>';
GTE: '>=';
ASSIGN_OP: '=';
REPLACE_OP: '=>';
KW_THIS_RESULT: 'thisResult';
KW_TRY: 'try';
KW_CATCH: 'catch';
KW_FINALLY: 'finally';
KW_IF: 'if';
KW_ELSE: 'else';
KW_RETURN: 'return';
KW_THROW: 'throw';
KW_CLASS: 'class';
KW_TRUE: 'true';
KW_FALSE: 'false';
KW_WHILE: 'while';
WILD_CARD: '*';
SEMI_COLON: ';';
COLON: ':';
DOT: '.';
ACC_MOD_PUBLIC: 'public';
ACC_MOD_PRIVATE: 'private';
ACC_MOD_PROTECTED: 'protected';
MOD_STATIC: 'static';
fragment DIGIT: [0-9];
fragment LETTER: [A-Z]|[a-z];
ID: (LETTER | '_') (LETTER | '_' | DIGIT)*;
OPEN_BRA: '{';
CLOSE_BRA: '}';
INTEGER: DIGIT+;
LONG: DIGIT+ 'L';
STRING: '"' (EscapeSequence | ~[\\"])* '"';
fragment HexDigit: [0-9a-fA-F];
fragment EscapeSequence: '\\' [btnfr"'\\] | UnicodeEscape | OctalEscape;
fragment OctalEscape: '\\' [0-3] [0-7] [0-7] | '\\' [0-7] [0-7] | '\\' [0-7];
fragment UnicodeEscape: '\\' 'u' HexDigit HexDigit HexDigit HexDigit;

WS: [ \n\t\r]+ -> skip;
SINGLELINE_COMMENT: '//' ~('\r' | '\n')* -> skip;
MULTI_LINE_COMMENT: '/*' .*? '*/' -> skip;
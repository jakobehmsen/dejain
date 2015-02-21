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
variableAssignment: identifier assignmentOperator value=variableAssignment | equalityExpression;
assignmentOperator: 
    operator=(ASSIGN_OP | ASSIGN_ADD | ASSIGN_SUB | ASSIGN_MULT | ASSIGN_DIV);
equalityExpression: first=relationalExpression (equalityOperator rest=relationalExpression)*;
equalityOperator: operator=(EQUALS | NOT_EQUALS);
relationalExpression: 
    first=additiveExpression (relationalOperator rest=additiveExpression)*;
relationalOperator: operator=(LT | LTE | GT | GTE);
additiveExpression: first=multiplicativeExpression (additiveOperator rest=multiplicativeExpression)*;
additiveOperator: operator=(PLUS | MINUS);
multiplicativeExpression: first=unaryPrefixExpression (multiplicativeOperator rest=unaryPrefixExpression)*;
multiplicativeOperator: operator=(MULT | DIV | REM);
unaryPrefixExpression: 
    (unaryPrefixOperator operand=unaryPrefixExpression) | unaryPostfixExpression;
unaryPrefixOperator: operator=(INC | DEC | PLUS | MINUS | TILDE | EXCLA);
unaryPostfixExpression: leafExpression unaryPostfixOperator?;
unaryPostfixOperator: operator=(INC | DEC);
leafExpression: 
    (invocation | literal | lookup | thisResult | proceedStatement | 
    metaExpression | quotedExpression | newExpression | 
    embeddedExpression) 
    leafExpressionChain;
embeddedExpression: OPEN_PAR expression CLOSE_PAR;
leafExpressionChain: (DOT (lookup|invocation))*;
thisResult: KW_THIS_RESULT;
invocation: identifier OPEN_PAR arguments CLOSE_PAR;
arguments: (expression (COMMA expression)*)?;
lookup: unqualifiedLookup | qualifiedLookup;
unqualifiedLookup: identifier;
qualifiedLookup: COLON expression;
statements: statement*;
statement: metaBlock | nonDelimitedStatement | delimitedStatement SEMI_COLON;
nonDelimitedStatement: 
    tryCatchStatement | ifElseStatement | whileStatement | forStatement;
proceedStatement: ELLIPSES;
metaExpression: DOLLAR (expression | OPEN_BRA statements CLOSE_BRA);
quotedExpression: HASH (expression | nonDelimitedStatement | delimitedStatement | block);
newExpression: 
    KW_NEW className=typeQualifier 
    OPEN_PAR (expression (COMMA expression)*)? CLOSE_PAR;
tryCatchStatement: 
    tryStatement ((catchStatement finallyStatement?) | finallyStatement);
tryStatement: KW_TRY OPEN_BRA statements CLOSE_BRA;
catchStatement: 
    KW_CATCH OPEN_PAR parameter CLOSE_PAR OPEN_BRA statements CLOSE_BRA;
finallyStatement: KW_FINALLY OPEN_BRA statements CLOSE_BRA;
ifElseStatement: 
    KW_IF OPEN_PAR condition=expression CLOSE_PAR 
    ifTrueBlock=singleOrMultiStatement
    (KW_ELSE ifFalseBlock=singleOrMultiStatement)?;
whileStatement:
    KW_WHILE OPEN_PAR condition=expression CLOSE_PAR 
    whileTrueBlock=singleOrMultiStatement;
forStatement:
    KW_FOR OPEN_PAR 
        initialization=commaBlock? SEMI_COLON
        (condition=expression)? SEMI_COLON
        update=commaBlock?
    CLOSE_PAR 
    whileTrueBlock=singleOrMultiStatement;
commaBlock: (delimitedStatement (COMMA delimitedStatement)*);
delimitedStatement: 
    returnStatement | throwStatement | variableDeclaration | expression;
variableDeclaration: typeQualifier id=identifier (ASSIGN_OP value=expression)?;
returnStatement: KW_RETURN expression;
throwStatement: KW_THROW expression;
literal: 
    stringLiteral | integerLiteral | longLiteral | booleanLiteral |
    floatLiteral | doubleLiteral;
stringLiteral: STRING;
integerLiteral: INTEGER;
longLiteral: LONG;
floatLiteral: FLOAT;
doubleLiteral: DOUBLE;
booleanLiteral: KW_TRUE | KW_FALSE;
metaBlock: DOLLAR OPEN_BRA statements CLOSE_BRA;

singleOrMultiStatement: OPEN_BRA statements CLOSE_BRA | statement;

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
INC: '++';
DEC: '--';
TILDE: '~';
EXCLA: '!';
DOLLAR: '$';
HASH: '#';
PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
REM: '%';
LT: '<';
LTE: '<=';
GT: '>';
GTE: '>=';
EQUALS: '==';
NOT_EQUALS: '!=';
ASSIGN_OP: '=';
ASSIGN_ADD: '+=';
ASSIGN_SUB: '-=';
ASSIGN_MULT: '*=';
ASSIGN_DIV: '/=';
REPLACE_OP: '=>';
KW_THIS_RESULT: 'thisResult';
KW_NEW: 'new';
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
KW_FOR: 'for';
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
LONG: DIGIT+ ('L' | 'l');
DOUBLE: DIGIT* DOT DIGIT+;
FLOAT: DIGIT* DOT DIGIT+ ('F' | 'f');
STRING: '"' (EscapeSequence | ~[\\"])* '"';
fragment HexDigit: [0-9a-fA-F];
fragment EscapeSequence: '\\' [btnfr"'\\] | UnicodeEscape | OctalEscape;
fragment OctalEscape: '\\' [0-3] [0-7] [0-7] | '\\' [0-7] [0-7] | '\\' [0-7];
fragment UnicodeEscape: '\\' 'u' HexDigit HexDigit HexDigit HexDigit;

WS: [ \n\t\r]+ -> skip;
SINGLELINE_COMMENT: '//' ~('\r' | '\n')* -> skip;
MULTI_LINE_COMMENT: '/*' .*? '*/' -> skip;
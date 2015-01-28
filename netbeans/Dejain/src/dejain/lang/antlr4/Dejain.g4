grammar Dejain;

program: classTransformer*;
classTransformer:
    annotations accessModifier? KW_CLASS typeQualifier? 
    (OPEN_BRA members=classTransformerMembers CLOSE_BRA)?;
classTransformerMembers: classTransformerMemberDefinition*;
classTransformerMemberDefinition: PLUS? member = classTransformerMember;
classTransformerMember: 
    classTransformerMemberField | classTransformerMemberMethod;
/*  
    classTransformerMemberField | classTransformerMemberFieldAdd |
    classTransformerMemberMethod | classTransformerMemberMethodAdd;
*/
classTransformerMemberField:
    annotations accessModifier? modStatic? typeQualifier? identifier? 
    (ASSIGN_OP value=expression)? SEMI_COLON;
classTransformerMemberFieldAdd:
    PLUS annotations accessModifier? modStatic? typeQualifier identifier 
    (ASSIGN_OP expression)?
    SEMI_COLON;

classTransformerMemberMethod: 
    annotations accessModifier? modStatic? typeQualifier? identifier?
    OPEN_PAR parameters CLOSE_PAR OPEN_BRA statements CLOSE_BRA;
classTransformerMemberMethodAdd: PLUS methodDefinition;
methodDefinition: 
    annotations accessModifier? modStatic? typeQualifier identifier
    OPEN_PAR parameters CLOSE_PAR OPEN_BRA statements CLOSE_BRA;

parameters: (parameter (COMMA parameter)*)?;
parameter: typeQualifier identifier;
expression: variableAssignment;
variableAssignment: identifier ASSIGN_OP variableAssignment | binarySum;
binarySum: first=leafExpression (binarySumOperator rest=leafExpression)*;
leafExpression: invocation | literal | lookup | thisResult | proceedStatement;
binarySumOperator: operator=(PLUS | MINUS);
thisResult: KW_THIS_RESULT;
invocation: typeQualifier OPEN_PAR arguments CLOSE_PAR;
arguments: (expression (COMMA expression)*)?;
lookup: identifier;
statements: statement*;
statement: nonDelimitedStatement | delimitedStatement SEMI_COLON;
nonDelimitedStatement: tryCatchStatement | ifElseStatement;
proceedStatement: ELLIPSES;
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
ifTrueBlock:
    OPEN_BRA statement* CLOSE_BRA | statement;
ifFalseBlock: KW_ELSE (OPEN_BRA statement* CLOSE_BRA | statement);
delimitedStatement: 
    returnStatement | throwStatement | variableDeclaration | expression;
variableDeclaration: typeQualifier id=identifier (ASSIGN_OP value=expression)?;
returnStatement: KW_RETURN expression;
throwStatement: KW_THROW expression;
literal: stringLiteral | integerLiteral | longLiteral | booleanLiteral;
stringLiteral: STRING;
integerLiteral: INTEGER;
longLiteral: LONG;
booleanLiteral: KW_TRUE | KW_FALSE; 

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
AT: '@';
PLUS: '+';
MINUS: '-';
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
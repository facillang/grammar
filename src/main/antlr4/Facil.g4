grammar Facil;

facilCompilation
:   testClassDeclaration* EOF;

testClassDeclaration
:   'test' Identifier classBody;

classBody
:   '{' method* '}'
;

method
:   testMethods | nonTestMethods
;

testMethods
:   Identifier formalParameters
     (methodBody)
;

nonTestMethods
:   (type|'void') Identifier formalParametersNTM('[' ']')*
         ('throws' qualifiedNameList)?
         (   methodBodyNTM   )
;

methodBody
:   block
;

block
:   '{' blockStatement* '}'
;

blockStatement
:   ';'                             //will get bigger here(for test methods)
;

formalParameters
:   '(' formalParameterList? ')'
;

formalParameterList
:   formalParameter (',' formalParameter)*
;

formalParameter
:   type
;

formalParametersNTM
:   '(' formalParameterListNTM? ')'
;

formalParameterListNTM
:   formalParameterNTM (',' formalParameterNTM)* (',' lastFormalParameterNTM)?
|   lastFormalParameterNTM
;

formalParameterNTM
:   variableModifierNTM* type variableDeclaratorId
;

lastFormalParameterNTM
:   variableModifierNTM* type '...' variableDeclaratorId
;

variableDeclaratorId
:   Identifier ('[' ']')*
;

qualifiedNameList
:   qualifiedName (',' qualifiedName)*
;

qualifiedName
:   Identifier ('.' Identifier)*
;

type
:   classOrInterfaceType ('[' ']')*
|   primitiveType ('[' ']')*
;

classOrInterfaceType
:   Identifier typeArguments? ('.' Identifier typeArguments? )*
;

methodBodyNTM
:   blockNTM
;

blockNTM
:   '{' blockStatementNTM* '}'
;

blockStatementNTM
:  localVariableDeclarationStatementNTM
|   statementNTM
;

localVariableDeclarationStatementNTM
:   localVariableDeclarationNTM ';'
;

localVariableDeclarationNTM
:   variableModifierNTM* type variableDeclaratorsNTM
;

variableModifierNTM
:   'final'
|   annotationNTM
;

annotationNTM
:   '@' annotationNameNTM ( '(' ( elementValuePairsNTM | elementValueNTM )? ')' )?
;

annotationNameNTM:
   qualifiedName
;

elementValuePairsNTM
:   elementValuePairNTM (',' elementValuePairNTM)*
;

elementValuePairNTM
:   Identifier '=' elementValueNTM
;

elementValueNTM
:   expressionNTM
|   annotationNTM
|   elementValueArrayInitializerNTM
;

expressionNTM
:   primary
|   expressionNTM '.' Identifier
|   expressionNTM '.' 'this'
|   expressionNTM '.' 'new' nonWildcardTypeArgumentsNTM? innerCreatorNTM
|   expressionNTM '.' 'super' superSuffixNTM
|   expressionNTM '.' explicitGenericInvocationNTM
|   expressionNTM '[' expressionNTM ']'
|   expressionNTM '(' expressionListNTM? ')'
|   'new' creatorNTM
|   '(' type ')' expressionNTM
|   expressionNTM ('++' | '--')
|   ('+'|'-'|'++'|'--') expressionNTM
|   ('~'|'!') expressionNTM
|   expressionNTM ('*'|'/'|'%') expressionNTM
|   expressionNTM ('+'|'-') expressionNTM
|   expressionNTM ('<' '<' | '>' '>' '>' | '>' '>') expressionNTM
|   expressionNTM ('<=' | '>=' | '>' | '<') expressionNTM
|   expressionNTM 'instanceof' type
|   expressionNTM ('==' | '!=') expressionNTM
|   expressionNTM '&' expressionNTM
|   expressionNTM '^' expressionNTM
|   expressionNTM '|' expressionNTM
|   expressionNTM '&&' expressionNTM
|   expressionNTM '||' expressionNTM
|   expressionNTM '?' expressionNTM ':' expressionNTM
|   <assoc=right> expressionNTM
     (   '='
        |   '+='
        |   '-='
        |   '*='
        |   '/='
        |   '&='
        |   '|='
        |   '^='
        |   '>>='
        |   '>>>='
        |   '<<='
        |   '%='
     )
     expressionNTM
;


statementNTM
:   blockNTM
|   ASSERT expressionNTM (':' expressionNTM)? ';'
|   'if' parExpressionNTM statementNTM ('else' statementNTM)?
|   'for' '(' forControlNTM ')' statementNTM
|   'while' parExpressionNTM statementNTM
|   'do' statementNTM 'while' parExpressionNTM ';'
|   'try' blockNTM (catchClauseNTM+ finallyBlockNTM? | finallyBlockNTM)
|   'try' resourceSpecificationNTM blockNTM catchClauseNTM* finallyBlockNTM?
|   'switch' parExpressionNTM '{' switchBlockStatementGroupNTM* switchLabelNTM* '}'
|   'synchronized' parExpressionNTM blockNTM
|   'return' expressionNTM? ';'
|   'throw' expressionNTM ';'
|   'break' Identifier? ';'
|   'continue' Identifier? ';'
|   ';'
|   statementExpressionNTM ';'
|   Identifier ':' statementNTM
;



parExpressionNTM
:   '(' expressionNTM ')'
;

forControlNTM
:   enhancedForControlNTM
|   forInitNTM? ';' expressionNTM? ';' forUpdateNTM?
;

forInitNTM
:   localVariableDeclarationNTM
|   expressionListNTM
;

enhancedForControlNTM
:   variableModifierNTM* type variableDeclaratorId ':' expressionNTM
;

forUpdateNTM
:   expressionListNTM
;

catchClauseNTM
:   'catch' '(' variableModifierNTM* catchTypeNTM Identifier ')' blockNTM
;

catchTypeNTM
:   qualifiedName ('|' qualifiedName)*
;

finallyBlockNTM
: 'finally' blockNTM
;

resourceSpecificationNTM
: '(' resourcesNTM ';'? ')'
;

resourcesNTM
:   resourceNTM (';' resourceNTM)*
;

resourceNTM
:   variableModifierNTM* classOrInterfaceType variableDeclaratorId '=' expressionNTM
;

switchBlockStatementGroupNTM
:   switchLabelNTM+ blockStatementNTM+
;

switchLabelNTM
:   'case' constantExpressionNTM ':'
|   'case' enumConstantNameNTM ':'
|   'default' ':'
;

constantExpressionNTM
:   expressionNTM
;

enumConstantNameNTM
:   Identifier
;

statementExpressionNTM
:   expressionNTM
;


creatorNTM
:   nonWildcardTypeArgumentsNTM createdNameNTM classCreatorRestNTM
|   createdNameNTM (arrayCreatorRestNTM | classCreatorRestNTM)
;

createdNameNTM
:   Identifier typeArgumentsOrDiamondNTM? ('.' Identifier typeArgumentsOrDiamondNTM?)*
|   primitiveType
;

arrayCreatorRestNTM
:   '['
     (   ']' ('[' ']')* arrayInitializerNTM
        |   expressionNTM ']' ('[' expressionNTM ']')* ('[' ']')*
     )
;

classCreatorRestNTM
    :   argumentsNTM classBodyNTM?
    ;

typeArgumentsOrDiamondNTM
:   '<' '>'
    |   typeArguments
;

classBodyNTM
:  '{' classBodyDeclarationNTM* '}'       //TODO need to change names of rules for classBodyNTM
;

classBodyDeclarationNTM
:   ';'
|   'static'? blockNTM
|   modifierNTM* memberDeclarationNTM
;

modifierNTM
:   classOrInterfaceModifierNTM
    |   (   'native'
        |   'synchronized'
        |   'transient'
        |   'volatile'
        )
;

classOrInterfaceModifierNTM
:   annotationNTM
    |   (   'public'
        |   'protected'
        |   'private'
        |   'static'
        |   'abstract'
        |   'final'
        |   'strictfp'
    )
;

memberDeclarationNTM
:   methodDeclarationNTM
|   fieldDeclarationNTM         //Ignored for now
|   constructorDeclarationNTM   //genericMethodDeclaration \enumDeclaration \annotationTypeDeclaration \interfaceDeclaration
|   classDeclarationNTM         // genericConstructorDeclaration
;

methodDeclarationNTM
:  modifierNTM* (type|'void') Identifier formalParametersNTM ('[' ']')*
         ('throws' qualifiedNameList)?
         (   methodBodyNTM   )
;

constructorDeclarationNTM
:   Identifier formalParametersNTM ('throws' qualifiedNameList)?
     constructorBodyNTM
;

constructorBodyNTM
: blockNTM
;

classDeclarationNTM
:   'class' Identifier typeParametersNTM?
        ('extends' type)?
        ('implements' typeList)?
        classBodyNTM
;

typeParametersNTM
:   '<' typeParameterNTM (',' typeParameterNTM)* '>'
;

typeParameterNTM
:   Identifier ('extends' typeBoundNTM)?
;

typeBoundNTM
:   type ('&' type)*
;

fieldDeclarationNTM
:   type variableDeclaratorsNTM ';'
;

variableDeclaratorsNTM
:   variableDeclaratorNTM (',' variableDeclaratorNTM)*
;

variableDeclaratorNTM
:   variableDeclaratorIdNTM ('=' variableInitializerNTM)?
;

variableDeclaratorIdNTM
:  Identifier  ('[' ']')*
;

innerCreatorNTM
:   Identifier nonWildcardTypeArgumentsOrDiamondNTM? classCreatorRestNTM
;

nonWildcardTypeArgumentsOrDiamondNTM
:   '<' '>'
|   nonWildcardTypeArgumentsNTM
;

explicitGenericInvocationNTM
:   nonWildcardTypeArgumentsNTM explicitGenericInvocationSuffixNTM
;


elementValueArrayInitializerNTM
:   '{' (elementValueNTM (',' elementValueNTM)*)? (',')? '}'
;

arrayInitializerNTM
:   '{' (variableInitializerNTM (',' variableInitializerNTM)* (',')? )? '}'
;

variableInitializerNTM
:   arrayInitializerNTM
|   expressionNTM
;

nonWildcardTypeArgumentsNTM
:   '<' typeList '>'
;

typeList
:   type (',' type)*
;


primary
:   '(' expressionNTM ')'
|   'this'
|   'super'
|   literal
|   Identifier
|   type '.' 'class'
|   'void' '.' 'class'
|   nonWildcardTypeArgumentsNTM (explicitGenericInvocationSuffixNTM | 'this' argumentsNTM)
;

explicitGenericInvocationSuffixNTM
:   'super' superSuffixNTM
|   Identifier argumentsNTM
;

superSuffixNTM
:   argumentsNTM
|   '.' Identifier argumentsNTM?
;

argumentsNTM
:   '(' expressionListNTM? ')'
;

expressionListNTM
:   expressionNTM(',' expressionNTM)*
;

primitiveType
:   'boolean'
|   'char'
|   'byte'
|   'short'
|   'int'
|   'long'
|   'float'
|   'double'
;

typeArguments
:   '<' typeArgument (',' typeArgument)* '>'
;

typeArgument
:   type
|   '?' (('extends' | 'super') type)?
;

Identifier
:   JavaLetter JavaLetterOrDigit*
;

literal
:   IntegerLiteral
|   FloatingPointLiteral
|   CharacterLiteral
|   StringLiteral
|   BooleanLiteral
|   'null'
;

IntegerLiteral
:   DecimalIntegerLiteral
|   HexIntegerLiteral
|   OctalIntegerLiteral
|   BinaryIntegerLiteral
;

fragment
DecimalIntegerLiteral
:   DecimalNumeral IntegerTypeSuffix?
;

fragment
HexIntegerLiteral
:   HexNumeral IntegerTypeSuffix?
;

fragment
OctalIntegerLiteral
:   OctalNumeral IntegerTypeSuffix?
;

fragment
BinaryIntegerLiteral
:   BinaryNumeral IntegerTypeSuffix?
;

fragment
IntegerTypeSuffix
:   [lL]
;

fragment
DecimalNumeral
:   '0'
|   NonZeroDigit (Digits? | Underscores Digits)
;

fragment
Digits
:   Digit (DigitOrUnderscore* Digit)?
;

fragment
Digit
:   '0'
|   NonZeroDigit
;

fragment
NonZeroDigit
:   [1-9]
;

fragment
DigitOrUnderscore
:   Digit
|   '_'
;

fragment
Underscores
:   '_'+
;

fragment
HexNumeral
:   '0' [xX] HexDigits
;

fragment
HexDigits
:   HexDigit (HexDigitOrUnderscore* HexDigit)?
;

fragment
HexDigit
:   [0-9a-fA-F]
;

fragment
HexDigitOrUnderscore
:   HexDigit
|   '_'
;

fragment
OctalNumeral
:   '0' Underscores? OctalDigits
;

fragment
OctalDigits
:   OctalDigit (OctalDigitOrUnderscore* OctalDigit)?
;

fragment
OctalDigit
:   [0-7]
;

fragment
OctalDigitOrUnderscore
:   OctalDigit
|   '_'
;

fragment
BinaryNumeral
:   '0' [bB] BinaryDigits
;

fragment
BinaryDigits
:   BinaryDigit (BinaryDigitOrUnderscore* BinaryDigit)?
;

fragment
BinaryDigit
:   [01]
;

fragment
BinaryDigitOrUnderscore
:   BinaryDigit
|   '_'
;

// §3.10.2 Floating-Point Literals

FloatingPointLiteral
:   DecimalFloatingPointLiteral
|   HexadecimalFloatingPointLiteral
;

fragment
DecimalFloatingPointLiteral
:   Digits '.' Digits? ExponentPart? FloatTypeSuffix?
|   '.' Digits ExponentPart? FloatTypeSuffix?
|   Digits ExponentPart FloatTypeSuffix?
|   Digits FloatTypeSuffix
;

fragment
ExponentPart
:   ExponentIndicator SignedInteger
;

fragment
ExponentIndicator
:   [eE]
;

fragment
SignedInteger
:   Sign? Digits
;

fragment
Sign
:   [+-]
;

fragment
FloatTypeSuffix
:   [fFdD]
;

fragment
HexadecimalFloatingPointLiteral
:   HexSignificand BinaryExponent FloatTypeSuffix?
;

fragment
HexSignificand
:   HexNumeral '.'?
|   '0' [xX] HexDigits? '.' HexDigits
;

fragment
BinaryExponent
:   BinaryExponentIndicator SignedInteger
;

fragment
BinaryExponentIndicator
:   [pP]
;

// §3.10.3 Boolean Literals

BooleanLiteral
:   'true'
|   'false'
;

// §3.10.4 Character Literals

CharacterLiteral
:   '\'' SingleCharacter '\''
|   '\'' EscapeSequence '\''
;

fragment
SingleCharacter
:   ~['\\]
;
// §3.10.5 String Literals
StringLiteral
:   '"' StringCharacters? '"'
;
fragment
StringCharacters
:   StringCharacter+
;
fragment
StringCharacter
:   ~["\\]
|   EscapeSequence
;
// §3.10.6 Escape Sequences for Character and String Literals
fragment
EscapeSequence
:   '\\' [btnfr"'\\]
|   OctalEscape
|   UnicodeEscape
;

fragment
OctalEscape
:   '\\' OctalDigit
|   '\\' OctalDigit OctalDigit
|   '\\' ZeroToThree OctalDigit OctalDigit
;

fragment
UnicodeEscape
:   '\\' 'u' HexDigit HexDigit HexDigit HexDigit
;

fragment
ZeroToThree
:   [0-3]
;

// §3.10.7 The Null Literal

NullLiteral
:   'null'
;

// §3.11 Separators

LPAREN          : '(';
RPAREN          : ')';
LBRACE          : '{';
RBRACE          : '}';
LBRACK          : '[';
RBRACK          : ']';
SEMI            : ';';
COMMA           : ',';
DOT             : '.';

// §3.12 Operators

ASSIGN          : '=';
GT              : '>';
LT              : '<';
BANG            : '!';
TILDE           : '~';
QUESTION        : '?';
COLON           : ':';
EQUAL           : '==';
LE              : '<=';
GE              : '>=';
NOTEQUAL        : '!=';
AND             : '&&';
OR              : '||';
INC             : '++';
DEC             : '--';
ADD             : '+';
SUB             : '-';
MUL             : '*';
DIV             : '/';
BITAND          : '&';
BITOR           : '|';
CARET           : '^';
MOD             : '%';

ADD_ASSIGN      : '+=';
SUB_ASSIGN      : '-=';
MUL_ASSIGN      : '*=';
DIV_ASSIGN      : '/=';
AND_ASSIGN      : '&=';
OR_ASSIGN       : '|=';
XOR_ASSIGN      : '^=';
MOD_ASSIGN      : '%=';
LSHIFT_ASSIGN   : '<<=';
RSHIFT_ASSIGN   : '>>=';
URSHIFT_ASSIGN  : '>>>=';


ASSERT        : 'assert';


fragment JavaLetter
:   [a-zA-Z0-9$_] // these are the "java letters or digits" below 0x7F
|   // covers all characters above 0x7F which are not a surrogate
~[\u0000-\u007F\uD800-\uDBFF]
{Character.isJavaIdentifierStart(_input.LA(-1))}?
|   // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
[\uD800-\uDBFF] [\uDC00-\uDFFF]
{Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?
;

fragment JavaLetterOrDigit
:   [a-zA-Z0-9$_] // these are the "java letters or digits" below 0x7F
|   // covers all characters above 0x7F which are not a surrogate
~[\u0000-\u007F\uD800-\uDBFF]
{Character.isJavaIdentifierPart(_input.LA(-1))}?
|   // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
[\uD800-\uDBFF] [\uDC00-\uDFFF]
{Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?
;


WS
:   [ \t\r\n\u000C]+ -> skip
;

COMMENT
:   '/*' .*? '*/' -> skip
;

LINE_COMMENT
:   '//' ~[\r\n]* -> skip
;
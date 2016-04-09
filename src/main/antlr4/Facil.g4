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
:   (type|'void') Identifier formalParametersForNonTestMethod('[' ']')*
         ('throws' qualifiedNameList)?
         (   methodBodyForNonTestMethod   )
;

methodBody
:   block
;

block
:   '{' blockStatement* '}'
;

blockStatement
:   localVariableDeclarationStatement
|   statement
;

localVariableDeclarationStatement
:   localVariableDeclaration ';'
;

localVariableDeclaration
:   type variableDeclarators
;

variableDeclarators
:   variableDeclarator (',' variableDeclarator)*
;

variableDeclarator
:   variableDeclaratorId ('=' variableInitializer)?
;

variableInitializer
:   arrayInitializer
|   expression
;

arrayInitializer
:   '{' (variableInitializer (',' variableInitializer)* (',')? )? '}'
;

expression
:   primary
|   expression '[' expression ']'
|   'new' creator
|   mock
|   expression '.' methodInvocationOnMock
|   expression '.' methodInvocationOnMock 'throws' type
|   expression '.' methodInvocationOnMock '=' customCodeForMethod
|   expression '.' fieldName
|   expression '(' expressionList? ')'
|   expression ('<=' | '>=' | '>' | '<' | '==' | '!=') expression
|   <assoc=right> expression
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
     expression

;

customCodeForMethod
: (Identifier (',' Identifier)*)? methodBodyForNonTestMethod
;


fieldName
:   Identifier                      // to assign a value to mock's field, so that whenever the field is used the assigned
;                                    // values gets used

methodInvocationOnMock
:   nonWildcardTypeArguments? methodInvocationOnMockSuffix
;

nonWildcardTypeArguments
:   '<' typeList '>'
;

methodInvocationOnMockSuffix           //If parse tree goes here that means, a value is being assigned to return when method is
:   Identifier argumentsForTestMethod     // invoked on a mock
//|   Identifier arguments
;

argumentsForTestMethod
:   '(' anyArgumentList? ')'
;

anyArgumentList
:   (any | expression | matchers) (',' (any | expression | matchers) )*
;

any
:   parenthesesForAny
|   'any'
;

parenthesesForAny
: '(' any ')'
;

matchers
:   parenthesesForMatchers
|   'match' parExpression (('.' 'and' parExpression) | ('.' 'or' parExpression))*
;

parenthesesForMatchers
:   '(' matchers ')'
;

parExpression
:   '(' expressionForMatcher ')'
;

expressionForMatcher
:   primaryForMatcher
|   expressionForMatcher '&&' expressionForMatcher
|   expressionForMatcher '||' expressionForMatcher
|   expression
;


primaryForMatcher
:   '(' expressionForMatcher ')'
|   argExpression
|   Identifier
|   literal
;

argExpression                   //TODO find a better way
:   argEvaluator compareWithLeftExpression?
|   compareWithRightExpression? argEvaluator
;

argEvaluator
:   'arg' '.' methodInvocation
|   'arg' '.' fieldName
|   'arg'
;

compareWithLeftExpression
:   ('<=' | '>=' | '>' | '<' | '==' | '!=' ) (expression  | argEvaluator)
;

compareWithRightExpression
:   (expression | argEvaluator) ('<=' | '>=' | '>' | '<' | '==' | '!=' )
;

methodInvocation
:   Identifier arguments
;

creator
:   createdName classCreatorRest
|   createdName (arrayCreatorRest | classCreatorRest)
;

createdName
:   Identifier typeArgumentsOrDiamond? ('.' Identifier typeArgumentsOrDiamond?)*
|   primitiveType
;

arrayCreatorRest
:   '['
     (   ']' ('[' ']')* arrayInitializer
        |   expression ']' ('[' expression ']')* ('[' ']')*
     )
;

typeArgumentsOrDiamond
:   '<' '>'
|   typeArguments
;

classCreatorRest
:   arguments
;


arguments
:   '(' expressionList? ')'
;

expressionList
:   expression(',' expression)*
;

statement
:   statementExpression ';'
;

statementExpression
:   expression
|   ensure
;


ensure
: 'ensure' ( Identifier.methodInvocationOnMockForEnsureWithMappedResults
| (((Identifier.methodInvocationOnMockForEnsure | Identifier.fieldName ) verifications) | Identifier verifyValue))
;

verifications
:   throwsException
|   verifyInvocation
|   verifyValue
;

verifyValue
:   '=' assign
|   '=' matchers
|   verifyType
;

assign
:   (value | ensureBlockForResult)
;

throwsException
:   'throws' type ensureBlockForException?
;

verifyInvocation
:   'invoked' primary       //during compilation make sure that primary in only an integer
;

verifyType
:   'isA' type
;

value
:   literal
|   Identifier
;

ensureBlockForResult
:  Identifier ensureBlock
;

ensureBlockForException
:   Identifier ensureBlock
;

ensureBlock
:   '{' ensureBlockStatements* '}'        //TODO
;

ensureBlockStatements
:   ensure ';'
|   blockStatement
;

methodInvocationOnMockForEnsure
:   nonWildcardTypeArguments? methodInvocationOnMockSuffixForEnsure
;

methodInvocationOnMockSuffixForEnsure
:   Identifier argumentsForEnsure
;

argumentsForEnsure
:   '(' anyArgumentListEnsure? ')'
;


anyArgumentListEnsure
: anyNull | ((any | expression | matchers) (',' (any | expression | matchers))*)
;

methodInvocationOnMockForEnsureWithMappedResults
:   nonWildcardTypeArguments? methodInvocationOnMockSuffixForEnsureWithMappedResults
;

methodInvocationOnMockSuffixForEnsureWithMappedResults
:   Identifier argumentsForEnsureWithMappedResults
;

argumentsForEnsureWithMappedResults
:   '(' mapArgumentToResult ')'
;

mapArgumentToResult
:   parenthesesMapArgumentToResult
|   'map' argumentToResults
;

argumentToResults
:   '(' argumentToResult? ')'
;

argumentToResult
:   argToRes (',' argToRes)*
;

argToRes
:  expression '->' expression
;

parenthesesMapArgumentToResult
:   '(' mapArgumentToResult ')'
;

anyNull
:   parenthesesForAnyNull
|   'anyNull'
;

parenthesesForAnyNull
: '(' anyNull ')'
;

primary
:   '(' expression ')'
|   literal
|   Identifier
                            //TODO |   type '.' 'class'
                            //TODO  |   'void' '.' 'class'
                            //TODO  |   nonWildcardTypeArgumentsForNonTestMethod
                            //TODO (explicitGenericInvocationSuffixForNonTestMethod | 'this' argumentsForNonTestMethod)
;

mock
:   'mock()'
|   'mock(' type ')'
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

formalParametersForNonTestMethod
:   '(' formalParameterListForNonTestMethod? ')'
;

formalParameterListForNonTestMethod
:   formalParameterForNonTestMethod (',' formalParameterForNonTestMethod)* (',' lastFormalParameterForNonTestMethod)?
|   lastFormalParameterForNonTestMethod
;

formalParameterForNonTestMethod
:   variableModifierForNonTestMethod* type variableDeclaratorId
;

lastFormalParameterForNonTestMethod
:   variableModifierForNonTestMethod* type '...' variableDeclaratorId
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

methodBodyForNonTestMethod
:   blockForNonTestMethod
;

blockForNonTestMethod
:   '{' blockStatementForNonTestMethod* '}'
;

blockStatementForNonTestMethod
:  localVariableDeclarationStatementForNonTestMethod
|   statementForNonTestMethod
;

localVariableDeclarationStatementForNonTestMethod
:   localVariableDeclarationForNonTestMethod ';'
;

localVariableDeclarationForNonTestMethod
:   variableModifierForNonTestMethod* type variableDeclaratorsForNonTestMethod
;

variableModifierForNonTestMethod
:   'final'
|   annotationForNonTestMethod
;

annotationForNonTestMethod
:   '@' annotationNameForNonTestMethod ( '(' ( elementValuePairsForNonTestMethod | elementValueForNonTestMethod )? ')' )?
;

annotationNameForNonTestMethod
:   qualifiedName
;

elementValuePairsForNonTestMethod
:   elementValuePairForNonTestMethod (',' elementValuePairForNonTestMethod)*
;

elementValuePairForNonTestMethod
:   Identifier '=' elementValueForNonTestMethod
;

elementValueForNonTestMethod
:   expressionForNonTestMethod
|   annotationForNonTestMethod
|   elementValueArrayInitializerForNonTestMethod
;

expressionForNonTestMethod
:   primaryForNonTestMethod
|   expressionForNonTestMethod '.' Identifier
|   expressionForNonTestMethod '.' 'this'
|   expressionForNonTestMethod '.' 'new' nonWildcardTypeArgumentsForNonTestMethod? innerCreatorForNonTestMethod
|   expressionForNonTestMethod '.' 'super' superSuffixForNonTestMethod
|   expressionForNonTestMethod '.' explicitGenericInvocationForNonTestMethod
|   expressionForNonTestMethod '[' expressionForNonTestMethod ']'
|   expressionForNonTestMethod '(' expressionListForNonTestMethod? ')'
|   'new' creatorForNonTestMethod
|   '(' type ')' expressionForNonTestMethod
|   expressionForNonTestMethod ('++' | '--')
|   ('+'|'-'|'++'|'--') expressionForNonTestMethod
|   ('~'|'!') expressionForNonTestMethod
|   expressionForNonTestMethod ('*'|'/'|'%') expressionForNonTestMethod
|   expressionForNonTestMethod ('+'|'-') expressionForNonTestMethod
|   expressionForNonTestMethod ('<' '<' | '>' '>' '>' | '>' '>') expressionForNonTestMethod
|   expressionForNonTestMethod ('<=' | '>=' | '>' | '<') expressionForNonTestMethod
|   expressionForNonTestMethod 'instanceof' type
|   expressionForNonTestMethod ('==' | '!=') expressionForNonTestMethod
|   expressionForNonTestMethod '&' expressionForNonTestMethod
|   expressionForNonTestMethod '^' expressionForNonTestMethod
|   expressionForNonTestMethod '|' expressionForNonTestMethod
|   expressionForNonTestMethod '&&' expressionForNonTestMethod
|   expressionForNonTestMethod '||' expressionForNonTestMethod
|   expressionForNonTestMethod '?' expressionForNonTestMethod ':' expressionForNonTestMethod
|   <assoc=right> expressionForNonTestMethod
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
     expressionForNonTestMethod
;


statementForNonTestMethod
:   blockForNonTestMethod
|   ASSERT expressionForNonTestMethod (':' expressionForNonTestMethod)? ';'
|   'if' parExpressionForNonTestMethod statementForNonTestMethod ('else' statementForNonTestMethod)?
|   'for' '(' forControlForNonTestMethod ')' statementForNonTestMethod
|   'while' parExpressionForNonTestMethod statementForNonTestMethod
|   'do' statementForNonTestMethod 'while' parExpressionForNonTestMethod ';'
|   'try' blockForNonTestMethod (catchClauseForNonTestMethod+ finallyBlockForNonTestMethod? | finallyBlockForNonTestMethod)
|   'try' resourceSpecificationForNonTestMethod blockForNonTestMethod catchClauseForNonTestMethod* finallyBlockForNonTestMethod?
|   'switch' parExpressionForNonTestMethod '{' switchBlockStatementGroupForNonTestMethod* switchLabelForNonTestMethod* '}'
|   'synchronized' parExpressionForNonTestMethod blockForNonTestMethod
|   'return' expressionForNonTestMethod? ';'
|   'throw' expressionForNonTestMethod ';'
|   'break' Identifier? ';'
|   'continue' Identifier? ';'
|   ';'
|   statementExpressionForNonTestMethod ';'
|   Identifier ':' statementForNonTestMethod
;



parExpressionForNonTestMethod
:   '(' expressionForNonTestMethod ')'
;

forControlForNonTestMethod
:   enhancedForControlForNonTestMethod
|   forInitForNonTestMethod? ';' expressionForNonTestMethod? ';' forUpdateForNonTestMethod?
;

forInitForNonTestMethod
:   localVariableDeclarationForNonTestMethod
|   expressionListForNonTestMethod
;

enhancedForControlForNonTestMethod
:   variableModifierForNonTestMethod* type variableDeclaratorId ':' expressionForNonTestMethod
;

forUpdateForNonTestMethod
:   expressionListForNonTestMethod
;

catchClauseForNonTestMethod
:   'catch' '(' variableModifierForNonTestMethod* catchTypeForNonTestMethod Identifier ')' blockForNonTestMethod
;

catchTypeForNonTestMethod
:   qualifiedName ('|' qualifiedName)*
;

finallyBlockForNonTestMethod
: 'finally' blockForNonTestMethod
;

resourceSpecificationForNonTestMethod
: '(' resourcesForNonTestMethod ';'? ')'
;

resourcesForNonTestMethod
:   resourceForNonTestMethod (';' resourceForNonTestMethod)*
;

resourceForNonTestMethod
:   variableModifierForNonTestMethod* classOrInterfaceType variableDeclaratorId '=' expressionForNonTestMethod
;

switchBlockStatementGroupForNonTestMethod
:   switchLabelForNonTestMethod+ blockStatementForNonTestMethod+
;

switchLabelForNonTestMethod
:   'case' constantExpressionForNonTestMethod ':'
|   'case' enumConstantNameForNonTestMethod ':'
|   'default' ':'
;

constantExpressionForNonTestMethod
:   expressionForNonTestMethod
;

enumConstantNameForNonTestMethod
:   Identifier
;

statementExpressionForNonTestMethod
:   expressionForNonTestMethod
;


creatorForNonTestMethod
:   nonWildcardTypeArgumentsForNonTestMethod createdNameForNonTestMethod classCreatorRestForNonTestMethod
|   createdNameForNonTestMethod (arrayCreatorRestForNonTestMethod | classCreatorRestForNonTestMethod)
;

createdNameForNonTestMethod
:   Identifier typeArgumentsOrDiamondForNonTestMethod? ('.' Identifier typeArgumentsOrDiamondForNonTestMethod?)*
|   primitiveType
;

arrayCreatorRestForNonTestMethod
:   '['
     (   ']' ('[' ']')* arrayInitializerForNonTestMethod
        |   expressionForNonTestMethod ']' ('[' expressionForNonTestMethod ']')* ('[' ']')*
     )
;

classCreatorRestForNonTestMethod
    :   argumentsForNonTestMethod classBodyForNonTestMethod?
    ;

typeArgumentsOrDiamondForNonTestMethod
:   '<' '>'
    |   typeArguments
;

classBodyForNonTestMethod
:  '{' classBodyDeclarationForNonTestMethod* '}'       //TODO need to change names of rules for classBodyForNonTestMethod
;

classBodyDeclarationForNonTestMethod
:   ';'
|   'static'? blockForNonTestMethod
|   modifierForNonTestMethod* memberDeclarationForNonTestMethod
;

modifierForNonTestMethod
:   classOrInterfaceModifierForNonTestMethod
    |   (   'native'
        |   'synchronized'
        |   'transient'
        |   'volatile'
        )
;

classOrInterfaceModifierForNonTestMethod
:   annotationForNonTestMethod
    |   (   'public'
        |   'protected'
        |   'private'
        |   'static'
        |   'abstract'
        |   'final'
        |   'strictfp'
    )
;

memberDeclarationForNonTestMethod
:   methodDeclarationForNonTestMethod
|   fieldDeclarationForNonTestMethod         //Ignored for now
|   constructorDeclarationForNonTestMethod   //genericMethodDeclaration \enumDeclaration \annotationTypeDeclaration \interfaceDeclaration
|   classDeclarationForNonTestMethod         // genericConstructorDeclaration
;

methodDeclarationForNonTestMethod
:  modifierForNonTestMethod* (type|'void') Identifier formalParametersForNonTestMethod ('[' ']')*
         ('throws' qualifiedNameList)?
         (   methodBodyForNonTestMethod   )
;

constructorDeclarationForNonTestMethod
:   Identifier formalParametersForNonTestMethod ('throws' qualifiedNameList)?
     constructorBodyForNonTestMethod
;

constructorBodyForNonTestMethod
: blockForNonTestMethod
;

classDeclarationForNonTestMethod
:   'class' Identifier typeParametersForNonTestMethod?
        ('extends' type)?
        ('implements' typeList)?
        classBodyForNonTestMethod
;

typeParametersForNonTestMethod
:   '<' typeParameterForNonTestMethod (',' typeParameterForNonTestMethod)* '>'
;

typeParameterForNonTestMethod
:   Identifier ('extends' typeBoundForNonTestMethod)?
;

typeBoundForNonTestMethod
:   type ('&' type)*
;

fieldDeclarationForNonTestMethod
:   type variableDeclaratorsForNonTestMethod ';'
;

variableDeclaratorsForNonTestMethod
:   variableDeclaratorForNonTestMethod (',' variableDeclaratorForNonTestMethod)*
;

variableDeclaratorForNonTestMethod
:   variableDeclaratorIdForNonTestMethod ('=' variableInitializerForNonTestMethod)?
;

variableDeclaratorIdForNonTestMethod
:  Identifier  ('[' ']')*
;

innerCreatorForNonTestMethod
:   Identifier nonWildcardTypeArgumentsOrDiamondForNonTestMethod? classCreatorRestForNonTestMethod
;

nonWildcardTypeArgumentsOrDiamondForNonTestMethod
:   '<' '>'
|   nonWildcardTypeArgumentsForNonTestMethod
;

explicitGenericInvocationForNonTestMethod
:   nonWildcardTypeArgumentsForNonTestMethod explicitGenericInvocationSuffixForNonTestMethod
;


elementValueArrayInitializerForNonTestMethod
:   '{' (elementValueForNonTestMethod (',' elementValueForNonTestMethod)*)? (',')? '}'
;

arrayInitializerForNonTestMethod
:   '{' (variableInitializerForNonTestMethod (',' variableInitializerForNonTestMethod)* (',')? )? '}'
;

variableInitializerForNonTestMethod
:   arrayInitializerForNonTestMethod
|   expressionForNonTestMethod
;

nonWildcardTypeArgumentsForNonTestMethod
:   '<' typeList '>'
;

typeList
:   type (',' type)*
;


primaryForNonTestMethod
:   '(' expressionForNonTestMethod ')'
|   'this'
|   'super'
|   literal
|   Identifier
|   type '.' 'class'
|   'void' '.' 'class'
|   nonWildcardTypeArgumentsForNonTestMethod (explicitGenericInvocationSuffixForNonTestMethod | 'this' argumentsForNonTestMethod)
;

explicitGenericInvocationSuffixForNonTestMethod
:   'super' superSuffixForNonTestMethod
|   Identifier argumentsForNonTestMethod
;

superSuffixForNonTestMethod
:   argumentsForNonTestMethod
|   '.' Identifier argumentsForNonTestMethod?
;

argumentsForNonTestMethod
:   '(' expressionListForNonTestMethod? ')'
;

expressionListForNonTestMethod
:   expressionForNonTestMethod(',' expressionForNonTestMethod)*
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
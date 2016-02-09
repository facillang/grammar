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
:   (type|'void') Identifier formalParametersForNonTestMethod ('[' ']')*
         ('throws' qualifiedNameList)?
         (   methodBody   )                     //might need different methodBody
;

methodBody
:   block
;

block
:   '{' blockStatement* '}'
;

blockStatement
:   ';'                             //will get bigger here
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
:   variableModifier* type variableDeclaratorId
;

lastFormalParameterForNonTestMethod
:   variableModifier* type '...' variableDeclaratorId
;

variableModifier                //ignoring annotations for now.
:   'final'
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


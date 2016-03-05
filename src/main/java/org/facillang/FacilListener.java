package org.facillang;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FacilParser}.
 */
public interface FacilListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FacilParser#facilCompilation}.
	 * @param ctx the parse tree
	 */
	void enterFacilCompilation(FacilParser.FacilCompilationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#facilCompilation}.
	 * @param ctx the parse tree
	 */
	void exitFacilCompilation(FacilParser.FacilCompilationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#testClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTestClassDeclaration(FacilParser.TestClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#testClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTestClassDeclaration(FacilParser.TestClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(FacilParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(FacilParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(FacilParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(FacilParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#testMethods}.
	 * @param ctx the parse tree
	 */
	void enterTestMethods(FacilParser.TestMethodsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#testMethods}.
	 * @param ctx the parse tree
	 */
	void exitTestMethods(FacilParser.TestMethodsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#nonTestMethods}.
	 * @param ctx the parse tree
	 */
	void enterNonTestMethods(FacilParser.NonTestMethodsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#nonTestMethods}.
	 * @param ctx the parse tree
	 */
	void exitNonTestMethods(FacilParser.NonTestMethodsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(FacilParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(FacilParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(FacilParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(FacilParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(FacilParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(FacilParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(FacilParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(FacilParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(FacilParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(FacilParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(FacilParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(FacilParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(FacilParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(FacilParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(FacilParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(FacilParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(FacilParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(FacilParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(FacilParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(FacilParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#fieldName}.
	 * @param ctx the parse tree
	 */
	void enterFieldName(FacilParser.FieldNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#fieldName}.
	 * @param ctx the parse tree
	 */
	void exitFieldName(FacilParser.FieldNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#methodInvocationOnMock}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocationOnMock(FacilParser.MethodInvocationOnMockContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#methodInvocationOnMock}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocationOnMock(FacilParser.MethodInvocationOnMockContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArguments(FacilParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArguments(FacilParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#methodInvocationOnMockSuffix}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocationOnMockSuffix(FacilParser.MethodInvocationOnMockSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#methodInvocationOnMockSuffix}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocationOnMockSuffix(FacilParser.MethodInvocationOnMockSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#argumentsForTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterArgumentsForTestMethod(FacilParser.ArgumentsForTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#argumentsForTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitArgumentsForTestMethod(FacilParser.ArgumentsForTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#anyArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterAnyArgumentList(FacilParser.AnyArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#anyArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitAnyArgumentList(FacilParser.AnyArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#any}.
	 * @param ctx the parse tree
	 */
	void enterAny(FacilParser.AnyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#any}.
	 * @param ctx the parse tree
	 */
	void exitAny(FacilParser.AnyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#parenthesesForAny}.
	 * @param ctx the parse tree
	 */
	void enterParenthesesForAny(FacilParser.ParenthesesForAnyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#parenthesesForAny}.
	 * @param ctx the parse tree
	 */
	void exitParenthesesForAny(FacilParser.ParenthesesForAnyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#matchers}.
	 * @param ctx the parse tree
	 */
	void enterMatchers(FacilParser.MatchersContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#matchers}.
	 * @param ctx the parse tree
	 */
	void exitMatchers(FacilParser.MatchersContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#parenthesesForMatchers}.
	 * @param ctx the parse tree
	 */
	void enterParenthesesForMatchers(FacilParser.ParenthesesForMatchersContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#parenthesesForMatchers}.
	 * @param ctx the parse tree
	 */
	void exitParenthesesForMatchers(FacilParser.ParenthesesForMatchersContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(FacilParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(FacilParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#expressionForMatcher}.
	 * @param ctx the parse tree
	 */
	void enterExpressionForMatcher(FacilParser.ExpressionForMatcherContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#expressionForMatcher}.
	 * @param ctx the parse tree
	 */
	void exitExpressionForMatcher(FacilParser.ExpressionForMatcherContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#primaryForMatcher}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryForMatcher(FacilParser.PrimaryForMatcherContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#primaryForMatcher}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryForMatcher(FacilParser.PrimaryForMatcherContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#argExpression}.
	 * @param ctx the parse tree
	 */
	void enterArgExpression(FacilParser.ArgExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#argExpression}.
	 * @param ctx the parse tree
	 */
	void exitArgExpression(FacilParser.ArgExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#argEvaluator}.
	 * @param ctx the parse tree
	 */
	void enterArgEvaluator(FacilParser.ArgEvaluatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#argEvaluator}.
	 * @param ctx the parse tree
	 */
	void exitArgEvaluator(FacilParser.ArgEvaluatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#compareWithLeftExpression}.
	 * @param ctx the parse tree
	 */
	void enterCompareWithLeftExpression(FacilParser.CompareWithLeftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#compareWithLeftExpression}.
	 * @param ctx the parse tree
	 */
	void exitCompareWithLeftExpression(FacilParser.CompareWithLeftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#compareWithRightExpression}.
	 * @param ctx the parse tree
	 */
	void enterCompareWithRightExpression(FacilParser.CompareWithRightExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#compareWithRightExpression}.
	 * @param ctx the parse tree
	 */
	void exitCompareWithRightExpression(FacilParser.CompareWithRightExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation(FacilParser.MethodInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation(FacilParser.MethodInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(FacilParser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(FacilParser.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#createdName}.
	 * @param ctx the parse tree
	 */
	void enterCreatedName(FacilParser.CreatedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#createdName}.
	 * @param ctx the parse tree
	 */
	void exitCreatedName(FacilParser.CreatedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreatorRest(FacilParser.ArrayCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreatorRest(FacilParser.ArrayCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(FacilParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(FacilParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterClassCreatorRest(FacilParser.ClassCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitClassCreatorRest(FacilParser.ClassCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(FacilParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(FacilParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(FacilParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(FacilParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(FacilParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(FacilParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(FacilParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(FacilParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#primaryForArg}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryForArg(FacilParser.PrimaryForArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#primaryForArg}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryForArg(FacilParser.PrimaryForArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(FacilParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(FacilParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#mock}.
	 * @param ctx the parse tree
	 */
	void enterMock(FacilParser.MockContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#mock}.
	 * @param ctx the parse tree
	 */
	void exitMock(FacilParser.MockContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(FacilParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(FacilParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(FacilParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(FacilParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(FacilParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(FacilParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#formalParametersForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterFormalParametersForNonTestMethod(FacilParser.FormalParametersForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#formalParametersForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitFormalParametersForNonTestMethod(FacilParser.FormalParametersForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#formalParameterListForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterListForNonTestMethod(FacilParser.FormalParameterListForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#formalParameterListForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterListForNonTestMethod(FacilParser.FormalParameterListForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#formalParameterForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterForNonTestMethod(FacilParser.FormalParameterForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#formalParameterForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterForNonTestMethod(FacilParser.FormalParameterForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#lastFormalParameterForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameterForNonTestMethod(FacilParser.LastFormalParameterForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#lastFormalParameterForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameterForNonTestMethod(FacilParser.LastFormalParameterForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(FacilParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(FacilParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(FacilParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(FacilParser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(FacilParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(FacilParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(FacilParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(FacilParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(FacilParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(FacilParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#methodBodyForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterMethodBodyForNonTestMethod(FacilParser.MethodBodyForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#methodBodyForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitMethodBodyForNonTestMethod(FacilParser.MethodBodyForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#blockForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterBlockForNonTestMethod(FacilParser.BlockForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#blockForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitBlockForNonTestMethod(FacilParser.BlockForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#blockStatementForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatementForNonTestMethod(FacilParser.BlockStatementForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#blockStatementForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatementForNonTestMethod(FacilParser.BlockStatementForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#localVariableDeclarationStatementForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatementForNonTestMethod(FacilParser.LocalVariableDeclarationStatementForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#localVariableDeclarationStatementForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatementForNonTestMethod(FacilParser.LocalVariableDeclarationStatementForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#localVariableDeclarationForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationForNonTestMethod(FacilParser.LocalVariableDeclarationForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#localVariableDeclarationForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationForNonTestMethod(FacilParser.LocalVariableDeclarationForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#variableModifierForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifierForNonTestMethod(FacilParser.VariableModifierForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#variableModifierForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifierForNonTestMethod(FacilParser.VariableModifierForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#annotationForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationForNonTestMethod(FacilParser.AnnotationForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#annotationForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationForNonTestMethod(FacilParser.AnnotationForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#annotationNameForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationNameForNonTestMethod(FacilParser.AnnotationNameForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#annotationNameForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationNameForNonTestMethod(FacilParser.AnnotationNameForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#elementValuePairsForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairsForNonTestMethod(FacilParser.ElementValuePairsForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#elementValuePairsForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairsForNonTestMethod(FacilParser.ElementValuePairsForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#elementValuePairForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairForNonTestMethod(FacilParser.ElementValuePairForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#elementValuePairForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairForNonTestMethod(FacilParser.ElementValuePairForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#elementValueForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterElementValueForNonTestMethod(FacilParser.ElementValueForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#elementValueForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitElementValueForNonTestMethod(FacilParser.ElementValueForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#expressionForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterExpressionForNonTestMethod(FacilParser.ExpressionForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#expressionForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitExpressionForNonTestMethod(FacilParser.ExpressionForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#statementForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterStatementForNonTestMethod(FacilParser.StatementForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#statementForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitStatementForNonTestMethod(FacilParser.StatementForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#parExpressionForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterParExpressionForNonTestMethod(FacilParser.ParExpressionForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#parExpressionForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitParExpressionForNonTestMethod(FacilParser.ParExpressionForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#forControlForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterForControlForNonTestMethod(FacilParser.ForControlForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#forControlForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitForControlForNonTestMethod(FacilParser.ForControlForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#forInitForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterForInitForNonTestMethod(FacilParser.ForInitForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#forInitForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitForInitForNonTestMethod(FacilParser.ForInitForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#enhancedForControlForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForControlForNonTestMethod(FacilParser.EnhancedForControlForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#enhancedForControlForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForControlForNonTestMethod(FacilParser.EnhancedForControlForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#forUpdateForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterForUpdateForNonTestMethod(FacilParser.ForUpdateForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#forUpdateForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitForUpdateForNonTestMethod(FacilParser.ForUpdateForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#catchClauseForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterCatchClauseForNonTestMethod(FacilParser.CatchClauseForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#catchClauseForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitCatchClauseForNonTestMethod(FacilParser.CatchClauseForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#catchTypeForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterCatchTypeForNonTestMethod(FacilParser.CatchTypeForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#catchTypeForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitCatchTypeForNonTestMethod(FacilParser.CatchTypeForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#finallyBlockForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlockForNonTestMethod(FacilParser.FinallyBlockForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#finallyBlockForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlockForNonTestMethod(FacilParser.FinallyBlockForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#resourceSpecificationForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecificationForNonTestMethod(FacilParser.ResourceSpecificationForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#resourceSpecificationForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecificationForNonTestMethod(FacilParser.ResourceSpecificationForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#resourcesForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterResourcesForNonTestMethod(FacilParser.ResourcesForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#resourcesForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitResourcesForNonTestMethod(FacilParser.ResourcesForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#resourceForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterResourceForNonTestMethod(FacilParser.ResourceForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#resourceForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitResourceForNonTestMethod(FacilParser.ResourceForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#switchBlockStatementGroupForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroupForNonTestMethod(FacilParser.SwitchBlockStatementGroupForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#switchBlockStatementGroupForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroupForNonTestMethod(FacilParser.SwitchBlockStatementGroupForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#switchLabelForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabelForNonTestMethod(FacilParser.SwitchLabelForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#switchLabelForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabelForNonTestMethod(FacilParser.SwitchLabelForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#constantExpressionForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpressionForNonTestMethod(FacilParser.ConstantExpressionForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#constantExpressionForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpressionForNonTestMethod(FacilParser.ConstantExpressionForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#enumConstantNameForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantNameForNonTestMethod(FacilParser.EnumConstantNameForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#enumConstantNameForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantNameForNonTestMethod(FacilParser.EnumConstantNameForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#statementExpressionForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpressionForNonTestMethod(FacilParser.StatementExpressionForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#statementExpressionForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpressionForNonTestMethod(FacilParser.StatementExpressionForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#creatorForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterCreatorForNonTestMethod(FacilParser.CreatorForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#creatorForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitCreatorForNonTestMethod(FacilParser.CreatorForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#createdNameForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterCreatedNameForNonTestMethod(FacilParser.CreatedNameForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#createdNameForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitCreatedNameForNonTestMethod(FacilParser.CreatedNameForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#arrayCreatorRestForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreatorRestForNonTestMethod(FacilParser.ArrayCreatorRestForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#arrayCreatorRestForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreatorRestForNonTestMethod(FacilParser.ArrayCreatorRestForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#classCreatorRestForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterClassCreatorRestForNonTestMethod(FacilParser.ClassCreatorRestForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#classCreatorRestForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitClassCreatorRestForNonTestMethod(FacilParser.ClassCreatorRestForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#typeArgumentsOrDiamondForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamondForNonTestMethod(FacilParser.TypeArgumentsOrDiamondForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#typeArgumentsOrDiamondForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamondForNonTestMethod(FacilParser.TypeArgumentsOrDiamondForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#classBodyForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyForNonTestMethod(FacilParser.ClassBodyForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#classBodyForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyForNonTestMethod(FacilParser.ClassBodyForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#classBodyDeclarationForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclarationForNonTestMethod(FacilParser.ClassBodyDeclarationForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#classBodyDeclarationForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclarationForNonTestMethod(FacilParser.ClassBodyDeclarationForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#modifierForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterModifierForNonTestMethod(FacilParser.ModifierForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#modifierForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitModifierForNonTestMethod(FacilParser.ModifierForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#classOrInterfaceModifierForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceModifierForNonTestMethod(FacilParser.ClassOrInterfaceModifierForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#classOrInterfaceModifierForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceModifierForNonTestMethod(FacilParser.ClassOrInterfaceModifierForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#memberDeclarationForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclarationForNonTestMethod(FacilParser.MemberDeclarationForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#memberDeclarationForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclarationForNonTestMethod(FacilParser.MemberDeclarationForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#methodDeclarationForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclarationForNonTestMethod(FacilParser.MethodDeclarationForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#methodDeclarationForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclarationForNonTestMethod(FacilParser.MethodDeclarationForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#constructorDeclarationForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclarationForNonTestMethod(FacilParser.ConstructorDeclarationForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#constructorDeclarationForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclarationForNonTestMethod(FacilParser.ConstructorDeclarationForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#constructorBodyForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBodyForNonTestMethod(FacilParser.ConstructorBodyForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#constructorBodyForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBodyForNonTestMethod(FacilParser.ConstructorBodyForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#classDeclarationForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclarationForNonTestMethod(FacilParser.ClassDeclarationForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#classDeclarationForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclarationForNonTestMethod(FacilParser.ClassDeclarationForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#typeParametersForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterTypeParametersForNonTestMethod(FacilParser.TypeParametersForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#typeParametersForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitTypeParametersForNonTestMethod(FacilParser.TypeParametersForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#typeParameterForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterForNonTestMethod(FacilParser.TypeParameterForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#typeParameterForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterForNonTestMethod(FacilParser.TypeParameterForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#typeBoundForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterTypeBoundForNonTestMethod(FacilParser.TypeBoundForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#typeBoundForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitTypeBoundForNonTestMethod(FacilParser.TypeBoundForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#fieldDeclarationForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclarationForNonTestMethod(FacilParser.FieldDeclarationForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#fieldDeclarationForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclarationForNonTestMethod(FacilParser.FieldDeclarationForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#variableDeclaratorsForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorsForNonTestMethod(FacilParser.VariableDeclaratorsForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#variableDeclaratorsForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorsForNonTestMethod(FacilParser.VariableDeclaratorsForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#variableDeclaratorForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorForNonTestMethod(FacilParser.VariableDeclaratorForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#variableDeclaratorForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorForNonTestMethod(FacilParser.VariableDeclaratorForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#variableDeclaratorIdForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorIdForNonTestMethod(FacilParser.VariableDeclaratorIdForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#variableDeclaratorIdForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorIdForNonTestMethod(FacilParser.VariableDeclaratorIdForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#innerCreatorForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterInnerCreatorForNonTestMethod(FacilParser.InnerCreatorForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#innerCreatorForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitInnerCreatorForNonTestMethod(FacilParser.InnerCreatorForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#nonWildcardTypeArgumentsOrDiamondForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArgumentsOrDiamondForNonTestMethod(FacilParser.NonWildcardTypeArgumentsOrDiamondForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#nonWildcardTypeArgumentsOrDiamondForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArgumentsOrDiamondForNonTestMethod(FacilParser.NonWildcardTypeArgumentsOrDiamondForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#explicitGenericInvocationForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocationForNonTestMethod(FacilParser.ExplicitGenericInvocationForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#explicitGenericInvocationForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocationForNonTestMethod(FacilParser.ExplicitGenericInvocationForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#elementValueArrayInitializerForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializerForNonTestMethod(FacilParser.ElementValueArrayInitializerForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#elementValueArrayInitializerForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializerForNonTestMethod(FacilParser.ElementValueArrayInitializerForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#arrayInitializerForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializerForNonTestMethod(FacilParser.ArrayInitializerForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#arrayInitializerForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializerForNonTestMethod(FacilParser.ArrayInitializerForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#variableInitializerForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializerForNonTestMethod(FacilParser.VariableInitializerForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#variableInitializerForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializerForNonTestMethod(FacilParser.VariableInitializerForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#nonWildcardTypeArgumentsForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArgumentsForNonTestMethod(FacilParser.NonWildcardTypeArgumentsForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#nonWildcardTypeArgumentsForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArgumentsForNonTestMethod(FacilParser.NonWildcardTypeArgumentsForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(FacilParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(FacilParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#primaryForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryForNonTestMethod(FacilParser.PrimaryForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#primaryForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryForNonTestMethod(FacilParser.PrimaryForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#explicitGenericInvocationSuffixForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocationSuffixForNonTestMethod(FacilParser.ExplicitGenericInvocationSuffixForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#explicitGenericInvocationSuffixForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocationSuffixForNonTestMethod(FacilParser.ExplicitGenericInvocationSuffixForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#superSuffixForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterSuperSuffixForNonTestMethod(FacilParser.SuperSuffixForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#superSuffixForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitSuperSuffixForNonTestMethod(FacilParser.SuperSuffixForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#argumentsForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterArgumentsForNonTestMethod(FacilParser.ArgumentsForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#argumentsForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitArgumentsForNonTestMethod(FacilParser.ArgumentsForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#expressionListForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void enterExpressionListForNonTestMethod(FacilParser.ExpressionListForNonTestMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#expressionListForNonTestMethod}.
	 * @param ctx the parse tree
	 */
	void exitExpressionListForNonTestMethod(FacilParser.ExpressionListForNonTestMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(FacilParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(FacilParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(FacilParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(FacilParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(FacilParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(FacilParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(FacilParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(FacilParser.LiteralContext ctx);
}
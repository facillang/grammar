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
	 * Enter a parse tree produced by {@link FacilParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(FacilParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(FacilParser.VariableModifierContext ctx);
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
}
// Generated from /Users/sumanthdommaraju/Desktop/facil/facilGrammar/NEW/Facil/src/main/antlr4/Facil.g4 by ANTLR 4.5.1
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
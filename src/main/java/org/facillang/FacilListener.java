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
	 * Enter a parse tree produced by {@link FacilParser#formalParametersNTM}.
	 * @param ctx the parse tree
	 */
	void enterFormalParametersNTM(FacilParser.FormalParametersNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#formalParametersNTM}.
	 * @param ctx the parse tree
	 */
	void exitFormalParametersNTM(FacilParser.FormalParametersNTMContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#formalParameterListNTM}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterListNTM(FacilParser.FormalParameterListNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#formalParameterListNTM}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterListNTM(FacilParser.FormalParameterListNTMContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#formalParameterNTM}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterNTM(FacilParser.FormalParameterNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#formalParameterNTM}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterNTM(FacilParser.FormalParameterNTMContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#lastFormalParameterNTM}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameterNTM(FacilParser.LastFormalParameterNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#lastFormalParameterNTM}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameterNTM(FacilParser.LastFormalParameterNTMContext ctx);
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
	 * Enter a parse tree produced by {@link FacilParser#methodBodyNTM}.
	 * @param ctx the parse tree
	 */
	void enterMethodBodyNTM(FacilParser.MethodBodyNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#methodBodyNTM}.
	 * @param ctx the parse tree
	 */
	void exitMethodBodyNTM(FacilParser.MethodBodyNTMContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#blockNTM}.
	 * @param ctx the parse tree
	 */
	void enterBlockNTM(FacilParser.BlockNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#blockNTM}.
	 * @param ctx the parse tree
	 */
	void exitBlockNTM(FacilParser.BlockNTMContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#blockStatementNTM}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatementNTM(FacilParser.BlockStatementNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#blockStatementNTM}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatementNTM(FacilParser.BlockStatementNTMContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#localVariableDeclarationStatementNTM}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatementNTM(FacilParser.LocalVariableDeclarationStatementNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#localVariableDeclarationStatementNTM}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatementNTM(FacilParser.LocalVariableDeclarationStatementNTMContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#localVariableDeclarationNTM}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationNTM(FacilParser.LocalVariableDeclarationNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#localVariableDeclarationNTM}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationNTM(FacilParser.LocalVariableDeclarationNTMContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#variableModifierNTM}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifierNTM(FacilParser.VariableModifierNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#variableModifierNTM}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifierNTM(FacilParser.VariableModifierNTMContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#annotationNTM}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationNTM(FacilParser.AnnotationNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#annotationNTM}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationNTM(FacilParser.AnnotationNTMContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#annotationNameNTM}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationNameNTM(FacilParser.AnnotationNameNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#annotationNameNTM}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationNameNTM(FacilParser.AnnotationNameNTMContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#elementValuePairsNTM}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairsNTM(FacilParser.ElementValuePairsNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#elementValuePairsNTM}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairsNTM(FacilParser.ElementValuePairsNTMContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#elementValuePairNTM}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairNTM(FacilParser.ElementValuePairNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#elementValuePairNTM}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairNTM(FacilParser.ElementValuePairNTMContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#elementValueNTM}.
	 * @param ctx the parse tree
	 */
	void enterElementValueNTM(FacilParser.ElementValueNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#elementValueNTM}.
	 * @param ctx the parse tree
	 */
	void exitElementValueNTM(FacilParser.ElementValueNTMContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#expressionNTM}.
	 * @param ctx the parse tree
	 */
	void enterExpressionNTM(FacilParser.ExpressionNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#expressionNTM}.
	 * @param ctx the parse tree
	 */
	void exitExpressionNTM(FacilParser.ExpressionNTMContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#statementNTM}.
	 * @param ctx the parse tree
	 */
	void enterStatementNTM(FacilParser.StatementNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#statementNTM}.
	 * @param ctx the parse tree
	 */
	void exitStatementNTM(FacilParser.StatementNTMContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#parExpressionNTM}.
	 * @param ctx the parse tree
	 */
	void enterParExpressionNTM(FacilParser.ParExpressionNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#parExpressionNTM}.
	 * @param ctx the parse tree
	 */
	void exitParExpressionNTM(FacilParser.ParExpressionNTMContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#forControlNTM}.
	 * @param ctx the parse tree
	 */
	void enterForControlNTM(FacilParser.ForControlNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#forControlNTM}.
	 * @param ctx the parse tree
	 */
	void exitForControlNTM(FacilParser.ForControlNTMContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#forInitNTM}.
	 * @param ctx the parse tree
	 */
	void enterForInitNTM(FacilParser.ForInitNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#forInitNTM}.
	 * @param ctx the parse tree
	 */
	void exitForInitNTM(FacilParser.ForInitNTMContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#enhancedForControlNTM}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForControlNTM(FacilParser.EnhancedForControlNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#enhancedForControlNTM}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForControlNTM(FacilParser.EnhancedForControlNTMContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#forUpdateNTM}.
	 * @param ctx the parse tree
	 */
	void enterForUpdateNTM(FacilParser.ForUpdateNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#forUpdateNTM}.
	 * @param ctx the parse tree
	 */
	void exitForUpdateNTM(FacilParser.ForUpdateNTMContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#catchClauseNTM}.
	 * @param ctx the parse tree
	 */
	void enterCatchClauseNTM(FacilParser.CatchClauseNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#catchClauseNTM}.
	 * @param ctx the parse tree
	 */
	void exitCatchClauseNTM(FacilParser.CatchClauseNTMContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#catchTypeNTM}.
	 * @param ctx the parse tree
	 */
	void enterCatchTypeNTM(FacilParser.CatchTypeNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#catchTypeNTM}.
	 * @param ctx the parse tree
	 */
	void exitCatchTypeNTM(FacilParser.CatchTypeNTMContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#finallyBlockNTM}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlockNTM(FacilParser.FinallyBlockNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#finallyBlockNTM}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlockNTM(FacilParser.FinallyBlockNTMContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#resourceSpecificationNTM}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecificationNTM(FacilParser.ResourceSpecificationNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#resourceSpecificationNTM}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecificationNTM(FacilParser.ResourceSpecificationNTMContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#resourcesNTM}.
	 * @param ctx the parse tree
	 */
	void enterResourcesNTM(FacilParser.ResourcesNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#resourcesNTM}.
	 * @param ctx the parse tree
	 */
	void exitResourcesNTM(FacilParser.ResourcesNTMContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#resourceNTM}.
	 * @param ctx the parse tree
	 */
	void enterResourceNTM(FacilParser.ResourceNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#resourceNTM}.
	 * @param ctx the parse tree
	 */
	void exitResourceNTM(FacilParser.ResourceNTMContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#switchBlockStatementGroupNTM}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroupNTM(FacilParser.SwitchBlockStatementGroupNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#switchBlockStatementGroupNTM}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroupNTM(FacilParser.SwitchBlockStatementGroupNTMContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#switchLabelNTM}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabelNTM(FacilParser.SwitchLabelNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#switchLabelNTM}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabelNTM(FacilParser.SwitchLabelNTMContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#constantExpressionNTM}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpressionNTM(FacilParser.ConstantExpressionNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#constantExpressionNTM}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpressionNTM(FacilParser.ConstantExpressionNTMContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#enumConstantNameNTM}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantNameNTM(FacilParser.EnumConstantNameNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#enumConstantNameNTM}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantNameNTM(FacilParser.EnumConstantNameNTMContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#statementExpressionNTM}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpressionNTM(FacilParser.StatementExpressionNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#statementExpressionNTM}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpressionNTM(FacilParser.StatementExpressionNTMContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#creatorNTM}.
	 * @param ctx the parse tree
	 */
	void enterCreatorNTM(FacilParser.CreatorNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#creatorNTM}.
	 * @param ctx the parse tree
	 */
	void exitCreatorNTM(FacilParser.CreatorNTMContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#createdNameNTM}.
	 * @param ctx the parse tree
	 */
	void enterCreatedNameNTM(FacilParser.CreatedNameNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#createdNameNTM}.
	 * @param ctx the parse tree
	 */
	void exitCreatedNameNTM(FacilParser.CreatedNameNTMContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#arrayCreatorRestNTM}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreatorRestNTM(FacilParser.ArrayCreatorRestNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#arrayCreatorRestNTM}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreatorRestNTM(FacilParser.ArrayCreatorRestNTMContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#classCreatorRestNTM}.
	 * @param ctx the parse tree
	 */
	void enterClassCreatorRestNTM(FacilParser.ClassCreatorRestNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#classCreatorRestNTM}.
	 * @param ctx the parse tree
	 */
	void exitClassCreatorRestNTM(FacilParser.ClassCreatorRestNTMContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#typeArgumentsOrDiamondNTM}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamondNTM(FacilParser.TypeArgumentsOrDiamondNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#typeArgumentsOrDiamondNTM}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamondNTM(FacilParser.TypeArgumentsOrDiamondNTMContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#classBodyNTM}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyNTM(FacilParser.ClassBodyNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#classBodyNTM}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyNTM(FacilParser.ClassBodyNTMContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#classBodyDeclarationNTM}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclarationNTM(FacilParser.ClassBodyDeclarationNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#classBodyDeclarationNTM}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclarationNTM(FacilParser.ClassBodyDeclarationNTMContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#modifierNTM}.
	 * @param ctx the parse tree
	 */
	void enterModifierNTM(FacilParser.ModifierNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#modifierNTM}.
	 * @param ctx the parse tree
	 */
	void exitModifierNTM(FacilParser.ModifierNTMContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#classOrInterfaceModifierNTM}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceModifierNTM(FacilParser.ClassOrInterfaceModifierNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#classOrInterfaceModifierNTM}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceModifierNTM(FacilParser.ClassOrInterfaceModifierNTMContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#memberDeclarationNTM}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclarationNTM(FacilParser.MemberDeclarationNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#memberDeclarationNTM}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclarationNTM(FacilParser.MemberDeclarationNTMContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#methodDeclarationNTM}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclarationNTM(FacilParser.MethodDeclarationNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#methodDeclarationNTM}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclarationNTM(FacilParser.MethodDeclarationNTMContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#constructorDeclarationNTM}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclarationNTM(FacilParser.ConstructorDeclarationNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#constructorDeclarationNTM}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclarationNTM(FacilParser.ConstructorDeclarationNTMContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#constructorBodyNTM}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBodyNTM(FacilParser.ConstructorBodyNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#constructorBodyNTM}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBodyNTM(FacilParser.ConstructorBodyNTMContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#classDeclarationNTM}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclarationNTM(FacilParser.ClassDeclarationNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#classDeclarationNTM}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclarationNTM(FacilParser.ClassDeclarationNTMContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#typeParametersNTM}.
	 * @param ctx the parse tree
	 */
	void enterTypeParametersNTM(FacilParser.TypeParametersNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#typeParametersNTM}.
	 * @param ctx the parse tree
	 */
	void exitTypeParametersNTM(FacilParser.TypeParametersNTMContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#typeParameterNTM}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterNTM(FacilParser.TypeParameterNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#typeParameterNTM}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterNTM(FacilParser.TypeParameterNTMContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#typeBoundNTM}.
	 * @param ctx the parse tree
	 */
	void enterTypeBoundNTM(FacilParser.TypeBoundNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#typeBoundNTM}.
	 * @param ctx the parse tree
	 */
	void exitTypeBoundNTM(FacilParser.TypeBoundNTMContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#fieldDeclarationNTM}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclarationNTM(FacilParser.FieldDeclarationNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#fieldDeclarationNTM}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclarationNTM(FacilParser.FieldDeclarationNTMContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#variableDeclaratorsNTM}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorsNTM(FacilParser.VariableDeclaratorsNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#variableDeclaratorsNTM}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorsNTM(FacilParser.VariableDeclaratorsNTMContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#variableDeclaratorNTM}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorNTM(FacilParser.VariableDeclaratorNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#variableDeclaratorNTM}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorNTM(FacilParser.VariableDeclaratorNTMContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#variableDeclaratorIdNTM}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorIdNTM(FacilParser.VariableDeclaratorIdNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#variableDeclaratorIdNTM}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorIdNTM(FacilParser.VariableDeclaratorIdNTMContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#innerCreatorNTM}.
	 * @param ctx the parse tree
	 */
	void enterInnerCreatorNTM(FacilParser.InnerCreatorNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#innerCreatorNTM}.
	 * @param ctx the parse tree
	 */
	void exitInnerCreatorNTM(FacilParser.InnerCreatorNTMContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#nonWildcardTypeArgumentsOrDiamondNTM}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArgumentsOrDiamondNTM(FacilParser.NonWildcardTypeArgumentsOrDiamondNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#nonWildcardTypeArgumentsOrDiamondNTM}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArgumentsOrDiamondNTM(FacilParser.NonWildcardTypeArgumentsOrDiamondNTMContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#explicitGenericInvocationNTM}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocationNTM(FacilParser.ExplicitGenericInvocationNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#explicitGenericInvocationNTM}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocationNTM(FacilParser.ExplicitGenericInvocationNTMContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#elementValueArrayInitializerNTM}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializerNTM(FacilParser.ElementValueArrayInitializerNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#elementValueArrayInitializerNTM}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializerNTM(FacilParser.ElementValueArrayInitializerNTMContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#arrayInitializerNTM}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializerNTM(FacilParser.ArrayInitializerNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#arrayInitializerNTM}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializerNTM(FacilParser.ArrayInitializerNTMContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#variableInitializerNTM}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializerNTM(FacilParser.VariableInitializerNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#variableInitializerNTM}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializerNTM(FacilParser.VariableInitializerNTMContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#nonWildcardTypeArgumentsNTM}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArgumentsNTM(FacilParser.NonWildcardTypeArgumentsNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#nonWildcardTypeArgumentsNTM}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArgumentsNTM(FacilParser.NonWildcardTypeArgumentsNTMContext ctx);
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
	 * Enter a parse tree produced by {@link FacilParser#explicitGenericInvocationSuffixNTM}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocationSuffixNTM(FacilParser.ExplicitGenericInvocationSuffixNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#explicitGenericInvocationSuffixNTM}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocationSuffixNTM(FacilParser.ExplicitGenericInvocationSuffixNTMContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#superSuffixNTM}.
	 * @param ctx the parse tree
	 */
	void enterSuperSuffixNTM(FacilParser.SuperSuffixNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#superSuffixNTM}.
	 * @param ctx the parse tree
	 */
	void exitSuperSuffixNTM(FacilParser.SuperSuffixNTMContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#argumentsNTM}.
	 * @param ctx the parse tree
	 */
	void enterArgumentsNTM(FacilParser.ArgumentsNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#argumentsNTM}.
	 * @param ctx the parse tree
	 */
	void exitArgumentsNTM(FacilParser.ArgumentsNTMContext ctx);
	/**
	 * Enter a parse tree produced by {@link FacilParser#expressionListNTM}.
	 * @param ctx the parse tree
	 */
	void enterExpressionListNTM(FacilParser.ExpressionListNTMContext ctx);
	/**
	 * Exit a parse tree produced by {@link FacilParser#expressionListNTM}.
	 * @param ctx the parse tree
	 */
	void exitExpressionListNTM(FacilParser.ExpressionListNTMContext ctx);
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
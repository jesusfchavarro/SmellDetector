package parser;
// Generated from /home/jesus/Documents/Lenguajes de programacion/SmellDetector/grammar/java8.g4 by ANTLR 4.7

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link java8Parser}.
 */
public interface java8Listener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link java8Parser#literal}.
     *
     * @param ctx the parse tree
     */
    void enterLiteral(java8Parser.LiteralContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#literal}.
     *
     * @param ctx the parse tree
     */
    void exitLiteral(java8Parser.LiteralContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#type}.
     *
     * @param ctx the parse tree
     */
    void enterType(java8Parser.TypeContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#type}.
     *
     * @param ctx the parse tree
     */
    void exitType(java8Parser.TypeContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#primitiveType}.
     *
     * @param ctx the parse tree
     */
    void enterPrimitiveType(java8Parser.PrimitiveTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#primitiveType}.
     *
     * @param ctx the parse tree
     */
    void exitPrimitiveType(java8Parser.PrimitiveTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#numericType}.
     *
     * @param ctx the parse tree
     */
    void enterNumericType(java8Parser.NumericTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#numericType}.
     *
     * @param ctx the parse tree
     */
    void exitNumericType(java8Parser.NumericTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#integralType}.
     *
     * @param ctx the parse tree
     */
    void enterIntegralType(java8Parser.IntegralTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#integralType}.
     *
     * @param ctx the parse tree
     */
    void exitIntegralType(java8Parser.IntegralTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#floatingPointType}.
     *
     * @param ctx the parse tree
     */
    void enterFloatingPointType(java8Parser.FloatingPointTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#floatingPointType}.
     *
     * @param ctx the parse tree
     */
    void exitFloatingPointType(java8Parser.FloatingPointTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#referenceType}.
     *
     * @param ctx the parse tree
     */
    void enterReferenceType(java8Parser.ReferenceTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#referenceType}.
     *
     * @param ctx the parse tree
     */
    void exitReferenceType(java8Parser.ReferenceTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#classOrInterfaceType}.
     *
     * @param ctx the parse tree
     */
    void enterClassOrInterfaceType(java8Parser.ClassOrInterfaceTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#classOrInterfaceType}.
     *
     * @param ctx the parse tree
     */
    void exitClassOrInterfaceType(java8Parser.ClassOrInterfaceTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#classType}.
     *
     * @param ctx the parse tree
     */
    void enterClassType(java8Parser.ClassTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#classType}.
     *
     * @param ctx the parse tree
     */
    void exitClassType(java8Parser.ClassTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#classType_lf_classOrInterfaceType}.
     *
     * @param ctx the parse tree
     */
    void enterClassType_lf_classOrInterfaceType(java8Parser.ClassType_lf_classOrInterfaceTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#classType_lf_classOrInterfaceType}.
     *
     * @param ctx the parse tree
     */
    void exitClassType_lf_classOrInterfaceType(java8Parser.ClassType_lf_classOrInterfaceTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#classType_lfno_classOrInterfaceType}.
     *
     * @param ctx the parse tree
     */
    void enterClassType_lfno_classOrInterfaceType(java8Parser.ClassType_lfno_classOrInterfaceTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#classType_lfno_classOrInterfaceType}.
     *
     * @param ctx the parse tree
     */
    void exitClassType_lfno_classOrInterfaceType(java8Parser.ClassType_lfno_classOrInterfaceTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#interfaceType}.
     *
     * @param ctx the parse tree
     */
    void enterInterfaceType(java8Parser.InterfaceTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#interfaceType}.
     *
     * @param ctx the parse tree
     */
    void exitInterfaceType(java8Parser.InterfaceTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#interfaceType_lf_classOrInterfaceType}.
     *
     * @param ctx the parse tree
     */
    void enterInterfaceType_lf_classOrInterfaceType(java8Parser.InterfaceType_lf_classOrInterfaceTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#interfaceType_lf_classOrInterfaceType}.
     *
     * @param ctx the parse tree
     */
    void exitInterfaceType_lf_classOrInterfaceType(java8Parser.InterfaceType_lf_classOrInterfaceTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#interfaceType_lfno_classOrInterfaceType}.
     *
     * @param ctx the parse tree
     */
    void enterInterfaceType_lfno_classOrInterfaceType(java8Parser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#interfaceType_lfno_classOrInterfaceType}.
     *
     * @param ctx the parse tree
     */
    void exitInterfaceType_lfno_classOrInterfaceType(java8Parser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#typeVariable}.
     *
     * @param ctx the parse tree
     */
    void enterTypeVariable(java8Parser.TypeVariableContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#typeVariable}.
     *
     * @param ctx the parse tree
     */
    void exitTypeVariable(java8Parser.TypeVariableContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#arrayType}.
     *
     * @param ctx the parse tree
     */
    void enterArrayType(java8Parser.ArrayTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#arrayType}.
     *
     * @param ctx the parse tree
     */
    void exitArrayType(java8Parser.ArrayTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#dims}.
     *
     * @param ctx the parse tree
     */
    void enterDims(java8Parser.DimsContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#dims}.
     *
     * @param ctx the parse tree
     */
    void exitDims(java8Parser.DimsContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#typeParameter}.
     *
     * @param ctx the parse tree
     */
    void enterTypeParameter(java8Parser.TypeParameterContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#typeParameter}.
     *
     * @param ctx the parse tree
     */
    void exitTypeParameter(java8Parser.TypeParameterContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#typeParameterModifier}.
     *
     * @param ctx the parse tree
     */
    void enterTypeParameterModifier(java8Parser.TypeParameterModifierContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#typeParameterModifier}.
     *
     * @param ctx the parse tree
     */
    void exitTypeParameterModifier(java8Parser.TypeParameterModifierContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#typeBound}.
     *
     * @param ctx the parse tree
     */
    void enterTypeBound(java8Parser.TypeBoundContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#typeBound}.
     *
     * @param ctx the parse tree
     */
    void exitTypeBound(java8Parser.TypeBoundContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#additionalBound}.
     *
     * @param ctx the parse tree
     */
    void enterAdditionalBound(java8Parser.AdditionalBoundContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#additionalBound}.
     *
     * @param ctx the parse tree
     */
    void exitAdditionalBound(java8Parser.AdditionalBoundContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#typeArguments}.
     *
     * @param ctx the parse tree
     */
    void enterTypeArguments(java8Parser.TypeArgumentsContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#typeArguments}.
     *
     * @param ctx the parse tree
     */
    void exitTypeArguments(java8Parser.TypeArgumentsContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#typeArgumentList}.
     *
     * @param ctx the parse tree
     */
    void enterTypeArgumentList(java8Parser.TypeArgumentListContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#typeArgumentList}.
     *
     * @param ctx the parse tree
     */
    void exitTypeArgumentList(java8Parser.TypeArgumentListContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#typeArgument}.
     *
     * @param ctx the parse tree
     */
    void enterTypeArgument(java8Parser.TypeArgumentContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#typeArgument}.
     *
     * @param ctx the parse tree
     */
    void exitTypeArgument(java8Parser.TypeArgumentContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#wildcard}.
     *
     * @param ctx the parse tree
     */
    void enterWildcard(java8Parser.WildcardContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#wildcard}.
     *
     * @param ctx the parse tree
     */
    void exitWildcard(java8Parser.WildcardContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#wildcardBounds}.
     *
     * @param ctx the parse tree
     */
    void enterWildcardBounds(java8Parser.WildcardBoundsContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#wildcardBounds}.
     *
     * @param ctx the parse tree
     */
    void exitWildcardBounds(java8Parser.WildcardBoundsContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#packageName}.
     *
     * @param ctx the parse tree
     */
    void enterPackageName(java8Parser.PackageNameContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#packageName}.
     *
     * @param ctx the parse tree
     */
    void exitPackageName(java8Parser.PackageNameContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#typeName}.
     *
     * @param ctx the parse tree
     */
    void enterTypeName(java8Parser.TypeNameContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#typeName}.
     *
     * @param ctx the parse tree
     */
    void exitTypeName(java8Parser.TypeNameContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#packageOrTypeName}.
     *
     * @param ctx the parse tree
     */
    void enterPackageOrTypeName(java8Parser.PackageOrTypeNameContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#packageOrTypeName}.
     *
     * @param ctx the parse tree
     */
    void exitPackageOrTypeName(java8Parser.PackageOrTypeNameContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#expressionName}.
     *
     * @param ctx the parse tree
     */
    void enterExpressionName(java8Parser.ExpressionNameContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#expressionName}.
     *
     * @param ctx the parse tree
     */
    void exitExpressionName(java8Parser.ExpressionNameContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#methodName}.
     *
     * @param ctx the parse tree
     */
    void enterMethodName(java8Parser.MethodNameContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#methodName}.
     *
     * @param ctx the parse tree
     */
    void exitMethodName(java8Parser.MethodNameContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#ambiguousName}.
     *
     * @param ctx the parse tree
     */
    void enterAmbiguousName(java8Parser.AmbiguousNameContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#ambiguousName}.
     *
     * @param ctx the parse tree
     */
    void exitAmbiguousName(java8Parser.AmbiguousNameContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#compilationUnit}.
     *
     * @param ctx the parse tree
     */
    void enterCompilationUnit(java8Parser.CompilationUnitContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#compilationUnit}.
     *
     * @param ctx the parse tree
     */
    void exitCompilationUnit(java8Parser.CompilationUnitContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#packageDeclaration}.
     *
     * @param ctx the parse tree
     */
    void enterPackageDeclaration(java8Parser.PackageDeclarationContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#packageDeclaration}.
     *
     * @param ctx the parse tree
     */
    void exitPackageDeclaration(java8Parser.PackageDeclarationContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#packageModifier}.
     *
     * @param ctx the parse tree
     */
    void enterPackageModifier(java8Parser.PackageModifierContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#packageModifier}.
     *
     * @param ctx the parse tree
     */
    void exitPackageModifier(java8Parser.PackageModifierContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#importDeclaration}.
     *
     * @param ctx the parse tree
     */
    void enterImportDeclaration(java8Parser.ImportDeclarationContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#importDeclaration}.
     *
     * @param ctx the parse tree
     */
    void exitImportDeclaration(java8Parser.ImportDeclarationContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#singleTypeImportDeclaration}.
     *
     * @param ctx the parse tree
     */
    void enterSingleTypeImportDeclaration(java8Parser.SingleTypeImportDeclarationContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#singleTypeImportDeclaration}.
     *
     * @param ctx the parse tree
     */
    void exitSingleTypeImportDeclaration(java8Parser.SingleTypeImportDeclarationContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#typeImportOnDemandDeclaration}.
     *
     * @param ctx the parse tree
     */
    void enterTypeImportOnDemandDeclaration(java8Parser.TypeImportOnDemandDeclarationContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#typeImportOnDemandDeclaration}.
     *
     * @param ctx the parse tree
     */
    void exitTypeImportOnDemandDeclaration(java8Parser.TypeImportOnDemandDeclarationContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#singleStaticImportDeclaration}.
     *
     * @param ctx the parse tree
     */
    void enterSingleStaticImportDeclaration(java8Parser.SingleStaticImportDeclarationContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#singleStaticImportDeclaration}.
     *
     * @param ctx the parse tree
     */
    void exitSingleStaticImportDeclaration(java8Parser.SingleStaticImportDeclarationContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#staticImportOnDemandDeclaration}.
     *
     * @param ctx the parse tree
     */
    void enterStaticImportOnDemandDeclaration(java8Parser.StaticImportOnDemandDeclarationContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#staticImportOnDemandDeclaration}.
     *
     * @param ctx the parse tree
     */
    void exitStaticImportOnDemandDeclaration(java8Parser.StaticImportOnDemandDeclarationContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#typeDeclaration}.
     *
     * @param ctx the parse tree
     */
    void enterTypeDeclaration(java8Parser.TypeDeclarationContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#typeDeclaration}.
     *
     * @param ctx the parse tree
     */
    void exitTypeDeclaration(java8Parser.TypeDeclarationContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#classDeclaration}.
     *
     * @param ctx the parse tree
     */
    void enterClassDeclaration(java8Parser.ClassDeclarationContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#classDeclaration}.
     *
     * @param ctx the parse tree
     */
    void exitClassDeclaration(java8Parser.ClassDeclarationContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#normalClassDeclaration}.
     *
     * @param ctx the parse tree
     */
    void enterNormalClassDeclaration(java8Parser.NormalClassDeclarationContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#normalClassDeclaration}.
     *
     * @param ctx the parse tree
     */
    void exitNormalClassDeclaration(java8Parser.NormalClassDeclarationContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#classModifier}.
     *
     * @param ctx the parse tree
     */
    void enterClassModifier(java8Parser.ClassModifierContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#classModifier}.
     *
     * @param ctx the parse tree
     */
    void exitClassModifier(java8Parser.ClassModifierContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#typeParameters}.
     *
     * @param ctx the parse tree
     */
    void enterTypeParameters(java8Parser.TypeParametersContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#typeParameters}.
     *
     * @param ctx the parse tree
     */
    void exitTypeParameters(java8Parser.TypeParametersContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#typeParameterList}.
     *
     * @param ctx the parse tree
     */
    void enterTypeParameterList(java8Parser.TypeParameterListContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#typeParameterList}.
     *
     * @param ctx the parse tree
     */
    void exitTypeParameterList(java8Parser.TypeParameterListContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#superclass}.
     *
     * @param ctx the parse tree
     */
    void enterSuperclass(java8Parser.SuperclassContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#superclass}.
     *
     * @param ctx the parse tree
     */
    void exitSuperclass(java8Parser.SuperclassContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#superinterfaces}.
     *
     * @param ctx the parse tree
     */
    void enterSuperinterfaces(java8Parser.SuperinterfacesContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#superinterfaces}.
     *
     * @param ctx the parse tree
     */
    void exitSuperinterfaces(java8Parser.SuperinterfacesContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#interfaceTypeList}.
     *
     * @param ctx the parse tree
     */
    void enterInterfaceTypeList(java8Parser.InterfaceTypeListContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#interfaceTypeList}.
     *
     * @param ctx the parse tree
     */
    void exitInterfaceTypeList(java8Parser.InterfaceTypeListContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#classBody}.
     *
     * @param ctx the parse tree
     */
    void enterClassBody(java8Parser.ClassBodyContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#classBody}.
     *
     * @param ctx the parse tree
     */
    void exitClassBody(java8Parser.ClassBodyContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#classBodyDeclaration}.
     *
     * @param ctx the parse tree
     */
    void enterClassBodyDeclaration(java8Parser.ClassBodyDeclarationContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#classBodyDeclaration}.
     *
     * @param ctx the parse tree
     */
    void exitClassBodyDeclaration(java8Parser.ClassBodyDeclarationContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#classMemberDeclaration}.
     *
     * @param ctx the parse tree
     */
    void enterClassMemberDeclaration(java8Parser.ClassMemberDeclarationContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#classMemberDeclaration}.
     *
     * @param ctx the parse tree
     */
    void exitClassMemberDeclaration(java8Parser.ClassMemberDeclarationContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#fieldDeclaration}.
     *
     * @param ctx the parse tree
     */
    void enterFieldDeclaration(java8Parser.FieldDeclarationContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#fieldDeclaration}.
     *
     * @param ctx the parse tree
     */
    void exitFieldDeclaration(java8Parser.FieldDeclarationContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#fieldModifier}.
     *
     * @param ctx the parse tree
     */
    void enterFieldModifier(java8Parser.FieldModifierContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#fieldModifier}.
     *
     * @param ctx the parse tree
     */
    void exitFieldModifier(java8Parser.FieldModifierContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#variableDeclaratorList}.
     *
     * @param ctx the parse tree
     */
    void enterVariableDeclaratorList(java8Parser.VariableDeclaratorListContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#variableDeclaratorList}.
     *
     * @param ctx the parse tree
     */
    void exitVariableDeclaratorList(java8Parser.VariableDeclaratorListContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#variableDeclarator}.
     *
     * @param ctx the parse tree
     */
    void enterVariableDeclarator(java8Parser.VariableDeclaratorContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#variableDeclarator}.
     *
     * @param ctx the parse tree
     */
    void exitVariableDeclarator(java8Parser.VariableDeclaratorContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#variableDeclaratorId}.
     *
     * @param ctx the parse tree
     */
    void enterVariableDeclaratorId(java8Parser.VariableDeclaratorIdContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#variableDeclaratorId}.
     *
     * @param ctx the parse tree
     */
    void exitVariableDeclaratorId(java8Parser.VariableDeclaratorIdContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#variableInitializer}.
     *
     * @param ctx the parse tree
     */
    void enterVariableInitializer(java8Parser.VariableInitializerContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#variableInitializer}.
     *
     * @param ctx the parse tree
     */
    void exitVariableInitializer(java8Parser.VariableInitializerContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#unannType}.
     *
     * @param ctx the parse tree
     */
    void enterUnannType(java8Parser.UnannTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#unannType}.
     *
     * @param ctx the parse tree
     */
    void exitUnannType(java8Parser.UnannTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#unannPrimitiveType}.
     *
     * @param ctx the parse tree
     */
    void enterUnannPrimitiveType(java8Parser.UnannPrimitiveTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#unannPrimitiveType}.
     *
     * @param ctx the parse tree
     */
    void exitUnannPrimitiveType(java8Parser.UnannPrimitiveTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#unannReferenceType}.
     *
     * @param ctx the parse tree
     */
    void enterUnannReferenceType(java8Parser.UnannReferenceTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#unannReferenceType}.
     *
     * @param ctx the parse tree
     */
    void exitUnannReferenceType(java8Parser.UnannReferenceTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#unannClassOrInterfaceType}.
     *
     * @param ctx the parse tree
     */
    void enterUnannClassOrInterfaceType(java8Parser.UnannClassOrInterfaceTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#unannClassOrInterfaceType}.
     *
     * @param ctx the parse tree
     */
    void exitUnannClassOrInterfaceType(java8Parser.UnannClassOrInterfaceTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#unannClassType}.
     *
     * @param ctx the parse tree
     */
    void enterUnannClassType(java8Parser.UnannClassTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#unannClassType}.
     *
     * @param ctx the parse tree
     */
    void exitUnannClassType(java8Parser.UnannClassTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#unannClassType_lf_unannClassOrInterfaceType}.
     *
     * @param ctx the parse tree
     */
    void enterUnannClassType_lf_unannClassOrInterfaceType(java8Parser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#unannClassType_lf_unannClassOrInterfaceType}.
     *
     * @param ctx the parse tree
     */
    void exitUnannClassType_lf_unannClassOrInterfaceType(java8Parser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#unannClassType_lfno_unannClassOrInterfaceType}.
     *
     * @param ctx the parse tree
     */
    void enterUnannClassType_lfno_unannClassOrInterfaceType(java8Parser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#unannClassType_lfno_unannClassOrInterfaceType}.
     *
     * @param ctx the parse tree
     */
    void exitUnannClassType_lfno_unannClassOrInterfaceType(java8Parser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#unannInterfaceType}.
     *
     * @param ctx the parse tree
     */
    void enterUnannInterfaceType(java8Parser.UnannInterfaceTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#unannInterfaceType}.
     *
     * @param ctx the parse tree
     */
    void exitUnannInterfaceType(java8Parser.UnannInterfaceTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#unannInterfaceType_lf_unannClassOrInterfaceType}.
     *
     * @param ctx the parse tree
     */
    void enterUnannInterfaceType_lf_unannClassOrInterfaceType(java8Parser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#unannInterfaceType_lf_unannClassOrInterfaceType}.
     *
     * @param ctx the parse tree
     */
    void exitUnannInterfaceType_lf_unannClassOrInterfaceType(java8Parser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
     *
     * @param ctx the parse tree
     */
    void enterUnannInterfaceType_lfno_unannClassOrInterfaceType(java8Parser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
     *
     * @param ctx the parse tree
     */
    void exitUnannInterfaceType_lfno_unannClassOrInterfaceType(java8Parser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#unannTypeVariable}.
     *
     * @param ctx the parse tree
     */
    void enterUnannTypeVariable(java8Parser.UnannTypeVariableContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#unannTypeVariable}.
     *
     * @param ctx the parse tree
     */
    void exitUnannTypeVariable(java8Parser.UnannTypeVariableContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#unannArrayType}.
     *
     * @param ctx the parse tree
     */
    void enterUnannArrayType(java8Parser.UnannArrayTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#unannArrayType}.
     *
     * @param ctx the parse tree
     */
    void exitUnannArrayType(java8Parser.UnannArrayTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#methodDeclaration}.
     *
     * @param ctx the parse tree
     */
    void enterMethodDeclaration(java8Parser.MethodDeclarationContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#methodDeclaration}.
     *
     * @param ctx the parse tree
     */
    void exitMethodDeclaration(java8Parser.MethodDeclarationContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#methodModifier}.
     *
     * @param ctx the parse tree
     */
    void enterMethodModifier(java8Parser.MethodModifierContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#methodModifier}.
     *
     * @param ctx the parse tree
     */
    void exitMethodModifier(java8Parser.MethodModifierContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#methodHeader}.
     *
     * @param ctx the parse tree
     */
    void enterMethodHeader(java8Parser.MethodHeaderContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#methodHeader}.
     *
     * @param ctx the parse tree
     */
    void exitMethodHeader(java8Parser.MethodHeaderContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#result}.
     *
     * @param ctx the parse tree
     */
    void enterResult(java8Parser.ResultContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#result}.
     *
     * @param ctx the parse tree
     */
    void exitResult(java8Parser.ResultContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#methodDeclarator}.
     *
     * @param ctx the parse tree
     */
    void enterMethodDeclarator(java8Parser.MethodDeclaratorContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#methodDeclarator}.
     *
     * @param ctx the parse tree
     */
    void exitMethodDeclarator(java8Parser.MethodDeclaratorContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#formalParameterList}.
     *
     * @param ctx the parse tree
     */
    void enterFormalParameterList(java8Parser.FormalParameterListContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#formalParameterList}.
     *
     * @param ctx the parse tree
     */
    void exitFormalParameterList(java8Parser.FormalParameterListContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#formalParameters}.
     *
     * @param ctx the parse tree
     */
    void enterFormalParameters(java8Parser.FormalParametersContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#formalParameters}.
     *
     * @param ctx the parse tree
     */
    void exitFormalParameters(java8Parser.FormalParametersContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#formalParameter}.
     *
     * @param ctx the parse tree
     */
    void enterFormalParameter(java8Parser.FormalParameterContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#formalParameter}.
     *
     * @param ctx the parse tree
     */
    void exitFormalParameter(java8Parser.FormalParameterContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#variableModifier}.
     *
     * @param ctx the parse tree
     */
    void enterVariableModifier(java8Parser.VariableModifierContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#variableModifier}.
     *
     * @param ctx the parse tree
     */
    void exitVariableModifier(java8Parser.VariableModifierContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#lastFormalParameter}.
     *
     * @param ctx the parse tree
     */
    void enterLastFormalParameter(java8Parser.LastFormalParameterContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#lastFormalParameter}.
     *
     * @param ctx the parse tree
     */
    void exitLastFormalParameter(java8Parser.LastFormalParameterContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#receiverParameter}.
     *
     * @param ctx the parse tree
     */
    void enterReceiverParameter(java8Parser.ReceiverParameterContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#receiverParameter}.
     *
     * @param ctx the parse tree
     */
    void exitReceiverParameter(java8Parser.ReceiverParameterContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#throws_}.
     *
     * @param ctx the parse tree
     */
    void enterThrows_(java8Parser.Throws_Context ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#throws_}.
     *
     * @param ctx the parse tree
     */
    void exitThrows_(java8Parser.Throws_Context ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#exceptionTypeList}.
     *
     * @param ctx the parse tree
     */
    void enterExceptionTypeList(java8Parser.ExceptionTypeListContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#exceptionTypeList}.
     *
     * @param ctx the parse tree
     */
    void exitExceptionTypeList(java8Parser.ExceptionTypeListContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#exceptionType}.
     *
     * @param ctx the parse tree
     */
    void enterExceptionType(java8Parser.ExceptionTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#exceptionType}.
     *
     * @param ctx the parse tree
     */
    void exitExceptionType(java8Parser.ExceptionTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#methodBody}.
     *
     * @param ctx the parse tree
     */
    void enterMethodBody(java8Parser.MethodBodyContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#methodBody}.
     *
     * @param ctx the parse tree
     */
    void exitMethodBody(java8Parser.MethodBodyContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#instanceInitializer}.
     *
     * @param ctx the parse tree
     */
    void enterInstanceInitializer(java8Parser.InstanceInitializerContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#instanceInitializer}.
     *
     * @param ctx the parse tree
     */
    void exitInstanceInitializer(java8Parser.InstanceInitializerContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#staticInitializer}.
     *
     * @param ctx the parse tree
     */
    void enterStaticInitializer(java8Parser.StaticInitializerContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#staticInitializer}.
     *
     * @param ctx the parse tree
     */
    void exitStaticInitializer(java8Parser.StaticInitializerContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#constructorDeclaration}.
     *
     * @param ctx the parse tree
     */
    void enterConstructorDeclaration(java8Parser.ConstructorDeclarationContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#constructorDeclaration}.
     *
     * @param ctx the parse tree
     */
    void exitConstructorDeclaration(java8Parser.ConstructorDeclarationContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#constructorModifier}.
     *
     * @param ctx the parse tree
     */
    void enterConstructorModifier(java8Parser.ConstructorModifierContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#constructorModifier}.
     *
     * @param ctx the parse tree
     */
    void exitConstructorModifier(java8Parser.ConstructorModifierContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#constructorDeclarator}.
     *
     * @param ctx the parse tree
     */
    void enterConstructorDeclarator(java8Parser.ConstructorDeclaratorContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#constructorDeclarator}.
     *
     * @param ctx the parse tree
     */
    void exitConstructorDeclarator(java8Parser.ConstructorDeclaratorContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#simpleTypeName}.
     *
     * @param ctx the parse tree
     */
    void enterSimpleTypeName(java8Parser.SimpleTypeNameContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#simpleTypeName}.
     *
     * @param ctx the parse tree
     */
    void exitSimpleTypeName(java8Parser.SimpleTypeNameContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#constructorBody}.
     *
     * @param ctx the parse tree
     */
    void enterConstructorBody(java8Parser.ConstructorBodyContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#constructorBody}.
     *
     * @param ctx the parse tree
     */
    void exitConstructorBody(java8Parser.ConstructorBodyContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#explicitConstructorInvocation}.
     *
     * @param ctx the parse tree
     */
    void enterExplicitConstructorInvocation(java8Parser.ExplicitConstructorInvocationContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#explicitConstructorInvocation}.
     *
     * @param ctx the parse tree
     */
    void exitExplicitConstructorInvocation(java8Parser.ExplicitConstructorInvocationContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#enumDeclaration}.
     *
     * @param ctx the parse tree
     */
    void enterEnumDeclaration(java8Parser.EnumDeclarationContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#enumDeclaration}.
     *
     * @param ctx the parse tree
     */
    void exitEnumDeclaration(java8Parser.EnumDeclarationContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#enumBody}.
     *
     * @param ctx the parse tree
     */
    void enterEnumBody(java8Parser.EnumBodyContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#enumBody}.
     *
     * @param ctx the parse tree
     */
    void exitEnumBody(java8Parser.EnumBodyContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#enumConstantList}.
     *
     * @param ctx the parse tree
     */
    void enterEnumConstantList(java8Parser.EnumConstantListContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#enumConstantList}.
     *
     * @param ctx the parse tree
     */
    void exitEnumConstantList(java8Parser.EnumConstantListContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#enumConstant}.
     *
     * @param ctx the parse tree
     */
    void enterEnumConstant(java8Parser.EnumConstantContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#enumConstant}.
     *
     * @param ctx the parse tree
     */
    void exitEnumConstant(java8Parser.EnumConstantContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#enumConstantModifier}.
     *
     * @param ctx the parse tree
     */
    void enterEnumConstantModifier(java8Parser.EnumConstantModifierContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#enumConstantModifier}.
     *
     * @param ctx the parse tree
     */
    void exitEnumConstantModifier(java8Parser.EnumConstantModifierContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#enumBodyDeclarations}.
     *
     * @param ctx the parse tree
     */
    void enterEnumBodyDeclarations(java8Parser.EnumBodyDeclarationsContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#enumBodyDeclarations}.
     *
     * @param ctx the parse tree
     */
    void exitEnumBodyDeclarations(java8Parser.EnumBodyDeclarationsContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#interfaceDeclaration}.
     *
     * @param ctx the parse tree
     */
    void enterInterfaceDeclaration(java8Parser.InterfaceDeclarationContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#interfaceDeclaration}.
     *
     * @param ctx the parse tree
     */
    void exitInterfaceDeclaration(java8Parser.InterfaceDeclarationContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#normalInterfaceDeclaration}.
     *
     * @param ctx the parse tree
     */
    void enterNormalInterfaceDeclaration(java8Parser.NormalInterfaceDeclarationContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#normalInterfaceDeclaration}.
     *
     * @param ctx the parse tree
     */
    void exitNormalInterfaceDeclaration(java8Parser.NormalInterfaceDeclarationContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#interfaceModifier}.
     *
     * @param ctx the parse tree
     */
    void enterInterfaceModifier(java8Parser.InterfaceModifierContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#interfaceModifier}.
     *
     * @param ctx the parse tree
     */
    void exitInterfaceModifier(java8Parser.InterfaceModifierContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#extendsInterfaces}.
     *
     * @param ctx the parse tree
     */
    void enterExtendsInterfaces(java8Parser.ExtendsInterfacesContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#extendsInterfaces}.
     *
     * @param ctx the parse tree
     */
    void exitExtendsInterfaces(java8Parser.ExtendsInterfacesContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#interfaceBody}.
     *
     * @param ctx the parse tree
     */
    void enterInterfaceBody(java8Parser.InterfaceBodyContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#interfaceBody}.
     *
     * @param ctx the parse tree
     */
    void exitInterfaceBody(java8Parser.InterfaceBodyContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#interfaceMemberDeclaration}.
     *
     * @param ctx the parse tree
     */
    void enterInterfaceMemberDeclaration(java8Parser.InterfaceMemberDeclarationContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#interfaceMemberDeclaration}.
     *
     * @param ctx the parse tree
     */
    void exitInterfaceMemberDeclaration(java8Parser.InterfaceMemberDeclarationContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#constantDeclaration}.
     *
     * @param ctx the parse tree
     */
    void enterConstantDeclaration(java8Parser.ConstantDeclarationContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#constantDeclaration}.
     *
     * @param ctx the parse tree
     */
    void exitConstantDeclaration(java8Parser.ConstantDeclarationContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#constantModifier}.
     *
     * @param ctx the parse tree
     */
    void enterConstantModifier(java8Parser.ConstantModifierContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#constantModifier}.
     *
     * @param ctx the parse tree
     */
    void exitConstantModifier(java8Parser.ConstantModifierContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#interfaceMethodDeclaration}.
     *
     * @param ctx the parse tree
     */
    void enterInterfaceMethodDeclaration(java8Parser.InterfaceMethodDeclarationContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#interfaceMethodDeclaration}.
     *
     * @param ctx the parse tree
     */
    void exitInterfaceMethodDeclaration(java8Parser.InterfaceMethodDeclarationContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#interfaceMethodModifier}.
     *
     * @param ctx the parse tree
     */
    void enterInterfaceMethodModifier(java8Parser.InterfaceMethodModifierContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#interfaceMethodModifier}.
     *
     * @param ctx the parse tree
     */
    void exitInterfaceMethodModifier(java8Parser.InterfaceMethodModifierContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#annotationTypeDeclaration}.
     *
     * @param ctx the parse tree
     */
    void enterAnnotationTypeDeclaration(java8Parser.AnnotationTypeDeclarationContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#annotationTypeDeclaration}.
     *
     * @param ctx the parse tree
     */
    void exitAnnotationTypeDeclaration(java8Parser.AnnotationTypeDeclarationContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#annotationTypeBody}.
     *
     * @param ctx the parse tree
     */
    void enterAnnotationTypeBody(java8Parser.AnnotationTypeBodyContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#annotationTypeBody}.
     *
     * @param ctx the parse tree
     */
    void exitAnnotationTypeBody(java8Parser.AnnotationTypeBodyContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#annotationTypeMemberDeclaration}.
     *
     * @param ctx the parse tree
     */
    void enterAnnotationTypeMemberDeclaration(java8Parser.AnnotationTypeMemberDeclarationContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#annotationTypeMemberDeclaration}.
     *
     * @param ctx the parse tree
     */
    void exitAnnotationTypeMemberDeclaration(java8Parser.AnnotationTypeMemberDeclarationContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#annotationTypeElementDeclaration}.
     *
     * @param ctx the parse tree
     */
    void enterAnnotationTypeElementDeclaration(java8Parser.AnnotationTypeElementDeclarationContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#annotationTypeElementDeclaration}.
     *
     * @param ctx the parse tree
     */
    void exitAnnotationTypeElementDeclaration(java8Parser.AnnotationTypeElementDeclarationContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#annotationTypeElementModifier}.
     *
     * @param ctx the parse tree
     */
    void enterAnnotationTypeElementModifier(java8Parser.AnnotationTypeElementModifierContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#annotationTypeElementModifier}.
     *
     * @param ctx the parse tree
     */
    void exitAnnotationTypeElementModifier(java8Parser.AnnotationTypeElementModifierContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#defaultValue}.
     *
     * @param ctx the parse tree
     */
    void enterDefaultValue(java8Parser.DefaultValueContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#defaultValue}.
     *
     * @param ctx the parse tree
     */
    void exitDefaultValue(java8Parser.DefaultValueContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#annotation}.
     *
     * @param ctx the parse tree
     */
    void enterAnnotation(java8Parser.AnnotationContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#annotation}.
     *
     * @param ctx the parse tree
     */
    void exitAnnotation(java8Parser.AnnotationContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#normalAnnotation}.
     *
     * @param ctx the parse tree
     */
    void enterNormalAnnotation(java8Parser.NormalAnnotationContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#normalAnnotation}.
     *
     * @param ctx the parse tree
     */
    void exitNormalAnnotation(java8Parser.NormalAnnotationContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#elementValuePairList}.
     *
     * @param ctx the parse tree
     */
    void enterElementValuePairList(java8Parser.ElementValuePairListContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#elementValuePairList}.
     *
     * @param ctx the parse tree
     */
    void exitElementValuePairList(java8Parser.ElementValuePairListContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#elementValuePair}.
     *
     * @param ctx the parse tree
     */
    void enterElementValuePair(java8Parser.ElementValuePairContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#elementValuePair}.
     *
     * @param ctx the parse tree
     */
    void exitElementValuePair(java8Parser.ElementValuePairContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#elementValue}.
     *
     * @param ctx the parse tree
     */
    void enterElementValue(java8Parser.ElementValueContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#elementValue}.
     *
     * @param ctx the parse tree
     */
    void exitElementValue(java8Parser.ElementValueContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#elementValueArrayInitializer}.
     *
     * @param ctx the parse tree
     */
    void enterElementValueArrayInitializer(java8Parser.ElementValueArrayInitializerContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#elementValueArrayInitializer}.
     *
     * @param ctx the parse tree
     */
    void exitElementValueArrayInitializer(java8Parser.ElementValueArrayInitializerContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#elementValueList}.
     *
     * @param ctx the parse tree
     */
    void enterElementValueList(java8Parser.ElementValueListContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#elementValueList}.
     *
     * @param ctx the parse tree
     */
    void exitElementValueList(java8Parser.ElementValueListContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#markerAnnotation}.
     *
     * @param ctx the parse tree
     */
    void enterMarkerAnnotation(java8Parser.MarkerAnnotationContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#markerAnnotation}.
     *
     * @param ctx the parse tree
     */
    void exitMarkerAnnotation(java8Parser.MarkerAnnotationContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#singleElementAnnotation}.
     *
     * @param ctx the parse tree
     */
    void enterSingleElementAnnotation(java8Parser.SingleElementAnnotationContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#singleElementAnnotation}.
     *
     * @param ctx the parse tree
     */
    void exitSingleElementAnnotation(java8Parser.SingleElementAnnotationContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#arrayInitializer}.
     *
     * @param ctx the parse tree
     */
    void enterArrayInitializer(java8Parser.ArrayInitializerContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#arrayInitializer}.
     *
     * @param ctx the parse tree
     */
    void exitArrayInitializer(java8Parser.ArrayInitializerContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#variableInitializerList}.
     *
     * @param ctx the parse tree
     */
    void enterVariableInitializerList(java8Parser.VariableInitializerListContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#variableInitializerList}.
     *
     * @param ctx the parse tree
     */
    void exitVariableInitializerList(java8Parser.VariableInitializerListContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#block}.
     *
     * @param ctx the parse tree
     */
    void enterBlock(java8Parser.BlockContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#block}.
     *
     * @param ctx the parse tree
     */
    void exitBlock(java8Parser.BlockContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#blockStatements}.
     *
     * @param ctx the parse tree
     */
    void enterBlockStatements(java8Parser.BlockStatementsContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#blockStatements}.
     *
     * @param ctx the parse tree
     */
    void exitBlockStatements(java8Parser.BlockStatementsContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#blockStatement}.
     *
     * @param ctx the parse tree
     */
    void enterBlockStatement(java8Parser.BlockStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#blockStatement}.
     *
     * @param ctx the parse tree
     */
    void exitBlockStatement(java8Parser.BlockStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#localVariableDeclarationStatement}.
     *
     * @param ctx the parse tree
     */
    void enterLocalVariableDeclarationStatement(java8Parser.LocalVariableDeclarationStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#localVariableDeclarationStatement}.
     *
     * @param ctx the parse tree
     */
    void exitLocalVariableDeclarationStatement(java8Parser.LocalVariableDeclarationStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#localVariableDeclaration}.
     *
     * @param ctx the parse tree
     */
    void enterLocalVariableDeclaration(java8Parser.LocalVariableDeclarationContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#localVariableDeclaration}.
     *
     * @param ctx the parse tree
     */
    void exitLocalVariableDeclaration(java8Parser.LocalVariableDeclarationContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#statement}.
     *
     * @param ctx the parse tree
     */
    void enterStatement(java8Parser.StatementContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#statement}.
     *
     * @param ctx the parse tree
     */
    void exitStatement(java8Parser.StatementContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#statementNoShortIf}.
     *
     * @param ctx the parse tree
     */
    void enterStatementNoShortIf(java8Parser.StatementNoShortIfContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#statementNoShortIf}.
     *
     * @param ctx the parse tree
     */
    void exitStatementNoShortIf(java8Parser.StatementNoShortIfContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#statementWithoutTrailingSubstatement}.
     *
     * @param ctx the parse tree
     */
    void enterStatementWithoutTrailingSubstatement(java8Parser.StatementWithoutTrailingSubstatementContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#statementWithoutTrailingSubstatement}.
     *
     * @param ctx the parse tree
     */
    void exitStatementWithoutTrailingSubstatement(java8Parser.StatementWithoutTrailingSubstatementContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#emptyStatement}.
     *
     * @param ctx the parse tree
     */
    void enterEmptyStatement(java8Parser.EmptyStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#emptyStatement}.
     *
     * @param ctx the parse tree
     */
    void exitEmptyStatement(java8Parser.EmptyStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#labeledStatement}.
     *
     * @param ctx the parse tree
     */
    void enterLabeledStatement(java8Parser.LabeledStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#labeledStatement}.
     *
     * @param ctx the parse tree
     */
    void exitLabeledStatement(java8Parser.LabeledStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#labeledStatementNoShortIf}.
     *
     * @param ctx the parse tree
     */
    void enterLabeledStatementNoShortIf(java8Parser.LabeledStatementNoShortIfContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#labeledStatementNoShortIf}.
     *
     * @param ctx the parse tree
     */
    void exitLabeledStatementNoShortIf(java8Parser.LabeledStatementNoShortIfContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#expressionStatement}.
     *
     * @param ctx the parse tree
     */
    void enterExpressionStatement(java8Parser.ExpressionStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#expressionStatement}.
     *
     * @param ctx the parse tree
     */
    void exitExpressionStatement(java8Parser.ExpressionStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#statementExpression}.
     *
     * @param ctx the parse tree
     */
    void enterStatementExpression(java8Parser.StatementExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#statementExpression}.
     *
     * @param ctx the parse tree
     */
    void exitStatementExpression(java8Parser.StatementExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#ifThenStatement}.
     *
     * @param ctx the parse tree
     */
    void enterIfThenStatement(java8Parser.IfThenStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#ifThenStatement}.
     *
     * @param ctx the parse tree
     */
    void exitIfThenStatement(java8Parser.IfThenStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#ifThenElseStatement}.
     *
     * @param ctx the parse tree
     */
    void enterIfThenElseStatement(java8Parser.IfThenElseStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#ifThenElseStatement}.
     *
     * @param ctx the parse tree
     */
    void exitIfThenElseStatement(java8Parser.IfThenElseStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#ifThenElseStatementNoShortIf}.
     *
     * @param ctx the parse tree
     */
    void enterIfThenElseStatementNoShortIf(java8Parser.IfThenElseStatementNoShortIfContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#ifThenElseStatementNoShortIf}.
     *
     * @param ctx the parse tree
     */
    void exitIfThenElseStatementNoShortIf(java8Parser.IfThenElseStatementNoShortIfContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#assertStatement}.
     *
     * @param ctx the parse tree
     */
    void enterAssertStatement(java8Parser.AssertStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#assertStatement}.
     *
     * @param ctx the parse tree
     */
    void exitAssertStatement(java8Parser.AssertStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#switchStatement}.
     *
     * @param ctx the parse tree
     */
    void enterSwitchStatement(java8Parser.SwitchStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#switchStatement}.
     *
     * @param ctx the parse tree
     */
    void exitSwitchStatement(java8Parser.SwitchStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#switchBlock}.
     *
     * @param ctx the parse tree
     */
    void enterSwitchBlock(java8Parser.SwitchBlockContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#switchBlock}.
     *
     * @param ctx the parse tree
     */
    void exitSwitchBlock(java8Parser.SwitchBlockContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#switchBlockStatementGroup}.
     *
     * @param ctx the parse tree
     */
    void enterSwitchBlockStatementGroup(java8Parser.SwitchBlockStatementGroupContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#switchBlockStatementGroup}.
     *
     * @param ctx the parse tree
     */
    void exitSwitchBlockStatementGroup(java8Parser.SwitchBlockStatementGroupContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#switchLabels}.
     *
     * @param ctx the parse tree
     */
    void enterSwitchLabels(java8Parser.SwitchLabelsContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#switchLabels}.
     *
     * @param ctx the parse tree
     */
    void exitSwitchLabels(java8Parser.SwitchLabelsContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#switchLabel}.
     *
     * @param ctx the parse tree
     */
    void enterSwitchLabel(java8Parser.SwitchLabelContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#switchLabel}.
     *
     * @param ctx the parse tree
     */
    void exitSwitchLabel(java8Parser.SwitchLabelContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#enumConstantName}.
     *
     * @param ctx the parse tree
     */
    void enterEnumConstantName(java8Parser.EnumConstantNameContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#enumConstantName}.
     *
     * @param ctx the parse tree
     */
    void exitEnumConstantName(java8Parser.EnumConstantNameContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#whileStatement}.
     *
     * @param ctx the parse tree
     */
    void enterWhileStatement(java8Parser.WhileStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#whileStatement}.
     *
     * @param ctx the parse tree
     */
    void exitWhileStatement(java8Parser.WhileStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#whileStatementNoShortIf}.
     *
     * @param ctx the parse tree
     */
    void enterWhileStatementNoShortIf(java8Parser.WhileStatementNoShortIfContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#whileStatementNoShortIf}.
     *
     * @param ctx the parse tree
     */
    void exitWhileStatementNoShortIf(java8Parser.WhileStatementNoShortIfContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#doStatement}.
     *
     * @param ctx the parse tree
     */
    void enterDoStatement(java8Parser.DoStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#doStatement}.
     *
     * @param ctx the parse tree
     */
    void exitDoStatement(java8Parser.DoStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#forStatement}.
     *
     * @param ctx the parse tree
     */
    void enterForStatement(java8Parser.ForStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#forStatement}.
     *
     * @param ctx the parse tree
     */
    void exitForStatement(java8Parser.ForStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#forStatementNoShortIf}.
     *
     * @param ctx the parse tree
     */
    void enterForStatementNoShortIf(java8Parser.ForStatementNoShortIfContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#forStatementNoShortIf}.
     *
     * @param ctx the parse tree
     */
    void exitForStatementNoShortIf(java8Parser.ForStatementNoShortIfContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#basicForStatement}.
     *
     * @param ctx the parse tree
     */
    void enterBasicForStatement(java8Parser.BasicForStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#basicForStatement}.
     *
     * @param ctx the parse tree
     */
    void exitBasicForStatement(java8Parser.BasicForStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#basicForStatementNoShortIf}.
     *
     * @param ctx the parse tree
     */
    void enterBasicForStatementNoShortIf(java8Parser.BasicForStatementNoShortIfContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#basicForStatementNoShortIf}.
     *
     * @param ctx the parse tree
     */
    void exitBasicForStatementNoShortIf(java8Parser.BasicForStatementNoShortIfContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#forInit}.
     *
     * @param ctx the parse tree
     */
    void enterForInit(java8Parser.ForInitContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#forInit}.
     *
     * @param ctx the parse tree
     */
    void exitForInit(java8Parser.ForInitContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#forUpdate}.
     *
     * @param ctx the parse tree
     */
    void enterForUpdate(java8Parser.ForUpdateContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#forUpdate}.
     *
     * @param ctx the parse tree
     */
    void exitForUpdate(java8Parser.ForUpdateContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#statementExpressionList}.
     *
     * @param ctx the parse tree
     */
    void enterStatementExpressionList(java8Parser.StatementExpressionListContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#statementExpressionList}.
     *
     * @param ctx the parse tree
     */
    void exitStatementExpressionList(java8Parser.StatementExpressionListContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#enhancedForStatement}.
     *
     * @param ctx the parse tree
     */
    void enterEnhancedForStatement(java8Parser.EnhancedForStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#enhancedForStatement}.
     *
     * @param ctx the parse tree
     */
    void exitEnhancedForStatement(java8Parser.EnhancedForStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#enhancedForStatementNoShortIf}.
     *
     * @param ctx the parse tree
     */
    void enterEnhancedForStatementNoShortIf(java8Parser.EnhancedForStatementNoShortIfContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#enhancedForStatementNoShortIf}.
     *
     * @param ctx the parse tree
     */
    void exitEnhancedForStatementNoShortIf(java8Parser.EnhancedForStatementNoShortIfContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#breakStatement}.
     *
     * @param ctx the parse tree
     */
    void enterBreakStatement(java8Parser.BreakStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#breakStatement}.
     *
     * @param ctx the parse tree
     */
    void exitBreakStatement(java8Parser.BreakStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#continueStatement}.
     *
     * @param ctx the parse tree
     */
    void enterContinueStatement(java8Parser.ContinueStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#continueStatement}.
     *
     * @param ctx the parse tree
     */
    void exitContinueStatement(java8Parser.ContinueStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#returnStatement}.
     *
     * @param ctx the parse tree
     */
    void enterReturnStatement(java8Parser.ReturnStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#returnStatement}.
     *
     * @param ctx the parse tree
     */
    void exitReturnStatement(java8Parser.ReturnStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#throwStatement}.
     *
     * @param ctx the parse tree
     */
    void enterThrowStatement(java8Parser.ThrowStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#throwStatement}.
     *
     * @param ctx the parse tree
     */
    void exitThrowStatement(java8Parser.ThrowStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#synchronizedStatement}.
     *
     * @param ctx the parse tree
     */
    void enterSynchronizedStatement(java8Parser.SynchronizedStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#synchronizedStatement}.
     *
     * @param ctx the parse tree
     */
    void exitSynchronizedStatement(java8Parser.SynchronizedStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#tryStatement}.
     *
     * @param ctx the parse tree
     */
    void enterTryStatement(java8Parser.TryStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#tryStatement}.
     *
     * @param ctx the parse tree
     */
    void exitTryStatement(java8Parser.TryStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#catches}.
     *
     * @param ctx the parse tree
     */
    void enterCatches(java8Parser.CatchesContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#catches}.
     *
     * @param ctx the parse tree
     */
    void exitCatches(java8Parser.CatchesContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#catchClause}.
     *
     * @param ctx the parse tree
     */
    void enterCatchClause(java8Parser.CatchClauseContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#catchClause}.
     *
     * @param ctx the parse tree
     */
    void exitCatchClause(java8Parser.CatchClauseContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#catchFormalParameter}.
     *
     * @param ctx the parse tree
     */
    void enterCatchFormalParameter(java8Parser.CatchFormalParameterContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#catchFormalParameter}.
     *
     * @param ctx the parse tree
     */
    void exitCatchFormalParameter(java8Parser.CatchFormalParameterContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#catchType}.
     *
     * @param ctx the parse tree
     */
    void enterCatchType(java8Parser.CatchTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#catchType}.
     *
     * @param ctx the parse tree
     */
    void exitCatchType(java8Parser.CatchTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#finally_}.
     *
     * @param ctx the parse tree
     */
    void enterFinally_(java8Parser.Finally_Context ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#finally_}.
     *
     * @param ctx the parse tree
     */
    void exitFinally_(java8Parser.Finally_Context ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#tryWithResourcesStatement}.
     *
     * @param ctx the parse tree
     */
    void enterTryWithResourcesStatement(java8Parser.TryWithResourcesStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#tryWithResourcesStatement}.
     *
     * @param ctx the parse tree
     */
    void exitTryWithResourcesStatement(java8Parser.TryWithResourcesStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#resourceSpecification}.
     *
     * @param ctx the parse tree
     */
    void enterResourceSpecification(java8Parser.ResourceSpecificationContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#resourceSpecification}.
     *
     * @param ctx the parse tree
     */
    void exitResourceSpecification(java8Parser.ResourceSpecificationContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#resourceList}.
     *
     * @param ctx the parse tree
     */
    void enterResourceList(java8Parser.ResourceListContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#resourceList}.
     *
     * @param ctx the parse tree
     */
    void exitResourceList(java8Parser.ResourceListContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#resource}.
     *
     * @param ctx the parse tree
     */
    void enterResource(java8Parser.ResourceContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#resource}.
     *
     * @param ctx the parse tree
     */
    void exitResource(java8Parser.ResourceContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#primary}.
     *
     * @param ctx the parse tree
     */
    void enterPrimary(java8Parser.PrimaryContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#primary}.
     *
     * @param ctx the parse tree
     */
    void exitPrimary(java8Parser.PrimaryContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#primaryNoNewArray}.
     *
     * @param ctx the parse tree
     */
    void enterPrimaryNoNewArray(java8Parser.PrimaryNoNewArrayContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#primaryNoNewArray}.
     *
     * @param ctx the parse tree
     */
    void exitPrimaryNoNewArray(java8Parser.PrimaryNoNewArrayContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#primaryNoNewArray_lf_arrayAccess}.
     *
     * @param ctx the parse tree
     */
    void enterPrimaryNoNewArray_lf_arrayAccess(java8Parser.PrimaryNoNewArray_lf_arrayAccessContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#primaryNoNewArray_lf_arrayAccess}.
     *
     * @param ctx the parse tree
     */
    void exitPrimaryNoNewArray_lf_arrayAccess(java8Parser.PrimaryNoNewArray_lf_arrayAccessContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#primaryNoNewArray_lfno_arrayAccess}.
     *
     * @param ctx the parse tree
     */
    void enterPrimaryNoNewArray_lfno_arrayAccess(java8Parser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#primaryNoNewArray_lfno_arrayAccess}.
     *
     * @param ctx the parse tree
     */
    void exitPrimaryNoNewArray_lfno_arrayAccess(java8Parser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#primaryNoNewArray_lf_primary}.
     *
     * @param ctx the parse tree
     */
    void enterPrimaryNoNewArray_lf_primary(java8Parser.PrimaryNoNewArray_lf_primaryContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#primaryNoNewArray_lf_primary}.
     *
     * @param ctx the parse tree
     */
    void exitPrimaryNoNewArray_lf_primary(java8Parser.PrimaryNoNewArray_lf_primaryContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
     *
     * @param ctx the parse tree
     */
    void enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(java8Parser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
     *
     * @param ctx the parse tree
     */
    void exitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(java8Parser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
     *
     * @param ctx the parse tree
     */
    void enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(java8Parser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
     *
     * @param ctx the parse tree
     */
    void exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(java8Parser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#primaryNoNewArray_lfno_primary}.
     *
     * @param ctx the parse tree
     */
    void enterPrimaryNoNewArray_lfno_primary(java8Parser.PrimaryNoNewArray_lfno_primaryContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#primaryNoNewArray_lfno_primary}.
     *
     * @param ctx the parse tree
     */
    void exitPrimaryNoNewArray_lfno_primary(java8Parser.PrimaryNoNewArray_lfno_primaryContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
     *
     * @param ctx the parse tree
     */
    void enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(java8Parser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
     *
     * @param ctx the parse tree
     */
    void exitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(java8Parser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
     *
     * @param ctx the parse tree
     */
    void enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(java8Parser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
     *
     * @param ctx the parse tree
     */
    void exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(java8Parser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#classInstanceCreationExpression}.
     *
     * @param ctx the parse tree
     */
    void enterClassInstanceCreationExpression(java8Parser.ClassInstanceCreationExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#classInstanceCreationExpression}.
     *
     * @param ctx the parse tree
     */
    void exitClassInstanceCreationExpression(java8Parser.ClassInstanceCreationExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#classInstanceCreationExpression_lf_primary}.
     *
     * @param ctx the parse tree
     */
    void enterClassInstanceCreationExpression_lf_primary(java8Parser.ClassInstanceCreationExpression_lf_primaryContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#classInstanceCreationExpression_lf_primary}.
     *
     * @param ctx the parse tree
     */
    void exitClassInstanceCreationExpression_lf_primary(java8Parser.ClassInstanceCreationExpression_lf_primaryContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#classInstanceCreationExpression_lfno_primary}.
     *
     * @param ctx the parse tree
     */
    void enterClassInstanceCreationExpression_lfno_primary(java8Parser.ClassInstanceCreationExpression_lfno_primaryContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#classInstanceCreationExpression_lfno_primary}.
     *
     * @param ctx the parse tree
     */
    void exitClassInstanceCreationExpression_lfno_primary(java8Parser.ClassInstanceCreationExpression_lfno_primaryContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#typeArgumentsOrDiamond}.
     *
     * @param ctx the parse tree
     */
    void enterTypeArgumentsOrDiamond(java8Parser.TypeArgumentsOrDiamondContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#typeArgumentsOrDiamond}.
     *
     * @param ctx the parse tree
     */
    void exitTypeArgumentsOrDiamond(java8Parser.TypeArgumentsOrDiamondContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#fieldAccess}.
     *
     * @param ctx the parse tree
     */
    void enterFieldAccess(java8Parser.FieldAccessContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#fieldAccess}.
     *
     * @param ctx the parse tree
     */
    void exitFieldAccess(java8Parser.FieldAccessContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#fieldAccess_lf_primary}.
     *
     * @param ctx the parse tree
     */
    void enterFieldAccess_lf_primary(java8Parser.FieldAccess_lf_primaryContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#fieldAccess_lf_primary}.
     *
     * @param ctx the parse tree
     */
    void exitFieldAccess_lf_primary(java8Parser.FieldAccess_lf_primaryContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#fieldAccess_lfno_primary}.
     *
     * @param ctx the parse tree
     */
    void enterFieldAccess_lfno_primary(java8Parser.FieldAccess_lfno_primaryContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#fieldAccess_lfno_primary}.
     *
     * @param ctx the parse tree
     */
    void exitFieldAccess_lfno_primary(java8Parser.FieldAccess_lfno_primaryContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#arrayAccess}.
     *
     * @param ctx the parse tree
     */
    void enterArrayAccess(java8Parser.ArrayAccessContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#arrayAccess}.
     *
     * @param ctx the parse tree
     */
    void exitArrayAccess(java8Parser.ArrayAccessContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#arrayAccess_lf_primary}.
     *
     * @param ctx the parse tree
     */
    void enterArrayAccess_lf_primary(java8Parser.ArrayAccess_lf_primaryContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#arrayAccess_lf_primary}.
     *
     * @param ctx the parse tree
     */
    void exitArrayAccess_lf_primary(java8Parser.ArrayAccess_lf_primaryContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#arrayAccess_lfno_primary}.
     *
     * @param ctx the parse tree
     */
    void enterArrayAccess_lfno_primary(java8Parser.ArrayAccess_lfno_primaryContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#arrayAccess_lfno_primary}.
     *
     * @param ctx the parse tree
     */
    void exitArrayAccess_lfno_primary(java8Parser.ArrayAccess_lfno_primaryContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#methodInvocation}.
     *
     * @param ctx the parse tree
     */
    void enterMethodInvocation(java8Parser.MethodInvocationContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#methodInvocation}.
     *
     * @param ctx the parse tree
     */
    void exitMethodInvocation(java8Parser.MethodInvocationContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#methodInvocation_lf_primary}.
     *
     * @param ctx the parse tree
     */
    void enterMethodInvocation_lf_primary(java8Parser.MethodInvocation_lf_primaryContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#methodInvocation_lf_primary}.
     *
     * @param ctx the parse tree
     */
    void exitMethodInvocation_lf_primary(java8Parser.MethodInvocation_lf_primaryContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#methodInvocation_lfno_primary}.
     *
     * @param ctx the parse tree
     */
    void enterMethodInvocation_lfno_primary(java8Parser.MethodInvocation_lfno_primaryContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#methodInvocation_lfno_primary}.
     *
     * @param ctx the parse tree
     */
    void exitMethodInvocation_lfno_primary(java8Parser.MethodInvocation_lfno_primaryContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#argumentList}.
     *
     * @param ctx the parse tree
     */
    void enterArgumentList(java8Parser.ArgumentListContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#argumentList}.
     *
     * @param ctx the parse tree
     */
    void exitArgumentList(java8Parser.ArgumentListContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#methodReference}.
     *
     * @param ctx the parse tree
     */
    void enterMethodReference(java8Parser.MethodReferenceContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#methodReference}.
     *
     * @param ctx the parse tree
     */
    void exitMethodReference(java8Parser.MethodReferenceContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#methodReference_lf_primary}.
     *
     * @param ctx the parse tree
     */
    void enterMethodReference_lf_primary(java8Parser.MethodReference_lf_primaryContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#methodReference_lf_primary}.
     *
     * @param ctx the parse tree
     */
    void exitMethodReference_lf_primary(java8Parser.MethodReference_lf_primaryContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#methodReference_lfno_primary}.
     *
     * @param ctx the parse tree
     */
    void enterMethodReference_lfno_primary(java8Parser.MethodReference_lfno_primaryContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#methodReference_lfno_primary}.
     *
     * @param ctx the parse tree
     */
    void exitMethodReference_lfno_primary(java8Parser.MethodReference_lfno_primaryContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#arrayCreationExpression}.
     *
     * @param ctx the parse tree
     */
    void enterArrayCreationExpression(java8Parser.ArrayCreationExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#arrayCreationExpression}.
     *
     * @param ctx the parse tree
     */
    void exitArrayCreationExpression(java8Parser.ArrayCreationExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#dimExprs}.
     *
     * @param ctx the parse tree
     */
    void enterDimExprs(java8Parser.DimExprsContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#dimExprs}.
     *
     * @param ctx the parse tree
     */
    void exitDimExprs(java8Parser.DimExprsContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#dimExpr}.
     *
     * @param ctx the parse tree
     */
    void enterDimExpr(java8Parser.DimExprContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#dimExpr}.
     *
     * @param ctx the parse tree
     */
    void exitDimExpr(java8Parser.DimExprContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#constantExpression}.
     *
     * @param ctx the parse tree
     */
    void enterConstantExpression(java8Parser.ConstantExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#constantExpression}.
     *
     * @param ctx the parse tree
     */
    void exitConstantExpression(java8Parser.ConstantExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterExpression(java8Parser.ExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitExpression(java8Parser.ExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#lambdaExpression}.
     *
     * @param ctx the parse tree
     */
    void enterLambdaExpression(java8Parser.LambdaExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#lambdaExpression}.
     *
     * @param ctx the parse tree
     */
    void exitLambdaExpression(java8Parser.LambdaExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#lambdaParameters}.
     *
     * @param ctx the parse tree
     */
    void enterLambdaParameters(java8Parser.LambdaParametersContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#lambdaParameters}.
     *
     * @param ctx the parse tree
     */
    void exitLambdaParameters(java8Parser.LambdaParametersContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#inferredFormalParameterList}.
     *
     * @param ctx the parse tree
     */
    void enterInferredFormalParameterList(java8Parser.InferredFormalParameterListContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#inferredFormalParameterList}.
     *
     * @param ctx the parse tree
     */
    void exitInferredFormalParameterList(java8Parser.InferredFormalParameterListContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#lambdaBody}.
     *
     * @param ctx the parse tree
     */
    void enterLambdaBody(java8Parser.LambdaBodyContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#lambdaBody}.
     *
     * @param ctx the parse tree
     */
    void exitLambdaBody(java8Parser.LambdaBodyContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#assignmentExpression}.
     *
     * @param ctx the parse tree
     */
    void enterAssignmentExpression(java8Parser.AssignmentExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#assignmentExpression}.
     *
     * @param ctx the parse tree
     */
    void exitAssignmentExpression(java8Parser.AssignmentExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#assignment}.
     *
     * @param ctx the parse tree
     */
    void enterAssignment(java8Parser.AssignmentContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#assignment}.
     *
     * @param ctx the parse tree
     */
    void exitAssignment(java8Parser.AssignmentContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#leftHandSide}.
     *
     * @param ctx the parse tree
     */
    void enterLeftHandSide(java8Parser.LeftHandSideContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#leftHandSide}.
     *
     * @param ctx the parse tree
     */
    void exitLeftHandSide(java8Parser.LeftHandSideContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#assignmentOperator}.
     *
     * @param ctx the parse tree
     */
    void enterAssignmentOperator(java8Parser.AssignmentOperatorContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#assignmentOperator}.
     *
     * @param ctx the parse tree
     */
    void exitAssignmentOperator(java8Parser.AssignmentOperatorContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#conditionalExpression}.
     *
     * @param ctx the parse tree
     */
    void enterConditionalExpression(java8Parser.ConditionalExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#conditionalExpression}.
     *
     * @param ctx the parse tree
     */
    void exitConditionalExpression(java8Parser.ConditionalExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#conditionalOrExpression}.
     *
     * @param ctx the parse tree
     */
    void enterConditionalOrExpression(java8Parser.ConditionalOrExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#conditionalOrExpression}.
     *
     * @param ctx the parse tree
     */
    void exitConditionalOrExpression(java8Parser.ConditionalOrExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#conditionalAndExpression}.
     *
     * @param ctx the parse tree
     */
    void enterConditionalAndExpression(java8Parser.ConditionalAndExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#conditionalAndExpression}.
     *
     * @param ctx the parse tree
     */
    void exitConditionalAndExpression(java8Parser.ConditionalAndExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#inclusiveOrExpression}.
     *
     * @param ctx the parse tree
     */
    void enterInclusiveOrExpression(java8Parser.InclusiveOrExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#inclusiveOrExpression}.
     *
     * @param ctx the parse tree
     */
    void exitInclusiveOrExpression(java8Parser.InclusiveOrExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#exclusiveOrExpression}.
     *
     * @param ctx the parse tree
     */
    void enterExclusiveOrExpression(java8Parser.ExclusiveOrExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#exclusiveOrExpression}.
     *
     * @param ctx the parse tree
     */
    void exitExclusiveOrExpression(java8Parser.ExclusiveOrExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#andExpression}.
     *
     * @param ctx the parse tree
     */
    void enterAndExpression(java8Parser.AndExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#andExpression}.
     *
     * @param ctx the parse tree
     */
    void exitAndExpression(java8Parser.AndExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#equalityExpression}.
     *
     * @param ctx the parse tree
     */
    void enterEqualityExpression(java8Parser.EqualityExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#equalityExpression}.
     *
     * @param ctx the parse tree
     */
    void exitEqualityExpression(java8Parser.EqualityExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#relationalExpression}.
     *
     * @param ctx the parse tree
     */
    void enterRelationalExpression(java8Parser.RelationalExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#relationalExpression}.
     *
     * @param ctx the parse tree
     */
    void exitRelationalExpression(java8Parser.RelationalExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#shiftExpression}.
     *
     * @param ctx the parse tree
     */
    void enterShiftExpression(java8Parser.ShiftExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#shiftExpression}.
     *
     * @param ctx the parse tree
     */
    void exitShiftExpression(java8Parser.ShiftExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#additiveExpression}.
     *
     * @param ctx the parse tree
     */
    void enterAdditiveExpression(java8Parser.AdditiveExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#additiveExpression}.
     *
     * @param ctx the parse tree
     */
    void exitAdditiveExpression(java8Parser.AdditiveExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#multiplicativeExpression}.
     *
     * @param ctx the parse tree
     */
    void enterMultiplicativeExpression(java8Parser.MultiplicativeExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#multiplicativeExpression}.
     *
     * @param ctx the parse tree
     */
    void exitMultiplicativeExpression(java8Parser.MultiplicativeExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#unaryExpression}.
     *
     * @param ctx the parse tree
     */
    void enterUnaryExpression(java8Parser.UnaryExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#unaryExpression}.
     *
     * @param ctx the parse tree
     */
    void exitUnaryExpression(java8Parser.UnaryExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#preIncrementExpression}.
     *
     * @param ctx the parse tree
     */
    void enterPreIncrementExpression(java8Parser.PreIncrementExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#preIncrementExpression}.
     *
     * @param ctx the parse tree
     */
    void exitPreIncrementExpression(java8Parser.PreIncrementExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#preDecrementExpression}.
     *
     * @param ctx the parse tree
     */
    void enterPreDecrementExpression(java8Parser.PreDecrementExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#preDecrementExpression}.
     *
     * @param ctx the parse tree
     */
    void exitPreDecrementExpression(java8Parser.PreDecrementExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#unaryExpressionNotPlusMinus}.
     *
     * @param ctx the parse tree
     */
    void enterUnaryExpressionNotPlusMinus(java8Parser.UnaryExpressionNotPlusMinusContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#unaryExpressionNotPlusMinus}.
     *
     * @param ctx the parse tree
     */
    void exitUnaryExpressionNotPlusMinus(java8Parser.UnaryExpressionNotPlusMinusContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#postfixExpression}.
     *
     * @param ctx the parse tree
     */
    void enterPostfixExpression(java8Parser.PostfixExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#postfixExpression}.
     *
     * @param ctx the parse tree
     */
    void exitPostfixExpression(java8Parser.PostfixExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#postIncrementExpression}.
     *
     * @param ctx the parse tree
     */
    void enterPostIncrementExpression(java8Parser.PostIncrementExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#postIncrementExpression}.
     *
     * @param ctx the parse tree
     */
    void exitPostIncrementExpression(java8Parser.PostIncrementExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#postIncrementExpression_lf_postfixExpression}.
     *
     * @param ctx the parse tree
     */
    void enterPostIncrementExpression_lf_postfixExpression(java8Parser.PostIncrementExpression_lf_postfixExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#postIncrementExpression_lf_postfixExpression}.
     *
     * @param ctx the parse tree
     */
    void exitPostIncrementExpression_lf_postfixExpression(java8Parser.PostIncrementExpression_lf_postfixExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#postDecrementExpression}.
     *
     * @param ctx the parse tree
     */
    void enterPostDecrementExpression(java8Parser.PostDecrementExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#postDecrementExpression}.
     *
     * @param ctx the parse tree
     */
    void exitPostDecrementExpression(java8Parser.PostDecrementExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#postDecrementExpression_lf_postfixExpression}.
     *
     * @param ctx the parse tree
     */
    void enterPostDecrementExpression_lf_postfixExpression(java8Parser.PostDecrementExpression_lf_postfixExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#postDecrementExpression_lf_postfixExpression}.
     *
     * @param ctx the parse tree
     */
    void exitPostDecrementExpression_lf_postfixExpression(java8Parser.PostDecrementExpression_lf_postfixExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link java8Parser#castExpression}.
     *
     * @param ctx the parse tree
     */
    void enterCastExpression(java8Parser.CastExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link java8Parser#castExpression}.
     *
     * @param ctx the parse tree
     */
    void exitCastExpression(java8Parser.CastExpressionContext ctx);
}
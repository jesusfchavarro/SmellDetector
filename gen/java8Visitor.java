// Generated from /home/jesus/Documents/Lenguajes de programacion/SmellDetector/grammar/java8.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link java8Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface java8Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link java8Parser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(java8Parser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(java8Parser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(java8Parser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#numericType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericType(java8Parser.NumericTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#integralType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegralType(java8Parser.IntegralTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#floatingPointType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatingPointType(java8Parser.FloatingPointTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#referenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceType(java8Parser.ReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(java8Parser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(java8Parser.ClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType_lf_classOrInterfaceType(java8Parser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType_lfno_classOrInterfaceType(java8Parser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#interfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType(java8Parser.InterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType_lf_classOrInterfaceType(java8Parser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType_lfno_classOrInterfaceType(java8Parser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#typeVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeVariable(java8Parser.TypeVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(java8Parser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#dims}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDims(java8Parser.DimsContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(java8Parser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#typeParameterModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterModifier(java8Parser.TypeParameterModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(java8Parser.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#additionalBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionalBound(java8Parser.AdditionalBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(java8Parser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#typeArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentList(java8Parser.TypeArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(java8Parser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#wildcard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcard(java8Parser.WildcardContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#wildcardBounds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcardBounds(java8Parser.WildcardBoundsContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#packageName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageName(java8Parser.PackageNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(java8Parser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#packageOrTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageOrTypeName(java8Parser.PackageOrTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#expressionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionName(java8Parser.ExpressionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#methodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodName(java8Parser.MethodNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#ambiguousName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmbiguousName(java8Parser.AmbiguousNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(java8Parser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(java8Parser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#packageModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageModifier(java8Parser.PackageModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(java8Parser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTypeImportDeclaration(java8Parser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeImportOnDemandDeclaration(java8Parser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStaticImportDeclaration(java8Parser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticImportOnDemandDeclaration(java8Parser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(java8Parser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(java8Parser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalClassDeclaration(java8Parser.NormalClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#classModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassModifier(java8Parser.ClassModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(java8Parser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#typeParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterList(java8Parser.TypeParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#superclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperclass(java8Parser.SuperclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#superinterfaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperinterfaces(java8Parser.SuperinterfacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#interfaceTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceTypeList(java8Parser.InterfaceTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(java8Parser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(java8Parser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMemberDeclaration(java8Parser.ClassMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(java8Parser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#fieldModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldModifier(java8Parser.FieldModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorList(java8Parser.VariableDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(java8Parser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(java8Parser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(java8Parser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#unannType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannType(java8Parser.UnannTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannPrimitiveType(java8Parser.UnannPrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#unannReferenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannReferenceType(java8Parser.UnannReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassOrInterfaceType(java8Parser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#unannClassType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType(java8Parser.UnannClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType_lf_unannClassOrInterfaceType(java8Parser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType_lfno_unannClassOrInterfaceType(java8Parser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#unannInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType(java8Parser.UnannInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType_lf_unannClassOrInterfaceType(java8Parser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType_lfno_unannClassOrInterfaceType(java8Parser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#unannTypeVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannTypeVariable(java8Parser.UnannTypeVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#unannArrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannArrayType(java8Parser.UnannArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(java8Parser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#methodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodModifier(java8Parser.MethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#methodHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodHeader(java8Parser.MethodHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult(java8Parser.ResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#methodDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclarator(java8Parser.MethodDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(java8Parser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(java8Parser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(java8Parser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(java8Parser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(java8Parser.LastFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#receiverParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiverParameter(java8Parser.ReceiverParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#throws_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrows_(java8Parser.Throws_Context ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#exceptionTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionTypeList(java8Parser.ExceptionTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#exceptionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionType(java8Parser.ExceptionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(java8Parser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#instanceInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceInitializer(java8Parser.InstanceInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#staticInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticInitializer(java8Parser.StaticInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(java8Parser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#constructorModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorModifier(java8Parser.ConstructorModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#constructorDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclarator(java8Parser.ConstructorDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#simpleTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTypeName(java8Parser.SimpleTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#constructorBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorBody(java8Parser.ConstructorBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitConstructorInvocation(java8Parser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(java8Parser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#enumBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBody(java8Parser.EnumBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#enumConstantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantList(java8Parser.EnumConstantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(java8Parser.EnumConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#enumConstantModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantModifier(java8Parser.EnumConstantModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBodyDeclarations(java8Parser.EnumBodyDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(java8Parser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalInterfaceDeclaration(java8Parser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#interfaceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceModifier(java8Parser.InterfaceModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#extendsInterfaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendsInterfaces(java8Parser.ExtendsInterfacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(java8Parser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration(java8Parser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#constantDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclaration(java8Parser.ConstantDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#constantModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantModifier(java8Parser.ConstantModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaration(java8Parser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodModifier(java8Parser.InterfaceMethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeDeclaration(java8Parser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#annotationTypeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeBody(java8Parser.AnnotationTypeBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeMemberDeclaration(java8Parser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementDeclaration(java8Parser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementModifier(java8Parser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(java8Parser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(java8Parser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#normalAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalAnnotation(java8Parser.NormalAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#elementValuePairList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairList(java8Parser.ElementValuePairListContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(java8Parser.ElementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(java8Parser.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(java8Parser.ElementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#elementValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueList(java8Parser.ElementValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#markerAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMarkerAnnotation(java8Parser.MarkerAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleElementAnnotation(java8Parser.SingleElementAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(java8Parser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#variableInitializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializerList(java8Parser.VariableInitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(java8Parser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#blockStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatements(java8Parser.BlockStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(java8Parser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclarationStatement(java8Parser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(java8Parser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(java8Parser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#statementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementNoShortIf(java8Parser.StatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWithoutTrailingSubstatement(java8Parser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(java8Parser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(java8Parser.LabeledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatementNoShortIf(java8Parser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(java8Parser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression(java8Parser.StatementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#ifThenStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenStatement(java8Parser.IfThenStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseStatement(java8Parser.IfThenElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseStatementNoShortIf(java8Parser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#assertStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertStatement(java8Parser.AssertStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(java8Parser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#switchBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlock(java8Parser.SwitchBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(java8Parser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#switchLabels}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabels(java8Parser.SwitchLabelsContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(java8Parser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#enumConstantName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantName(java8Parser.EnumConstantNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(java8Parser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatementNoShortIf(java8Parser.WhileStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#doStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStatement(java8Parser.DoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(java8Parser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatementNoShortIf(java8Parser.ForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#basicForStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicForStatement(java8Parser.BasicForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicForStatementNoShortIf(java8Parser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(java8Parser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(java8Parser.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#statementExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpressionList(java8Parser.StatementExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#enhancedForStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForStatement(java8Parser.EnhancedForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForStatementNoShortIf(java8Parser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(java8Parser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(java8Parser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(java8Parser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#throwStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStatement(java8Parser.ThrowStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#synchronizedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynchronizedStatement(java8Parser.SynchronizedStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#tryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryStatement(java8Parser.TryStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#catches}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatches(java8Parser.CatchesContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(java8Parser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#catchFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchFormalParameter(java8Parser.CatchFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#catchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchType(java8Parser.CatchTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#finally_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinally_(java8Parser.Finally_Context ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryWithResourcesStatement(java8Parser.TryWithResourcesStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#resourceSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceSpecification(java8Parser.ResourceSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#resourceList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceList(java8Parser.ResourceListContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(java8Parser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(java8Parser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray(java8Parser.PrimaryNoNewArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_arrayAccess(java8Parser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_arrayAccess(java8Parser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary(java8Parser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(java8Parser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(java8Parser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary(java8Parser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(java8Parser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(java8Parser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression(java8Parser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression_lf_primary(java8Parser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression_lfno_primary(java8Parser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond(java8Parser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#fieldAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess(java8Parser.FieldAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess_lf_primary(java8Parser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess_lfno_primary(java8Parser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(java8Parser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess_lf_primary(java8Parser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess_lfno_primary(java8Parser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#methodInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation(java8Parser.MethodInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation_lf_primary(java8Parser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation_lfno_primary(java8Parser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(java8Parser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#methodReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference(java8Parser.MethodReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference_lf_primary(java8Parser.MethodReference_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference_lfno_primary(java8Parser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreationExpression(java8Parser.ArrayCreationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#dimExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimExprs(java8Parser.DimExprsContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#dimExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimExpr(java8Parser.DimExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(java8Parser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(java8Parser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(java8Parser.LambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameters(java8Parser.LambdaParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInferredFormalParameterList(java8Parser.InferredFormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#lambdaBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaBody(java8Parser.LambdaBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(java8Parser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(java8Parser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#leftHandSide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftHandSide(java8Parser.LeftHandSideContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(java8Parser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(java8Parser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalOrExpression(java8Parser.ConditionalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalAndExpression(java8Parser.ConditionalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression(java8Parser.InclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression(java8Parser.ExclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(java8Parser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(java8Parser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(java8Parser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(java8Parser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(java8Parser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(java8Parser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(java8Parser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#preIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreIncrementExpression(java8Parser.PreIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#preDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreDecrementExpression(java8Parser.PreDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionNotPlusMinus(java8Parser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(java8Parser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#postIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression(java8Parser.PostIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression_lf_postfixExpression(java8Parser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#postDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression(java8Parser.PostDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression_lf_postfixExpression(java8Parser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link java8Parser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(java8Parser.CastExpressionContext ctx);
}
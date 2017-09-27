package fr.lteconsulting.jsinterop.ng.compiler.output;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.PropertyKey_UnionOfNumberAndString;
import fr.lteconsulting.jsinterop.ng.compiler.ParseSourceSpan;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast".Expression
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts:2403
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.output", name="Expression")
public class Expression
{

    /*
        Constructors
    */
    public Expression(Type type, ParseSourceSpan sourceSpan){
    }

    /*
        Properties
    */

    public ParseSourceSpan sourceSpan;

    @JsProperty( name = "sourceSpan")
    public native ParseSourceSpan getSourceSpan();

    @JsProperty( name = "sourceSpan")
    public native void setSourceSpan( ParseSourceSpan value );

    public Type type;

    @JsProperty( name = "type")
    public native Type getType();

    @JsProperty( name = "type")
    public native void setType( Type value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(and,478,,P(d449))
      * TE Signature : S(and,P(d449))
      * 
     */
    public native BinaryOperatorExpr and(Expression rhs);
    /** 
      * Std Signature : S(and,478,,P(d449),P(d441))
      * TE Signature : S(and,P(d449),P(d441))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts@4085
     */
    public native BinaryOperatorExpr and(Expression rhs, ParseSourceSpan sourceSpan /* optional */);
    /** 
      * Std Signature : S(bigger,478,,P(d449))
      * TE Signature : S(bigger,P(d449))
      * 
     */
    public native BinaryOperatorExpr bigger(Expression rhs);
    /** 
      * Std Signature : S(bigger,478,,P(d449),P(d441))
      * TE Signature : S(bigger,P(d449),P(d441))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts@4426
     */
    public native BinaryOperatorExpr bigger(Expression rhs, ParseSourceSpan sourceSpan /* optional */);
    /** 
      * Std Signature : S(biggerEquals,478,,P(d449))
      * TE Signature : S(biggerEquals,P(d449))
      * 
     */
    public native BinaryOperatorExpr biggerEquals(Expression rhs);
    /** 
      * Std Signature : S(biggerEquals,478,,P(d449),P(d441))
      * TE Signature : S(biggerEquals,P(d449),P(d441))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts@4512
     */
    public native BinaryOperatorExpr biggerEquals(Expression rhs, ParseSourceSpan sourceSpan /* optional */);
    /** 
      * Std Signature : S(callFn,467,,P(d7<449>))
      * TE Signature : S(callFn,P(d7))
      * 
     */
    public native InvokeFunctionExpr callFn(Array<Expression> params);
    /** 
      * Std Signature : S(callFn,467,,P(d7<449>),P(d441))
      * TE Signature : S(callFn,P(d7),P(d441))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts@2972
     */
    public native InvokeFunctionExpr callFn(Array<Expression> params, ParseSourceSpan sourceSpan /* optional */);
    /** 
      * Std Signature : S(callMethod,466,,P(d1),P(d7<449>))
      * TE Signature : S(callMethod,P(d1),P(d7))
      * 
     */
    public native InvokeMethodExpr callMethod(String name, Array<Expression> params);
    /** 
      * Std Signature : S(callMethod,466,,P(d1),P(d7<449>),P(d441))
      * TE Signature : S(callMethod,P(d1),P(d7),P(d441))
      * 
     */
    public native InvokeMethodExpr callMethod(String name, Array<Expression> params, ParseSourceSpan sourceSpan /* optional */);
    /** 
      * Std Signature : S(callMethod,466,,P(d2),P(d7<449>))
      * TE Signature : S(callMethod,P(d2),P(d7))
      * 
     */
    public native InvokeMethodExpr callMethod(Number name, Array<Expression> params);
    /** 
      * Std Signature : S(callMethod,466,,P(d2),P(d7<449>),P(d441))
      * TE Signature : S(callMethod,P(d2),P(d7),P(d441))
      * 
     */
    public native InvokeMethodExpr callMethod(Number name, Array<Expression> params, ParseSourceSpan sourceSpan /* optional */);
    /** 
      * Std Signature : S(callMethod,466,,P(dU(-2,1)),P(d7<449>))
      * TE Signature : S(callMethod,P(dU(-2,1)),P(d7))
      * 
     */
    public native InvokeMethodExpr callMethod(PropertyKey_UnionOfNumberAndString name, Array<Expression> params);
    /** 
      * Std Signature : S(callMethod,466,,P(dU(-2,1)),P(d7<449>),P(d441))
      * TE Signature : S(callMethod,P(dU(-2,1)),P(d7),P(d441))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts@2849
     */
    public native InvokeMethodExpr callMethod(PropertyKey_UnionOfNumberAndString name, Array<Expression> params, ParseSourceSpan sourceSpan /* optional */);
    /** 
      * Std Signature : S(cast,449,,P(d447))
      * TE Signature : S(cast,P(d447))
      * 
     */
    public native Expression cast(Type type);
    /** 
      * Std Signature : S(cast,449,,P(d447),P(d441))
      * TE Signature : S(cast,P(d447),P(d441))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts@4666
     */
    public native Expression cast(Type type, ParseSourceSpan sourceSpan /* optional */);
    /** 
      * Std Signature : S(conditional,472,,P(d449))
      * TE Signature : S(conditional,P(d449))
      * 
     */
    public native ConditionalExpr conditional(Expression trueCase);
    /** 
      * Std Signature : S(conditional,472,,P(d449),P(d449))
      * TE Signature : S(conditional,P(d449),P(d449))
      * 
     */
    public native ConditionalExpr conditional(Expression trueCase, Expression falseCase /* optional */);
    /** 
      * Std Signature : S(conditional,472,,P(d449),P(d449),P(d441))
      * TE Signature : S(conditional,P(d449),P(d449),P(d441))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts@3176
     */
    public native ConditionalExpr conditional(Expression trueCase, Expression falseCase /* optional */, ParseSourceSpan sourceSpan /* optional */);
    /** 
      * Std Signature : S(divide,478,,P(d449))
      * TE Signature : S(divide,P(d449))
      * 
     */
    public native BinaryOperatorExpr divide(Expression rhs);
    /** 
      * Std Signature : S(divide,478,,P(d449),P(d441))
      * TE Signature : S(divide,P(d449),P(d441))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts@3825
     */
    public native BinaryOperatorExpr divide(Expression rhs, ParseSourceSpan sourceSpan /* optional */);
    /** 
      * Std Signature : S(equals,478,,P(d449))
      * TE Signature : S(equals,P(d449))
      * 
     */
    public native BinaryOperatorExpr equals(Expression rhs);
    /** 
      * Std Signature : S(equals,478,,P(d449),P(d441))
      * TE Signature : S(equals,P(d449),P(d441))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts@3300
     */
    public native BinaryOperatorExpr equals(Expression rhs, ParseSourceSpan sourceSpan /* optional */);
    /** 
      * Std Signature : S(identical,478,,P(d449))
      * TE Signature : S(identical,P(d449))
      * 
     */
    public native BinaryOperatorExpr identical(Expression rhs);
    /** 
      * Std Signature : S(identical,478,,P(d449),P(d441))
      * TE Signature : S(identical,P(d449),P(d441))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts@3475
     */
    public native BinaryOperatorExpr identical(Expression rhs, ParseSourceSpan sourceSpan /* optional */);
    /** 
      * Std Signature : S(instantiate,468,,P(d7<449>))
      * TE Signature : S(instantiate,P(d7))
      * 
     */
    public native InstantiateExpr instantiate(Array<Expression> params);
    /** 
      * Std Signature : S(instantiate,468,,P(d7<449>),P(d447))
      * TE Signature : S(instantiate,P(d7),P(d447))
      * 
     */
    public native InstantiateExpr instantiate(Array<Expression> params, Type type /* optional */);
    /** 
      * Std Signature : S(instantiate,468,,P(d7<449>),P(d447),P(d441))
      * TE Signature : S(instantiate,P(d7),P(d447),P(d441))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts@3063
     */
    public native InstantiateExpr instantiate(Array<Expression> params, Type type /* optional */, ParseSourceSpan sourceSpan /* optional */);
    /** 
      * Std Signature : S(isBlank,449,,)
      * TE Signature : S(isBlank,)
      * 
     */
    public native Expression isBlank();
    /** 
      * Std Signature : S(isBlank,449,,P(d441))
      * TE Signature : S(isBlank,P(d441))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts@4604
     */
    public native Expression isBlank(ParseSourceSpan sourceSpan /* optional */);
    /** 
      * Std Signature : S(key,480,,P(d449))
      * TE Signature : S(key,P(d449))
      * 
     */
    public native ReadKeyExpr key(Expression index);
    /** 
      * Std Signature : S(key,480,,P(d449),P(d447))
      * TE Signature : S(key,P(d449),P(d447))
      * 
     */
    public native ReadKeyExpr key(Expression index, Type type /* optional */);
    /** 
      * Std Signature : S(key,480,,P(d449),P(d447),P(d441))
      * TE Signature : S(key,P(d449),P(d447),P(d441))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts@2751
     */
    public native ReadKeyExpr key(Expression index, Type type /* optional */, ParseSourceSpan sourceSpan /* optional */);
    /** 
      * Std Signature : S(lower,478,,P(d449))
      * TE Signature : S(lower,P(d449))
      * 
     */
    public native BinaryOperatorExpr lower(Expression rhs);
    /** 
      * Std Signature : S(lower,478,,P(d449),P(d441))
      * TE Signature : S(lower,P(d449),P(d441))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts@4250
     */
    public native BinaryOperatorExpr lower(Expression rhs, ParseSourceSpan sourceSpan /* optional */);
    /** 
      * Std Signature : S(lowerEquals,478,,P(d449))
      * TE Signature : S(lowerEquals,P(d449))
      * 
     */
    public native BinaryOperatorExpr lowerEquals(Expression rhs);
    /** 
      * Std Signature : S(lowerEquals,478,,P(d449),P(d441))
      * TE Signature : S(lowerEquals,P(d449),P(d441))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts@4335
     */
    public native BinaryOperatorExpr lowerEquals(Expression rhs, ParseSourceSpan sourceSpan /* optional */);
    /** 
      * Std Signature : S(minus,478,,P(d449))
      * TE Signature : S(minus,P(d449))
      * 
     */
    public native BinaryOperatorExpr minus(Expression rhs);
    /** 
      * Std Signature : S(minus,478,,P(d449),P(d441))
      * TE Signature : S(minus,P(d449),P(d441))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts@3656
     */
    public native BinaryOperatorExpr minus(Expression rhs, ParseSourceSpan sourceSpan /* optional */);
    /** 
      * Std Signature : S(modulo,478,,P(d449))
      * TE Signature : S(modulo,P(d449))
      * 
     */
    public native BinaryOperatorExpr modulo(Expression rhs);
    /** 
      * Std Signature : S(modulo,478,,P(d449),P(d441))
      * TE Signature : S(modulo,P(d449),P(d441))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts@3999
     */
    public native BinaryOperatorExpr modulo(Expression rhs, ParseSourceSpan sourceSpan /* optional */);
    /** 
      * Std Signature : S(multiply,478,,P(d449))
      * TE Signature : S(multiply,P(d449))
      * 
     */
    public native BinaryOperatorExpr multiply(Expression rhs);
    /** 
      * Std Signature : S(multiply,478,,P(d449),P(d441))
      * TE Signature : S(multiply,P(d449),P(d441))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts@3911
     */
    public native BinaryOperatorExpr multiply(Expression rhs, ParseSourceSpan sourceSpan /* optional */);
    /** 
      * Std Signature : S(notEquals,478,,P(d449))
      * TE Signature : S(notEquals,P(d449))
      * 
     */
    public native BinaryOperatorExpr notEquals(Expression rhs);
    /** 
      * Std Signature : S(notEquals,478,,P(d449),P(d441))
      * TE Signature : S(notEquals,P(d449),P(d441))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts@3386
     */
    public native BinaryOperatorExpr notEquals(Expression rhs, ParseSourceSpan sourceSpan /* optional */);
    /** 
      * Std Signature : S(notIdentical,478,,P(d449))
      * TE Signature : S(notIdentical,P(d449))
      * 
     */
    public native BinaryOperatorExpr notIdentical(Expression rhs);
    /** 
      * Std Signature : S(notIdentical,478,,P(d449),P(d441))
      * TE Signature : S(notIdentical,P(d449),P(d441))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts@3564
     */
    public native BinaryOperatorExpr notIdentical(Expression rhs, ParseSourceSpan sourceSpan /* optional */);
    /** 
      * Std Signature : S(or,478,,P(d449))
      * TE Signature : S(or,P(d449))
      * 
     */
    public native BinaryOperatorExpr or(Expression rhs);
    /** 
      * Std Signature : S(or,478,,P(d449),P(d441))
      * TE Signature : S(or,P(d449),P(d441))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts@4168
     */
    public native BinaryOperatorExpr or(Expression rhs, ParseSourceSpan sourceSpan /* optional */);
    /** 
      * Std Signature : S(plus,478,,P(d449))
      * TE Signature : S(plus,P(d449))
      * 
     */
    public native BinaryOperatorExpr plus(Expression rhs);
    /** 
      * Std Signature : S(plus,478,,P(d449),P(d441))
      * TE Signature : S(plus,P(d449),P(d441))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts@3741
     */
    public native BinaryOperatorExpr plus(Expression rhs, ParseSourceSpan sourceSpan /* optional */);
    /** 
      * Std Signature : S(prop,479,,P(d1))
      * TE Signature : S(prop,P(d1))
      * 
     */
    public native ReadPropExpr prop(String name);
    /** 
      * Std Signature : S(prop,479,,P(d1),P(d441))
      * TE Signature : S(prop,P(d1),P(d441))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts@2676
     */
    public native ReadPropExpr prop(String name, ParseSourceSpan sourceSpan /* optional */);
    /** 
      * Std Signature : S(toStmt,488,,)
      * TE Signature : S(toStmt,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts@4737
     */
    public native Statement toStmt();
    /** 
      * Std Signature : S(visitExpression,3,,P(d448),P(d3))
      * TE Signature : S(visitExpression,P(d448),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts@2599
     */
    public native Object visitExpression(ExpressionVisitor visitor, Object context);
}

package fr.lteconsulting.jsinterop.ng.compiler.i18n;

import fr.lteconsulting.jsinterop.browser.AnonymousType1278;
import fr.lteconsulting.jsinterop.ng.compiler.ParseSourceSpan;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/i18n/i18n_ast".Icu
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/i18n/i18n_ast.d.ts:1687
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.i18n", name="Icu")
public class Icu extends Node
{

    /*
        Constructors
    */
    public Icu(String expression, String type, AnonymousType1278 cases, ParseSourceSpan sourceSpan){
    }

    /*
        Properties
    */

    public AnonymousType1278 cases;

    @JsProperty( name = "cases")
    public native AnonymousType1278 getCases();

    @JsProperty( name = "cases")
    public native void setCases( AnonymousType1278 value );

    public String expression;

    @JsProperty( name = "expression")
    public native String getExpression();

    @JsProperty( name = "expression")
    public native void setExpression( String value );

    public String expressionPlaceholder;

    @JsProperty( name = "expressionPlaceholder")
    public native String getExpressionPlaceholder();

    @JsProperty( name = "expressionPlaceholder")
    public native void setExpressionPlaceholder( String value );

    public String type;

    @JsProperty( name = "type")
    public native String getType();

    @JsProperty( name = "type")
    public native void setType( String value );
}

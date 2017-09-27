package fr.lteconsulting.jsinterop.ng;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_ast".StateAst
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_ast.d.ts:1581
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng", name="StateAst")
public class StateAst extends Ast
{

    /*
        Constructors
    */
    public StateAst(String name, StyleAst style){
    }

    /*
        Properties
    */

    public String name;

    @JsProperty( name = "name")
    public native String getName();

    @JsProperty( name = "name")
    public native void setName( String value );

    public StyleAst style;

    @JsProperty( name = "style")
    public native StyleAst getStyle();

    @JsProperty( name = "style")
    public native void setStyle( StyleAst value );
}

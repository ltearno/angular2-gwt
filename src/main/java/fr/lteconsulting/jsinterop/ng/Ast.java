package fr.lteconsulting.jsinterop.ng;

import fr.lteconsulting.jsinterop.browser.AnonymousType717;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_ast".Ast
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_ast.d.ts:1088
  * 
 */
@JsType(isNative=true, namespace="ng", name="Ast")
public class Ast
{

    /*
        Properties
    */

    public AnimationOptions options;

    @JsProperty( name = "options")
    public native AnimationOptions getOptions();

    @JsProperty( name = "options")
    public native void setOptions( AnimationOptions value );

    public AnonymousType717 params;

    @JsProperty( name = "params")
    public native AnonymousType717 getParams();

    @JsProperty( name = "params")
    public native void setParams( AnonymousType717 value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(visit,3,,P(d294),P(d3))
      * TE Signature : S(visit,P(d294),P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_ast.d.ts@1129
     */
    public native Object visit(AstVisitor ast, Object context);
}

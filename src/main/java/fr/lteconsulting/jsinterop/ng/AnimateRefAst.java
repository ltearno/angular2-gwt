package fr.lteconsulting.jsinterop.ng;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_ast".AnimateRefAst
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_ast.d.ts:3404
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng", name="AnimateRefAst")
public class AnimateRefAst extends Ast
{

    /*
        Constructors
    */
    public AnimateRefAst(ReferenceAst animation){
    }

    /*
        Properties
    */

    public ReferenceAst animation;

    @JsProperty( name = "animation")
    public native ReferenceAst getAnimation();

    @JsProperty( name = "animation")
    public native void setAnimation( ReferenceAst value );
}

package fr.lteconsulting.jsinterop.ng;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_ast".ReferenceAst
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_ast.d.ts:3127
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng", name="ReferenceAst")
public class ReferenceAst extends Ast
{

    /*
        Constructors
    */
    public ReferenceAst(Ast animation){
    }

    /*
        Properties
    */

    public Ast animation;

    @JsProperty( name = "animation")
    public native Ast getAnimation();

    @JsProperty( name = "animation")
    public native void setAnimation( Ast value );
}

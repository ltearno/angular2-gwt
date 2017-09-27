package fr.lteconsulting.jsinterop.ng;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_ast".StaggerAst
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_ast.d.ts:3921
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng", name="StaggerAst")
public class StaggerAst extends Ast
{

    /*
        Constructors
    */
    public StaggerAst(Object timings, Ast animation){
    }

    /*
        Properties
    */

    public Ast animation;

    @JsProperty( name = "animation")
    public native Ast getAnimation();

    @JsProperty( name = "animation")
    public native void setAnimation( Ast value );

    public Object timings;

    @JsProperty( name = "timings")
    public native Object getTimings();

    @JsProperty( name = "timings")
    public native void setTimings( Object value );
}

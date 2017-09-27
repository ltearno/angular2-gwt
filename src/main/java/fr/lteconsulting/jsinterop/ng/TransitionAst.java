package fr.lteconsulting.jsinterop.ng;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.prebuilt.Function2;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_ast".TransitionAst
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_ast.d.ts:1765
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng", name="TransitionAst")
public class TransitionAst extends Ast
{

    /*
        Constructors
    */
    public TransitionAst(Array<Function2<String, String, Boolean>> matchers, Ast animation){
    }

    /*
        Properties
    */

    public Ast animation;

    @JsProperty( name = "animation")
    public native Ast getAnimation();

    @JsProperty( name = "animation")
    public native void setAnimation( Ast value );

    public Number depCount;

    @JsProperty( name = "depCount")
    public native Number getDepCount();

    @JsProperty( name = "depCount")
    public native void setDepCount( Number value );

    public Array<Function2<String, String, Boolean>> matchers;

    @JsProperty( name = "matchers")
    public native Array<Function2<String, String, Boolean>> getMatchers();

    @JsProperty( name = "matchers")
    public native void setMatchers( Array<Function2<String, String, Boolean>> value );

    public Number queryCount;

    @JsProperty( name = "queryCount")
    public native Number getQueryCount();

    @JsProperty( name = "queryCount")
    public native void setQueryCount( Number value );
}

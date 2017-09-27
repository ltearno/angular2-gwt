package fr.lteconsulting.jsinterop.ng;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_ast".TimingAst
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_ast.d.ts:4127
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng", name="TimingAst")
public class TimingAst extends Ast
{

    /*
        Constructors
    */
    public TimingAst(Number duration, Number delay, String easing){
    }

    /*
        Properties
    */

    public Number delay;

    @JsProperty( name = "delay")
    public native Number getDelay();

    @JsProperty( name = "delay")
    public native void setDelay( Number value );

    public Number duration;

    @JsProperty( name = "duration")
    public native Number getDuration();

    @JsProperty( name = "duration")
    public native void setDuration( Number value );

    public String easing;

    @JsProperty( name = "easing")
    public native String getEasing();

    @JsProperty( name = "easing")
    public native void setEasing( String value );
}

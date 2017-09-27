package fr.lteconsulting.jsinterop.ng;

import fr.lteconsulting.jsinterop.browser.AnonymousType717;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/animations/browser/src/render/transition_animation_engine".StateValue
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/animations/browser/src/render/transition_animation_engine.d.ts:1117
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng", name="StateValue")
public class StateValue
{

    /*
        Constructors
    */
    public StateValue(Object input){
    }

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

    public String value;

    @JsProperty( name = "value")
    public native String getValue();

    @JsProperty( name = "value")
    public native void setValue( String value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(absorbOptions,429,,P(d284))
      * TE Signature : S(absorbOptions,P(d284))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/render/transition_animation_engine.d.ts@1293
     */
    public native void absorbOptions(AnimationOptions options);
}

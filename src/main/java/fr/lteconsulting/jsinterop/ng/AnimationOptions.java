package fr.lteconsulting.jsinterop.ng;

import fr.lteconsulting.jsinterop.browser.AnonymousType717;
import fr.lteconsulting.jsinterop.browser.PropertyKey_UnionOfNumberAndString;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/src/animation_metadata".AnimationOptions
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/src/animation_metadata.d.ts:581

  * `AnimationOptions` represents options that can be passed into most animation DSL methods.
  * When options are provided, the delay value of an animation can be changed and animation input
  * parameters can be passed in to change styling and timing data when an animation is started.
  * 
  * The following animation DSL functions are able to accept animation option data:
  * 
  * - {@link transition transition()}
  * - {@link sequence sequence()}
  * - {@link group group()}
  * - {@link query query()}
  * - {@link animation animation()}
  * - {@link useAnimation useAnimation()}
  * - {@link animateChild animateChild()}
  * 
  * Programmatic animations built using {@link AnimationBuilder the AnimationBuilder service} also
  * make use of AnimationOptions.
 */
@JsType(isNative=true, namespace="ng", name="AnimationOptions")
public class AnimationOptions
{

    /*
        Properties
    */

    public PropertyKey_UnionOfNumberAndString delay;

    @JsProperty( name = "delay")
    public native PropertyKey_UnionOfNumberAndString getDelay();

    @JsProperty( name = "delay")
    public native void setDelay( PropertyKey_UnionOfNumberAndString value );

    @JsOverlay
    public final void setDelay( Number value ) { setDelay(PropertyKey_UnionOfNumberAndString.ofNumber( value )); }

    @JsOverlay
    public final void setDelay( String value ) { setDelay(PropertyKey_UnionOfNumberAndString.ofString( value )); }

    public AnonymousType717 params;

    @JsProperty( name = "params")
    public native AnonymousType717 getParams();

    @JsProperty( name = "params")
    public native void setParams( AnonymousType717 value );
}

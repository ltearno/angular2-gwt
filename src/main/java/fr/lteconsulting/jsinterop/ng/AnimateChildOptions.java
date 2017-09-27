package fr.lteconsulting.jsinterop.ng;

import fr.lteconsulting.jsinterop.browser.PropertyKey_UnionOfNumberAndString;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/src/animation_metadata".AnimateChildOptions
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/src/animation_metadata.d.ts:1511

  * Metadata representing the entry of animations. Instances of this interface are created internally
  * within the Angular animation DSL when {@link animateChild animateChild()} is used.
 */
@JsType(isNative=true, namespace="ng", name="AnimateChildOptions")
public class AnimateChildOptions extends AnimationOptions
{

    /*
        Properties
    */

    public PropertyKey_UnionOfNumberAndString duration;

    @JsProperty( name = "duration")
    public native PropertyKey_UnionOfNumberAndString getDuration();

    @JsProperty( name = "duration")
    public native void setDuration( PropertyKey_UnionOfNumberAndString value );

    @JsOverlay
    public final void setDuration( Number value ) { setDuration(PropertyKey_UnionOfNumberAndString.ofNumber( value )); }

    @JsOverlay
    public final void setDuration( String value ) { setDuration(PropertyKey_UnionOfNumberAndString.ofString( value )); }
}

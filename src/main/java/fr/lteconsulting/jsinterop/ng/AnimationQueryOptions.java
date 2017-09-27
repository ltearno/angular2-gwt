package fr.lteconsulting.jsinterop.ng;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/src/animation_metadata".AnimationQueryOptions
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/src/animation_metadata.d.ts:7201

  * Metadata representing the entry of animations. Instances of this interface are provided via the
  * animation DSL when the {@link query query animation function} is called.
 */
@JsType(isNative=true, namespace="ng", name="AnimationQueryOptions")
public class AnimationQueryOptions extends AnimationOptions
{

    /*
        Properties
    */

    public Number limit;

    @JsProperty( name = "limit")
    public native Number getLimit();

    @JsProperty( name = "limit")
    public native void setLimit( Number value );

    public Boolean optional;

    @JsProperty( name = "optional")
    public native Boolean getOptional();

    @JsProperty( name = "optional")
    public native void setOptional( Boolean value );
}

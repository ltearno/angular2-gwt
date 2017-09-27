package fr.lteconsulting.jsinterop.ng;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/src/animation_metadata".AnimationStateMetadata
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/src/animation_metadata.d.ts:3029

  * Metadata representing the entry of animations. Instances of this interface are provided via the
  * animation DSL when the {@link state state animation function} is called.
 */
@JsType(isNative=true, namespace="ng", name="AnimationStateMetadata")
public class AnimationStateMetadata extends AnimationMetadata
{

    /*
        Properties
    */

    public String name;

    @JsProperty( name = "name")
    public native String getName();

    @JsProperty( name = "name")
    public native void setName( String value );

    public Object options;

    @JsProperty( name = "options")
    public native Object getOptions();

    @JsProperty( name = "options")
    public native void setOptions( Object value );

    public AnimationStyleMetadata styles;

    @JsProperty( name = "styles")
    public native AnimationStyleMetadata getStyles();

    @JsProperty( name = "styles")
    public native void setStyles( AnimationStyleMetadata value );
}

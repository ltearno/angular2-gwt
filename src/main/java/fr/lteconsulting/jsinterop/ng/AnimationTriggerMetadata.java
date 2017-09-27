package fr.lteconsulting.jsinterop.ng;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/src/animation_metadata".AnimationTriggerMetadata
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/src/animation_metadata.d.ts:2567

  * Metadata representing the entry of animations. Instances of this interface are provided via the
  * animation DSL when the {@link trigger trigger animation function} is called.
 */
@JsType(isNative=true, namespace="ng", name="AnimationTriggerMetadata")
public class AnimationTriggerMetadata extends AnimationMetadata
{

    /*
        Properties
    */

    public Array<AnimationMetadata> definitions;

    @JsProperty( name = "definitions")
    public native Array<AnimationMetadata> getDefinitions();

    @JsProperty( name = "definitions")
    public native void setDefinitions( Array<AnimationMetadata> value );

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
}

package fr.lteconsulting.jsinterop.ng;

import fr.lteconsulting.jsinterop.UnionOfAnimationMetadataAndArrayOfAnimationMetadata;
import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/src/animation_metadata".AnimationQueryMetadata
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/src/animation_metadata.d.ts:4139
  * 
 */
@JsType(isNative=true, namespace="ng", name="AnimationQueryMetadata")
public class AnimationQueryMetadata extends AnimationMetadata
{

    /*
        Properties
    */

    public UnionOfAnimationMetadataAndArrayOfAnimationMetadata animation;

    @JsProperty( name = "animation")
    public native UnionOfAnimationMetadataAndArrayOfAnimationMetadata getAnimation();

    @JsProperty( name = "animation")
    public native void setAnimation( UnionOfAnimationMetadataAndArrayOfAnimationMetadata value );

    @JsOverlay
    public final void setAnimation( AnimationMetadata value ) { setAnimation(UnionOfAnimationMetadataAndArrayOfAnimationMetadata.ofAnimationMetadata( value )); }

    @JsOverlay
    public final void setAnimation( Array<AnimationMetadata> value ) { setAnimation(UnionOfAnimationMetadataAndArrayOfAnimationMetadata.ofArrayOfAnimationMetadata( value )); }

    public AnimationQueryOptions options;

    @JsProperty( name = "options")
    public native AnimationQueryOptions getOptions();

    @JsProperty( name = "options")
    public native void setOptions( AnimationQueryOptions value );

    public String selector;

    @JsProperty( name = "selector")
    public native String getSelector();

    @JsProperty( name = "selector")
    public native void setSelector( String value );
}

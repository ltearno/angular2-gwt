package fr.lteconsulting.jsinterop.ng;

import fr.lteconsulting.jsinterop.browser.UnionOfObjectAndNumberAndString;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/src/animation_metadata".AnimationAnimateMetadata
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/src/animation_metadata.d.ts:5220

  * Metadata representing the entry of animations. Instances of this interface are provided via the
  * animation DSL when the {@link animate animate animation function} is called.
 */
@JsType(isNative=true, namespace="ng", name="AnimationAnimateMetadata")
public class AnimationAnimateMetadata extends AnimationMetadata
{

    /*
        Properties
    */

    public UnionOfAnimationKeyframesSequenceMetadataAndAnimationStyleMetadata styles;

    @JsProperty( name = "styles")
    public native UnionOfAnimationKeyframesSequenceMetadataAndAnimationStyleMetadata getStyles();

    @JsProperty( name = "styles")
    public native void setStyles( UnionOfAnimationKeyframesSequenceMetadataAndAnimationStyleMetadata value );

    @JsOverlay
    public final void setStyles( AnimationKeyframesSequenceMetadata value ) { setStyles(UnionOfAnimationKeyframesSequenceMetadataAndAnimationStyleMetadata.ofAnimationKeyframesSequenceMetadata( value )); }

    @JsOverlay
    public final void setStyles( AnimationStyleMetadata value ) { setStyles(UnionOfAnimationKeyframesSequenceMetadataAndAnimationStyleMetadata.ofAnimationStyleMetadata( value )); }

    public UnionOfObjectAndNumberAndString timings;

    @JsProperty( name = "timings")
    public native UnionOfObjectAndNumberAndString getTimings();

    @JsProperty( name = "timings")
    public native void setTimings( UnionOfObjectAndNumberAndString value );

    @JsOverlay
    public final void setTimings( Object value ) { setTimings(UnionOfObjectAndNumberAndString.ofObject( value )); }

    @JsOverlay
    public final void setTimings( Number value ) { setTimings(UnionOfObjectAndNumberAndString.ofNumber( value )); }

    @JsOverlay
    public final void setTimings( String value ) { setTimings(UnionOfObjectAndNumberAndString.ofString( value )); }
}

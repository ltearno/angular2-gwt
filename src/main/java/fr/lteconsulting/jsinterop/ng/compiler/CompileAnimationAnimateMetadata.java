package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.browser.PropertyKey_UnionOfNumberAndString;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_metadata".CompileAnimationAnimateMetadata
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_metadata.d.ts:1925
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler", name="CompileAnimationAnimateMetadata")
public class CompileAnimationAnimateMetadata extends CompileAnimationMetadata
{

    /*
        Constructors
    */
    public CompileAnimationAnimateMetadata(PropertyKey_UnionOfNumberAndString timings, UnionOfCompileAnimationKeyframesSequenceMetadataAndCompileAnimationStyleMetadata styles){
    }

    /*
        Properties
    */

    public UnionOfCompileAnimationKeyframesSequenceMetadataAndCompileAnimationStyleMetadata styles;

    @JsProperty( name = "styles")
    public native UnionOfCompileAnimationKeyframesSequenceMetadataAndCompileAnimationStyleMetadata getStyles();

    @JsProperty( name = "styles")
    public native void setStyles( UnionOfCompileAnimationKeyframesSequenceMetadataAndCompileAnimationStyleMetadata value );

    @JsOverlay
    public final void setStyles( CompileAnimationKeyframesSequenceMetadata value ) { setStyles(UnionOfCompileAnimationKeyframesSequenceMetadataAndCompileAnimationStyleMetadata.ofCompileAnimationKeyframesSequenceMetadata( value )); }

    @JsOverlay
    public final void setStyles( CompileAnimationStyleMetadata value ) { setStyles(UnionOfCompileAnimationKeyframesSequenceMetadataAndCompileAnimationStyleMetadata.ofCompileAnimationStyleMetadata( value )); }

    public PropertyKey_UnionOfNumberAndString timings;

    @JsProperty( name = "timings")
    public native PropertyKey_UnionOfNumberAndString getTimings();

    @JsProperty( name = "timings")
    public native void setTimings( PropertyKey_UnionOfNumberAndString value );

    @JsOverlay
    public final void setTimings( Number value ) { setTimings(PropertyKey_UnionOfNumberAndString.ofNumber( value )); }

    @JsOverlay
    public final void setTimings( String value ) { setTimings(PropertyKey_UnionOfNumberAndString.ofString( value )); }
}

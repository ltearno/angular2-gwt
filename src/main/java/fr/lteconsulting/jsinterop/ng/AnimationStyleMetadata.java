package fr.lteconsulting.jsinterop.ng;

import fr.lteconsulting.jsinterop.browser.AnonymousType719;
import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.UnionOfAnonymousType719AndArrayOfUnionOfAnonymousType719AndStringAndString;
import fr.lteconsulting.jsinterop.browser.UnionOfAnonymousType719AndString;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/src/animation_metadata".AnimationStyleMetadata
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/src/animation_metadata.d.ts:4755

  * Metadata representing the entry of animations. Instances of this interface are provided via the
  * animation DSL when the {@link style style animation function} is called.
 */
@JsType(isNative=true, namespace="ng", name="AnimationStyleMetadata")
public class AnimationStyleMetadata extends AnimationMetadata
{

    /*
        Properties
    */

    public Number offset;

    @JsProperty( name = "offset")
    public native Number getOffset();

    @JsProperty( name = "offset")
    public native void setOffset( Number value );

    public UnionOfAnonymousType719AndArrayOfUnionOfAnonymousType719AndStringAndString styles;

    @JsProperty( name = "styles")
    public native UnionOfAnonymousType719AndArrayOfUnionOfAnonymousType719AndStringAndString getStyles();

    @JsProperty( name = "styles")
    public native void setStyles( UnionOfAnonymousType719AndArrayOfUnionOfAnonymousType719AndStringAndString value );

    @JsOverlay
    public final void setStyles( AnonymousType719 value ) { setStyles(UnionOfAnonymousType719AndArrayOfUnionOfAnonymousType719AndStringAndString.ofAnonymousType719( value )); }

    @JsOverlay
    public final void setStyles( Array<UnionOfAnonymousType719AndString> value ) { setStyles(UnionOfAnonymousType719AndArrayOfUnionOfAnonymousType719AndStringAndString.ofArrayOfUnionOfAnonymousType719AndString( value )); }

    @JsOverlay
    public final void setStyles( String value ) { setStyles(UnionOfAnonymousType719AndArrayOfUnionOfAnonymousType719AndStringAndString.ofString( value )); }
}

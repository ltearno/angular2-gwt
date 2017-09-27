package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.UnionOfAnonymousType719AndString;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_metadata".CompileAnimationStyleMetadata
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_metadata.d.ts:1619
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler", name="CompileAnimationStyleMetadata")
public class CompileAnimationStyleMetadata extends CompileAnimationMetadata
{

    /*
        Constructors
    */
    public CompileAnimationStyleMetadata(Number offset, Array<UnionOfAnonymousType719AndString> styles){
    }

    /*
        Properties
    */

    public Number offset;

    @JsProperty( name = "offset")
    public native Number getOffset();

    @JsProperty( name = "offset")
    public native void setOffset( Number value );

    public Array<UnionOfAnonymousType719AndString> styles;

    @JsProperty( name = "styles")
    public native Array<UnionOfAnonymousType719AndString> getStyles();

    @JsProperty( name = "styles")
    public native void setStyles( Array<UnionOfAnonymousType719AndString> value );
}

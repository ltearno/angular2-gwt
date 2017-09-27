package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: ConstrainVideoFacingModeParameters
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:256926
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ConstrainVideoFacingModeParameters")
public class ConstrainVideoFacingModeParameters
{

    /*
        Properties
    */

    public UnionOfArrayOfStringAndString exact;

    @JsProperty( name = "exact")
    public native UnionOfArrayOfStringAndString getExact();

    @JsProperty( name = "exact")
    public native void setExact( UnionOfArrayOfStringAndString value );

    @JsOverlay
    public final void setExact( Array<String> value ) { setExact(UnionOfArrayOfStringAndString.ofArrayOfString( value )); }

    @JsOverlay
    public final void setExact( String value ) { setExact(UnionOfArrayOfStringAndString.ofString( value )); }

    public UnionOfArrayOfStringAndString ideal;

    @JsProperty( name = "ideal")
    public native UnionOfArrayOfStringAndString getIdeal();

    @JsProperty( name = "ideal")
    public native void setIdeal( UnionOfArrayOfStringAndString value );

    @JsOverlay
    public final void setIdeal( Array<String> value ) { setIdeal(UnionOfArrayOfStringAndString.ofArrayOfString( value )); }

    @JsOverlay
    public final void setIdeal( String value ) { setIdeal(UnionOfArrayOfStringAndString.ofString( value )); }
}

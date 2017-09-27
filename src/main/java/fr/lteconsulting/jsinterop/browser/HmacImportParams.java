package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: HmacImportParams
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:741626
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HmacImportParams")
public class HmacImportParams extends Algorithm
{

    /*
        Properties
    */

    public UnionOfAlgorithmAndString hash;

    @JsProperty( name = "hash")
    public native UnionOfAlgorithmAndString getHash();

    @JsProperty( name = "hash")
    public native void setHash( UnionOfAlgorithmAndString value );

    @JsOverlay
    public final void setHash( Algorithm value ) { setHash(UnionOfAlgorithmAndString.ofAlgorithm( value )); }

    @JsOverlay
    public final void setHash( String value ) { setHash(UnionOfAlgorithmAndString.ofString( value )); }

    public Number length;

    @JsProperty( name = "length")
    public native Number getLength();

    @JsProperty( name = "length")
    public native void setLength( Number value );
}

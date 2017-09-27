package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: Pbkdf2Params
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:742661
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Pbkdf2Params")
public class Pbkdf2Params extends Algorithm
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

    public Number iterations;

    @JsProperty( name = "iterations")
    public native Number getIterations();

    @JsProperty( name = "iterations")
    public native void setIterations( Number value );

    public UnionOfArrayBufferAndArrayBufferView salt;

    @JsProperty( name = "salt")
    public native UnionOfArrayBufferAndArrayBufferView getSalt();

    @JsProperty( name = "salt")
    public native void setSalt( UnionOfArrayBufferAndArrayBufferView value );

    @JsOverlay
    public final void setSalt( ArrayBuffer value ) { setSalt(UnionOfArrayBufferAndArrayBufferView.ofArrayBuffer( value )); }

    @JsOverlay
    public final void setSalt( ArrayBufferView value ) { setSalt(UnionOfArrayBufferAndArrayBufferView.ofArrayBufferView( value )); }
}

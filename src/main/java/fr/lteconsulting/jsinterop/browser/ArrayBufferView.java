package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: ArrayBufferView
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:63784
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ArrayBufferView")
public class ArrayBufferView
{

    /*
        Properties
    */

    /** 
      * The ArrayBuffer instance referenced by the array.
     */
    public ArrayBuffer buffer;

    @JsProperty( name = "buffer")
    public native ArrayBuffer getBuffer();

    @JsProperty( name = "buffer")
    public native void setBuffer( ArrayBuffer value );

    /** 
      * The length in bytes of the array.
     */
    public Number byteLength;

    @JsProperty( name = "byteLength")
    public native Number getByteLength();

    @JsProperty( name = "byteLength")
    public native void setByteLength( Number value );

    /** 
      * The offset in bytes of the array.
     */
    public Number byteOffset;

    @JsProperty( name = "byteOffset")
    public native Number getByteOffset();

    @JsProperty( name = "byteOffset")
    public native void setByteOffset( Number value );
}

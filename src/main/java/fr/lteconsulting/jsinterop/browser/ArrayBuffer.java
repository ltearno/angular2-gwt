package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: ArrayBuffer
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:63042
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:63747
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:252647
  * 1 constructors
  * Represents a raw buffer of binary data, which is used to store data for the
  * different typed arrays. ArrayBuffers cannot be read from or written to directly,
  * but can be passed to a typed array or DataView Object to interpret the raw
  * buffer as needed.
  * Represents a raw buffer of binary data, which is used to store data for the 
  * different typed arrays. ArrayBuffers cannot be read from or written to directly, 
  * but can be passed to a typed array or DataView Object to interpret the raw 
  * buffer as needed. 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ArrayBuffer")
public class ArrayBuffer
{

    /*
        Constructors
    */
    public ArrayBuffer(Number byteLength){
    }

    /*
        Static methods
    */
    /** 
      * source : apis/browser-api/tsd/lib.es6.d.ts:63690
     */
    @JsMethod(namespace="ArrayBuffer", name = "isView")
    public static native Boolean isView(Object arg);

    /*
        Properties
    */

    // skipped property __@toStringTag
    /** 
      * Read-only. The length of the ArrayBuffer (in bytes).
     */
    public Number byteLength;

    @JsProperty( name = "byteLength")
    public native Number getByteLength();

    @JsProperty( name = "byteLength")
    public native void setByteLength( Number value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(slice,26,,P(d2))
      * TE Signature : S(slice,P(d2))
      * 
     */
    public native ArrayBuffer slice(Number begin);
    /** 
      * Std Signature : S(slice,26,,P(d2),P(d2))
      * TE Signature : S(slice,P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@63521
      * Returns a section of an ArrayBuffer.
     */
    public native ArrayBuffer slice(Number begin, Number end /* optional */);
}

package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: DataView
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:64083
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:70421
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:253003
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="DataView")
public class DataView
{

    /*
        Constructors
    */
    public DataView(ArrayBuffer buffer, Number byteOffset, Number byteLength){
    }

    /*
        Properties
    */

    // skipped property __@toStringTag
    public ArrayBuffer buffer;

    @JsProperty( name = "buffer")
    public native ArrayBuffer getBuffer();

    @JsProperty( name = "buffer")
    public native void setBuffer( ArrayBuffer value );

    public Number byteLength;

    @JsProperty( name = "byteLength")
    public native Number getByteLength();

    @JsProperty( name = "byteLength")
    public native void setByteLength( Number value );

    public Number byteOffset;

    @JsProperty( name = "byteOffset")
    public native Number getByteOffset();

    @JsProperty( name = "byteOffset")
    public native void setByteOffset( Number value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(getFloat32,2,,P(d2))
      * TE Signature : S(getFloat32,P(d2))
      * 
     */
    public native Number getFloat32(Number byteOffset);
    /** 
      * Std Signature : S(getFloat32,2,,P(d2),P(d27))
      * TE Signature : S(getFloat32,P(d2),P(d27))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@64497
      * Gets the Float32 value at the specified byte offset from the start of the view. There is
      * no alignment constraint; multi-byte values may be fetched from any offset.
     */
    public native Number getFloat32(Number byteOffset, Boolean littleEndian /* optional */);
    /** 
      * Std Signature : S(getFloat64,2,,P(d2))
      * TE Signature : S(getFloat64,P(d2))
      * 
     */
    public native Number getFloat64(Number byteOffset);
    /** 
      * Std Signature : S(getFloat64,2,,P(d2),P(d27))
      * TE Signature : S(getFloat64,P(d2),P(d27))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@64853
      * Gets the Float64 value at the specified byte offset from the start of the view. There is
      * no alignment constraint; multi-byte values may be fetched from any offset.
     */
    public native Number getFloat64(Number byteOffset, Boolean littleEndian /* optional */);
    /** 
      * Std Signature : S(getInt16,2,,P(d2))
      * TE Signature : S(getInt16,P(d2))
      * 
     */
    public native Number getInt16(Number byteOffset);
    /** 
      * Std Signature : S(getInt16,2,,P(d2),P(d27))
      * TE Signature : S(getInt16,P(d2),P(d27))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@65533
      * Gets the Int16 value at the specified byte offset from the start of the view. There is
      * no alignment constraint; multi-byte values may be fetched from any offset.
     */
    public native Number getInt16(Number byteOffset, Boolean littleEndian /* optional */);
    /** 
      * Std Signature : S(getInt32,2,,P(d2))
      * TE Signature : S(getInt32,P(d2))
      * 
     */
    public native Number getInt32(Number byteOffset);
    /** 
      * Std Signature : S(getInt32,2,,P(d2),P(d27))
      * TE Signature : S(getInt32,P(d2),P(d27))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@65884
      * Gets the Int32 value at the specified byte offset from the start of the view. There is
      * no alignment constraint; multi-byte values may be fetched from any offset.
     */
    public native Number getInt32(Number byteOffset, Boolean littleEndian /* optional */);
    /** 
      * Std Signature : S(getInt8,2,,P(d2))
      * TE Signature : S(getInt8,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@65206
      * Gets the Int8 value at the specified byte offset from the start of the view. There is
      * no alignment constraint; multi-byte values may be fetched from any offset.
     */
    public native Number getInt8(Number byteOffset);
    /** 
      * Std Signature : S(getUint16,2,,P(d2))
      * TE Signature : S(getUint16,P(d2))
      * 
     */
    public native Number getUint16(Number byteOffset);
    /** 
      * Std Signature : S(getUint16,2,,P(d2),P(d27))
      * TE Signature : S(getUint16,P(d2),P(d27))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@66565
      * Gets the Uint16 value at the specified byte offset from the start of the view. There is
      * no alignment constraint; multi-byte values may be fetched from any offset.
     */
    public native Number getUint16(Number byteOffset, Boolean littleEndian /* optional */);
    /** 
      * Std Signature : S(getUint32,2,,P(d2))
      * TE Signature : S(getUint32,P(d2))
      * 
     */
    public native Number getUint32(Number byteOffset);
    /** 
      * Std Signature : S(getUint32,2,,P(d2),P(d27))
      * TE Signature : S(getUint32,P(d2),P(d27))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@66919
      * Gets the Uint32 value at the specified byte offset from the start of the view. There is
      * no alignment constraint; multi-byte values may be fetched from any offset.
     */
    public native Number getUint32(Number byteOffset, Boolean littleEndian /* optional */);
    /** 
      * Std Signature : S(getUint8,2,,P(d2))
      * TE Signature : S(getUint8,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@66236
      * Gets the Uint8 value at the specified byte offset from the start of the view. There is
      * no alignment constraint; multi-byte values may be fetched from any offset.
     */
    public native Number getUint8(Number byteOffset);
    /** 
      * Std Signature : S(setFloat32,289,,P(d2),P(d2))
      * TE Signature : S(setFloat32,P(d2),P(d2))
      * 
     */
    public native void setFloat32(Number byteOffset, Number value);
    /** 
      * Std Signature : S(setFloat32,289,,P(d2),P(d2),P(d27))
      * TE Signature : S(setFloat32,P(d2),P(d2),P(d27))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@67364
      * Stores an Float32 value at the specified byte offset from the start of the view.
     */
    public native void setFloat32(Number byteOffset, Number value, Boolean littleEndian /* optional */);
    /** 
      * Std Signature : S(setFloat64,289,,P(d2),P(d2))
      * TE Signature : S(setFloat64,P(d2),P(d2))
      * 
     */
    public native void setFloat64(Number byteOffset, Number value);
    /** 
      * Std Signature : S(setFloat64,289,,P(d2),P(d2),P(d27))
      * TE Signature : S(setFloat64,P(d2),P(d2),P(d27))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@67823
      * Stores an Float64 value at the specified byte offset from the start of the view.
     */
    public native void setFloat64(Number byteOffset, Number value, Boolean littleEndian /* optional */);
    /** 
      * Std Signature : S(setInt16,289,,P(d2),P(d2))
      * TE Signature : S(setInt16,P(d2),P(d2))
      * 
     */
    public native void setInt16(Number byteOffset, Number value);
    /** 
      * Std Signature : S(setInt16,289,,P(d2),P(d2),P(d27))
      * TE Signature : S(setInt16,P(d2),P(d2),P(d27))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@68561
      * Stores an Int16 value at the specified byte offset from the start of the view.
     */
    public native void setInt16(Number byteOffset, Number value, Boolean littleEndian /* optional */);
    /** 
      * Std Signature : S(setInt32,289,,P(d2),P(d2))
      * TE Signature : S(setInt32,P(d2),P(d2))
      * 
     */
    public native void setInt32(Number byteOffset, Number value);
    /** 
      * Std Signature : S(setInt32,289,,P(d2),P(d2),P(d27))
      * TE Signature : S(setInt32,P(d2),P(d2),P(d27))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@69016
      * Stores an Int32 value at the specified byte offset from the start of the view.
     */
    public native void setInt32(Number byteOffset, Number value, Boolean littleEndian /* optional */);
    /** 
      * Std Signature : S(setInt8,289,,P(d2),P(d2))
      * TE Signature : S(setInt8,P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@68131
      * Stores an Int8 value at the specified byte offset from the start of the view.
     */
    public native void setInt8(Number byteOffset, Number value);
    /** 
      * Std Signature : S(setUint16,289,,P(d2),P(d2))
      * TE Signature : S(setUint16,P(d2),P(d2))
      * 
     */
    public native void setUint16(Number byteOffset, Number value);
    /** 
      * Std Signature : S(setUint16,289,,P(d2),P(d2),P(d27))
      * TE Signature : S(setUint16,P(d2),P(d2),P(d27))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@69755
      * Stores an Uint16 value at the specified byte offset from the start of the view.
     */
    public native void setUint16(Number byteOffset, Number value, Boolean littleEndian /* optional */);
    /** 
      * Std Signature : S(setUint32,289,,P(d2),P(d2))
      * TE Signature : S(setUint32,P(d2),P(d2))
      * 
     */
    public native void setUint32(Number byteOffset, Number value);
    /** 
      * Std Signature : S(setUint32,289,,P(d2),P(d2),P(d27))
      * TE Signature : S(setUint32,P(d2),P(d2),P(d27))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@70212
      * Stores an Uint32 value at the specified byte offset from the start of the view.
     */
    public native void setUint32(Number byteOffset, Number value, Boolean littleEndian /* optional */);
    /** 
      * Std Signature : S(setUint8,289,,P(d2),P(d2))
      * TE Signature : S(setUint8,P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@69323
      * Stores an Uint8 value at the specified byte offset from the start of the view.
     */
    public native void setUint8(Number byteOffset, Number value);
}

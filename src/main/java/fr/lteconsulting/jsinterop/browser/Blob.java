package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: Blob
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:293008
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:293212
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Blob")
public class Blob
{

    /*
        Constructors
    */
    public Blob(Array<Object> blobParts, BlobPropertyBag options){
    }

    /*
        Properties
    */

    public Number size;

    @JsProperty( name = "size")
    public native Number getSize();

    @JsProperty( name = "size")
    public native void setSize( Number value );

    public String type;

    @JsProperty( name = "type")
    public native String getType();

    @JsProperty( name = "type")
    public native void setType( String value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(msClose,289,,)
      * TE Signature : S(msClose,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@293085
     */
    public native void msClose();
    /** 
      * Std Signature : S(msDetachStream,3,,)
      * TE Signature : S(msDetachStream,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@293106
     */
    public native Object msDetachStream();
    /** 
      * Std Signature : S(slice,235,,)
      * TE Signature : S(slice,)
      * 
     */
    public native Blob slice();
    /** 
      * Std Signature : S(slice,235,,P(d2))
      * TE Signature : S(slice,P(d2))
      * 
     */
    public native Blob slice(Number start /* optional */);
    /** 
      * Std Signature : S(slice,235,,P(d2),P(d2))
      * TE Signature : S(slice,P(d2),P(d2))
      * 
     */
    public native Blob slice(Number start /* optional */, Number end /* optional */);
    /** 
      * Std Signature : S(slice,235,,P(d2),P(d2),P(d1))
      * TE Signature : S(slice,P(d2),P(d2),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@293133
     */
    public native Blob slice(Number start /* optional */, Number end /* optional */, String contentType /* optional */);
}

package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MediaKeyStatusMap
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:519050
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:519228
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MediaKeyStatusMap")
public class MediaKeyStatusMap
{

    /*
        Constructors
    */
    public MediaKeyStatusMap(){
    }

    /*
        Properties
    */

    public Number size;

    @JsProperty( name = "size")
    public native Number getSize();

    @JsProperty( name = "size")
    public native void setSize( Number value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(forEach,289,,P(dF--S(?,289,,P(d3),P(d1))------)))
      * TE Signature : S(forEach,P(dF--S(?,P(d3),P(d1))------)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@519113
     */
    public native void forEach(ForEachCallback callback);
    /** 
      * Std Signature : S(get,1,,P(d3))
      * TE Signature : S(get,P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@519159
     */
    public native String get(Object keyId);
    /** 
      * Std Signature : S(has,27,,P(d3))
      * TE Signature : S(has,P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@519188
     */
    public native Boolean has(Object keyId);
}

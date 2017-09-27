package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: Headers
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:489196
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:489471
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Headers")
public class Headers
{

    /*
        Constructors
    */
    public Headers(Object init){
    }

    /*
        Methods
    */
    /** 
      * Std Signature : S(append,289,,P(d1),P(d1))
      * TE Signature : S(append,P(d1),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@489222
     */
    public native void append(String name, String value);
    /** 
      * Std Signature : S(delete,289,,P(d1))
      * TE Signature : S(delete,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@489269
     */
    public native void delete(String name);
    /** 
      * Std Signature : S(forEach,289,,P(dF--S(?,289,,P(d3),P(d1))------)))
      * TE Signature : S(forEach,P(dF--S(?,P(d3),P(d1))------)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@489301
     */
    public native void forEach(ForEachCallback callback);
    /** 
      * Std Signature : S(get,1,,P(d1))
      * TE Signature : S(get,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@489347
     */
    public native String get(String name);
    /** 
      * Std Signature : S(has,27,,P(d1))
      * TE Signature : S(has,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@489385
     */
    public native Boolean has(String name);
    /** 
      * Std Signature : S(set,289,,P(d1),P(d1))
      * TE Signature : S(set,P(d1),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@489417
     */
    public native void set(String name, String value);
}

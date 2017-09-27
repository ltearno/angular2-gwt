package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: URLSearchParams
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:737897
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:738803
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="URLSearchParams")
public class URLSearchParams
{

    /*
        Constructors
    */
    public URLSearchParams(UnionOfStringAndURLSearchParams init){
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
      * apis/browser-api/tsd/lib.es6.d.ts@738018
      * Appends a specified key/value pair as a new search parameter.
     */
    public native void append(String name, String value);
    /** 
      * Std Signature : S(delete,289,,P(d1))
      * TE Signature : S(delete,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@738192
      * Deletes the given search parameter, and its associated value, from the list of all search parameters.
     */
    public native void delete(String name);
    /** 
      * Std Signature : S(get,1,,P(d1))
      * TE Signature : S(get,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@738315
      * Returns the first value associated to the given search parameter.
     */
    public native String get(String name);
    /** 
      * Std Signature : S(getAll,7<1>,,P(d1))
      * TE Signature : S(getAll,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@738444
      * Returns all the values association with a given search parameter.
     */
    public native Array<String> getAll(String name);
    /** 
      * Std Signature : S(has,27,,P(d1))
      * TE Signature : S(has,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@738569
      * Returns a Boolean indicating if such a search parameter exists.
     */
    public native Boolean has(String name);
    /** 
      * Std Signature : S(set,289,,P(d1),P(d1))
      * TE Signature : S(set,P(d1),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@738749
      * Sets the value associated to a given search parameter to the given value. If there were several values, delete the others.
     */
    public native void set(String name, String value);
}

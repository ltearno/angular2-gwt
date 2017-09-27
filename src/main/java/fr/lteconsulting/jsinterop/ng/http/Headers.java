package fr.lteconsulting.jsinterop.ng.http;

import fr.lteconsulting.jsinterop.UnionOfAnonymousType717AndHeaders;
import fr.lteconsulting.jsinterop.browser.AnonymousType717;
import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.Map;
import fr.lteconsulting.jsinterop.browser.UnionOfArrayOfStringAndString;
import fr.lteconsulting.prebuilt.Action3;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/headers".Headers
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/headers.d.ts:0
  * 1 constructors
  * Polyfill for [Headers](https://developer.mozilla.org/en-US/docs/Web/API/Headers/Headers), as
  * specified in the [Fetch Spec](https://fetch.spec.whatwg.org/#headers-class).
  * 
  * The only known difference between this `Headers` implementation and the spec is the
  * lack of an `entries` method.
  * 
  * ### Example
  * 
  * ```
  * import {Headers} from '@angular/http';
  * 
  * var firstHeaders = new Headers();
  * firstHeaders.append('Content-Type', 'image/jpeg');
  * console.log(firstHeaders.get('Content-Type')) //'image/jpeg'
  * 
  * // Create headers from Plain Old JavaScript Object
  * var secondHeaders = new Headers({
  *    'X-My-Custom-Header': 'Angular'
  * });
  * console.log(secondHeaders.get('X-My-Custom-Header')); //'Angular'
  * 
  * var thirdHeaders = new Headers(secondHeaders);
  * console.log(thirdHeaders.get('X-My-Custom-Header')); //'Angular'
  * ```
 */
@JsType(isNative=true, namespace="ng.http", name="Headers")
public class Headers
{

    /*
        Constructors
    */
    public Headers(UnionOfAnonymousType717AndHeaders headers){
    }

    /*
        Static methods
    */
    /** 
      * Returns a new Headers instance from the given DOMString of Response Headers
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/headers.d.ts:1308
     */
    @JsMethod(namespace="ng.http.Headers", name = "fromResponseHeaderString")
    public static native Headers fromResponseHeaderString(String headersString);

    /*
        Methods
    */
    /** 
      * Std Signature : S(append,429,,P(d1),P(d1))
      * TE Signature : S(append,P(d1),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/headers.d.ts@1476
      * Appends a header to existing list of header values for a given header name.
     */
    public native void append(String name, String value);
    /** 
      * Std Signature : S(delete,429,,P(d1))
      * TE Signature : S(delete,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/headers.d.ts@1592
      * Deletes all header values for the given name.
     */
    public native void delete(String name);
    /** 
      * Std Signature : S(entries,429,,)
      * TE Signature : S(entries,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/headers.d.ts@2499
      * This method is not implemented.
     */
    public native void entries();
    /** 
      * Std Signature : S(forEach,429,,P(dFP1-,P2-,P3--S(?,429,,P(d3),P(d4),P(d5))------)<7<1>,9,37<9,7>>))
      * TE Signature : S(forEach,P(dF--S(?,P(d3),P(d4),P(d4))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/headers.d.ts@1624
     */
    public native void forEach(Action3<Array<String>, String, Map<String, Array<String>>> fn);
    /** 
      * Std Signature : S(get,1,,P(d1))
      * TE Signature : S(get,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/headers.d.ts@1802
      * Returns first header that matches given name.
     */
    public native String get(String name);
    /** 
      * Std Signature : S(getAll,7<1>,,P(d1))
      * TE Signature : S(getAll,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/headers.d.ts@2401
      * Returns list of header values for a given name.
     */
    public native Array<String> getAll(String name);
    /** 
      * Std Signature : S(has,27,,P(d1))
      * TE Signature : S(has,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/headers.d.ts@1909
      * Checks for existence of header by given name.
     */
    public native Boolean has(String name);
    /** 
      * Std Signature : S(keys,7<1>,,)
      * TE Signature : S(keys,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/headers.d.ts@1997
      * Returns the names of the headers
     */
    public native Array<String> keys();
    /** 
      * Std Signature : S(mayBeSetNormalizedName,3,,P(d3))
      * TE Signature : S(mayBeSetNormalizedName,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/headers.d.ts@2520
     */
    public native Object mayBeSetNormalizedName(Object name);
    /** 
      * Std Signature : S(set,429,,P(d1),P(d1))
      * TE Signature : S(set,P(d1),P(d1))
      * 
     */
    public native void set(String name, String value);
    /** 
      * Std Signature : S(set,429,,P(d1),P(d7<1>))
      * TE Signature : S(set,P(d1),P(d7))
      * 
     */
    public native void set(String name, Array<String> value);
    /** 
      * Std Signature : S(set,429,,P(d1),P(dU(-7<1>,4)))
      * TE Signature : S(set,P(d1),P(dU(-7,1)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/headers.d.ts@2089
      * Sets or overrides header value for given name.
     */
    public native void set(String name, UnionOfArrayOfStringAndString value);
    /** 
      * Std Signature : S(toJSON,C(----3----),,)
      * TE Signature : S(toJSON,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/headers.d.ts@2278
      * Returns string of all headers.
     */
    public native AnonymousType717 toJSON();
    /** 
      * Std Signature : S(values,7<2<1>>,,)
      * TE Signature : S(values,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/headers.d.ts@2198
      * Returns values of all headers.
     */
    public native Array<Array<String>> values();
}

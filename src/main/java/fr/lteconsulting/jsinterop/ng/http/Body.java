package fr.lteconsulting.jsinterop.ng.http;

import fr.lteconsulting.jsinterop.browser.ArrayBuffer;
import fr.lteconsulting.jsinterop.browser.Blob;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/body".Body
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/body.d.ts:0

  * HTTP request body used by both {@link Request} and {@link Response}
  * https://fetch.spec.whatwg.org/#body
 */
@JsType(isNative=true, namespace="ng.http", name="Body")
public class Body
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(arrayBuffer,26,,)
      * TE Signature : S(arrayBuffer,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/body.d.ts@1202
      * Return the body as an ArrayBuffer
     */
    public native ArrayBuffer arrayBuffer();
    /** 
      * Std Signature : S(blob,235,,)
      * TE Signature : S(blob,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/body.d.ts@1324
      * Returns the request's body as a Blob, assuming that body exists.
     */
    public native Blob blob();
    /** 
      * Std Signature : S(json,3,,)
      * TE Signature : S(json,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/body.d.ts@255
      * Attempts to return body as parsed `JSON` object, or raises an exception.
     */
    public native Object json();
    /** 
      * Std Signature : S(text,1,,)
      * TE Signature : S(text,)
      * 
     */
    public native String text();
    /** 
      * Std Signature : S(text,1,,P(d1))
      * TE Signature : S(text,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/body.d.ts@1089
      * Returns the body as a string, presuming `toString()` can be called on the response body.
      * 
      * When decoding an `ArrayBuffer`, the optional `encodingHint` parameter determines how the
      * bytes in the buffer will be interpreted. Valid values are:
      * 
      * - `legacy` - incorrectly interpret the bytes as UTF-16 (technically, UCS-2). Only characters
      *    in the Basic Multilingual Plane are supported, surrogate pairs are not handled correctly.
      *    In addition, the endianness of the 16-bit octet pairs in the `ArrayBuffer` is not taken
      *    into consideration. This is the default behavior to avoid breaking apps, but should be
      *    considered deprecated.
      * 
      * - `iso-8859` - interpret the bytes as ISO-8859 (which can be used for ASCII encoded text).
     */
    public native String text(String encodingHint /* optional */);
}

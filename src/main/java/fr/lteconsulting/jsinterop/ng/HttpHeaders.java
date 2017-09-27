package fr.lteconsulting.jsinterop.ng;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.UnionOfAnonymousType1078AndString;
import fr.lteconsulting.jsinterop.browser.UnionOfArrayOfStringAndString;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/headers".HttpHeaders
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/headers.d.ts:0
  * 1 constructors
  * Immutable set of Http headers, with lazy parsing.
 */
@JsType(isNative=true, namespace="ng", name="HttpHeaders")
public class HttpHeaders
{

    /*
        Constructors
    */
    public HttpHeaders(UnionOfAnonymousType1078AndString headers){
    }

    /*
        Properties
    */

    /** 
      * Internal map of lowercase header names to values.
     */
    public Object headers;

    @JsProperty( name = "headers")
    public native Object getHeaders();

    @JsProperty( name = "headers")
    public native void setHeaders( Object value );

    /** 
      * Complete the lazy initialization of this object (needed before reading).
     */
    public Object lazyInit;

    @JsProperty( name = "lazyInit")
    public native Object getLazyInit();

    @JsProperty( name = "lazyInit")
    public native void setLazyInit( Object value );

    /** 
      * Queued updates to be materialized the next initialization.
     */
    public Object lazyUpdate;

    @JsProperty( name = "lazyUpdate")
    public native Object getLazyUpdate();

    @JsProperty( name = "lazyUpdate")
    public native void setLazyUpdate( Object value );

    /** 
      * Internal map of lowercased header names to the normalized
      * form of the name (the form seen first).
     */
    public Object normalizedNames;

    @JsProperty( name = "normalizedNames")
    public native Object getNormalizedNames();

    @JsProperty( name = "normalizedNames")
    public native void setNormalizedNames( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(append,1215,,P(d1),P(d1))
      * TE Signature : S(append,P(d1),P(d1))
      * 
     */
    public native HttpHeaders append(String name, String value);
    /** 
      * Std Signature : S(append,1215,,P(d1),P(d7<1>))
      * TE Signature : S(append,P(d1),P(d7))
      * 
     */
    public native HttpHeaders append(String name, Array<String> value);
    /** 
      * Std Signature : S(append,1215,,P(d1),P(dU(-7<1>,4)))
      * TE Signature : S(append,P(d1),P(dU(-7,1)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/headers.d.ts@1080
     */
    public native HttpHeaders append(String name, UnionOfArrayOfStringAndString value);
    /** 
      * Std Signature : S(applyUpdate,3,,P(d3))
      * TE Signature : S(applyUpdate,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/headers.d.ts@1399
     */
    public native Object applyUpdate(Object update);
    /** 
      * Std Signature : S(clone,3,,P(d3))
      * TE Signature : S(clone,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/headers.d.ts@1372
     */
    public native Object clone(Object update);
    /** 
      * Std Signature : S(copyFrom,3,,P(d3))
      * TE Signature : S(copyFrom,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/headers.d.ts@1343
     */
    public native Object copyFrom(Object other);
    /** 
      * Std Signature : S(delete,1215,,P(d1))
      * TE Signature : S(delete,P(d1))
      * 
     */
    public native HttpHeaders delete(String name);
    /** 
      * Std Signature : S(delete,1215,,P(d1),P(d1))
      * TE Signature : S(delete,P(d1),P(d1))
      * 
     */
    public native HttpHeaders delete(String name, String value /* optional */);
    /** 
      * Std Signature : S(delete,1215,,P(d1),P(d7<1>))
      * TE Signature : S(delete,P(d1),P(d7))
      * 
     */
    public native HttpHeaders delete(String name, Array<String> value /* optional */);
    /** 
      * Std Signature : S(delete,1215,,P(d1),P(dU(-7<1>,4)))
      * TE Signature : S(delete,P(d1),P(dU(-7,1)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/headers.d.ts@1207
     */
    public native HttpHeaders delete(String name, UnionOfArrayOfStringAndString value /* optional */);
    /** 
      * Std Signature : S(get,1,,P(d1))
      * TE Signature : S(get,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/headers.d.ts@850
      * Returns first header that matches given name.
     */
    public native String get(String name);
    /** 
      * Std Signature : S(getAll,7<1>,,P(d1))
      * TE Signature : S(getAll,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/headers.d.ts@1037
      * Returns list of header values for a given name.
     */
    public native Array<String> getAll(String name);
    /** 
      * Std Signature : S(has,27,,P(d1))
      * TE Signature : S(has,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/headers.d.ts@749
      * Checks for existence of header by given name.
     */
    public native Boolean has(String name);
    /** 
      * Std Signature : S(init,3,,)
      * TE Signature : S(init,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/headers.d.ts@1323
     */
    public native Object init();
    /** 
      * Std Signature : S(keys,7<1>,,)
      * TE Signature : S(keys,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/headers.d.ts@944
      * Returns the names of the headers
     */
    public native Array<String> keys();
    /** 
      * Std Signature : S(maybeSetNormalizedName,3,,P(d3),P(d3))
      * TE Signature : S(maybeSetNormalizedName,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/headers.d.ts@1273
     */
    public native Object maybeSetNormalizedName(Object name, Object lcName);
    /** 
      * Std Signature : S(set,1215,,P(d1),P(d1))
      * TE Signature : S(set,P(d1),P(d1))
      * 
     */
    public native HttpHeaders set(String name, String value);
    /** 
      * Std Signature : S(set,1215,,P(d1),P(d7<1>))
      * TE Signature : S(set,P(d1),P(d7))
      * 
     */
    public native HttpHeaders set(String name, Array<String> value);
    /** 
      * Std Signature : S(set,1215,,P(d1),P(dU(-7<1>,4)))
      * TE Signature : S(set,P(d1),P(dU(-7,1)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/headers.d.ts@1145
     */
    public native HttpHeaders set(String name, UnionOfArrayOfStringAndString value);
}

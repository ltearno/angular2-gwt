package fr.lteconsulting.jsinterop.ng.http;

import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/url_search_params".QueryEncoder
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/url_search_params.d.ts:0
  * 
 */
@JsType(isNative=true, namespace="ng.http", name="QueryEncoder")
public class QueryEncoder
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(encodeKey,1,,P(d1))
      * TE Signature : S(encodeKey,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/url_search_params.d.ts@66
     */
    public native String encodeKey(String k);
    /** 
      * Std Signature : S(encodeValue,1,,P(d1))
      * TE Signature : S(encodeValue,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/url_search_params.d.ts@100
     */
    public native String encodeValue(String v);
}

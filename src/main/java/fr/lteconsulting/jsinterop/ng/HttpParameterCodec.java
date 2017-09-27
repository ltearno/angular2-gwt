package fr.lteconsulting.jsinterop.ng;

import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/params".HttpParameterCodec
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/params.d.ts:0

  * A codec for encoding and decoding parameters in URLs.
  * 
  * Used by `HttpParams`.
  * 
  *   
 */
@JsType(isNative=true, namespace="ng", name="HttpParameterCodec")
public class HttpParameterCodec
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(decodeKey,1,,P(d1))
      * TE Signature : S(decodeKey,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/params.d.ts@436
     */
    public native String decodeKey(String key);
    /** 
      * Std Signature : S(decodeValue,1,,P(d1))
      * TE Signature : S(decodeValue,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/params.d.ts@472
     */
    public native String decodeValue(String value);
    /** 
      * Std Signature : S(encodeKey,1,,P(d1))
      * TE Signature : S(encodeKey,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/params.d.ts@360
     */
    public native String encodeKey(String key);
    /** 
      * Std Signature : S(encodeValue,1,,P(d1))
      * TE Signature : S(encodeValue,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/params.d.ts@396
     */
    public native String encodeValue(String value);
}

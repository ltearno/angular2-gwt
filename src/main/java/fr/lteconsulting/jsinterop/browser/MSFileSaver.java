package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: MSFileSaver
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:732603
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface MSFileSaver
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(msSaveBlob,27,,P(d3))
      * TE Signature : S(msSaveBlob,P(d3))
      * 
     */
    Boolean msSaveBlob(Object blob);
    /** 
      * Std Signature : S(msSaveBlob,27,,P(d3),P(d1))
      * TE Signature : S(msSaveBlob,P(d3),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@732633
     */
    Boolean msSaveBlob(Object blob, String defaultName /* optional */);
    /** 
      * Std Signature : S(msSaveOrOpenBlob,27,,P(d3))
      * TE Signature : S(msSaveOrOpenBlob,P(d3))
      * 
     */
    Boolean msSaveOrOpenBlob(Object blob);
    /** 
      * Std Signature : S(msSaveOrOpenBlob,27,,P(d3),P(d1))
      * TE Signature : S(msSaveOrOpenBlob,P(d3),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@732691
     */
    Boolean msSaveOrOpenBlob(Object blob, String defaultName /* optional */);
}

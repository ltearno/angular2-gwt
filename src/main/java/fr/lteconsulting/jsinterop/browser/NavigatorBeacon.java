package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: NavigatorBeacon
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:733274
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface NavigatorBeacon
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(sendBeacon,27,,P(d1))
      * TE Signature : S(sendBeacon,P(d1))
      * 
     */
    Boolean sendBeacon(String url);
    /** 
      * Std Signature : S(sendBeacon,27,,P(d1),P(d3))
      * TE Signature : S(sendBeacon,P(d1),P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@733308
     */
    Boolean sendBeacon(String url, Object data /* optional */);
}

package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: NavigatorBeacon
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:733274
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="NavigatorBeacon")
public class NavigatorBeaconImpl implements NavigatorBeacon
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(sendBeacon,27,,P(d1))
      * TE Signature : S(sendBeacon,P(d1))
      * 
     */
    public native Boolean sendBeacon(String url);
    /** 
      * Std Signature : S(sendBeacon,27,,P(d1),P(d3))
      * TE Signature : S(sendBeacon,P(d1),P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@733308
     */
    public native Boolean sendBeacon(String url, Object data /* optional */);
}

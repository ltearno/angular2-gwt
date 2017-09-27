package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: CSS
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:293431
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:293519
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="CSS")
public class CSS
{

    /*
        Static methods
    */
    /** 
      * source : apis/browser-api/tsd/lib.es6.d.ts:293453
     */
    @JsMethod(namespace="CSS", name = "supports")
    public static native Boolean _supports(String property, String value /* optional */);

    /*
        Methods
    */
    /** 
      * Std Signature : S(supports,27,,P(d1))
      * TE Signature : S(supports,P(d1))
      * 
     */
    public native Boolean supports(String property);
    /** 
      * Std Signature : S(supports,27,,P(d1),P(d1))
      * TE Signature : S(supports,P(d1),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@293453
     */
    public native Boolean supports(String property, String value /* optional */);
}

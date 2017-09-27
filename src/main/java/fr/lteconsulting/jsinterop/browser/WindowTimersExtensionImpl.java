package fr.lteconsulting.jsinterop.browser;

import fr.lteconsulting.prebuilt.Action1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: WindowTimersExtension
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:736151
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="WindowTimersExtension")
public class WindowTimersExtensionImpl implements WindowTimersExtension
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(clearImmediate,289,,P(d2))
      * TE Signature : S(clearImmediate,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@736191
     */
    public native void clearImmediate(Number handle);
    /** 
      * Std Signature : S(setImmediate,2,,P(d3))
      * TE Signature : S(setImmediate,P(d3))
      * 
     */
    public native Number setImmediate(Object handler);
    /** 
      * Std Signature : S(setImmediate,2,,P(d3),P(D3))
      * TE Signature : S(setImmediate,P(d3),P(D3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@736294
      * VERSION 1
     */
    public native Number setImmediate(Object handler, Object... args);
    /** 
      * Std Signature : S(setImmediate,2,,P(dFP1--S(?,289,,P(d3))------)<3>))
      * TE Signature : S(setImmediate,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@736233
     */
    public native Number setImmediate(Action1<Object> handler);
}

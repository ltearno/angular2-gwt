package fr.lteconsulting.jsinterop.browser;

import fr.lteconsulting.prebuilt.Action1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: WindowTimers
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:735712
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="WindowTimers")
public class WindowTimersImpl implements WindowTimers
{

    /*
        Constructors
    */
    public WindowTimersImpl(Object value){
    }

    /*
        Methods
    */
    /** 
      * Std Signature : S(clearImmediate,289,,P(d2))
      * TE Signature : S(clearImmediate,P(d2))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void clearImmediate(Number handle);
    /** 
      * Std Signature : S(clearInterval,289,,P(d2))
      * TE Signature : S(clearInterval,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@735781
     */
    public native void clearInterval(Number handle);
    /** 
      * Std Signature : S(clearTimeout,289,,P(d2))
      * TE Signature : S(clearTimeout,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@735822
     */
    public native void clearTimeout(Number handle);
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
      * added from type hierarchy
     */
    public native Number setImmediate(Object handler, Object... args);
    /** 
      * Std Signature : S(setImmediate,2,,P(dFP1--S(?,289,,P(d3))------)<3>))
      * TE Signature : S(setImmediate,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Number setImmediate(Action1<Object> handler);
    /** 
      * Std Signature : S(setInterval,2,,P(d3))
      * TE Signature : S(setInterval,P(d3))
      * 
     */
    public native Number setInterval(Object handler);
    /** 
      * Std Signature : S(setInterval,2,,P(d3),P(d3))
      * TE Signature : S(setInterval,P(d3),P(d3))
      * 
     */
    public native Number setInterval(Object handler, Object timeout /* optional */);
    /** 
      * Std Signature : S(setInterval,2,,P(d3),P(d3),P(D3))
      * TE Signature : S(setInterval,P(d3),P(d3),P(D3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@735939
      * VERSION 1
     */
    public native Number setInterval(Object handler, Object timeout /* optional */, Object... args);
    /** 
      * Std Signature : S(setInterval,2,,P(dFP1--S(?,289,,P(d3))------)<3>),P(d2))
      * TE Signature : S(setInterval,P(dF--S(?,P(d3))------)),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@735862
     */
    public native Number setInterval(Action1<Object> handler, Number timeout);
    /** 
      * Std Signature : S(setTimeout,2,,P(d3))
      * TE Signature : S(setTimeout,P(d3))
      * 
     */
    public native Number setTimeout(Object handler);
    /** 
      * Std Signature : S(setTimeout,2,,P(d3),P(d3))
      * TE Signature : S(setTimeout,P(d3),P(d3))
      * 
     */
    public native Number setTimeout(Object handler, Object timeout /* optional */);
    /** 
      * Std Signature : S(setTimeout,2,,P(d3),P(d3),P(D3))
      * TE Signature : S(setTimeout,P(d3),P(d3),P(D3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@736085
      * VERSION 1
     */
    public native Number setTimeout(Object handler, Object timeout /* optional */, Object... args);
    /** 
      * Std Signature : S(setTimeout,2,,P(dFP1--S(?,289,,P(d3))------)<3>),P(d2))
      * TE Signature : S(setTimeout,P(dF--S(?,P(d3))------)),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@736009
     */
    public native Number setTimeout(Action1<Object> handler, Number timeout);
}

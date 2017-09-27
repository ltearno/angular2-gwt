package fr.lteconsulting.jsinterop.browser;

import fr.lteconsulting.prebuilt.Action1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: WindowTimers
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:735712
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface WindowTimers extends WindowTimersExtension
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(clearInterval,289,,P(d2))
      * TE Signature : S(clearInterval,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@735781
     */
    void clearInterval(Number handle);
    /** 
      * Std Signature : S(clearTimeout,289,,P(d2))
      * TE Signature : S(clearTimeout,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@735822
     */
    void clearTimeout(Number handle);
    /** 
      * Std Signature : S(setInterval,2,,P(d3))
      * TE Signature : S(setInterval,P(d3))
      * 
     */
    Number setInterval(Object handler);
    /** 
      * Std Signature : S(setInterval,2,,P(d3),P(d3))
      * TE Signature : S(setInterval,P(d3),P(d3))
      * 
     */
    Number setInterval(Object handler, Object timeout /* optional */);
    /** 
      * Std Signature : S(setInterval,2,,P(d3),P(d3),P(D3))
      * TE Signature : S(setInterval,P(d3),P(d3),P(D3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@735939
      * VERSION 1
     */
    Number setInterval(Object handler, Object timeout /* optional */, Object... args);
    /** 
      * Std Signature : S(setInterval,2,,P(dFP1--S(?,289,,P(d3))------)<3>),P(d2))
      * TE Signature : S(setInterval,P(dF--S(?,P(d3))------)),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@735862
     */
    Number setInterval(Action1<Object> handler, Number timeout);
    /** 
      * Std Signature : S(setTimeout,2,,P(d3))
      * TE Signature : S(setTimeout,P(d3))
      * 
     */
    Number setTimeout(Object handler);
    /** 
      * Std Signature : S(setTimeout,2,,P(d3),P(d3))
      * TE Signature : S(setTimeout,P(d3),P(d3))
      * 
     */
    Number setTimeout(Object handler, Object timeout /* optional */);
    /** 
      * Std Signature : S(setTimeout,2,,P(d3),P(d3),P(D3))
      * TE Signature : S(setTimeout,P(d3),P(d3),P(D3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@736085
      * VERSION 1
     */
    Number setTimeout(Object handler, Object timeout /* optional */, Object... args);
    /** 
      * Std Signature : S(setTimeout,2,,P(dFP1--S(?,289,,P(d3))------)<3>),P(d2))
      * TE Signature : S(setTimeout,P(dF--S(?,P(d3))------)),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@736009
     */
    Number setTimeout(Action1<Object> handler, Number timeout);
}

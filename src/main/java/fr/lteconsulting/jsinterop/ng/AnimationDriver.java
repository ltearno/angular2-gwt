package fr.lteconsulting.jsinterop.ng;

import fr.lteconsulting.jsinterop.browser.AnonymousType719;
import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/browser/src/render/animation_driver".AnimationDriver
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/browser/src/render/animation_driver.d.ts:790
  * 
 */
@JsType(isNative=true, namespace="ng", name="AnimationDriver")
public class AnimationDriver
{

    /*
        Static properties
    */

    @JsProperty(namespace="ng.AnimationDriver", name="NOOP")
    public static AnimationDriver NOOP;

    /*
        Methods
    */
    /** 
      * Std Signature : S(animate,3,,P(d3),P(d7<C(----U(-2,1)----)>),P(d2),P(d2))
      * TE Signature : S(animate,P(d3),P(d7),P(d2),P(d2))
      * 
     */
    public native Object animate(Object element, Array<AnonymousType719> keyframes, Number duration, Number delay);
    /** 
      * Std Signature : S(animate,3,,P(d3),P(d7<C(----U(-2,1)----)>),P(d2),P(d2),P(d1))
      * TE Signature : S(animate,P(d3),P(d7),P(d2),P(d2),P(d1))
      * 
     */
    public native Object animate(Object element, Array<AnonymousType719> keyframes, Number duration, Number delay, String easing /* optional */);
    /** 
      * Std Signature : S(animate,3,,P(d3),P(d7<C(----U(-2,1)----)>),P(d2),P(d2),P(d1),P(d7<3>))
      * TE Signature : S(animate,P(d3),P(d7),P(d2),P(d2),P(d1),P(d7))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/browser/src/render/animation_driver.d.ts@1194
     */
    public native Object animate(Object element, Array<AnonymousType719> keyframes, Number duration, Number delay, String easing /* optional */, Array<Object> previousPlayers /* optional */);
    /** 
      * Std Signature : S(computeStyle,1,,P(d3),P(d1))
      * TE Signature : S(computeStyle,P(d3),P(d1))
      * 
     */
    public native String computeStyle(Object element, String prop);
    /** 
      * Std Signature : S(computeStyle,1,,P(d3),P(d1),P(d1))
      * TE Signature : S(computeStyle,P(d3),P(d1),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/browser/src/render/animation_driver.d.ts@1108
     */
    public native String computeStyle(Object element, String prop, String defaultValue /* optional */);
    /** 
      * Std Signature : S(containsElement,27,,P(d3),P(d3))
      * TE Signature : S(containsElement,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/browser/src/render/animation_driver.d.ts@972
     */
    public native Boolean containsElement(Object elm1, Object elm2);
    /** 
      * Std Signature : S(matchesElement,27,,P(d3),P(d1))
      * TE Signature : S(matchesElement,P(d3),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/browser/src/render/animation_driver.d.ts@902
     */
    public native Boolean matchesElement(Object element, String selector);
    /** 
      * Std Signature : S(query,7<3>,,P(d3),P(d1),P(d27))
      * TE Signature : S(query,P(d3),P(d1),P(d27))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/browser/src/render/animation_driver.d.ts@1033
     */
    public native Array<Object> query(Object element, String selector, Boolean multi);
}

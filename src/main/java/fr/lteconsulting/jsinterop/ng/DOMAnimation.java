package fr.lteconsulting.jsinterop.ng;

import fr.lteconsulting.jsinterop.browser.Function;
import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/browser/src/render/web_animations/dom_animation".DOMAnimation
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/browser/src/render/web_animations/dom_animation.d.ts:0
  * 
 */
@JsType(isNative=true, namespace="ng", name="DOMAnimation")
public class DOMAnimation
{

    /*
        Properties
    */

    public Number currentTime;

    @JsProperty( name = "currentTime")
    public native Number getCurrentTime();

    @JsProperty( name = "currentTime")
    public native void setCurrentTime( Number value );

    public Function onfinish;

    @JsProperty( name = "onfinish")
    public native Function getOnfinish();

    @JsProperty( name = "onfinish")
    public native void setOnfinish( Function value );

    public Number position;

    @JsProperty( name = "position")
    public native Number getPosition();

    @JsProperty( name = "position")
    public native void setPosition( Number value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(addEventListener,3,,P(d1),P(dFP1-,R--S(?,4,,P(d3))------)<3,5>))
      * TE Signature : S(addEventListener,P(d1),P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/browser/src/render/web_animations/dom_animation.d.ts@387
     */
    public native Object addEventListener(String eventName, Function1<Object, Object> handler);
    /** 
      * Std Signature : S(cancel,429,,)
      * TE Signature : S(cancel,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/browser/src/render/web_animations/dom_animation.d.ts@239
     */
    public native void cancel();
    /** 
      * Std Signature : S(dispatchEvent,3,,P(d1))
      * TE Signature : S(dispatchEvent,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/browser/src/render/web_animations/dom_animation.d.ts@463
     */
    public native Object dispatchEvent(String eventName);
    /** 
      * Std Signature : S(finish,429,,)
      * TE Signature : S(finish,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/browser/src/render/web_animations/dom_animation.d.ts@296
     */
    public native void finish();
    /** 
      * Std Signature : S(pause,429,,)
      * TE Signature : S(pause,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/browser/src/render/web_animations/dom_animation.d.ts@277
     */
    public native void pause();
    /** 
      * Std Signature : S(play,429,,)
      * TE Signature : S(play,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/browser/src/render/web_animations/dom_animation.d.ts@259
     */
    public native void play();
}

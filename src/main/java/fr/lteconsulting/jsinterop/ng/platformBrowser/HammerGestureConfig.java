package fr.lteconsulting.jsinterop.ng.platformBrowser;

import fr.lteconsulting.jsinterop.browser.AnonymousType717;
import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.HTMLElement;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/events/hammer_gestures".HammerGestureConfig
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/events/hammer_gestures.d.ts:679
  * 
 */
@JsType(isNative=true, namespace="ng.platformBrowser", name="HammerGestureConfig")
public class HammerGestureConfig
{

    /*
        Properties
    */

    public Array<String> events;

    @JsProperty( name = "events")
    public native Array<String> getEvents();

    @JsProperty( name = "events")
    public native void setEvents( Array<String> value );

    public AnonymousType717 overrides;

    @JsProperty( name = "overrides")
    public native AnonymousType717 getOverrides();

    @JsProperty( name = "overrides")
    public native void setOverrides( AnonymousType717 value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(buildHammer,1245,,P(d240))
      * TE Signature : S(buildHammer,P(d240))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/events/hammer_gestures.d.ts@829
     */
    public native HammerInstance buildHammer(HTMLElement element);
}

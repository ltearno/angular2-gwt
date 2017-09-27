package fr.lteconsulting.jsinterop.ng.platformBrowser;

import fr.lteconsulting.jsinterop.browser.AnonymousType817;
import fr.lteconsulting.jsinterop.browser.Function;
import fr.lteconsulting.jsinterop.browser.KeyboardEvent;
import fr.lteconsulting.jsinterop.ng.core.NgZone;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/events/key_events".KeyEventsPlugin
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/events/key_events.d.ts:296
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.platformBrowser", name="KeyEventsPlugin")
public class KeyEventsPlugin extends EventManagerPlugin
{

    /*
        Constructors
    */
    public KeyEventsPlugin(Object doc){
        super(null);
    }

    /*
        Static methods
    */
    /** 
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/events/key_events.d.ts:553
     */
    @JsMethod(namespace="ng.platformBrowser.KeyEventsPlugin", name = "parseEventName")
    public static native AnonymousType817 parseEventName(String eventName);
    /** 
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/events/key_events.d.ts:646
     */
    @JsMethod(namespace="ng.platformBrowser.KeyEventsPlugin", name = "getEventFullKey")
    public static native String getEventFullKey(KeyboardEvent event);
    /** 
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/events/key_events.d.ts:704
     */
    @JsMethod(namespace="ng.platformBrowser.KeyEventsPlugin", name = "eventCallback")
    public static native Function eventCallback(Object fullKey, Function handler, NgZone zone);
}

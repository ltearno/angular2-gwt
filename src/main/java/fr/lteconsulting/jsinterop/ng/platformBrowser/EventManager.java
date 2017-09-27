package fr.lteconsulting.jsinterop.ng.platformBrowser;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.Function;
import fr.lteconsulting.jsinterop.browser.HTMLElement;
import fr.lteconsulting.jsinterop.ng.core.NgZone;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/events/event_manager".EventManager
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/events/event_manager.d.ts:359
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.platformBrowser", name="EventManager")
public class EventManager
{

    /*
        Constructors
    */
    public EventManager(Array<EventManagerPlugin> plugins, NgZone _zone){
    }

    /*
        Properties
    */

    public Object _eventNameToPlugin;

    @JsProperty( name = "_eventNameToPlugin")
    public native Object get_eventNameToPlugin();

    @JsProperty( name = "_eventNameToPlugin")
    public native void set_eventNameToPlugin( Object value );

    public Object _plugins;

    @JsProperty( name = "_plugins")
    public native Object get_plugins();

    @JsProperty( name = "_plugins")
    public native void set_plugins( Object value );

    public Object _zone;

    @JsProperty( name = "_zone")
    public native Object get_zone();

    @JsProperty( name = "_zone")
    public native void set_zone( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(addEventListener,205,,P(d240),P(d1),P(d205))
      * TE Signature : S(addEventListener,P(d240),P(d1),P(d205))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/events/event_manager.d.ts@555
     */
    public native Function addEventListener(HTMLElement element, String eventName, Function handler);
    /** 
      * Std Signature : S(addGlobalEventListener,205,,P(d1),P(d1),P(d205))
      * TE Signature : S(addGlobalEventListener,P(d1),P(d1),P(d205))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/events/event_manager.d.ts@647
     */
    public native Function addGlobalEventListener(String target, String eventName, Function handler);
    /** 
      * Std Signature : S(getZone,378,,)
      * TE Signature : S(getZone,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/events/event_manager.d.ts@739
     */
    public native NgZone getZone();
}

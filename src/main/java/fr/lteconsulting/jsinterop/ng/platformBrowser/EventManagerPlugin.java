package fr.lteconsulting.jsinterop.ng.platformBrowser;

import fr.lteconsulting.jsinterop.browser.Function;
import fr.lteconsulting.jsinterop.browser.HTMLElement;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/events/event_manager".EventManagerPlugin
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/events/event_manager.d.ts:759
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.platformBrowser", name="EventManagerPlugin")
public class EventManagerPlugin
{

    /*
        Constructors
    */
    public EventManagerPlugin(Object _doc){
    }

    /*
        Properties
    */

    public Object _doc;

    @JsProperty( name = "_doc")
    public native Object get_doc();

    @JsProperty( name = "_doc")
    public native void set_doc( Object value );

    public EventManager manager;

    @JsProperty( name = "manager")
    public native EventManager getManager();

    @JsProperty( name = "manager")
    public native void setManager( EventManager value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(addEventListener,205,,P(d240),P(d1),P(d205))
      * TE Signature : S(addEventListener,P(d240),P(d1),P(d205))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/events/event_manager.d.ts@939
     */
    public native Function addEventListener(HTMLElement element, String eventName, Function handler);
    /** 
      * Std Signature : S(addGlobalEventListener,205,,P(d1),P(d1),P(d205))
      * TE Signature : S(addGlobalEventListener,P(d1),P(d1),P(d205))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/events/event_manager.d.ts@1040
     */
    public native Function addGlobalEventListener(String element, String eventName, Function handler);
    /** 
      * Std Signature : S(supports,27,,P(d1))
      * TE Signature : S(supports,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/events/event_manager.d.ts@888
     */
    public native Boolean supports(String eventName);
}

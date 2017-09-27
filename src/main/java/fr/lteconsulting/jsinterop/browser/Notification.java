package fr.lteconsulting.jsinterop.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: Notification
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:535754
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:536514
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Notification")
public class Notification implements EventTarget
{

    /*
        Constructors
    */
    public Notification(String title, NotificationOptions options){
    }

    /*
        Static methods
    */
    /** 
      * source : apis/browser-api/tsd/lib.es6.d.ts:536633
     */
    @JsMethod(namespace="Notification", name = "requestPermission")
    public static native Promise<String> requestPermission(NotificationPermissionCallback callback /* optional */);

    /*
        Properties
    */

    public String body;

    @JsProperty( name = "body")
    public native String getBody();

    @JsProperty( name = "body")
    public native void setBody( String value );

    public String dir;

    @JsProperty( name = "dir")
    public native String getDir();

    @JsProperty( name = "dir")
    public native void setDir( String value );

    public String icon;

    @JsProperty( name = "icon")
    public native String getIcon();

    @JsProperty( name = "icon")
    public native void setIcon( String value );

    public String lang;

    @JsProperty( name = "lang")
    public native String getLang();

    @JsProperty( name = "lang")
    public native void setLang( String value );

    public Function1<Event, Object> onclick;

    @JsProperty( name = "onclick")
    public native Function1<Event, Object> getOnclick();

    @JsProperty( name = "onclick")
    public native void setOnclick( Function1<Event, Object> value );

    public Function1<Event, Object> onclose;

    @JsProperty( name = "onclose")
    public native Function1<Event, Object> getOnclose();

    @JsProperty( name = "onclose")
    public native void setOnclose( Function1<Event, Object> value );

    public Function1<Event, Object> onerror;

    @JsProperty( name = "onerror")
    public native Function1<Event, Object> getOnerror();

    @JsProperty( name = "onerror")
    public native void setOnerror( Function1<Event, Object> value );

    public Function1<Event, Object> onshow;

    @JsProperty( name = "onshow")
    public native Function1<Event, Object> getOnshow();

    @JsProperty( name = "onshow")
    public native void setOnshow( Function1<Event, Object> value );

    public String permission;

    @JsProperty( name = "permission")
    public native String getPermission();

    @JsProperty( name = "permission")
    public native void setPermission( String value );

    public String tag;

    @JsProperty( name = "tag")
    public native String getTag();

    @JsProperty( name = "tag")
    public native void setTag( String value );

    public String title;

    @JsProperty( name = "title")
    public native String getTitle();

    @JsProperty( name = "title")
    public native void setTitle( String value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(addEventListener,289,,P(d1))
      * TE Signature : S(addEventListener,P(d1))
      * 
     */
    public native void addEventListener(String type);
    /** 
      * Std Signature : S(addEventListener,289,,P(d1),P(d138))
      * TE Signature : S(addEventListener,P(d1),P(d138))
      * 
     */
    public native void addEventListener(String type, EventListenerObject listener /* optional */);
    /** 
      * Std Signature : S(addEventListener,289,,P(d1),P(d138),P(d27))
      * TE Signature : S(addEventListener,P(d1),P(d138),P(d27))
      * 
     */
    public native void addEventListener(String type, EventListenerObject listener /* optional */, Boolean useCapture /* optional */);
    /** 
      * Std Signature : S(addEventListener,289,,P(d1),P(dF--S(?,289,,P(d77))------)))
      * TE Signature : S(addEventListener,P(d1),P(dF--S(?,P(d77))------)))
      * 
     */
    public native void addEventListener(String type, EventListener listener /* optional */);
    /** 
      * Std Signature : S(addEventListener,289,,P(d1),P(dF--S(?,289,,P(d77))------)),P(d27))
      * TE Signature : S(addEventListener,P(d1),P(dF--S(?,P(d77))------)),P(d27))
      * 
     */
    public native void addEventListener(String type, EventListener listener /* optional */, Boolean useCapture /* optional */);
    /** 
      * Std Signature : S(addEventListener,289,,P(d1),P(dU(-F--S(?,289,,P(d77))------),138)))
      * TE Signature : S(addEventListener,P(d1),P(dU(-F--S(?,P(d77))------),138)))
      * 
     */
    public native void addEventListener(String type, EventListenerOrEventListenerObject_UnionOfEventListenerAndEventListenerObject listener /* optional */);
    /** 
      * Std Signature : S(addEventListener,289,,P(d1),P(dU(-F--S(?,289,,P(d77))------),138)),P(d27))
      * TE Signature : S(addEventListener,P(d1),P(dU(-F--S(?,P(d77))------),138)),P(d27))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void addEventListener(String type, EventListenerOrEventListenerObject_UnionOfEventListenerAndEventListenerObject listener /* optional */, Boolean useCapture /* optional */);
    /** 
      * Std Signature : S(close,289,,)
      * TE Signature : S(close,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@536210
     */
    public native void close();
    /** 
      * Std Signature : S(dispatchEvent,27,,P(d77))
      * TE Signature : S(dispatchEvent,P(d77))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Boolean dispatchEvent(Event evt);
    /** 
      * Std Signature : S(removeEventListener,289,,P(d1))
      * TE Signature : S(removeEventListener,P(d1))
      * 
     */
    public native void removeEventListener(String type);
    /** 
      * Std Signature : S(removeEventListener,289,,P(d1),P(d138))
      * TE Signature : S(removeEventListener,P(d1),P(d138))
      * 
     */
    public native void removeEventListener(String type, EventListenerObject listener /* optional */);
    /** 
      * Std Signature : S(removeEventListener,289,,P(d1),P(d138),P(d27))
      * TE Signature : S(removeEventListener,P(d1),P(d138),P(d27))
      * 
     */
    public native void removeEventListener(String type, EventListenerObject listener /* optional */, Boolean useCapture /* optional */);
    /** 
      * Std Signature : S(removeEventListener,289,,P(d1),P(dF--S(?,289,,P(d77))------)))
      * TE Signature : S(removeEventListener,P(d1),P(dF--S(?,P(d77))------)))
      * 
     */
    public native void removeEventListener(String type, EventListener listener /* optional */);
    /** 
      * Std Signature : S(removeEventListener,289,,P(d1),P(dF--S(?,289,,P(d77))------)),P(d27))
      * TE Signature : S(removeEventListener,P(d1),P(dF--S(?,P(d77))------)),P(d27))
      * 
     */
    public native void removeEventListener(String type, EventListener listener /* optional */, Boolean useCapture /* optional */);
    /** 
      * Std Signature : S(removeEventListener,289,,P(d1),P(dU(-F--S(?,289,,P(d77))------),138)))
      * TE Signature : S(removeEventListener,P(d1),P(dU(-F--S(?,P(d77))------),138)))
      * 
     */
    public native void removeEventListener(String type, EventListenerOrEventListenerObject_UnionOfEventListenerAndEventListenerObject listener /* optional */);
    /** 
      * Std Signature : S(removeEventListener,289,,P(d1),P(dU(-F--S(?,289,,P(d77))------),138)),P(d27))
      * TE Signature : S(removeEventListener,P(d1),P(dU(-F--S(?,P(d77))------),138)),P(d27))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void removeEventListener(String type, EventListenerOrEventListenerObject_UnionOfEventListenerAndEventListenerObject listener /* optional */, Boolean useCapture /* optional */);
}

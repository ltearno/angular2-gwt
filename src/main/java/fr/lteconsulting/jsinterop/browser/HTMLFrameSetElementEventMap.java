package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: HTMLFrameSetElementEventMap
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:414584
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLFrameSetElementEventMap")
public class HTMLFrameSetElementEventMap extends HTMLElementEventMap
{

    /*
        Properties
    */

    public Event afterprint;

    @JsProperty( name = "afterprint")
    public native Event getAfterprint();

    @JsProperty( name = "afterprint")
    public native void setAfterprint( Event value );

    public Event beforeprint;

    @JsProperty( name = "beforeprint")
    public native Event getBeforeprint();

    @JsProperty( name = "beforeprint")
    public native void setBeforeprint( Event value );

    public BeforeUnloadEvent beforeunload;

    @JsProperty( name = "beforeunload")
    public native BeforeUnloadEvent getBeforeunload();

    @JsProperty( name = "beforeunload")
    public native void setBeforeunload( BeforeUnloadEvent value );

    public HashChangeEvent hashchange;

    @JsProperty( name = "hashchange")
    public native HashChangeEvent getHashchange();

    @JsProperty( name = "hashchange")
    public native void setHashchange( HashChangeEvent value );

    public MessageEvent message;

    @JsProperty( name = "message")
    public native MessageEvent getMessage();

    @JsProperty( name = "message")
    public native void setMessage( MessageEvent value );

    public Event offline;

    @JsProperty( name = "offline")
    public native Event getOffline();

    @JsProperty( name = "offline")
    public native void setOffline( Event value );

    public Event online;

    @JsProperty( name = "online")
    public native Event getOnline();

    @JsProperty( name = "online")
    public native void setOnline( Event value );

    public Event orientationchange;

    @JsProperty( name = "orientationchange")
    public native Event getOrientationchange();

    @JsProperty( name = "orientationchange")
    public native void setOrientationchange( Event value );

    public PageTransitionEvent pagehide;

    @JsProperty( name = "pagehide")
    public native PageTransitionEvent getPagehide();

    @JsProperty( name = "pagehide")
    public native void setPagehide( PageTransitionEvent value );

    public PageTransitionEvent pageshow;

    @JsProperty( name = "pageshow")
    public native PageTransitionEvent getPageshow();

    @JsProperty( name = "pageshow")
    public native void setPageshow( PageTransitionEvent value );

    public PopStateEvent popstate;

    @JsProperty( name = "popstate")
    public native PopStateEvent getPopstate();

    @JsProperty( name = "popstate")
    public native void setPopstate( PopStateEvent value );

    public UIEvent resize;

    @JsProperty( name = "resize")
    public native UIEvent getResize();

    @JsProperty( name = "resize")
    public native void setResize( UIEvent value );

    public StorageEvent storage;

    @JsProperty( name = "storage")
    public native StorageEvent getStorage();

    @JsProperty( name = "storage")
    public native void setStorage( StorageEvent value );

    public Event unload;

    @JsProperty( name = "unload")
    public native Event getUnload();

    @JsProperty( name = "unload")
    public native void setUnload( Event value );
}

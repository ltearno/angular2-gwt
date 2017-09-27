package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: NotificationEventMap
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:535639
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="NotificationEventMap")
public class NotificationEventMap
{

    /*
        Properties
    */

    public Event click;

    @JsProperty( name = "click")
    public native Event getClick();

    @JsProperty( name = "click")
    public native void setClick( Event value );

    public Event close;

    @JsProperty( name = "close")
    public native Event getClose();

    @JsProperty( name = "close")
    public native void setClose( Event value );

    public Event error;

    @JsProperty( name = "error")
    public native Event getError();

    @JsProperty( name = "error")
    public native void setError( Event value );

    public Event show;

    @JsProperty( name = "show")
    public native Event getShow();

    @JsProperty( name = "show")
    public native void setShow( Event value );
}

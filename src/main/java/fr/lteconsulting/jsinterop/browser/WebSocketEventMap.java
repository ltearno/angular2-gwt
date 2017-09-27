package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: WebSocketEventMap
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:702234
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="WebSocketEventMap")
public class WebSocketEventMap
{

    /*
        Properties
    */

    public CloseEvent close;

    @JsProperty( name = "close")
    public native CloseEvent getClose();

    @JsProperty( name = "close")
    public native void setClose( CloseEvent value );

    public Event error;

    @JsProperty( name = "error")
    public native Event getError();

    @JsProperty( name = "error")
    public native void setError( Event value );

    public MessageEvent message;

    @JsProperty( name = "message")
    public native MessageEvent getMessage();

    @JsProperty( name = "message")
    public native void setMessage( MessageEvent value );

    public Event open;

    @JsProperty( name = "open")
    public native Event getOpen();

    @JsProperty( name = "open")
    public native void setOpen( Event value );
}

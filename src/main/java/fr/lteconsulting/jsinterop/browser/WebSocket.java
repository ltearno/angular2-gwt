package fr.lteconsulting.jsinterop.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: WebSocket
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:702360
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:703276
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="WebSocket")
public class WebSocket implements EventTarget
{

    /*
        Constructors
    */
    public WebSocket(String url, UnionOfArrayOfStringAndString protocols){
    }

    /*
        Static properties
    */

    @JsProperty(namespace="WebSocket", name="CLOSED")
    public static Number CLOSED;

    @JsProperty(namespace="WebSocket", name="CLOSING")
    public static Number CLOSING;

    @JsProperty(namespace="WebSocket", name="CONNECTING")
    public static Number CONNECTING;

    @JsProperty(namespace="WebSocket", name="OPEN")
    public static Number OPEN;

    /*
        Properties
    */

    public String binaryType;

    @JsProperty( name = "binaryType")
    public native String getBinaryType();

    @JsProperty( name = "binaryType")
    public native void setBinaryType( String value );

    public Number bufferedAmount;

    @JsProperty( name = "bufferedAmount")
    public native Number getBufferedAmount();

    @JsProperty( name = "bufferedAmount")
    public native void setBufferedAmount( Number value );

    public String extensions;

    @JsProperty( name = "extensions")
    public native String getExtensions();

    @JsProperty( name = "extensions")
    public native void setExtensions( String value );

    public Function1<CloseEvent, Object> onclose;

    @JsProperty( name = "onclose")
    public native Function1<CloseEvent, Object> getOnclose();

    @JsProperty( name = "onclose")
    public native void setOnclose( Function1<CloseEvent, Object> value );

    public Function1<Event, Object> onerror;

    @JsProperty( name = "onerror")
    public native Function1<Event, Object> getOnerror();

    @JsProperty( name = "onerror")
    public native void setOnerror( Function1<Event, Object> value );

    public Function1<MessageEvent, Object> onmessage;

    @JsProperty( name = "onmessage")
    public native Function1<MessageEvent, Object> getOnmessage();

    @JsProperty( name = "onmessage")
    public native void setOnmessage( Function1<MessageEvent, Object> value );

    public Function1<Event, Object> onopen;

    @JsProperty( name = "onopen")
    public native Function1<Event, Object> getOnopen();

    @JsProperty( name = "onopen")
    public native void setOnopen( Function1<Event, Object> value );

    public String protocol;

    @JsProperty( name = "protocol")
    public native String getProtocol();

    @JsProperty( name = "protocol")
    public native void setProtocol( String value );

    public Number readyState;

    @JsProperty( name = "readyState")
    public native Number getReadyState();

    @JsProperty( name = "readyState")
    public native void setReadyState( Number value );

    public String url;

    @JsProperty( name = "url")
    public native String getUrl();

    @JsProperty( name = "url")
    public native void setUrl( String value );

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
    public native void close();
    /** 
      * Std Signature : S(close,289,,P(d2))
      * TE Signature : S(close,P(d2))
      * 
     */
    public native void close(Number code /* optional */);
    /** 
      * Std Signature : S(close,289,,P(d2),P(d1))
      * TE Signature : S(close,P(d2),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@702805
     */
    public native void close(Number code /* optional */, String reason /* optional */);
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
    /** 
      * Std Signature : S(send,289,,P(d3))
      * TE Signature : S(send,P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@702854
     */
    public native void send(Object data);
}

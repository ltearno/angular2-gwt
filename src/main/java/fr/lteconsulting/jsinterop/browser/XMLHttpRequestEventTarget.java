package fr.lteconsulting.jsinterop.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: XMLHttpRequestEventTarget
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:736575
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="XMLHttpRequestEventTarget")
public class XMLHttpRequestEventTarget
{

    /*
        Properties
    */

    public Function1<Event, Object> onabort;

    @JsProperty( name = "onabort")
    public native Function1<Event, Object> getOnabort();

    @JsProperty( name = "onabort")
    public native void setOnabort( Function1<Event, Object> value );

    public Function1<ErrorEvent, Object> onerror;

    @JsProperty( name = "onerror")
    public native Function1<ErrorEvent, Object> getOnerror();

    @JsProperty( name = "onerror")
    public native void setOnerror( Function1<ErrorEvent, Object> value );

    public Function1<Event, Object> onload;

    @JsProperty( name = "onload")
    public native Function1<Event, Object> getOnload();

    @JsProperty( name = "onload")
    public native void setOnload( Function1<Event, Object> value );

    public Function1<ProgressEvent, Object> onloadend;

    @JsProperty( name = "onloadend")
    public native Function1<ProgressEvent, Object> getOnloadend();

    @JsProperty( name = "onloadend")
    public native void setOnloadend( Function1<ProgressEvent, Object> value );

    public Function1<Event, Object> onloadstart;

    @JsProperty( name = "onloadstart")
    public native Function1<Event, Object> getOnloadstart();

    @JsProperty( name = "onloadstart")
    public native void setOnloadstart( Function1<Event, Object> value );

    public Function1<ProgressEvent, Object> onprogress;

    @JsProperty( name = "onprogress")
    public native Function1<ProgressEvent, Object> getOnprogress();

    @JsProperty( name = "onprogress")
    public native void setOnprogress( Function1<ProgressEvent, Object> value );

    public Function1<ProgressEvent, Object> ontimeout;

    @JsProperty( name = "ontimeout")
    public native Function1<ProgressEvent, Object> getOntimeout();

    @JsProperty( name = "ontimeout")
    public native void setOntimeout( Function1<ProgressEvent, Object> value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(addEventListener,289,,P(d1),P(d138))
      * TE Signature : S(addEventListener,P(d1),P(d138))
      * 
     */
    public native void addEventListener(String type, EventListenerObject listener);
    /** 
      * Std Signature : S(addEventListener,289,,P(d1),P(d138),P(d27))
      * TE Signature : S(addEventListener,P(d1),P(d138),P(d27))
      * 
     */
    public native void addEventListener(String type, EventListenerObject listener, Boolean useCapture /* optional */);
    /** 
      * Std Signature : S(addEventListener,289,,P(d1),P(dF--S(?,289,,P(d77))------)))
      * TE Signature : S(addEventListener,P(d1),P(dF--S(?,P(d77))------)))
      * 
     */
    public native void addEventListener(String type, EventListener listener);
    /** 
      * Std Signature : S(addEventListener,289,,P(d1),P(dF--S(?,289,,P(d77))------)),P(d27))
      * TE Signature : S(addEventListener,P(d1),P(dF--S(?,P(d77))------)),P(d27))
      * 
     */
    public native void addEventListener(String type, EventListener listener, Boolean useCapture /* optional */);
    /** 
      * Std Signature : S(addEventListener,289,,P(d1),P(dU(-F--S(?,289,,P(d77))------),138)))
      * TE Signature : S(addEventListener,P(d1),P(dU(-F--S(?,P(d77))------),138)))
      * 
     */
    public native void addEventListener(String type, EventListenerOrEventListenerObject_UnionOfEventListenerAndEventListenerObject listener);
    /** 
      * Std Signature : S(addEventListener,289,,P(d1),P(dU(-F--S(?,289,,P(d77))------),138)),P(d27))
      * TE Signature : S(addEventListener,P(d1),P(dU(-F--S(?,P(d77))------),138)),P(d27))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@737324
     */
    public native void addEventListener(String type, EventListenerOrEventListenerObject_UnionOfEventListenerAndEventListenerObject listener, Boolean useCapture /* optional */);
}

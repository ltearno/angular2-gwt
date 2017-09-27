package fr.lteconsulting.jsinterop.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: XMLHttpRequest
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:717159
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:718561
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="XMLHttpRequest")
public class XMLHttpRequest extends XMLHttpRequestEventTarget implements EventTarget
{

    /*
        Constructors
    */
    public XMLHttpRequest(){
    }

    /*
        Static properties
    */

    @JsProperty(namespace="XMLHttpRequest", name="DONE")
    public static Number DONE;

    @JsProperty(namespace="XMLHttpRequest", name="HEADERS_RECEIVED")
    public static Number HEADERS_RECEIVED;

    @JsProperty(namespace="XMLHttpRequest", name="LOADING")
    public static Number LOADING;

    @JsProperty(namespace="XMLHttpRequest", name="OPENED")
    public static Number OPENED;

    @JsProperty(namespace="XMLHttpRequest", name="UNSENT")
    public static Number UNSENT;

    /*
        Properties
    */

    public String msCaching;

    @JsProperty( name = "msCaching")
    public native String getMsCaching();

    @JsProperty( name = "msCaching")
    public native void setMsCaching( String value );

    public Function1<Event, Object> onreadystatechange;

    @JsProperty( name = "onreadystatechange")
    public native Function1<Event, Object> getOnreadystatechange();

    @JsProperty( name = "onreadystatechange")
    public native void setOnreadystatechange( Function1<Event, Object> value );

    public Number readyState;

    @JsProperty( name = "readyState")
    public native Number getReadyState();

    @JsProperty( name = "readyState")
    public native void setReadyState( Number value );

    public Object response;

    @JsProperty( name = "response")
    public native Object getResponse();

    @JsProperty( name = "response")
    public native void setResponse( Object value );

    public String responseText;

    @JsProperty( name = "responseText")
    public native String getResponseText();

    @JsProperty( name = "responseText")
    public native void setResponseText( String value );

    public String responseType;

    @JsProperty( name = "responseType")
    public native String getResponseType();

    @JsProperty( name = "responseType")
    public native void setResponseType( String value );

    public String responseURL;

    @JsProperty( name = "responseURL")
    public native String getResponseURL();

    @JsProperty( name = "responseURL")
    public native void setResponseURL( String value );

    public Document responseXML;

    @JsProperty( name = "responseXML")
    public native Document getResponseXML();

    @JsProperty( name = "responseXML")
    public native void setResponseXML( Document value );

    public Number status;

    @JsProperty( name = "status")
    public native Number getStatus();

    @JsProperty( name = "status")
    public native void setStatus( Number value );

    public String statusText;

    @JsProperty( name = "statusText")
    public native String getStatusText();

    @JsProperty( name = "statusText")
    public native void setStatusText( String value );

    public Number timeout;

    @JsProperty( name = "timeout")
    public native Number getTimeout();

    @JsProperty( name = "timeout")
    public native void setTimeout( Number value );

    public XMLHttpRequestUpload upload;

    @JsProperty( name = "upload")
    public native XMLHttpRequestUpload getUpload();

    @JsProperty( name = "upload")
    public native void setUpload( XMLHttpRequestUpload value );

    public Boolean withCredentials;

    @JsProperty( name = "withCredentials")
    public native Boolean getWithCredentials();

    @JsProperty( name = "withCredentials")
    public native void setWithCredentials( Boolean value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(abort,289,,)
      * TE Signature : S(abort,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@717684
     */
    public native void abort();
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
      * Std Signature : S(dispatchEvent,27,,P(d77))
      * TE Signature : S(dispatchEvent,P(d77))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Boolean dispatchEvent(Event evt);
    /** 
      * Std Signature : S(getAllResponseHeaders,1,,)
      * TE Signature : S(getAllResponseHeaders,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@717703
     */
    public native String getAllResponseHeaders();
    /** 
      * Std Signature : S(getResponseHeader,1,,P(d1))
      * TE Signature : S(getResponseHeader,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@717740
     */
    public native String getResponseHeader(String header);
    /** 
      * Std Signature : S(msCachingEnabled,27,,)
      * TE Signature : S(msCachingEnabled,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@717794
     */
    public native Boolean msCachingEnabled();
    /** 
      * Std Signature : S(open,289,,P(d1),P(d1))
      * TE Signature : S(open,P(d1),P(d1))
      * 
     */
    public native void open(String method, String url);
    /** 
      * Std Signature : S(open,289,,P(d1),P(d1),P(d27))
      * TE Signature : S(open,P(d1),P(d1),P(d27))
      * 
     */
    public native void open(String method, String url, Boolean async /* optional */);
    /** 
      * Std Signature : S(open,289,,P(d1),P(d1),P(d27),P(d1))
      * TE Signature : S(open,P(d1),P(d1),P(d27),P(d1))
      * 
     */
    public native void open(String method, String url, Boolean async /* optional */, String user /* optional */);
    /** 
      * Std Signature : S(open,289,,P(d1),P(d1),P(d27),P(d1),P(d1))
      * TE Signature : S(open,P(d1),P(d1),P(d27),P(d1),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@717827
     */
    public native void open(String method, String url, Boolean async /* optional */, String user /* optional */, String password /* optional */);
    /** 
      * Std Signature : S(overrideMimeType,289,,P(d1))
      * TE Signature : S(overrideMimeType,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@717923
     */
    public native void overrideMimeType(String mime);
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
      * Std Signature : S(send,289,,)
      * TE Signature : S(send,)
      * 
     */
    public native void send();
    /** 
      * Std Signature : S(send,289,,P(d1))
      * TE Signature : S(send,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@717998
      * VERSION 1
     */
    public native void send(String data /* optional */);
    /** 
      * Std Signature : S(send,289,,P(d281))
      * TE Signature : S(send,P(d281))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@717965
     */
    public native void send(Document data /* optional */);
    /** 
      * Std Signature : S(send,289,,P(d3))
      * TE Signature : S(send,P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@718029
      * VERSION 2
     */
    public native void send(Object data /* optional */);
    /** 
      * Std Signature : S(setRequestHeader,289,,P(d1),P(d1))
      * TE Signature : S(setRequestHeader,P(d1),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@718057
     */
    public native void setRequestHeader(String header, String value);
}

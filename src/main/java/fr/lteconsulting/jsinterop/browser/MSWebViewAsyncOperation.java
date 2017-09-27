package fr.lteconsulting.jsinterop.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MSWebViewAsyncOperation
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:514729
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:515678
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSWebViewAsyncOperation")
public class MSWebViewAsyncOperation implements EventTarget
{

    /*
        Constructors
    */
    public MSWebViewAsyncOperation(){
    }

    /*
        Static properties
    */

    @JsProperty(namespace="MSWebViewAsyncOperation", name="COMPLETED")
    public static Number COMPLETED;

    @JsProperty(namespace="MSWebViewAsyncOperation", name="ERROR")
    public static Number ERROR;

    @JsProperty(namespace="MSWebViewAsyncOperation", name="STARTED")
    public static Number STARTED;

    @JsProperty(namespace="MSWebViewAsyncOperation", name="TYPE_CAPTURE_PREVIEW_TO_RANDOM_ACCESS_STREAM")
    public static Number TYPE_CAPTURE_PREVIEW_TO_RANDOM_ACCESS_STREAM;

    @JsProperty(namespace="MSWebViewAsyncOperation", name="TYPE_CREATE_DATA_PACKAGE_FROM_SELECTION")
    public static Number TYPE_CREATE_DATA_PACKAGE_FROM_SELECTION;

    @JsProperty(namespace="MSWebViewAsyncOperation", name="TYPE_INVOKE_SCRIPT")
    public static Number TYPE_INVOKE_SCRIPT;

    /*
        Properties
    */

    public DOMError error;

    @JsProperty( name = "error")
    public native DOMError getError();

    @JsProperty( name = "error")
    public native void setError( DOMError value );

    public Function1<Event, Object> oncomplete;

    @JsProperty( name = "oncomplete")
    public native Function1<Event, Object> getOncomplete();

    @JsProperty( name = "oncomplete")
    public native void setOncomplete( Function1<Event, Object> value );

    public Function1<Event, Object> onerror;

    @JsProperty( name = "onerror")
    public native Function1<Event, Object> getOnerror();

    @JsProperty( name = "onerror")
    public native void setOnerror( Function1<Event, Object> value );

    public Number readyState;

    @JsProperty( name = "readyState")
    public native Number getReadyState();

    @JsProperty( name = "readyState")
    public native void setReadyState( Number value );

    public Object result;

    @JsProperty( name = "result")
    public native Object getResult();

    @JsProperty( name = "result")
    public native void setResult( Object value );

    public MSHTMLWebViewElement target;

    @JsProperty( name = "target")
    public native MSHTMLWebViewElement getTarget();

    @JsProperty( name = "target")
    public native void setTarget( MSHTMLWebViewElement value );

    public Number type;

    @JsProperty( name = "type")
    public native Number getType();

    @JsProperty( name = "type")
    public native void setType( Number value );

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
      * Std Signature : S(start,289,,)
      * TE Signature : S(start,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@515081
     */
    public native void start();
}

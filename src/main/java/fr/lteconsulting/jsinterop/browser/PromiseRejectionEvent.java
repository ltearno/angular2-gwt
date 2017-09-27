package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: PromiseRejectionEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:744429
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="PromiseRejectionEvent")
public class PromiseRejectionEvent extends Event
{

    /*
        Constructors
    */
    public PromiseRejectionEvent(String typeArg, EventInit eventInitDict){
        super(null, null);
    }

    /*
        Properties
    */

    public PromiseLike<Object> promise;

    @JsProperty( name = "promise")
    public native PromiseLike<Object> getPromise();

    @JsProperty( name = "promise")
    public native void setPromise( PromiseLike<Object> value );

    public Object reason;

    @JsProperty( name = "reason")
    public native Object getReason();

    @JsProperty( name = "reason")
    public native void setReason( Object value );
}

package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: IDBTransactionEventMap
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:495495
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="IDBTransactionEventMap")
public class IDBTransactionEventMap
{

    /*
        Properties
    */

    public Event abort;

    @JsProperty( name = "abort")
    public native Event getAbort();

    @JsProperty( name = "abort")
    public native void setAbort( Event value );

    public Event complete;

    @JsProperty( name = "complete")
    public native Event getComplete();

    @JsProperty( name = "complete")
    public native void setComplete( Event value );

    public Event error;

    @JsProperty( name = "error")
    public native Event getError();

    @JsProperty( name = "error")
    public native void setError( Event value );
}

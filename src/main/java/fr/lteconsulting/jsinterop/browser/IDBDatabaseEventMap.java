package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: IDBDatabaseEventMap
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:490770
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="IDBDatabaseEventMap")
public class IDBDatabaseEventMap
{

    /*
        Properties
    */

    public Event abort;

    @JsProperty( name = "abort")
    public native Event getAbort();

    @JsProperty( name = "abort")
    public native void setAbort( Event value );

    public Event error;

    @JsProperty( name = "error")
    public native Event getError();

    @JsProperty( name = "error")
    public native void setError( Event value );
}

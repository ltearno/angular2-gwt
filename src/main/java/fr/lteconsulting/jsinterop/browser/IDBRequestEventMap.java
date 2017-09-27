package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: IDBRequestEventMap
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:494739
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="IDBRequestEventMap")
public class IDBRequestEventMap
{

    /*
        Properties
    */

    public Event error;

    @JsProperty( name = "error")
    public native Event getError();

    @JsProperty( name = "error")
    public native void setError( Event value );

    public Event success;

    @JsProperty( name = "success")
    public native Event getSuccess();

    @JsProperty( name = "success")
    public native void setSuccess( Event value );
}

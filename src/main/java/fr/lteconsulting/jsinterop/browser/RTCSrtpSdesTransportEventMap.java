package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RTCSrtpSdesTransportEventMap
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:564857
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCSrtpSdesTransportEventMap")
public class RTCSrtpSdesTransportEventMap
{

    /*
        Properties
    */

    public Event error;

    @JsProperty( name = "error")
    public native Event getError();

    @JsProperty( name = "error")
    public native void setError( Event value );
}

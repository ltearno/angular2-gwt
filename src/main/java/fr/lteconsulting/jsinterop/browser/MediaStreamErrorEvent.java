package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MediaStreamErrorEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:522566
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:522675
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MediaStreamErrorEvent")
public class MediaStreamErrorEvent extends Event
{

    /*
        Constructors
    */
    public MediaStreamErrorEvent(String typeArg, MediaStreamErrorEventInit eventInitDict){
        super(null, null);
    }

    /*
        Properties
    */

    public MediaStreamError error;

    @JsProperty( name = "error")
    public native MediaStreamError getError();

    @JsProperty( name = "error")
    public native void setError( MediaStreamError value );
}

package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MediaStreamErrorEventInit
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:268678
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MediaStreamErrorEventInit")
public class MediaStreamErrorEventInit extends EventInit
{

    /*
        Properties
    */

    public MediaStreamError error;

    @JsProperty( name = "error")
    public native MediaStreamError getError();

    @JsProperty( name = "error")
    public native void setError( MediaStreamError value );
}

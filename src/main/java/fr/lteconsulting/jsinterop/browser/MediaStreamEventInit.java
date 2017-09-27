package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MediaStreamEventInit
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:268767
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MediaStreamEventInit")
public class MediaStreamEventInit extends EventInit
{

    /*
        Properties
    */

    public MediaStream stream;

    @JsProperty( name = "stream")
    public native MediaStream getStream();

    @JsProperty( name = "stream")
    public native void setStream( MediaStream value );
}

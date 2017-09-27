package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MediaKeySystemMediaCapability
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:268454
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MediaKeySystemMediaCapability")
public class MediaKeySystemMediaCapability
{

    /*
        Properties
    */

    public String contentType;

    @JsProperty( name = "contentType")
    public native String getContentType();

    @JsProperty( name = "contentType")
    public native void setContentType( String value );

    public String robustness;

    @JsProperty( name = "robustness")
    public native String getRobustness();

    @JsProperty( name = "robustness")
    public native void setRobustness( String value );
}

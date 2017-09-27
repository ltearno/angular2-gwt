package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MediaError
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:517661
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:517978
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MediaError")
public class MediaError
{

    /*
        Constructors
    */
    public MediaError(){
    }

    /*
        Static properties
    */

    @JsProperty(namespace="MediaError", name="MEDIA_ERR_ABORTED")
    public static Number MEDIA_ERR_ABORTED;

    @JsProperty(namespace="MediaError", name="MEDIA_ERR_DECODE")
    public static Number MEDIA_ERR_DECODE;

    @JsProperty(namespace="MediaError", name="MEDIA_ERR_NETWORK")
    public static Number MEDIA_ERR_NETWORK;

    @JsProperty(namespace="MediaError", name="MEDIA_ERR_SRC_NOT_SUPPORTED")
    public static Number MEDIA_ERR_SRC_NOT_SUPPORTED;

    @JsProperty(namespace="MediaError", name="MS_MEDIA_ERR_ENCRYPTED")
    public static Number MS_MEDIA_ERR_ENCRYPTED;

    /*
        Properties
    */

    public Number code;

    @JsProperty( name = "code")
    public native Number getCode();

    @JsProperty( name = "code")
    public native void setCode( Number value );

    public Number msExtendedCode;

    @JsProperty( name = "msExtendedCode")
    public native Number getMsExtendedCode();

    @JsProperty( name = "msExtendedCode")
    public native void setMsExtendedCode( Number value );
}

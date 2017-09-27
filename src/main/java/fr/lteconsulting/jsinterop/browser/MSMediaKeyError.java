package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MSMediaKeyError
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:510137
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:510521
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSMediaKeyError")
public class MSMediaKeyError
{

    /*
        Constructors
    */
    public MSMediaKeyError(){
    }

    /*
        Static properties
    */

    @JsProperty(namespace="MSMediaKeyError", name="MS_MEDIA_KEYERR_CLIENT")
    public static Number MS_MEDIA_KEYERR_CLIENT;

    @JsProperty(namespace="MSMediaKeyError", name="MS_MEDIA_KEYERR_DOMAIN")
    public static Number MS_MEDIA_KEYERR_DOMAIN;

    @JsProperty(namespace="MSMediaKeyError", name="MS_MEDIA_KEYERR_HARDWARECHANGE")
    public static Number MS_MEDIA_KEYERR_HARDWARECHANGE;

    @JsProperty(namespace="MSMediaKeyError", name="MS_MEDIA_KEYERR_OUTPUT")
    public static Number MS_MEDIA_KEYERR_OUTPUT;

    @JsProperty(namespace="MSMediaKeyError", name="MS_MEDIA_KEYERR_SERVICE")
    public static Number MS_MEDIA_KEYERR_SERVICE;

    @JsProperty(namespace="MSMediaKeyError", name="MS_MEDIA_KEYERR_UNKNOWN")
    public static Number MS_MEDIA_KEYERR_UNKNOWN;

    /*
        Properties
    */

    public Number code;

    @JsProperty( name = "code")
    public native Number getCode();

    @JsProperty( name = "code")
    public native void setCode( Number value );

    public Number systemCode;

    @JsProperty( name = "systemCode")
    public native Number getSystemCode();

    @JsProperty( name = "systemCode")
    public native void setSystemCode( Number value );
}

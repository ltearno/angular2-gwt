package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: NavigatorID
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:733560
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="NavigatorID")
public class NavigatorIDImpl implements NavigatorID
{

    /*
        Properties
    */

    public String appCodeName;

    @JsProperty( name = "appCodeName")
    public native String getAppCodeName();

    @JsProperty( name = "appCodeName")
    public native void setAppCodeName( String value );

    public String appName;

    @JsProperty( name = "appName")
    public native String getAppName();

    @JsProperty( name = "appName")
    public native void setAppName( String value );

    public String appVersion;

    @JsProperty( name = "appVersion")
    public native String getAppVersion();

    @JsProperty( name = "appVersion")
    public native void setAppVersion( String value );

    public String platform;

    @JsProperty( name = "platform")
    public native String getPlatform();

    @JsProperty( name = "platform")
    public native void setPlatform( String value );

    public String product;

    @JsProperty( name = "product")
    public native String getProduct();

    @JsProperty( name = "product")
    public native void setProduct( String value );

    public String productSub;

    @JsProperty( name = "productSub")
    public native String getProductSub();

    @JsProperty( name = "productSub")
    public native void setProductSub( String value );

    public String userAgent;

    @JsProperty( name = "userAgent")
    public native String getUserAgent();

    @JsProperty( name = "userAgent")
    public native void setUserAgent( String value );

    public String vendor;

    @JsProperty( name = "vendor")
    public native String getVendor();

    @JsProperty( name = "vendor")
    public native void setVendor( String value );

    public String vendorSub;

    @JsProperty( name = "vendorSub")
    public native String getVendorSub();

    @JsProperty( name = "vendorSub")
    public native void setVendorSub( String value );
}

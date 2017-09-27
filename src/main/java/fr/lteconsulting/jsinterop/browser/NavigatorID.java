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
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface NavigatorID
{

    /*
        Properties
    */

    @JsProperty( name = "appCodeName")
    String getAppCodeName();

    @JsProperty( name = "appCodeName")
    void setAppCodeName( String value );

    @JsProperty( name = "appName")
    String getAppName();

    @JsProperty( name = "appName")
    void setAppName( String value );

    @JsProperty( name = "appVersion")
    String getAppVersion();

    @JsProperty( name = "appVersion")
    void setAppVersion( String value );

    @JsProperty( name = "platform")
    String getPlatform();

    @JsProperty( name = "platform")
    void setPlatform( String value );

    @JsProperty( name = "product")
    String getProduct();

    @JsProperty( name = "product")
    void setProduct( String value );

    @JsProperty( name = "productSub")
    String getProductSub();

    @JsProperty( name = "productSub")
    void setProductSub( String value );

    @JsProperty( name = "userAgent")
    String getUserAgent();

    @JsProperty( name = "userAgent")
    void setUserAgent( String value );

    @JsProperty( name = "vendor")
    String getVendor();

    @JsProperty( name = "vendor")
    void setVendor( String value );

    @JsProperty( name = "vendorSub")
    String getVendorSub();

    @JsProperty( name = "vendorSub")
    void setVendorSub( String value );
}

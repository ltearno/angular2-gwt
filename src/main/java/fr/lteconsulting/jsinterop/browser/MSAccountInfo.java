package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MSAccountInfo
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:260034
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSAccountInfo")
public class MSAccountInfo
{

    /*
        Properties
    */

    public String accountImageUri;

    @JsProperty( name = "accountImageUri")
    public native String getAccountImageUri();

    @JsProperty( name = "accountImageUri")
    public native void setAccountImageUri( String value );

    public String accountName;

    @JsProperty( name = "accountName")
    public native String getAccountName();

    @JsProperty( name = "accountName")
    public native void setAccountName( String value );

    public String rpDisplayName;

    @JsProperty( name = "rpDisplayName")
    public native String getRpDisplayName();

    @JsProperty( name = "rpDisplayName")
    public native void setRpDisplayName( String value );

    public String userDisplayName;

    @JsProperty( name = "userDisplayName")
    public native String getUserDisplayName();

    @JsProperty( name = "userDisplayName")
    public native void setUserDisplayName( String value );

    public String userId;

    @JsProperty( name = "userId")
    public native String getUserId();

    @JsProperty( name = "userId")
    public native void setUserId( String value );
}

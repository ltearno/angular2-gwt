package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: Account
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:255382
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Account")
public class Account
{

    /*
        Properties
    */

    public String displayName;

    @JsProperty( name = "displayName")
    public native String getDisplayName();

    @JsProperty( name = "displayName")
    public native void setDisplayName( String value );

    public String id;

    @JsProperty( name = "id")
    public native String getId();

    @JsProperty( name = "id")
    public native void setId( String value );

    public String imageURL;

    @JsProperty( name = "imageURL")
    public native String getImageURL();

    @JsProperty( name = "imageURL")
    public native void setImageURL( String value );

    public String name;

    @JsProperty( name = "name")
    public native String getName();

    @JsProperty( name = "name")
    public native void setName( String value );

    public String rpDisplayName;

    @JsProperty( name = "rpDisplayName")
    public native String getRpDisplayName();

    @JsProperty( name = "rpDisplayName")
    public native void setRpDisplayName( String value );
}

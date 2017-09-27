package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: NotificationOptions
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:271486
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="NotificationOptions")
public class NotificationOptions
{

    /*
        Properties
    */

    public String body;

    @JsProperty( name = "body")
    public native String getBody();

    @JsProperty( name = "body")
    public native void setBody( String value );

    public String dir;

    @JsProperty( name = "dir")
    public native String getDir();

    @JsProperty( name = "dir")
    public native void setDir( String value );

    public String icon;

    @JsProperty( name = "icon")
    public native String getIcon();

    @JsProperty( name = "icon")
    public native void setIcon( String value );

    public String lang;

    @JsProperty( name = "lang")
    public native String getLang();

    @JsProperty( name = "lang")
    public native void setLang( String value );

    public String tag;

    @JsProperty( name = "tag")
    public native String getTag();

    @JsProperty( name = "tag")
    public native void setTag( String value );
}

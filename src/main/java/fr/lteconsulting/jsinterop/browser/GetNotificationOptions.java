package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: GetNotificationOptions
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:259147
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="GetNotificationOptions")
public class GetNotificationOptions
{

    /*
        Properties
    */

    public String tag;

    @JsProperty( name = "tag")
    public native String getTag();

    @JsProperty( name = "tag")
    public native void setTag( String value );
}

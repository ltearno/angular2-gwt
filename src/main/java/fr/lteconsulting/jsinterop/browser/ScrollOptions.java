package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: ScrollOptions
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:739609
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ScrollOptions")
public class ScrollOptions
{

    /*
        Properties
    */

    public String behavior;

    @JsProperty( name = "behavior")
    public native String getBehavior();

    @JsProperty( name = "behavior")
    public native void setBehavior( String value );
}

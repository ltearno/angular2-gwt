package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: NavigatorGeolocation
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:733485
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="NavigatorGeolocation")
public class NavigatorGeolocationImpl implements NavigatorGeolocation
{

    /*
        Properties
    */

    public Geolocation geolocation;

    @JsProperty( name = "geolocation")
    public native Geolocation getGeolocation();

    @JsProperty( name = "geolocation")
    public native void setGeolocation( Geolocation value );
}

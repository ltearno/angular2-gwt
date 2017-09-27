package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: NavigationEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:529877
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:529961
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="NavigationEvent")
public class NavigationEvent extends Event
{

    /*
        Constructors
    */
    public NavigationEvent(){
        super(null, null);
    }

    /*
        Properties
    */

    public String uri;

    @JsProperty( name = "uri")
    public native String getUri();

    @JsProperty( name = "uri")
    public native void setUri( String value );
}

package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: Algorithm
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:255597
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Algorithm")
public class Algorithm
{

    /*
        Properties
    */

    public String name;

    @JsProperty( name = "name")
    public native String getName();

    @JsProperty( name = "name")
    public native void setName( String value );
}

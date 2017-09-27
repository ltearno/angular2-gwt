package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: KeyAlgorithm
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:259785
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="KeyAlgorithm")
public class KeyAlgorithm
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

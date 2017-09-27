package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: WeakSetConstructor
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:216812
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:220298
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="WeakSetConstructor")
public class WeakSetConstructor
{

    /*
        Properties
    */

    public WeakSet<Object> prototype;

    @JsProperty( name = "prototype")
    public native WeakSet<Object> getPrototype();

    @JsProperty( name = "prototype")
    public native void setPrototype( WeakSet<Object> value );
}

package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: WeakMapConstructor
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:215908
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:219913
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="WeakMapConstructor")
public class WeakMapConstructor
{

    /*
        Properties
    */

    public WeakMap<Object, Object> prototype;

    @JsProperty( name = "prototype")
    public native WeakMap<Object, Object> getPrototype();

    @JsProperty( name = "prototype")
    public native void setPrototype( WeakMap<Object, Object> value );
}

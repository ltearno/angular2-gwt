package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MapConstructor
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:215354
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:219784
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MapConstructor")
public class MapConstructor
{

    /*
        Properties
    */

    public Map<Object, Object> prototype;

    @JsProperty( name = "prototype")
    public native Map<Object, Object> getPrototype();

    @JsProperty( name = "prototype")
    public native void setPrototype( Map<Object, Object> value );
}

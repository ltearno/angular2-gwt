package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: SetConstructor
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:216365
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:220198
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SetConstructor")
public class SetConstructor
{

    /*
        Properties
    */

    public Set<Object> prototype;

    @JsProperty( name = "prototype")
    public native Set<Object> getPrototype();

    @JsProperty( name = "prototype")
    public native void setPrototype( Set<Object> value );
}

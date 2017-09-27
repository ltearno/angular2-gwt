package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: WindowLocalStorage
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:735568
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface WindowLocalStorage
{

    /*
        Properties
    */

    @JsProperty( name = "localStorage")
    Storage getLocalStorage();

    @JsProperty( name = "localStorage")
    void setLocalStorage( Storage value );
}

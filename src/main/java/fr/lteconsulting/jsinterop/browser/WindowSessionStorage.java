package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: WindowSessionStorage
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:735638
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface WindowSessionStorage
{

    /*
        Properties
    */

    @JsProperty( name = "sessionStorage")
    Storage getSessionStorage();

    @JsProperty( name = "sessionStorage")
    void setSessionStorage( Storage value );
}

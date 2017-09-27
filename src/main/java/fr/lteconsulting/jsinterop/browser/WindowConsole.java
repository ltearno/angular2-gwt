package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: WindowConsole
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:735508
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface WindowConsole
{

    /*
        Properties
    */

    @JsProperty( name = "console")
    Console getConsole();

    @JsProperty( name = "console")
    void setConsole( Console value );
}

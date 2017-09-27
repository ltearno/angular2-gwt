package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: NavigatorOnLine
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:733871
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface NavigatorOnLine
{

    /*
        Properties
    */

    @JsProperty( name = "onLine")
    Boolean getOnLine();

    @JsProperty( name = "onLine")
    void setOnLine( Boolean value );
}

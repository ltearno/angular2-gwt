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
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="NavigatorOnLine")
public class NavigatorOnLineImpl implements NavigatorOnLine
{

    /*
        Properties
    */

    public Boolean onLine;

    @JsProperty( name = "onLine")
    public native Boolean getOnLine();

    @JsProperty( name = "onLine")
    public native void setOnLine( Boolean value );
}

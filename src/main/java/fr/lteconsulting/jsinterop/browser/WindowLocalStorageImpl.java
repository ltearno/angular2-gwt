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
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="WindowLocalStorage")
public class WindowLocalStorageImpl implements WindowLocalStorage
{

    /*
        Properties
    */

    public Storage localStorage;

    @JsProperty( name = "localStorage")
    public native Storage getLocalStorage();

    @JsProperty( name = "localStorage")
    public native void setLocalStorage( Storage value );
}

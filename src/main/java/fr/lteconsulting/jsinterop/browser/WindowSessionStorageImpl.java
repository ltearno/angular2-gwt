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
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="WindowSessionStorage")
public class WindowSessionStorageImpl implements WindowSessionStorage
{

    /*
        Properties
    */

    public Storage sessionStorage;

    @JsProperty( name = "sessionStorage")
    public native Storage getSessionStorage();

    @JsProperty( name = "sessionStorage")
    public native void setSessionStorage( Storage value );
}

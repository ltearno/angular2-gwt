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
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="WindowConsole")
public class WindowConsoleImpl implements WindowConsole
{

    /*
        Properties
    */

    public Console console;

    @JsProperty( name = "console")
    public native Console getConsole();

    @JsProperty( name = "console")
    public native void setConsole( Console value );
}

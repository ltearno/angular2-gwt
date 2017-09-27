package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: TemplateStringsArray
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:20972
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="TemplateStringsArray")
public class TemplateStringsArray extends ReadonlyArray<String>
{

    /** skipped index of type {@link String} because already in type hierarchy */

    /*
        Properties
    */

    public ReadonlyArray<String> raw;

    @JsProperty( name = "raw")
    public native ReadonlyArray<String> getRaw();

    @JsProperty( name = "raw")
    public native void setRaw( ReadonlyArray<String> value );
}

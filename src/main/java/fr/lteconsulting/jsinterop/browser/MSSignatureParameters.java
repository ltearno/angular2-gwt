package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MSSignatureParameters
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:265131
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSSignatureParameters")
public class MSSignatureParameters
{

    /*
        Properties
    */

    public String userPrompt;

    @JsProperty( name = "userPrompt")
    public native String getUserPrompt();

    @JsProperty( name = "userPrompt")
    public native void setUserPrompt( String value );
}

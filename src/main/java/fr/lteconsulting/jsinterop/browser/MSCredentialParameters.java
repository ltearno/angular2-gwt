package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MSCredentialParameters
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:262368
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSCredentialParameters")
public class MSCredentialParameters
{

    /*
        Properties
    */

    public String type;

    @JsProperty( name = "type")
    public native String getType();

    @JsProperty( name = "type")
    public native void setType( String value );
}

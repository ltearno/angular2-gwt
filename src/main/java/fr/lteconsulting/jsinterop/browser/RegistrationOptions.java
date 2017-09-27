package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RegistrationOptions
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:279755
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RegistrationOptions")
public class RegistrationOptions
{

    /*
        Properties
    */

    public String scope;

    @JsProperty( name = "scope")
    public native String getScope();

    @JsProperty( name = "scope")
    public native void setScope( String value );
}

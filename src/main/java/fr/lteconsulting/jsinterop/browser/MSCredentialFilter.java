package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MSCredentialFilter
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:262301
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSCredentialFilter")
public class MSCredentialFilter
{

    /*
        Properties
    */

    public Array<MSCredentialSpec> accept;

    @JsProperty( name = "accept")
    public native Array<MSCredentialSpec> getAccept();

    @JsProperty( name = "accept")
    public native void setAccept( Array<MSCredentialSpec> value );
}

package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: EcdhKeyDeriveParams
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:740913
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="EcdhKeyDeriveParams")
public class EcdhKeyDeriveParams extends Algorithm
{

    /*
        Properties
    */

    @JsProperty(name="public")
    public CryptoKey _public_;

    @JsProperty( name = "public")
    public native CryptoKey get_public_();

    @JsProperty( name = "public")
    public native void set_public_( CryptoKey value );
}

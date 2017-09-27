package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: Crypto
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:318404
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:318503
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Crypto")
public class Crypto extends RandomSource
{

    /*
        Constructors
    */
    public Crypto(){
    }

    /*
        Properties
    */

    public SubtleCrypto subtle;

    @JsProperty( name = "subtle")
    public native SubtleCrypto getSubtle();

    @JsProperty( name = "subtle")
    public native void setSubtle( SubtleCrypto value );
}

package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: CryptoKeyPair
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:318789
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:318884
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="CryptoKeyPair")
public class CryptoKeyPair
{

    /*
        Constructors
    */
    public CryptoKeyPair(){
    }

    /*
        Properties
    */

    public CryptoKey privateKey;

    @JsProperty( name = "privateKey")
    public native CryptoKey getPrivateKey();

    @JsProperty( name = "privateKey")
    public native void setPrivateKey( CryptoKey value );

    public CryptoKey publicKey;

    @JsProperty( name = "publicKey")
    public native CryptoKey getPublicKey();

    @JsProperty( name = "publicKey")
    public native void setPublicKey( CryptoKey value );
}

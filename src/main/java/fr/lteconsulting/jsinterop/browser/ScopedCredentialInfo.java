package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: ScopedCredentialInfo
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:637979
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:638106
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ScopedCredentialInfo")
public class ScopedCredentialInfo
{

    /*
        Constructors
    */
    public ScopedCredentialInfo(){
    }

    /*
        Properties
    */

    public ScopedCredential credential;

    @JsProperty( name = "credential")
    public native ScopedCredential getCredential();

    @JsProperty( name = "credential")
    public native void setCredential( ScopedCredential value );

    public CryptoKey publicKey;

    @JsProperty( name = "publicKey")
    public native CryptoKey getPublicKey();

    @JsProperty( name = "publicKey")
    public native void setPublicKey( CryptoKey value );
}

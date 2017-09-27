package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: WebAuthnAssertion
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:665023
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:665232
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="WebAuthnAssertion")
public class WebAuthnAssertion
{

    /*
        Constructors
    */
    public WebAuthnAssertion(){
    }

    /*
        Properties
    */

    public ArrayBuffer authenticatorData;

    @JsProperty( name = "authenticatorData")
    public native ArrayBuffer getAuthenticatorData();

    @JsProperty( name = "authenticatorData")
    public native void setAuthenticatorData( ArrayBuffer value );

    public ArrayBuffer clientData;

    @JsProperty( name = "clientData")
    public native ArrayBuffer getClientData();

    @JsProperty( name = "clientData")
    public native void setClientData( ArrayBuffer value );

    public ScopedCredential credential;

    @JsProperty( name = "credential")
    public native ScopedCredential getCredential();

    @JsProperty( name = "credential")
    public native void setCredential( ScopedCredential value );

    public ArrayBuffer signature;

    @JsProperty( name = "signature")
    public native ArrayBuffer getSignature();

    @JsProperty( name = "signature")
    public native void setSignature( ArrayBuffer value );
}

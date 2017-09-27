package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: ClientData
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:256051
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ClientData")
public class ClientData
{

    /*
        Properties
    */

    public String challenge;

    @JsProperty( name = "challenge")
    public native String getChallenge();

    @JsProperty( name = "challenge")
    public native void setChallenge( String value );

    public WebAuthnExtensions extensions;

    @JsProperty( name = "extensions")
    public native WebAuthnExtensions getExtensions();

    @JsProperty( name = "extensions")
    public native void setExtensions( WebAuthnExtensions value );

    public UnionOfAlgorithmAndString hashAlg;

    @JsProperty( name = "hashAlg")
    public native UnionOfAlgorithmAndString getHashAlg();

    @JsProperty( name = "hashAlg")
    public native void setHashAlg( UnionOfAlgorithmAndString value );

    @JsOverlay
    public final void setHashAlg( Algorithm value ) { setHashAlg(UnionOfAlgorithmAndString.ofAlgorithm( value )); }

    @JsOverlay
    public final void setHashAlg( String value ) { setHashAlg(UnionOfAlgorithmAndString.ofString( value )); }

    public String origin;

    @JsProperty( name = "origin")
    public native String getOrigin();

    @JsProperty( name = "origin")
    public native void setOrigin( String value );

    public String rpId;

    @JsProperty( name = "rpId")
    public native String getRpId();

    @JsProperty( name = "rpId")
    public native void setRpId( String value );

    public String tokenBinding;

    @JsProperty( name = "tokenBinding")
    public native String getTokenBinding();

    @JsProperty( name = "tokenBinding")
    public native void setTokenBinding( String value );
}

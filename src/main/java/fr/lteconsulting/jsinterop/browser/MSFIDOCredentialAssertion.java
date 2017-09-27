package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MSFIDOCredentialAssertion
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:503333
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:503553
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSFIDOCredentialAssertion")
public class MSFIDOCredentialAssertion extends MSAssertion
{

    /*
        Constructors
    */
    public MSFIDOCredentialAssertion(){
    }

    /*
        Properties
    */

    public UnionOfAlgorithmAndString algorithm;

    @JsProperty( name = "algorithm")
    public native UnionOfAlgorithmAndString getAlgorithm();

    @JsProperty( name = "algorithm")
    public native void setAlgorithm( UnionOfAlgorithmAndString value );

    @JsOverlay
    public final void setAlgorithm( Algorithm value ) { setAlgorithm(UnionOfAlgorithmAndString.ofAlgorithm( value )); }

    @JsOverlay
    public final void setAlgorithm( String value ) { setAlgorithm(UnionOfAlgorithmAndString.ofString( value )); }

    public Object attestation;

    @JsProperty( name = "attestation")
    public native Object getAttestation();

    @JsProperty( name = "attestation")
    public native void setAttestation( Object value );

    public String publicKey;

    @JsProperty( name = "publicKey")
    public native String getPublicKey();

    @JsProperty( name = "publicKey")
    public native void setPublicKey( String value );

    public Array<String> transportHints;

    @JsProperty( name = "transportHints")
    public native Array<String> getTransportHints();

    @JsProperty( name = "transportHints")
    public native void setTransportHints( Array<String> value );
}

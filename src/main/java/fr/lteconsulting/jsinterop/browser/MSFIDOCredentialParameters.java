package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MSFIDOCredentialParameters
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:262864
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSFIDOCredentialParameters")
public class MSFIDOCredentialParameters extends MSCredentialParameters
{

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

    public Array<String> authenticators;

    @JsProperty( name = "authenticators")
    public native Array<String> getAuthenticators();

    @JsProperty( name = "authenticators")
    public native void setAuthenticators( Array<String> value );
}

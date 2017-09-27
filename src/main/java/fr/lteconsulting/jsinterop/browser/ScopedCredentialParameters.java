package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: ScopedCredentialParameters
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:280470
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ScopedCredentialParameters")
public class ScopedCredentialParameters
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

    public String type;

    @JsProperty( name = "type")
    public native String getType();

    @JsProperty( name = "type")
    public native void setType( String value );
}

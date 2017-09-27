package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: EcKeyAlgorithm
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:740781
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="EcKeyAlgorithm")
public class EcKeyAlgorithm extends KeyAlgorithm
{

    /*
        Properties
    */

    public String typedCurve;

    @JsProperty( name = "typedCurve")
    public native String getTypedCurve();

    @JsProperty( name = "typedCurve")
    public native void setTypedCurve( String value );
}

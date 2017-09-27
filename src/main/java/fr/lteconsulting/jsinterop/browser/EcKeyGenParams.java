package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: EcKeyGenParams
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:740709
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="EcKeyGenParams")
public class EcKeyGenParams extends Algorithm
{

    /*
        Properties
    */

    public String namedCurve;

    @JsProperty( name = "namedCurve")
    public native String getNamedCurve();

    @JsProperty( name = "namedCurve")
    public native void setNamedCurve( String value );
}

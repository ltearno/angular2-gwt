package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: EcKeyImportParams
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:740856
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="EcKeyImportParams")
public class EcKeyImportParams
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

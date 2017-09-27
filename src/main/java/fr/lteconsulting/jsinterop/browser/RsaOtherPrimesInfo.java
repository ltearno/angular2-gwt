package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RsaOtherPrimesInfo
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:742786
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RsaOtherPrimesInfo")
public class RsaOtherPrimesInfo
{

    /*
        Properties
    */

    public String d;

    @JsProperty( name = "d")
    public native String getD();

    @JsProperty( name = "d")
    public native void setD( String value );

    public String r;

    @JsProperty( name = "r")
    public native String getR();

    @JsProperty( name = "r")
    public native void setR( String value );

    public String t;

    @JsProperty( name = "t")
    public native String getT();

    @JsProperty( name = "t")
    public native void setT( String value );
}

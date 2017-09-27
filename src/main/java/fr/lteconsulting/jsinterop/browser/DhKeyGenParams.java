package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: DhKeyGenParams
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:741935
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="DhKeyGenParams")
public class DhKeyGenParams extends Algorithm
{

    /*
        Properties
    */

    public Uint8Array generator;

    @JsProperty( name = "generator")
    public native Uint8Array getGenerator();

    @JsProperty( name = "generator")
    public native void setGenerator( Uint8Array value );

    public Uint8Array prime;

    @JsProperty( name = "prime")
    public native Uint8Array getPrime();

    @JsProperty( name = "prime")
    public native void setPrime( Uint8Array value );
}

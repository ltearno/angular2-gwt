package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: CryptoKey
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:318557
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:318726
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="CryptoKey")
public class CryptoKey
{

    /*
        Constructors
    */
    public CryptoKey(){
    }

    /*
        Properties
    */

    public KeyAlgorithm algorithm;

    @JsProperty( name = "algorithm")
    public native KeyAlgorithm getAlgorithm();

    @JsProperty( name = "algorithm")
    public native void setAlgorithm( KeyAlgorithm value );

    public Boolean extractable;

    @JsProperty( name = "extractable")
    public native Boolean getExtractable();

    @JsProperty( name = "extractable")
    public native void setExtractable( Boolean value );

    public String type;

    @JsProperty( name = "type")
    public native String getType();

    @JsProperty( name = "type")
    public native void setType( String value );

    public Array<String> usages;

    @JsProperty( name = "usages")
    public native Array<String> getUsages();

    @JsProperty( name = "usages")
    public native void setUsages( Array<String> value );
}

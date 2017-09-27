package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RsaPssParams
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:740508
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RsaPssParams")
public class RsaPssParams
{

    /*
        Properties
    */

    public Number saltLength;

    @JsProperty( name = "saltLength")
    public native Number getSaltLength();

    @JsProperty( name = "saltLength")
    public native void setSaltLength( Number value );
}

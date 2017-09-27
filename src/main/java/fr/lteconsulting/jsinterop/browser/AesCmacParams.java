package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: AesCmacParams
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:741364
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="AesCmacParams")
public class AesCmacParams extends Algorithm
{

    /*
        Properties
    */

    public Number length;

    @JsProperty( name = "length")
    public native Number getLength();

    @JsProperty( name = "length")
    public native void setLength( Number value );
}

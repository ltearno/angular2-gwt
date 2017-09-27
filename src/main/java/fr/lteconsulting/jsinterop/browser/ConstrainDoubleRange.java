package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: ConstrainDoubleRange
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:256738
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ConstrainDoubleRange")
public class ConstrainDoubleRange extends DoubleRange
{

    /*
        Properties
    */

    public Number exact;

    @JsProperty( name = "exact")
    public native Number getExact();

    @JsProperty( name = "exact")
    public native void setExact( Number value );

    public Number ideal;

    @JsProperty( name = "ideal")
    public native Number getIdeal();

    @JsProperty( name = "ideal")
    public native void setIdeal( Number value );
}

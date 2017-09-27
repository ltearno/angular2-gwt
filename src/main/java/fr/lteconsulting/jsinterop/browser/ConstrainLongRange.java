package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: ConstrainLongRange
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:256834
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ConstrainLongRange")
public class ConstrainLongRange extends LongRange
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

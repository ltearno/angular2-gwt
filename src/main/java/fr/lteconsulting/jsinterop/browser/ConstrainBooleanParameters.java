package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: ConstrainBooleanParameters
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:256548
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ConstrainBooleanParameters")
public class ConstrainBooleanParameters
{

    /*
        Properties
    */

    public Boolean exact;

    @JsProperty( name = "exact")
    public native Boolean getExact();

    @JsProperty( name = "exact")
    public native void setExact( Boolean value );

    public Boolean ideal;

    @JsProperty( name = "ideal")
    public native Boolean getIdeal();

    @JsProperty( name = "ideal")
    public native void setIdeal( Boolean value );
}

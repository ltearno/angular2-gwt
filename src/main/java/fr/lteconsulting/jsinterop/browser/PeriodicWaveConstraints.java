package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: PeriodicWaveConstraints
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:272707
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="PeriodicWaveConstraints")
public class PeriodicWaveConstraints
{

    /*
        Properties
    */

    public Boolean disableNormalization;

    @JsProperty( name = "disableNormalization")
    public native Boolean getDisableNormalization();

    @JsProperty( name = "disableNormalization")
    public native void setDisableNormalization( Boolean value );
}

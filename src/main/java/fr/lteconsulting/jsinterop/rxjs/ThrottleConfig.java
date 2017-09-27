package fr.lteconsulting.jsinterop.rxjs;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/throttle".ThrottleConfig
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/throttle.d.ts:66
  * 
 */
@JsType(isNative=true, namespace="rxjs", name="ThrottleConfig")
public class ThrottleConfig
{

    /*
        Properties
    */

    public Boolean leading;

    @JsProperty( name = "leading")
    public native Boolean getLeading();

    @JsProperty( name = "leading")
    public native void setLeading( Boolean value );

    public Boolean trailing;

    @JsProperty( name = "trailing")
    public native Boolean getTrailing();

    @JsProperty( name = "trailing")
    public native void setTrailing( Boolean value );
}

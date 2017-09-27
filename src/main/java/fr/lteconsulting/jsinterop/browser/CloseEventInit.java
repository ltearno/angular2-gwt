package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: CloseEventInit
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:256239
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="CloseEventInit")
public class CloseEventInit extends EventInit
{

    /*
        Properties
    */

    public Number code;

    @JsProperty( name = "code")
    public native Number getCode();

    @JsProperty( name = "code")
    public native void setCode( Number value );

    public String reason;

    @JsProperty( name = "reason")
    public native String getReason();

    @JsProperty( name = "reason")
    public native void setReason( String value );

    public Boolean wasClean;

    @JsProperty( name = "wasClean")
    public native Boolean getWasClean();

    @JsProperty( name = "wasClean")
    public native void setWasClean( Boolean value );
}

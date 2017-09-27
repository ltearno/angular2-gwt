package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: ShadowRootInit
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:743888
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ShadowRootInit")
public class ShadowRootInit
{

    /*
        Properties
    */

    public Boolean delegatesFocus;

    @JsProperty( name = "delegatesFocus")
    public native Boolean getDelegatesFocus();

    @JsProperty( name = "delegatesFocus")
    public native void setDelegatesFocus( Boolean value );

    public String mode;

    @JsProperty( name = "mode")
    public native String getMode();

    @JsProperty( name = "mode")
    public native void setMode( String value );
}

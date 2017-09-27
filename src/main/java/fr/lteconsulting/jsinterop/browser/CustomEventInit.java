package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: CustomEventInit
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:257038
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="CustomEventInit")
public class CustomEventInit extends EventInit
{

    /*
        Properties
    */

    public Object detail;

    @JsProperty( name = "detail")
    public native Object getDetail();

    @JsProperty( name = "detail")
    public native void setDetail( Object value );
}

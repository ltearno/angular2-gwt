package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: FocusEventInit
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:258661
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="FocusEventInit")
public class FocusEventInit extends UIEventInit
{

    /*
        Properties
    */

    public EventTarget relatedTarget;

    @JsProperty( name = "relatedTarget")
    public native EventTarget getRelatedTarget();

    @JsProperty( name = "relatedTarget")
    public native void setRelatedTarget( EventTarget value );
}

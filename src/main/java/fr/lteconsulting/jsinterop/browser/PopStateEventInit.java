package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: PopStateEventInit
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:273016
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="PopStateEventInit")
public class PopStateEventInit extends EventInit
{

    /*
        Properties
    */

    public Object state;

    @JsProperty( name = "state")
    public native Object getState();

    @JsProperty( name = "state")
    public native void setState( Object value );
}

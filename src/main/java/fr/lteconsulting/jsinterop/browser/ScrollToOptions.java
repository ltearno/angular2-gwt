package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: ScrollToOptions
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:739669
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ScrollToOptions")
public class ScrollToOptions extends ScrollOptions
{

    /*
        Properties
    */

    public Number left;

    @JsProperty( name = "left")
    public native Number getLeft();

    @JsProperty( name = "left")
    public native void setLeft( Number value );

    public Number top;

    @JsProperty( name = "top")
    public native Number getTop();

    @JsProperty( name = "top")
    public native void setTop( Number value );
}

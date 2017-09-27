package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: TextMetrics
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:654652
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:654720
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="TextMetrics")
public class TextMetrics
{

    /*
        Constructors
    */
    public TextMetrics(){
    }

    /*
        Properties
    */

    public Number width;

    @JsProperty( name = "width")
    public native Number getWidth();

    @JsProperty( name = "width")
    public native void setWidth( Number value );
}

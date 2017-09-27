package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: BarProp
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:292307
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:292374
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="BarProp")
public class BarProp
{

    /*
        Constructors
    */
    public BarProp(){
    }

    /*
        Properties
    */

    public Boolean visible;

    @JsProperty( name = "visible")
    public native Boolean getVisible();

    @JsProperty( name = "visible")
    public native void setVisible( Boolean value );
}

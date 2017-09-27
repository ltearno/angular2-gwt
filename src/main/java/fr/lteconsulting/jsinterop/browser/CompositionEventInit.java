package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: CompositionEventInit
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:256351
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="CompositionEventInit")
public class CompositionEventInit extends UIEventInit
{

    /*
        Properties
    */

    public String data;

    @JsProperty( name = "data")
    public native String getData();

    @JsProperty( name = "data")
    public native void setData( String value );
}

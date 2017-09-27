package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: ClipboardEventInit
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:739889
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ClipboardEventInit")
public class ClipboardEventInit extends EventInit
{

    /*
        Properties
    */

    public String data;

    @JsProperty( name = "data")
    public native String getData();

    @JsProperty( name = "data")
    public native void setData( String value );

    public String dataType;

    @JsProperty( name = "dataType")
    public native String getDataType();

    @JsProperty( name = "dataType")
    public native void setDataType( String value );
}

package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: BlobPropertyBag
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:739266
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="BlobPropertyBag")
public class BlobPropertyBag
{

    /*
        Properties
    */

    public String endings;

    @JsProperty( name = "endings")
    public native String getEndings();

    @JsProperty( name = "endings")
    public native void setEndings( String value );

    public String type;

    @JsProperty( name = "type")
    public native String getType();

    @JsProperty( name = "type")
    public native void setType( String value );
}

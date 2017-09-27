package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: FilePropertyBag
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:739338
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="FilePropertyBag")
public class FilePropertyBag
{

    /*
        Properties
    */

    public Number lastModified;

    @JsProperty( name = "lastModified")
    public native Number getLastModified();

    @JsProperty( name = "lastModified")
    public native void setLastModified( Number value );

    public String type;

    @JsProperty( name = "type")
    public native String getType();

    @JsProperty( name = "type")
    public native void setType( String value );
}

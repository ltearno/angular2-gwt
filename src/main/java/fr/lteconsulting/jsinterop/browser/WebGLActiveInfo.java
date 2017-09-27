package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: WebGLActiveInfo
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:665319
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:665444
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="WebGLActiveInfo")
public class WebGLActiveInfo
{

    /*
        Constructors
    */
    public WebGLActiveInfo(){
    }

    /*
        Properties
    */

    public String name;

    @JsProperty( name = "name")
    public native String getName();

    @JsProperty( name = "name")
    public native void setName( String value );

    public Number size;

    @JsProperty( name = "size")
    public native Number getSize();

    @JsProperty( name = "size")
    public native void setSize( Number value );

    public Number type;

    @JsProperty( name = "type")
    public native Number getType();

    @JsProperty( name = "type")
    public native void setType( Number value );
}

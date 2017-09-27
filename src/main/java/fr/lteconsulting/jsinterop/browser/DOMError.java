package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: DOMError
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:319263
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:319351
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="DOMError")
public class DOMError
{

    /*
        Constructors
    */
    public DOMError(){
    }

    /*
        Properties
    */

    public String name;

    @JsProperty( name = "name")
    public native String getName();

    @JsProperty( name = "name")
    public native void setName( String value );
}

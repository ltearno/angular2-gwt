package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: SVGNumber
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:608489
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:608546
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGNumber")
public class SVGNumber
{

    /*
        Constructors
    */
    public SVGNumber(){
    }

    /*
        Properties
    */

    public Number value;

    @JsProperty( name = "value")
    public native Number getValue();

    @JsProperty( name = "value")
    public native void setValue( Number value );
}

package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: DOMSettableTokenList
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:322326
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:322415
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="DOMSettableTokenList")
public class DOMSettableTokenList extends DOMTokenList
{

    /*
        Constructors
    */
    public DOMSettableTokenList(){
    }

    /** skipped index of type {@link String} because already in type hierarchy */

    /*
        Properties
    */

    public String value;

    @JsProperty( name = "value")
    public native String getValue();

    @JsProperty( name = "value")
    public native void setValue( String value );
}

package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * base type: DOMStringList
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:322511
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:322687
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="DOMStringList")
public class DOMStringList
{

    /*
        Constructors
    */
    public DOMStringList(){
    }

    @JsOverlay
    public final void setByIndex(int index, String value) {
        Js.asArrayLike(this).setAt(index, value);
    }

    @JsOverlay
    public final String getByIndex(int index) {
        return (String) Js.asArrayLike(this).getAt(index);
    }

    /*
        Properties
    */

    public Number length;

    @JsProperty( name = "length")
    public native Number getLength();

    @JsProperty( name = "length")
    public native void setLength( Number value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(contains,27,,P(d1))
      * TE Signature : S(contains,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@322572
     */
    public native Boolean contains(String str);
    /** 
      * Std Signature : S(item,1,,P(d2))
      * TE Signature : S(item,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@322608
     */
    public native String item(Number index);
}

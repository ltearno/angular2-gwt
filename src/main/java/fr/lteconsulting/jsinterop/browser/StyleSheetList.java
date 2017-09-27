package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * base type: StyleSheetList
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:649401
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:649544
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="StyleSheetList")
public class StyleSheetList
{

    /*
        Constructors
    */
    public StyleSheetList(){
    }

    @JsOverlay
    public final void setByIndex(int index, StyleSheet value) {
        Js.asArrayLike(this).setAt(index, value);
    }

    @JsOverlay
    public final StyleSheet getByIndex(int index) {
        return (StyleSheet) Js.asArrayLike(this).getAt(index);
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
      * Std Signature : S(item,414,,)
      * TE Signature : S(item,)
      * 
     */
    public native StyleSheet item();
    /** 
      * Std Signature : S(item,414,,P(d2))
      * TE Signature : S(item,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@649463
     */
    public native StyleSheet item(Number index /* optional */);
}

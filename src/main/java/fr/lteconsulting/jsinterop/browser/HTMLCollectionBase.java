package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * base type: HTMLCollectionBase
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:394786
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLCollectionBase")
public class HTMLCollectionBase
{

    @JsOverlay
    public final void setByIndex(int index, Element value) {
        Js.asArrayLike(this).setAt(index, value);
    }

    @JsOverlay
    public final Element getByIndex(int index) {
        return (Element) Js.asArrayLike(this).getAt(index);
    }

    /*
        Properties
    */

    /** 
      * Sets or retrieves the number of objects in a collection.
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
      * Std Signature : S(item,49,,P(d2))
      * TE Signature : S(item,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@395005
      * Retrieves an object from various collections.
     */
    public native Element item(Number index);
}

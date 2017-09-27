package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * base type: HTMLAllCollection
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:377656
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:377888
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLAllCollection")
public class HTMLAllCollection
{

    /*
        Constructors
    */
    public HTMLAllCollection(){
    }

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

    public Number length;

    @JsProperty( name = "length")
    public native Number getLength();

    @JsProperty( name = "length")
    public native void setLength( Number value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(item,U(-49,338),,)
      * TE Signature : S(item,)
      * 
     */
    public native UnionOfElementAndHTMLCollection item();
    /** 
      * Std Signature : S(item,U(-49,338),,P(d1))
      * TE Signature : S(item,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@377721
     */
    public native UnionOfElementAndHTMLCollection item(String nameOrIndex /* optional */);
    /** 
      * Std Signature : S(namedItem,U(-49,338),,P(d1))
      * TE Signature : S(namedItem,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@377786
     */
    public native UnionOfElementAndHTMLCollection namedItem(String name);
}

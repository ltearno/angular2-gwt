package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * base type: StyleSheetPageList
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:649622
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:649770
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="StyleSheetPageList")
public class StyleSheetPageList
{

    /*
        Constructors
    */
    public StyleSheetPageList(){
    }

    @JsOverlay
    public final void setByIndex(int index, CSSPageRule value) {
        Js.asArrayLike(this).setAt(index, value);
    }

    @JsOverlay
    public final CSSPageRule getByIndex(int index) {
        return (CSSPageRule) Js.asArrayLike(this).getAt(index);
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
      * Std Signature : S(item,421,,P(d2))
      * TE Signature : S(item,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@649688
     */
    public native CSSPageRule item(Number index);
}

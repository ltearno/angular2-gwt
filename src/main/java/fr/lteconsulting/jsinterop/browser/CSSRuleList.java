package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * base type: CSSRuleList
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:296606
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:296739
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="CSSRuleList")
public class CSSRuleList
{

    /*
        Constructors
    */
    public CSSRuleList(){
    }

    @JsOverlay
    public final void setByIndex(int index, CSSRule value) {
        Js.asArrayLike(this).setAt(index, value);
    }

    @JsOverlay
    public final CSSRule getByIndex(int index) {
        return (CSSRule) Js.asArrayLike(this).getAt(index);
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
      * Std Signature : S(item,418,,P(d2))
      * TE Signature : S(item,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@296665
     */
    public native CSSRule item(Number index);
}

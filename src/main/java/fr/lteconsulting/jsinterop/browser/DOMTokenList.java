package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * base type: DOMTokenList
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:322915
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:323235
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:784482
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="DOMTokenList")
public class DOMTokenList
{

    /*
        Constructors
    */
    public DOMTokenList(){
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
    // skipped method __@iterator
    /** 
      * Std Signature : S(add,289,,)
      * TE Signature : S(add,)
      * 
     */
    public native void add();
    /** 
      * Std Signature : S(add,289,,P(D1))
      * TE Signature : S(add,P(D1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@322975
     */
    public native void add(String... token);
    /** 
      * Std Signature : S(contains,27,,P(d1))
      * TE Signature : S(contains,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@323010
     */
    public native Boolean contains(String token);
    /** 
      * Std Signature : S(item,1,,P(d2))
      * TE Signature : S(item,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@323048
     */
    public native String item(Number index);
    /** 
      * Std Signature : S(remove,289,,)
      * TE Signature : S(remove,)
      * 
     */
    public native void remove();
    /** 
      * Std Signature : S(remove,289,,P(D1))
      * TE Signature : S(remove,P(D1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@323081
     */
    public native void remove(String... token);
    /** 
      * Std Signature : S(toggle,27,,P(d1))
      * TE Signature : S(toggle,P(d1))
      * 
     */
    public native Boolean toggle(String token);
    /** 
      * Std Signature : S(toggle,27,,P(d1),P(d27))
      * TE Signature : S(toggle,P(d1),P(d27))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@323143
     */
    public native Boolean toggle(String token, Boolean force /* optional */);
}

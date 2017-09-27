package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: HTMLOptionsCollection
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:455423
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:455693
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLOptionsCollection")
public class HTMLOptionsCollection extends HTMLCollectionOf<HTMLOptionElement>
{

    /*
        Constructors
    */
    public HTMLOptionsCollection(){
    }

    /** skipped index of type {@link Element} because already in type hierarchy */

    /*
        Properties
    */

    public Number selectedIndex;

    @JsProperty( name = "selectedIndex")
    public native Number getSelectedIndex();

    @JsProperty( name = "selectedIndex")
    public native void setSelectedIndex( Number value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(add,289,,P(d238))
      * TE Signature : S(add,P(d238))
      * 
     */
    public native void add(HTMLOptGroupElement element);
    /** 
      * Std Signature : S(add,289,,P(d238),P(d2))
      * TE Signature : S(add,P(d238),P(d2))
      * 
     */
    public native void add(HTMLOptGroupElement element, Number before /* optional */);
    /** 
      * Std Signature : S(add,289,,P(d238),P(d240))
      * TE Signature : S(add,P(d238),P(d240))
      * 
     */
    public native void add(HTMLOptGroupElement element, HTMLElement before /* optional */);
    /** 
      * Std Signature : S(add,289,,P(d239))
      * TE Signature : S(add,P(d239))
      * 
     */
    public native void add(HTMLOptionElement element);
    /** 
      * Std Signature : S(add,289,,P(d239),P(d2))
      * TE Signature : S(add,P(d239),P(d2))
      * 
     */
    public native void add(HTMLOptionElement element, Number before /* optional */);
    /** 
      * Std Signature : S(add,289,,P(d239),P(d240))
      * TE Signature : S(add,P(d239),P(d240))
      * 
     */
    public native void add(HTMLOptionElement element, HTMLElement before /* optional */);
    /** 
      * Std Signature : S(add,289,,P(dU(-238,239)))
      * TE Signature : S(add,P(dU(-238,239)))
      * 
     */
    public native void add(UnionOfHTMLOptGroupElementAndHTMLOptionElement element);
    /** 
      * Std Signature : S(add,289,,P(dU(-238,239)),P(dU(-240,2)))
      * TE Signature : S(add,P(dU(-238,239)),P(dU(-240,2)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@455554
     */
    public native void add(UnionOfHTMLOptGroupElementAndHTMLOptionElement element, UnionOfHTMLElementAndNumber before /* optional */);
    /** 
      * Std Signature : S(remove,289,,P(d2))
      * TE Signature : S(remove,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@455650
     */
    public native void remove(Number index);
}

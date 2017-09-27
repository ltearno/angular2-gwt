package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: SVGNumberList
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:608609
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:609012
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGNumberList")
public class SVGNumberList
{

    /*
        Constructors
    */
    public SVGNumberList(){
    }

    /*
        Properties
    */

    public Number numberOfItems;

    @JsProperty( name = "numberOfItems")
    public native Number getNumberOfItems();

    @JsProperty( name = "numberOfItems")
    public native void setNumberOfItems( Number value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(appendItem,122,,P(d122))
      * TE Signature : S(appendItem,P(d122))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@608677
     */
    public native SVGNumber appendItem(SVGNumber newItem);
    /** 
      * Std Signature : S(clear,289,,)
      * TE Signature : S(clear,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@608724
     */
    public native void clear();
    /** 
      * Std Signature : S(getItem,122,,P(d2))
      * TE Signature : S(getItem,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@608743
     */
    public native SVGNumber getItem(Number index);
    /** 
      * Std Signature : S(initialize,122,,P(d122))
      * TE Signature : S(initialize,P(d122))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@608782
     */
    public native SVGNumber initialize(SVGNumber newItem);
    /** 
      * Std Signature : S(insertItemBefore,122,,P(d122),P(d2))
      * TE Signature : S(insertItemBefore,P(d122),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@608829
     */
    public native SVGNumber insertItemBefore(SVGNumber newItem, Number index);
    /** 
      * Std Signature : S(removeItem,122,,P(d2))
      * TE Signature : S(removeItem,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@608897
     */
    public native SVGNumber removeItem(Number index);
    /** 
      * Std Signature : S(replaceItem,122,,P(d122),P(d2))
      * TE Signature : S(replaceItem,P(d122),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@608939
     */
    public native SVGNumber replaceItem(SVGNumber newItem, Number index);
}

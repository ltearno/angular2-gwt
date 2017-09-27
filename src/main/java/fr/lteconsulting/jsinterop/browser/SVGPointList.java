package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: SVGPointList
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:619617
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:620009
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGPointList")
public class SVGPointList
{

    /*
        Constructors
    */
    public SVGPointList(){
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
      * Std Signature : S(appendItem,120,,P(d120))
      * TE Signature : S(appendItem,P(d120))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@619684
     */
    public native SVGPoint appendItem(SVGPoint newItem);
    /** 
      * Std Signature : S(clear,289,,)
      * TE Signature : S(clear,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@619729
     */
    public native void clear();
    /** 
      * Std Signature : S(getItem,120,,P(d2))
      * TE Signature : S(getItem,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@619748
     */
    public native SVGPoint getItem(Number index);
    /** 
      * Std Signature : S(initialize,120,,P(d120))
      * TE Signature : S(initialize,P(d120))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@619786
     */
    public native SVGPoint initialize(SVGPoint newItem);
    /** 
      * Std Signature : S(insertItemBefore,120,,P(d120),P(d2))
      * TE Signature : S(insertItemBefore,P(d120),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@619831
     */
    public native SVGPoint insertItemBefore(SVGPoint newItem, Number index);
    /** 
      * Std Signature : S(removeItem,120,,P(d2))
      * TE Signature : S(removeItem,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@619897
     */
    public native SVGPoint removeItem(Number index);
    /** 
      * Std Signature : S(replaceItem,120,,P(d120),P(d2))
      * TE Signature : S(replaceItem,P(d120),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@619938
     */
    public native SVGPoint replaceItem(SVGPoint newItem, Number index);
}

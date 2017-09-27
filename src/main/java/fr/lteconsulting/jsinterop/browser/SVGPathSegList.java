package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: SVGPathSegList
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:617767
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:618181
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGPathSegList")
public class SVGPathSegList
{

    /*
        Constructors
    */
    public SVGPathSegList(){
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
      * Std Signature : S(appendItem,119,,P(d119))
      * TE Signature : S(appendItem,P(d119))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@617836
     */
    public native SVGPathSeg appendItem(SVGPathSeg newItem);
    /** 
      * Std Signature : S(clear,289,,)
      * TE Signature : S(clear,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@617885
     */
    public native void clear();
    /** 
      * Std Signature : S(getItem,119,,P(d2))
      * TE Signature : S(getItem,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@617904
     */
    public native SVGPathSeg getItem(Number index);
    /** 
      * Std Signature : S(initialize,119,,P(d119))
      * TE Signature : S(initialize,P(d119))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@617944
     */
    public native SVGPathSeg initialize(SVGPathSeg newItem);
    /** 
      * Std Signature : S(insertItemBefore,119,,P(d119),P(d2))
      * TE Signature : S(insertItemBefore,P(d119),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@617993
     */
    public native SVGPathSeg insertItemBefore(SVGPathSeg newItem, Number index);
    /** 
      * Std Signature : S(removeItem,119,,P(d2))
      * TE Signature : S(removeItem,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@618063
     */
    public native SVGPathSeg removeItem(Number index);
    /** 
      * Std Signature : S(replaceItem,119,,P(d119),P(d2))
      * TE Signature : S(replaceItem,P(d119),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@618106
     */
    public native SVGPathSeg replaceItem(SVGPathSeg newItem, Number index);
}

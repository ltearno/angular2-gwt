package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: SVGTransformList
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:635245
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:635781
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGTransformList")
public class SVGTransformList
{

    /*
        Constructors
    */
    public SVGTransformList(){
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
      * Std Signature : S(appendItem,115,,P(d115))
      * TE Signature : S(appendItem,P(d115))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@635316
     */
    public native SVGTransform appendItem(SVGTransform newItem);
    /** 
      * Std Signature : S(clear,289,,)
      * TE Signature : S(clear,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@635369
     */
    public native void clear();
    /** 
      * Std Signature : S(consolidate,115,,)
      * TE Signature : S(consolidate,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@635388
     */
    public native SVGTransform consolidate();
    /** 
      * Std Signature : S(createSVGTransformFromMatrix,115,,P(d94))
      * TE Signature : S(createSVGTransformFromMatrix,P(d94))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@635421
     */
    public native SVGTransform createSVGTransformFromMatrix(SVGMatrix matrix);
    /** 
      * Std Signature : S(getItem,115,,P(d2))
      * TE Signature : S(getItem,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@635488
     */
    public native SVGTransform getItem(Number index);
    /** 
      * Std Signature : S(initialize,115,,P(d115))
      * TE Signature : S(initialize,P(d115))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@635530
     */
    public native SVGTransform initialize(SVGTransform newItem);
    /** 
      * Std Signature : S(insertItemBefore,115,,P(d115),P(d2))
      * TE Signature : S(insertItemBefore,P(d115),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@635583
     */
    public native SVGTransform insertItemBefore(SVGTransform newItem, Number index);
    /** 
      * Std Signature : S(removeItem,115,,P(d2))
      * TE Signature : S(removeItem,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@635657
     */
    public native SVGTransform removeItem(Number index);
    /** 
      * Std Signature : S(replaceItem,115,,P(d115),P(d2))
      * TE Signature : S(replaceItem,P(d115),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@635702
     */
    public native SVGTransform replaceItem(SVGTransform newItem, Number index);
}

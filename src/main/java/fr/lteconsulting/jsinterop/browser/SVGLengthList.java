package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: SVGLengthList
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:603660
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:604063
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGLengthList")
public class SVGLengthList
{

    /*
        Constructors
    */
    public SVGLengthList(){
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
      * Std Signature : S(appendItem,121,,P(d121))
      * TE Signature : S(appendItem,P(d121))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@603728
     */
    public native SVGLength appendItem(SVGLength newItem);
    /** 
      * Std Signature : S(clear,289,,)
      * TE Signature : S(clear,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@603775
     */
    public native void clear();
    /** 
      * Std Signature : S(getItem,121,,P(d2))
      * TE Signature : S(getItem,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@603794
     */
    public native SVGLength getItem(Number index);
    /** 
      * Std Signature : S(initialize,121,,P(d121))
      * TE Signature : S(initialize,P(d121))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@603833
     */
    public native SVGLength initialize(SVGLength newItem);
    /** 
      * Std Signature : S(insertItemBefore,121,,P(d121),P(d2))
      * TE Signature : S(insertItemBefore,P(d121),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@603880
     */
    public native SVGLength insertItemBefore(SVGLength newItem, Number index);
    /** 
      * Std Signature : S(removeItem,121,,P(d2))
      * TE Signature : S(removeItem,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@603948
     */
    public native SVGLength removeItem(Number index);
    /** 
      * Std Signature : S(replaceItem,121,,P(d121),P(d2))
      * TE Signature : S(replaceItem,P(d121),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@603990
     */
    public native SVGLength replaceItem(SVGLength newItem, Number index);
}

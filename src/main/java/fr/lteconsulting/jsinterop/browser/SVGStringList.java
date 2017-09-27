package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: SVGStringList
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:627939
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:628312
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGStringList")
public class SVGStringList
{

    /*
        Constructors
    */
    public SVGStringList(){
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
      * Std Signature : S(appendItem,1,,P(d1))
      * TE Signature : S(appendItem,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@628007
     */
    public native String appendItem(String newItem);
    /** 
      * Std Signature : S(clear,289,,)
      * TE Signature : S(clear,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@628048
     */
    public native void clear();
    /** 
      * Std Signature : S(getItem,1,,P(d2))
      * TE Signature : S(getItem,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@628067
     */
    public native String getItem(Number index);
    /** 
      * Std Signature : S(initialize,1,,P(d1))
      * TE Signature : S(initialize,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@628103
     */
    public native String initialize(String newItem);
    /** 
      * Std Signature : S(insertItemBefore,1,,P(d1),P(d2))
      * TE Signature : S(insertItemBefore,P(d1),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@628144
     */
    public native String insertItemBefore(String newItem, Number index);
    /** 
      * Std Signature : S(removeItem,1,,P(d2))
      * TE Signature : S(removeItem,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@628206
     */
    public native String removeItem(Number index);
    /** 
      * Std Signature : S(replaceItem,1,,P(d1),P(d2))
      * TE Signature : S(replaceItem,P(d1),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@628245
     */
    public native String replaceItem(String newItem, Number index);
}

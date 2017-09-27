package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: DocumentOrShadowRoot
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:743488
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface DocumentOrShadowRoot
{

    /*
        Properties
    */

    @JsProperty( name = "activeElement")
    Element getActiveElement();

    @JsProperty( name = "activeElement")
    void setActiveElement( Element value );

    @JsProperty( name = "stylesheets")
    StyleSheetList getStylesheets();

    @JsProperty( name = "stylesheets")
    void setStylesheets( StyleSheetList value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(elementFromPoint,49,,P(d2),P(d2))
      * TE Signature : S(elementFromPoint,P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@743651
     */
    Element elementFromPoint(Number x, Number y);
    /** 
      * Std Signature : S(elementsFromPoint,7<49>,,P(d2),P(d2))
      * TE Signature : S(elementsFromPoint,P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@743711
     */
    Array<Element> elementsFromPoint(Number x, Number y);
    /** 
      * Std Signature : S(getSelection,292,,)
      * TE Signature : S(getSelection,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@743613
     */
    Selection getSelection();
}

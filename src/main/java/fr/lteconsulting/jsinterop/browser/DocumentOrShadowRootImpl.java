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
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="DocumentOrShadowRoot")
public class DocumentOrShadowRootImpl implements DocumentOrShadowRoot
{

    /*
        Properties
    */

    public Element activeElement;

    @JsProperty( name = "activeElement")
    public native Element getActiveElement();

    @JsProperty( name = "activeElement")
    public native void setActiveElement( Element value );

    public StyleSheetList stylesheets;

    @JsProperty( name = "stylesheets")
    public native StyleSheetList getStylesheets();

    @JsProperty( name = "stylesheets")
    public native void setStylesheets( StyleSheetList value );

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
    public native Element elementFromPoint(Number x, Number y);
    /** 
      * Std Signature : S(elementsFromPoint,7<49>,,P(d2),P(d2))
      * TE Signature : S(elementsFromPoint,P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@743711
     */
    public native Array<Element> elementsFromPoint(Number x, Number y);
    /** 
      * Std Signature : S(getSelection,292,,)
      * TE Signature : S(getSelection,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@743613
     */
    public native Selection getSelection();
}

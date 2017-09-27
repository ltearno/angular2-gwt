package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.prebuilt.Action2;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/selector".SelectorContext
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/selector.d.ts:2170
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler", name="SelectorContext")
public class SelectorContext
{

    /*
        Constructors
    */
    public SelectorContext(CssSelector selector, Object cbContext, SelectorListContext listContext){
    }

    /*
        Properties
    */

    public Object cbContext;

    @JsProperty( name = "cbContext")
    public native Object getCbContext();

    @JsProperty( name = "cbContext")
    public native void setCbContext( Object value );

    public SelectorListContext listContext;

    @JsProperty( name = "listContext")
    public native SelectorListContext getListContext();

    @JsProperty( name = "listContext")
    public native void setListContext( SelectorListContext value );

    public Array<CssSelector> notSelectors;

    @JsProperty( name = "notSelectors")
    public native Array<CssSelector> getNotSelectors();

    @JsProperty( name = "notSelectors")
    public native void setNotSelectors( Array<CssSelector> value );

    public CssSelector selector;

    @JsProperty( name = "selector")
    public native CssSelector getSelector();

    @JsProperty( name = "selector")
    public native void setSelector( CssSelector value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(finalize,27,,P(d557),P(dFP1-,P2--S(?,429,,P(d3),P(d4))------)<557,3>))
      * TE Signature : S(finalize,P(d557),P(dF--S(?,P(d3),P(d4))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/selector.d.ts@2422
     */
    public native Boolean finalize(CssSelector cssSelector, Action2<CssSelector, Object> callback);
}

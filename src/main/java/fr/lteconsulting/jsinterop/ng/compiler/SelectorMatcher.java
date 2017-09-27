package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.prebuilt.Action2;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/selector".SelectorMatcher
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/selector.d.ts:692

  * Reads a list of CssSelectors and allows to calculate which ones
  * are contained in a given CssSelector.
 */
@JsType(isNative=true, namespace="ng.compiler", name="SelectorMatcher")
public class SelectorMatcher
{

    /*
        Static methods
    */
    /** 
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/selector.d.ts:852
     */
    @JsMethod(namespace="ng.compiler.SelectorMatcher", name = "createNotMatcher")
    public static native SelectorMatcher createNotMatcher(Array<CssSelector> notSelectors);

    /*
        Properties
    */

    public Object _attrValueMap;

    @JsProperty( name = "_attrValueMap")
    public native Object get_attrValueMap();

    @JsProperty( name = "_attrValueMap")
    public native void set_attrValueMap( Object value );

    public Object _attrValuePartialMap;

    @JsProperty( name = "_attrValuePartialMap")
    public native Object get_attrValuePartialMap();

    @JsProperty( name = "_attrValuePartialMap")
    public native void set_attrValuePartialMap( Object value );

    public Object _classMap;

    @JsProperty( name = "_classMap")
    public native Object get_classMap();

    @JsProperty( name = "_classMap")
    public native void set_classMap( Object value );

    public Object _classPartialMap;

    @JsProperty( name = "_classPartialMap")
    public native Object get_classPartialMap();

    @JsProperty( name = "_classPartialMap")
    public native void set_classPartialMap( Object value );

    public Object _elementMap;

    @JsProperty( name = "_elementMap")
    public native Object get_elementMap();

    @JsProperty( name = "_elementMap")
    public native void set_elementMap( Object value );

    public Object _elementPartialMap;

    @JsProperty( name = "_elementPartialMap")
    public native Object get_elementPartialMap();

    @JsProperty( name = "_elementPartialMap")
    public native void set_elementPartialMap( Object value );

    public Object _listContexts;

    @JsProperty( name = "_listContexts")
    public native Object get_listContexts();

    @JsProperty( name = "_listContexts")
    public native void set_listContexts( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(_addPartial,3,,P(d3),P(d3))
      * TE Signature : S(_addPartial,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/selector.d.ts@1545
     */
    public native Object _addPartial(Object map, Object name);
    /** 
      * Std Signature : S(_addSelectable,3,,P(d3),P(d3),P(d3))
      * TE Signature : S(_addSelectable,P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/selector.d.ts@1428
      * Add an object that can be found later on by calling `match`.
     */
    public native Object _addSelectable(Object cssSelector, Object callbackCtxt, Object listContext);
    /** 
      * Std Signature : S(_addTerminal,3,,P(d3),P(d3),P(d3))
      * TE Signature : S(_addTerminal,P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/selector.d.ts@1496
     */
    public native Object _addTerminal(Object map, Object name, Object selectable);
    /** 
      * Std Signature : S(addSelectables,429,,P(d7<557>))
      * TE Signature : S(addSelectables,P(d7))
      * 
     */
    public native void addSelectables(Array<CssSelector> cssSelectors);
    /** 
      * Std Signature : S(addSelectables,429,,P(d7<557>),P(d3))
      * TE Signature : S(addSelectables,P(d7),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/selector.d.ts@1125
     */
    public native void addSelectables(Array<CssSelector> cssSelectors, Object callbackCtxt /* optional */);
    /** 
      * Std Signature : S(match,27,,P(d557),P(dFP1-,P2--S(?,429,,P(d3),P(d4))------)<557,3>))
      * TE Signature : S(match,P(d557),P(dF--S(?,P(d3),P(d4))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/selector.d.ts@1920
      * Find the objects that have been added via `addSelectable`
      * whose css selector is contained in the given css selector.
     */
    public native Boolean match(CssSelector cssSelector, Action2<CssSelector, Object> matchedCallback);
}

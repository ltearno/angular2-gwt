package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/selector".CssSelector
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/selector.d.ts:0

  * A css selector contains an element name,
  * css classes and attribute/value pairs with the purpose
  * of selecting subsets out of them.
 */
@JsType(isNative=true, namespace="ng.compiler", name="CssSelector")
public class CssSelector
{

    /*
        Static methods
    */
    /** 
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/selector.d.ts:294
     */
    @JsMethod(namespace="ng.compiler.CssSelector", name = "parse")
    public static native Array<CssSelector> parse(String selector);

    /*
        Properties
    */

    public Array<String> attrs;

    @JsProperty( name = "attrs")
    public native Array<String> getAttrs();

    @JsProperty( name = "attrs")
    public native void setAttrs( Array<String> value );

    public Array<String> classNames;

    @JsProperty( name = "classNames")
    public native Array<String> getClassNames();

    @JsProperty( name = "classNames")
    public native void setClassNames( Array<String> value );

    public String element;

    @JsProperty( name = "element")
    public native String getElement__();

    @JsProperty( name = "element")
    public native void setElement__( String value );

    public Array<CssSelector> notSelectors;

    @JsProperty( name = "notSelectors")
    public native Array<CssSelector> getNotSelectors();

    @JsProperty( name = "notSelectors")
    public native void setNotSelectors( Array<CssSelector> value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(addAttribute,429,,P(d1))
      * TE Signature : S(addAttribute,P(d1))
      * 
     */
    public native void addAttribute(String name);
    /** 
      * Std Signature : S(addAttribute,429,,P(d1),P(d1))
      * TE Signature : S(addAttribute,P(d1),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/selector.d.ts@579
     */
    public native void addAttribute(String name, String value /* optional */);
    /** 
      * Std Signature : S(addClassName,429,,P(d1))
      * TE Signature : S(addClassName,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/selector.d.ts@633
     */
    public native void addClassName(String name);
    /** 
      * Std Signature : S(getMatchingElementTemplate,1,,)
      * TE Signature : S(getMatchingElementTemplate,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/selector.d.ts@537
      * Gets a template string for an element that matches the selector. 
     */
    public native String getMatchingElementTemplate();
    /** 
      * Std Signature : S(hasElementSelector,27,,)
      * TE Signature : S(hasElementSelector,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/selector.d.ts@379
     */
    public native Boolean hasElementSelector();
    /** 
      * Std Signature : S(isElementSelector,27,,)
      * TE Signature : S(isElementSelector,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/selector.d.ts@345
     */
    public native Boolean isElementSelector();
    /** 
      * Std Signature : S(setElement,429,,)
      * TE Signature : S(setElement,)
      * 
     */
    public native void setElement();
    /** 
      * Std Signature : S(setElement,429,,P(d1))
      * TE Signature : S(setElement,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/selector.d.ts@414
     */
    public native void setElement(String element /* optional */);
}

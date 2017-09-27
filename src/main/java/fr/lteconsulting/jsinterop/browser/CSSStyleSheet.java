package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: CSSStyleSheet
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:309291
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:310111
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="CSSStyleSheet")
public class CSSStyleSheet extends StyleSheet
{

    /*
        Constructors
    */
    public CSSStyleSheet(){
    }

    /*
        Properties
    */

    public CSSRuleList cssRules;

    @JsProperty( name = "cssRules")
    public native CSSRuleList getCssRules();

    @JsProperty( name = "cssRules")
    public native void setCssRules( CSSRuleList value );

    public String cssText;

    @JsProperty( name = "cssText")
    public native String getCssText();

    @JsProperty( name = "cssText")
    public native void setCssText( String value );

    public String id;

    @JsProperty( name = "id")
    public native String getId();

    @JsProperty( name = "id")
    public native void setId( String value );

    public StyleSheetList imports;

    @JsProperty( name = "imports")
    public native StyleSheetList getImports();

    @JsProperty( name = "imports")
    public native void setImports( StyleSheetList value );

    public Boolean isAlternate;

    @JsProperty( name = "isAlternate")
    public native Boolean getIsAlternate();

    @JsProperty( name = "isAlternate")
    public native void setIsAlternate( Boolean value );

    public Boolean isPrefAlternate;

    @JsProperty( name = "isPrefAlternate")
    public native Boolean getIsPrefAlternate();

    @JsProperty( name = "isPrefAlternate")
    public native void setIsPrefAlternate( Boolean value );

    public CSSRule ownerRule;

    @JsProperty( name = "ownerRule")
    public native CSSRule getOwnerRule();

    @JsProperty( name = "ownerRule")
    public native void setOwnerRule( CSSRule value );

    public Element owningElement;

    @JsProperty( name = "owningElement")
    public native Element getOwningElement();

    @JsProperty( name = "owningElement")
    public native void setOwningElement( Element value );

    public StyleSheetPageList pages;

    @JsProperty( name = "pages")
    public native StyleSheetPageList getPages();

    @JsProperty( name = "pages")
    public native void setPages( StyleSheetPageList value );

    public Boolean readOnly;

    @JsProperty( name = "readOnly")
    public native Boolean getReadOnly();

    @JsProperty( name = "readOnly")
    public native void setReadOnly( Boolean value );

    public CSSRuleList rules;

    @JsProperty( name = "rules")
    public native CSSRuleList getRules();

    @JsProperty( name = "rules")
    public native void setRules( CSSRuleList value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(addImport,2,,P(d1))
      * TE Signature : S(addImport,P(d1))
      * 
     */
    public native Number addImport(String bstrURL);
    /** 
      * Std Signature : S(addImport,2,,P(d1),P(d2))
      * TE Signature : S(addImport,P(d1),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@309711
     */
    public native Number addImport(String bstrURL, Number lIndex /* optional */);
    /** 
      * Std Signature : S(addPageRule,2,,P(d1),P(d1))
      * TE Signature : S(addPageRule,P(d1),P(d1))
      * 
     */
    public native Number addPageRule(String bstrSelector, String bstrStyle);
    /** 
      * Std Signature : S(addPageRule,2,,P(d1),P(d1),P(d2))
      * TE Signature : S(addPageRule,P(d1),P(d1),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@309768
     */
    public native Number addPageRule(String bstrSelector, String bstrStyle, Number lIndex /* optional */);
    /** 
      * Std Signature : S(addRule,2,,P(d1))
      * TE Signature : S(addRule,P(d1))
      * 
     */
    public native Number addRule(String bstrSelector);
    /** 
      * Std Signature : S(addRule,2,,P(d1),P(d1))
      * TE Signature : S(addRule,P(d1),P(d1))
      * 
     */
    public native Number addRule(String bstrSelector, String bstrStyle /* optional */);
    /** 
      * Std Signature : S(addRule,2,,P(d1),P(d1),P(d2))
      * TE Signature : S(addRule,P(d1),P(d1),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@309851
     */
    public native Number addRule(String bstrSelector, String bstrStyle /* optional */, Number lIndex /* optional */);
    /** 
      * Std Signature : S(deleteRule,289,,)
      * TE Signature : S(deleteRule,)
      * 
     */
    public native void deleteRule();
    /** 
      * Std Signature : S(deleteRule,289,,P(d2))
      * TE Signature : S(deleteRule,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@309931
     */
    public native void deleteRule(Number index /* optional */);
    /** 
      * Std Signature : S(insertRule,2,,P(d1))
      * TE Signature : S(insertRule,P(d1))
      * 
     */
    public native Number insertRule(String rule);
    /** 
      * Std Signature : S(insertRule,2,,P(d1),P(d2))
      * TE Signature : S(insertRule,P(d1),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@309969
     */
    public native Number insertRule(String rule, Number index /* optional */);
    /** 
      * Std Signature : S(removeImport,289,,P(d2))
      * TE Signature : S(removeImport,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@310023
     */
    public native void removeImport(Number lIndex);
    /** 
      * Std Signature : S(removeRule,289,,P(d2))
      * TE Signature : S(removeRule,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@310063
     */
    public native void removeRule(Number lIndex);
}

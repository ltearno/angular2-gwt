package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: CSSGroupingRule
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:293891
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:294077
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="CSSGroupingRule")
public class CSSGroupingRule extends CSSRule
{

    /*
        Constructors
    */
    public CSSGroupingRule(){
    }

    /*
        Properties
    */

    public CSSRuleList cssRules;

    @JsProperty( name = "cssRules")
    public native CSSRuleList getCssRules();

    @JsProperty( name = "cssRules")
    public native void setCssRules( CSSRuleList value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(deleteRule,289,,P(d2))
      * TE Signature : S(deleteRule,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@293977
     */
    public native void deleteRule(Number index);
    /** 
      * Std Signature : S(insertRule,2,,P(d1),P(d2))
      * TE Signature : S(insertRule,P(d1),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@294014
     */
    public native Number insertRule(String rule, Number index);
}

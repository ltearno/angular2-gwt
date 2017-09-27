package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: CSSKeyframesRule
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:294592
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:294824
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="CSSKeyframesRule")
public class CSSKeyframesRule extends CSSRule
{

    /*
        Constructors
    */
    public CSSKeyframesRule(){
    }

    /*
        Properties
    */

    public CSSRuleList cssRules;

    @JsProperty( name = "cssRules")
    public native CSSRuleList getCssRules();

    @JsProperty( name = "cssRules")
    public native void setCssRules( CSSRuleList value );

    public String name;

    @JsProperty( name = "name")
    public native String getName();

    @JsProperty( name = "name")
    public native void setName( String value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(appendRule,289,,P(d1))
      * TE Signature : S(appendRule,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@294697
     */
    public native void appendRule(String rule);
    /** 
      * Std Signature : S(deleteRule,289,,P(d1))
      * TE Signature : S(deleteRule,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@294733
     */
    public native void deleteRule(String rule);
    /** 
      * Std Signature : S(findRule,545,,P(d1))
      * TE Signature : S(findRule,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@294769
     */
    public native CSSKeyframeRule findRule(String rule);
}

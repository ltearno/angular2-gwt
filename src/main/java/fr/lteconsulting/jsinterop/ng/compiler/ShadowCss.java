package fr.lteconsulting.jsinterop.ng.compiler;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/compiler/src/shadow_css".ShadowCss
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/compiler/src/shadow_css.d.ts:0
  * 1 constructors
  * This file is a port of shadowCSS from webcomponents.js to TypeScript.
  * 
  * Please make sure to keep to edits in sync with the source file.
  * 
  * Source:
  * https://github.com/webcomponents/webcomponentsjs/blob/4efecd7e0e/src/ShadowCSS/ShadowCSS.js
  * 
  * The original file level comment is reproduced below
 */
@JsType(isNative=true, namespace="ng.compiler", name="ShadowCss")
public class ShadowCss
{

    /*
        Constructors
    */
    public ShadowCss(){
    }

    /*
        Properties
    */

    public Boolean strictStyling;

    @JsProperty( name = "strictStyling")
    public native Boolean getStrictStyling();

    @JsProperty( name = "strictStyling")
    public native void setStrictStyling( Boolean value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(_applySelectorScope,3,,P(d3),P(d3),P(d3))
      * TE Signature : S(_applySelectorScope,P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/compiler/src/shadow_css.d.ts@1522
     */
    public native Object _applySelectorScope(Object selector, Object scopeSelector, Object hostSelector);
    /** 
      * Std Signature : S(_applySimpleSelectorScope,3,,P(d3),P(d3),P(d3))
      * TE Signature : S(_applySimpleSelectorScope,P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/compiler/src/shadow_css.d.ts@1594
     */
    public native Object _applySimpleSelectorScope(Object selector, Object scopeSelector, Object hostSelector);
    /** 
      * Std Signature : S(_colonHostContextPartReplacer,3,,P(d3),P(d3),P(d3))
      * TE Signature : S(_colonHostContextPartReplacer,P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/compiler/src/shadow_css.d.ts@1106
     */
    public native Object _colonHostContextPartReplacer(Object host, Object part, Object suffix);
    /** 
      * Std Signature : S(_colonHostPartReplacer,3,,P(d3),P(d3),P(d3))
      * TE Signature : S(_colonHostPartReplacer,P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/compiler/src/shadow_css.d.ts@1169
     */
    public native Object _colonHostPartReplacer(Object host, Object part, Object suffix);
    /** 
      * Std Signature : S(_convertColonHost,3,,P(d3))
      * TE Signature : S(_convertColonHost,P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/compiler/src/shadow_css.d.ts@957
     */
    public native Object _convertColonHost(Object cssText);
    /** 
      * Std Signature : S(_convertColonHostContext,3,,P(d3))
      * TE Signature : S(_convertColonHostContext,P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/compiler/src/shadow_css.d.ts@997
     */
    public native Object _convertColonHostContext(Object cssText);
    /** 
      * Std Signature : S(_convertColonRule,3,,P(d3),P(d3),P(d3))
      * TE Signature : S(_convertColonRule,P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/compiler/src/shadow_css.d.ts@1044
     */
    public native Object _convertColonRule(Object cssText, Object regExp, Object partReplacer);
    /** 
      * Std Signature : S(_convertShadowDOMSelectors,3,,P(d3))
      * TE Signature : S(_convertShadowDOMSelectors,P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/compiler/src/shadow_css.d.ts@1225
     */
    public native Object _convertShadowDOMSelectors(Object cssText);
    /** 
      * Std Signature : S(_extractUnscopedRulesFromCssText,3,,P(d3))
      * TE Signature : S(_extractUnscopedRulesFromCssText,P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/compiler/src/shadow_css.d.ts@902
     */
    public native Object _extractUnscopedRulesFromCssText(Object cssText);
    /** 
      * Std Signature : S(_insertDirectives,3,,P(d3))
      * TE Signature : S(_insertDirectives,P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/compiler/src/shadow_css.d.ts@688
     */
    public native Object _insertDirectives(Object cssText);
    /** 
      * Std Signature : S(_insertPolyfillDirectivesInCssText,3,,P(d3))
      * TE Signature : S(_insertPolyfillDirectivesInCssText,P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/compiler/src/shadow_css.d.ts@728
     */
    public native Object _insertPolyfillDirectivesInCssText(Object cssText);
    /** 
      * Std Signature : S(_insertPolyfillHostInCssText,3,,P(d3))
      * TE Signature : S(_insertPolyfillHostInCssText,P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/compiler/src/shadow_css.d.ts@1672
     */
    public native Object _insertPolyfillHostInCssText(Object selector);
    /** 
      * Std Signature : S(_insertPolyfillRulesInCssText,3,,P(d3))
      * TE Signature : S(_insertPolyfillRulesInCssText,P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/compiler/src/shadow_css.d.ts@785
     */
    public native Object _insertPolyfillRulesInCssText(Object cssText);
    /** 
      * Std Signature : S(_makeScopeMatcher,3,,P(d3))
      * TE Signature : S(_makeScopeMatcher,P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/compiler/src/shadow_css.d.ts@1476
     */
    public native Object _makeScopeMatcher(Object scopeSelector);
    /** 
      * Std Signature : S(_scopeCssText,3,,P(d3),P(d3),P(d3))
      * TE Signature : S(_scopeCssText,P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/compiler/src/shadow_css.d.ts@837
     */
    public native Object _scopeCssText(Object cssText, Object scopeSelector, Object hostSelector);
    /** 
      * Std Signature : S(_scopeSelector,3,,P(d3),P(d3),P(d3),P(d3))
      * TE Signature : S(_scopeSelector,P(d3),P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/compiler/src/shadow_css.d.ts@1341
     */
    public native Object _scopeSelector(Object selector, Object scopeSelector, Object hostSelector, Object strict);
    /** 
      * Std Signature : S(_scopeSelectors,3,,P(d3),P(d3),P(d3))
      * TE Signature : S(_scopeSelectors,P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/compiler/src/shadow_css.d.ts@1274
     */
    public native Object _scopeSelectors(Object cssText, Object scopeSelector, Object hostSelector);
    /** 
      * Std Signature : S(_selectorNeedsScoping,3,,P(d3),P(d3))
      * TE Signature : S(_selectorNeedsScoping,P(d3),P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/compiler/src/shadow_css.d.ts@1416
     */
    public native Object _selectorNeedsScoping(Object selector, Object scopeSelector);
    /** 
      * Std Signature : S(shimCssText,1,,P(d1),P(d1))
      * TE Signature : S(shimCssText,P(d1),P(d1))
      * 
     */
    public native String shimCssText(String cssText, String selector);
    /** 
      * Std Signature : S(shimCssText,1,,P(d1),P(d1),P(d1))
      * TE Signature : S(shimCssText,P(d1),P(d1),P(d1))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/compiler/src/shadow_css.d.ts@605
     */
    public native String shimCssText(String cssText, String selector, String hostSelector /* optional */);
}

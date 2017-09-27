package fr.lteconsulting.jsinterop.ng;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.PropertyKey_UnionOfNumberAndString;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/browser/src/dsl/style_normalization/animation_style_normalizer".NoopAnimationStyleNormalizer
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/browser/src/dsl/style_normalization/animation_style_normalizer.d.ts:547
  * 
 */
@JsType(isNative=true, namespace="ng", name="NoopAnimationStyleNormalizer")
public class NoopAnimationStyleNormalizer
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(normalizePropertyName,1,,P(d1),P(d7<1>))
      * TE Signature : S(normalizePropertyName,P(d1),P(d7))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/browser/src/dsl/style_normalization/animation_style_normalizer.d.ts@664
     */
    public native String normalizePropertyName(String propertyName, Array<String> errors);
    /** 
      * Std Signature : S(normalizeStyleValue,1,,P(d1),P(d1),P(d1),P(d7<1>))
      * TE Signature : S(normalizeStyleValue,P(d1),P(d1),P(d1),P(d7))
      * 
     */
    public native String normalizeStyleValue(String userProvidedProperty, String normalizedProperty, String value, Array<String> errors);
    /** 
      * Std Signature : S(normalizeStyleValue,1,,P(d1),P(d1),P(d2),P(d7<1>))
      * TE Signature : S(normalizeStyleValue,P(d1),P(d1),P(d2),P(d7))
      * 
     */
    public native String normalizeStyleValue(String userProvidedProperty, String normalizedProperty, Number value, Array<String> errors);
    /** 
      * Std Signature : S(normalizeStyleValue,1,,P(d1),P(d1),P(dU(-2,1)),P(d7<1>))
      * TE Signature : S(normalizeStyleValue,P(d1),P(d1),P(dU(-2,1)),P(d7))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/browser/src/dsl/style_normalization/animation_style_normalizer.d.ts@739
     */
    public native String normalizeStyleValue(String userProvidedProperty, String normalizedProperty, PropertyKey_UnionOfNumberAndString value, Array<String> errors);
}

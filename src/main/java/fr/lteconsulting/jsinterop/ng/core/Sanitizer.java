package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.browser.UnionOfObjectAndString;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/security".Sanitizer
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/security.d.ts:641

  * Sanitizer is used by the views to sanitize potentially dangerous values.
 */
@JsType(isNative=true, namespace="ng.core", name="Sanitizer")
public class Sanitizer
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(sanitize,1,,P(d391),P(d1))
      * TE Signature : S(sanitize,P(d391),P(d1))
      * 
     */
    public native String sanitize(SecurityContext context, String value);
    /** 
      * Std Signature : S(sanitize,1,,P(d391),P(d3))
      * TE Signature : S(sanitize,P(d391),P(d3))
      * 
     */
    public native String sanitize(SecurityContext context, Object value);
    /** 
      * Std Signature : S(sanitize,1,,P(d391),P(dU(-3,1)))
      * TE Signature : S(sanitize,P(d391),P(dU(-3,1)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/security.d.ts@786
     */
    public native String sanitize(SecurityContext context, UnionOfObjectAndString value);
}

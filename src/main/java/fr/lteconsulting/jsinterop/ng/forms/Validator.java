package fr.lteconsulting.jsinterop.ng.forms;

import fr.lteconsulting.jsinterop.browser.AnonymousType717;
import fr.lteconsulting.prebuilt.Action;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/directives/validators".Validator
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/directives/validators.d.ts:449

  * An interface that can be implemented by classes that can act as validators.
  * 
  * ## Usage
  * 
  * ```typescript
 */
@JsType(isNative=true, namespace="ng.forms", name="Validator")
public class Validator
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(registerOnValidatorChange,429,,P(dF--S(?,429,,)------)))
      * TE Signature : S(registerOnValidatorChange,P(dF--S(?,)------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/directives/validators.d.ts@990
     */
    public native void registerOnValidatorChange(Action fn);
    /** 
      * Std Signature : S(validate,C(----3----),,P(d626))
      * TE Signature : S(validate,P(d626))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/directives/validators.d.ts@931
     */
    public native AnonymousType717 validate(AbstractControl c);
}

package fr.lteconsulting.jsinterop.ng.forms;

import fr.lteconsulting.jsinterop.browser.AnonymousType717;
import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.UnionOfRegExpAndString;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/validators".Validators
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/validators.d.ts:979

  * Provides a set of validators used by form controls.
  * 
  * A validator is a function that processes a {@link FormControl} or collection of
  * controls and returns a map of errors. A null map means that validation has passed.
  * 
  * ### Example
  * 
  * ```typescript
  * var loginControl = new FormControl("", Validators.required)
  * ```
 */
@JsType(isNative=true, namespace="ng.forms", name="Validators")
public class Validators
{

    /*
        Static methods
    */
    /** 
      * Validator that requires controls to have a value greater than a number.
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/validators.d.ts:1470
     */
    @JsMethod(namespace="ng.forms.Validators", name = "min")
    public static native ValidatorFn min(Number min);
    /** 
      * Validator that requires controls to have a value less than a number.
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/validators.d.ts:1604
     */
    @JsMethod(namespace="ng.forms.Validators", name = "max")
    public static native ValidatorFn max(Number max);
    /** 
      * Validator that requires controls to have a non-empty value.
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/validators.d.ts:1729
     */
    @JsMethod(namespace="ng.forms.Validators", name = "required")
    public static native AnonymousType717 required(AbstractControl control);
    /** 
      * Validator that requires control value to be true.
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/validators.d.ts:1874
     */
    @JsMethod(namespace="ng.forms.Validators", name = "requiredTrue")
    public static native AnonymousType717 requiredTrue(AbstractControl control);
    /** 
      * Validator that performs email validation.
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/validators.d.ts:2015
     */
    @JsMethod(namespace="ng.forms.Validators", name = "email")
    public static native AnonymousType717 email(AbstractControl control);
    /** 
      * Validator that requires controls to have a value of a minimum length.
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/validators.d.ts:2177
     */
    @JsMethod(namespace="ng.forms.Validators", name = "minLength")
    public static native ValidatorFn minLength(Number minLength);
    /** 
      * Validator that requires controls to have a value of a maximum length.
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/validators.d.ts:2324
     */
    @JsMethod(namespace="ng.forms.Validators", name = "maxLength")
    public static native ValidatorFn maxLength(Number maxLength);
    /** 
      * Validator that requires a control to match a regex to its value.
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/validators.d.ts:2466
     */
    @JsMethod(namespace="ng.forms.Validators", name = "pattern")
    public static native ValidatorFn pattern(UnionOfRegExpAndString pattern);
    /** 
      * No-op validator.
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/validators.d.ts:2565
     */
    @JsMethod(namespace="ng.forms.Validators", name = "nullValidator")
    public static native AnonymousType717 nullValidator(AbstractControl c);
    /** 
      * Compose multiple validators into a single function that returns the union
      * of the individual error maps.
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/validators.d.ts:2770
     */
    @JsMethod(namespace="ng.forms.Validators", name = "compose")
    public static native Void compose(Void validators);
    /** 
      * Compose multiple validators into a single function that returns the union
      * of the individual error maps.
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/validators.d.ts:2770
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/validators.d.ts:2814
     */
    @JsMethod(namespace="ng.forms.Validators", name = "compose")
    public static native ValidatorFn compose(Array<ValidatorFn> validators);
    /** 
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/validators.d.ts:2902
     */
    @JsMethod(namespace="ng.forms.Validators", name = "composeAsync")
    public static native AsyncValidatorFn composeAsync(Array<AsyncValidatorFn> validators);
}

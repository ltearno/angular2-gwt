package fr.lteconsulting.jsinterop.ng.forms;

import fr.lteconsulting.jsinterop.UnionOfArrayOfAsyncValidatorFnAndAsyncValidatorFn;
import fr.lteconsulting.jsinterop.UnionOfArrayOfValidatorFnAndValidatorFn;
import fr.lteconsulting.jsinterop.browser.Function;
import fr.lteconsulting.prebuilt.Action1;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/model".FormControl
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/model.d.ts:10172
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.forms", name="FormControl")
public class FormControl extends AbstractControl
{

    /*
        Constructors
    */
    public FormControl(Object formState, UnionOfArrayOfValidatorFnAndValidatorFn validator, UnionOfArrayOfAsyncValidatorFnAndAsyncValidatorFn asyncValidator){
        super(null, null);
    }

    /*
        Methods
    */
    /** 
      * Std Signature : S(_applyFormState,3,,P(d3))
      * TE Signature : S(_applyFormState,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/model.d.ts@14473
     */
    public native Object _applyFormState(Object formState);
    /** 
      * Std Signature : S(patchValue,429,,P(d3))
      * TE Signature : S(patchValue,P(d3))
      * 
     */
    public native void patchValue(Object value);
    /** 
      * Std Signature : S(patchValue,429,,P(d3),P(d3))
      * TE Signature : S(patchValue,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/model.d.ts@13141
      * Patches the value of a control.
      * 
      * This function is functionally the same as {@link FormControl#setValue} at this level.
      * It exists for symmetry with {@link FormGroup#patchValue} on `FormGroups` and `FormArrays`,
      * where it does behave differently.
     */
    public native void patchValue(Object value, Object options /* optional */);
    /** 
      * Std Signature : S(registerOnChange,429,,P(d205))
      * TE Signature : S(registerOnChange,P(d205))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/model.d.ts@14296
      * Register a listener for change events.
     */
    public native void registerOnChange(Function fn);
    /** 
      * Std Signature : S(registerOnDisabledChange,429,,P(dFP1--S(?,429,,P(d3))------)<27>))
      * TE Signature : S(registerOnDisabledChange,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/model.d.ts@14402
      * Register a listener for disabled events.
     */
    public native void registerOnDisabledChange(Action1<Boolean> fn);
    /** 
      * Std Signature : S(reset,429,,)
      * TE Signature : S(reset,)
      * 
     */
    public native void reset();
    /** 
      * Std Signature : S(reset,429,,P(d3))
      * TE Signature : S(reset,P(d3))
      * 
     */
    public native void reset(Object formState /* optional */);
    /** 
      * Std Signature : S(reset,429,,P(d3),P(d3))
      * TE Signature : S(reset,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/model.d.ts@14124
      * Resets the form control. This means by default:
      * 
      * * it is marked as `pristine`
      * * it is marked as `untouched`
      * * value is set to null
      * 
      * You can also reset to a specific form state by passing through a standalone
      * value or a form state object that contains both a value and a disabled state
      * (these are the only two properties that cannot be calculated).
      * 
      * Ex:
      * 
      * ```ts
      * this.control.reset('Nancy');
      * 
      * console.log(this.control.value);  // 'Nancy'
      * ```
      * 
      * OR
      * 
      * ```
      * this.control.reset({value: 'Nancy', disabled: true});
      * 
      * console.log(this.control.value);  // 'Nancy'
      * console.log(this.control.status);  // 'DISABLED'
      * ```
     */
    public native void reset(Object formState /* optional */, Object options /* optional */);
    /** 
      * Std Signature : S(setValue,429,,P(d3))
      * TE Signature : S(setValue,P(d3))
      * 
     */
    public native void setValue(Object value);
    /** 
      * Std Signature : S(setValue,429,,P(d3),P(d3))
      * TE Signature : S(setValue,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/model.d.ts@12657
      * Set the value of the form control to `value`.
      * 
      * If `onlySelf` is `true`, this change will only affect the validation of this `FormControl`
      * and not its parent component. This defaults to false.
      * 
      * If `emitEvent` is `true`, this
      * change will cause a `valueChanges` event on the `FormControl` to be emitted. This defaults
      * to true (as it falls through to `updateValueAndValidity`).
      * 
      * If `emitModelToViewChange` is `true`, the view will be notified about the new value
      * via an `onChange` event. This is the default behavior if `emitModelToViewChange` is not
      * specified.
      * 
      * If `emitViewToModelChange` is `true`, an ngModelChange event will be fired to update the
      * model.  This is the default behavior if `emitViewToModelChange` is not specified.
     */
    public native void setValue(Object value, Object options /* optional */);
}

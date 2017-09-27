package fr.lteconsulting.jsinterop.ng.forms;

import fr.lteconsulting.jsinterop.browser.AnonymousType1327;
import fr.lteconsulting.jsinterop.browser.AnonymousType717;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/model".FormGroup
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/model.d.ts:14510
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.forms", name="FormGroup")
public class FormGroup extends AbstractControl
{

    /*
        Constructors
    */
    public FormGroup(AnonymousType1327 controls, ValidatorFn validator, AsyncValidatorFn asyncValidator){
        super(null, null);
    }

    /*
        Properties
    */

    public AnonymousType1327 controls;

    @JsProperty( name = "controls")
    public native AnonymousType1327 getControls();

    @JsProperty( name = "controls")
    public native void setControls( AnonymousType1327 value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(addControl,429,,P(d1),P(d626))
      * TE Signature : S(addControl,P(d1),P(d626))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/model.d.ts@16883
      * Add a control to this group.
     */
    public native void addControl(String name, AbstractControl control);
    /** 
      * Std Signature : S(contains,27,,P(d1))
      * TE Signature : S(contains,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/model.d.ts@17416
      * Check whether there is an enabled control with the given name in the group.
      * 
      * It will return false for disabled controls. If you'd like to check for
      * existence in the group only, use {@link AbstractControl#get} instead.
     */
    public native Boolean contains(String controlName);
    /** 
      * Std Signature : S(getRawValue,3,,)
      * TE Signature : S(getRawValue,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/model.d.ts@20598
      * The aggregate value of the {@link FormGroup}, including any disabled controls.
      * 
      * If you'd like to include all values regardless of disabled status, use this method.
      * Otherwise, the `value` property is the best way to get the value of the group.
     */
    public native Object getRawValue();
    /** 
      * Std Signature : S(patchValue,429,,P(dC(----3----)))
      * TE Signature : S(patchValue,P(dC(----3----)))
      * 
     */
    public native void patchValue(AnonymousType717 value);
    /** 
      * Std Signature : S(patchValue,429,,P(dC(----3----)),P(d3))
      * TE Signature : S(patchValue,P(dC(----3----)),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/model.d.ts@19010
      * Patches the value of the {@link FormGroup}. It accepts an object with control
      * names as keys, and will do its best to match the values to the correct controls
      * in the group.
      * 
      * It accepts both super-sets and sub-sets of the group without throwing an error.
      * 
      * ### Example
      * 
      * ```
      * const form = new FormGroup({
      *     first: new FormControl(),
      *     last: new FormControl()
      * });
      * console.log(form.value);   // {first: null, last: null}
      * 
      * form.patchValue({first: 'Nancy'});
      * console.log(form.value);   // {first: 'Nancy', last: null}
      * 
      * ```
     */
    public native void patchValue(AnonymousType717 value, Object options /* optional */);
    /** 
      * Std Signature : S(registerControl,626,,P(d1),P(d626))
      * TE Signature : S(registerControl,P(d1),P(d626))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/model.d.ts@16753
      * Registers a control with the group's list of controls.
      * 
      * This method does not update value or validity of the control, so for
      * most cases you'll want to use {@link FormGroup#addControl} instead.
     */
    public native AbstractControl registerControl(String name, AbstractControl control);
    /** 
      * Std Signature : S(removeControl,429,,P(d1))
      * TE Signature : S(removeControl,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/model.d.ts@17002
      * Remove a control from this group.
     */
    public native void removeControl(String name);
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
    public native void reset(Object value /* optional */);
    /** 
      * Std Signature : S(reset,429,,P(d3),P(d3))
      * TE Signature : S(reset,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/model.d.ts@20206
      * Resets the {@link FormGroup}. This means by default:
      * 
      * * The group and all descendants are marked `pristine`
      * * The group and all descendants are marked `untouched`
      * * The value of all descendants will be null or null maps
      * 
      * You can also reset to a specific form state by passing in a map of states
      * that matches the structure of your form, with control names as keys. The state
      * can be a standalone value or a form state object with both a value and a disabled
      * status.
      * 
      * ### Example
      * 
      * ```ts
      * this.form.reset({first: 'name', last: 'last name'});
      * 
      * console.log(this.form.value);  // {first: 'name', last: 'last name'}
      * ```
      * 
      * - OR -
      * 
      * ```
      * this.form.reset({
      *    first: {value: 'name', disabled: true},
      *    last: 'last'
      * });
      * 
      * console.log(this.form.value);  // {first: 'name', last: 'last name'}
      * console.log(this.form.get('first').status);  // 'DISABLED'
      * ```
     */
    public native void reset(Object value /* optional */, Object options /* optional */);
    /** 
      * Std Signature : S(setControl,429,,P(d1),P(d626))
      * TE Signature : S(setControl,P(d1),P(d626))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/model.d.ts@17093
      * Replace an existing control.
     */
    public native void setControl(String name, AbstractControl control);
    /** 
      * Std Signature : S(setValue,429,,P(dC(----3----)))
      * TE Signature : S(setValue,P(dC(----3----)))
      * 
     */
    public native void setValue(AnonymousType717 value);
    /** 
      * Std Signature : S(setValue,429,,P(dC(----3----)),P(d3))
      * TE Signature : S(setValue,P(dC(----3----)),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/model.d.ts@18196
      * Sets the value of the {@link FormGroup}. It accepts an object that matches
      * the structure of the group, with control names as keys.
      * 
      * This method performs strict checks, so it will throw an error if you try
      * to set the value of a control that doesn't exist or if you exclude the
      * value of a control.
      * 
      * ### Example
      * 
      * ```
      * const form = new FormGroup({
      *     first: new FormControl(),
      *     last: new FormControl()
      * });
      * console.log(form.value);   // {first: null, last: null}
      * 
      * form.setValue({first: 'Nancy', last: 'Drew'});
      * console.log(form.value);   // {first: 'Nancy', last: 'Drew'}
      * 
      * ```
     */
    public native void setValue(AnonymousType717 value, Object options /* optional */);
}

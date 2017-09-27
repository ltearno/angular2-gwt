package fr.lteconsulting.jsinterop.ng.forms;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/model".FormArray
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/model.d.ts:20619
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.forms", name="FormArray")
public class FormArray extends AbstractControl
{

    /*
        Constructors
    */
    public FormArray(Array<AbstractControl> controls, ValidatorFn validator, AsyncValidatorFn asyncValidator){
        super(null, null);
    }

    /*
        Properties
    */

    public Array<AbstractControl> controls;

    @JsProperty( name = "controls")
    public native Array<AbstractControl> getControls();

    @JsProperty( name = "controls")
    public native void setControls( Array<AbstractControl> value );

    /** 
      * Length of the control array.
     */
    public Number length;

    @JsProperty( name = "length")
    public native Number getLength();

    @JsProperty( name = "length")
    public native void setLength( Number value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(_registerControl,3,,P(d3))
      * TE Signature : S(_registerControl,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/model.d.ts@26079
     */
    public native Object _registerControl(Object control);
    /** 
      * Std Signature : S(at,626,,P(d2))
      * TE Signature : S(at,P(d2))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/model.d.ts@22584
      * Get the {@link AbstractControl} at the given `index` in the array.
     */
    public native AbstractControl at(Number index);
    /** 
      * Std Signature : S(getRawValue,7<3>,,)
      * TE Signature : S(getRawValue,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/model.d.ts@26053
      * The aggregate value of the array, including any disabled controls.
      * 
      * If you'd like to include all values regardless of disabled status, use this method.
      * Otherwise, the `value` property is the best way to get the value of the array.
     */
    public native Array<Object> getRawValue();
    /** 
      * Std Signature : S(insert,429,,P(d2),P(d626))
      * TE Signature : S(insert,P(d2),P(d626))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/model.d.ts@22846
      * Insert a new {@link AbstractControl} at the given `index` in the array.
     */
    public native void insert(Number index, AbstractControl control);
    /** 
      * Std Signature : S(patchValue,429,,P(d7<3>))
      * TE Signature : S(patchValue,P(d7))
      * 
     */
    public native void patchValue(Array<Object> value);
    /** 
      * Std Signature : S(patchValue,429,,P(d7<3>),P(d3))
      * TE Signature : S(patchValue,P(d7),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/model.d.ts@24600
      * Patches the value of the {@link FormArray}. It accepts an array that matches the
      * structure of the control, and will do its best to match the values to the correct
      * controls in the group.
      * 
      * It accepts both super-sets and sub-sets of the array without throwing an error.
      * 
      * ### Example
      * 
      * ```
      * const arr = new FormArray([
      *     new FormControl(),
      *     new FormControl()
      * ]);
      * console.log(arr.value);   // [null, null]
      * 
      * arr.patchValue(['Nancy']);
      * console.log(arr.value);   // ['Nancy', null]
      * ```
     */
    public native void patchValue(Array<Object> value, Object options /* optional */);
    /** 
      * Std Signature : S(push,429,,P(d626))
      * TE Signature : S(push,P(d626))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/model.d.ts@22709
      * Insert a new {@link AbstractControl} at the end of the array.
     */
    public native void push(AbstractControl control);
    /** 
      * Std Signature : S(removeAt,429,,P(d2))
      * TE Signature : S(removeAt,P(d2))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/model.d.ts@22982
      * Remove the control at the given `index` in the array.
     */
    public native void removeAt(Number index);
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
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/model.d.ts@25673
      * Resets the {@link FormArray}. This means by default:
      * 
      * * The array and all descendants are marked `pristine`
      * * The array and all descendants are marked `untouched`
      * * The value of all descendants will be null or null maps
      * 
      * You can also reset to a specific form state by passing in an array of states
      * that matches the structure of the control. The state can be a standalone value
      * or a form state object with both a value and a disabled status.
      * 
      * ### Example
      * 
      * ```ts
      * this.arr.reset(['name', 'last name']);
      * 
      * console.log(this.arr.value);  // ['name', 'last name']
      * ```
      * 
      * - OR -
      * 
      * ```
      * this.arr.reset([
      *    {value: 'name', disabled: true},
      *    'last'
      * ]);
      * 
      * console.log(this.arr.value);  // ['name', 'last name']
      * console.log(this.arr.get(0).status);  // 'DISABLED'
      * ```
     */
    public native void reset(Object value /* optional */, Object options /* optional */);
    /** 
      * Std Signature : S(setControl,429,,P(d2),P(d626))
      * TE Signature : S(setControl,P(d2),P(d626))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/model.d.ts@23069
      * Replace an existing control.
     */
    public native void setControl(Number index, AbstractControl control);
    /** 
      * Std Signature : S(setValue,429,,P(d7<3>))
      * TE Signature : S(setValue,P(d7))
      * 
     */
    public native void setValue(Array<Object> value);
    /** 
      * Std Signature : S(setValue,429,,P(d7<3>),P(d3))
      * TE Signature : S(setValue,P(d7),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/model.d.ts@23859
      * Sets the value of the {@link FormArray}. It accepts an array that matches
      * the structure of the control.
      * 
      * This method performs strict checks, so it will throw an error if you try
      * to set the value of a control that doesn't exist or if you exclude the
      * value of a control.
      * 
      * ### Example
      * 
      * ```
      * const arr = new FormArray([
      *     new FormControl(),
      *     new FormControl()
      * ]);
      * console.log(arr.value);   // [null, null]
      * 
      * arr.setValue(['Nancy', 'Drew']);
      * console.log(arr.value);   // ['Nancy', 'Drew']
      * ```
     */
    public native void setValue(Array<Object> value, Object options /* optional */);
}

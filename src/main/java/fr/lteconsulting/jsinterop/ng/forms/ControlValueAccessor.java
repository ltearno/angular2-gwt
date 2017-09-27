package fr.lteconsulting.jsinterop.ng.forms;

import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/directives/control_value_accessor".ControlValueAccessor
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/directives/control_value_accessor.d.ts:250

  * A `ControlValueAccessor` acts as a bridge between the Angular forms API and a
  * native element in the DOM.
  * 
  * Implement this interface if you want to create a custom form control directive
  * that integrates with Angular forms.
 */
@JsType(isNative=true, namespace="ng.forms", name="ControlValueAccessor")
public class ControlValueAccessor
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(registerOnChange,429,,P(d3))
      * TE Signature : S(registerOnChange,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/directives/control_value_accessor.d.ts@1867
      * Registers a callback function that should be called when the control's value
      * changes in the UI.
      * 
      * This is called by the forms API on initialization so it can update the form
      * model when values propagate from the view (view -> model).
      * 
      * If you are implementing `registerOnChange` in your own value accessor, you
      * will typically want to save the given function so your class can call it
      * at the appropriate time.
      * 
      * ```ts
      * registerOnChange(fn: (_: any) => void): void {
      *    this._onChange = fn;
      * }
      * ```
      * 
      * When the value changes in the UI, your class should call the registered
      * function to allow the forms API to update itself:
      * 
      * ```ts
      * host: {
      *     (change): '_onChange($event.target.value)'
      * }
      * ```
     */
    public native void registerOnChange(Object fn);
    /** 
      * Std Signature : S(registerOnTouched,429,,P(d3))
      * TE Signature : S(registerOnTouched,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/directives/control_value_accessor.d.ts@2718
      * Registers a callback function that should be called when the control receives
      * a blur event.
      * 
      * This is called by the forms API on initialization so it can update the form model
      * on blur.
      * 
      * If you are implementing `registerOnTouched` in your own value accessor, you
      * will typically want to save the given function so your class can call it
      * when the control should be considered blurred (a.k.a. "touched").
      * 
      * ```ts
      * registerOnTouched(fn: any): void {
      *    this._onTouched = fn;
      * }
      * ```
      * 
      * On blur (or equivalent), your class should call the registered function to allow
      * the forms API to update itself:
      * 
      * ```ts
      * host: {
      *     '(blur)': '_onTouched()'
      * }
      * ```
     */
    public native void registerOnTouched(Object fn);
    /** 
      * Std Signature : S(setDisabledState,429,,P(d27))
      * TE Signature : S(setDisabledState,P(d27))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/directives/control_value_accessor.d.ts@3248
      * This function is called by the forms API when the control status changes to
      * or from "DISABLED". Depending on the value, it should enable or disable the
      * appropriate DOM element.
      * 
      * Example implementation of `setDisabledState`:
      * 
      * ```ts
      * setDisabledState(isDisabled: boolean): void {
      *    this._renderer.setProperty(this._elementRef.nativeElement, 'disabled', isDisabled);
      * }
      * ```
     */
    public native void setDisabledState(Boolean isDisabled);
    /** 
      * Std Signature : S(writeValue,429,,P(d3))
      * TE Signature : S(writeValue,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/directives/control_value_accessor.d.ts@970
      * Writes a new value to the element.
      * 
      * This method will be called by the forms API to write to the view when programmatic
      * (model -> view) changes are requested.
      * 
      * Example implementation of `writeValue`:
      * 
      * ```ts
      * writeValue(value: any): void {
      *    this._renderer.setProperty(this._elementRef.nativeElement, 'value', value);
      * }
      * ```
     */
    public native void writeValue(Object obj);
}

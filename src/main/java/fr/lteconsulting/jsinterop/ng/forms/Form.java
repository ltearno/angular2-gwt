package fr.lteconsulting.jsinterop.ng.forms;

import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/directives/form_interface".Form
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/directives/form_interface.d.ts:373

  * An interface that {@link FormGroupDirective} and {@link NgForm} implement.
  * 
  * Only used by the forms module.
 */
@JsType(isNative=true, namespace="ng.forms", name="Form")
public class Form
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(addControl,429,,P(d629))
      * TE Signature : S(addControl,P(d629))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/directives/form_interface.d.ts@590
      * Add a control to this form.
     */
    public native void addControl(NgControl dir);
    /** 
      * Std Signature : S(addFormGroup,429,,P(d630))
      * TE Signature : S(addFormGroup,P(d630))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/directives/form_interface.d.ts@934
      * Add a group of controls to this form.
     */
    public native void addFormGroup(AbstractFormGroupDirective dir);
    /** 
      * Std Signature : S(getControl,645,,P(d629))
      * TE Signature : S(getControl,P(d629))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/directives/form_interface.d.ts@828
      * Look up the {@link FormControl} associated with a particular {@link NgControl}.
     */
    public native FormControl getControl(NgControl dir);
    /** 
      * Std Signature : S(getFormGroup,628,,P(d630))
      * TE Signature : S(getFormGroup,P(d630))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/directives/form_interface.d.ts@1235
      * Look up the {@link FormGroup} associated with a particular {@link AbstractFormGroupDirective}.
     */
    public native FormGroup getFormGroup(AbstractFormGroupDirective dir);
    /** 
      * Std Signature : S(removeControl,429,,P(d629))
      * TE Signature : S(removeControl,P(d629))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/directives/form_interface.d.ts@684
      * Remove a control from this form.
     */
    public native void removeControl(NgControl dir);
    /** 
      * Std Signature : S(removeFormGroup,429,,P(d630))
      * TE Signature : S(removeFormGroup,P(d630))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/directives/form_interface.d.ts@1057
      * Remove a group of controls from this form.
     */
    public native void removeFormGroup(AbstractFormGroupDirective dir);
    /** 
      * Std Signature : S(updateModel,429,,P(d629),P(d3))
      * TE Signature : S(updateModel,P(d629),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/directives/form_interface.d.ts@1380
      * Update the model for a particular control with a new value.
     */
    public native void updateModel(NgControl dir, Object value);
}

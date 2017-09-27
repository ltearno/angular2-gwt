package fr.lteconsulting.jsinterop.ng.forms;

import fr.lteconsulting.jsinterop.ng.core.OnChanges;
import fr.lteconsulting.jsinterop.ng.core.SimpleChanges;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/directives/validators".MaxLengthValidator
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/directives/validators.d.ts:4210

  * A directive which installs the {@link MaxLengthValidator} for any `formControlName,
  * `formControl`,
  * or control with `ngModel` that also has a `maxlength` attribute.
 */
@JsType(isNative=true, namespace="ng.forms", name="MaxLengthValidator")
public class MaxLengthValidator extends Validator implements OnChanges
{

    /*
        Properties
    */

    public Object _onChange;

    @JsProperty( name = "_onChange")
    public native Object get_onChange();

    @JsProperty( name = "_onChange")
    public native void set_onChange( Object value );

    public Object _validator;

    @JsProperty( name = "_validator")
    public native Object get_validator();

    @JsProperty( name = "_validator")
    public native void set_validator( Object value );

    public String maxlength;

    @JsProperty( name = "maxlength")
    public native String getMaxlength();

    @JsProperty( name = "maxlength")
    public native void setMaxlength( String value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(_createValidator,3,,)
      * TE Signature : S(_createValidator,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/directives/validators.d.ts@4713
     */
    public native Object _createValidator();
    /** 
      * Std Signature : S(ngOnChanges,429,,P(d346))
      * TE Signature : S(ngOnChanges,P(d346))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void ngOnChanges(SimpleChanges changes);
}

package fr.lteconsulting.jsinterop.ng.forms;

import fr.lteconsulting.jsinterop.browser.UnionOfBooleanAndString;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/directives/validators".RequiredValidator
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/directives/validators.d.ts:1333

  * A Directive that adds the `required` validator to any controls marked with the
  * `required` attribute, via the {@link NG_VALIDATORS} binding.
  * 
  * ### Example
  * 
  * ```
  * <input name="fullName" ngModel required>
  * ```
 */
@JsType(isNative=true, namespace="ng.forms", name="RequiredValidator")
public class RequiredValidator extends Validator
{

    /*
        Properties
    */

    public Object _onChange;

    @JsProperty( name = "_onChange")
    public native Object get_onChange();

    @JsProperty( name = "_onChange")
    public native void set_onChange( Object value );

    public Object _required;

    @JsProperty( name = "_required")
    public native Object get_required();

    @JsProperty( name = "_required")
    public native void set_required( Object value );

    public UnionOfBooleanAndString required;

    @JsProperty( name = "required")
    public native UnionOfBooleanAndString getRequired();

    @JsProperty( name = "required")
    public native void setRequired( UnionOfBooleanAndString value );

    @JsOverlay
    public final void setRequired( Boolean value ) { setRequired(UnionOfBooleanAndString.ofBoolean( value )); }

    @JsOverlay
    public final void setRequired( String value ) { setRequired(UnionOfBooleanAndString.ofString( value )); }
}

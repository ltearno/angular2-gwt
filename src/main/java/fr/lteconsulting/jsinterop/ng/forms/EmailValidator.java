package fr.lteconsulting.jsinterop.ng.forms;

import fr.lteconsulting.jsinterop.browser.UnionOfBooleanAndString;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/directives/validators".EmailValidator
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/directives/validators.d.ts:2365

  * A Directive that adds the `email` validator to controls marked with the
  * `email` attribute, via the {@link NG_VALIDATORS} binding.
  * 
  * ### Example
  * 
  * ```
  * <input type="email" name="email" ngModel email>
  * <input type="email" name="email" ngModel email="true">
  * <input type="email" name="email" ngModel [email]="true">
  * ```
 */
@JsType(isNative=true, namespace="ng.forms", name="EmailValidator")
public class EmailValidator extends Validator
{

    /*
        Properties
    */

    public Object _enabled;

    @JsProperty( name = "_enabled")
    public native Object get_enabled();

    @JsProperty( name = "_enabled")
    public native void set_enabled( Object value );

    public Object _onChange;

    @JsProperty( name = "_onChange")
    public native Object get_onChange();

    @JsProperty( name = "_onChange")
    public native void set_onChange( Object value );

    public UnionOfBooleanAndString email;

    @JsProperty( name = "email")
    public native UnionOfBooleanAndString getEmail();

    @JsProperty( name = "email")
    public native void setEmail( UnionOfBooleanAndString value );

    @JsOverlay
    public final void setEmail( Boolean value ) { setEmail(UnionOfBooleanAndString.ofBoolean( value )); }

    @JsOverlay
    public final void setEmail( String value ) { setEmail(UnionOfBooleanAndString.ofString( value )); }
}

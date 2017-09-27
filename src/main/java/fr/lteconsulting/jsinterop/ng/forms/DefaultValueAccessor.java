package fr.lteconsulting.jsinterop.ng.forms;

import fr.lteconsulting.jsinterop.ng.core.ElementRef;
import fr.lteconsulting.jsinterop.ng.core.Renderer2;
import fr.lteconsulting.prebuilt.Action;
import fr.lteconsulting.prebuilt.Action1;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/directives/default_value_accessor".DefaultValueAccessor
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/directives/default_value_accessor.d.ts:574
  * 1 constructors
  * The default accessor for writing a value and listening to changes that is used by the
  * {@link NgModel}, {@link FormControlDirective}, and {@link FormControlName} directives.
  * 
  *   ### Example
  *   ```
  *   <input type="text" name="searchQuery" ngModel>
  *   ```
  * 
  *   
 */
@JsType(isNative=true, namespace="ng.forms", name="DefaultValueAccessor")
public class DefaultValueAccessor extends ControlValueAccessor
{

    /*
        Constructors
    */
    public DefaultValueAccessor(Renderer2 _renderer, ElementRef _elementRef, Boolean _compositionMode){
    }

    /*
        Properties
    */

    /** 
      * Whether the user is creating a composition string (IME events). 
     */
    public Object _composing;

    @JsProperty( name = "_composing")
    public native Object get_composing();

    @JsProperty( name = "_composing")
    public native void set_composing( Object value );

    public Object _compositionMode;

    @JsProperty( name = "_compositionMode")
    public native Object get_compositionMode();

    @JsProperty( name = "_compositionMode")
    public native void set_compositionMode( Object value );

    public Object _elementRef;

    @JsProperty( name = "_elementRef")
    public native Object get_elementRef();

    @JsProperty( name = "_elementRef")
    public native void set_elementRef( Object value );

    public Object _renderer;

    @JsProperty( name = "_renderer")
    public native Object get_renderer();

    @JsProperty( name = "_renderer")
    public native void set_renderer( Object value );

    public Action1<Object> onChange;

    @JsProperty( name = "onChange")
    public native Action1<Object> getOnChange();

    @JsProperty( name = "onChange")
    public native void setOnChange( Action1<Object> value );

    public Action onTouched;

    @JsProperty( name = "onTouched")
    public native Action getOnTouched();

    @JsProperty( name = "onTouched")
    public native void setOnTouched( Action value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(registerOnChange,429,,P(dFP1--S(?,429,,P(d3))------)<3>))
      * TE Signature : S(registerOnChange,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/directives/default_value_accessor.d.ts@1304
     */
    public native void registerOnChange(Action1<Object> fn);
    /** 
      * Std Signature : S(registerOnTouched,429,,P(dF--S(?,429,,)------)))
      * TE Signature : S(registerOnTouched,P(dF--S(?,)------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/directives/default_value_accessor.d.ts@1354
     */
    public native void registerOnTouched(Action fn);
}

package fr.lteconsulting.jsinterop.ng.forms;

import fr.lteconsulting.jsinterop.ng.core.ElementRef;
import fr.lteconsulting.jsinterop.ng.core.Renderer2;
import fr.lteconsulting.prebuilt.Action;
import fr.lteconsulting.prebuilt.Action1;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/directives/number_value_accessor".NumberValueAccessor
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/directives/number_value_accessor.d.ts:371
  * 1 constructors
  * The accessor for writing a number value and listening to changes that is used by the
  * {@link NgModel}, {@link FormControlDirective}, and {@link FormControlName} directives.
  * 
  *   ### Example
  *   ```
  *   <input type="number" [(ngModel)]="age">
  *   ```
 */
@JsType(isNative=true, namespace="ng.forms", name="NumberValueAccessor")
public class NumberValueAccessor extends ControlValueAccessor
{

    /*
        Constructors
    */
    public NumberValueAccessor(Renderer2 _renderer, ElementRef _elementRef){
    }

    /*
        Properties
    */

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
      * Std Signature : S(registerOnChange,429,,P(dFP1--S(?,429,,P(d3))------)<2>))
      * TE Signature : S(registerOnChange,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/directives/number_value_accessor.d.ts@924
     */
    public native void registerOnChange(Action1<Number> fn);
    /** 
      * Std Signature : S(registerOnTouched,429,,P(dF--S(?,429,,)------)))
      * TE Signature : S(registerOnTouched,P(dF--S(?,)------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/directives/number_value_accessor.d.ts@984
     */
    public native void registerOnTouched(Action fn);
    /** 
      * Std Signature : S(writeValue,429,,P(d2))
      * TE Signature : S(writeValue,P(d2))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/directives/number_value_accessor.d.ts@887
     */
    public native void writeValue(Number value);
}

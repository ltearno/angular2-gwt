package fr.lteconsulting.jsinterop.ng.forms;

import fr.lteconsulting.jsinterop.ng.core.ElementRef;
import fr.lteconsulting.jsinterop.ng.core.Renderer2;
import fr.lteconsulting.prebuilt.Action;
import fr.lteconsulting.prebuilt.Action1;
import fr.lteconsulting.prebuilt.Function;
import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/directives/select_multiple_control_value_accessor".SelectMultipleControlValueAccessor
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/directives/select_multiple_control_value_accessor.d.ts:406
  * 1 constructors
  * The accessor for writing a value and listening to changes on a select element.
  * 
  *   ### Caveat: Options selection
  * 
  * Angular uses object identity to select options. It's possible for the identities of items
  * to change while the data does not. This can happen, for example, if the items are produced
  * from an RPC to the server, and that RPC is re-run. Even if the data hasn't changed, the
  * second response will produce objects with different identities.
  * 
  * To customize the default option comparison algorithm, `<select multiple>` supports `compareWith`
  * input. `compareWith` takes a **function** which has two arguments: `option1` and `option2`.
  * If `compareWith` is given, Angular selects options by the return value of the function.
  * 
  * #### Syntax
  * 
  * ```
  * <select multiple [compareWith]="compareFn"  [(ngModel)]="selectedCountries">
  *      <option *ngFor="let country of countries" [ngValue]="country">
  *          {{country.name}}
  *      </option>
  * </select>
  * 
  * compareFn(c1: Country, c2: Country): boolean {
  *      return c1 && c2 ? c1.id === c2.id : c1 === c2;
  * }
  * ```
 */
@JsType(isNative=true, namespace="ng.forms", name="SelectMultipleControlValueAccessor")
public class SelectMultipleControlValueAccessor extends ControlValueAccessor
{

    /*
        Constructors
    */
    public SelectMultipleControlValueAccessor(Renderer2 _renderer, ElementRef _elementRef){
    }

    /*
        Properties
    */

    public Object _compareWith;

    @JsProperty( name = "_compareWith")
    public native Object get_compareWith();

    @JsProperty( name = "_compareWith")
    public native void set_compareWith( Object value );

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

    public Object value;

    @JsProperty( name = "value")
    public native Object getValue();

    @JsProperty( name = "value")
    public native void setValue( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(compareWith,27,,P(d3),P(d3))
      * TE Signature : S(compareWith,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/directives/select_multiple_control_value_accessor.d.ts@1770
     */
    public native Boolean compareWith(Object o1, Object o2);
    /** 
      * Std Signature : S(registerOnChange,429,,P(dFP1-,R--S(?,4,,P(d3))------)<3,5>))
      * TE Signature : S(registerOnChange,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/directives/select_multiple_control_value_accessor.d.ts@1929
     */
    public native void registerOnChange(Function1<Object, Object> fn);
    /** 
      * Std Signature : S(registerOnTouched,429,,P(dFR--S(?,3,,)------)<3>))
      * TE Signature : S(registerOnTouched,P(dF--S(?,)------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/directives/select_multiple_control_value_accessor.d.ts@1982
     */
    public native void registerOnTouched(Function<Object> fn);
}

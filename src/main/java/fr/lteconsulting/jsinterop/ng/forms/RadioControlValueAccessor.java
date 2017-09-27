package fr.lteconsulting.jsinterop.ng.forms;

import fr.lteconsulting.jsinterop.ng.core.ElementRef;
import fr.lteconsulting.jsinterop.ng.core.Injector;
import fr.lteconsulting.jsinterop.ng.core.OnDestroy;
import fr.lteconsulting.jsinterop.ng.core.OnInit;
import fr.lteconsulting.jsinterop.ng.core.Renderer2;
import fr.lteconsulting.prebuilt.Action;
import fr.lteconsulting.prebuilt.Function;
import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/directives/radio_control_value_accessor".RadioControlValueAccessor
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/directives/radio_control_value_accessor.d.ts:833
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.forms", name="RadioControlValueAccessor")
public class RadioControlValueAccessor extends ControlValueAccessor implements OnDestroy, OnInit
{

    /*
        Constructors
    */
    public RadioControlValueAccessor(Renderer2 _renderer, ElementRef _elementRef, RadioControlRegistry _registry, Injector _injector){
    }

    /*
        Properties
    */

    public Object _elementRef;

    @JsProperty( name = "_elementRef")
    public native Object get_elementRef();

    @JsProperty( name = "_elementRef")
    public native void set_elementRef( Object value );

    public Object _injector;

    @JsProperty( name = "_injector")
    public native Object get_injector();

    @JsProperty( name = "_injector")
    public native void set_injector( Object value );

    public Object _registry;

    @JsProperty( name = "_registry")
    public native Object get_registry();

    @JsProperty( name = "_registry")
    public native void set_registry( Object value );

    public Object _renderer;

    @JsProperty( name = "_renderer")
    public native Object get_renderer();

    @JsProperty( name = "_renderer")
    public native void set_renderer( Object value );

    public String formControlName;

    @JsProperty( name = "formControlName")
    public native String getFormControlName();

    @JsProperty( name = "formControlName")
    public native void setFormControlName( String value );

    public String name;

    @JsProperty( name = "name")
    public native String getName();

    @JsProperty( name = "name")
    public native void setName( String value );

    public Action onChange;

    @JsProperty( name = "onChange")
    public native Action getOnChange();

    @JsProperty( name = "onChange")
    public native void setOnChange( Action value );

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
      * Std Signature : S(_checkName,3,,)
      * TE Signature : S(_checkName,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/directives/radio_control_value_accessor.d.ts@2724
     */
    public native Object _checkName();
    /** 
      * Std Signature : S(_throwNameError,3,,)
      * TE Signature : S(_throwNameError,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/directives/radio_control_value_accessor.d.ts@2750
     */
    public native Object _throwNameError();
    /** 
      * Std Signature : S(fireUncheck,429,,P(d3))
      * TE Signature : S(fireUncheck,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/directives/radio_control_value_accessor.d.ts@2597
     */
    public native void fireUncheck(Object value);
    /** 
      * Std Signature : S(ngOnDestroy,429,,)
      * TE Signature : S(ngOnDestroy,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void ngOnDestroy();
    /** 
      * Std Signature : S(ngOnInit,429,,)
      * TE Signature : S(ngOnInit,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void ngOnInit();
    /** 
      * Std Signature : S(registerOnChange,429,,P(dFP1-,R--S(?,4,,P(d3))------)<3,5>))
      * TE Signature : S(registerOnChange,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/directives/radio_control_value_accessor.d.ts@2549
     */
    public native void registerOnChange(Function1<Object, Object> fn);
    /** 
      * Std Signature : S(registerOnTouched,429,,P(dFR--S(?,3,,)------)<3>))
      * TE Signature : S(registerOnTouched,P(dF--S(?,)------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/directives/radio_control_value_accessor.d.ts@2632
     */
    public native void registerOnTouched(Function<Object> fn);
}

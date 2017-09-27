package fr.lteconsulting.jsinterop.ng.forms;

import fr.lteconsulting.jsinterop.ng.core.ElementRef;
import fr.lteconsulting.jsinterop.ng.core.OnDestroy;
import fr.lteconsulting.jsinterop.ng.core.Renderer2;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/directives/select_control_value_accessor".NgSelectOption
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/directives/select_control_value_accessor.d.ts:3604
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.forms", name="NgSelectOption")
public class NgSelectOption implements OnDestroy
{

    /*
        Constructors
    */
    public NgSelectOption(ElementRef _element, Renderer2 _renderer, SelectControlValueAccessor _select){
    }

    /*
        Properties
    */

    public Object _element;

    @JsProperty( name = "_element")
    public native Object get_element();

    @JsProperty( name = "_element")
    public native void set_element( Object value );

    public Object _renderer;

    @JsProperty( name = "_renderer")
    public native Object get_renderer();

    @JsProperty( name = "_renderer")
    public native void set_renderer( Object value );

    public Object _select;

    @JsProperty( name = "_select")
    public native Object get_select();

    @JsProperty( name = "_select")
    public native void set_select( Object value );

    public String id;

    @JsProperty( name = "id")
    public native String getId();

    @JsProperty( name = "id")
    public native void setId( String value );

    public Object ngValue;

    @JsProperty( name = "ngValue")
    public native Object getNgValue();

    @JsProperty( name = "ngValue")
    public native void setNgValue( Object value );

    public Object value;

    @JsProperty( name = "value")
    public native Object getValue();

    @JsProperty( name = "value")
    public native void setValue( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(ngOnDestroy,429,,)
      * TE Signature : S(ngOnDestroy,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void ngOnDestroy();
}

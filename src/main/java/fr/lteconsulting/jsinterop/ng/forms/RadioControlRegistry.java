package fr.lteconsulting.jsinterop.ng.forms;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/directives/radio_control_value_accessor".RadioControlRegistry
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/directives/radio_control_value_accessor.d.ts:441

  * Internal class used by Angular to uncheck radio buttons with the matching name.
 */
@JsType(isNative=true, namespace="ng.forms", name="RadioControlRegistry")
public class RadioControlRegistry
{

    /*
        Properties
    */

    public Object _accessors;

    @JsProperty( name = "_accessors")
    public native Object get_accessors();

    @JsProperty( name = "_accessors")
    public native void set_accessors( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(_isSameGroup,3,,P(d3),P(d3))
      * TE Signature : S(_isSameGroup,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/directives/radio_control_value_accessor.d.ts@787
     */
    public native Object _isSameGroup(Object controlPair, Object accessor);
    /** 
      * Std Signature : S(add,429,,P(d629),P(d637))
      * TE Signature : S(add,P(d629),P(d637))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/directives/radio_control_value_accessor.d.ts@605
     */
    public native void add(NgControl control, RadioControlValueAccessor accessor);
    /** 
      * Std Signature : S(remove,429,,P(d637))
      * TE Signature : S(remove,P(d637))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/directives/radio_control_value_accessor.d.ts@677
     */
    public native void remove(RadioControlValueAccessor accessor);
    /** 
      * Std Signature : S(select,429,,P(d637))
      * TE Signature : S(select,P(d637))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/directives/radio_control_value_accessor.d.ts@732
     */
    public native void select(RadioControlValueAccessor accessor);
}

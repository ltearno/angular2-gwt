package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/change_detection_util".SimpleChange
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/change_detection_util.d.ts:888
  * 1 constructors
  * Represents a basic change from a previous to a new value.
 */
@JsType(isNative=true, namespace="ng.core", name="SimpleChange")
public class SimpleChange
{

    /*
        Constructors
    */
    public SimpleChange(Object previousValue, Object currentValue, Boolean firstChange){
    }

    /*
        Properties
    */

    public Object currentValue;

    @JsProperty( name = "currentValue")
    public native Object getCurrentValue();

    @JsProperty( name = "currentValue")
    public native void setCurrentValue( Object value );

    public Boolean firstChange;

    @JsProperty( name = "firstChange")
    public native Boolean getFirstChange();

    @JsProperty( name = "firstChange")
    public native void setFirstChange( Boolean value );

    public Object previousValue;

    @JsProperty( name = "previousValue")
    public native Object getPreviousValue();

    @JsProperty( name = "previousValue")
    public native void setPreviousValue( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(isFirstChange,27,,)
      * TE Signature : S(isFirstChange,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/change_detection_util.d.ts@1240
      * Check whether the new value is the first value assigned.
     */
    public native Boolean isFirstChange();
}

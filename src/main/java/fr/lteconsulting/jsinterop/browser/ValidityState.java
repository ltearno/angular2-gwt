package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: ValidityState
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:661255
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:661646
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ValidityState")
public class ValidityState
{

    /*
        Constructors
    */
    public ValidityState(){
    }

    /*
        Properties
    */

    public Boolean badInput;

    @JsProperty( name = "badInput")
    public native Boolean getBadInput();

    @JsProperty( name = "badInput")
    public native void setBadInput( Boolean value );

    public Boolean customError;

    @JsProperty( name = "customError")
    public native Boolean getCustomError();

    @JsProperty( name = "customError")
    public native void setCustomError( Boolean value );

    public Boolean patternMismatch;

    @JsProperty( name = "patternMismatch")
    public native Boolean getPatternMismatch();

    @JsProperty( name = "patternMismatch")
    public native void setPatternMismatch( Boolean value );

    public Boolean rangeOverflow;

    @JsProperty( name = "rangeOverflow")
    public native Boolean getRangeOverflow();

    @JsProperty( name = "rangeOverflow")
    public native void setRangeOverflow( Boolean value );

    public Boolean rangeUnderflow;

    @JsProperty( name = "rangeUnderflow")
    public native Boolean getRangeUnderflow();

    @JsProperty( name = "rangeUnderflow")
    public native void setRangeUnderflow( Boolean value );

    public Boolean stepMismatch;

    @JsProperty( name = "stepMismatch")
    public native Boolean getStepMismatch();

    @JsProperty( name = "stepMismatch")
    public native void setStepMismatch( Boolean value );

    public Boolean tooLong;

    @JsProperty( name = "tooLong")
    public native Boolean getTooLong();

    @JsProperty( name = "tooLong")
    public native void setTooLong( Boolean value );

    public Boolean typeMismatch;

    @JsProperty( name = "typeMismatch")
    public native Boolean getTypeMismatch();

    @JsProperty( name = "typeMismatch")
    public native void setTypeMismatch( Boolean value );

    public Boolean valid;

    @JsProperty( name = "valid")
    public native Boolean getValid();

    @JsProperty( name = "valid")
    public native void setValid( Boolean value );

    public Boolean valueMissing;

    @JsProperty( name = "valueMissing")
    public native Boolean getValueMissing();

    @JsProperty( name = "valueMissing")
    public native void setValueMissing( Boolean value );
}

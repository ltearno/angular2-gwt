package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: TouchEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:658437
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:658817
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="TouchEvent")
public class TouchEvent extends UIEvent
{

    /*
        Constructors
    */
    public TouchEvent(){
        super(null, null);
    }

    /*
        Properties
    */

    public Boolean altKey;

    @JsProperty( name = "altKey")
    public native Boolean getAltKey();

    @JsProperty( name = "altKey")
    public native void setAltKey( Boolean value );

    public TouchList changedTouches;

    @JsProperty( name = "changedTouches")
    public native TouchList getChangedTouches();

    @JsProperty( name = "changedTouches")
    public native void setChangedTouches( TouchList value );

    public Number charCode;

    @JsProperty( name = "charCode")
    public native Number getCharCode();

    @JsProperty( name = "charCode")
    public native void setCharCode( Number value );

    public Boolean ctrlKey;

    @JsProperty( name = "ctrlKey")
    public native Boolean getCtrlKey();

    @JsProperty( name = "ctrlKey")
    public native void setCtrlKey( Boolean value );

    public Number keyCode;

    @JsProperty( name = "keyCode")
    public native Number getKeyCode();

    @JsProperty( name = "keyCode")
    public native void setKeyCode( Number value );

    public Boolean metaKey;

    @JsProperty( name = "metaKey")
    public native Boolean getMetaKey();

    @JsProperty( name = "metaKey")
    public native void setMetaKey( Boolean value );

    public Boolean shiftKey;

    @JsProperty( name = "shiftKey")
    public native Boolean getShiftKey();

    @JsProperty( name = "shiftKey")
    public native void setShiftKey( Boolean value );

    public TouchList targetTouches;

    @JsProperty( name = "targetTouches")
    public native TouchList getTargetTouches();

    @JsProperty( name = "targetTouches")
    public native void setTargetTouches( TouchList value );

    public TouchList touches;

    @JsProperty( name = "touches")
    public native TouchList getTouches();

    @JsProperty( name = "touches")
    public native void setTouches( TouchList value );

    public Number which;

    @JsProperty( name = "which")
    public native Number getWhich();

    @JsProperty( name = "which")
    public native void setWhich( Number value );
}

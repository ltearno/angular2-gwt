package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: Gamepad
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:376557
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:376809
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Gamepad")
public class Gamepad
{

    /*
        Constructors
    */
    public Gamepad(){
    }

    /*
        Properties
    */

    public Array<Number> axes;

    @JsProperty( name = "axes")
    public native Array<Number> getAxes();

    @JsProperty( name = "axes")
    public native void setAxes( Array<Number> value );

    public Array<GamepadButton> buttons;

    @JsProperty( name = "buttons")
    public native Array<GamepadButton> getButtons();

    @JsProperty( name = "buttons")
    public native void setButtons( Array<GamepadButton> value );

    public Boolean connected;

    @JsProperty( name = "connected")
    public native Boolean getConnected();

    @JsProperty( name = "connected")
    public native void setConnected( Boolean value );

    public String id;

    @JsProperty( name = "id")
    public native String getId();

    @JsProperty( name = "id")
    public native void setId( String value );

    public Number index;

    @JsProperty( name = "index")
    public native Number getIndex();

    @JsProperty( name = "index")
    public native void setIndex( Number value );

    public String mapping;

    @JsProperty( name = "mapping")
    public native String getMapping();

    @JsProperty( name = "mapping")
    public native void setMapping( String value );

    public Number timestamp;

    @JsProperty( name = "timestamp")
    public native Number getTimestamp();

    @JsProperty( name = "timestamp")
    public native void setTimestamp( Number value );
}

package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: GamepadButton
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:376866
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:376967
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="GamepadButton")
public class GamepadButton
{

    /*
        Constructors
    */
    public GamepadButton(){
    }

    /*
        Properties
    */

    public Boolean pressed;

    @JsProperty( name = "pressed")
    public native Boolean getPressed();

    @JsProperty( name = "pressed")
    public native void setPressed( Boolean value );

    public Number value;

    @JsProperty( name = "value")
    public native Number getValue();

    @JsProperty( name = "value")
    public native void setValue( Number value );
}

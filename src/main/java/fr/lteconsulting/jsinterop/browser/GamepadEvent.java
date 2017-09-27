package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: GamepadEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:377042
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:377128
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="GamepadEvent")
public class GamepadEvent extends Event
{

    /*
        Constructors
    */
    public GamepadEvent(String typeArg, GamepadEventInit eventInitDict){
        super(null, null);
    }

    /*
        Properties
    */

    public Gamepad gamepad;

    @JsProperty( name = "gamepad")
    public native Gamepad getGamepad();

    @JsProperty( name = "gamepad")
    public native void setGamepad( Gamepad value );
}

package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: GamepadEventInit
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:259074
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="GamepadEventInit")
public class GamepadEventInit extends EventInit
{

    /*
        Properties
    */

    public Gamepad gamepad;

    @JsProperty( name = "gamepad")
    public native Gamepad getGamepad();

    @JsProperty( name = "gamepad")
    public native void setGamepad( Gamepad value );
}

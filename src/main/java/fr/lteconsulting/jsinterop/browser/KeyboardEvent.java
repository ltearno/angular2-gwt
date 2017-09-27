package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: KeyboardEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:498237
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:499215
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="KeyboardEvent")
public class KeyboardEvent extends UIEvent
{

    /*
        Constructors
    */
    public KeyboardEvent(String typeArg, KeyboardEventInit eventInitDict){
        super(null, null);
    }

    /*
        Static properties
    */

    @JsProperty(namespace="KeyboardEvent", name="DOM_KEY_LOCATION_JOYSTICK")
    public static Number DOM_KEY_LOCATION_JOYSTICK;

    @JsProperty(namespace="KeyboardEvent", name="DOM_KEY_LOCATION_LEFT")
    public static Number DOM_KEY_LOCATION_LEFT;

    @JsProperty(namespace="KeyboardEvent", name="DOM_KEY_LOCATION_MOBILE")
    public static Number DOM_KEY_LOCATION_MOBILE;

    @JsProperty(namespace="KeyboardEvent", name="DOM_KEY_LOCATION_NUMPAD")
    public static Number DOM_KEY_LOCATION_NUMPAD;

    @JsProperty(namespace="KeyboardEvent", name="DOM_KEY_LOCATION_RIGHT")
    public static Number DOM_KEY_LOCATION_RIGHT;

    @JsProperty(namespace="KeyboardEvent", name="DOM_KEY_LOCATION_STANDARD")
    public static Number DOM_KEY_LOCATION_STANDARD;

    /*
        Properties
    */

    public Boolean altKey;

    @JsProperty( name = "altKey")
    public native Boolean getAltKey();

    @JsProperty( name = "altKey")
    public native void setAltKey( Boolean value );

    @JsProperty(name="char")
    public String char_;

    @JsProperty( name = "char")
    public native String getChar_();

    @JsProperty( name = "char")
    public native void setChar_( String value );

    public Number charCode;

    @JsProperty( name = "charCode")
    public native Number getCharCode();

    @JsProperty( name = "charCode")
    public native void setCharCode( Number value );

    public String code;

    @JsProperty( name = "code")
    public native String getCode();

    @JsProperty( name = "code")
    public native void setCode( String value );

    public Boolean ctrlKey;

    @JsProperty( name = "ctrlKey")
    public native Boolean getCtrlKey();

    @JsProperty( name = "ctrlKey")
    public native void setCtrlKey( Boolean value );

    public String key;

    @JsProperty( name = "key")
    public native String getKey();

    @JsProperty( name = "key")
    public native void setKey( String value );

    public Number keyCode;

    @JsProperty( name = "keyCode")
    public native Number getKeyCode();

    @JsProperty( name = "keyCode")
    public native void setKeyCode( Number value );

    public String locale;

    @JsProperty( name = "locale")
    public native String getLocale();

    @JsProperty( name = "locale")
    public native void setLocale( String value );

    public Number location;

    @JsProperty( name = "location")
    public native Number getLocation();

    @JsProperty( name = "location")
    public native void setLocation( Number value );

    public Boolean metaKey;

    @JsProperty( name = "metaKey")
    public native Boolean getMetaKey();

    @JsProperty( name = "metaKey")
    public native void setMetaKey( Boolean value );

    public Boolean repeat;

    @JsProperty( name = "repeat")
    public native Boolean getRepeat();

    @JsProperty( name = "repeat")
    public native void setRepeat( Boolean value );

    public Boolean shiftKey;

    @JsProperty( name = "shiftKey")
    public native Boolean getShiftKey();

    @JsProperty( name = "shiftKey")
    public native void setShiftKey( Boolean value );

    public Number which;

    @JsProperty( name = "which")
    public native Number getWhich();

    @JsProperty( name = "which")
    public native void setWhich( Number value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(getModifierState,27,,P(d1))
      * TE Signature : S(getModifierState,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@498675
     */
    public native Boolean getModifierState(String keyArg);
    /** 
      * Std Signature : S(initKeyboardEvent,289,,P(d1),P(d27),P(d27),P(d45),P(d1),P(d2),P(d1),P(d27),P(d1))
      * TE Signature : S(initKeyboardEvent,P(d1),P(d27),P(d27),P(d45),P(d1),P(d2),P(d1),P(d27),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@498722
     */
    public native void initKeyboardEvent(String typeArg, Boolean canBubbleArg, Boolean cancelableArg, Window viewArg, String keyArg, Number locationArg, String modifiersListArg, Boolean repeat, String locale);
}

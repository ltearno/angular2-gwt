package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: TextEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:653355
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:654124
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="TextEvent")
public class TextEvent extends UIEvent
{

    /*
        Constructors
    */
    public TextEvent(){
        super(null, null);
    }

    /*
        Static properties
    */

    @JsProperty(namespace="TextEvent", name="DOM_INPUT_METHOD_DROP")
    public static Number DOM_INPUT_METHOD_DROP;

    @JsProperty(namespace="TextEvent", name="DOM_INPUT_METHOD_HANDWRITING")
    public static Number DOM_INPUT_METHOD_HANDWRITING;

    @JsProperty(namespace="TextEvent", name="DOM_INPUT_METHOD_IME")
    public static Number DOM_INPUT_METHOD_IME;

    @JsProperty(namespace="TextEvent", name="DOM_INPUT_METHOD_KEYBOARD")
    public static Number DOM_INPUT_METHOD_KEYBOARD;

    @JsProperty(namespace="TextEvent", name="DOM_INPUT_METHOD_MULTIMODAL")
    public static Number DOM_INPUT_METHOD_MULTIMODAL;

    @JsProperty(namespace="TextEvent", name="DOM_INPUT_METHOD_OPTION")
    public static Number DOM_INPUT_METHOD_OPTION;

    @JsProperty(namespace="TextEvent", name="DOM_INPUT_METHOD_PASTE")
    public static Number DOM_INPUT_METHOD_PASTE;

    @JsProperty(namespace="TextEvent", name="DOM_INPUT_METHOD_SCRIPT")
    public static Number DOM_INPUT_METHOD_SCRIPT;

    @JsProperty(namespace="TextEvent", name="DOM_INPUT_METHOD_UNKNOWN")
    public static Number DOM_INPUT_METHOD_UNKNOWN;

    @JsProperty(namespace="TextEvent", name="DOM_INPUT_METHOD_VOICE")
    public static Number DOM_INPUT_METHOD_VOICE;

    /*
        Properties
    */

    public String data;

    @JsProperty( name = "data")
    public native String getData();

    @JsProperty( name = "data")
    public native void setData( String value );

    public Number inputMethod;

    @JsProperty( name = "inputMethod")
    public native Number getInputMethod();

    @JsProperty( name = "inputMethod")
    public native void setInputMethod( Number value );

    public String locale;

    @JsProperty( name = "locale")
    public native String getLocale();

    @JsProperty( name = "locale")
    public native void setLocale( String value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(initTextEvent,289,,P(d1),P(d27),P(d27),P(d45),P(d1),P(d2),P(d1))
      * TE Signature : S(initTextEvent,P(d1),P(d27),P(d27),P(d45),P(d1),P(d2),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@653489
     */
    public native void initTextEvent(String typeArg, Boolean canBubbleArg, Boolean cancelableArg, Window viewArg, String dataArg, Number inputMethod, String locale);
}

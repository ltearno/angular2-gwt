package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: KeyboardEventInit
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:259832
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="KeyboardEventInit")
public class KeyboardEventInit extends EventModifierInit
{

    /*
        Properties
    */

    public String code;

    @JsProperty( name = "code")
    public native String getCode();

    @JsProperty( name = "code")
    public native void setCode( String value );

    public String key;

    @JsProperty( name = "key")
    public native String getKey();

    @JsProperty( name = "key")
    public native void setKey( String value );

    public Number location;

    @JsProperty( name = "location")
    public native Number getLocation();

    @JsProperty( name = "location")
    public native void setLocation( Number value );

    public Boolean repeat;

    @JsProperty( name = "repeat")
    public native Boolean getRepeat();

    @JsProperty( name = "repeat")
    public native void setRepeat( Boolean value );
}

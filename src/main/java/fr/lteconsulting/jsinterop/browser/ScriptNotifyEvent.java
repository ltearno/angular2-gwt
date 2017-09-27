package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: ScriptNotifyEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:639286
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:639407
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ScriptNotifyEvent")
public class ScriptNotifyEvent extends Event
{

    /*
        Constructors
    */
    public ScriptNotifyEvent(){
        super(null, null);
    }

    /*
        Properties
    */

    public String callingUri;

    @JsProperty( name = "callingUri")
    public native String getCallingUri();

    @JsProperty( name = "callingUri")
    public native void setCallingUri( String value );

    public String value;

    @JsProperty( name = "value")
    public native String getValue();

    @JsProperty( name = "value")
    public native void setValue( String value );
}

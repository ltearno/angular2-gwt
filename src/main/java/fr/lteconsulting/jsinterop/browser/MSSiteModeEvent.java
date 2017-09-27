package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MSSiteModeEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:513491
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:513612
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSSiteModeEvent")
public class MSSiteModeEvent extends Event
{

    /*
        Constructors
    */
    public MSSiteModeEvent(){
        super(null, null);
    }

    /*
        Properties
    */

    public String actionURL;

    @JsProperty( name = "actionURL")
    public native String getActionURL();

    @JsProperty( name = "actionURL")
    public native void setActionURL( String value );

    public Number buttonID;

    @JsProperty( name = "buttonID")
    public native Number getButtonID();

    @JsProperty( name = "buttonID")
    public native void setButtonID( Number value );
}

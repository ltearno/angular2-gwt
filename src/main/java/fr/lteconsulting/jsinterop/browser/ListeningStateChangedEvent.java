package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: ListeningStateChangedEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:499617
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:499742
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ListeningStateChangedEvent")
public class ListeningStateChangedEvent extends Event
{

    /*
        Constructors
    */
    public ListeningStateChangedEvent(){
        super(null, null);
    }

    /*
        Properties
    */

    public String label;

    @JsProperty( name = "label")
    public native String getLabel();

    @JsProperty( name = "label")
    public native void setLabel( String value );

    public String state;

    @JsProperty( name = "state")
    public native String getState();

    @JsProperty( name = "state")
    public native void setState( String value );
}

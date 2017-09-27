package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: ClipboardEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:315600
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:315699
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ClipboardEvent")
public class ClipboardEvent extends Event
{

    /*
        Constructors
    */
    public ClipboardEvent(String type, ClipboardEventInit eventInitDict){
        super(null, null);
    }

    /*
        Properties
    */

    public DataTransfer clipboardData;

    @JsProperty( name = "clipboardData")
    public native DataTransfer getClipboardData();

    @JsProperty( name = "clipboardData")
    public native void setClipboardData( DataTransfer value );
}

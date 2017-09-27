package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MSMediaKeyMessageEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:510882
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:511025
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSMediaKeyMessageEvent")
public class MSMediaKeyMessageEvent extends Event
{

    /*
        Constructors
    */
    public MSMediaKeyMessageEvent(){
        super(null, null);
    }

    /*
        Properties
    */

    public String destinationURL;

    @JsProperty( name = "destinationURL")
    public native String getDestinationURL();

    @JsProperty( name = "destinationURL")
    public native void setDestinationURL( String value );

    public Uint8Array message;

    @JsProperty( name = "message")
    public native Uint8Array getMessage();

    @JsProperty( name = "message")
    public native void setMessage( Uint8Array value );
}

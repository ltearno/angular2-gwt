package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: HashChangeEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:488933
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:489063
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HashChangeEvent")
public class HashChangeEvent extends Event
{

    /*
        Constructors
    */
    public HashChangeEvent(String typeArg, HashChangeEventInit eventInitDict){
        super(null, null);
    }

    /*
        Properties
    */

    public String newURL;

    @JsProperty( name = "newURL")
    public native String getNewURL();

    @JsProperty( name = "newURL")
    public native void setNewURL( String value );

    public String oldURL;

    @JsProperty( name = "oldURL")
    public native String getOldURL();

    @JsProperty( name = "oldURL")
    public native void setOldURL( String value );
}

package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: UnviewableContentIdentifiedEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:660994
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:661123
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="UnviewableContentIdentifiedEvent")
public class UnviewableContentIdentifiedEvent extends NavigationEventWithReferrer
{

    /*
        Constructors
    */
    public UnviewableContentIdentifiedEvent(){
    }

    /*
        Properties
    */

    public String mediaType;

    @JsProperty( name = "mediaType")
    public native String getMediaType();

    @JsProperty( name = "mediaType")
    public native void setMediaType( String value );
}

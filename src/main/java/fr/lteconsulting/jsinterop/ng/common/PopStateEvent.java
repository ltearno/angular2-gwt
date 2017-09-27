package fr.lteconsulting.jsinterop.ng.common;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/location/location".PopStateEvent
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/location/location.d.ts:55
  * 
 */
@JsType(isNative=true, namespace="ng.common", name="PopStateEvent")
public class PopStateEvent
{

    /*
        Properties
    */

    public Boolean pop;

    @JsProperty( name = "pop")
    public native Boolean getPop();

    @JsProperty( name = "pop")
    public native void setPop( Boolean value );

    public String type;

    @JsProperty( name = "type")
    public native String getType();

    @JsProperty( name = "type")
    public native void setType( String value );

    public String url;

    @JsProperty( name = "url")
    public native String getUrl();

    @JsProperty( name = "url")
    public native void setUrl( String value );
}

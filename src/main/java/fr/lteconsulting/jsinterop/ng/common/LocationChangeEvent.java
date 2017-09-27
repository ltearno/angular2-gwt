package fr.lteconsulting.jsinterop.ng.common;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/location/platform_location".LocationChangeEvent
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/location/platform_location.d.ts:2038

  * A serializable version of the event from onPopState or onHashChange
 */
@JsType(isNative=true, namespace="ng.common", name="LocationChangeEvent")
public class LocationChangeEvent
{

    /*
        Properties
    */

    public String type;

    @JsProperty( name = "type")
    public native String getType();

    @JsProperty( name = "type")
    public native void setType( String value );
}

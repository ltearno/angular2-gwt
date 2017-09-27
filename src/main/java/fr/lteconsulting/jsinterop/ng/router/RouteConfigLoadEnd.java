package fr.lteconsulting.jsinterop.ng.router;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/events".RouteConfigLoadEnd
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/events.d.ts:3142
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.router", name="RouteConfigLoadEnd")
public class RouteConfigLoadEnd
{

    /*
        Constructors
    */
    public RouteConfigLoadEnd(Route route){
    }

    /*
        Properties
    */

    public Route route;

    @JsProperty( name = "route")
    public native Route getRoute();

    @JsProperty( name = "route")
    public native void setRoute( Route value );
}

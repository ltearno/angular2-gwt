package fr.lteconsulting.jsinterop.ng.router;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/events".NavigationStart
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/events.d.ts:290
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.router", name="NavigationStart")
public class NavigationStart
{

    /*
        Constructors
    */
    public NavigationStart(Number id, String url){
    }

    /*
        Properties
    */

    public Number id;

    @JsProperty( name = "id")
    public native Number getId();

    @JsProperty( name = "id")
    public native void setId( Number value );

    public String url;

    @JsProperty( name = "url")
    public native String getUrl();

    @JsProperty( name = "url")
    public native void setUrl( String value );
}

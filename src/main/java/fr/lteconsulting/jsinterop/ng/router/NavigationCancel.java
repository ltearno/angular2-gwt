package fr.lteconsulting.jsinterop.ng.router;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/events".NavigationCancel
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/events.d.ts:1224
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.router", name="NavigationCancel")
public class NavigationCancel
{

    /*
        Constructors
    */
    public NavigationCancel(Number id, String url, String reason){
    }

    /*
        Properties
    */

    public Number id;

    @JsProperty( name = "id")
    public native Number getId();

    @JsProperty( name = "id")
    public native void setId( Number value );

    public String reason;

    @JsProperty( name = "reason")
    public native String getReason();

    @JsProperty( name = "reason")
    public native void setReason( String value );

    public String url;

    @JsProperty( name = "url")
    public native String getUrl();

    @JsProperty( name = "url")
    public native void setUrl( String value );
}

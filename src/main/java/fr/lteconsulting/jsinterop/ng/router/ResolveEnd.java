package fr.lteconsulting.jsinterop.ng.router;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/events".ResolveEnd
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/events.d.ts:5635
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.router", name="ResolveEnd")
public class ResolveEnd
{

    /*
        Constructors
    */
    public ResolveEnd(Number id, String url, String urlAfterRedirects, RouterStateSnapshot state){
    }

    /*
        Properties
    */

    public Number id;

    @JsProperty( name = "id")
    public native Number getId();

    @JsProperty( name = "id")
    public native void setId( Number value );

    public RouterStateSnapshot state;

    @JsProperty( name = "state")
    public native RouterStateSnapshot getState();

    @JsProperty( name = "state")
    public native void setState( RouterStateSnapshot value );

    public String url;

    @JsProperty( name = "url")
    public native String getUrl();

    @JsProperty( name = "url")
    public native void setUrl( String value );

    public String urlAfterRedirects;

    @JsProperty( name = "urlAfterRedirects")
    public native String getUrlAfterRedirects();

    @JsProperty( name = "urlAfterRedirects")
    public native void setUrlAfterRedirects( String value );
}

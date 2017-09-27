package fr.lteconsulting.jsinterop.ng.router;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/events".GuardsCheckEnd
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/events.d.ts:3997
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.router", name="GuardsCheckEnd")
public class GuardsCheckEnd
{

    /*
        Constructors
    */
    public GuardsCheckEnd(Number id, String url, String urlAfterRedirects, RouterStateSnapshot state, Boolean shouldActivate){
    }

    /*
        Properties
    */

    public Number id;

    @JsProperty( name = "id")
    public native Number getId();

    @JsProperty( name = "id")
    public native void setId( Number value );

    public Boolean shouldActivate;

    @JsProperty( name = "shouldActivate")
    public native Boolean getShouldActivate();

    @JsProperty( name = "shouldActivate")
    public native void setShouldActivate( Boolean value );

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

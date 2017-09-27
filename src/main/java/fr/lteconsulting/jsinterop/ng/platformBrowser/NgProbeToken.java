package fr.lteconsulting.jsinterop.ng.platformBrowser;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/debug/ng_probe".NgProbeToken
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/debug/ng_probe.d.ts:492
  * 1 constructors
  * Deprecated. Use the one from '@angular/core'.
 */
@JsType(isNative=true, namespace="ng.platformBrowser", name="NgProbeToken")
public class NgProbeToken
{

    /*
        Constructors
    */
    public NgProbeToken(String name, Object token){
    }

    /*
        Properties
    */

    public String name;

    @JsProperty( name = "name")
    public native String getName();

    @JsProperty( name = "name")
    public native void setName( String value );

    public Object token;

    @JsProperty( name = "token")
    public native Object getToken();

    @JsProperty( name = "token")
    public native void setToken( Object value );
}

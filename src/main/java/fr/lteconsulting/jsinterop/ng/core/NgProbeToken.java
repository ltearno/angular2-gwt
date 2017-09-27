package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/application_ref".NgProbeToken
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/application_ref.d.ts:1643
  * 1 constructors
  * A token for third-party components that can register themselves with NgProbe.
 */
@JsType(isNative=true, namespace="ng.core", name="NgProbeToken")
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

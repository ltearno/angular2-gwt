package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types".DepDef
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts:7945
  * 
 */
@JsType(isNative=true, namespace="ng.core", name="DepDef")
public class DepDef
{

    /*
        Properties
    */

    public DepFlags flags;

    @JsProperty( name = "flags")
    public native DepFlags getFlags();

    @JsProperty( name = "flags")
    public native void setFlags( DepFlags value );

    public Object token;

    @JsProperty( name = "token")
    public native Object getToken();

    @JsProperty( name = "token")
    public native void setToken( Object value );

    public String tokenKey;

    @JsProperty( name = "tokenKey")
    public native String getTokenKey();

    @JsProperty( name = "tokenKey")
    public native void setTokenKey( String value );
}

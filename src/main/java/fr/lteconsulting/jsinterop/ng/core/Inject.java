package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/di/metadata".Inject
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/di/metadata.d.ts:882
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/di/metadata.d.ts:1072
  * 1 constructors
  * Type of the Inject metadata.
  * Inject decorator and metadata.
 */
@JsType(isNative=true, namespace="ng.core", name="Inject")
public class Inject
{

    /*
        Constructors
    */
    public Inject(Object token){
    }

    /*
        Properties
    */

    public Object token;

    @JsProperty( name = "token")
    public native Object getToken();

    @JsProperty( name = "token")
    public native void setToken( Object value );
}

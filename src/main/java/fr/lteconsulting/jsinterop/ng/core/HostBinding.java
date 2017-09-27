package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/metadata/directives".HostBinding
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/metadata/directives.d.ts:31029
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/metadata/directives.d.ts:31249
  * 1 constructors
  * Type of the HostBinding metadata.
  * HostBinding decorator and metadata.
 */
@JsType(isNative=true, namespace="ng.core", name="HostBinding")
public class HostBinding
{

    /*
        Constructors
    */
    public HostBinding(String hostPropertyName){
    }

    /*
        Properties
    */

    public String hostPropertyName;

    @JsProperty( name = "hostPropertyName")
    public native String getHostPropertyName();

    @JsProperty( name = "hostPropertyName")
    public native void setHostPropertyName( String value );
}

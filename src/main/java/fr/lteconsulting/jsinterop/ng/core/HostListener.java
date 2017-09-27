package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/metadata/directives".HostListener
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/metadata/directives.d.ts:32427
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/metadata/directives.d.ts:32664
  * 1 constructors
  * Type of the HostListener metadata.
  * HostListener decorator and metadata.
 */
@JsType(isNative=true, namespace="ng.core", name="HostListener")
public class HostListener
{

    /*
        Constructors
    */
    public HostListener(String eventName, Array<String> args){
    }

    /*
        Properties
    */

    public Array<String> args;

    @JsProperty( name = "args")
    public native Array<String> getArgs();

    @JsProperty( name = "args")
    public native void setArgs( Array<String> value );

    public String eventName;

    @JsProperty( name = "eventName")
    public native String getEventName();

    @JsProperty( name = "eventName")
    public native void setEventName( String value );
}

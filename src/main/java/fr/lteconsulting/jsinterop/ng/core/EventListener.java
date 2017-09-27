package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.browser.Function;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/debug/debug_node".EventListener
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/debug/debug_node.d.ts:282
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.core", name="EventListener")
public class EventListener
{

    /*
        Constructors
    */
    public EventListener(String name, Function callback){
    }

    /*
        Properties
    */

    public Function callback;

    @JsProperty( name = "callback")
    public native Function getCallback();

    @JsProperty( name = "callback")
    public native void setCallback( Function value );

    public String name;

    @JsProperty( name = "name")
    public native String getName();

    @JsProperty( name = "name")
    public native void setName( String value );
}

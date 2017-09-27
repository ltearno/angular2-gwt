package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types".OutputDef
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts:6418
  * 
 */
@JsType(isNative=true, namespace="ng.core", name="OutputDef")
public class OutputDef
{

    /*
        Properties
    */

    public String eventName;

    @JsProperty( name = "eventName")
    public native String getEventName();

    @JsProperty( name = "eventName")
    public native void setEventName( String value );

    public String propName;

    @JsProperty( name = "propName")
    public native String getPropName();

    @JsProperty( name = "propName")
    public native void setPropName( String value );

    public String target;

    @JsProperty( name = "target")
    public native String getTarget();

    @JsProperty( name = "target")
    public native void setTarget( String value );

    public OutputType type;

    @JsProperty( name = "type")
    public native OutputType getType();

    @JsProperty( name = "type")
    public native void setType( OutputType value );
}

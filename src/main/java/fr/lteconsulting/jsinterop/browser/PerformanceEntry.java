package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: PerformanceEntry
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:545031
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:545198
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="PerformanceEntry")
public class PerformanceEntry
{

    /*
        Constructors
    */
    public PerformanceEntry(){
    }

    /*
        Properties
    */

    public Number duration;

    @JsProperty( name = "duration")
    public native Number getDuration();

    @JsProperty( name = "duration")
    public native void setDuration( Number value );

    public String entryType;

    @JsProperty( name = "entryType")
    public native String getEntryType();

    @JsProperty( name = "entryType")
    public native void setEntryType( String value );

    public String name;

    @JsProperty( name = "name")
    public native String getName();

    @JsProperty( name = "name")
    public native void setName( String value );

    public Number startTime;

    @JsProperty( name = "startTime")
    public native Number getStartTime();

    @JsProperty( name = "startTime")
    public native void setStartTime( Number value );
}

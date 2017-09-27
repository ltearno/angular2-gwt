package fr.lteconsulting.jsinterop.ng.platformBrowser;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/platform-browser/src/browser/tools/common_tools".ChangeDetectionPerfRecord
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/platform-browser/src/browser/tools/common_tools.d.ts:264
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.platformBrowser", name="ChangeDetectionPerfRecord")
public class ChangeDetectionPerfRecord
{

    /*
        Constructors
    */
    public ChangeDetectionPerfRecord(Number msPerTick, Number numTicks){
    }

    /*
        Properties
    */

    public Number msPerTick;

    @JsProperty( name = "msPerTick")
    public native Number getMsPerTick();

    @JsProperty( name = "msPerTick")
    public native void setMsPerTick( Number value );

    public Number numTicks;

    @JsProperty( name = "numTicks")
    public native Number getNumTicks();

    @JsProperty( name = "numTicks")
    public native void setNumTicks( Number value );
}

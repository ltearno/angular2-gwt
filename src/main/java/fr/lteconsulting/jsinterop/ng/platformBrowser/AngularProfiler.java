package fr.lteconsulting.jsinterop.ng.platformBrowser;

import fr.lteconsulting.jsinterop.ng.core.ApplicationRef;
import fr.lteconsulting.jsinterop.ng.core.ComponentRef;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/platform-browser/src/browser/tools/common_tools".AngularProfiler
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/platform-browser/src/browser/tools/common_tools.d.ts:414
  * 1 constructors
  * Entry point for all Angular profiling-related debug tools. This object
  * corresponds to the `ng.profiler` in the dev console.
 */
@JsType(isNative=true, namespace="ng.platformBrowser", name="AngularProfiler")
public class AngularProfiler
{

    /*
        Constructors
    */
    public AngularProfiler(ComponentRef<Object> ref){
    }

    /*
        Properties
    */

    public ApplicationRef appRef;

    @JsProperty( name = "appRef")
    public native ApplicationRef getAppRef();

    @JsProperty( name = "appRef")
    public native void setAppRef( ApplicationRef value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(timeChangeDetection,1252,,P(d3))
      * TE Signature : S(timeChangeDetection,P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/platform-browser/src/browser/tools/common_tools.d.ts@1294
      * Exercises change detection in a loop and then prints the average amount of
      * time in milliseconds how long a single round of change detection takes for
      * the current state of the UI. It runs a minimum of 5 rounds for a minimum
      * of 500 milliseconds.
      * 
      * Optionally, a user may pass a `config` parameter containing a map of
      * options. Supported options are:
      * 
      * `record` (boolean) - causes the profiler to record a CPU profile while
      * it exercises the change detector. Example:
      * 
      * ```
      * ng.profiler.timeChangeDetection({record: true})
      * ```
     */
    public native ChangeDetectionPerfRecord timeChangeDetection(Object config);
}

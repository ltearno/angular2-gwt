package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: Performance
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:544286
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:544962
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Performance")
public class Performance
{

    /*
        Constructors
    */
    public Performance(){
    }

    /*
        Properties
    */

    public PerformanceNavigation navigation;

    @JsProperty( name = "navigation")
    public native PerformanceNavigation getNavigation();

    @JsProperty( name = "navigation")
    public native void setNavigation( PerformanceNavigation value );

    public PerformanceTiming timing;

    @JsProperty( name = "timing")
    public native PerformanceTiming getTiming();

    @JsProperty( name = "timing")
    public native void setTiming( PerformanceTiming value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(clearMarks,289,,)
      * TE Signature : S(clearMarks,)
      * 
     */
    public native void clearMarks();
    /** 
      * Std Signature : S(clearMarks,289,,P(d1))
      * TE Signature : S(clearMarks,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@544404
     */
    public native void clearMarks(String markName /* optional */);
    /** 
      * Std Signature : S(clearMeasures,289,,)
      * TE Signature : S(clearMeasures,)
      * 
     */
    public native void clearMeasures();
    /** 
      * Std Signature : S(clearMeasures,289,,P(d1))
      * TE Signature : S(clearMeasures,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@544445
     */
    public native void clearMeasures(String measureName /* optional */);
    /** 
      * Std Signature : S(clearResourceTimings,289,,)
      * TE Signature : S(clearResourceTimings,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@544492
     */
    public native void clearResourceTimings();
    /** 
      * Std Signature : S(getEntries,3,,)
      * TE Signature : S(getEntries,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@544526
     */
    public native Object getEntries();
    /** 
      * Std Signature : S(getEntriesByName,3,,P(d1))
      * TE Signature : S(getEntriesByName,P(d1))
      * 
     */
    public native Object getEntriesByName(String name);
    /** 
      * Std Signature : S(getEntriesByName,3,,P(d1),P(d1))
      * TE Signature : S(getEntriesByName,P(d1),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@544549
     */
    public native Object getEntriesByName(String name, String entryType /* optional */);
    /** 
      * Std Signature : S(getEntriesByType,3,,P(d1))
      * TE Signature : S(getEntriesByType,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@544610
     */
    public native Object getEntriesByType(String entryType);
    /** 
      * Std Signature : S(getMarks,3,,)
      * TE Signature : S(getMarks,)
      * 
     */
    public native Object getMarks();
    /** 
      * Std Signature : S(getMarks,3,,P(d1))
      * TE Signature : S(getMarks,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@544656
     */
    public native Object getMarks(String markName /* optional */);
    /** 
      * Std Signature : S(getMeasures,3,,)
      * TE Signature : S(getMeasures,)
      * 
     */
    public native Object getMeasures();
    /** 
      * Std Signature : S(getMeasures,3,,P(d1))
      * TE Signature : S(getMeasures,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@544694
     */
    public native Object getMeasures(String measureName /* optional */);
    /** 
      * Std Signature : S(mark,289,,P(d1))
      * TE Signature : S(mark,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@544738
     */
    public native void mark(String markName);
    /** 
      * Std Signature : S(measure,289,,P(d1))
      * TE Signature : S(measure,P(d1))
      * 
     */
    public native void measure(String measureName);
    /** 
      * Std Signature : S(measure,289,,P(d1),P(d1))
      * TE Signature : S(measure,P(d1),P(d1))
      * 
     */
    public native void measure(String measureName, String startMarkName /* optional */);
    /** 
      * Std Signature : S(measure,289,,P(d1),P(d1),P(d1))
      * TE Signature : S(measure,P(d1),P(d1),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@544772
     */
    public native void measure(String measureName, String startMarkName /* optional */, String endMarkName /* optional */);
    /** 
      * Std Signature : S(now,2,,)
      * TE Signature : S(now,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@544858
     */
    public native Number now();
    /** 
      * Std Signature : S(setResourceTimingBufferSize,289,,P(d2))
      * TE Signature : S(setResourceTimingBufferSize,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@544877
     */
    public native void setResourceTimingBufferSize(Number maxSize);
    /** 
      * Std Signature : S(toJSON,3,,)
      * TE Signature : S(toJSON,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@544933
     */
    public native Object toJSON();
}

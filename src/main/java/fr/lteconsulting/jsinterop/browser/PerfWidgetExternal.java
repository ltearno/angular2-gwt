package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: PerfWidgetExternal
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:543159
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:544196
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="PerfWidgetExternal")
public class PerfWidgetExternal
{

    /*
        Constructors
    */
    public PerfWidgetExternal(){
    }

    /*
        Properties
    */

    public Number activeNetworkRequestCount;

    @JsProperty( name = "activeNetworkRequestCount")
    public native Number getActiveNetworkRequestCount();

    @JsProperty( name = "activeNetworkRequestCount")
    public native void setActiveNetworkRequestCount( Number value );

    public Number averageFrameTime;

    @JsProperty( name = "averageFrameTime")
    public native Number getAverageFrameTime();

    @JsProperty( name = "averageFrameTime")
    public native void setAverageFrameTime( Number value );

    public Number averagePaintTime;

    @JsProperty( name = "averagePaintTime")
    public native Number getAveragePaintTime();

    @JsProperty( name = "averagePaintTime")
    public native void setAveragePaintTime( Number value );

    public Boolean extraInformationEnabled;

    @JsProperty( name = "extraInformationEnabled")
    public native Boolean getExtraInformationEnabled();

    @JsProperty( name = "extraInformationEnabled")
    public native void setExtraInformationEnabled( Boolean value );

    public Boolean independentRenderingEnabled;

    @JsProperty( name = "independentRenderingEnabled")
    public native Boolean getIndependentRenderingEnabled();

    @JsProperty( name = "independentRenderingEnabled")
    public native void setIndependentRenderingEnabled( Boolean value );

    public String irDisablingContentString;

    @JsProperty( name = "irDisablingContentString")
    public native String getIrDisablingContentString();

    @JsProperty( name = "irDisablingContentString")
    public native void setIrDisablingContentString( String value );

    public Boolean irStatusAvailable;

    @JsProperty( name = "irStatusAvailable")
    public native Boolean getIrStatusAvailable();

    @JsProperty( name = "irStatusAvailable")
    public native void setIrStatusAvailable( Boolean value );

    public Number maxCpuSpeed;

    @JsProperty( name = "maxCpuSpeed")
    public native Number getMaxCpuSpeed();

    @JsProperty( name = "maxCpuSpeed")
    public native void setMaxCpuSpeed( Number value );

    public Number paintRequestsPerSecond;

    @JsProperty( name = "paintRequestsPerSecond")
    public native Number getPaintRequestsPerSecond();

    @JsProperty( name = "paintRequestsPerSecond")
    public native void setPaintRequestsPerSecond( Number value );

    public Number performanceCounter;

    @JsProperty( name = "performanceCounter")
    public native Number getPerformanceCounter();

    @JsProperty( name = "performanceCounter")
    public native void setPerformanceCounter( Number value );

    public Number performanceCounterFrequency;

    @JsProperty( name = "performanceCounterFrequency")
    public native Number getPerformanceCounterFrequency();

    @JsProperty( name = "performanceCounterFrequency")
    public native void setPerformanceCounterFrequency( Number value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(addEventListener,289,,P(d1),P(d205))
      * TE Signature : S(addEventListener,P(d1),P(d205))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@543678
     */
    public native void addEventListener(String eventType, Function callback);
    /** 
      * Std Signature : S(getMemoryUsage,2,,)
      * TE Signature : S(getMemoryUsage,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@543745
     */
    public native Number getMemoryUsage();
    /** 
      * Std Signature : S(getProcessCpuUsage,2,,)
      * TE Signature : S(getProcessCpuUsage,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@543775
     */
    public native Number getProcessCpuUsage();
    /** 
      * Std Signature : S(getRecentCpuUsage,3,,P(d2))
      * TE Signature : S(getRecentCpuUsage,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@543809
     */
    public native Object getRecentCpuUsage(Number last);
    /** 
      * Std Signature : S(getRecentFrames,3,,P(d2))
      * TE Signature : S(getRecentFrames,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@543858
     */
    public native Object getRecentFrames(Number last);
    /** 
      * Std Signature : S(getRecentMemoryUsage,3,,P(d2))
      * TE Signature : S(getRecentMemoryUsage,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@543905
     */
    public native Object getRecentMemoryUsage(Number last);
    /** 
      * Std Signature : S(getRecentPaintRequests,3,,P(d2))
      * TE Signature : S(getRecentPaintRequests,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@543957
     */
    public native Object getRecentPaintRequests(Number last);
    /** 
      * Std Signature : S(removeEventListener,289,,P(d1),P(d205))
      * TE Signature : S(removeEventListener,P(d1),P(d205))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@544011
     */
    public native void removeEventListener(String eventType, Function callback);
    /** 
      * Std Signature : S(repositionWindow,289,,P(d2),P(d2))
      * TE Signature : S(repositionWindow,P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@544081
     */
    public native void repositionWindow(Number x, Number y);
    /** 
      * Std Signature : S(resizeWindow,289,,P(d2),P(d2))
      * TE Signature : S(resizeWindow,P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@544131
     */
    public native void resizeWindow(Number width, Number height);
}

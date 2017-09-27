package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: PerformanceNavigationTiming
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:546117
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:547001
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="PerformanceNavigationTiming")
public class PerformanceNavigationTiming extends PerformanceEntry
{

    /*
        Constructors
    */
    public PerformanceNavigationTiming(){
    }

    /*
        Properties
    */

    public Number connectEnd;

    @JsProperty( name = "connectEnd")
    public native Number getConnectEnd();

    @JsProperty( name = "connectEnd")
    public native void setConnectEnd( Number value );

    public Number connectStart;

    @JsProperty( name = "connectStart")
    public native Number getConnectStart();

    @JsProperty( name = "connectStart")
    public native void setConnectStart( Number value );

    public Number domComplete;

    @JsProperty( name = "domComplete")
    public native Number getDomComplete();

    @JsProperty( name = "domComplete")
    public native void setDomComplete( Number value );

    public Number domContentLoadedEventEnd;

    @JsProperty( name = "domContentLoadedEventEnd")
    public native Number getDomContentLoadedEventEnd();

    @JsProperty( name = "domContentLoadedEventEnd")
    public native void setDomContentLoadedEventEnd( Number value );

    public Number domContentLoadedEventStart;

    @JsProperty( name = "domContentLoadedEventStart")
    public native Number getDomContentLoadedEventStart();

    @JsProperty( name = "domContentLoadedEventStart")
    public native void setDomContentLoadedEventStart( Number value );

    public Number domInteractive;

    @JsProperty( name = "domInteractive")
    public native Number getDomInteractive();

    @JsProperty( name = "domInteractive")
    public native void setDomInteractive( Number value );

    public Number domLoading;

    @JsProperty( name = "domLoading")
    public native Number getDomLoading();

    @JsProperty( name = "domLoading")
    public native void setDomLoading( Number value );

    public Number domainLookupEnd;

    @JsProperty( name = "domainLookupEnd")
    public native Number getDomainLookupEnd();

    @JsProperty( name = "domainLookupEnd")
    public native void setDomainLookupEnd( Number value );

    public Number domainLookupStart;

    @JsProperty( name = "domainLookupStart")
    public native Number getDomainLookupStart();

    @JsProperty( name = "domainLookupStart")
    public native void setDomainLookupStart( Number value );

    public Number fetchStart;

    @JsProperty( name = "fetchStart")
    public native Number getFetchStart();

    @JsProperty( name = "fetchStart")
    public native void setFetchStart( Number value );

    public Number loadEventEnd;

    @JsProperty( name = "loadEventEnd")
    public native Number getLoadEventEnd();

    @JsProperty( name = "loadEventEnd")
    public native void setLoadEventEnd( Number value );

    public Number loadEventStart;

    @JsProperty( name = "loadEventStart")
    public native Number getLoadEventStart();

    @JsProperty( name = "loadEventStart")
    public native void setLoadEventStart( Number value );

    public Number navigationStart;

    @JsProperty( name = "navigationStart")
    public native Number getNavigationStart();

    @JsProperty( name = "navigationStart")
    public native void setNavigationStart( Number value );

    public Number redirectCount;

    @JsProperty( name = "redirectCount")
    public native Number getRedirectCount();

    @JsProperty( name = "redirectCount")
    public native void setRedirectCount( Number value );

    public Number redirectEnd;

    @JsProperty( name = "redirectEnd")
    public native Number getRedirectEnd();

    @JsProperty( name = "redirectEnd")
    public native void setRedirectEnd( Number value );

    public Number redirectStart;

    @JsProperty( name = "redirectStart")
    public native Number getRedirectStart();

    @JsProperty( name = "redirectStart")
    public native void setRedirectStart( Number value );

    public Number requestStart;

    @JsProperty( name = "requestStart")
    public native Number getRequestStart();

    @JsProperty( name = "requestStart")
    public native void setRequestStart( Number value );

    public Number responseEnd;

    @JsProperty( name = "responseEnd")
    public native Number getResponseEnd();

    @JsProperty( name = "responseEnd")
    public native void setResponseEnd( Number value );

    public Number responseStart;

    @JsProperty( name = "responseStart")
    public native Number getResponseStart();

    @JsProperty( name = "responseStart")
    public native void setResponseStart( Number value );

    public String type;

    @JsProperty( name = "type")
    public native String getType();

    @JsProperty( name = "type")
    public native void setType( String value );

    public Number unloadEventEnd;

    @JsProperty( name = "unloadEventEnd")
    public native Number getUnloadEventEnd();

    @JsProperty( name = "unloadEventEnd")
    public native void setUnloadEventEnd( Number value );

    public Number unloadEventStart;

    @JsProperty( name = "unloadEventStart")
    public native Number getUnloadEventStart();

    @JsProperty( name = "unloadEventStart")
    public native void setUnloadEventStart( Number value );
}

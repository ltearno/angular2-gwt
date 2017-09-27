package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: PerformanceResourceTiming
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:547118
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:547587
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="PerformanceResourceTiming")
public class PerformanceResourceTiming extends PerformanceEntry
{

    /*
        Constructors
    */
    public PerformanceResourceTiming(){
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

    public String initiatorType;

    @JsProperty( name = "initiatorType")
    public native String getInitiatorType();

    @JsProperty( name = "initiatorType")
    public native void setInitiatorType( String value );

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
}

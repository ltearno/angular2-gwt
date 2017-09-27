package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: HTMLVideoElementEventMap
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:486652
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLVideoElementEventMap")
public class HTMLVideoElementEventMap extends HTMLMediaElementEventMap
{

    /*
        Properties
    */

    public Event MSVideoFormatChanged;

    @JsProperty( name = "MSVideoFormatChanged")
    public native Event getMSVideoFormatChanged();

    @JsProperty( name = "MSVideoFormatChanged")
    public native void setMSVideoFormatChanged( Event value );

    public Event MSVideoFrameStepCompleted;

    @JsProperty( name = "MSVideoFrameStepCompleted")
    public native Event getMSVideoFrameStepCompleted();

    @JsProperty( name = "MSVideoFrameStepCompleted")
    public native void setMSVideoFrameStepCompleted( Event value );

    public Event MSVideoOptimalLayoutChanged;

    @JsProperty( name = "MSVideoOptimalLayoutChanged")
    public native Event getMSVideoOptimalLayoutChanged();

    @JsProperty( name = "MSVideoOptimalLayoutChanged")
    public native void setMSVideoOptimalLayoutChanged( Event value );
}

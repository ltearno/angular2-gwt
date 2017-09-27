package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MSBaseReaderEventMap
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:731605
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSBaseReaderEventMap")
public class MSBaseReaderEventMap
{

    /*
        Properties
    */

    public Event abort;

    @JsProperty( name = "abort")
    public native Event getAbort();

    @JsProperty( name = "abort")
    public native void setAbort( Event value );

    public ErrorEvent error;

    @JsProperty( name = "error")
    public native ErrorEvent getError();

    @JsProperty( name = "error")
    public native void setError( ErrorEvent value );

    public Event load;

    @JsProperty( name = "load")
    public native Event getLoad();

    @JsProperty( name = "load")
    public native void setLoad( Event value );

    public ProgressEvent loadend;

    @JsProperty( name = "loadend")
    public native ProgressEvent getLoadend();

    @JsProperty( name = "loadend")
    public native void setLoadend( ProgressEvent value );

    public Event loadstart;

    @JsProperty( name = "loadstart")
    public native Event getLoadstart();

    @JsProperty( name = "loadstart")
    public native void setLoadstart( Event value );

    public ProgressEvent progress;

    @JsProperty( name = "progress")
    public native ProgressEvent getProgress();

    @JsProperty( name = "progress")
    public native void setProgress( ProgressEvent value );
}

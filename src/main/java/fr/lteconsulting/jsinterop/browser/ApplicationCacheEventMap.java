package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: ApplicationCacheEventMap
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:283663
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ApplicationCacheEventMap")
public class ApplicationCacheEventMap
{

    /*
        Properties
    */

    public Event cached;

    @JsProperty( name = "cached")
    public native Event getCached();

    @JsProperty( name = "cached")
    public native void setCached( Event value );

    public Event checking;

    @JsProperty( name = "checking")
    public native Event getChecking();

    @JsProperty( name = "checking")
    public native void setChecking( Event value );

    public Event downloading;

    @JsProperty( name = "downloading")
    public native Event getDownloading();

    @JsProperty( name = "downloading")
    public native void setDownloading( Event value );

    public Event error;

    @JsProperty( name = "error")
    public native Event getError();

    @JsProperty( name = "error")
    public native void setError( Event value );

    public Event noupdate;

    @JsProperty( name = "noupdate")
    public native Event getNoupdate();

    @JsProperty( name = "noupdate")
    public native void setNoupdate( Event value );

    public Event obsolete;

    @JsProperty( name = "obsolete")
    public native Event getObsolete();

    @JsProperty( name = "obsolete")
    public native void setObsolete( Event value );

    public ProgressEvent progress;

    @JsProperty( name = "progress")
    public native ProgressEvent getProgress();

    @JsProperty( name = "progress")
    public native void setProgress( ProgressEvent value );

    public Event updateready;

    @JsProperty( name = "updateready")
    public native Event getUpdateready();

    @JsProperty( name = "updateready")
    public native void setUpdateready( Event value );
}

package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.Promise;
import fr.lteconsulting.prebuilt.Function;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/application_init".ApplicationInitStatus
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/application_init.d.ts:205
  * 1 constructors
  * A class that reflects the state of running {@link APP_INITIALIZER}s.
 */
@JsType(isNative=true, namespace="ng.core", name="ApplicationInitStatus")
public class ApplicationInitStatus
{

    /*
        Constructors
    */
    public ApplicationInitStatus(Array<Function<Object>> appInits){
    }

    /*
        Properties
    */

    public Object _done;

    @JsProperty( name = "_done")
    public native Object get_done();

    @JsProperty( name = "_done")
    public native void set_done( Object value );

    public Object _donePromise;

    @JsProperty( name = "_donePromise")
    public native Object get_donePromise();

    @JsProperty( name = "_donePromise")
    public native void set_donePromise( Object value );

    public Object appInits;

    @JsProperty( name = "appInits")
    public native Object getAppInits();

    @JsProperty( name = "appInits")
    public native void setAppInits( Object value );

    public Boolean done;

    @JsProperty( name = "done")
    public native Boolean getDone();

    @JsProperty( name = "done")
    public native void setDone( Boolean value );

    public Promise<Object> donePromise;

    @JsProperty( name = "donePromise")
    public native Promise<Object> getDonePromise();

    @JsProperty( name = "donePromise")
    public native void setDonePromise( Promise<Object> value );

    public Object initialized;

    @JsProperty( name = "initialized")
    public native Object getInitialized();

    @JsProperty( name = "initialized")
    public native void setInitialized( Object value );

    public Object reject;

    @JsProperty( name = "reject")
    public native Object getReject();

    @JsProperty( name = "reject")
    public native void setReject( Object value );

    public Object resolve;

    @JsProperty( name = "resolve")
    public native Object getResolve();

    @JsProperty( name = "resolve")
    public native void setResolve( Object value );
}

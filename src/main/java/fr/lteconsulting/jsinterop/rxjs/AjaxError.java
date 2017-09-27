package fr.lteconsulting.jsinterop.rxjs;

import fr.lteconsulting.jsinterop.browser.Error;
import fr.lteconsulting.jsinterop.browser.XMLHttpRequest;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/observable/dom/AjaxObservable".AjaxError
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/observable/dom/AjaxObservable.d.ts:4289
  * 1 constructors
  * A normalized AJAX error.
 */
@JsType(isNative=true, namespace="rxjs", name="AjaxError")
public class AjaxError extends Error
{

    /*
        Constructors
    */
    public AjaxError(String message, XMLHttpRequest xhr, AjaxRequest request){
        super(null);
    }

    /*
        Properties
    */

    public String message;

    @JsProperty( name = "message")
    public native String getMessage();

    @JsProperty( name = "message")
    public native void setMessage( String value );

    public String name;

    @JsProperty( name = "name")
    public native String getName();

    @JsProperty( name = "name")
    public native void setName( String value );

    public AjaxRequest request;

    @JsProperty( name = "request")
    public native AjaxRequest getRequest();

    @JsProperty( name = "request")
    public native void setRequest( AjaxRequest value );

    public String stack;

    @JsProperty( name = "stack")
    public native String getStack();

    @JsProperty( name = "stack")
    public native void setStack( String value );

    public Number status;

    @JsProperty( name = "status")
    public native Number getStatus();

    @JsProperty( name = "status")
    public native void setStatus( Number value );

    public XMLHttpRequest xhr;

    @JsProperty( name = "xhr")
    public native XMLHttpRequest getXhr();

    @JsProperty( name = "xhr")
    public native void setXhr( XMLHttpRequest value );
}

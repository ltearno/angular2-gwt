package fr.lteconsulting.jsinterop.rxjs;

import fr.lteconsulting.jsinterop.browser.Event;
import fr.lteconsulting.jsinterop.browser.XMLHttpRequest;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/observable/dom/AjaxObservable".AjaxResponse
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/observable/dom/AjaxObservable.d.ts:3660
  * 1 constructors
  * A normalized AJAX response.
 */
@JsType(isNative=true, namespace="rxjs", name="AjaxResponse")
public class AjaxResponse
{

    /*
        Constructors
    */
    public AjaxResponse(Event originalEvent, XMLHttpRequest xhr, AjaxRequest request){
    }

    /*
        Properties
    */

    public Event originalEvent;

    @JsProperty( name = "originalEvent")
    public native Event getOriginalEvent();

    @JsProperty( name = "originalEvent")
    public native void setOriginalEvent( Event value );

    public AjaxRequest request;

    @JsProperty( name = "request")
    public native AjaxRequest getRequest();

    @JsProperty( name = "request")
    public native void setRequest( AjaxRequest value );

    public Object response;

    @JsProperty( name = "response")
    public native Object getResponse();

    @JsProperty( name = "response")
    public native void setResponse( Object value );

    public String responseText;

    @JsProperty( name = "responseText")
    public native String getResponseText();

    @JsProperty( name = "responseText")
    public native void setResponseText( String value );

    public String responseType;

    @JsProperty( name = "responseType")
    public native String getResponseType();

    @JsProperty( name = "responseType")
    public native void setResponseType( String value );

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

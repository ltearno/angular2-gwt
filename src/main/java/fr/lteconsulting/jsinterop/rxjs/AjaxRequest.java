package fr.lteconsulting.jsinterop.rxjs;

import fr.lteconsulting.jsinterop.browser.XMLHttpRequest;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/observable/dom/AjaxObservable".AjaxRequest
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/observable/dom/AjaxObservable.d.ts:145
  * 
 */
@JsType(isNative=true, namespace="rxjs", name="AjaxRequest")
public class AjaxRequest
{

    /*
        Properties
    */

    public Boolean async;

    @JsProperty( name = "async")
    public native Boolean getAsync();

    @JsProperty( name = "async")
    public native void setAsync( Boolean value );

    public Object body;

    @JsProperty( name = "body")
    public native Object getBody();

    @JsProperty( name = "body")
    public native void setBody( Object value );

    public Boolean crossDomain;

    @JsProperty( name = "crossDomain")
    public native Boolean getCrossDomain();

    @JsProperty( name = "crossDomain")
    public native void setCrossDomain( Boolean value );

    public Boolean hasContent;

    @JsProperty( name = "hasContent")
    public native Boolean getHasContent();

    @JsProperty( name = "hasContent")
    public native void setHasContent( Boolean value );

    public Object headers;

    @JsProperty( name = "headers")
    public native Object getHeaders();

    @JsProperty( name = "headers")
    public native void setHeaders( Object value );

    public String method;

    @JsProperty( name = "method")
    public native String getMethod();

    @JsProperty( name = "method")
    public native void setMethod( String value );

    public String password;

    @JsProperty( name = "password")
    public native String getPassword();

    @JsProperty( name = "password")
    public native void setPassword( String value );

    public Subscriber<Object> progressSubscriber;

    @JsProperty( name = "progressSubscriber")
    public native Subscriber<Object> getProgressSubscriber();

    @JsProperty( name = "progressSubscriber")
    public native void setProgressSubscriber( Subscriber<Object> value );

    public String responseType;

    @JsProperty( name = "responseType")
    public native String getResponseType();

    @JsProperty( name = "responseType")
    public native void setResponseType( String value );

    public Number timeout;

    @JsProperty( name = "timeout")
    public native Number getTimeout();

    @JsProperty( name = "timeout")
    public native void setTimeout( Number value );

    public String url;

    @JsProperty( name = "url")
    public native String getUrl();

    @JsProperty( name = "url")
    public native void setUrl( String value );

    public String user;

    @JsProperty( name = "user")
    public native String getUser();

    @JsProperty( name = "user")
    public native void setUser( String value );

    public Boolean withCredentials;

    @JsProperty( name = "withCredentials")
    public native Boolean getWithCredentials();

    @JsProperty( name = "withCredentials")
    public native void setWithCredentials( Boolean value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(createXHR,698,,)
      * TE Signature : S(createXHR,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/observable/dom/AjaxObservable.d.ts@439
     */
    public native XMLHttpRequest createXHR();
}

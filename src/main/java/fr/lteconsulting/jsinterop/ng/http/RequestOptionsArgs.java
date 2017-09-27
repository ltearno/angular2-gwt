package fr.lteconsulting.jsinterop.ng.http;

import fr.lteconsulting.jsinterop.UnionOfAnonymousType717AndStringAndURLSearchParams;
import fr.lteconsulting.jsinterop.browser.AnonymousType717;
import fr.lteconsulting.jsinterop.browser.PropertyKey_UnionOfNumberAndString;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/interfaces".RequestOptionsArgs
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/interfaces.d.ts:1150

  * Interface for options to construct a RequestOptions, based on
  * [RequestInit](https://fetch.spec.whatwg.org/#requestinit) from the Fetch spec.
 */
@JsType(isNative=true, namespace="ng.http", name="RequestOptionsArgs")
public class RequestOptionsArgs
{

    /*
        Properties
    */

    public Object body;

    @JsProperty( name = "body")
    public native Object getBody();

    @JsProperty( name = "body")
    public native void setBody( Object value );

    public Headers headers;

    @JsProperty( name = "headers")
    public native Headers getHeaders();

    @JsProperty( name = "headers")
    public native void setHeaders( Headers value );

    public PropertyKey_UnionOfNumberAndString method;

    @JsProperty( name = "method")
    public native PropertyKey_UnionOfNumberAndString getMethod();

    @JsProperty( name = "method")
    public native void setMethod( PropertyKey_UnionOfNumberAndString value );

    @JsOverlay
    public final void setMethod( Number value ) { setMethod(PropertyKey_UnionOfNumberAndString.ofNumber( value )); }

    @JsOverlay
    public final void setMethod( String value ) { setMethod(PropertyKey_UnionOfNumberAndString.ofString( value )); }

    public UnionOfAnonymousType717AndStringAndURLSearchParams params;

    @JsProperty( name = "params")
    public native UnionOfAnonymousType717AndStringAndURLSearchParams getParams();

    @JsProperty( name = "params")
    public native void setParams( UnionOfAnonymousType717AndStringAndURLSearchParams value );

    @JsOverlay
    public final void setParams( AnonymousType717 value ) { setParams(UnionOfAnonymousType717AndStringAndURLSearchParams.ofAnonymousType717( value )); }

    @JsOverlay
    public final void setParams( String value ) { setParams(UnionOfAnonymousType717AndStringAndURLSearchParams.ofString( value )); }

    @JsOverlay
    public final void setParams( URLSearchParams value ) { setParams(UnionOfAnonymousType717AndStringAndURLSearchParams.ofURLSearchParams( value )); }

    public ResponseContentType responseType;

    @JsProperty( name = "responseType")
    public native ResponseContentType getResponseType();

    @JsProperty( name = "responseType")
    public native void setResponseType( ResponseContentType value );

    public UnionOfAnonymousType717AndStringAndURLSearchParams search;

    @JsProperty( name = "search")
    public native UnionOfAnonymousType717AndStringAndURLSearchParams getSearch();

    @JsProperty( name = "search")
    public native void setSearch( UnionOfAnonymousType717AndStringAndURLSearchParams value );

    @JsOverlay
    public final void setSearch( AnonymousType717 value ) { setSearch(UnionOfAnonymousType717AndStringAndURLSearchParams.ofAnonymousType717( value )); }

    @JsOverlay
    public final void setSearch( String value ) { setSearch(UnionOfAnonymousType717AndStringAndURLSearchParams.ofString( value )); }

    @JsOverlay
    public final void setSearch( URLSearchParams value ) { setSearch(UnionOfAnonymousType717AndStringAndURLSearchParams.ofURLSearchParams( value )); }

    public String url;

    @JsProperty( name = "url")
    public native String getUrl();

    @JsProperty( name = "url")
    public native void setUrl( String value );

    public Boolean withCredentials;

    @JsProperty( name = "withCredentials")
    public native Boolean getWithCredentials();

    @JsProperty( name = "withCredentials")
    public native void setWithCredentials( Boolean value );
}

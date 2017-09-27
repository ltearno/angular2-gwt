package fr.lteconsulting.jsinterop.ng.http;

import fr.lteconsulting.jsinterop.browser.ArrayBuffer;
import fr.lteconsulting.jsinterop.browser.Blob;
import fr.lteconsulting.jsinterop.browser.FormData;
import fr.lteconsulting.jsinterop.browser.UnionOfArrayBufferAndBlobAndFormDataAndObjectAndString;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/interfaces".ResponseOptionsArgs
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/interfaces.d.ts:1951

  * Interface for options to construct a Response, based on
  * [ResponseInit](https://fetch.spec.whatwg.org/#responseinit) from the Fetch spec.
 */
@JsType(isNative=true, namespace="ng.http", name="ResponseOptionsArgs")
public class ResponseOptionsArgs
{

    /*
        Properties
    */

    public UnionOfArrayBufferAndBlobAndFormDataAndObjectAndString body;

    @JsProperty( name = "body")
    public native UnionOfArrayBufferAndBlobAndFormDataAndObjectAndString getBody();

    @JsProperty( name = "body")
    public native void setBody( UnionOfArrayBufferAndBlobAndFormDataAndObjectAndString value );

    @JsOverlay
    public final void setBody( ArrayBuffer value ) { setBody(UnionOfArrayBufferAndBlobAndFormDataAndObjectAndString.ofArrayBuffer( value )); }

    @JsOverlay
    public final void setBody( Blob value ) { setBody(UnionOfArrayBufferAndBlobAndFormDataAndObjectAndString.ofBlob( value )); }

    @JsOverlay
    public final void setBody( FormData value ) { setBody(UnionOfArrayBufferAndBlobAndFormDataAndObjectAndString.ofFormData( value )); }

    @JsOverlay
    public final void setBody( Object value ) { setBody(UnionOfArrayBufferAndBlobAndFormDataAndObjectAndString.ofObject( value )); }

    @JsOverlay
    public final void setBody( String value ) { setBody(UnionOfArrayBufferAndBlobAndFormDataAndObjectAndString.ofString( value )); }

    public Headers headers;

    @JsProperty( name = "headers")
    public native Headers getHeaders();

    @JsProperty( name = "headers")
    public native void setHeaders( Headers value );

    public Number status;

    @JsProperty( name = "status")
    public native Number getStatus();

    @JsProperty( name = "status")
    public native void setStatus( Number value );

    public String statusText;

    @JsProperty( name = "statusText")
    public native String getStatusText();

    @JsProperty( name = "statusText")
    public native void setStatusText( String value );

    public ResponseType type;

    @JsProperty( name = "type")
    public native ResponseType getType();

    @JsProperty( name = "type")
    public native void setType( ResponseType value );

    public String url;

    @JsProperty( name = "url")
    public native String getUrl();

    @JsProperty( name = "url")
    public native void setUrl( String value );
}

package fr.lteconsulting.jsinterop.ng;

import fr.lteconsulting.jsinterop.browser.Error;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/response".HttpJsonParseError
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/response.d.ts:2449

  * An error that represents a failed attempt to JSON.parse text coming back
  * from the server.
  * 
  * It bundles the Error object with the actual response body that failed to parse.
 */
@JsType(isNative=true, namespace="ng", name="HttpJsonParseError")
public class HttpJsonParseError
{

    /*
        Properties
    */

    public Error error;

    @JsProperty( name = "error")
    public native Error getError();

    @JsProperty( name = "error")
    public native void setError( Error value );

    public String text;

    @JsProperty( name = "text")
    public native String getText();

    @JsProperty( name = "text")
    public native void setText( String value );
}

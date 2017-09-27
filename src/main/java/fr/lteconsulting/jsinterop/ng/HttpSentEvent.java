package fr.lteconsulting.jsinterop.ng;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/response".HttpSentEvent
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/response.d.ts:1919

  * An event indicating that the request was sent to the server. Useful
  * when a request may be retried multiple times, to distinguish between
  * retries on the final event stream.
 */
@JsType(isNative=true, namespace="ng", name="HttpSentEvent")
public class HttpSentEvent
{

    /*
        Properties
    */

    public Number type;

    @JsProperty( name = "type")
    public native Number getType();

    @JsProperty( name = "type")
    public native void setType( Number value );
}

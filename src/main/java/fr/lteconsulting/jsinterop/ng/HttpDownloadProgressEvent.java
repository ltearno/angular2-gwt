package fr.lteconsulting.jsinterop.ng;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/response".HttpDownloadProgressEvent
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/response.d.ts:1422

  * A download progress event.
 */
@JsType(isNative=true, namespace="ng", name="HttpDownloadProgressEvent")
public class HttpDownloadProgressEvent extends HttpProgressEvent
{

    /*
        Properties
    */

    /** 
      * The partial response body as downloaded so far.
      * 
      * Only present if the responseType was `text`.
     */
    public String partialText;

    @JsProperty( name = "partialText")
    public native String getPartialText();

    @JsProperty( name = "partialText")
    public native void setPartialText( String value );
}

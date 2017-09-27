package fr.lteconsulting.jsinterop.ng;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/response".HttpProgressEvent
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/response.d.ts:898

  * Base interface for progress events.
 */
@JsType(isNative=true, namespace="ng", name="HttpProgressEvent")
public class HttpProgressEvent
{

    /*
        Properties
    */

    /** 
      * Number of bytes uploaded or downloaded.
     */
    public Number loaded;

    @JsProperty( name = "loaded")
    public native Number getLoaded();

    @JsProperty( name = "loaded")
    public native void setLoaded( Number value );

    /** 
      * Total number of bytes to upload or download. Depending on the request or
      * response, this may not be computable and thus may not be present.
     */
    public Number total;

    @JsProperty( name = "total")
    public native Number getTotal();

    @JsProperty( name = "total")
    public native void setTotal( Number value );

    /** 
      * Progress event type is either upload or download.
     */
    public Number type;

    @JsProperty( name = "type")
    public native Number getType();

    @JsProperty( name = "type")
    public native void setType( Number value );
}

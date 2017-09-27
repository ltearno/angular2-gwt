package fr.lteconsulting.jsinterop.ng;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/response".HttpUserEvent
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/response.d.ts:2193

  * A user-defined event.
  * 
  * Grouping all custom events under this type ensures they will be handled
  * and forwarded by all implementations of interceptors.
 */
@JsType(isNative=true, namespace="ng", name="HttpUserEvent")
public class HttpUserEvent<T>
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

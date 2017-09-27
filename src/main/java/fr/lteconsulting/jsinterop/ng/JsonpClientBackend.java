package fr.lteconsulting.jsinterop.ng;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/jsonp".JsonpClientBackend
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/jsonp.d.ts:723
  * 1 constructors
  * `HttpBackend` that only processes `HttpRequest` with the JSONP method,
  * by performing JSONP style requests.
 */
@JsType(isNative=true, namespace="ng", name="JsonpClientBackend")
public class JsonpClientBackend extends HttpBackend
{

    /*
        Constructors
    */
    public JsonpClientBackend(JsonpCallbackContext callbackMap, Object document){
    }

    /*
        Properties
    */

    public Object callbackMap;

    @JsProperty( name = "callbackMap")
    public native Object getCallbackMap();

    @JsProperty( name = "callbackMap")
    public native void setCallbackMap( Object value );

    public Object document;

    @JsProperty( name = "document")
    public native Object getDocument();

    @JsProperty( name = "document")
    public native void setDocument( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(nextCallback,3,,)
      * TE Signature : S(nextCallback,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/jsonp.d.ts@1157
      * Get the name of the next callback method, by incrementing the global `nextRequestId`.
     */
    public native Object nextCallback();
}

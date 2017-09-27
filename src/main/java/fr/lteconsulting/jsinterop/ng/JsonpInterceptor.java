package fr.lteconsulting.jsinterop.ng;

import fr.lteconsulting.jsinterop.rxjs.Observable;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/jsonp".JsonpInterceptor
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/jsonp.d.ts:1337
  * 1 constructors
  * An `HttpInterceptor` which identifies requests with the method JSONP and
  * shifts them to the `JsonpClientBackend`.
 */
@JsType(isNative=true, namespace="ng", name="JsonpInterceptor")
public class JsonpInterceptor
{

    /*
        Constructors
    */
    public JsonpInterceptor(JsonpClientBackend jsonp){
    }

    /*
        Properties
    */

    public Object jsonp;

    @JsProperty( name = "jsonp")
    public native Object getJsonp();

    @JsProperty( name = "jsonp")
    public native void setJsonp( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(intercept,357<U(-843,844,845<3>,846,847<8>)>,,P(d430<3>),P(d431))
      * TE Signature : S(intercept,P(d430),P(d431))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/jsonp.d.ts@1593
     */
    public native Observable<HttpEvent_UnionOfHttpHeaderResponseAndHttpProgressEventAndHttpResponseOfObjectAndHttpSentEventAndHttpUserEventOfObject> intercept(HttpRequest<Object> req, HttpHandler next);
}

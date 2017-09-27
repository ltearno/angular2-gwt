package fr.lteconsulting.jsinterop.ng;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/xhr".HttpXhrBackend
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/xhr.d.ts:539
  * 1 constructors
  * An `HttpBackend` which uses the XMLHttpRequest API to send
  * requests to a backend server.
 */
@JsType(isNative=true, namespace="ng", name="HttpXhrBackend")
public class HttpXhrBackend extends HttpBackend
{

    /*
        Constructors
    */
    public HttpXhrBackend(XhrFactory xhrFactory){
    }

    /*
        Properties
    */

    public Object xhrFactory;

    @JsProperty( name = "xhrFactory")
    public native Object getXhrFactory();

    @JsProperty( name = "xhrFactory")
    public native void setXhrFactory( Object value );
}

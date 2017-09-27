package fr.lteconsulting.jsinterop.ng.http;

import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/backends/xhr_backend".XHRConnection
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/backends/xhr_backend.d.ts:357
  * 1 constructors
  * Creates connections using `XMLHttpRequest`. Given a fully-qualified
  * request, an `XHRConnection` will immediately create an `XMLHttpRequest` object and send the
  * request.
  * 
  * This class would typically not be created or interacted with directly inside applications, though
  * the {@link MockConnection} may be interacted with in tests.
 */
@JsType(isNative=true, namespace="ng.http", name="XHRConnection")
public class XHRConnection extends Connection
{

    /*
        Constructors
    */
    public XHRConnection(Request req, BrowserXhr browserXHR, ResponseOptions baseResponseOptions){
    }

    /*
        Methods
    */
    /** 
      * Std Signature : S(setDetectedContentType,429,,P(d3),P(d3))
      * TE Signature : S(setDetectedContentType,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/backends/xhr_backend.d.ts@1113
     */
    public native void setDetectedContentType(Object req, Object _xhr);
}

package fr.lteconsulting.jsinterop.ng.http;

import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/interfaces".ConnectionBackend
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/interfaces.d.ts:426

  * Abstract class from which real backends are derived.
  * 
  * The primary purpose of a `ConnectionBackend` is to create new connections to fulfill a given
  * {@link Request}.
 */
@JsType(isNative=true, namespace="ng.http", name="ConnectionBackend")
public class ConnectionBackend
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(createConnection,1239,,P(d3))
      * TE Signature : S(createConnection,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/http/src/interfaces.d.ts@684
     */
    public native Connection createConnection(Object request);
}

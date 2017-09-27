package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: URIError
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:38061
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:38255
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="URIError")
public class URIError extends Error
{

    /*
        Constructors
    */
    public URIError(String message){
        super(null);
    }
}

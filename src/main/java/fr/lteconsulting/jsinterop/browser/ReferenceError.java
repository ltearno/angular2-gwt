package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: ReferenceError
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:37316
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:37540
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ReferenceError")
public class ReferenceError extends Error
{

    /*
        Constructors
    */
    public ReferenceError(String message){
        super(null);
    }
}

package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: RangeError
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:37077
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:37281
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RangeError")
public class RangeError extends Error
{

    /*
        Constructors
    */
    public RangeError(String message){
        super(null);
    }
}

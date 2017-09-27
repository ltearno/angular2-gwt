package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: SyntaxError
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:37583
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:37792
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SyntaxError")
public class SyntaxError extends Error
{

    /*
        Constructors
    */
    public SyntaxError(String message){
        super(null);
    }
}

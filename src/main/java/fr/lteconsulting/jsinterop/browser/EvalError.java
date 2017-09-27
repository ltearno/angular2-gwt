package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: EvalError
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:36845
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:37044
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="EvalError")
public class EvalError extends Error
{

    /*
        Constructors
    */
    public EvalError(String message){
        super(null);
    }
}

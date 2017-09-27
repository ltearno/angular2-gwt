package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: TypeError
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:37829
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:38028
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="TypeError")
public class TypeError extends Error
{

    /*
        Constructors
    */
    public TypeError(String message){
        super(null);
    }
}

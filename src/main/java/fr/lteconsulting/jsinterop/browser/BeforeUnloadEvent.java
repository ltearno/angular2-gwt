package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: BeforeUnloadEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:292431
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:292513
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="BeforeUnloadEvent")
public class BeforeUnloadEvent extends Event
{

    /*
        Constructors
    */
    public BeforeUnloadEvent(){
        super(null, null);
    }
}

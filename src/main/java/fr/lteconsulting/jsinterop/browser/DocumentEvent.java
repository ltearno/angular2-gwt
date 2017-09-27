package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: DocumentEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:724087
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface DocumentEvent
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(createEvent,390,,P(d1))
      * TE Signature : S(createEvent,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@724119
     */
    AnimationEvent createEvent(String eventInterface);
}

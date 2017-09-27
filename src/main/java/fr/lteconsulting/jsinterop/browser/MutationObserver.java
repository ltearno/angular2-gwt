package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: MutationObserver
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:528368
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:528538
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MutationObserver")
public class MutationObserver
{

    /*
        Constructors
    */
    public MutationObserver(MutationCallback callback){
    }

    /*
        Methods
    */
    /** 
      * Std Signature : S(disconnect,289,,)
      * TE Signature : S(disconnect,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@528403
     */
    public native void disconnect();
    /** 
      * Std Signature : S(observe,289,,P(d86),P(d246))
      * TE Signature : S(observe,P(d86),P(d246))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@528427
     */
    public native void observe(Node target, MutationObserverInit options);
    /** 
      * Std Signature : S(takeRecords,7<565>,,)
      * TE Signature : S(takeRecords,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@528491
     */
    public native Array<MutationRecord> takeRecords();
}

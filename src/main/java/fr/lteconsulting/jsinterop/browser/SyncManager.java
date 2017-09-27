package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: SyncManager
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:652961
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:653063
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SyncManager")
public class SyncManager
{

    /*
        Constructors
    */
    public SyncManager(){
    }

    /*
        Methods
    */
    /** 
      * Std Signature : S(getTags,3,,)
      * TE Signature : S(getTags,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@652991
     */
    public native Object getTags();
    /** 
      * Std Signature : S(register,88<369>,,P(d1))
      * TE Signature : S(register,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@653011
     */
    public native Promise<Void> register(String tag);
}

package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: MediaKeys
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:519588
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:519749
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MediaKeys")
public class MediaKeys
{

    /*
        Constructors
    */
    public MediaKeys(){
    }

    /*
        Methods
    */
    /** 
      * Std Signature : S(createSession,494,,)
      * TE Signature : S(createSession,)
      * 
     */
    public native MediaKeySession createSession();
    /** 
      * Std Signature : S(createSession,494,,P(d1))
      * TE Signature : S(createSession,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@519616
     */
    public native MediaKeySession createSession(String sessionType /* optional */);
    /** 
      * Std Signature : S(setServerCertificate,88<369>,,P(d3))
      * TE Signature : S(setServerCertificate,P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@519674
     */
    public native Promise<Void> setServerCertificate(Object serverCertificate);
}

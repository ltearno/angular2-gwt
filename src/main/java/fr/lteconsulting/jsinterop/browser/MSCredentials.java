package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: MSCredentials
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:502972
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:503258
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSCredentials")
public class MSCredentials
{

    /*
        Constructors
    */
    public MSCredentials(){
    }

    /*
        Methods
    */
    /** 
      * Std Signature : S(getAssertion,88<497>,,P(d1))
      * TE Signature : S(getAssertion,P(d1))
      * 
     */
    public native Promise<MSAssertion> getAssertion(String challenge);
    /** 
      * Std Signature : S(getAssertion,88<497>,,P(d1),P(d192))
      * TE Signature : S(getAssertion,P(d1),P(d192))
      * 
     */
    public native Promise<MSAssertion> getAssertion(String challenge, MSCredentialFilter filter /* optional */);
    /** 
      * Std Signature : S(getAssertion,88<497>,,P(d1),P(d192),P(d193))
      * TE Signature : S(getAssertion,P(d1),P(d192),P(d193))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@503004
     */
    public native Promise<MSAssertion> getAssertion(String challenge, MSCredentialFilter filter /* optional */, MSSignatureParameters params /* optional */);
    /** 
      * Std Signature : S(makeCredential,88<497>,,P(d194),P(d7<498>))
      * TE Signature : S(makeCredential,P(d194),P(d7))
      * 
     */
    public native Promise<MSAssertion> makeCredential(MSAccountInfo accountInfo, Array<MSCredentialParameters> params);
    /** 
      * Std Signature : S(makeCredential,88<497>,,P(d194),P(d7<498>),P(d1))
      * TE Signature : S(makeCredential,P(d194),P(d7),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@503124
     */
    public native Promise<MSAssertion> makeCredential(MSAccountInfo accountInfo, Array<MSCredentialParameters> params, String challenge /* optional */);
}

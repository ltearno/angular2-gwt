package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: WebAuthentication
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:664601
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:664936
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="WebAuthentication")
public class WebAuthentication
{

    /*
        Constructors
    */
    public WebAuthentication(){
    }

    /*
        Methods
    */
    /** 
      * Std Signature : S(getAssertion,88<482>,,P(d3))
      * TE Signature : S(getAssertion,P(d3))
      * 
     */
    public native Promise<WebAuthnAssertion> getAssertion(Object assertionChallenge);
    /** 
      * Std Signature : S(getAssertion,88<482>,,P(d3),P(d158))
      * TE Signature : S(getAssertion,P(d3),P(d158))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@664637
     */
    public native Promise<WebAuthnAssertion> getAssertion(Object assertionChallenge, AssertionOptions options /* optional */);
    /** 
      * Std Signature : S(makeCredential,88<483>,,P(d159),P(d7<484>),P(d3))
      * TE Signature : S(makeCredential,P(d159),P(d7),P(d3))
      * 
     */
    public native Promise<ScopedCredentialInfo> makeCredential(Account accountInformation, Array<ScopedCredentialParameters> cryptoParameters, Object attestationChallenge);
    /** 
      * Std Signature : S(makeCredential,88<483>,,P(d159),P(d7<484>),P(d3),P(d160))
      * TE Signature : S(makeCredential,P(d159),P(d7),P(d3),P(d160))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@664736
     */
    public native Promise<ScopedCredentialInfo> makeCredential(Account accountInformation, Array<ScopedCredentialParameters> cryptoParameters, Object attestationChallenge, ScopedCredentialOptions options /* optional */);
}

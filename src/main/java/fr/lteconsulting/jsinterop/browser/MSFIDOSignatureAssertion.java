package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MSFIDOSignatureAssertion
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:503887
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:504001
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSFIDOSignatureAssertion")
public class MSFIDOSignatureAssertion extends MSAssertion
{

    /*
        Constructors
    */
    public MSFIDOSignatureAssertion(){
    }

    /*
        Properties
    */

    public MSFIDOSignature signature;

    @JsProperty( name = "signature")
    public native MSFIDOSignature getSignature();

    @JsProperty( name = "signature")
    public native void setSignature( MSFIDOSignature value );
}

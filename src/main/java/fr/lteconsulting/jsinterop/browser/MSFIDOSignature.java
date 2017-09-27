package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MSFIDOSignature
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:503664
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:503806
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSFIDOSignature")
public class MSFIDOSignature
{

    /*
        Constructors
    */
    public MSFIDOSignature(){
    }

    /*
        Properties
    */

    public String authnrData;

    @JsProperty( name = "authnrData")
    public native String getAuthnrData();

    @JsProperty( name = "authnrData")
    public native void setAuthnrData( String value );

    public String clientData;

    @JsProperty( name = "clientData")
    public native String getClientData();

    @JsProperty( name = "clientData")
    public native void setClientData( String value );

    public String signature;

    @JsProperty( name = "signature")
    public native String getSignature();

    @JsProperty( name = "signature")
    public native void setSignature( String value );
}

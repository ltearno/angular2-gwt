package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MSMediaKeys
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:511647
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:511815
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSMediaKeys")
public class MSMediaKeys
{

    /*
        Constructors
    */
    public MSMediaKeys(String keySystem){
    }

    /*
        Static methods
    */
    /** 
      * source : apis/browser-api/tsd/lib.es6.d.ts:511904
     */
    @JsMethod(namespace="MSMediaKeys", name = "isTypeSupported")
    public static native Boolean isTypeSupported(String keySystem, String type /* optional */);
    /** 
      * source : apis/browser-api/tsd/lib.es6.d.ts:511968
     */
    @JsMethod(namespace="MSMediaKeys", name = "isTypeSupportedWithFeatures")
    public static native String isTypeSupportedWithFeatures(String keySystem, String type /* optional */);

    /*
        Properties
    */

    public String keySystem;

    @JsProperty( name = "keySystem")
    public native String getKeySystem();

    @JsProperty( name = "keySystem")
    public native void setKeySystem( String value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(createSession,543,,P(d1),P(d29))
      * TE Signature : S(createSession,P(d1),P(d29))
      * 
     */
    public native MSMediaKeySession createSession(String type, Uint8Array initData);
    /** 
      * Std Signature : S(createSession,543,,P(d1),P(d29),P(d29))
      * TE Signature : S(createSession,P(d1),P(d29),P(d29))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@511709
     */
    public native MSMediaKeySession createSession(String type, Uint8Array initData, Uint8Array cdmData /* optional */);
}

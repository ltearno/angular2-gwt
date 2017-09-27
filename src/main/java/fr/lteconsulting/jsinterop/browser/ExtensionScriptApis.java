package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: ExtensionScriptApis
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:373609
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:374161
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ExtensionScriptApis")
public class ExtensionScriptApis
{

    /*
        Constructors
    */
    public ExtensionScriptApis(){
    }

    /*
        Methods
    */
    /** 
      * Std Signature : S(extensionIdToShortId,2,,P(d1))
      * TE Signature : S(extensionIdToShortId,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@373647
     */
    public native Number extensionIdToShortId(String extensionId);
    /** 
      * Std Signature : S(fireExtensionApiTelemetry,289,,P(d1),P(d27),P(d27))
      * TE Signature : S(fireExtensionApiTelemetry,P(d1),P(d27),P(d27))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@373702
     */
    public native void fireExtensionApiTelemetry(String functionName, Boolean isSucceeded, Boolean isSupported);
    /** 
      * Std Signature : S(genericFunction,289,,P(d3))
      * TE Signature : S(genericFunction,P(d3))
      * 
     */
    public native void genericFunction(Object routerAddress);
    /** 
      * Std Signature : S(genericFunction,289,,P(d3),P(d1))
      * TE Signature : S(genericFunction,P(d3),P(d1))
      * 
     */
    public native void genericFunction(Object routerAddress, String parameters /* optional */);
    /** 
      * Std Signature : S(genericFunction,289,,P(d3),P(d1),P(d2))
      * TE Signature : S(genericFunction,P(d3),P(d1),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@373805
     */
    public native void genericFunction(Object routerAddress, String parameters /* optional */, Number callbackId /* optional */);
    /** 
      * Std Signature : S(genericSynchronousFunction,1,,P(d2))
      * TE Signature : S(genericSynchronousFunction,P(d2))
      * 
     */
    public native String genericSynchronousFunction(Number functionId);
    /** 
      * Std Signature : S(genericSynchronousFunction,1,,P(d2),P(d1))
      * TE Signature : S(genericSynchronousFunction,P(d2),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@373894
     */
    public native String genericSynchronousFunction(Number functionId, String parameters /* optional */);
    /** 
      * Std Signature : S(getExtensionId,1,,)
      * TE Signature : S(getExtensionId,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@373975
     */
    public native String getExtensionId();
    /** 
      * Std Signature : S(registerGenericFunctionCallbackHandler,289,,P(d3))
      * TE Signature : S(registerGenericFunctionCallbackHandler,P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@374005
     */
    public native void registerGenericFunctionCallbackHandler(Object callbackHandler);
    /** 
      * Std Signature : S(registerGenericPersistentCallbackHandler,289,,P(d3))
      * TE Signature : S(registerGenericPersistentCallbackHandler,P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@374077
     */
    public native void registerGenericPersistentCallbackHandler(Object callbackHandler);
}

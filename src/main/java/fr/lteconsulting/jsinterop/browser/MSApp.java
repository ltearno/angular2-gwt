package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MSApp
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:500542
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:501638
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSApp")
public class MSApp
{

    /*
        Static properties
    */

    @JsProperty(namespace="MSApp", name="CURRENT")
    public static String CURRENT;

    @JsProperty(namespace="MSApp", name="HIGH")
    public static String HIGH;

    @JsProperty(namespace="MSApp", name="IDLE")
    public static String IDLE;

    @JsProperty(namespace="MSApp", name="NORMAL")
    public static String NORMAL;

    /*
        Static methods
    */
    /** 
      * source : apis/browser-api/tsd/lib.es6.d.ts:500566
     */
    @JsMethod(namespace="MSApp", name = "clearTemporaryWebDataAsync")
    public static native MSAppAsyncOperation _clearTemporaryWebDataAsync();
    /** 
      * source : apis/browser-api/tsd/lib.es6.d.ts:500621
     */
    @JsMethod(namespace="MSApp", name = "createBlobFromRandomAccessStream")
    public static native Blob _createBlobFromRandomAccessStream(String type, Object seeker);
    /** 
      * source : apis/browser-api/tsd/lib.es6.d.ts:500692
     */
    @JsMethod(namespace="MSApp", name = "createDataPackage")
    public static native Object _createDataPackage(Object object);
    /** 
      * source : apis/browser-api/tsd/lib.es6.d.ts:500733
     */
    @JsMethod(namespace="MSApp", name = "createDataPackageFromSelection")
    public static native Object _createDataPackageFromSelection();
    /** 
      * source : apis/browser-api/tsd/lib.es6.d.ts:500776
     */
    @JsMethod(namespace="MSApp", name = "createFileFromStorageFile")
    public static native File _createFileFromStorageFile(Object storageFile);
    /** 
      * source : apis/browser-api/tsd/lib.es6.d.ts:500831
     */
    @JsMethod(namespace="MSApp", name = "createStreamFromInputStream")
    public static native MSStream _createStreamFromInputStream(String type, Object inputStream);
    /** 
      * source : apis/browser-api/tsd/lib.es6.d.ts:500906
     */
    @JsMethod(namespace="MSApp", name = "execAsyncAtPriority")
    public static native void _execAsyncAtPriority(MSExecAtPriorityFunctionCallback asynchronousCallback, String priority, Object... args);
    /** 
      * source : apis/browser-api/tsd/lib.es6.d.ts:501027
     */
    @JsMethod(namespace="MSApp", name = "execAtPriority")
    public static native Object _execAtPriority(MSExecAtPriorityFunctionCallback synchronousCallback, String priority, Object... args);
    /** 
      * source : apis/browser-api/tsd/lib.es6.d.ts:501141
     */
    @JsMethod(namespace="MSApp", name = "getCurrentPriority")
    public static native String _getCurrentPriority();
    /** 
      * source : apis/browser-api/tsd/lib.es6.d.ts:501175
     */
    @JsMethod(namespace="MSApp", name = "getHtmlPrintDocumentSourceAsync")
    public static native Promise<Object> _getHtmlPrintDocumentSourceAsync(Object htmlDoc);
    /** 
      * source : apis/browser-api/tsd/lib.es6.d.ts:501240
     */
    @JsMethod(namespace="MSApp", name = "getViewId")
    public static native Object _getViewId(Object view);
    /** 
      * source : apis/browser-api/tsd/lib.es6.d.ts:501271
     */
    @JsMethod(namespace="MSApp", name = "isTaskScheduledAtPriorityOrHigher")
    public static native Boolean _isTaskScheduledAtPriorityOrHigher(String priority);
    /** 
      * source : apis/browser-api/tsd/lib.es6.d.ts:501337
     */
    @JsMethod(namespace="MSApp", name = "pageHandlesAllApplicationActivations")
    public static native void _pageHandlesAllApplicationActivations(Boolean enabled);
    /** 
      * source : apis/browser-api/tsd/lib.es6.d.ts:501403
     */
    @JsMethod(namespace="MSApp", name = "suppressSubdownloadCredentialPrompts")
    public static native void _suppressSubdownloadCredentialPrompts(Boolean suppress);
    /** 
      * source : apis/browser-api/tsd/lib.es6.d.ts:501470
     */
    @JsMethod(namespace="MSApp", name = "terminateApp")
    public static native void _terminateApp(Object exceptionObject);

    /*
        Properties
    */

    /*
        Methods
    */
    /** 
      * Std Signature : S(clearTemporaryWebDataAsync,558,,)
      * TE Signature : S(clearTemporaryWebDataAsync,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@500566
     */
    public native MSAppAsyncOperation clearTemporaryWebDataAsync();
    /** 
      * Std Signature : S(createBlobFromRandomAccessStream,235,,P(d1),P(d3))
      * TE Signature : S(createBlobFromRandomAccessStream,P(d1),P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@500621
     */
    public native Blob createBlobFromRandomAccessStream(String type, Object seeker);
    /** 
      * Std Signature : S(createDataPackage,3,,P(d3))
      * TE Signature : S(createDataPackage,P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@500692
     */
    public native Object createDataPackage(Object object);
    /** 
      * Std Signature : S(createDataPackageFromSelection,3,,)
      * TE Signature : S(createDataPackageFromSelection,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@500733
     */
    public native Object createDataPackageFromSelection();
    /** 
      * Std Signature : S(createFileFromStorageFile,57,,P(d3))
      * TE Signature : S(createFileFromStorageFile,P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@500776
     */
    public native File createFileFromStorageFile(Object storageFile);
    /** 
      * Std Signature : S(createStreamFromInputStream,101,,P(d1),P(d3))
      * TE Signature : S(createStreamFromInputStream,P(d1),P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@500831
     */
    public native MSStream createStreamFromInputStream(String type, Object inputStream);
    /** 
      * Std Signature : S(execAsyncAtPriority,289,,P(dF--S(?,3,,P(D2))------)),P(d1))
      * TE Signature : S(execAsyncAtPriority,P(dF--S(?,P(D3))------)),P(d1))
      * 
     */
    public native void execAsyncAtPriority(MSExecAtPriorityFunctionCallback asynchronousCallback, String priority);
    /** 
      * Std Signature : S(execAsyncAtPriority,289,,P(dF--S(?,3,,P(D2))------)),P(d1),P(D3))
      * TE Signature : S(execAsyncAtPriority,P(dF--S(?,P(D3))------)),P(d1),P(D3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@500906
     */
    public native void execAsyncAtPriority(MSExecAtPriorityFunctionCallback asynchronousCallback, String priority, Object... args);
    /** 
      * Std Signature : S(execAtPriority,3,,P(dF--S(?,3,,P(D2))------)),P(d1))
      * TE Signature : S(execAtPriority,P(dF--S(?,P(D3))------)),P(d1))
      * 
     */
    public native Object execAtPriority(MSExecAtPriorityFunctionCallback synchronousCallback, String priority);
    /** 
      * Std Signature : S(execAtPriority,3,,P(dF--S(?,3,,P(D2))------)),P(d1),P(D3))
      * TE Signature : S(execAtPriority,P(dF--S(?,P(D3))------)),P(d1),P(D3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@501027
     */
    public native Object execAtPriority(MSExecAtPriorityFunctionCallback synchronousCallback, String priority, Object... args);
    /** 
      * Std Signature : S(getCurrentPriority,1,,)
      * TE Signature : S(getCurrentPriority,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@501141
     */
    public native String getCurrentPriority();
    /** 
      * Std Signature : S(getHtmlPrintDocumentSourceAsync,88<3>,,P(d3))
      * TE Signature : S(getHtmlPrintDocumentSourceAsync,P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@501175
     */
    public native Promise<Object> getHtmlPrintDocumentSourceAsync(Object htmlDoc);
    /** 
      * Std Signature : S(getViewId,3,,P(d3))
      * TE Signature : S(getViewId,P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@501240
     */
    public native Object getViewId(Object view);
    /** 
      * Std Signature : S(isTaskScheduledAtPriorityOrHigher,27,,P(d1))
      * TE Signature : S(isTaskScheduledAtPriorityOrHigher,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@501271
     */
    public native Boolean isTaskScheduledAtPriorityOrHigher(String priority);
    /** 
      * Std Signature : S(pageHandlesAllApplicationActivations,289,,P(d27))
      * TE Signature : S(pageHandlesAllApplicationActivations,P(d27))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@501337
     */
    public native void pageHandlesAllApplicationActivations(Boolean enabled);
    /** 
      * Std Signature : S(suppressSubdownloadCredentialPrompts,289,,P(d27))
      * TE Signature : S(suppressSubdownloadCredentialPrompts,P(d27))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@501403
     */
    public native void suppressSubdownloadCredentialPrompts(Boolean suppress);
    /** 
      * Std Signature : S(terminateApp,289,,P(d3))
      * TE Signature : S(terminateApp,P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@501470
     */
    public native void terminateApp(Object exceptionObject);
}

package fr.lteconsulting.jsinterop.ng.http;

import fr.lteconsulting.jsinterop.browser.ArrayBuffer;
import fr.lteconsulting.jsinterop.browser.ArrayBufferConstructor;
import fr.lteconsulting.jsinterop.browser.PropertyKey_UnionOfNumberAndString;
import fr.lteconsulting.jsinterop.ng.core.Version;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 

  * Wrapper class for all global definition of ng.http (java fr.lteconsulting.jsinterop.ng.http) package
 */
@JsType(isNative=true, namespace="ng", name="http")
public class GlobalScope_NgHttp
{

    /*
        Static properties
    */

    @JsProperty(namespace="ng.http", name="ArrayBuffer")
    public static ArrayBufferConstructor ArrayBuffer;

    @JsProperty(namespace="ng.http", name="VERSION")
    public static Version VERSION;

    /*
        Static methods
    */
    @JsMethod(namespace="ng.http", name = "_createDefaultCookieXSRFStrategy")
    public static native CookieXSRFStrategy _createDefaultCookieXSRFStrategy();
    @JsMethod(namespace="ng.http", name = "httpFactory")
    public static native Http httpFactory(XHRBackend xhrBackend, RequestOptions requestOptions);
    @JsMethod(namespace="ng.http", name = "jsonpFactory")
    public static native Jsonp jsonpFactory(JSONPBackend jsonpBackend, RequestOptions requestOptions);
    @JsMethod(namespace="ng.http", name = "normalizeMethodName")
    public static native RequestMethod normalizeMethodName(PropertyKey_UnionOfNumberAndString method);
    @JsMethod(namespace="ng.http", name = "isSuccess")
    public static native Boolean isSuccess(Number status);
    @JsMethod(namespace="ng.http", name = "getResponseURL")
    public static native String getResponseURL(Object xhr);
    @JsMethod(namespace="ng.http", name = "stringToArrayBuffer8")
    public static native ArrayBuffer stringToArrayBuffer8(String input);
    @JsMethod(namespace="ng.http", name = "stringToArrayBuffer")
    public static native ArrayBuffer stringToArrayBuffer(String input);
}

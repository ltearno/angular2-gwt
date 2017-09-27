package fr.lteconsulting.jsinterop.ng.common;

import fr.lteconsulting.jsinterop.Provider_UnionOfArrayOfObjectAndClassProviderAndExistingProviderAndFactoryProviderAndTypeProviderAndValueProvider;
import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.Document;
import fr.lteconsulting.jsinterop.browser.Error;
import fr.lteconsulting.jsinterop.browser.Promise;
import fr.lteconsulting.jsinterop.browser.PropertyKey_UnionOfNumberAndString;
import fr.lteconsulting.jsinterop.ng.core.InjectionToken;
import fr.lteconsulting.jsinterop.ng.core.Type;
import fr.lteconsulting.jsinterop.ng.core.Version;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 

  * Wrapper class for all global definition of ng.common (java fr.lteconsulting.jsinterop.ng.common) package
 */
@JsType(isNative=true, namespace="ng", name="common")
public class GlobalScope_NgCommon
{

    /*
        Static properties
    */

    @JsProperty(namespace="ng.common", name="LOCATION_INITIALIZED")
    public static InjectionToken<Promise<Object>> LOCATION_INITIALIZED;

    @JsProperty(namespace="ng.common", name="APP_BASE_HREF")
    public static InjectionToken<String> APP_BASE_HREF;

    @JsProperty(namespace="ng.common", name="COMMON_DIRECTIVES")
    public static Array<Provider_UnionOfArrayOfObjectAndClassProviderAndExistingProviderAndFactoryProviderAndTypeProviderAndValueProvider> COMMON_DIRECTIVES;

    @JsProperty(namespace="ng.common", name="COMMON_DEPRECATED_DIRECTIVES")
    public static Array<Provider_UnionOfArrayOfObjectAndClassProviderAndExistingProviderAndFactoryProviderAndTypeProviderAndValueProvider> COMMON_DEPRECATED_DIRECTIVES;

    @JsProperty(namespace="ng.common", name="DOCUMENT")
    public static InjectionToken<Document> DOCUMENT;

    @JsProperty(namespace="ng.common", name="COMMON_PIPES")
    public static Array<UnionOfAsyncPipeAndCurrencyPipeAndDatePipeAndDecimalPipeAndI18nPluralPipeAndI18nSelectPipeAndPercentPipeAndSlicePipe> COMMON_PIPES;

    @JsProperty(namespace="ng.common", name="VERSION")
    public static Version VERSION;

    /*
        Static methods
    */
    @JsMethod(namespace="ng.common", name = "getPluralCase")
    public static native Plural getPluralCase(String locale, PropertyKey_UnionOfNumberAndString nLike);
    @JsMethod(namespace="ng.common", name = "parseCookieValue")
    public static native String parseCookieValue(String cookieStr, String name);
    @JsMethod(namespace="ng.common", name = "getTypeNameForDebugging")
    public static native String getTypeNameForDebugging(Object type);
    @JsMethod(namespace="ng.common", name = "isNumeric")
    public static native Boolean isNumeric(Object value);
    @JsMethod(namespace="ng.common", name = "isPlatformBrowser")
    public static native Boolean isPlatformBrowser(Object platformId);
    @JsMethod(namespace="ng.common", name = "isPlatformServer")
    public static native Boolean isPlatformServer(Object platformId);
    @JsMethod(namespace="ng.common", name = "isPlatformWorkerApp")
    public static native Boolean isPlatformWorkerApp(Object platformId);
    @JsMethod(namespace="ng.common", name = "isPlatformWorkerUi")
    public static native Boolean isPlatformWorkerUi(Object platformId);
    @JsMethod(namespace="ng.common", name = "invalidPipeArgumentError")
    public static native Error invalidPipeArgumentError(Type<Object> type, Object value);
}

package fr.lteconsulting.jsinterop.ng.platformBrowser;

import fr.lteconsulting.jsinterop.Provider_UnionOfArrayOfObjectAndClassProviderAndExistingProviderAndFactoryProviderAndTypeProviderAndValueProvider;
import fr.lteconsulting.jsinterop.browser.AnonymousType817;
import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.Document;
import fr.lteconsulting.jsinterop.ng.core.ComponentRef;
import fr.lteconsulting.jsinterop.ng.core.DebugNode;
import fr.lteconsulting.jsinterop.ng.core.ErrorHandler;
import fr.lteconsulting.jsinterop.ng.core.InjectionToken;
import fr.lteconsulting.jsinterop.ng.core.Injector;
import fr.lteconsulting.jsinterop.ng.core.NgProbeToken;
import fr.lteconsulting.jsinterop.ng.core.PlatformRef;
import fr.lteconsulting.jsinterop.ng.core.Version;
import fr.lteconsulting.prebuilt.Action;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 

  * Wrapper class for all global definition of ng.platformBrowser (java fr.lteconsulting.jsinterop.ng.platformBrowser) package
 */
@JsType(isNative=true, namespace="ng", name="platformBrowser")
public class GlobalScope_NgPlatformBrowser
{

    /*
        Static properties
    */

    @JsProperty(namespace="ng.platformBrowser", name="INTERNAL_BROWSER_PLATFORM_PROVIDERS")
    public static Array<Provider_UnionOfArrayOfObjectAndClassProviderAndExistingProviderAndFactoryProviderAndTypeProviderAndValueProvider> INTERNAL_BROWSER_PLATFORM_PROVIDERS;

    @JsProperty(namespace="ng.platformBrowser", name="BROWSER_SANITIZATION_PROVIDERS")
    public static Array<Object> BROWSER_SANITIZATION_PROVIDERS;

    @JsProperty(namespace="ng.platformBrowser", name="ELEMENT_PROBE_PROVIDERS")
    public static Array<Provider_UnionOfArrayOfObjectAndClassProviderAndExistingProviderAndFactoryProviderAndTypeProviderAndValueProvider> ELEMENT_PROBE_PROVIDERS;

    @JsProperty(namespace="ng.platformBrowser", name="DOCUMENT")
    public static InjectionToken<Document> DOCUMENT;

    @JsProperty(namespace="ng.platformBrowser", name="EVENT_MANAGER_PLUGINS")
    public static InjectionToken<Array<EventManagerPlugin>> EVENT_MANAGER_PLUGINS;

    @JsProperty(namespace="ng.platformBrowser", name="HAMMER_GESTURE_CONFIG")
    public static InjectionToken<HammerGestureConfig> HAMMER_GESTURE_CONFIG;

    @JsProperty(namespace="ng.platformBrowser", name="TRANSITION_ID")
    public static InjectionToken<Object> TRANSITION_ID;

    @JsProperty(namespace="ng.platformBrowser", name="SERVER_TRANSITION_PROVIDERS")
    public static Array<Provider_UnionOfArrayOfObjectAndClassProviderAndExistingProviderAndFactoryProviderAndTypeProviderAndValueProvider> SERVER_TRANSITION_PROVIDERS;

    @JsProperty(namespace="ng.platformBrowser", name="NAMESPACE_URIS")
    public static AnonymousType817 NAMESPACE_URIS;

    @JsProperty(namespace="ng.platformBrowser", name="HOST_ATTR")
    public static String HOST_ATTR;

    @JsProperty(namespace="ng.platformBrowser", name="CONTENT_ATTR")
    public static String CONTENT_ATTR;

    @JsProperty(namespace="ng.platformBrowser", name="VERSION")
    public static Version VERSION;

    /*
        Static methods
    */
    @JsMethod(namespace="ng.platformBrowser", name = "platformBrowser")
    public static native PlatformRef platformBrowser(Array<Provider_UnionOfArrayOfObjectAndClassProviderAndExistingProviderAndFactoryProviderAndTypeProviderAndValueProvider> extraProviders /* optional */);
    @JsMethod(namespace="ng.platformBrowser", name = "initDomAdapter")
    public static native void initDomAdapter();
    @JsMethod(namespace="ng.platformBrowser", name = "errorHandler")
    public static native ErrorHandler errorHandler();
    @JsMethod(namespace="ng.platformBrowser", name = "_document")
    public static native Object _document();
    @JsMethod(namespace="ng.platformBrowser", name = "enableDebugTools")
    public static native <T> ComponentRef<T> enableDebugTools(ComponentRef<T> ref);
    @JsMethod(namespace="ng.platformBrowser", name = "disableDebugTools")
    public static native void disableDebugTools();
    @JsMethod(namespace="ng.platformBrowser", name = "inspectNativeElement")
    public static native DebugNode inspectNativeElement(Object element);
    @JsMethod(namespace="ng.platformBrowser", name = "_createNgProbe")
    public static native Object _createNgProbe(Array<NgProbeToken> extraTokens, Array<NgProbeToken> coreTokens);
    @JsMethod(namespace="ng.platformBrowser", name = "getDOM")
    public static native DomAdapter getDOM();
    @JsMethod(namespace="ng.platformBrowser", name = "setDOM")
    public static native void setDOM(DomAdapter adapter);
    @JsMethod(namespace="ng.platformBrowser", name = "setRootDomAdapter")
    public static native void setRootDomAdapter(DomAdapter adapter);
    @JsMethod(namespace="ng.platformBrowser", name = "appInitializerFactory")
    public static native Action appInitializerFactory(String transitionId, Object document, Injector injector);
    @JsMethod(namespace="ng.platformBrowser", name = "shimContentAttribute")
    public static native String shimContentAttribute(String componentShortId);
    @JsMethod(namespace="ng.platformBrowser", name = "shimHostAttribute")
    public static native String shimHostAttribute(String componentShortId);
    @JsMethod(namespace="ng.platformBrowser", name = "flattenStyles")
    public static native Array<String> flattenStyles(String compId, Array<Object> styles, Array<String> target);
    @JsMethod(namespace="ng.platformBrowser", name = "supportsState")
    public static native Boolean supportsState();
    @JsMethod(namespace="ng.platformBrowser", name = "camelCaseToDashCase")
    public static native String camelCaseToDashCase(String input);
    @JsMethod(namespace="ng.platformBrowser", name = "dashCaseToCamelCase")
    public static native String dashCaseToCamelCase(String input);
    @JsMethod(namespace="ng.platformBrowser", name = "exportNgVar")
    public static native void exportNgVar(String name, Object value);
    @JsMethod(namespace="ng.platformBrowser", name = "sanitizeHtml")
    public static native String sanitizeHtml(Object defaultDoc, String unsafeHtmlInput);
    @JsMethod(namespace="ng.platformBrowser", name = "sanitizeStyle")
    public static native String sanitizeStyle(String value);
    @JsMethod(namespace="ng.platformBrowser", name = "sanitizeUrl")
    public static native String sanitizeUrl(String url);
    @JsMethod(namespace="ng.platformBrowser", name = "sanitizeSrcset")
    public static native String sanitizeSrcset(String srcset);
}

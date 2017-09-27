package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: Navigator
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:530269
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:531441
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Navigator")
public class Navigator implements NavigatorID, NavigatorOnLine, NavigatorContentUtils, NavigatorStorageUtils, NavigatorGeolocation, MSNavigatorDoNotTrack, MSFileSaver, NavigatorBeacon, NavigatorConcurrentHardware, NavigatorUserMedia
{

    /*
        Constructors
    */
    public Navigator(){
    }

    /*
        Properties
    */

    public String appCodeName;

    @JsProperty( name = "appCodeName")
    public native String getAppCodeName();

    @JsProperty( name = "appCodeName")
    public native void setAppCodeName( String value );

    public String appName;

    @JsProperty( name = "appName")
    public native String getAppName();

    @JsProperty( name = "appName")
    public native void setAppName( String value );

    public String appVersion;

    @JsProperty( name = "appVersion")
    public native String getAppVersion();

    @JsProperty( name = "appVersion")
    public native void setAppVersion( String value );

    public WebAuthentication authentication;

    @JsProperty( name = "authentication")
    public native WebAuthentication getAuthentication();

    @JsProperty( name = "authentication")
    public native void setAuthentication( WebAuthentication value );

    public Boolean cookieEnabled;

    @JsProperty( name = "cookieEnabled")
    public native Boolean getCookieEnabled();

    @JsProperty( name = "cookieEnabled")
    public native void setCookieEnabled( Boolean value );

    public String gamepadInputEmulation;

    @JsProperty( name = "gamepadInputEmulation")
    public native String getGamepadInputEmulation();

    @JsProperty( name = "gamepadInputEmulation")
    public native void setGamepadInputEmulation( String value );

    public Geolocation geolocation;

    @JsProperty( name = "geolocation")
    public native Geolocation getGeolocation();

    @JsProperty( name = "geolocation")
    public native void setGeolocation( Geolocation value );

    public Number hardwareConcurrency;

    @JsProperty( name = "hardwareConcurrency")
    public native Number getHardwareConcurrency();

    @JsProperty( name = "hardwareConcurrency")
    public native void setHardwareConcurrency( Number value );

    public String language;

    @JsProperty( name = "language")
    public native String getLanguage();

    @JsProperty( name = "language")
    public native void setLanguage( String value );

    public Number maxTouchPoints;

    @JsProperty( name = "maxTouchPoints")
    public native Number getMaxTouchPoints();

    @JsProperty( name = "maxTouchPoints")
    public native void setMaxTouchPoints( Number value );

    public MediaDevices mediaDevices;

    @JsProperty( name = "mediaDevices")
    public native MediaDevices getMediaDevices();

    @JsProperty( name = "mediaDevices")
    public native void setMediaDevices( MediaDevices value );

    public MimeTypeArray mimeTypes;

    @JsProperty( name = "mimeTypes")
    public native MimeTypeArray getMimeTypes();

    @JsProperty( name = "mimeTypes")
    public native void setMimeTypes( MimeTypeArray value );

    public Boolean msManipulationViewsEnabled;

    @JsProperty( name = "msManipulationViewsEnabled")
    public native Boolean getMsManipulationViewsEnabled();

    @JsProperty( name = "msManipulationViewsEnabled")
    public native void setMsManipulationViewsEnabled( Boolean value );

    public Number msMaxTouchPoints;

    @JsProperty( name = "msMaxTouchPoints")
    public native Number getMsMaxTouchPoints();

    @JsProperty( name = "msMaxTouchPoints")
    public native void setMsMaxTouchPoints( Number value );

    public Boolean msPointerEnabled;

    @JsProperty( name = "msPointerEnabled")
    public native Boolean getMsPointerEnabled();

    @JsProperty( name = "msPointerEnabled")
    public native void setMsPointerEnabled( Boolean value );

    public Boolean onLine;

    @JsProperty( name = "onLine")
    public native Boolean getOnLine();

    @JsProperty( name = "onLine")
    public native void setOnLine( Boolean value );

    public String platform;

    @JsProperty( name = "platform")
    public native String getPlatform();

    @JsProperty( name = "platform")
    public native void setPlatform( String value );

    public PluginArray plugins;

    @JsProperty( name = "plugins")
    public native PluginArray getPlugins();

    @JsProperty( name = "plugins")
    public native void setPlugins( PluginArray value );

    public Boolean pointerEnabled;

    @JsProperty( name = "pointerEnabled")
    public native Boolean getPointerEnabled();

    @JsProperty( name = "pointerEnabled")
    public native void setPointerEnabled( Boolean value );

    public String product;

    @JsProperty( name = "product")
    public native String getProduct();

    @JsProperty( name = "product")
    public native void setProduct( String value );

    public String productSub;

    @JsProperty( name = "productSub")
    public native String getProductSub();

    @JsProperty( name = "productSub")
    public native void setProductSub( String value );

    public ServiceWorkerContainer serviceWorker;

    @JsProperty( name = "serviceWorker")
    public native ServiceWorkerContainer getServiceWorker();

    @JsProperty( name = "serviceWorker")
    public native void setServiceWorker( ServiceWorkerContainer value );

    public String userAgent;

    @JsProperty( name = "userAgent")
    public native String getUserAgent();

    @JsProperty( name = "userAgent")
    public native void setUserAgent( String value );

    public String vendor;

    @JsProperty( name = "vendor")
    public native String getVendor();

    @JsProperty( name = "vendor")
    public native void setVendor( String value );

    public String vendorSub;

    @JsProperty( name = "vendorSub")
    public native String getVendorSub();

    @JsProperty( name = "vendorSub")
    public native void setVendorSub( String value );

    public Boolean webdriver;

    @JsProperty( name = "webdriver")
    public native Boolean getWebdriver();

    @JsProperty( name = "webdriver")
    public native void setWebdriver( Boolean value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(confirmSiteSpecificTrackingException,27,,P(d152))
      * TE Signature : S(confirmSiteSpecificTrackingException,P(d152))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Boolean confirmSiteSpecificTrackingException(ConfirmSiteSpecificExceptionsInformation args);
    /** 
      * Std Signature : S(confirmWebWideTrackingException,27,,P(d153))
      * TE Signature : S(confirmWebWideTrackingException,P(d153))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Boolean confirmWebWideTrackingException(ExceptionInformation args);
    /** 
      * Std Signature : S(getGamepads,7<402>,,)
      * TE Signature : S(getGamepads,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@531068
     */
    public native Array<Gamepad> getGamepads();
    /** 
      * Std Signature : S(getUserMedia,289,,P(d156),P(dF--S(?,289,,P(d79))------)),P(dF--S(?,289,,P(d157))------)))
      * TE Signature : S(getUserMedia,P(d156),P(dF--S(?,P(d79))------)),P(dF--S(?,P(d157))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void getUserMedia(MediaStreamConstraints constraints, NavigatorUserMediaSuccessCallback successCallback, NavigatorUserMediaErrorCallback errorCallback);
    /** 
      * Std Signature : S(javaEnabled,27,,)
      * TE Signature : S(javaEnabled,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@531098
     */
    public native Boolean javaEnabled();
    /** 
      * Std Signature : S(msLaunchUri,289,,P(d1))
      * TE Signature : S(msLaunchUri,P(d1))
      * 
     */
    public native void msLaunchUri(String uri);
    /** 
      * Std Signature : S(msLaunchUri,289,,P(d1),P(dF--S(?,289,,)------)))
      * TE Signature : S(msLaunchUri,P(d1),P(dF--S(?,)------)))
      * 
     */
    public native void msLaunchUri(String uri, MSLaunchUriCallback successCallback /* optional */);
    /** 
      * Std Signature : S(msLaunchUri,289,,P(d1),P(dF--S(?,289,,)------)),P(dF--S(?,289,,)------)))
      * TE Signature : S(msLaunchUri,P(d1),P(dF--S(?,)------)),P(dF--S(?,)------)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@531126
     */
    public native void msLaunchUri(String uri, MSLaunchUriCallback successCallback /* optional */, MSLaunchUriCallback noHandlerCallback /* optional */);
    /** 
      * Std Signature : S(msSaveBlob,27,,P(d3))
      * TE Signature : S(msSaveBlob,P(d3))
      * 
     */
    public native Boolean msSaveBlob(Object blob);
    /** 
      * Std Signature : S(msSaveBlob,27,,P(d3),P(d1))
      * TE Signature : S(msSaveBlob,P(d3),P(d1))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Boolean msSaveBlob(Object blob, String defaultName /* optional */);
    /** 
      * Std Signature : S(msSaveOrOpenBlob,27,,P(d3))
      * TE Signature : S(msSaveOrOpenBlob,P(d3))
      * 
     */
    public native Boolean msSaveOrOpenBlob(Object blob);
    /** 
      * Std Signature : S(msSaveOrOpenBlob,27,,P(d3),P(d1))
      * TE Signature : S(msSaveOrOpenBlob,P(d3),P(d1))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Boolean msSaveOrOpenBlob(Object blob, String defaultName /* optional */);
    /** 
      * Std Signature : S(removeSiteSpecificTrackingException,289,,P(d153))
      * TE Signature : S(removeSiteSpecificTrackingException,P(d153))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void removeSiteSpecificTrackingException(ExceptionInformation args);
    /** 
      * Std Signature : S(removeWebWideTrackingException,289,,P(d153))
      * TE Signature : S(removeWebWideTrackingException,P(d153))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void removeWebWideTrackingException(ExceptionInformation args);
    /** 
      * Std Signature : S(requestMediaKeySystemAccess,88<478>,,P(d1),P(d7<479>))
      * TE Signature : S(requestMediaKeySystemAccess,P(d1),P(d7))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@531242
     */
    public native Promise<MediaKeySystemAccess> requestMediaKeySystemAccess(String keySystem, Array<MediaKeySystemConfiguration> supportedConfigurations);
    /** 
      * Std Signature : S(sendBeacon,27,,P(d1))
      * TE Signature : S(sendBeacon,P(d1))
      * 
     */
    public native Boolean sendBeacon(String url);
    /** 
      * Std Signature : S(sendBeacon,27,,P(d1),P(d3))
      * TE Signature : S(sendBeacon,P(d1),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Boolean sendBeacon(String url, Object data /* optional */);
    /** 
      * Std Signature : S(storeSiteSpecificTrackingException,289,,P(d154))
      * TE Signature : S(storeSiteSpecificTrackingException,P(d154))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void storeSiteSpecificTrackingException(StoreSiteSpecificExceptionsInformation args);
    /** 
      * Std Signature : S(storeWebWideTrackingException,289,,P(d155))
      * TE Signature : S(storeWebWideTrackingException,P(d155))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void storeWebWideTrackingException(StoreExceptionsInformation args);
    /** 
      * Std Signature : S(vibrate,27,,P(d2))
      * TE Signature : S(vibrate,P(d2))
      * 
     */
    public native Boolean vibrate(Number pattern);
    /** 
      * Std Signature : S(vibrate,27,,P(d7<2>))
      * TE Signature : S(vibrate,P(d7))
      * 
     */
    public native Boolean vibrate(Array<Number> pattern);
    /** 
      * Std Signature : S(vibrate,27,,P(dU(-7<2>,4)))
      * TE Signature : S(vibrate,P(dU(-7,2)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@531381
     */
    public native Boolean vibrate(UnionOfArrayOfNumberAndNumber pattern);
}

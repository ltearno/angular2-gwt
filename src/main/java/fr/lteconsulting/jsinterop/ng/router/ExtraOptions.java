package fr.lteconsulting.jsinterop.ng.router;

import fr.lteconsulting.jsinterop.browser.UnionOfBooleanAndString;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router_module".ExtraOptions
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router_module.d.ts:5656
  * 
 */
@JsType(isNative=true, namespace="ng.router", name="ExtraOptions")
public class ExtraOptions
{

    /*
        Properties
    */

    /** 
      * Makes the router log all its internal events to the console.
     */
    public Boolean enableTracing;

    @JsProperty( name = "enableTracing")
    public native Boolean getEnableTracing();

    @JsProperty( name = "enableTracing")
    public native void setEnableTracing( Boolean value );

    /** 
      * Disables the initial navigation.
     */
    public UnionOfBooleanAndString initialNavigation;

    @JsProperty( name = "initialNavigation")
    public native UnionOfBooleanAndString getInitialNavigation();

    @JsProperty( name = "initialNavigation")
    public native void setInitialNavigation( UnionOfBooleanAndString value );

    @JsOverlay
    public final void setInitialNavigation( Boolean value ) { setInitialNavigation(UnionOfBooleanAndString.ofBoolean( value )); }

    @JsOverlay
    public final void setInitialNavigation( String value ) { setInitialNavigation(UnionOfBooleanAndString.ofString( value )); }

    /** 
      * Configures a preloading strategy. See {@link PreloadAllModules}.
     */
    public Object preloadingStrategy;

    @JsProperty( name = "preloadingStrategy")
    public native Object getPreloadingStrategy();

    @JsProperty( name = "preloadingStrategy")
    public native void setPreloadingStrategy( Object value );

    /** 
      * Enables the location strategy that uses the URL fragment instead of the history API.
     */
    public Boolean useHash;

    @JsProperty( name = "useHash")
    public native Boolean getUseHash();

    @JsProperty( name = "useHash")
    public native void setUseHash( Boolean value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(errorHandler,3,,P(d3))
      * TE Signature : S(errorHandler,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router.d.ts@3866
      * A custom error handler.
     */
    public native Object errorHandler(Object error);
}

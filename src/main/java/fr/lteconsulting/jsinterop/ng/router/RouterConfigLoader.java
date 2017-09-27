package fr.lteconsulting.jsinterop.ng.router;

import fr.lteconsulting.jsinterop.ng.core.Compiler;
import fr.lteconsulting.jsinterop.ng.core.Injector;
import fr.lteconsulting.jsinterop.ng.core.NgModuleFactoryLoader;
import fr.lteconsulting.jsinterop.rxjs.Observable;
import fr.lteconsulting.prebuilt.Action1;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router_config_loader".RouterConfigLoader
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router_config_loader.d.ts:494
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.router", name="RouterConfigLoader")
public class RouterConfigLoader
{

    /*
        Constructors
    */
    public RouterConfigLoader(NgModuleFactoryLoader loader, Compiler compiler, Action1<Route> onLoadStartListener, Action1<Route> onLoadEndListener){
    }

    /*
        Properties
    */

    public Object compiler;

    @JsProperty( name = "compiler")
    public native Object getCompiler();

    @JsProperty( name = "compiler")
    public native void setCompiler( Object value );

    public Object loader;

    @JsProperty( name = "loader")
    public native Object getLoader();

    @JsProperty( name = "loader")
    public native void setLoader( Object value );

    public Object onLoadEndListener;

    @JsProperty( name = "onLoadEndListener")
    public native Object getOnLoadEndListener();

    @JsProperty( name = "onLoadEndListener")
    public native void setOnLoadEndListener( Object value );

    public Object onLoadStartListener;

    @JsProperty( name = "onLoadStartListener")
    public native Object getOnLoadStartListener();

    @JsProperty( name = "onLoadStartListener")
    public native void setOnLoadStartListener( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(load,357<1254>,,P(d335),P(d677))
      * TE Signature : S(load,P(d335),P(d677))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router_config_loader.d.ts@797
     */
    public native Observable<LoadedRouterConfig> load(Injector parentInjector, Route route);
    /** 
      * Std Signature : S(loadModuleFactory,3,,P(d3))
      * TE Signature : S(loadModuleFactory,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router_config_loader.d.ts@879
     */
    public native Object loadModuleFactory(Object loadChildren);
}

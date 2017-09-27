package fr.lteconsulting.jsinterop.ng.platformBrowserDynamic;

import fr.lteconsulting.jsinterop.ng.compiler.ResourceLoader;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/platform-browser-dynamic/src/resource_loader/resource_loader_cache".CachedResourceLoader
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/platform-browser-dynamic/src/resource_loader/resource_loader_cache.d.ts:254
  * 1 constructors
  * An implementation of ResourceLoader that uses a template cache to avoid doing an actual
  * ResourceLoader.
  * 
  * The template cache needs to be built and loaded into window.$templateCache
  * via a separate mechanism.
 */
@JsType(isNative=true, namespace="ng.platformBrowserDynamic", name="CachedResourceLoader")
public class CachedResourceLoader extends ResourceLoader
{

    /*
        Constructors
    */
    public CachedResourceLoader(){
    }

    /*
        Properties
    */

    public Object _cache;

    @JsProperty( name = "_cache")
    public native Object get_cache();

    @JsProperty( name = "_cache")
    public native void set_cache( Object value );
}

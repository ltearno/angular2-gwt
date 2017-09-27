package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/di/reflective_provider".ResolvedReflectiveProvider_
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/di/reflective_provider.d.ts:1526
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.core", name="ResolvedReflectiveProvider_")
public class ResolvedReflectiveProvider_ extends ResolvedReflectiveProvider
{

    /*
        Constructors
    */
    public ResolvedReflectiveProvider_(ReflectiveKey key, Array<ResolvedReflectiveFactory> resolvedFactories, Boolean multiProvider){
    }

    /*
        Properties
    */

    public ResolvedReflectiveFactory resolvedFactory;

    @JsProperty( name = "resolvedFactory")
    public native ResolvedReflectiveFactory getResolvedFactory();

    @JsProperty( name = "resolvedFactory")
    public native void setResolvedFactory( ResolvedReflectiveFactory value );
}

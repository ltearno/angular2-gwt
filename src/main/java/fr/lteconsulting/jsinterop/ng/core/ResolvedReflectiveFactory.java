package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.Function;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/di/reflective_provider".ResolvedReflectiveFactory
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/di/reflective_provider.d.ts:1887
  * 1 constructors
  * An internal resolved representation of a factory function created by resolving {@link
  * Provider}.
 */
@JsType(isNative=true, namespace="ng.core", name="ResolvedReflectiveFactory")
public class ResolvedReflectiveFactory
{

    /*
        Constructors
    */
    public ResolvedReflectiveFactory(Function factory, Array<ReflectiveDependency> dependencies){
    }

    /*
        Properties
    */

    /** 
      * Arguments (dependencies) to the `factory` function.
     */
    public Array<ReflectiveDependency> dependencies;

    @JsProperty( name = "dependencies")
    public native Array<ReflectiveDependency> getDependencies();

    @JsProperty( name = "dependencies")
    public native void setDependencies( Array<ReflectiveDependency> value );

    /** 
      * Factory function which can return an instance of an object represented by a key.
     */
    public Function factory;

    @JsProperty( name = "factory")
    public native Function getFactory();

    @JsProperty( name = "factory")
    public native void setFactory( Function value );
}

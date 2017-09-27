package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/di/reflective_provider".ReflectiveDependency
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/di/reflective_provider.d.ts:133
  * 1 constructors
  * `Dependency` is used by the framework to extend DI.
  * This is internal to Angular and should not be used directly.
 */
@JsType(isNative=true, namespace="ng.core", name="ReflectiveDependency")
public class ReflectiveDependency
{

    /*
        Constructors
    */
    public ReflectiveDependency(ReflectiveKey key, Boolean optional, UnionOfSelfAndSkipSelf visibility){
    }

    /*
        Static methods
    */
    /** 
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/di/reflective_provider.d.ts:488
     */
    @JsMethod(namespace="ng.core.ReflectiveDependency", name = "fromKey")
    public static native ReflectiveDependency fromKey(ReflectiveKey key);

    /*
        Properties
    */

    public ReflectiveKey key;

    @JsProperty( name = "key")
    public native ReflectiveKey getKey();

    @JsProperty( name = "key")
    public native void setKey( ReflectiveKey value );

    public Boolean optional;

    @JsProperty( name = "optional")
    public native Boolean getOptional();

    @JsProperty( name = "optional")
    public native void setOptional( Boolean value );

    public UnionOfSelfAndSkipSelf visibility;

    @JsProperty( name = "visibility")
    public native UnionOfSelfAndSkipSelf getVisibility();

    @JsProperty( name = "visibility")
    public native void setVisibility( UnionOfSelfAndSkipSelf value );

    @JsOverlay
    public final void setVisibility( Self value ) { setVisibility(UnionOfSelfAndSkipSelf.ofSelf( value )); }

    @JsOverlay
    public final void setVisibility( SkipSelf value ) { setVisibility(UnionOfSelfAndSkipSelf.ofSkipSelf( value )); }
}

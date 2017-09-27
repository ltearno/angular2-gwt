package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.browser.AnonymousType1059;
import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.Function;
import fr.lteconsulting.prebuilt.Action2;
import fr.lteconsulting.prebuilt.Function1;
import fr.lteconsulting.prebuilt.Function2;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/reflection/reflector".Reflector
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/reflection/reflector.d.ts:516
  * 1 constructors
  * Provides access to reflection data about symbols. Used internally by Angular
  * to power dependency injection and compilation.
 */
@JsType(isNative=true, namespace="ng.core", name="Reflector")
public class Reflector
{

    /*
        Constructors
    */
    public Reflector(PlatformReflectionCapabilities reflectionCapabilities){
    }

    /*
        Properties
    */

    public PlatformReflectionCapabilities reflectionCapabilities;

    @JsProperty( name = "reflectionCapabilities")
    public native PlatformReflectionCapabilities getReflectionCapabilities();

    @JsProperty( name = "reflectionCapabilities")
    public native void setReflectionCapabilities( PlatformReflectionCapabilities value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(annotations,7<3>,,P(d329<3>))
      * TE Signature : S(annotations,P(d329))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/reflection/reflector.d.ts@981
     */
    public native Array<Object> annotations(Type<Object> typeOrFunc);
    /** 
      * Std Signature : S(factory,205,,P(d329<3>))
      * TE Signature : S(factory,P(d329))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/reflection/reflector.d.ts@893
     */
    public native Function factory(Type<Object> type);
    /** 
      * Std Signature : S(getter,FP1-,R--S(?,4,,P(d3))------)<3,5>,,P(d1))
      * TE Signature : S(getter,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/reflection/reflector.d.ts@1170
     */
    public native Function1<Object, Object> getter(String name);
    /** 
      * Std Signature : S(hasLifecycleHook,27,,P(d3),P(d1))
      * TE Signature : S(hasLifecycleHook,P(d3),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/reflection/reflector.d.ts@1108
     */
    public native Boolean hasLifecycleHook(Object type, String lcProperty);
    /** 
      * Std Signature : S(importUri,1,,P(d3))
      * TE Signature : S(importUri,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/reflection/reflector.d.ts@1278
     */
    public native String importUri(Object type);
    /** 
      * Std Signature : S(method,FP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<3,7<6>,6>,,P(d1))
      * TE Signature : S(method,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/reflection/reflector.d.ts@1242
     */
    public native Function2<Object, Array<Object>, Object> method(String name);
    /** 
      * Std Signature : S(parameters,7<2<3>>,,P(d329<3>))
      * TE Signature : S(parameters,P(d329))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/reflection/reflector.d.ts@933
     */
    public native Array<Array<Object>> parameters(Type<Object> typeOrFunc);
    /** 
      * Std Signature : S(propMetadata,C(----7<3>----),,P(d329<3>))
      * TE Signature : S(propMetadata,P(d329))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/reflection/reflector.d.ts@1028
     */
    public native AnonymousType1059 propMetadata(Type<Object> typeOrFunc);
    /** 
      * Std Signature : S(resolveEnum,3,,P(d3),P(d1))
      * TE Signature : S(resolveEnum,P(d3),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/reflection/reflector.d.ts@1442
     */
    public native Object resolveEnum(Object identifier, String name);
    /** 
      * Std Signature : S(resolveIdentifier,3,,P(d1),P(d1),P(d7<1>),P(d3))
      * TE Signature : S(resolveIdentifier,P(d1),P(d1),P(d7),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/reflection/reflector.d.ts@1348
     */
    public native Object resolveIdentifier(String name, String moduleUrl, Array<String> members, Object runtime);
    /** 
      * Std Signature : S(resourceUri,1,,P(d3))
      * TE Signature : S(resourceUri,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/reflection/reflector.d.ts@1312
     */
    public native String resourceUri(Object type);
    /** 
      * Std Signature : S(setter,FP1-,P2--S(?,429,,P(d3),P(d4))------)<3,6>,,P(d1))
      * TE Signature : S(setter,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/reflection/reflector.d.ts@1206
     */
    public native Action2<Object, Object> setter(String name);
    /** 
      * Std Signature : S(updateCapabilities,429,,P(d625))
      * TE Signature : S(updateCapabilities,P(d625))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/reflection/reflector.d.ts@825
     */
    public native void updateCapabilities(PlatformReflectionCapabilities caps);
}

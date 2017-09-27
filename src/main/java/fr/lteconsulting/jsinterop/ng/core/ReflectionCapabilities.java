package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.browser.AnonymousType1059;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/reflection/reflection_capabilities".ReflectionCapabilities
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/reflection/reflection_capabilities.d.ts:494
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.core", name="ReflectionCapabilities")
public class ReflectionCapabilities extends PlatformReflectionCapabilities
{

    /*
        Constructors
    */
    public ReflectionCapabilities(Object reflect){
    }

    /*
        Properties
    */

    public Object _reflect;

    @JsProperty( name = "_reflect")
    public native Object get_reflect();

    @JsProperty( name = "_reflect")
    public native void set_reflect( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(_ownAnnotations,3,,P(d3),P(d3))
      * TE Signature : S(_ownAnnotations,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/reflection/reflection_capabilities.d.ts@813
     */
    public native Object _ownAnnotations(Object typeOrFunc, Object parentCtor);
    /** 
      * Std Signature : S(_ownParameters,3,,P(d3),P(d3))
      * TE Signature : S(_ownParameters,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/reflection/reflection_capabilities.d.ts@725
     */
    public native Object _ownParameters(Object type, Object parentCtor);
    /** 
      * Std Signature : S(_ownPropMetadata,3,,P(d3),P(d3))
      * TE Signature : S(_ownPropMetadata,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/reflection/reflection_capabilities.d.ts@913
     */
    public native Object _ownPropMetadata(Object typeOrFunc, Object parentCtor);
    /** 
      * Std Signature : S(importUri,1,,P(d3))
      * TE Signature : S(importUri,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/reflection/reflection_capabilities.d.ts@1211
     */
    public native String importUri(Object type);
    /** 
      * Std Signature : S(propMetadata,C(----7<3>----),,P(d3))
      * TE Signature : S(propMetadata,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/reflection/reflection_capabilities.d.ts@967
     */
    public native AnonymousType1059 propMetadata(Object typeOrFunc);
    /** 
      * Std Signature : S(resourceUri,1,,P(d3))
      * TE Signature : S(resourceUri,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/reflection/reflection_capabilities.d.ts@1245
     */
    public native String resourceUri(Object type);
}

package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.browser.AnonymousType1059;
import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.ng.compiler.output.ExternalReference;
import fr.lteconsulting.jsinterop.ng.core.Component;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_reflector".CompileReflector
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_reflector.d.ts:287

  * Provides access to reflection data about symbols that the compiler needs.
 */
@JsType(isNative=true, namespace="ng.compiler", name="CompileReflector")
public class CompileReflector
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(annotations,7<3>,,P(d3))
      * TE Signature : S(annotations,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_reflector.d.ts@477
     */
    public native Array<Object> annotations(Object typeOrFunc);
    /** 
      * Std Signature : S(componentModuleUrl,1,,P(d3),P(d344))
      * TE Signature : S(componentModuleUrl,P(d3),P(d344))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_reflector.d.ts@681
     */
    public native String componentModuleUrl(Object type, Component cmpMetadata);
    /** 
      * Std Signature : S(hasLifecycleHook,27,,P(d3),P(d1))
      * TE Signature : S(hasLifecycleHook,P(d3),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_reflector.d.ts@610
     */
    public native Boolean hasLifecycleHook(Object type, String lcProperty);
    /** 
      * Std Signature : S(parameters,7<2<3>>,,P(d3))
      * TE Signature : S(parameters,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_reflector.d.ts@426
     */
    public native Array<Array<Object>> parameters(Object typeOrFunc);
    /** 
      * Std Signature : S(propMetadata,C(----7<3>----),,P(d3))
      * TE Signature : S(propMetadata,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_reflector.d.ts@527
     */
    public native AnonymousType1059 propMetadata(Object typeOrFunc);
    /** 
      * Std Signature : S(resolveExternalReference,3,,P(d470))
      * TE Signature : S(resolveExternalReference,P(d470))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_reflector.d.ts@757
     */
    public native Object resolveExternalReference(ExternalReference ref);
}

package fr.lteconsulting.jsinterop.ng.compiler.aot;

import fr.lteconsulting.jsinterop.browser.AnonymousType1059;
import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.ng.compiler.CompileReflector;
import fr.lteconsulting.jsinterop.ng.compiler.SummaryResolver;
import fr.lteconsulting.prebuilt.Action2;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/static_reflector".StaticReflector
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/static_reflector.d.ts:267
  * 1 constructors
  * A static reflector implements enough of the Reflector API that is necessary to compile
  * templates statically.
 */
@JsType(isNative=true, namespace="ng.compiler.aot", name="StaticReflector")
public class StaticReflector extends CompileReflector
{

    /*
        Constructors
    */
    public StaticReflector(SummaryResolver<StaticSymbol> summaryResolver, StaticSymbolResolver symbolResolver, Array<Object> knownMetadataClasses, Array<Object> knownMetadataFunctions, Action2<Object, String> errorRecorder){
    }

    /*
        Properties
    */

    public Object ANALYZE_FOR_ENTRY_COMPONENTS;

    @JsProperty( name = "ANALYZE_FOR_ENTRY_COMPONENTS")
    public native Object getANALYZE_FOR_ENTRY_COMPONENTS();

    @JsProperty( name = "ANALYZE_FOR_ENTRY_COMPONENTS")
    public native void setANALYZE_FOR_ENTRY_COMPONENTS( Object value );

    public Object ROUTES;

    @JsProperty( name = "ROUTES")
    public native Object getROUTES();

    @JsProperty( name = "ROUTES")
    public native void setROUTES( Object value );

    public Object annotationCache;

    @JsProperty( name = "annotationCache")
    public native Object getAnnotationCache();

    @JsProperty( name = "annotationCache")
    public native void setAnnotationCache( Object value );

    public Object annotationForParentClassWithSummaryKind;

    @JsProperty( name = "annotationForParentClassWithSummaryKind")
    public native Object getAnnotationForParentClassWithSummaryKind();

    @JsProperty( name = "annotationForParentClassWithSummaryKind")
    public native void setAnnotationForParentClassWithSummaryKind( Object value );

    public Object annotationNames;

    @JsProperty( name = "annotationNames")
    public native Object getAnnotationNames();

    @JsProperty( name = "annotationNames")
    public native void setAnnotationNames( Object value );

    public Object conversionMap;

    @JsProperty( name = "conversionMap")
    public native Object getConversionMap();

    @JsProperty( name = "conversionMap")
    public native void setConversionMap( Object value );

    public Object errorRecorder;

    @JsProperty( name = "errorRecorder")
    public native Object getErrorRecorder();

    @JsProperty( name = "errorRecorder")
    public native void setErrorRecorder( Object value );

    public Object injectionToken;

    @JsProperty( name = "injectionToken")
    public native Object getInjectionToken();

    @JsProperty( name = "injectionToken")
    public native void setInjectionToken( Object value );

    public Object methodCache;

    @JsProperty( name = "methodCache")
    public native Object getMethodCache();

    @JsProperty( name = "methodCache")
    public native void setMethodCache( Object value );

    public Object opaqueToken;

    @JsProperty( name = "opaqueToken")
    public native Object getOpaqueToken();

    @JsProperty( name = "opaqueToken")
    public native void setOpaqueToken( Object value );

    public Object parameterCache;

    @JsProperty( name = "parameterCache")
    public native Object getParameterCache();

    @JsProperty( name = "parameterCache")
    public native void setParameterCache( Object value );

    public Object propertyCache;

    @JsProperty( name = "propertyCache")
    public native Object getPropertyCache();

    @JsProperty( name = "propertyCache")
    public native void setPropertyCache( Object value );

    public Object summaryResolver;

    @JsProperty( name = "summaryResolver")
    public native Object getSummaryResolver();

    @JsProperty( name = "summaryResolver")
    public native void setSummaryResolver( Object value );

    public Object symbolResolver;

    @JsProperty( name = "symbolResolver")
    public native Object getSymbolResolver();

    @JsProperty( name = "symbolResolver")
    public native void setSymbolResolver( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(_methodNames,3,,P(d3))
      * TE Signature : S(_methodNames,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/static_reflector.d.ts@1760
     */
    public native Object _methodNames(Object type);
    /** 
      * Std Signature : S(_registerDecoratorOrConstructor,3,,P(d3),P(d3))
      * TE Signature : S(_registerDecoratorOrConstructor,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/static_reflector.d.ts@1903
     */
    public native Object _registerDecoratorOrConstructor(Object type, Object ctor);
    /** 
      * Std Signature : S(_registerFunction,3,,P(d3),P(d3))
      * TE Signature : S(_registerFunction,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/static_reflector.d.ts@1960
     */
    public native Object _registerFunction(Object type, Object fn);
    /** 
      * Std Signature : S(annotations,7<3>,,P(d492))
      * TE Signature : S(annotations,P(d492))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/static_reflector.d.ts@1596
     */
    public native Array<Object> annotations(StaticSymbol type);
    /** 
      * Std Signature : S(componentModuleUrl,1,,P(d492))
      * TE Signature : S(componentModuleUrl,P(d492))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/static_reflector.d.ts@1241
     */
    public native String componentModuleUrl(StaticSymbol typeOrFunc);
    /** 
      * Std Signature : S(findDeclaration,492,,P(d1),P(d1))
      * TE Signature : S(findDeclaration,P(d1),P(d1))
      * 
     */
    public native StaticSymbol findDeclaration(String moduleUrl, String name);
    /** 
      * Std Signature : S(findDeclaration,492,,P(d1),P(d1),P(d1))
      * TE Signature : S(findDeclaration,P(d1),P(d1),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/static_reflector.d.ts@1369
     */
    public native StaticSymbol findDeclaration(String moduleUrl, String name, String containingFile /* optional */);
    /** 
      * Std Signature : S(findParentType,3,,P(d3),P(d3))
      * TE Signature : S(findParentType,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/static_reflector.d.ts@1792
     */
    public native Object findParentType(Object type, Object classMetadata);
    /** 
      * Std Signature : S(findSymbolDeclaration,492,,P(d492))
      * TE Signature : S(findSymbolDeclaration,P(d492))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/static_reflector.d.ts@1533
     */
    public native StaticSymbol findSymbolDeclaration(StaticSymbol symbol);
    /** 
      * Std Signature : S(getStaticSymbol,492,,P(d1),P(d1))
      * TE Signature : S(getStaticSymbol,P(d1),P(d1))
      * 
     */
    public native StaticSymbol getStaticSymbol(String declarationFile, String name);
    /** 
      * Std Signature : S(getStaticSymbol,492,,P(d1),P(d1),P(d7<1>))
      * TE Signature : S(getStaticSymbol,P(d1),P(d1),P(d7))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/static_reflector.d.ts@2390
      * getStaticSymbol produces a Type whose metadata is known but whose implementation is not loaded.
      * All types passed to the StaticResolver should be pseudo-types returned by this method.
     */
    public native StaticSymbol getStaticSymbol(String declarationFile, String name, Array<String> members /* optional */);
    /** 
      * Std Signature : S(getTypeMetadata,3,,P(d3))
      * TE Signature : S(getTypeMetadata,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/static_reflector.d.ts@2628
     */
    public native Object getTypeMetadata(Object type);
    /** 
      * Std Signature : S(initializeConversionMap,3,,)
      * TE Signature : S(initializeConversionMap,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/static_reflector.d.ts@2001
     */
    public native Object initializeConversionMap();
    /** 
      * Std Signature : S(parameters,7<3>,,P(d492))
      * TE Signature : S(parameters,P(d492))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/static_reflector.d.ts@1717
     */
    public native Array<Object> parameters(StaticSymbol type);
    /** 
      * Std Signature : S(propMetadata,C(----7<3>----),,P(d492))
      * TE Signature : S(propMetadata,P(d492))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/static_reflector.d.ts@1640
     */
    public native AnonymousType1059 propMetadata(StaticSymbol type);
    /** 
      * Std Signature : S(reportError,3,,P(d3),P(d3))
      * TE Signature : S(reportError,P(d3),P(d3))
      * 
     */
    public native Object reportError(Object error, Object context);
    /** 
      * Std Signature : S(reportError,3,,P(d3),P(d3),P(d3))
      * TE Signature : S(reportError,P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/static_reflector.d.ts@2484
     */
    public native Object reportError(Object error, Object context, Object path /* optional */);
    /** 
      * Std Signature : S(tryFindDeclaration,492,,P(d1),P(d1))
      * TE Signature : S(tryFindDeclaration,P(d1),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/static_reflector.d.ts@1462
     */
    public native StaticSymbol tryFindDeclaration(String moduleUrl, String name);
    /** 
      * Std Signature : S(trySimplify,3,,P(d3),P(d3))
      * TE Signature : S(trySimplify,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/static_reflector.d.ts@2587
      * Simplify but discard any errors
     */
    public native Object trySimplify(Object context, Object value);
}

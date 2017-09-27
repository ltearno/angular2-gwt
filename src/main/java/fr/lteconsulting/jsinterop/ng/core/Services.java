package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types".Services
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts:13080
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts:14555

  * This object is used to prevent cycles in the source files and to have a place where
  * debug mode can hook it. It is lazily filled when `isDevMode` is known.
 */
@JsType(isNative=true, namespace="ng.core", name="Services")
public class Services
{

    /*
        Static methods
    */
    /** 
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts:13113
     */
    @JsMethod(namespace="ng.core.Services", name = "setCurrentNode")
    public static native void _setCurrentNode(ViewData view, Number nodeIndex);
    /** 
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts:13174
     */
    @JsMethod(namespace="ng.core.Services", name = "createRootView")
    public static native ViewData _createRootView(Injector injector, Array<Array<Object>> projectableNodes, Object rootSelectorOrNode, ViewDefinition def, NgModuleRef<Object> ngModule, Object context /* optional */);
    /** 
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts:13349
     */
    @JsMethod(namespace="ng.core.Services", name = "createEmbeddedView")
    public static native ViewData _createEmbeddedView(ViewData parent, NodeDef anchorDef, ViewDefinition viewDef, Object context /* optional */);
    /** 
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts:13461
     */
    @JsMethod(namespace="ng.core.Services", name = "createComponentView")
    public static native ViewData _createComponentView(ViewData parentView, NodeDef nodeDef, ViewDefinition viewDef, Object hostElement);
    /** 
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts:13579
     */
    @JsMethod(namespace="ng.core.Services", name = "createNgModuleRef")
    public static native NgModuleRef<Object> _createNgModuleRef(Type<Object> moduleType, Injector parent, Array<Type<Object>> bootstrapComponents, NgModuleDefinition def);
    /** 
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts:13720
     */
    @JsMethod(namespace="ng.core.Services", name = "overrideProvider")
    public static native void _overrideProvider(ProviderOverride override);
    /** 
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts:13776
     */
    @JsMethod(namespace="ng.core.Services", name = "clearProviderOverrides")
    public static native void _clearProviderOverrides();
    /** 
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts:13812
     */
    @JsMethod(namespace="ng.core.Services", name = "checkAndUpdateView")
    public static native void _checkAndUpdateView(ViewData view);
    /** 
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts:13858
     */
    @JsMethod(namespace="ng.core.Services", name = "checkNoChangesView")
    public static native void _checkNoChangesView(ViewData view);
    /** 
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts:13904
     */
    @JsMethod(namespace="ng.core.Services", name = "destroyView")
    public static native void _destroyView(ViewData view);
    /** 
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts:13943
     */
    @JsMethod(namespace="ng.core.Services", name = "resolveDep")
    public static native Object _resolveDep(ViewData view, NodeDef elDef, Boolean allowPrivateServices, DepDef depDef, Object notFoundValue /* optional */);
    /** 
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts:14071
     */
    @JsMethod(namespace="ng.core.Services", name = "createDebugContext")
    public static native DebugContext _createDebugContext(ViewData view, Number nodeIndex);
    /** 
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts:2977
     */
    @JsMethod(namespace="ng.core.Services", name = "handleEvent")
    public static native Boolean _handleEvent(ViewData view, Number nodeIndex, String eventName, Object event);
    /** 
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts:14198
     */
    @JsMethod(namespace="ng.core.Services", name = "updateDirectives")
    public static native void _updateDirectives(ViewData view, CheckType checkType);
    /** 
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts:14266
     */
    @JsMethod(namespace="ng.core.Services", name = "updateRenderer")
    public static native void _updateRenderer(ViewData view, CheckType checkType);
    /** 
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts:14338
     */
    @JsMethod(namespace="ng.core.Services", name = "dirtyParentQueries")
    public static native void _dirtyParentQueries(ViewData view);

    /*
        Methods
    */
    /** 
      * Std Signature : S(checkAndUpdateView,429,,P(d392))
      * TE Signature : S(checkAndUpdateView,P(d392))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts@13812
     */
    public native void checkAndUpdateView(ViewData view);
    /** 
      * Std Signature : S(checkNoChangesView,429,,P(d392))
      * TE Signature : S(checkNoChangesView,P(d392))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts@13858
     */
    public native void checkNoChangesView(ViewData view);
    /** 
      * Std Signature : S(clearProviderOverrides,429,,)
      * TE Signature : S(clearProviderOverrides,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts@13776
     */
    public native void clearProviderOverrides();
    /** 
      * Std Signature : S(createComponentView,392,,P(d392),P(d396),P(d395),P(d3))
      * TE Signature : S(createComponentView,P(d392),P(d396),P(d395),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts@13461
     */
    public native ViewData createComponentView(ViewData parentView, NodeDef nodeDef, ViewDefinition viewDef, Object hostElement);
    /** 
      * Std Signature : S(createDebugContext,414,,P(d392),P(d2))
      * TE Signature : S(createDebugContext,P(d392),P(d2))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts@14071
     */
    public native DebugContext createDebugContext(ViewData view, Number nodeIndex);
    /** 
      * Std Signature : S(createEmbeddedView,392,,P(d392),P(d396),P(d395))
      * TE Signature : S(createEmbeddedView,P(d392),P(d396),P(d395))
      * 
     */
    public native ViewData createEmbeddedView(ViewData parent, NodeDef anchorDef, ViewDefinition viewDef);
    /** 
      * Std Signature : S(createEmbeddedView,392,,P(d392),P(d396),P(d395),P(d3))
      * TE Signature : S(createEmbeddedView,P(d392),P(d396),P(d395),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts@13349
     */
    public native ViewData createEmbeddedView(ViewData parent, NodeDef anchorDef, ViewDefinition viewDef, Object context /* optional */);
    /** 
      * Std Signature : S(createNgModuleRef,371<3>,,P(d329<3>),P(d335),P(d7<329<3>>),P(d397))
      * TE Signature : S(createNgModuleRef,P(d329),P(d335),P(d7),P(d397))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts@13579
     */
    public native NgModuleRef<Object> createNgModuleRef(Type<Object> moduleType, Injector parent, Array<Type<Object>> bootstrapComponents, NgModuleDefinition def);
    /** 
      * Std Signature : S(createRootView,392,,P(d335),P(d7<2<3>>),P(d3),P(d395),P(d371<3>))
      * TE Signature : S(createRootView,P(d335),P(d7),P(d3),P(d395),P(d371))
      * 
     */
    public native ViewData createRootView(Injector injector, Array<Array<Object>> projectableNodes, Object rootSelectorOrNode, ViewDefinition def, NgModuleRef<Object> ngModule);
    /** 
      * Std Signature : S(createRootView,392,,P(d335),P(d7<2<3>>),P(d3),P(d395),P(d371<3>),P(d3))
      * TE Signature : S(createRootView,P(d335),P(d7),P(d3),P(d395),P(d371),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts@13174
     */
    public native ViewData createRootView(Injector injector, Array<Array<Object>> projectableNodes, Object rootSelectorOrNode, ViewDefinition def, NgModuleRef<Object> ngModule, Object context /* optional */);
    /** 
      * Std Signature : S(destroyView,429,,P(d392))
      * TE Signature : S(destroyView,P(d392))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts@13904
     */
    public native void destroyView(ViewData view);
    /** 
      * Std Signature : S(dirtyParentQueries,429,,P(d392))
      * TE Signature : S(dirtyParentQueries,P(d392))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts@14338
     */
    public native void dirtyParentQueries(ViewData view);
    /** 
      * Std Signature : S(handleEvent,27,,P(d392),P(d2),P(d1),P(d3))
      * TE Signature : S(handleEvent,P(d392),P(d2),P(d1),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts@2977
     */
    public native Boolean handleEvent(ViewData view, Number nodeIndex, String eventName, Object event);
    /** 
      * Std Signature : S(overrideProvider,429,,P(d398))
      * TE Signature : S(overrideProvider,P(d398))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts@13720
     */
    public native void overrideProvider(ProviderOverride override);
    /** 
      * Std Signature : S(resolveDep,3,,P(d392),P(d396),P(d27),P(d399))
      * TE Signature : S(resolveDep,P(d392),P(d396),P(d27),P(d399))
      * 
     */
    public native Object resolveDep(ViewData view, NodeDef elDef, Boolean allowPrivateServices, DepDef depDef);
    /** 
      * Std Signature : S(resolveDep,3,,P(d392),P(d396),P(d27),P(d399),P(d3))
      * TE Signature : S(resolveDep,P(d392),P(d396),P(d27),P(d399),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts@13943
     */
    public native Object resolveDep(ViewData view, NodeDef elDef, Boolean allowPrivateServices, DepDef depDef, Object notFoundValue /* optional */);
    /** 
      * Std Signature : S(setCurrentNode,429,,P(d392),P(d2))
      * TE Signature : S(setCurrentNode,P(d392),P(d2))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts@13113
     */
    public native void setCurrentNode(ViewData view, Number nodeIndex);
    /** 
      * Std Signature : S(updateDirectives,429,,P(d392),P(d400))
      * TE Signature : S(updateDirectives,P(d392),P(d400))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts@14198
     */
    public native void updateDirectives(ViewData view, CheckType checkType);
    /** 
      * Std Signature : S(updateRenderer,429,,P(d392),P(d400))
      * TE Signature : S(updateRenderer,P(d392),P(d400))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts@14266
     */
    public native void updateRenderer(ViewData view, CheckType checkType);
}

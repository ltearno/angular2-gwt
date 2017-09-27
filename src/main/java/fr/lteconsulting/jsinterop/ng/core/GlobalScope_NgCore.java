package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.Provider_UnionOfArrayOfObjectAndClassProviderAndExistingProviderAndFactoryProviderAndTypeProviderAndValueProvider;
import fr.lteconsulting.jsinterop.Tuple;
import fr.lteconsulting.jsinterop.TupleOf3;
import fr.lteconsulting.jsinterop.UnionOfFunctionAndStringAndTypeOfObject;
import fr.lteconsulting.jsinterop.UnionOfFunctionAndTypeOfObject;
import fr.lteconsulting.jsinterop.browser.AnonymousType1043;
import fr.lteconsulting.jsinterop.browser.AnonymousType1045;
import fr.lteconsulting.jsinterop.browser.AnonymousType1046;
import fr.lteconsulting.jsinterop.browser.AnonymousType717;
import fr.lteconsulting.jsinterop.browser.AnonymousType817;
import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.Console;
import fr.lteconsulting.jsinterop.browser.Error;
import fr.lteconsulting.jsinterop.browser.Function;
import fr.lteconsulting.jsinterop.browser.Map;
import fr.lteconsulting.jsinterop.browser.PropertyKey_UnionOfNumberAndString;
import fr.lteconsulting.jsinterop.browser.RegExp;
import fr.lteconsulting.prebuilt.Action;
import fr.lteconsulting.prebuilt.Action1;
import fr.lteconsulting.prebuilt.Action2;
import fr.lteconsulting.prebuilt.Function1;
import fr.lteconsulting.prebuilt.Function2;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 

  * Wrapper class for all global definition of ng.core (java fr.lteconsulting.jsinterop.ng.core) package
 */
@JsType(isNative=true, namespace="ng", name="core")
public class GlobalScope_NgCore
{

    /*
        Static properties
    */

    @JsProperty(namespace="ng.core", name="ANALYZE_FOR_ENTRY_COMPONENTS")
    public static InjectionToken<Object> ANALYZE_FOR_ENTRY_COMPONENTS;

    @JsProperty(namespace="ng.core", name="THROW_IF_NOT_FOUND")
    public static Object THROW_IF_NOT_FOUND;

    @JsProperty(namespace="ng.core", name="CUSTOM_ELEMENTS_SCHEMA")
    public static SchemaMetadata CUSTOM_ELEMENTS_SCHEMA;

    @JsProperty(namespace="ng.core", name="NO_ERRORS_SCHEMA")
    public static SchemaMetadata NO_ERRORS_SCHEMA;

    @JsProperty(namespace="ng.core", name="VERSION")
    public static Version VERSION;

    @JsProperty(namespace="ng.core", name="APP_INITIALIZER")
    public static InjectionToken<Array<Action>> APP_INITIALIZER;

    @JsProperty(namespace="ng.core", name="LOCALE_ID")
    public static InjectionToken<String> LOCALE_ID;

    @JsProperty(namespace="ng.core", name="TRANSLATIONS")
    public static InjectionToken<String> TRANSLATIONS;

    @JsProperty(namespace="ng.core", name="TRANSLATIONS_FORMAT")
    public static InjectionToken<String> TRANSLATIONS_FORMAT;

    @JsProperty(namespace="ng.core", name="defaultIterableDiffers")
    public static IterableDiffers defaultIterableDiffers;

    @JsProperty(namespace="ng.core", name="defaultKeyValueDiffers")
    public static KeyValueDiffers defaultKeyValueDiffers;

    @JsProperty(namespace="ng.core", name="COMPILER_OPTIONS")
    public static InjectionToken<Array<Object>> COMPILER_OPTIONS;

    @JsProperty(namespace="ng.core", name="ALLOW_MULTIPLE_PLATFORMS")
    public static InjectionToken<Boolean> ALLOW_MULTIPLE_PLATFORMS;

    @JsProperty(namespace="ng.core", name="APP_ID")
    public static InjectionToken<String> APP_ID;

    @JsProperty(namespace="ng.core", name="APP_ID_RANDOM_PROVIDER")
    public static Object APP_ID_RANDOM_PROVIDER;

    @JsProperty(namespace="ng.core", name="PLATFORM_INITIALIZER")
    public static InjectionToken<Array<Action>> PLATFORM_INITIALIZER;

    @JsProperty(namespace="ng.core", name="PLATFORM_ID")
    public static InjectionToken<Object> PLATFORM_ID;

    @JsProperty(namespace="ng.core", name="APP_BOOTSTRAP_LISTENER")
    public static InjectionToken<Array<Action1<ComponentRef<Object>>>> APP_BOOTSTRAP_LISTENER;

    @JsProperty(namespace="ng.core", name="PACKAGE_ROOT_URL")
    public static InjectionToken<String> PACKAGE_ROOT_URL;

    @JsProperty(namespace="ng.core", name="Renderer2Interceptor")
    public static InjectionToken<Array<Renderer2>> Renderer2Interceptor;

    @JsProperty(namespace="ng.core", name="Services")
    public static Services Services;

    @JsProperty(namespace="ng.core", name="EMPTY_ARRAY")
    public static Array<Object> EMPTY_ARRAY;

    @JsProperty(namespace="ng.core", name="EMPTY_MAP")
    public static AnonymousType717 EMPTY_MAP;

    @JsProperty(namespace="ng.core", name="wtfEnabled")
    public static Boolean wtfEnabled;

    @JsProperty(namespace="ng.core", name="DELEGATE_CTOR")
    public static RegExp DELEGATE_CTOR;

    @JsProperty(namespace="ng.core", name="_global")
    public static AnonymousType717 _global;

    @JsProperty(namespace="ng.core", name="reflector")
    public static Reflector reflector;

    /*
        Static methods
    */
    @JsMethod(namespace="ng.core", name = "Type")
    public static native Function Type(String... args);
    @JsMethod(namespace="ng.core", name = "isType")
    public static native Boolean isType(Object v);
    @JsMethod(namespace="ng.core", name = "Attribute")
    public static native Object Attribute(String name);
    @JsMethod(namespace="ng.core", name = "ContentChildren")
    public static native Object ContentChildren(UnionOfFunctionAndStringAndTypeOfObject selector, Object opts /* optional */);
    @JsMethod(namespace="ng.core", name = "ContentChild")
    public static native Object ContentChild(UnionOfFunctionAndStringAndTypeOfObject selector, Object opts /* optional */);
    @JsMethod(namespace="ng.core", name = "ViewChildren")
    public static native Object ViewChildren(UnionOfFunctionAndStringAndTypeOfObject selector, Object opts /* optional */);
    @JsMethod(namespace="ng.core", name = "ViewChild")
    public static native Object ViewChild(UnionOfFunctionAndStringAndTypeOfObject selector, Object opts /* optional */);
    @JsMethod(namespace="ng.core", name = "isDefaultChangeDetectionStrategy")
    public static native Boolean isDefaultChangeDetectionStrategy(ChangeDetectionStrategy changeDetectionStrategy);
    @JsMethod(namespace="ng.core", name = "Inject")
    public static native Object Inject(Object token);
    @JsMethod(namespace="ng.core", name = "Optional")
    public static native Object Optional();
    @JsMethod(namespace="ng.core", name = "Injectable")
    public static native Object Injectable();
    @JsMethod(namespace="ng.core", name = "Self")
    public static native Object Self();
    @JsMethod(namespace="ng.core", name = "SkipSelf")
    public static native Object SkipSelf();
    @JsMethod(namespace="ng.core", name = "Host")
    public static native Object Host();
    @JsMethod(namespace="ng.core", name = "forwardRef")
    public static native Type<Object> forwardRef(ForwardRefFn forwardRefFn);
    @JsMethod(namespace="ng.core", name = "resolveForwardRef")
    public static native Object resolveForwardRef(Object type);
    @JsMethod(namespace="ng.core", name = "resolveReflectiveProviders")
    public static native Array<ResolvedReflectiveProvider> resolveReflectiveProviders(Array<Provider_UnionOfArrayOfObjectAndClassProviderAndExistingProviderAndFactoryProviderAndTypeProviderAndValueProvider> providers);
    @JsMethod(namespace="ng.core", name = "mergeResolvedReflectiveProviders")
    public static native Map<Number, ResolvedReflectiveProvider> mergeResolvedReflectiveProviders(Array<ResolvedReflectiveProvider> providers, Map<Number, ResolvedReflectiveProvider> normalizedProvidersMap);
    @JsMethod(namespace="ng.core", name = "constructDependencies")
    public static native Array<ReflectiveDependency> constructDependencies(Object typeOrFunc, Array<Object> dependencies /* optional */);
    @JsMethod(namespace="ng.core", name = "makeDecorator")
    public static native Function1<Object, Function1<Object, Object>> makeDecorator(String name, Function1<Object, Object> props /* optional */, Object parentClass /* optional */, Action1<Function> chainFn /* optional */);
    @JsMethod(namespace="ng.core", name = "makeParamDecorator")
    public static native Object makeParamDecorator(String name, Function1<Object, Object> props /* optional */, Object parentClass /* optional */);
    @JsMethod(namespace="ng.core", name = "makePropDecorator")
    public static native Object makePropDecorator(String name, Function1<Object, Object> props /* optional */, Object parentClass /* optional */);
    @JsMethod(namespace="ng.core", name = "Directive")
    public static native TypeDecorator Directive(Directive obj);
    @JsMethod(namespace="ng.core", name = "Component")
    public static native TypeDecorator Component(Component obj);
    @JsMethod(namespace="ng.core", name = "Pipe")
    public static native TypeDecorator Pipe(Pipe obj);
    @JsMethod(namespace="ng.core", name = "Input")
    public static native Object Input(String bindingPropertyName /* optional */);
    @JsMethod(namespace="ng.core", name = "Output")
    public static native Object Output(String bindingPropertyName /* optional */);
    @JsMethod(namespace="ng.core", name = "HostBinding")
    public static native Object HostBinding(String hostPropertyName /* optional */);
    @JsMethod(namespace="ng.core", name = "HostListener")
    public static native Object HostListener(String eventName, Array<String> args /* optional */);
    @JsMethod(namespace="ng.core", name = "devModeEqual")
    public static native Boolean devModeEqual(Object a, Object b);
    @JsMethod(namespace="ng.core", name = "isListLikeIterable")
    public static native Boolean isListLikeIterable(Object obj);
    @JsMethod(namespace="ng.core", name = "areIterablesEqual")
    public static native Boolean areIterablesEqual(Object a, Object b, Function2<Object, Object, Boolean> comparator);
    @JsMethod(namespace="ng.core", name = "iterateListLike")
    public static native void iterateListLike(Object obj, Function1<Object, Object> fn);
    @JsMethod(namespace="ng.core", name = "isJsObject")
    public static native Boolean isJsObject(Object o);
    @JsMethod(namespace="ng.core", name = "NgModule")
    public static native TypeDecorator NgModule(NgModule obj /* optional */);
    @JsMethod(namespace="ng.core", name = "wrappedError")
    public static native Error wrappedError(String message, Object originalError);
    @JsMethod(namespace="ng.core", name = "getTypeNameForDebugging")
    public static native String getTypeNameForDebugging(Object type);
    @JsMethod(namespace="ng.core", name = "noComponentFactoryError")
    public static native Error noComponentFactoryError(Function component);
    @JsMethod(namespace="ng.core", name = "getComponent")
    public static native Type<Object> getComponent(Error error);
    @JsMethod(namespace="ng.core", name = "enableProdMode")
    public static native void enableProdMode();
    @JsMethod(namespace="ng.core", name = "isDevMode")
    public static native Boolean isDevMode();
    @JsMethod(namespace="ng.core", name = "createPlatform")
    public static native PlatformRef createPlatform(Injector injector);
    @JsMethod(namespace="ng.core", name = "createPlatformFactory")
    public static native Function1<Array<Provider_UnionOfArrayOfObjectAndClassProviderAndExistingProviderAndFactoryProviderAndTypeProviderAndValueProvider>, PlatformRef> createPlatformFactory(Function1<Array<Provider_UnionOfArrayOfObjectAndClassProviderAndExistingProviderAndFactoryProviderAndTypeProviderAndValueProvider>, PlatformRef> parentPlatformFactory, String name, Array<Provider_UnionOfArrayOfObjectAndClassProviderAndExistingProviderAndFactoryProviderAndTypeProviderAndValueProvider> providers /* optional */);
    @JsMethod(namespace="ng.core", name = "assertPlatform")
    public static native PlatformRef assertPlatform(Object requiredToken);
    @JsMethod(namespace="ng.core", name = "destroyPlatform")
    public static native void destroyPlatform();
    @JsMethod(namespace="ng.core", name = "getPlatform")
    public static native PlatformRef getPlatform();
    @JsMethod(namespace="ng.core", name = "_appIdRandomProviderFactory")
    public static native String _appIdRandomProviderFactory();
    @JsMethod(namespace="ng.core", name = "registerModuleFactory")
    public static native void registerModuleFactory(String id, NgModuleFactory<Object> factory);
    @JsMethod(namespace="ng.core", name = "clearModulesForTest")
    public static native void clearModulesForTest();
    @JsMethod(namespace="ng.core", name = "getModuleFactory")
    public static native NgModuleFactory<Object> getModuleFactory(String id);
    @JsMethod(namespace="ng.core", name = "asTextData")
    public static native TextData asTextData(ViewData view, Number index);
    @JsMethod(namespace="ng.core", name = "asElementData")
    public static native ElementData asElementData(ViewData view, Number index);
    @JsMethod(namespace="ng.core", name = "asProviderData")
    public static native ProviderData asProviderData(ViewData view, Number index);
    @JsMethod(namespace="ng.core", name = "asPureExpressionData")
    public static native PureExpressionData asPureExpressionData(ViewData view, Number index);
    @JsMethod(namespace="ng.core", name = "asQueryList")
    public static native QueryList<Object> asQueryList(ViewData view, Number index);
    @JsMethod(namespace="ng.core", name = "anchorDef")
    public static native NodeDef anchorDef(NodeFlags flags, Array<Tuple<PropertyKey_UnionOfNumberAndString, QueryValueType>> matchedQueriesDsl, Number ngContentIndex, Number childCount, ElementHandleEventFn handleEvent /* optional */, ViewDefinitionFactory templateFactory /* optional */);
    @JsMethod(namespace="ng.core", name = "elementDef")
    public static native NodeDef elementDef(NodeFlags flags, Array<Tuple<PropertyKey_UnionOfNumberAndString, QueryValueType>> matchedQueriesDsl, Number ngContentIndex, Number childCount, String namespaceAndName, Array<Tuple<String, String>> fixedAttrs /* optional */, Array<TupleOf3<BindingFlags, String, PropertyKey_UnionOfNumberAndString>> bindings /* optional */, Array<Tuple<String, String>> outputs /* optional */, ElementHandleEventFn handleEvent /* optional */, ViewDefinitionFactory componentView /* optional */, RendererType2 componentRendererType /* optional */);
    @JsMethod(namespace="ng.core", name = "createElement")
    public static native ElementData createElement(ViewData view, Object renderHost, NodeDef def);
    @JsMethod(namespace="ng.core", name = "listenToElementOutputs")
    public static native void listenToElementOutputs(ViewData view, ViewData compView, NodeDef def, Object el);
    @JsMethod(namespace="ng.core", name = "checkAndUpdateElementInline")
    public static native Boolean checkAndUpdateElementInline(ViewData view, NodeDef def, Object v0, Object v1, Object v2, Object v3, Object v4, Object v5, Object v6, Object v7, Object v8, Object v9);
    @JsMethod(namespace="ng.core", name = "checkAndUpdateElementDynamic")
    public static native Boolean checkAndUpdateElementDynamic(ViewData view, NodeDef def, Array<Object> values);
    @JsMethod(namespace="ng.core", name = "overrideProvider")
    public static native void overrideProvider(ProviderOverride override);
    @JsMethod(namespace="ng.core", name = "clearProviderOverrides")
    public static native void clearProviderOverrides();
    @JsMethod(namespace="ng.core", name = "createNgModuleFactory")
    public static native NgModuleFactory<Object> createNgModuleFactory(Type<Object> ngModuleType, Array<Type<Object>> bootstrapComponents, NgModuleDefinitionFactory defFactory);
    @JsMethod(namespace="ng.core", name = "ngContentDef")
    public static native NodeDef ngContentDef(Number ngContentIndex, Number index);
    @JsMethod(namespace="ng.core", name = "appendNgContent")
    public static native void appendNgContent(ViewData view, Object renderHost, NodeDef def);
    @JsMethod(namespace="ng.core", name = "moduleProvideDef")
    public static native NgModuleProviderDef moduleProvideDef(NodeFlags flags, Object token, Object value, Array<Object> deps);
    @JsMethod(namespace="ng.core", name = "moduleDef")
    public static native NgModuleDefinition moduleDef(Array<NgModuleProviderDef> providers);
    @JsMethod(namespace="ng.core", name = "initNgModule")
    public static native void initNgModule(NgModuleData data);
    @JsMethod(namespace="ng.core", name = "resolveNgModuleDep")
    public static native Object resolveNgModuleDep(NgModuleData data, DepDef depDef, Object notFoundValue /* optional */);
    @JsMethod(namespace="ng.core", name = "callNgModuleLifecycle")
    public static native void callNgModuleLifecycle(NgModuleData ngModule, NodeFlags lifecycles);
    @JsMethod(namespace="ng.core", name = "directiveDef")
    public static native NodeDef directiveDef(NodeFlags flags, Array<Tuple<PropertyKey_UnionOfNumberAndString, QueryValueType>> matchedQueries, Number childCount, Object ctor, Array<Object> deps, AnonymousType1043 props /* optional */, AnonymousType817 outputs /* optional */);
    @JsMethod(namespace="ng.core", name = "pipeDef")
    public static native NodeDef pipeDef(NodeFlags flags, Object ctor, Array<Object> deps);
    @JsMethod(namespace="ng.core", name = "providerDef")
    public static native NodeDef providerDef(NodeFlags flags, Array<Tuple<PropertyKey_UnionOfNumberAndString, QueryValueType>> matchedQueries, Object token, Object value, Array<Object> deps);
    @JsMethod(namespace="ng.core", name = "_def")
    public static native NodeDef _def(NodeFlags flags, Array<Tuple<PropertyKey_UnionOfNumberAndString, QueryValueType>> matchedQueriesDsl, Number childCount, Object token, Object value, Array<Object> deps, Array<BindingDef> bindings /* optional */, Array<OutputDef> outputs /* optional */);
    @JsMethod(namespace="ng.core", name = "createProviderInstance")
    public static native Object createProviderInstance(ViewData view, NodeDef def);
    @JsMethod(namespace="ng.core", name = "createPipeInstance")
    public static native Object createPipeInstance(ViewData view, NodeDef def);
    @JsMethod(namespace="ng.core", name = "createDirectiveInstance")
    public static native Object createDirectiveInstance(ViewData view, NodeDef def);
    @JsMethod(namespace="ng.core", name = "checkAndUpdateDirectiveInline")
    public static native Boolean checkAndUpdateDirectiveInline(ViewData view, NodeDef def, Object v0, Object v1, Object v2, Object v3, Object v4, Object v5, Object v6, Object v7, Object v8, Object v9);
    @JsMethod(namespace="ng.core", name = "checkAndUpdateDirectiveDynamic")
    public static native Boolean checkAndUpdateDirectiveDynamic(ViewData view, NodeDef def, Array<Object> values);
    @JsMethod(namespace="ng.core", name = "resolveDep")
    public static native Object resolveDep(ViewData view, NodeDef elDef, Boolean allowPrivateServices, DepDef depDef, Object notFoundValue /* optional */);
    @JsMethod(namespace="ng.core", name = "callLifecycleHooksChildrenFirst")
    public static native void callLifecycleHooksChildrenFirst(ViewData view, NodeFlags lifecycles);
    @JsMethod(namespace="ng.core", name = "purePipeDef")
    public static native NodeDef purePipeDef(Number argCount);
    @JsMethod(namespace="ng.core", name = "pureArrayDef")
    public static native NodeDef pureArrayDef(Number argCount);
    @JsMethod(namespace="ng.core", name = "pureObjectDef")
    public static native NodeDef pureObjectDef(AnonymousType1045 propToIndex);
    @JsMethod(namespace="ng.core", name = "createPureExpression")
    public static native PureExpressionData createPureExpression(ViewData view, NodeDef def);
    @JsMethod(namespace="ng.core", name = "checkAndUpdatePureExpressionInline")
    public static native Boolean checkAndUpdatePureExpressionInline(ViewData view, NodeDef def, Object v0, Object v1, Object v2, Object v3, Object v4, Object v5, Object v6, Object v7, Object v8, Object v9);
    @JsMethod(namespace="ng.core", name = "checkAndUpdatePureExpressionDynamic")
    public static native Boolean checkAndUpdatePureExpressionDynamic(ViewData view, NodeDef def, Array<Object> values);
    @JsMethod(namespace="ng.core", name = "queryDef")
    public static native NodeDef queryDef(NodeFlags flags, Number id, AnonymousType1046 bindings);
    @JsMethod(namespace="ng.core", name = "createQuery")
    public static native QueryList<Object> createQuery();
    @JsMethod(namespace="ng.core", name = "dirtyParentQueries")
    public static native void dirtyParentQueries(ViewData view);
    @JsMethod(namespace="ng.core", name = "checkAndUpdateQuery")
    public static native void checkAndUpdateQuery(ViewData view, NodeDef nodeDef);
    @JsMethod(namespace="ng.core", name = "getQueryValue")
    public static native Object getQueryValue(ViewData view, NodeDef nodeDef, QueryValueType queryValueType);
    @JsMethod(namespace="ng.core", name = "createComponentFactory")
    public static native ComponentFactory<Object> createComponentFactory(String selector, Type<Object> componentType, ViewDefinitionFactory viewDefFactory, AnonymousType817 inputs, AnonymousType817 outputs, Array<String> ngContentSelectors);
    @JsMethod(namespace="ng.core", name = "getComponentViewDefinitionFactory")
    public static native ViewDefinitionFactory getComponentViewDefinitionFactory(ComponentFactory<Object> componentFactory);
    @JsMethod(namespace="ng.core", name = "createViewContainerData")
    public static native ViewContainerData createViewContainerData(ViewData view, NodeDef elDef, ElementData elData);
    @JsMethod(namespace="ng.core", name = "createChangeDetectorRef")
    public static native ChangeDetectorRef createChangeDetectorRef(ViewData view);
    @JsMethod(namespace="ng.core", name = "createTemplateData")
    public static native TemplateData createTemplateData(ViewData view, NodeDef def);
    @JsMethod(namespace="ng.core", name = "createInjector")
    public static native Injector createInjector(ViewData view, NodeDef elDef);
    @JsMethod(namespace="ng.core", name = "nodeValue")
    public static native Object nodeValue(ViewData view, Number index);
    @JsMethod(namespace="ng.core", name = "createRendererV1")
    public static native Renderer createRendererV1(ViewData view);
    @JsMethod(namespace="ng.core", name = "createNgModuleRef")
    public static native NgModuleRef<Object> createNgModuleRef(Type<Object> moduleType, Injector parent, Array<Type<Object>> bootstrapComponents, NgModuleDefinition def);
    @JsMethod(namespace="ng.core", name = "initServicesIfNeeded")
    public static native void initServicesIfNeeded();
    @JsMethod(namespace="ng.core", name = "getCurrentDebugContext")
    public static native DebugContext getCurrentDebugContext();
    @JsMethod(namespace="ng.core", name = "textDef")
    public static native NodeDef textDef(Number ngContentIndex, Array<String> constants);
    @JsMethod(namespace="ng.core", name = "createText")
    public static native TextData createText(ViewData view, Object renderHost, NodeDef def);
    @JsMethod(namespace="ng.core", name = "checkAndUpdateTextInline")
    public static native Boolean checkAndUpdateTextInline(ViewData view, NodeDef def, Object v0, Object v1, Object v2, Object v3, Object v4, Object v5, Object v6, Object v7, Object v8, Object v9);
    @JsMethod(namespace="ng.core", name = "checkAndUpdateTextDynamic")
    public static native Boolean checkAndUpdateTextDynamic(ViewData view, NodeDef def, Array<Object> values);
    @JsMethod(namespace="ng.core", name = "tokenKey")
    public static native String tokenKey(Object token);
    @JsMethod(namespace="ng.core", name = "unwrapValue")
    public static native Object unwrapValue(ViewData view, Number nodeIdx, Number bindingIdx, Object value);
    @JsMethod(namespace="ng.core", name = "createRendererType2")
    public static native RendererType2 createRendererType2(Object values);
    @JsMethod(namespace="ng.core", name = "resolveRendererType2")
    public static native RendererType2 resolveRendererType2(RendererType2 type /* optional */);
    @JsMethod(namespace="ng.core", name = "checkBinding")
    public static native Boolean checkBinding(ViewData view, NodeDef def, Number bindingIdx, Object value);
    @JsMethod(namespace="ng.core", name = "checkAndUpdateBinding")
    public static native Boolean checkAndUpdateBinding(ViewData view, NodeDef def, Number bindingIdx, Object value);
    @JsMethod(namespace="ng.core", name = "checkBindingNoChanges")
    public static native void checkBindingNoChanges(ViewData view, NodeDef def, Number bindingIdx, Object value);
    @JsMethod(namespace="ng.core", name = "markParentViewsForCheck")
    public static native void markParentViewsForCheck(ViewData view);
    @JsMethod(namespace="ng.core", name = "markParentViewsForCheckProjectedViews")
    public static native void markParentViewsForCheckProjectedViews(ViewData view, ViewData endView);
    @JsMethod(namespace="ng.core", name = "dispatchEvent")
    public static native Boolean dispatchEvent(ViewData view, Number nodeIndex, String eventName, Object event);
    @JsMethod(namespace="ng.core", name = "declaredViewContainer")
    public static native ElementData declaredViewContainer(ViewData view);
    @JsMethod(namespace="ng.core", name = "viewParentEl")
    public static native NodeDef viewParentEl(ViewData view);
    @JsMethod(namespace="ng.core", name = "renderNode")
    public static native Object renderNode(ViewData view, NodeDef def);
    @JsMethod(namespace="ng.core", name = "elementEventFullName")
    public static native String elementEventFullName(String target, String name);
    @JsMethod(namespace="ng.core", name = "isComponentView")
    public static native Boolean isComponentView(ViewData view);
    @JsMethod(namespace="ng.core", name = "isEmbeddedView")
    public static native Boolean isEmbeddedView(ViewData view);
    @JsMethod(namespace="ng.core", name = "filterQueryId")
    public static native Number filterQueryId(Number queryId);
    @JsMethod(namespace="ng.core", name = "splitMatchedQueriesDsl")
    public static native Object splitMatchedQueriesDsl(Array<Tuple<PropertyKey_UnionOfNumberAndString, QueryValueType>> matchedQueriesDsl);
    @JsMethod(namespace="ng.core", name = "splitDepsDsl")
    public static native Array<DepDef> splitDepsDsl(Array<Object> deps);
    @JsMethod(namespace="ng.core", name = "getParentRenderElement")
    public static native Object getParentRenderElement(ViewData view, Object renderHost, NodeDef def);
    @JsMethod(namespace="ng.core", name = "resolveDefinition")
    public static native <D extends Definition<?>> D resolveDefinition(DefinitionFactory<D> factory);
    @JsMethod(namespace="ng.core", name = "rootRenderNodes")
    public static native Array<Object> rootRenderNodes(ViewData view);
    @JsMethod(namespace="ng.core", name = "visitRootRenderNodes")
    public static native void visitRootRenderNodes(ViewData view, RenderNodeAction action, Object parentNode, Object nextSibling, Array<Object> target /* optional */);
    @JsMethod(namespace="ng.core", name = "visitSiblingRenderNodes")
    public static native void visitSiblingRenderNodes(ViewData view, RenderNodeAction action, Number startIndex, Number endIndex, Object parentNode, Object nextSibling, Array<Object> target /* optional */);
    @JsMethod(namespace="ng.core", name = "visitProjectedRenderNodes")
    public static native void visitProjectedRenderNodes(ViewData view, Number ngContentIndex, RenderNodeAction action, Object parentNode, Object nextSibling, Array<Object> target /* optional */);
    @JsMethod(namespace="ng.core", name = "splitNamespace")
    public static native Array<String> splitNamespace(String name);
    @JsMethod(namespace="ng.core", name = "calcBindingFlags")
    public static native BindingFlags calcBindingFlags(Array<BindingDef> bindings);
    @JsMethod(namespace="ng.core", name = "interpolate")
    public static native String interpolate(Number valueCount, Array<String> constAndInterp);
    @JsMethod(namespace="ng.core", name = "inlineInterpolate")
    public static native String inlineInterpolate(Number valueCount, String c0, Object a1, String c1, Object a2 /* optional */, String c2 /* optional */, Object a3 /* optional */, String c3 /* optional */, Object a4 /* optional */, String c4 /* optional */, Object a5 /* optional */, String c5 /* optional */, Object a6 /* optional */, String c6 /* optional */, Object a7 /* optional */, String c7 /* optional */, Object a8 /* optional */, String c8 /* optional */, Object a9 /* optional */, String c9 /* optional */);
    @JsMethod(namespace="ng.core", name = "viewDef")
    public static native ViewDefinition viewDef(ViewFlags flags, Array<NodeDef> nodes, ViewUpdateFn updateDirectives /* optional */, ViewUpdateFn updateRenderer /* optional */);
    @JsMethod(namespace="ng.core", name = "createEmbeddedView")
    public static native ViewData createEmbeddedView(ViewData parent, NodeDef anchorDef, ViewDefinition viewDef, Object context /* optional */);
    @JsMethod(namespace="ng.core", name = "createRootView")
    public static native ViewData createRootView(RootData root, ViewDefinition def, Object context /* optional */);
    @JsMethod(namespace="ng.core", name = "createComponentView")
    public static native ViewData createComponentView(ViewData parentView, NodeDef nodeDef, ViewDefinition viewDef, Object hostElement);
    @JsMethod(namespace="ng.core", name = "checkNoChangesView")
    public static native void checkNoChangesView(ViewData view);
    @JsMethod(namespace="ng.core", name = "checkAndUpdateView")
    public static native void checkAndUpdateView(ViewData view);
    @JsMethod(namespace="ng.core", name = "checkAndUpdateNode")
    public static native Boolean checkAndUpdateNode(ViewData view, NodeDef nodeDef, ArgumentType argStyle, Object v0 /* optional */, Object v1 /* optional */, Object v2 /* optional */, Object v3 /* optional */, Object v4 /* optional */, Object v5 /* optional */, Object v6 /* optional */, Object v7 /* optional */, Object v8 /* optional */, Object v9 /* optional */);
    @JsMethod(namespace="ng.core", name = "checkNoChangesNode")
    public static native Object checkNoChangesNode(ViewData view, NodeDef nodeDef, ArgumentType argStyle, Object v0 /* optional */, Object v1 /* optional */, Object v2 /* optional */, Object v3 /* optional */, Object v4 /* optional */, Object v5 /* optional */, Object v6 /* optional */, Object v7 /* optional */, Object v8 /* optional */, Object v9 /* optional */);
    @JsMethod(namespace="ng.core", name = "destroyView")
    public static native void destroyView(ViewData view);
    @JsMethod(namespace="ng.core", name = "attachEmbeddedView")
    public static native void attachEmbeddedView(ViewData parentView, ElementData elementData, Number viewIndex, ViewData view);
    @JsMethod(namespace="ng.core", name = "detachEmbeddedView")
    public static native ViewData detachEmbeddedView(ElementData elementData, Number viewIndex /* optional */);
    @JsMethod(namespace="ng.core", name = "detachProjectedView")
    public static native void detachProjectedView(ViewData view);
    @JsMethod(namespace="ng.core", name = "moveEmbeddedView")
    public static native ViewData moveEmbeddedView(ElementData elementData, Number oldViewIndex, Number newViewIndex);
    @JsMethod(namespace="ng.core", name = "renderDetachView")
    public static native void renderDetachView(ViewData view);
    @JsMethod(namespace="ng.core", name = "asNativeElements")
    public static native Object asNativeElements(Array<DebugElement> debugEls);
    @JsMethod(namespace="ng.core", name = "getDebugNode")
    public static native DebugNode getDebugNode(Object nativeNode);
    @JsMethod(namespace="ng.core", name = "getAllDebugNodes")
    public static native Array<DebugNode> getAllDebugNodes();
    @JsMethod(namespace="ng.core", name = "indexDebugNode")
    public static native void indexDebugNode(DebugNode node);
    @JsMethod(namespace="ng.core", name = "removeDebugNodeFromIndex")
    public static native void removeDebugNodeFromIndex(DebugNode node);
    @JsMethod(namespace="ng.core", name = "setTestabilityGetter")
    public static native void setTestabilityGetter(GetTestability getter);
    @JsMethod(namespace="ng.core", name = "platformCore")
    public static native PlatformRef platformCore(Array<Provider_UnionOfArrayOfObjectAndClassProviderAndExistingProviderAndFactoryProviderAndTypeProviderAndValueProvider> extraProviders /* optional */);
    @JsMethod(namespace="ng.core", name = "_iterableDiffersFactory")
    public static native IterableDiffers _iterableDiffersFactory();
    @JsMethod(namespace="ng.core", name = "_keyValueDiffersFactory")
    public static native KeyValueDiffers _keyValueDiffersFactory();
    @JsMethod(namespace="ng.core", name = "_localeFactory")
    public static native String _localeFactory(String locale /* optional */);
    @JsMethod(namespace="ng.core", name = "detectWTF")
    public static native Boolean detectWTF();
    @JsMethod(namespace="ng.core", name = "createScope")
    public static native Object createScope(String signature, Object flags /* optional */);
    @JsMethod(namespace="ng.core", name = "leave")
    public static native <T> void leave(Scope scope);
    @JsMethod(namespace="ng.core", name = "leave")
    public static native <T> T leave(Scope scope, T returnValue /* optional */);
    @JsMethod(namespace="ng.core", name = "startTimeRange")
    public static native Range startTimeRange(String rangeType, String action);
    @JsMethod(namespace="ng.core", name = "endTimeRange")
    public static native void endTimeRange(Range range);
    @JsMethod(namespace="ng.core", name = "wtfCreateScope")
    public static native WtfScopeFn wtfCreateScope(String signature, Object flags /* optional */);
    @JsMethod(namespace="ng.core", name = "wtfLeave")
    public static native <T> T wtfLeave(Object scope, T returnValue /* optional */);
    @JsMethod(namespace="ng.core", name = "wtfStartTimeRange")
    public static native Object wtfStartTimeRange(String rangeType, String action);
    @JsMethod(namespace="ng.core", name = "wtfEndTimeRange")
    public static native void wtfEndTimeRange(Object range);
    @JsMethod(namespace="ng.core", name = "getType")
    public static native Function getType(Error error);
    @JsMethod(namespace="ng.core", name = "getDebugContext")
    public static native DebugContext getDebugContext(Error error);
    @JsMethod(namespace="ng.core", name = "getOriginalError")
    public static native Error getOriginalError(Error error);
    @JsMethod(namespace="ng.core", name = "getErrorLogger")
    public static native Action2<Console, Object> getErrorLogger(Error error);
    @JsMethod(namespace="ng.core", name = "getSymbolIterator")
    public static native String getSymbolIterator();
    @JsMethod(namespace="ng.core", name = "scheduleMicroTask")
    public static native void scheduleMicroTask(Function fn);
    @JsMethod(namespace="ng.core", name = "looseIdentical")
    public static native Boolean looseIdentical(Object a, Object b);
    @JsMethod(namespace="ng.core", name = "stringify")
    public static native String stringify(Object token);
    @JsMethod(namespace="ng.core", name = "isPromise")
    public static native Boolean isPromise(Object obj);
    @JsMethod(namespace="ng.core", name = "isObservable")
    public static native Boolean isObservable(Object obj);
    @JsMethod(namespace="ng.core", name = "noProviderError")
    public static native InjectionError noProviderError(ReflectiveInjector injector, ReflectiveKey key);
    @JsMethod(namespace="ng.core", name = "cyclicDependencyError")
    public static native InjectionError cyclicDependencyError(ReflectiveInjector injector, ReflectiveKey key);
    @JsMethod(namespace="ng.core", name = "instantiationError")
    public static native InjectionError instantiationError(ReflectiveInjector injector, Object originalException, Object originalStack, ReflectiveKey key);
    @JsMethod(namespace="ng.core", name = "invalidProviderError")
    public static native Error invalidProviderError(Object provider);
    @JsMethod(namespace="ng.core", name = "noAnnotationError")
    public static native Error noAnnotationError(UnionOfFunctionAndTypeOfObject typeOrFunc, Array<Array<Object>> params);
    @JsMethod(namespace="ng.core", name = "outOfBoundsError")
    public static native Error outOfBoundsError(Number index);
    @JsMethod(namespace="ng.core", name = "mixingMultiProvidersWithRegularProvidersError")
    public static native Error mixingMultiProvidersWithRegularProvidersError(Object provider1, Object provider2);
    @JsMethod(namespace="ng.core", name = "expressionChangedAfterItHasBeenCheckedError")
    public static native Error expressionChangedAfterItHasBeenCheckedError(DebugContext context, Object oldValue, Object currValue, Boolean isFirstCheck);
    @JsMethod(namespace="ng.core", name = "viewWrappedDebugError")
    public static native Error viewWrappedDebugError(Object err, DebugContext context);
    @JsMethod(namespace="ng.core", name = "viewDebugError")
    public static native Error viewDebugError(String msg, DebugContext context);
    @JsMethod(namespace="ng.core", name = "isViewDebugError")
    public static native Boolean isViewDebugError(Error err);
    @JsMethod(namespace="ng.core", name = "viewDestroyedError")
    public static native Error viewDestroyedError(String action);
}

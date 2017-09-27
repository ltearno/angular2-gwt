package fr.lteconsulting.jsinterop.ng;

import fr.lteconsulting.jsinterop.Provider_UnionOfArrayOfObjectAndClassProviderAndExistingProviderAndFactoryProviderAndTypeProviderAndValueProvider;
import fr.lteconsulting.jsinterop.Tuple;
import fr.lteconsulting.jsinterop.UnionOfAnimationMetadataAndArrayOfAnimationMetadata;
import fr.lteconsulting.jsinterop.UnionOfArrayOfThetaStyleDataAndThetaStyleData;
import fr.lteconsulting.jsinterop.browser.AnonymousType717;
import fr.lteconsulting.jsinterop.browser.AnonymousType772;
import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.Map;
import fr.lteconsulting.jsinterop.browser.PropertyKey_UnionOfNumberAndString;
import fr.lteconsulting.jsinterop.browser.UnionOfAnonymousType717AndMapOfObjectAndObject;
import fr.lteconsulting.jsinterop.browser.UnionOfAnonymousType719AndArrayOfUnionOfAnonymousType719AndStringAndString;
import fr.lteconsulting.jsinterop.browser.UnionOfFunction2OfObjectAndObjectAndBooleanAndString;
import fr.lteconsulting.jsinterop.browser.UnionOfObjectAndNumberAndString;
import fr.lteconsulting.jsinterop.ng.core.InjectionToken;
import fr.lteconsulting.jsinterop.ng.core.NgZone;
import fr.lteconsulting.jsinterop.ng.platformBrowser.DomRendererFactory2;
import fr.lteconsulting.prebuilt.Function;
import fr.lteconsulting.prebuilt.Function1;
import fr.lteconsulting.prebuilt.Function2;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 

  * Wrapper class for all global definition of ng (java fr.lteconsulting.jsinterop.ng) package
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ng")
public class GlobalScope_Ng
{

    /*
        Static properties
    */

    @JsProperty(namespace="ng", name="DEFAULT_STATE_VALUE")
    public static StateValue DEFAULT_STATE_VALUE;

    @JsProperty(namespace="ng", name="DELETED_STATE_VALUE")
    public static StateValue DELETED_STATE_VALUE;

    @JsProperty(namespace="ng", name="HTTP_INTERCEPTORS")
    public static InjectionToken<Array<HttpInterceptor>> HTTP_INTERCEPTORS;

    @JsProperty(namespace="ng", name="XSRF_COOKIE_NAME")
    public static InjectionToken<String> XSRF_COOKIE_NAME;

    @JsProperty(namespace="ng", name="XSRF_HEADER_NAME")
    public static InjectionToken<String> XSRF_HEADER_NAME;

    @JsProperty(namespace="ng", name="BROWSER_ANIMATIONS_PROVIDERS")
    public static Array<Provider_UnionOfArrayOfObjectAndClassProviderAndExistingProviderAndFactoryProviderAndTypeProviderAndValueProvider> BROWSER_ANIMATIONS_PROVIDERS;

    @JsProperty(namespace="ng", name="BROWSER_NOOP_ANIMATIONS_PROVIDERS")
    public static Array<Provider_UnionOfArrayOfObjectAndClassProviderAndExistingProviderAndFactoryProviderAndTypeProviderAndValueProvider> BROWSER_NOOP_ANIMATIONS_PROVIDERS;

    @JsProperty(namespace="ng", name="RouterUpgradeInitializer")
    public static Object RouterUpgradeInitializer;

    /*
        Static methods
    */
    @JsMethod(namespace="ng", name = "trigger")
    public static native AnimationTriggerMetadata trigger(String name, Array<AnimationMetadata> definitions);
    @JsMethod(namespace="ng", name = "animate")
    public static native AnimationAnimateMetadata animate(PropertyKey_UnionOfNumberAndString timings, UnionOfAnimationKeyframesSequenceMetadataAndAnimationStyleMetadata styles /* optional */);
    @JsMethod(namespace="ng", name = "group")
    public static native AnimationGroupMetadata group(Array<AnimationMetadata> steps, AnimationOptions options /* optional */);
    @JsMethod(namespace="ng", name = "sequence")
    public static native AnimationSequenceMetadata sequence(Array<AnimationMetadata> steps, AnimationOptions options /* optional */);
    @JsMethod(namespace="ng", name = "style")
    public static native AnimationStyleMetadata style(UnionOfAnonymousType719AndArrayOfUnionOfAnonymousType719AndStringAndString tokens);
    @JsMethod(namespace="ng", name = "state")
    public static native AnimationStateMetadata state(String name, AnimationStyleMetadata styles, Object options /* optional */);
    @JsMethod(namespace="ng", name = "keyframes")
    public static native AnimationKeyframesSequenceMetadata keyframes(Array<AnimationStyleMetadata> steps);
    @JsMethod(namespace="ng", name = "transition")
    public static native AnimationTransitionMetadata transition(String stateChangeExpr, UnionOfAnimationMetadataAndArrayOfAnimationMetadata steps, AnimationOptions options /* optional */);
    @JsMethod(namespace="ng", name = "animation")
    public static native AnimationReferenceMetadata animation(UnionOfAnimationMetadataAndArrayOfAnimationMetadata steps, AnimationOptions options /* optional */);
    @JsMethod(namespace="ng", name = "animateChild")
    public static native AnimationAnimateChildMetadata animateChild(AnimateChildOptions options /* optional */);
    @JsMethod(namespace="ng", name = "useAnimation")
    public static native AnimationAnimateRefMetadata useAnimation(AnimationReferenceMetadata animation, AnimationOptions options /* optional */);
    @JsMethod(namespace="ng", name = "query")
    public static native AnimationQueryMetadata query(String selector, UnionOfAnimationMetadataAndArrayOfAnimationMetadata animation, AnimationQueryOptions options /* optional */);
    @JsMethod(namespace="ng", name = "stagger")
    public static native AnimationStaggerMetadata stagger(PropertyKey_UnionOfNumberAndString timings, UnionOfAnimationMetadataAndArrayOfAnimationMetadata animation);
    @JsMethod(namespace="ng", name = "createTimelineInstruction")
    public static native AnimationTimelineInstruction createTimelineInstruction(Object element, Array<ThetaStyleData> keyframes, Array<String> preStyleProps, Array<String> postStyleProps, Number duration, Number delay, String easing /* optional */, Boolean subTimeline /* optional */);
    @JsMethod(namespace="ng", name = "supportsWebAnimations")
    public static native Boolean supportsWebAnimations();
    @JsMethod(namespace="ng", name = "visitAnimationNode")
    public static native Object visitAnimationNode(AnimationDslVisitor visitor, AnimationMetadata node, Object context);
    @JsMethod(namespace="ng", name = "buildAnimationAst")
    public static native Ast buildAnimationAst(UnionOfAnimationMetadataAndArrayOfAnimationMetadata metadata, Array<Object> errors);
    @JsMethod(namespace="ng", name = "buildAnimationTimelines")
    public static native Array<AnimationTimelineInstruction> buildAnimationTimelines(AnimationDriver driver, Object rootElement, Ast ast, ThetaStyleData startingStyles, ThetaStyleData finalStyles, AnimationOptions options, ElementInstructionMap subInstructions /* optional */, Array<Object> errors /* optional */);
    @JsMethod(namespace="ng", name = "parseTransitionExpr")
    public static native Array<Function2<Object, Object, Boolean>> parseTransitionExpr(UnionOfFunction2OfObjectAndObjectAndBooleanAndString transitionValue, Array<String> errors);
    @JsMethod(namespace="ng", name = "createTransitionInstruction")
    public static native AnimationTransitionInstruction createTransitionInstruction(Object element, String triggerName, String fromState, String toState, Boolean isRemovalTransition, ThetaStyleData fromStyles, ThetaStyleData toStyles, Array<AnimationTimelineInstruction> timelines, Array<Object> queriedElements, Map<Object, AnonymousType772> preStyleProps, Map<Object, AnonymousType772> postStyleProps, Array<Object> errors /* optional */);
    @JsMethod(namespace="ng", name = "buildTrigger")
    public static native AnimationTrigger buildTrigger(String name, TriggerAst ast);
    @JsMethod(namespace="ng", name = "optimizeGroupPlayer")
    public static native AnimationPlayer optimizeGroupPlayer(Array<AnimationPlayer> players);
    @JsMethod(namespace="ng", name = "normalizeKeyframes")
    public static native Array<ThetaStyleData> normalizeKeyframes(AnimationDriver driver, AnimationStyleNormalizer normalizer, Object element, Array<ThetaStyleData> keyframes, ThetaStyleData preStyles /* optional */, ThetaStyleData postStyles /* optional */);
    @JsMethod(namespace="ng", name = "listenOnPlayer")
    public static native void listenOnPlayer(AnimationPlayer player, String eventName, AnimationEvent event, Function1<Object, Object> callback);
    @JsMethod(namespace="ng", name = "copyAnimationEvent")
    public static native AnimationEvent copyAnimationEvent(AnimationEvent e, String phaseName /* optional */, Number totalTime /* optional */);
    @JsMethod(namespace="ng", name = "makeAnimationEvent")
    public static native AnimationEvent makeAnimationEvent(Object element, String triggerName, String fromState, String toState, String phaseName /* optional */, Number totalTime /* optional */);
    @JsMethod(namespace="ng", name = "getOrSetAsInMap")
    public static native Object getOrSetAsInMap(UnionOfAnonymousType717AndMapOfObjectAndObject map, Object key, Object defaultValue);
    @JsMethod(namespace="ng", name = "parseTimelineCommand")
    public static native Tuple<String, String> parseTimelineCommand(String command);
    @JsMethod(namespace="ng", name = "matchesElement")
    public static native Boolean matchesElement(Object element, String selector);
    @JsMethod(namespace="ng", name = "containsElement")
    public static native Boolean containsElement(Object elm1, Object elm2);
    @JsMethod(namespace="ng", name = "invokeQuery")
    public static native Array<Object> invokeQuery(Object element, String selector, Boolean multi);
    @JsMethod(namespace="ng", name = "resolveTimingValue")
    public static native Number resolveTimingValue(PropertyKey_UnionOfNumberAndString value);
    @JsMethod(namespace="ng", name = "resolveTiming")
    public static native Object resolveTiming(UnionOfObjectAndNumberAndString timings, Array<Object> errors, Boolean allowNegativeValues /* optional */);
    @JsMethod(namespace="ng", name = "copyObj")
    public static native AnonymousType717 copyObj(AnonymousType717 obj, AnonymousType717 destination /* optional */);
    @JsMethod(namespace="ng", name = "normalizeStyles")
    public static native ThetaStyleData normalizeStyles(UnionOfArrayOfThetaStyleDataAndThetaStyleData styles);
    @JsMethod(namespace="ng", name = "copyStyles")
    public static native ThetaStyleData copyStyles(ThetaStyleData styles, Boolean readPrototype, ThetaStyleData destination /* optional */);
    @JsMethod(namespace="ng", name = "setStyles")
    public static native void setStyles(Object element, ThetaStyleData styles);
    @JsMethod(namespace="ng", name = "eraseStyles")
    public static native void eraseStyles(Object element, ThetaStyleData styles);
    @JsMethod(namespace="ng", name = "normalizeAnimationEntry")
    public static native AnimationMetadata normalizeAnimationEntry(UnionOfAnimationMetadataAndArrayOfAnimationMetadata steps);
    @JsMethod(namespace="ng", name = "validateStyleParams")
    public static native void validateStyleParams(PropertyKey_UnionOfNumberAndString value, AnimationOptions options, Array<Object> errors);
    @JsMethod(namespace="ng", name = "extractStyleParams")
    public static native Array<String> extractStyleParams(PropertyKey_UnionOfNumberAndString value);
    @JsMethod(namespace="ng", name = "interpolateParams")
    public static native PropertyKey_UnionOfNumberAndString interpolateParams(PropertyKey_UnionOfNumberAndString value, AnonymousType717 params, Array<Object> errors);
    @JsMethod(namespace="ng", name = "iteratorToArray")
    public static native Array<Object> iteratorToArray(Object iterator);
    @JsMethod(namespace="ng", name = "mergeAnimationOptions")
    public static native AnimationOptions mergeAnimationOptions(AnimationOptions source, AnimationOptions destination);
    @JsMethod(namespace="ng", name = "dashCaseToCamelCase")
    public static native String dashCaseToCamelCase(String input);
    @JsMethod(namespace="ng", name = "allowPreviousPlayerStylesMerge")
    public static native Boolean allowPreviousPlayerStylesMerge(Number duration, Number delay);
    @JsMethod(namespace="ng", name = "scheduleMicroTask")
    public static native void scheduleMicroTask(Function<Object> cb);
    @JsMethod(namespace="ng", name = "interceptingHandler")
    public static native HttpHandler interceptingHandler(HttpBackend backend, Array<HttpInterceptor> interceptors /* optional */);
    @JsMethod(namespace="ng", name = "jsonpCallbackContext")
    public static native Object jsonpCallbackContext();
    @JsMethod(namespace="ng", name = "instantiateSupportedAnimationDriver")
    public static native NoopAnimationDriver instantiateSupportedAnimationDriver();
    @JsMethod(namespace="ng", name = "instantiateDefaultStyleNormalizer")
    public static native WebAnimationsStyleNormalizer instantiateDefaultStyleNormalizer();
    @JsMethod(namespace="ng", name = "instantiateRendererFactory")
    public static native AnimationRendererFactory instantiateRendererFactory(DomRendererFactory2 renderer, AnimationEngine engine, NgZone zone);
    @JsMethod(namespace="ng", name = "setUpLocationSync")
    public static native void setUpLocationSync(Object ngUpgrade);
}

package fr.lteconsulting.jsinterop.ng;

import fr.lteconsulting.jsinterop.browser.AnonymousType793;
import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.Map;
import fr.lteconsulting.jsinterop.browser.Promise;
import fr.lteconsulting.jsinterop.browser.Set;
import fr.lteconsulting.prebuilt.Action2;
import fr.lteconsulting.prebuilt.Function;
import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/animations/browser/src/render/transition_animation_engine".TransitionAnimationEngine
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/animations/browser/src/render/transition_animation_engine.d.ts:2712
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng", name="TransitionAnimationEngine")
public class TransitionAnimationEngine
{

    /*
        Constructors
    */
    public TransitionAnimationEngine(AnimationDriver driver, AnimationStyleNormalizer _normalizer){
    }

    /*
        Properties
    */

    public Object _flushFns;

    @JsProperty( name = "_flushFns")
    public native Object get_flushFns();

    @JsProperty( name = "_flushFns")
    public native void set_flushFns( Object value );

    public Object _namespaceList;

    @JsProperty( name = "_namespaceList")
    public native Object get_namespaceList();

    @JsProperty( name = "_namespaceList")
    public native void set_namespaceList( Object value );

    public Object _namespaceLookup;

    @JsProperty( name = "_namespaceLookup")
    public native Object get_namespaceLookup();

    @JsProperty( name = "_namespaceLookup")
    public native void set_namespaceLookup( Object value );

    public Object _normalizer;

    @JsProperty( name = "_normalizer")
    public native Object get_normalizer();

    @JsProperty( name = "_normalizer")
    public native void set_normalizer( Object value );

    public Object _whenQuietFns;

    @JsProperty( name = "_whenQuietFns")
    public native Object get_whenQuietFns();

    @JsProperty( name = "_whenQuietFns")
    public native void set_whenQuietFns( Object value );

    public Array<Object> collectedEnterElements;

    @JsProperty( name = "collectedEnterElements")
    public native Array<Object> getCollectedEnterElements();

    @JsProperty( name = "collectedEnterElements")
    public native void setCollectedEnterElements( Array<Object> value );

    public Array<Object> collectedLeaveElements;

    @JsProperty( name = "collectedLeaveElements")
    public native Array<Object> getCollectedLeaveElements();

    @JsProperty( name = "collectedLeaveElements")
    public native void setCollectedLeaveElements( Array<Object> value );

    public Set<Object> disabledNodes;

    @JsProperty( name = "disabledNodes")
    public native Set<Object> getDisabledNodes();

    @JsProperty( name = "disabledNodes")
    public native void setDisabledNodes( Set<Object> value );

    public AnimationDriver driver;

    @JsProperty( name = "driver")
    public native AnimationDriver getDriver();

    @JsProperty( name = "driver")
    public native void setDriver( AnimationDriver value );

    public Map<Object, AnimationTransitionNamespace> namespacesByHostElement;

    @JsProperty( name = "namespacesByHostElement")
    public native Map<Object, AnimationTransitionNamespace> getNamespacesByHostElement();

    @JsProperty( name = "namespacesByHostElement")
    public native void setNamespacesByHostElement( Map<Object, AnimationTransitionNamespace> value );

    public Map<Object, AnimationTransitionNamespace> newHostElements;

    @JsProperty( name = "newHostElements")
    public native Map<Object, AnimationTransitionNamespace> getNewHostElements();

    @JsProperty( name = "newHostElements")
    public native void setNewHostElements( Map<Object, AnimationTransitionNamespace> value );

    public Action2<Object, Object> onRemovalComplete;

    @JsProperty( name = "onRemovalComplete")
    public native Action2<Object, Object> getOnRemovalComplete();

    @JsProperty( name = "onRemovalComplete")
    public native void setOnRemovalComplete( Action2<Object, Object> value );

    public Array<TransitionAnimationPlayer> players;

    @JsProperty( name = "players")
    public native Array<TransitionAnimationPlayer> getPlayers();

    @JsProperty( name = "players")
    public native void setPlayers( Array<TransitionAnimationPlayer> value );

    public Map<Object, Array<TransitionAnimationPlayer>> playersByElement;

    @JsProperty( name = "playersByElement")
    public native Map<Object, Array<TransitionAnimationPlayer>> getPlayersByElement();

    @JsProperty( name = "playersByElement")
    public native void setPlayersByElement( Map<Object, Array<TransitionAnimationPlayer>> value );

    public Map<Object, Array<TransitionAnimationPlayer>> playersByQueriedElement;

    @JsProperty( name = "playersByQueriedElement")
    public native Map<Object, Array<TransitionAnimationPlayer>> getPlayersByQueriedElement();

    @JsProperty( name = "playersByQueriedElement")
    public native void setPlayersByQueriedElement( Map<Object, Array<TransitionAnimationPlayer>> value );

    public Array<TransitionAnimationPlayer> queuedPlayers;

    @JsProperty( name = "queuedPlayers")
    public native Array<TransitionAnimationPlayer> getQueuedPlayers();

    @JsProperty( name = "queuedPlayers")
    public native void setQueuedPlayers( Array<TransitionAnimationPlayer> value );

    public Map<Object, AnonymousType793> statesByElement;

    @JsProperty( name = "statesByElement")
    public native Map<Object, AnonymousType793> getStatesByElement();

    @JsProperty( name = "statesByElement")
    public native void setStatesByElement( Map<Object, AnonymousType793> value );

    public Number totalAnimations;

    @JsProperty( name = "totalAnimations")
    public native Number getTotalAnimations();

    @JsProperty( name = "totalAnimations")
    public native void setTotalAnimations( Number value );

    public Number totalQueuedPlayers;

    @JsProperty( name = "totalQueuedPlayers")
    public native Number getTotalQueuedPlayers();

    @JsProperty( name = "totalQueuedPlayers")
    public native void setTotalQueuedPlayers( Number value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(_balanceNamespaceList,3,,P(d3),P(d3))
      * TE Signature : S(_balanceNamespaceList,P(d3),P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/render/transition_animation_engine.d.ts@3819
     */
    public native Object _balanceNamespaceList(Object ns, Object hostElement);
    /** 
      * Std Signature : S(_beforeAnimationBuild,3,,P(d3),P(d3),P(d3))
      * TE Signature : S(_beforeAnimationBuild,P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/render/transition_animation_engine.d.ts@5334
     */
    public native Object _beforeAnimationBuild(Object namespaceId, Object instruction, Object allPreviousPlayersMap);
    /** 
      * Std Signature : S(_buildAnimation,3,,P(d3),P(d3),P(d3),P(d3),P(d3),P(d3))
      * TE Signature : S(_buildAnimation,P(d3),P(d3),P(d3),P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/render/transition_animation_engine.d.ts@5418
     */
    public native Object _buildAnimation(Object namespaceId, Object instruction, Object allPreviousPlayersMap, Object skippedPlayersMap, Object preStylesMap, Object postStylesMap);
    /** 
      * Std Signature : S(_buildInstruction,3,,P(d3),P(d3))
      * TE Signature : S(_buildInstruction,P(d3),P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/render/transition_animation_engine.d.ts@4737
     */
    public native Object _buildInstruction(Object entry, Object subTimelines);
    /** 
      * Std Signature : S(_buildPlayer,3,,P(d3),P(d3),P(d3))
      * TE Signature : S(_buildPlayer,P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/render/transition_animation_engine.d.ts@5544
     */
    public native Object _buildPlayer(Object instruction, Object keyframes, Object previousPlayers);
    /** 
      * Std Signature : S(_fetchNamespace,3,,P(d3))
      * TE Signature : S(_fetchNamespace,P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/render/transition_animation_engine.d.ts@4097
     */
    public native Object _fetchNamespace(Object id);
    /** 
      * Std Signature : S(_flushAnimations,3,,P(d3),P(d3))
      * TE Signature : S(_flushAnimations,P(d3),P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/render/transition_animation_engine.d.ts@5007
     */
    public native Object _flushAnimations(Object cleanupFns, Object microtaskId);
    /** 
      * Std Signature : S(_getPreviousPlayers,3,,P(d3),P(d3))
      * TE Signature : S(_getPreviousPlayers,P(d3),P(d3))
      * 
     */
    public native Object _getPreviousPlayers(Object element, Object isQueriedElement);
    /** 
      * Std Signature : S(_getPreviousPlayers,3,,P(d3),P(d3),P(d3))
      * TE Signature : S(_getPreviousPlayers,P(d3),P(d3),P(d3))
      * 
     */
    public native Object _getPreviousPlayers(Object element, Object isQueriedElement, Object namespaceId /* optional */);
    /** 
      * Std Signature : S(_getPreviousPlayers,3,,P(d3),P(d3),P(d3),P(d3))
      * TE Signature : S(_getPreviousPlayers,P(d3),P(d3),P(d3),P(d3))
      * 
     */
    public native Object _getPreviousPlayers(Object element, Object isQueriedElement, Object namespaceId /* optional */, Object triggerName /* optional */);
    /** 
      * Std Signature : S(_getPreviousPlayers,3,,P(d3),P(d3),P(d3),P(d3),P(d3))
      * TE Signature : S(_getPreviousPlayers,P(d3),P(d3),P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/render/transition_animation_engine.d.ts@5231
     */
    public native Object _getPreviousPlayers(Object element, Object isQueriedElement, Object namespaceId /* optional */, Object triggerName /* optional */, Object toStateValue /* optional */);
    /** 
      * Std Signature : S(_onRemovalComplete,429,,P(d3),P(d3))
      * TE Signature : S(_onRemovalComplete,P(d3),P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/render/transition_animation_engine.d.ts@3533
     */
    public native void _onRemovalComplete(Object element, Object context);
    /** 
      * Std Signature : S(afterFlush,429,,P(dFR--S(?,3,,)------)<3>))
      * TE Signature : S(afterFlush,P(dF--S(?,)------)))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/render/transition_animation_engine.d.ts@5131
     */
    public native void afterFlush(Function<Object> callback);
    /** 
      * Std Signature : S(afterFlushAnimationsDone,429,,P(dFR--S(?,3,,)------)<3>))
      * TE Signature : S(afterFlushAnimationsDone,P(dF--S(?,)------)))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/render/transition_animation_engine.d.ts@5174
     */
    public native void afterFlushAnimationsDone(Function<Object> callback);
    /** 
      * Std Signature : S(collectEnterElement,429,,P(d3))
      * TE Signature : S(collectEnterElement,P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/render/transition_animation_engine.d.ts@4306
     */
    public native void collectEnterElement(Object element);
    /** 
      * Std Signature : S(createNamespace,1195,,P(d1),P(d3))
      * TE Signature : S(createNamespace,P(d1),P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/render/transition_animation_engine.d.ts@3729
     */
    public native AnimationTransitionNamespace createNamespace(String namespaceId, Object hostElement);
    /** 
      * Std Signature : S(destroy,429,,P(d1),P(d3))
      * TE Signature : S(destroy,P(d1),P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/render/transition_animation_engine.d.ts@4043
     */
    public native void destroy(String namespaceId, Object context);
    /** 
      * Std Signature : S(destroyInnerAnimations,429,,P(d3))
      * TE Signature : S(destroyInnerAnimations,P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/render/transition_animation_engine.d.ts@4789
     */
    public native void destroyInnerAnimations(Object containerElement);
    /** 
      * Std Signature : S(elementContainsData,27,,P(d1),P(d3))
      * TE Signature : S(elementContainsData,P(d1),P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/render/transition_animation_engine.d.ts@5062
     */
    public native Boolean elementContainsData(String namespaceId, Object element);
    /** 
      * Std Signature : S(flush,429,,)
      * TE Signature : S(flush,)
      * 
     */
    public native void flush();
    /** 
      * Std Signature : S(flush,429,,P(d2))
      * TE Signature : S(flush,P(d2))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/render/transition_animation_engine.d.ts@4927
     */
    public native void flush(Number microtaskId /* optional */);
    /** 
      * Std Signature : S(insertNode,429,,P(d1),P(d3),P(d3),P(d27))
      * TE Signature : S(insertNode,P(d1),P(d3),P(d3),P(d27))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/render/transition_animation_engine.d.ts@4213
     */
    public native void insertNode(String namespaceId, Object element, Object parent, Boolean insertBefore);
    /** 
      * Std Signature : S(listen,FR--S(?,3,,)------)<3>,,P(d1),P(d3),P(d1),P(d1),P(dFP1-,R--S(?,4,,P(d3))------)<3,27>))
      * TE Signature : S(listen,P(d1),P(d3),P(d1),P(d1),P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/render/transition_animation_engine.d.ts@4615
     */
    public native Function<Object> listen(String namespaceId, Object element, String name, String phase, Function1<Object, Boolean> callback);
    /** 
      * Std Signature : S(markElementAsDisabled,429,,P(d3),P(d27))
      * TE Signature : S(markElementAsDisabled,P(d3),P(d27))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/render/transition_animation_engine.d.ts@4351
     */
    public native void markElementAsDisabled(Object element, Boolean value);
    /** 
      * Std Signature : S(markElementAsRemoved,429,,P(d1),P(d3))
      * TE Signature : S(markElementAsRemoved,P(d1),P(d3))
      * 
     */
    public native void markElementAsRemoved(String namespaceId, Object element);
    /** 
      * Std Signature : S(markElementAsRemoved,429,,P(d1),P(d3),P(d27))
      * TE Signature : S(markElementAsRemoved,P(d1),P(d3),P(d27))
      * 
     */
    public native void markElementAsRemoved(String namespaceId, Object element, Boolean hasAnimation /* optional */);
    /** 
      * Std Signature : S(markElementAsRemoved,429,,P(d1),P(d3),P(d27),P(d3))
      * TE Signature : S(markElementAsRemoved,P(d1),P(d3),P(d27),P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/render/transition_animation_engine.d.ts@4509
     */
    public native void markElementAsRemoved(String namespaceId, Object element, Boolean hasAnimation /* optional */, Object context /* optional */);
    /** 
      * Std Signature : S(processLeaveNode,429,,P(d3))
      * TE Signature : S(processLeaveNode,P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/render/transition_animation_engine.d.ts@4885
     */
    public native void processLeaveNode(Object element);
    /** 
      * Std Signature : S(register,1195,,P(d1),P(d3))
      * TE Signature : S(register,P(d1),P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/render/transition_animation_engine.d.ts@3871
     */
    public native AnimationTransitionNamespace register(String namespaceId, Object hostElement);
    /** 
      * Std Signature : S(registerTrigger,429,,P(d1),P(d1),P(d327))
      * TE Signature : S(registerTrigger,P(d1),P(d1),P(d327))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/render/transition_animation_engine.d.ts@3954
     */
    public native void registerTrigger(String namespaceId, String name, AnimationTrigger trigger);
    /** 
      * Std Signature : S(removeNode,429,,P(d1),P(d3),P(d3))
      * TE Signature : S(removeNode,P(d1),P(d3),P(d3))
      * 
     */
    public native void removeNode(String namespaceId, Object element, Object context);
    /** 
      * Std Signature : S(removeNode,429,,P(d1),P(d3),P(d3),P(d27))
      * TE Signature : S(removeNode,P(d1),P(d3),P(d3),P(d27))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/render/transition_animation_engine.d.ts@4414
     */
    public native void removeNode(String namespaceId, Object element, Object context, Boolean doNotRecurse /* optional */);
    /** 
      * Std Signature : S(reportError,429,,P(d7<1>))
      * TE Signature : S(reportError,P(d7))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/render/transition_animation_engine.d.ts@4966
     */
    public native void reportError(Array<String> errors);
    /** 
      * Std Signature : S(trigger,27,,P(d1),P(d3),P(d1),P(d3))
      * TE Signature : S(trigger,P(d1),P(d3),P(d1),P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/render/transition_animation_engine.d.ts@4130
     */
    public native Boolean trigger(String namespaceId, Object element, String name, Object value);
    /** 
      * Std Signature : S(whenRenderingDone,88<3>,,)
      * TE Signature : S(whenRenderingDone,)
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/render/transition_animation_engine.d.ts@4846
     */
    public native Promise<Object> whenRenderingDone();
}

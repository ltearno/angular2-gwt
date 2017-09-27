package fr.lteconsulting.jsinterop.ng;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.prebuilt.Function;
import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/animations/browser/src/render/transition_animation_engine".AnimationTransitionNamespace
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/animations/browser/src/render/transition_animation_engine.d.ts:1492
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng", name="AnimationTransitionNamespace")
public class AnimationTransitionNamespace
{

    /*
        Constructors
    */
    public AnimationTransitionNamespace(String id, Object hostElement, TransitionAnimationEngine _engine){
    }

    /*
        Properties
    */

    public Object _elementListeners;

    @JsProperty( name = "_elementListeners")
    public native Object get_elementListeners();

    @JsProperty( name = "_elementListeners")
    public native void set_elementListeners( Object value );

    public Object _engine;

    @JsProperty( name = "_engine")
    public native Object get_engine();

    @JsProperty( name = "_engine")
    public native void set_engine( Object value );

    public Object _hostClassName;

    @JsProperty( name = "_hostClassName")
    public native Object get_hostClassName();

    @JsProperty( name = "_hostClassName")
    public native void set_hostClassName( Object value );

    public Object _queue;

    @JsProperty( name = "_queue")
    public native Object get_queue();

    @JsProperty( name = "_queue")
    public native void set_queue( Object value );

    public Object _triggers;

    @JsProperty( name = "_triggers")
    public native Object get_triggers();

    @JsProperty( name = "_triggers")
    public native void set_triggers( Object value );

    public Object hostElement;

    @JsProperty( name = "hostElement")
    public native Object getHostElement();

    @JsProperty( name = "hostElement")
    public native void setHostElement( Object value );

    public String id;

    @JsProperty( name = "id")
    public native String getId();

    @JsProperty( name = "id")
    public native void setId( String value );

    public Array<TransitionAnimationPlayer> players;

    @JsProperty( name = "players")
    public native Array<TransitionAnimationPlayer> getPlayers();

    @JsProperty( name = "players")
    public native void setPlayers( Array<TransitionAnimationPlayer> value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(_destroyInnerNodes,3,,P(d3),P(d3))
      * TE Signature : S(_destroyInnerNodes,P(d3),P(d3))
      * 
     */
    public native Object _destroyInnerNodes(Object rootElement, Object context);
    /** 
      * Std Signature : S(_destroyInnerNodes,3,,P(d3),P(d3),P(d3))
      * TE Signature : S(_destroyInnerNodes,P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/render/transition_animation_engine.d.ts@2234
     */
    public native Object _destroyInnerNodes(Object rootElement, Object context, Object animate /* optional */);
    /** 
      * Std Signature : S(_getTrigger,3,,P(d3))
      * TE Signature : S(_getTrigger,P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/render/transition_animation_engine.d.ts@1996
     */
    public native Object _getTrigger(Object name);
    /** 
      * Std Signature : S(clearElementCache,429,,P(d3))
      * TE Signature : S(clearElementCache,P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/render/transition_animation_engine.d.ts@2191
     */
    public native void clearElementCache(Object element);
    /** 
      * Std Signature : S(deregister,429,,P(d1))
      * TE Signature : S(deregister,P(d1))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/render/transition_animation_engine.d.ts@2155
     */
    public native void deregister(String name);
    /** 
      * Std Signature : S(destroy,429,,P(d3))
      * TE Signature : S(destroy,P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/render/transition_animation_engine.d.ts@2490
     */
    public native void destroy(Object context);
    /** 
      * Std Signature : S(drainQueuedTransitions,7<1194>,,P(d2))
      * TE Signature : S(drainQueuedTransitions,P(d2))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/render/transition_animation_engine.d.ts@2421
     */
    public native Array<QueueInstruction> drainQueuedTransitions(Number microtaskId);
    /** 
      * Std Signature : S(elementContainsData,27,,P(d3))
      * TE Signature : S(elementContainsData,P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/render/transition_animation_engine.d.ts@2523
     */
    public native Boolean elementContainsData(Object element);
    /** 
      * Std Signature : S(insertNode,429,,P(d3),P(d3))
      * TE Signature : S(insertNode,P(d3),P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/render/transition_animation_engine.d.ts@2372
     */
    public native void insertNode(Object element, Object parent);
    /** 
      * Std Signature : S(listen,FR--S(?,3,,)------)<3>,,P(d3),P(d1),P(d1),P(dFP1-,R--S(?,4,,P(d3))------)<3,27>))
      * TE Signature : S(listen,P(d3),P(d1),P(d1),P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/render/transition_animation_engine.d.ts@1835
     */
    public native Function<Object> listen(Object element, String name, String phase, Function1<Object, Boolean> callback);
    /** 
      * Std Signature : S(register,27,,P(d1),P(d327))
      * TE Signature : S(register,P(d1),P(d327))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/render/transition_animation_engine.d.ts@1936
     */
    public native Boolean register(String name, AnimationTrigger ast);
    /** 
      * Std Signature : S(removeNode,429,,P(d3),P(d3))
      * TE Signature : S(removeNode,P(d3),P(d3))
      * 
     */
    public native void removeNode(Object element, Object context);
    /** 
      * Std Signature : S(removeNode,429,,P(d3),P(d3),P(d27))
      * TE Signature : S(removeNode,P(d3),P(d3),P(d27))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/render/transition_animation_engine.d.ts@2298
     */
    public native void removeNode(Object element, Object context, Boolean doNotRecurse /* optional */);
    /** 
      * Std Signature : S(trigger,1193,,P(d3),P(d1),P(d3))
      * TE Signature : S(trigger,P(d3),P(d1),P(d3))
      * 
     */
    public native TransitionAnimationPlayer trigger(Object element, String triggerName, Object value);
    /** 
      * Std Signature : S(trigger,1193,,P(d3),P(d1),P(d3),P(d27))
      * TE Signature : S(trigger,P(d3),P(d1),P(d3),P(d27))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/render/transition_animation_engine.d.ts@2027
     */
    public native TransitionAnimationPlayer trigger(Object element, String triggerName, Object value, Boolean defaultToFallback /* optional */);
}

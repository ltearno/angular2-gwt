package fr.lteconsulting.jsinterop.ng;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.Promise;
import fr.lteconsulting.prebuilt.Action2;
import fr.lteconsulting.prebuilt.Action3;
import fr.lteconsulting.prebuilt.Action4;
import fr.lteconsulting.prebuilt.Function;
import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/browser/src/render/animation_engine_next".AnimationEngine
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/browser/src/render/animation_engine_next.d.ts:435
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng", name="AnimationEngine")
public class AnimationEngine
{

    /*
        Constructors
    */
    public AnimationEngine(AnimationDriver driver, AnimationStyleNormalizer normalizer){
    }

    /*
        Properties
    */

    public Object _timelineEngine;

    @JsProperty( name = "_timelineEngine")
    public native Object get_timelineEngine();

    @JsProperty( name = "_timelineEngine")
    public native void set_timelineEngine( Object value );

    public Object _transitionEngine;

    @JsProperty( name = "_transitionEngine")
    public native Object get_transitionEngine();

    @JsProperty( name = "_transitionEngine")
    public native void set_transitionEngine( Object value );

    public Object _triggerCache;

    @JsProperty( name = "_triggerCache")
    public native Object get_triggerCache();

    @JsProperty( name = "_triggerCache")
    public native void set_triggerCache( Object value );

    public Action4<String, Object, Object, Boolean> onInsert;

    @JsProperty( name = "onInsert")
    public native Action4<String, Object, Object, Boolean> getOnInsert();

    @JsProperty( name = "onInsert")
    public native void setOnInsert( Action4<String, Object, Object, Boolean> value );

    public Action2<Object, Object> onRemovalComplete;

    @JsProperty( name = "onRemovalComplete")
    public native Action2<Object, Object> getOnRemovalComplete();

    @JsProperty( name = "onRemovalComplete")
    public native void setOnRemovalComplete( Action2<Object, Object> value );

    public Action3<String, Object, Object> onRemove;

    @JsProperty( name = "onRemove")
    public native Action3<String, Object, Object> getOnRemove();

    @JsProperty( name = "onRemove")
    public native void setOnRemove( Action3<String, Object, Object> value );

    public Array<AnimationPlayer> players;

    @JsProperty( name = "players")
    public native Array<AnimationPlayer> getPlayers();

    @JsProperty( name = "players")
    public native void setPlayers( Array<AnimationPlayer> value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(destroy,429,,P(d1),P(d3))
      * TE Signature : S(destroy,P(d1),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/browser/src/render/animation_engine_next.d.ts@903
     */
    public native void destroy(String namespaceId, Object context);
    /** 
      * Std Signature : S(disableAnimations,429,,P(d3),P(d27))
      * TE Signature : S(disableAnimations,P(d3),P(d27))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/browser/src/render/animation_engine_next.d.ts@1117
     */
    public native void disableAnimations(Object element, Boolean disable);
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
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/browser/src/render/animation_engine_next.d.ts@1390
     */
    public native void flush(Number microtaskId /* optional */);
    /** 
      * Std Signature : S(listen,FR--S(?,3,,)------)<3>,,P(d1),P(d3),P(d1),P(d1),P(dFP1-,R--S(?,4,,P(d3))------)<3,5>))
      * TE Signature : S(listen,P(d1),P(d3),P(d1),P(d1),P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/browser/src/render/animation_engine_next.d.ts@1262
     */
    public native Function<Object> listen(String namespaceId, Object element, String eventName, String eventPhase, Function1<Object, Object> callback);
    /** 
      * Std Signature : S(process,429,,P(d1),P(d3),P(d1),P(d3))
      * TE Signature : S(process,P(d1),P(d3),P(d1),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/browser/src/render/animation_engine_next.d.ts@1178
     */
    public native void process(String namespaceId, Object element, String property, Object value);
    /** 
      * Std Signature : S(register,429,,P(d1),P(d3))
      * TE Signature : S(register,P(d1),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/browser/src/render/animation_engine_next.d.ts@844
     */
    public native void register(String namespaceId, Object hostElement);
    /** 
      * Std Signature : S(registerTrigger,429,,P(d1),P(d1),P(d3),P(d1),P(d293))
      * TE Signature : S(registerTrigger,P(d1),P(d1),P(d3),P(d1),P(d293))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/browser/src/render/animation_engine_next.d.ts@707
     */
    public native void registerTrigger(String componentId, String namespaceId, Object hostElement, String name, AnimationTriggerMetadata metadata);
    /** 
      * Std Signature : S(whenRenderingDone,88<3>,,)
      * TE Signature : S(whenRenderingDone,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/browser/src/render/animation_engine_next.d.ts@1470
     */
    public native Promise<Object> whenRenderingDone();
}

package fr.lteconsulting.jsinterop.ng;

import fr.lteconsulting.jsinterop.UnionOfAnimationMetadataAndArrayOfAnimationMetadata;
import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.prebuilt.Action;
import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/animations/browser/src/render/timeline_animation_engine".TimelineAnimationEngine
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/animations/browser/src/render/timeline_animation_engine.d.ts:446
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng", name="TimelineAnimationEngine")
public class TimelineAnimationEngine
{

    /*
        Constructors
    */
    public TimelineAnimationEngine(AnimationDriver _driver, AnimationStyleNormalizer _normalizer){
    }

    /*
        Properties
    */

    public Object _animations;

    @JsProperty( name = "_animations")
    public native Object get_animations();

    @JsProperty( name = "_animations")
    public native void set_animations( Object value );

    public Object _driver;

    @JsProperty( name = "_driver")
    public native Object get_driver();

    @JsProperty( name = "_driver")
    public native void set_driver( Object value );

    public Object _normalizer;

    @JsProperty( name = "_normalizer")
    public native Object get_normalizer();

    @JsProperty( name = "_normalizer")
    public native void set_normalizer( Object value );

    public Object _playersById;

    @JsProperty( name = "_playersById")
    public native Object get_playersById();

    @JsProperty( name = "_playersById")
    public native void set_playersById( Object value );

    public Array<AnimationPlayer> players;

    @JsProperty( name = "players")
    public native Array<AnimationPlayer> getPlayers();

    @JsProperty( name = "players")
    public native void setPlayers( Array<AnimationPlayer> value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(_buildPlayer,3,,P(d3),P(d3))
      * TE Signature : S(_buildPlayer,P(d3),P(d3))
      * 
     */
    public native Object _buildPlayer(Object i, Object preStyles);
    /** 
      * Std Signature : S(_buildPlayer,3,,P(d3),P(d3),P(d3))
      * TE Signature : S(_buildPlayer,P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/render/timeline_animation_engine.d.ts@792
     */
    public native Object _buildPlayer(Object i, Object preStyles, Object postStyles /* optional */);
    /** 
      * Std Signature : S(_getPlayer,3,,P(d3))
      * TE Signature : S(_getPlayer,P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/render/timeline_animation_engine.d.ts@959
     */
    public native Object _getPlayer(Object id);
    /** 
      * Std Signature : S(command,429,,P(d1),P(d3),P(d1),P(d7<3>))
      * TE Signature : S(command,P(d1),P(d3),P(d1),P(d7))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/render/timeline_animation_engine.d.ts@1090
     */
    public native void command(String id, Object element, String command, Array<Object> args);
    /** 
      * Std Signature : S(create,325,,P(d1),P(d3))
      * TE Signature : S(create,P(d1),P(d3))
      * 
     */
    public native AnimationPlayer create(String id, Object element);
    /** 
      * Std Signature : S(create,325,,P(d1),P(d3),P(d284))
      * TE Signature : S(create,P(d1),P(d3),P(d284))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/render/timeline_animation_engine.d.ts@845
     */
    public native AnimationPlayer create(String id, Object element, AnimationOptions options /* optional */);
    /** 
      * Std Signature : S(destroy,429,,P(d1))
      * TE Signature : S(destroy,P(d1))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/render/timeline_animation_engine.d.ts@928
     */
    public native void destroy(String id);
    /** 
      * Std Signature : S(listen,F--S(?,429,,)------),,P(d1),P(d1),P(d1),P(dFP1-,R--S(?,4,,P(d3))------)<3,5>))
      * TE Signature : S(listen,P(d1),P(d1),P(d1),P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/render/timeline_animation_engine.d.ts@987
     */
    public native Action listen(String id, String element, String eventName, Function1<Object, Object> callback);
    /** 
      * Std Signature : S(register,429,,P(d1),P(d285))
      * TE Signature : S(register,P(d1),P(d285))
      * 
     */
    public native void register(String id, AnimationMetadata metadata);
    /** 
      * Std Signature : S(register,429,,P(d1),P(d7<285>))
      * TE Signature : S(register,P(d1),P(d7))
      * 
     */
    public native void register(String id, Array<AnimationMetadata> metadata);
    /** 
      * Std Signature : S(register,429,,P(d1),P(dU(-285,7<2>)))
      * TE Signature : S(register,P(d1),P(dU(-285,7)))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/render/timeline_animation_engine.d.ts@709
     */
    public native void register(String id, UnionOfAnimationMetadataAndArrayOfAnimationMetadata metadata);
}

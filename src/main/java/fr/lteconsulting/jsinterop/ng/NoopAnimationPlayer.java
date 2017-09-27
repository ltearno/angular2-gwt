package fr.lteconsulting.jsinterop.ng;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/src/players/animation_player".NoopAnimationPlayer
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/src/players/animation_player.d.ts:747
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng", name="NoopAnimationPlayer")
public class NoopAnimationPlayer extends AnimationPlayer
{

    /*
        Constructors
    */
    public NoopAnimationPlayer(){
    }

    /*
        Properties
    */

    public Object _destroyed;

    @JsProperty( name = "_destroyed")
    public native Object get_destroyed();

    @JsProperty( name = "_destroyed")
    public native void set_destroyed( Object value );

    public Object _finished;

    @JsProperty( name = "_finished")
    public native Object get_finished();

    @JsProperty( name = "_finished")
    public native void set_finished( Object value );

    public Object _onDestroyFns;

    @JsProperty( name = "_onDestroyFns")
    public native Object get_onDestroyFns();

    @JsProperty( name = "_onDestroyFns")
    public native void set_onDestroyFns( Object value );

    public Object _onDoneFns;

    @JsProperty( name = "_onDoneFns")
    public native Object get_onDoneFns();

    @JsProperty( name = "_onDoneFns")
    public native void set_onDoneFns( Object value );

    public Object _onStartFns;

    @JsProperty( name = "_onStartFns")
    public native Object get_onStartFns();

    @JsProperty( name = "_onStartFns")
    public native void set_onStartFns( Object value );

    public Object _started;

    @JsProperty( name = "_started")
    public native Object get_started();

    @JsProperty( name = "_started")
    public native void set_started( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(_onFinish,3,,)
      * TE Signature : S(_onFinish,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/src/players/animation_player.d.ts@1111
     */
    public native Object _onFinish();
    /** 
      * Std Signature : S(_onStart,3,,)
      * TE Signature : S(_onStart,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/src/players/animation_player.d.ts@1305
     */
    public native Object _onStart();
    /** 
      * Std Signature : S(setPosition,429,,P(d2))
      * TE Signature : S(setPosition,P(d2))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/src/players/animation_player.d.ts@1429
     */
    public native void setPosition(Number p);
}

package fr.lteconsulting.jsinterop.ng;

import fr.lteconsulting.prebuilt.Action;
import fr.lteconsulting.prebuilt.Action1;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/src/players/animation_player".AnimationPlayer
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/src/players/animation_player.d.ts:0

  * AnimationPlayer controls an animation sequence that was produced from a programmatic animation.
  * (see {@link AnimationBuilder AnimationBuilder} for more information on how to create programmatic
  * animations.)
 */
@JsType(isNative=true, namespace="ng", name="AnimationPlayer")
public class AnimationPlayer
{

    /*
        Properties
    */

    public Action1<Action> onDestroy;

    @JsProperty( name = "onDestroy")
    public native Action1<Action> getOnDestroy();

    @JsProperty( name = "onDestroy")
    public native void setOnDestroy( Action1<Action> value );

    public Action1<Action> onDone;

    @JsProperty( name = "onDone")
    public native Action1<Action> getOnDone();

    @JsProperty( name = "onDone")
    public native void setOnDone( Action1<Action> value );

    public Action1<Action> onStart;

    @JsProperty( name = "onStart")
    public native Action1<Action> getOnStart();

    @JsProperty( name = "onStart")
    public native void setOnStart( Action1<Action> value );

    public AnimationPlayer parentPlayer;

    @JsProperty( name = "parentPlayer")
    public native AnimationPlayer getParentPlayer();

    @JsProperty( name = "parentPlayer")
    public native void setParentPlayer( AnimationPlayer value );

    public Number totalTime;

    @JsProperty( name = "totalTime")
    public native Number getTotalTime();

    @JsProperty( name = "totalTime")
    public native void setTotalTime( Number value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(beforeDestroy,3,,)
      * TE Signature : S(beforeDestroy,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/src/players/animation_player.d.ts@735
     */
    public native Object beforeDestroy();
    /** 
      * Std Signature : S(destroy,429,,)
      * TE Signature : S(destroy,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/src/players/animation_player.d.ts@547
     */
    public native void destroy();
    /** 
      * Std Signature : S(finish,429,,)
      * TE Signature : S(finish,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/src/players/animation_player.d.ts@527
     */
    public native void finish();
    /** 
      * Std Signature : S(getPosition,2,,)
      * TE Signature : S(getPosition,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/src/players/animation_player.d.ts@618
     */
    public native Number getPosition();
    /** 
      * Std Signature : S(hasStarted,27,,)
      * TE Signature : S(hasStarted,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/src/players/animation_player.d.ts@442
     */
    public native Boolean hasStarted();
    /** 
      * Std Signature : S(init,429,,)
      * TE Signature : S(init,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/src/players/animation_player.d.ts@424
     */
    public native void init();
    /** 
      * Std Signature : S(pause,429,,)
      * TE Signature : S(pause,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/src/players/animation_player.d.ts@487
     */
    public native void pause();
    /** 
      * Std Signature : S(play,429,,)
      * TE Signature : S(play,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/src/players/animation_player.d.ts@469
     */
    public native void play();
    /** 
      * Std Signature : S(reset,429,,)
      * TE Signature : S(reset,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/src/players/animation_player.d.ts@568
     */
    public native void reset();
    /** 
      * Std Signature : S(restart,429,,)
      * TE Signature : S(restart,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/src/players/animation_player.d.ts@506
     */
    public native void restart();
    /** 
      * Std Signature : S(setPosition,429,,P(d3))
      * TE Signature : S(setPosition,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/src/players/animation_player.d.ts@587
     */
    public native void setPosition(Object p);
}

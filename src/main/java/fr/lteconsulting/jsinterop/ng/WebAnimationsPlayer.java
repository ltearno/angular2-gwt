package fr.lteconsulting.jsinterop.ng;

import fr.lteconsulting.jsinterop.browser.AnonymousType719;
import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/browser/src/render/web_animations/web_animations_player".WebAnimationsPlayer
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/browser/src/render/web_animations/web_animations_player.d.ts:305
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng", name="WebAnimationsPlayer")
public class WebAnimationsPlayer extends AnimationPlayer
{

    /*
        Constructors
    */
    public WebAnimationsPlayer(Object element, Array<AnonymousType719> keyframes, AnonymousType719 options, Array<WebAnimationsPlayer> previousPlayers){
    }

    /*
        Properties
    */

    public Object _delay;

    @JsProperty( name = "_delay")
    public native Object get_delay();

    @JsProperty( name = "_delay")
    public native void set_delay( Object value );

    public Object _destroyed;

    @JsProperty( name = "_destroyed")
    public native Object get_destroyed();

    @JsProperty( name = "_destroyed")
    public native void set_destroyed( Object value );

    public Object _duration;

    @JsProperty( name = "_duration")
    public native Object get_duration();

    @JsProperty( name = "_duration")
    public native void set_duration( Object value );

    public Object _finalKeyframe;

    @JsProperty( name = "_finalKeyframe")
    public native Object get_finalKeyframe();

    @JsProperty( name = "_finalKeyframe")
    public native void set_finalKeyframe( Object value );

    public Object _finished;

    @JsProperty( name = "_finished")
    public native Object get_finished();

    @JsProperty( name = "_finished")
    public native void set_finished( Object value );

    public Object _initialized;

    @JsProperty( name = "_initialized")
    public native Object get_initialized();

    @JsProperty( name = "_initialized")
    public native void set_initialized( Object value );

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

    public Object _player;

    @JsProperty( name = "_player")
    public native Object get_player();

    @JsProperty( name = "_player")
    public native void set_player( Object value );

    public Object _started;

    @JsProperty( name = "_started")
    public native Object get_started();

    @JsProperty( name = "_started")
    public native void set_started( Object value );

    public AnonymousType719 currentSnapshot;

    @JsProperty( name = "currentSnapshot")
    public native AnonymousType719 getCurrentSnapshot();

    @JsProperty( name = "currentSnapshot")
    public native void setCurrentSnapshot( AnonymousType719 value );

    public DOMAnimation domPlayer;

    @JsProperty( name = "domPlayer")
    public native DOMAnimation getDomPlayer();

    @JsProperty( name = "domPlayer")
    public native void setDomPlayer( DOMAnimation value );

    public Object element;

    @JsProperty( name = "element")
    public native Object getElement();

    @JsProperty( name = "element")
    public native void setElement( Object value );

    public Array<AnonymousType719> keyframes;

    @JsProperty( name = "keyframes")
    public native Array<AnonymousType719> getKeyframes();

    @JsProperty( name = "keyframes")
    public native void setKeyframes( Array<AnonymousType719> value );

    public AnonymousType719 options;

    @JsProperty( name = "options")
    public native AnonymousType719 getOptions();

    @JsProperty( name = "options")
    public native void setOptions( AnonymousType719 value );

    public Object previousPlayers;

    @JsProperty( name = "previousPlayers")
    public native Object getPreviousPlayers();

    @JsProperty( name = "previousPlayers")
    public native void setPreviousPlayers( Object value );

    public AnonymousType719 previousStyles;

    @JsProperty( name = "previousStyles")
    public native AnonymousType719 getPreviousStyles();

    @JsProperty( name = "previousStyles")
    public native void setPreviousStyles( AnonymousType719 value );

    public Number time;

    @JsProperty( name = "time")
    public native Number getTime();

    @JsProperty( name = "time")
    public native void setTime( Number value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(_buildPlayer,3,,)
      * TE Signature : S(_buildPlayer,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/browser/src/render/web_animations/web_animations_player.d.ts@1264
     */
    public native Object _buildPlayer();
    /** 
      * Std Signature : S(_onFinish,3,,)
      * TE Signature : S(_onFinish,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/browser/src/render/web_animations/web_animations_player.d.ts@1221
     */
    public native Object _onFinish();
    /** 
      * Std Signature : S(_preparePlayerBeforeStart,3,,)
      * TE Signature : S(_preparePlayerBeforeStart,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/browser/src/render/web_animations/web_animations_player.d.ts@1292
     */
    public native Object _preparePlayerBeforeStart();
    /** 
      * Std Signature : S(_resetDomPlayerState,3,,)
      * TE Signature : S(_resetDomPlayerState,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/browser/src/render/web_animations/web_animations_player.d.ts@1553
     */
    public native Object _resetDomPlayerState();
    /** 
      * Std Signature : S(setPosition,429,,P(d2))
      * TE Signature : S(setPosition,P(d2))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/browser/src/render/web_animations/web_animations_player.d.ts@1658
     */
    public native void setPosition(Number p);
}

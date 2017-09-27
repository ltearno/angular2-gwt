package fr.lteconsulting.jsinterop.ng;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/animations/browser/src/render/transition_animation_engine".TransitionAnimationPlayer
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/animations/browser/src/render/transition_animation_engine.d.ts:5608
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng", name="TransitionAnimationPlayer")
public class TransitionAnimationPlayer extends AnimationPlayer
{

    /*
        Constructors
    */
    public TransitionAnimationPlayer(String namespaceId, String triggerName, Object element){
    }

    /*
        Properties
    */

    public Object _containsRealPlayer;

    @JsProperty( name = "_containsRealPlayer")
    public native Object get_containsRealPlayer();

    @JsProperty( name = "_containsRealPlayer")
    public native void set_containsRealPlayer( Object value );

    public Object _destroyed;

    @JsProperty( name = "_destroyed")
    public native Object get_destroyed();

    @JsProperty( name = "_destroyed")
    public native void set_destroyed( Object value );

    public Object _player;

    @JsProperty( name = "_player")
    public native Object get_player();

    @JsProperty( name = "_player")
    public native void set_player( Object value );

    public Object _queuedCallbacks;

    @JsProperty( name = "_queuedCallbacks")
    public native Object get_queuedCallbacks();

    @JsProperty( name = "_queuedCallbacks")
    public native void set_queuedCallbacks( Object value );

    public Boolean destroyed;

    @JsProperty( name = "destroyed")
    public native Boolean getDestroyed();

    @JsProperty( name = "destroyed")
    public native void setDestroyed( Boolean value );

    public Object element;

    @JsProperty( name = "element")
    public native Object getElement();

    @JsProperty( name = "element")
    public native void setElement( Object value );

    public Boolean markedForDestroy;

    @JsProperty( name = "markedForDestroy")
    public native Boolean getMarkedForDestroy();

    @JsProperty( name = "markedForDestroy")
    public native void setMarkedForDestroy( Boolean value );

    public String namespaceId;

    @JsProperty( name = "namespaceId")
    public native String getNamespaceId();

    @JsProperty( name = "namespaceId")
    public native void setNamespaceId( String value );

    public Boolean queued;

    @JsProperty( name = "queued")
    public native Boolean getQueued();

    @JsProperty( name = "queued")
    public native void setQueued( Boolean value );

    public String triggerName;

    @JsProperty( name = "triggerName")
    public native String getTriggerName();

    @JsProperty( name = "triggerName")
    public native void setTriggerName( String value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(_queueEvent,3,,P(d3),P(d3))
      * TE Signature : S(_queueEvent,P(d3),P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/render/transition_animation_engine.d.ts@6155
     */
    public native Object _queueEvent(Object name, Object callback);
    /** 
      * Std Signature : S(getRealPlayer,325,,)
      * TE Signature : S(getRealPlayer,)
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/render/transition_animation_engine.d.ts@6117
     */
    public native AnimationPlayer getRealPlayer();
    /** 
      * Std Signature : S(setRealPlayer,429,,P(d325))
      * TE Signature : S(setRealPlayer,P(d325))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/render/transition_animation_engine.d.ts@6067
     */
    public native void setRealPlayer(AnimationPlayer player);
}

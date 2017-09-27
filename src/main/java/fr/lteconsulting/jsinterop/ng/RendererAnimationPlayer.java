package fr.lteconsulting.jsinterop.ng;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/animations/src/animation_builder".RendererAnimationPlayer
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/animations/src/animation_builder.d.ts:950
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng", name="RendererAnimationPlayer")
public class RendererAnimationPlayer extends AnimationPlayer
{

    /*
        Constructors
    */
    public RendererAnimationPlayer(String id, Object element, AnimationOptions options, AnimationRenderer _renderer){
    }

    /*
        Properties
    */

    public Object _renderer;

    @JsProperty( name = "_renderer")
    public native Object get_renderer();

    @JsProperty( name = "_renderer")
    public native void set_renderer( Object value );

    public Object _started;

    @JsProperty( name = "_started")
    public native Object get_started();

    @JsProperty( name = "_started")
    public native void set_started( Object value );

    public Object element;

    @JsProperty( name = "element")
    public native Object getElement();

    @JsProperty( name = "element")
    public native void setElement( Object value );

    public String id;

    @JsProperty( name = "id")
    public native String getId();

    @JsProperty( name = "id")
    public native void setId( String value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(_command,3,,P(d3))
      * TE Signature : S(_command,P(d3))
      * 
     */
    public native Object _command(Object command);
    /** 
      * Std Signature : S(_command,3,,P(d3),P(D3))
      * TE Signature : S(_command,P(d3),P(D3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/animations/src/animation_builder.d.ts@1292
     */
    public native Object _command(Object command, Object... args);
    /** 
      * Std Signature : S(_listen,3,,P(d3),P(d3))
      * TE Signature : S(_listen,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/animations/src/animation_builder.d.ts@1250
     */
    public native Object _listen(Object eventName, Object callback);
    /** 
      * Std Signature : S(setPosition,429,,P(d2))
      * TE Signature : S(setPosition,P(d2))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/animations/src/animation_builder.d.ts@1601
     */
    public native void setPosition(Number p);
}

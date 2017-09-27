package fr.lteconsulting.jsinterop.ng;

import fr.lteconsulting.jsinterop.ng.core.NgZone;
import fr.lteconsulting.jsinterop.ng.core.RendererFactory2;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/animations/src/animation_renderer".AnimationRendererFactory
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/animations/src/animation_renderer.d.ts:187
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng", name="AnimationRendererFactory")
public class AnimationRendererFactory extends RendererFactory2
{

    /*
        Constructors
    */
    public AnimationRendererFactory(RendererFactory2 delegate, AnimationEngine engine, NgZone _zone){
    }

    /*
        Properties
    */

    public Object _animationCallbacksBuffer;

    @JsProperty( name = "_animationCallbacksBuffer")
    public native Object get_animationCallbacksBuffer();

    @JsProperty( name = "_animationCallbacksBuffer")
    public native void set_animationCallbacksBuffer( Object value );

    public Object _cdRecurDepth;

    @JsProperty( name = "_cdRecurDepth")
    public native Object get_cdRecurDepth();

    @JsProperty( name = "_cdRecurDepth")
    public native void set_cdRecurDepth( Object value );

    public Object _currentId;

    @JsProperty( name = "_currentId")
    public native Object get_currentId();

    @JsProperty( name = "_currentId")
    public native void set_currentId( Object value );

    public Object _microtaskId;

    @JsProperty( name = "_microtaskId")
    public native Object get_microtaskId();

    @JsProperty( name = "_microtaskId")
    public native void set_microtaskId( Object value );

    public Object _rendererCache;

    @JsProperty( name = "_rendererCache")
    public native Object get_rendererCache();

    @JsProperty( name = "_rendererCache")
    public native void set_rendererCache( Object value );

    public Object _zone;

    @JsProperty( name = "_zone")
    public native Object get_zone();

    @JsProperty( name = "_zone")
    public native void set_zone( Object value );

    public Object delegate;

    @JsProperty( name = "delegate")
    public native Object getDelegate();

    @JsProperty( name = "delegate")
    public native void setDelegate( Object value );

    public Object engine;

    @JsProperty( name = "engine")
    public native Object getEngine();

    @JsProperty( name = "engine")
    public native void setEngine( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(_scheduleCountTask,3,,)
      * TE Signature : S(_scheduleCountTask,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/animations/src/animation_renderer.d.ts@647
     */
    public native Object _scheduleCountTask();
}

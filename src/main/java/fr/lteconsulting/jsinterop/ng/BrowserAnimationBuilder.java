package fr.lteconsulting.jsinterop.ng;

import fr.lteconsulting.jsinterop.ng.core.RendererFactory2;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/animations/src/animation_builder".BrowserAnimationBuilder
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/animations/src/animation_builder.d.ts:438
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng", name="BrowserAnimationBuilder")
public class BrowserAnimationBuilder extends AnimationBuilder
{

    /*
        Constructors
    */
    public BrowserAnimationBuilder(RendererFactory2 rootRenderer, Object doc){
    }

    /*
        Properties
    */

    public Object _nextAnimationId;

    @JsProperty( name = "_nextAnimationId")
    public native Object get_nextAnimationId();

    @JsProperty( name = "_nextAnimationId")
    public native void set_nextAnimationId( Object value );

    public Object _renderer;

    @JsProperty( name = "_renderer")
    public native Object get_renderer();

    @JsProperty( name = "_renderer")
    public native void set_renderer( Object value );
}

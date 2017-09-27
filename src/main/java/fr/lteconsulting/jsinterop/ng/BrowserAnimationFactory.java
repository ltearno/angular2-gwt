package fr.lteconsulting.jsinterop.ng;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/animations/src/animation_builder".BrowserAnimationFactory
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/animations/src/animation_builder.d.ts:705
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng", name="BrowserAnimationFactory")
public class BrowserAnimationFactory extends AnimationFactory
{

    /*
        Constructors
    */
    public BrowserAnimationFactory(String _id, AnimationRenderer _renderer){
    }

    /*
        Properties
    */

    public Object _id;

    @JsProperty( name = "_id")
    public native Object get_id();

    @JsProperty( name = "_id")
    public native void set_id( Object value );

    public Object _renderer;

    @JsProperty( name = "_renderer")
    public native Object get_renderer();

    @JsProperty( name = "_renderer")
    public native void set_renderer( Object value );
}

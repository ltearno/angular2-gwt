package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface UnionOfHTMLCanvasElementAndHTMLImageElementAndHTMLVideoElement extends HTMLElement  {
    @JsOverlay
    default HTMLCanvasElement asHTMLCanvasElement() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfHTMLCanvasElementAndHTMLImageElementAndHTMLVideoElement ofHTMLCanvasElement(HTMLCanvasElement value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default HTMLImageElement asHTMLImageElement() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfHTMLCanvasElementAndHTMLImageElementAndHTMLVideoElement ofHTMLImageElement(HTMLImageElement value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default HTMLVideoElement asHTMLVideoElement() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfHTMLCanvasElementAndHTMLImageElementAndHTMLVideoElement ofHTMLVideoElement(HTMLVideoElement value) {
        return Js.cast( value );
    }
    
}

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
public interface UnionOfElementAndHTMLCollection  {
    @JsOverlay
    default Element asElement() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfElementAndHTMLCollection ofElement(Element value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default HTMLCollection asHTMLCollection() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfElementAndHTMLCollection ofHTMLCollection(HTMLCollection value) {
        return Js.cast( value );
    }
    
}

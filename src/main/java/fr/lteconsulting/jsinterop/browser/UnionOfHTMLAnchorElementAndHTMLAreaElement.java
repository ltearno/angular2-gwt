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
public interface UnionOfHTMLAnchorElementAndHTMLAreaElement extends HTMLElement  {
    @JsOverlay
    default HTMLAnchorElement asHTMLAnchorElement() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfHTMLAnchorElementAndHTMLAreaElement ofHTMLAnchorElement(HTMLAnchorElement value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default HTMLAreaElement asHTMLAreaElement() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfHTMLAnchorElementAndHTMLAreaElement ofHTMLAreaElement(HTMLAreaElement value) {
        return Js.cast( value );
    }
    
}

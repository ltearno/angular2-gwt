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
public interface UnionOfHTMLOptGroupElementAndHTMLOptionElement extends HTMLElement  {
    @JsOverlay
    default HTMLOptGroupElement asHTMLOptGroupElement() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfHTMLOptGroupElementAndHTMLOptionElement ofHTMLOptGroupElement(HTMLOptGroupElement value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default HTMLOptionElement asHTMLOptionElement() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfHTMLOptGroupElementAndHTMLOptionElement ofHTMLOptionElement(HTMLOptionElement value) {
        return Js.cast( value );
    }
    
}

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
public interface UnionOfHTMLScriptElementAndSVGScriptElement extends Element  {
    @JsOverlay
    default HTMLScriptElement asHTMLScriptElement() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfHTMLScriptElementAndSVGScriptElement ofHTMLScriptElement(HTMLScriptElement value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default SVGScriptElement asSVGScriptElement() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfHTMLScriptElementAndSVGScriptElement ofSVGScriptElement(SVGScriptElement value) {
        return Js.cast( value );
    }
    
}

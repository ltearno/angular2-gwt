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
public interface UnionOfSeveralSVGElements extends SVGGraphicsElement  {
    @JsOverlay
    default SVGCircleElement asSVGCircleElement() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static UnionOfSeveralSVGElements ofSVGCircleElement(SVGCircleElement value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default SVGEllipseElement asSVGEllipseElement() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static UnionOfSeveralSVGElements ofSVGEllipseElement(SVGEllipseElement value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default SVGImageElement asSVGImageElement() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static UnionOfSeveralSVGElements ofSVGImageElement(SVGImageElement value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default SVGLineElement asSVGLineElement() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static UnionOfSeveralSVGElements ofSVGLineElement(SVGLineElement value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default SVGPathElement asSVGPathElement() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static UnionOfSeveralSVGElements ofSVGPathElement(SVGPathElement value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default SVGPolygonElement asSVGPolygonElement() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static UnionOfSeveralSVGElements ofSVGPolygonElement(SVGPolygonElement value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default SVGPolylineElement asSVGPolylineElement() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static UnionOfSeveralSVGElements ofSVGPolylineElement(SVGPolylineElement value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default SVGRectElement asSVGRectElement() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static UnionOfSeveralSVGElements ofSVGRectElement(SVGRectElement value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default SVGTextElement asSVGTextElement() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static UnionOfSeveralSVGElements ofSVGTextElement(SVGTextElement value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default SVGUseElement asSVGUseElement() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static UnionOfSeveralSVGElements ofSVGUseElement(SVGUseElement value) {
        return Js.cast( value );
    }
    
}

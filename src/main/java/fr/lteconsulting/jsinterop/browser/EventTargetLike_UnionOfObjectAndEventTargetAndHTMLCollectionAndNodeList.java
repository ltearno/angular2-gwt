package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * aliased in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/observable/FromEventObservable.d.ts:433
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface EventTargetLike_UnionOfObjectAndEventTargetAndHTMLCollectionAndNodeList  {
    @JsOverlay
    default Object asObject() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  EventTargetLike_UnionOfObjectAndEventTargetAndHTMLCollectionAndNodeList ofObject(Object value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default EventTarget asEventTarget() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  EventTargetLike_UnionOfObjectAndEventTargetAndHTMLCollectionAndNodeList ofEventTarget(EventTarget value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default HTMLCollection asHTMLCollection() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  EventTargetLike_UnionOfObjectAndEventTargetAndHTMLCollectionAndNodeList ofHTMLCollection(HTMLCollection value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default NodeList asNodeList() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  EventTargetLike_UnionOfObjectAndEventTargetAndHTMLCollectionAndNodeList ofNodeList(NodeList value) {
        return Js.cast( value );
    }
    
}

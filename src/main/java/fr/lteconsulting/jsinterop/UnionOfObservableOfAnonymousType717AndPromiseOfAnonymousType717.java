package fr.lteconsulting.jsinterop;

import fr.lteconsulting.jsinterop.browser.AnonymousType717;
import fr.lteconsulting.jsinterop.browser.Promise;
import fr.lteconsulting.jsinterop.rxjs.Observable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface UnionOfObservableOfAnonymousType717AndPromiseOfAnonymousType717  {
    @JsOverlay
    default Observable<AnonymousType717> asObservableOfAnonymousType717() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfObservableOfAnonymousType717AndPromiseOfAnonymousType717 ofObservableOfAnonymousType717(Observable<AnonymousType717> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Promise<AnonymousType717> asPromiseOfAnonymousType717() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfObservableOfAnonymousType717AndPromiseOfAnonymousType717 ofPromiseOfAnonymousType717(Promise<AnonymousType717> value) {
        return Js.cast( value );
    }
    
}

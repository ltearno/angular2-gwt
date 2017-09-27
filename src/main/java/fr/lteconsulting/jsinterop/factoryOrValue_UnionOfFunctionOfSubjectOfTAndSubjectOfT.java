package fr.lteconsulting.jsinterop;

import fr.lteconsulting.jsinterop.rxjs.Subject;
import fr.lteconsulting.prebuilt.Function;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * aliased in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/multicast.d.ts:510
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface factoryOrValue_UnionOfFunctionOfSubjectOfTAndSubjectOfT<T>  {
    @JsOverlay
    default Function<Subject<T>> asFunctionOfSubjectOfT() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T> factoryOrValue_UnionOfFunctionOfSubjectOfTAndSubjectOfT<T> ofFunctionOfSubjectOfT(Function<Subject<T>> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Subject<T> asSubjectOfT() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T> factoryOrValue_UnionOfFunctionOfSubjectOfTAndSubjectOfT<T> ofSubjectOfT(Subject<T> value) {
        return Js.cast( value );
    }
    
}

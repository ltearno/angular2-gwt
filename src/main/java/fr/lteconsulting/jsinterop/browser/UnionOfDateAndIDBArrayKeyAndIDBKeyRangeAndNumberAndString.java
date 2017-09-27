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
public interface UnionOfDateAndIDBArrayKeyAndIDBKeyRangeAndNumberAndString  {
    @JsOverlay
    default Date asDate() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfDateAndIDBArrayKeyAndIDBKeyRangeAndNumberAndString ofDate(Date value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default IDBArrayKey asIDBArrayKey() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfDateAndIDBArrayKeyAndIDBKeyRangeAndNumberAndString ofIDBArrayKey(IDBArrayKey value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default IDBKeyRange asIDBKeyRange() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfDateAndIDBArrayKeyAndIDBKeyRangeAndNumberAndString ofIDBKeyRange(IDBKeyRange value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Number asNumber() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfDateAndIDBArrayKeyAndIDBKeyRangeAndNumberAndString ofNumber(Number value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default String asString() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfDateAndIDBArrayKeyAndIDBKeyRangeAndNumberAndString ofString(String value) {
        return Js.cast( value );
    }
    
}

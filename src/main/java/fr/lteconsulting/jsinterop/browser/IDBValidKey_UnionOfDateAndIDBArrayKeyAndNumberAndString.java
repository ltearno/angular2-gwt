package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * aliased in: apis/browser-api/tsd/lib.es6.d.ts:775906
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface IDBValidKey_UnionOfDateAndIDBArrayKeyAndNumberAndString  {
    @JsOverlay
    default Date asDate() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  IDBValidKey_UnionOfDateAndIDBArrayKeyAndNumberAndString ofDate(Date value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default IDBArrayKey asIDBArrayKey() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  IDBValidKey_UnionOfDateAndIDBArrayKeyAndNumberAndString ofIDBArrayKey(IDBArrayKey value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Number asNumber() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  IDBValidKey_UnionOfDateAndIDBArrayKeyAndNumberAndString ofNumber(Number value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default String asString() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  IDBValidKey_UnionOfDateAndIDBArrayKeyAndNumberAndString ofString(String value) {
        return Js.cast( value );
    }
    
}

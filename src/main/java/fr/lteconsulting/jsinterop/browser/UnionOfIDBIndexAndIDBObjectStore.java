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
public interface UnionOfIDBIndexAndIDBObjectStore  {
    @JsOverlay
    default IDBIndex asIDBIndex() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfIDBIndexAndIDBObjectStore ofIDBIndex(IDBIndex value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default IDBObjectStore asIDBObjectStore() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfIDBIndexAndIDBObjectStore ofIDBObjectStore(IDBObjectStore value) {
        return Js.cast( value );
    }
    
}

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
public interface UnionOfIDBCursorAndIDBIndexAndIDBObjectStore  {
    @JsOverlay
    default IDBCursor asIDBCursor() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfIDBCursorAndIDBIndexAndIDBObjectStore ofIDBCursor(IDBCursor value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default IDBIndex asIDBIndex() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfIDBCursorAndIDBIndexAndIDBObjectStore ofIDBIndex(IDBIndex value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default IDBObjectStore asIDBObjectStore() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfIDBCursorAndIDBIndexAndIDBObjectStore ofIDBObjectStore(IDBObjectStore value) {
        return Js.cast( value );
    }
    
}

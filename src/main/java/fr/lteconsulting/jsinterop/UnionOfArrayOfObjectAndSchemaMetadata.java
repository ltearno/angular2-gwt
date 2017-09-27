package fr.lteconsulting.jsinterop;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.ng.core.SchemaMetadata;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface UnionOfArrayOfObjectAndSchemaMetadata  {
    @JsOverlay
    default Array<Object> asArrayOfObject() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfArrayOfObjectAndSchemaMetadata ofArrayOfObject(Array<Object> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default SchemaMetadata asSchemaMetadata() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfArrayOfObjectAndSchemaMetadata ofSchemaMetadata(SchemaMetadata value) {
        return Js.cast( value );
    }
    
}

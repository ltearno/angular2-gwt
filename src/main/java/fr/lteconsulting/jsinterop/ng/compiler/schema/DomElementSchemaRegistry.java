package fr.lteconsulting.jsinterop.ng.compiler.schema;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/schema/dom_element_schema_registry".DomElementSchemaRegistry
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/schema/dom_element_schema_registry.d.ts:334
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.schema", name="DomElementSchemaRegistry")
public class DomElementSchemaRegistry extends ElementSchemaRegistry
{

    /*
        Constructors
    */
    public DomElementSchemaRegistry(){
    }

    /*
        Properties
    */

    public Object _schema;

    @JsProperty( name = "_schema")
    public native Object get_schema();

    @JsProperty( name = "_schema")
    public native void set_schema( Object value );
}

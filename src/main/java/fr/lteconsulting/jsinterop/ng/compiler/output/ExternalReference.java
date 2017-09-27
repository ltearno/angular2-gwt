package fr.lteconsulting.jsinterop.ng.compiler.output;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast".ExternalReference
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts:7810
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.output", name="ExternalReference")
public class ExternalReference
{

    /*
        Constructors
    */
    public ExternalReference(String moduleName, String name, Object runtime){
    }

    /*
        Properties
    */

    public String moduleName;

    @JsProperty( name = "moduleName")
    public native String getModuleName();

    @JsProperty( name = "moduleName")
    public native void setModuleName( String value );

    public String name;

    @JsProperty( name = "name")
    public native String getName();

    @JsProperty( name = "name")
    public native void setName( String value );

    public Object runtime;

    @JsProperty( name = "runtime")
    public native Object getRuntime();

    @JsProperty( name = "runtime")
    public native void setRuntime( Object value );
}

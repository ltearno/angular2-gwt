package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/metadata/directives".Pipe
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/metadata/directives.d.ts:26187
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/metadata/directives.d.ts:26393
  * 1 constructors
  * Type of the Pipe metadata.
  * Pipe decorator and metadata.
 */
@JsType(isNative=true, namespace="ng.core", name="Pipe")
public class Pipe
{

    /*
        Constructors
    */
    public Pipe(Pipe obj){
    }

    /*
        Properties
    */

    public String name;

    @JsProperty( name = "name")
    public native String getName();

    @JsProperty( name = "name")
    public native void setName( String value );

    public Boolean pure;

    @JsProperty( name = "pure")
    public native Boolean getPure();

    @JsProperty( name = "pure")
    public native void setPure( Boolean value );
}

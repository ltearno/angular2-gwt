package fr.lteconsulting.jsinterop.ng.compiler;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_metadata".CompilePipeMetadata
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_metadata.d.ts:11847
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler", name="CompilePipeMetadata")
public class CompilePipeMetadata
{

    /*
        Constructors
    */
    public CompilePipeMetadata(Object __0){
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

    public CompileTypeMetadata type;

    @JsProperty( name = "type")
    public native CompileTypeMetadata getType();

    @JsProperty( name = "type")
    public native void setType( CompileTypeMetadata value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(toSummary,1221,,)
      * TE Signature : S(toSummary,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_metadata.d.ts@12089
     */
    public native CompilePipeSummary toSummary();
}

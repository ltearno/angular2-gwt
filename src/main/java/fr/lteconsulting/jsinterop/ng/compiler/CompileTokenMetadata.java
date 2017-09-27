package fr.lteconsulting.jsinterop.ng.compiler;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_metadata".CompileTokenMetadata
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_metadata.d.ts:4688
  * 
 */
@JsType(isNative=true, namespace="ng.compiler", name="CompileTokenMetadata")
public class CompileTokenMetadata
{

    /*
        Properties
    */

    public UnionOfCompileIdentifierMetadataAndCompileTypeMetadata identifier;

    @JsProperty( name = "identifier")
    public native UnionOfCompileIdentifierMetadataAndCompileTypeMetadata getIdentifier();

    @JsProperty( name = "identifier")
    public native void setIdentifier( UnionOfCompileIdentifierMetadataAndCompileTypeMetadata value );

    @JsOverlay
    public final void setIdentifier( CompileIdentifierMetadata value ) { setIdentifier(UnionOfCompileIdentifierMetadataAndCompileTypeMetadata.ofCompileIdentifierMetadata( value )); }

    @JsOverlay
    public final void setIdentifier( CompileTypeMetadata value ) { setIdentifier(UnionOfCompileIdentifierMetadataAndCompileTypeMetadata.ofCompileTypeMetadata( value )); }

    public Object value;

    @JsProperty( name = "value")
    public native Object getValue();

    @JsProperty( name = "value")
    public native void setValue( Object value );
}

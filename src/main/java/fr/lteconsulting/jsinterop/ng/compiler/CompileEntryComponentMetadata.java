package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.ng.UnionOfComponentFactoryOfObjectAndStaticSymbol;
import fr.lteconsulting.jsinterop.ng.compiler.aot.StaticSymbol;
import fr.lteconsulting.jsinterop.ng.core.ComponentFactory;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_metadata".CompileEntryComponentMetadata
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_metadata.d.ts:6869
  * 
 */
@JsType(isNative=true, namespace="ng.compiler", name="CompileEntryComponentMetadata")
public class CompileEntryComponentMetadata
{

    /*
        Properties
    */

    public UnionOfComponentFactoryOfObjectAndStaticSymbol componentFactory;

    @JsProperty( name = "componentFactory")
    public native UnionOfComponentFactoryOfObjectAndStaticSymbol getComponentFactory();

    @JsProperty( name = "componentFactory")
    public native void setComponentFactory( UnionOfComponentFactoryOfObjectAndStaticSymbol value );

    @JsOverlay
    public final void setComponentFactory( ComponentFactory<Object> value ) { setComponentFactory(UnionOfComponentFactoryOfObjectAndStaticSymbol.ofComponentFactoryOfObject( value )); }

    @JsOverlay
    public final void setComponentFactory( StaticSymbol value ) { setComponentFactory(UnionOfComponentFactoryOfObjectAndStaticSymbol.ofStaticSymbol( value )); }

    public Object componentType;

    @JsProperty( name = "componentType")
    public native Object getComponentType();

    @JsProperty( name = "componentType")
    public native void setComponentType( Object value );
}

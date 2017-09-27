package fr.lteconsulting.jsinterop.ng.compiler.aot;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/static_symbol_resolver".ResolvedStaticSymbol
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/static_symbol_resolver.d.ts:324
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.aot", name="ResolvedStaticSymbol")
public class ResolvedStaticSymbol
{

    /*
        Constructors
    */
    public ResolvedStaticSymbol(StaticSymbol symbol, Object metadata){
    }

    /*
        Properties
    */

    public Object metadata;

    @JsProperty( name = "metadata")
    public native Object getMetadata();

    @JsProperty( name = "metadata")
    public native void setMetadata( Object value );

    public StaticSymbol symbol;

    @JsProperty( name = "symbol")
    public native StaticSymbol getSymbol();

    @JsProperty( name = "symbol")
    public native void setSymbol( StaticSymbol value );
}

package fr.lteconsulting.jsinterop.ng.compiler;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/summary_resolver".Summary
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/summary_resolver.d.ts:297
  * 
 */
@JsType(isNative=true, namespace="ng.compiler", name="Summary")
public class Summary<T>
{

    /*
        Properties
    */

    public Object metadata;

    @JsProperty( name = "metadata")
    public native Object getMetadata();

    @JsProperty( name = "metadata")
    public native void setMetadata( Object value );

    public T symbol;

    @JsProperty( name = "symbol")
    public native T getSymbol();

    @JsProperty( name = "symbol")
    public native void setSymbol( T value );

    public CompileTypeSummary type;

    @JsProperty( name = "type")
    public native CompileTypeSummary getType();

    @JsProperty( name = "type")
    public native void setType( CompileTypeSummary value );
}

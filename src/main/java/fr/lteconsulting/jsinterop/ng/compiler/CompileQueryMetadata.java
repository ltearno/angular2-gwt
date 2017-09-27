package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_metadata".CompileQueryMetadata
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_metadata.d.ts:5042
  * 
 */
@JsType(isNative=true, namespace="ng.compiler", name="CompileQueryMetadata")
public class CompileQueryMetadata
{

    /*
        Properties
    */

    public Boolean descendants;

    @JsProperty( name = "descendants")
    public native Boolean getDescendants();

    @JsProperty( name = "descendants")
    public native void setDescendants( Boolean value );

    public Boolean first;

    @JsProperty( name = "first")
    public native Boolean getFirst();

    @JsProperty( name = "first")
    public native void setFirst( Boolean value );

    public String propertyName;

    @JsProperty( name = "propertyName")
    public native String getPropertyName();

    @JsProperty( name = "propertyName")
    public native void setPropertyName( String value );

    public CompileTokenMetadata read;

    @JsProperty( name = "read")
    public native CompileTokenMetadata getRead();

    @JsProperty( name = "read")
    public native void setRead( CompileTokenMetadata value );

    public Array<CompileTokenMetadata> selectors;

    @JsProperty( name = "selectors")
    public native Array<CompileTokenMetadata> getSelectors();

    @JsProperty( name = "selectors")
    public native void setSelectors( Array<CompileTokenMetadata> value );
}

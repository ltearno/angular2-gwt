package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_metadata".CompileProviderMetadata
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_metadata.d.ts:4116
  * 
 */
@JsType(isNative=true, namespace="ng.compiler", name="CompileProviderMetadata")
public class CompileProviderMetadata
{

    /*
        Properties
    */

    public Array<CompileDiDependencyMetadata> deps;

    @JsProperty( name = "deps")
    public native Array<CompileDiDependencyMetadata> getDeps();

    @JsProperty( name = "deps")
    public native void setDeps( Array<CompileDiDependencyMetadata> value );

    public Boolean multi;

    @JsProperty( name = "multi")
    public native Boolean getMulti();

    @JsProperty( name = "multi")
    public native void setMulti( Boolean value );

    public CompileTokenMetadata token;

    @JsProperty( name = "token")
    public native CompileTokenMetadata getToken();

    @JsProperty( name = "token")
    public native void setToken( CompileTokenMetadata value );

    public CompileTypeMetadata useClass;

    @JsProperty( name = "useClass")
    public native CompileTypeMetadata getUseClass();

    @JsProperty( name = "useClass")
    public native void setUseClass( CompileTypeMetadata value );

    public CompileTokenMetadata useExisting;

    @JsProperty( name = "useExisting")
    public native CompileTokenMetadata getUseExisting();

    @JsProperty( name = "useExisting")
    public native void setUseExisting( CompileTokenMetadata value );

    public CompileFactoryMetadata useFactory;

    @JsProperty( name = "useFactory")
    public native CompileFactoryMetadata getUseFactory();

    @JsProperty( name = "useFactory")
    public native void setUseFactory( CompileFactoryMetadata value );

    public Object useValue;

    @JsProperty( name = "useValue")
    public native Object getUseValue();

    @JsProperty( name = "useValue")
    public native void setUseValue( Object value );
}

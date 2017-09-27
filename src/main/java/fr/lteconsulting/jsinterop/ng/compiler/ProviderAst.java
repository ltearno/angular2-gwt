package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/template_parser/template_ast".ProviderAst
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/template_parser/template_ast.d.ts:6702
  * 1 constructors
  * A provider declared on an element
 */
@JsType(isNative=true, namespace="ng.compiler", name="ProviderAst")
public class ProviderAst extends TemplateAst
{

    /*
        Constructors
    */
    public ProviderAst(CompileTokenMetadata token, Boolean multiProvider, Boolean eager, Array<CompileProviderMetadata> providers, ProviderAstType providerType, Array<LifecycleHooks> lifecycleHooks, ParseSourceSpan sourceSpan){
    }

    /*
        Properties
    */

    public Boolean eager;

    @JsProperty( name = "eager")
    public native Boolean getEager();

    @JsProperty( name = "eager")
    public native void setEager( Boolean value );

    public Array<LifecycleHooks> lifecycleHooks;

    @JsProperty( name = "lifecycleHooks")
    public native Array<LifecycleHooks> getLifecycleHooks();

    @JsProperty( name = "lifecycleHooks")
    public native void setLifecycleHooks( Array<LifecycleHooks> value );

    public Boolean multiProvider;

    @JsProperty( name = "multiProvider")
    public native Boolean getMultiProvider();

    @JsProperty( name = "multiProvider")
    public native void setMultiProvider( Boolean value );

    public ProviderAstType providerType;

    @JsProperty( name = "providerType")
    public native ProviderAstType getProviderType();

    @JsProperty( name = "providerType")
    public native void setProviderType( ProviderAstType value );

    public Array<CompileProviderMetadata> providers;

    @JsProperty( name = "providers")
    public native Array<CompileProviderMetadata> getProviders();

    @JsProperty( name = "providers")
    public native void setProviders( Array<CompileProviderMetadata> value );

    public CompileTokenMetadata token;

    @JsProperty( name = "token")
    public native CompileTokenMetadata getToken();

    @JsProperty( name = "token")
    public native void setToken( CompileTokenMetadata value );
}

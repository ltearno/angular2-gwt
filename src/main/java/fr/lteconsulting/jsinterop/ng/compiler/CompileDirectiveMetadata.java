package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.browser.AnonymousType817;
import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.ng.UnionOfComponentFactoryOfObjectAndStaticSymbol;
import fr.lteconsulting.jsinterop.ng.UnionOfProxyClassAndStaticSymbol;
import fr.lteconsulting.jsinterop.ng.UnionOfRendererType2AndStaticSymbol;
import fr.lteconsulting.jsinterop.ng.compiler.aot.StaticSymbol;
import fr.lteconsulting.jsinterop.ng.core.ChangeDetectionStrategy;
import fr.lteconsulting.jsinterop.ng.core.ComponentFactory;
import fr.lteconsulting.jsinterop.ng.core.RendererType2;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_metadata".CompileDirectiveMetadata
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_metadata.d.ts:7972
  * 1 constructors
  * Metadata regarding compilation of a directive.
 */
@JsType(isNative=true, namespace="ng.compiler", name="CompileDirectiveMetadata")
public class CompileDirectiveMetadata
{

    /*
        Constructors
    */
    public CompileDirectiveMetadata(Object __0){
    }

    /*
        Static methods
    */
    /** 
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_metadata.d.ts:8083
     */
    @JsMethod(namespace="ng.compiler.CompileDirectiveMetadata", name = "create")
    public static native CompileDirectiveMetadata create(Object __0);

    /*
        Properties
    */

    public ChangeDetectionStrategy changeDetection;

    @JsProperty( name = "changeDetection")
    public native ChangeDetectionStrategy getChangeDetection();

    @JsProperty( name = "changeDetection")
    public native void setChangeDetection( ChangeDetectionStrategy value );

    public UnionOfComponentFactoryOfObjectAndStaticSymbol componentFactory;

    @JsProperty( name = "componentFactory")
    public native UnionOfComponentFactoryOfObjectAndStaticSymbol getComponentFactory();

    @JsProperty( name = "componentFactory")
    public native void setComponentFactory( UnionOfComponentFactoryOfObjectAndStaticSymbol value );

    @JsOverlay
    public final void setComponentFactory( ComponentFactory<Object> value ) { setComponentFactory(UnionOfComponentFactoryOfObjectAndStaticSymbol.ofComponentFactoryOfObject( value )); }

    @JsOverlay
    public final void setComponentFactory( StaticSymbol value ) { setComponentFactory(UnionOfComponentFactoryOfObjectAndStaticSymbol.ofStaticSymbol( value )); }

    public UnionOfProxyClassAndStaticSymbol componentViewType;

    @JsProperty( name = "componentViewType")
    public native UnionOfProxyClassAndStaticSymbol getComponentViewType();

    @JsProperty( name = "componentViewType")
    public native void setComponentViewType( UnionOfProxyClassAndStaticSymbol value );

    @JsOverlay
    public final void setComponentViewType( ProxyClass value ) { setComponentViewType(UnionOfProxyClassAndStaticSymbol.ofProxyClass( value )); }

    @JsOverlay
    public final void setComponentViewType( StaticSymbol value ) { setComponentViewType(UnionOfProxyClassAndStaticSymbol.ofStaticSymbol( value )); }

    public Array<CompileEntryComponentMetadata> entryComponents;

    @JsProperty( name = "entryComponents")
    public native Array<CompileEntryComponentMetadata> getEntryComponents();

    @JsProperty( name = "entryComponents")
    public native void setEntryComponents( Array<CompileEntryComponentMetadata> value );

    public String exportAs;

    @JsProperty( name = "exportAs")
    public native String getExportAs();

    @JsProperty( name = "exportAs")
    public native void setExportAs( String value );

    public AnonymousType817 hostAttributes;

    @JsProperty( name = "hostAttributes")
    public native AnonymousType817 getHostAttributes();

    @JsProperty( name = "hostAttributes")
    public native void setHostAttributes( AnonymousType817 value );

    public AnonymousType817 hostListeners;

    @JsProperty( name = "hostListeners")
    public native AnonymousType817 getHostListeners();

    @JsProperty( name = "hostListeners")
    public native void setHostListeners( AnonymousType817 value );

    public AnonymousType817 hostProperties;

    @JsProperty( name = "hostProperties")
    public native AnonymousType817 getHostProperties();

    @JsProperty( name = "hostProperties")
    public native void setHostProperties( AnonymousType817 value );

    public AnonymousType817 inputs;

    @JsProperty( name = "inputs")
    public native AnonymousType817 getInputs();

    @JsProperty( name = "inputs")
    public native void setInputs( AnonymousType817 value );

    public Boolean isComponent;

    @JsProperty( name = "isComponent")
    public native Boolean getIsComponent();

    @JsProperty( name = "isComponent")
    public native void setIsComponent( Boolean value );

    public Boolean isHost;

    @JsProperty( name = "isHost")
    public native Boolean getIsHost();

    @JsProperty( name = "isHost")
    public native void setIsHost( Boolean value );

    public AnonymousType817 outputs;

    @JsProperty( name = "outputs")
    public native AnonymousType817 getOutputs();

    @JsProperty( name = "outputs")
    public native void setOutputs( AnonymousType817 value );

    public Array<CompileProviderMetadata> providers;

    @JsProperty( name = "providers")
    public native Array<CompileProviderMetadata> getProviders();

    @JsProperty( name = "providers")
    public native void setProviders( Array<CompileProviderMetadata> value );

    public Array<CompileQueryMetadata> queries;

    @JsProperty( name = "queries")
    public native Array<CompileQueryMetadata> getQueries();

    @JsProperty( name = "queries")
    public native void setQueries( Array<CompileQueryMetadata> value );

    public UnionOfRendererType2AndStaticSymbol rendererType;

    @JsProperty( name = "rendererType")
    public native UnionOfRendererType2AndStaticSymbol getRendererType();

    @JsProperty( name = "rendererType")
    public native void setRendererType( UnionOfRendererType2AndStaticSymbol value );

    @JsOverlay
    public final void setRendererType( RendererType2 value ) { setRendererType(UnionOfRendererType2AndStaticSymbol.ofRendererType2( value )); }

    @JsOverlay
    public final void setRendererType( StaticSymbol value ) { setRendererType(UnionOfRendererType2AndStaticSymbol.ofStaticSymbol( value )); }

    public String selector;

    @JsProperty( name = "selector")
    public native String getSelector();

    @JsProperty( name = "selector")
    public native void setSelector( String value );

    public CompileTemplateMetadata template;

    @JsProperty( name = "template")
    public native CompileTemplateMetadata getTemplate();

    @JsProperty( name = "template")
    public native void setTemplate( CompileTemplateMetadata value );

    public CompileTypeMetadata type;

    @JsProperty( name = "type")
    public native CompileTypeMetadata getType();

    @JsProperty( name = "type")
    public native void setType( CompileTypeMetadata value );

    public Array<CompileProviderMetadata> viewProviders;

    @JsProperty( name = "viewProviders")
    public native Array<CompileProviderMetadata> getViewProviders();

    @JsProperty( name = "viewProviders")
    public native void setViewProviders( Array<CompileProviderMetadata> value );

    public Array<CompileQueryMetadata> viewQueries;

    @JsProperty( name = "viewQueries")
    public native Array<CompileQueryMetadata> getViewQueries();

    @JsProperty( name = "viewQueries")
    public native void setViewQueries( Array<CompileQueryMetadata> value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(toSummary,531,,)
      * TE Signature : S(toSummary,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_metadata.d.ts@11392
     */
    public native CompileDirectiveSummary toSummary();
}

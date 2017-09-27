package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/compiler/src/provider_analyzer".NgModuleProviderAnalyzer
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/compiler/src/provider_analyzer.d.ts:2173
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler", name="NgModuleProviderAnalyzer")
public class NgModuleProviderAnalyzer
{

    /*
        Constructors
    */
    public NgModuleProviderAnalyzer(CompileReflector reflector, CompileNgModuleMetadata ngModule, Array<CompileProviderMetadata> extraProviders, ParseSourceSpan sourceSpan){
    }

    /*
        Properties
    */

    public Object _allProviders;

    @JsProperty( name = "_allProviders")
    public native Object get_allProviders();

    @JsProperty( name = "_allProviders")
    public native void set_allProviders( Object value );

    public Object _errors;

    @JsProperty( name = "_errors")
    public native Object get_errors();

    @JsProperty( name = "_errors")
    public native void set_errors( Object value );

    public Object _seenProviders;

    @JsProperty( name = "_seenProviders")
    public native Object get_seenProviders();

    @JsProperty( name = "_seenProviders")
    public native void set_seenProviders( Object value );

    public Object _transformedProviders;

    @JsProperty( name = "_transformedProviders")
    public native Object get_transformedProviders();

    @JsProperty( name = "_transformedProviders")
    public native void set_transformedProviders( Object value );

    public Object reflector;

    @JsProperty( name = "reflector")
    public native Object getReflector();

    @JsProperty( name = "reflector")
    public native void setReflector( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(_getDependency,3,,P(d3),P(d3),P(d3))
      * TE Signature : S(_getDependency,P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/compiler/src/provider_analyzer.d.ts@2594
     */
    public native Object _getDependency(Object dep, Object eager, Object requestorSourceSpan);
    /** 
      * Std Signature : S(_getOrCreateLocalProvider,3,,P(d3),P(d3))
      * TE Signature : S(_getOrCreateLocalProvider,P(d3),P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/compiler/src/provider_analyzer.d.ts@2541
     */
    public native Object _getOrCreateLocalProvider(Object token, Object eager);
    /** 
      * Std Signature : S(parse,7<622>,,)
      * TE Signature : S(parse,)
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/compiler/src/provider_analyzer.d.ts@2513
     */
    public native Array<ProviderAst> parse();
}

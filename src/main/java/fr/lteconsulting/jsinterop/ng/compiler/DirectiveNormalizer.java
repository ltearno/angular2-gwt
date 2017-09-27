package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.ng.compiler.mlparser.HtmlParser;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/directive_normalizer".DirectiveNormalizer
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/directive_normalizer.d.ts:1038
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler", name="DirectiveNormalizer")
public class DirectiveNormalizer
{

    /*
        Constructors
    */
    public DirectiveNormalizer(ResourceLoader _resourceLoader, UrlResolver _urlResolver, HtmlParser _htmlParser, CompilerConfig _config){
    }

    /*
        Properties
    */

    public Object _config;

    @JsProperty( name = "_config")
    public native Object get_config();

    @JsProperty( name = "_config")
    public native void set_config( Object value );

    public Object _htmlParser;

    @JsProperty( name = "_htmlParser")
    public native Object get_htmlParser();

    @JsProperty( name = "_htmlParser")
    public native void set_htmlParser( Object value );

    public Object _resourceLoader;

    @JsProperty( name = "_resourceLoader")
    public native Object get_resourceLoader();

    @JsProperty( name = "_resourceLoader")
    public native void set_resourceLoader( Object value );

    public Object _resourceLoaderCache;

    @JsProperty( name = "_resourceLoaderCache")
    public native Object get_resourceLoaderCache();

    @JsProperty( name = "_resourceLoaderCache")
    public native void set_resourceLoaderCache( Object value );

    public Object _urlResolver;

    @JsProperty( name = "_urlResolver")
    public native Object get_urlResolver();

    @JsProperty( name = "_urlResolver")
    public native void set_urlResolver( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(_fetch,3,,P(d3))
      * TE Signature : S(_fetch,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/directive_normalizer.d.ts@1444
     */
    public native Object _fetch(Object url);
    /** 
      * Std Signature : S(_loadMissingExternalStylesheets,3,,P(d3))
      * TE Signature : S(_loadMissingExternalStylesheets,P(d3))
      * 
     */
    public native Object _loadMissingExternalStylesheets(Object styleUrls);
    /** 
      * Std Signature : S(_loadMissingExternalStylesheets,3,,P(d3),P(d3))
      * TE Signature : S(_loadMissingExternalStylesheets,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/directive_normalizer.d.ts@1927
     */
    public native Object _loadMissingExternalStylesheets(Object styleUrls, Object loadedStylesheets /* optional */);
    /** 
      * Std Signature : S(clearCache,429,,)
      * TE Signature : S(clearCache,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/directive_normalizer.d.ts@1348
     */
    public native void clearCache();
    /** 
      * Std Signature : S(clearCacheFor,429,,P(d496))
      * TE Signature : S(clearCacheFor,P(d496))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/directive_normalizer.d.ts@1372
     */
    public native void clearCacheFor(CompileDirectiveMetadata normalizedDirective);
    /** 
      * Std Signature : S(normalizeExternalStylesheets,U(-568,88<2>),,P(d568))
      * TE Signature : S(normalizeExternalStylesheets,P(d568))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/directive_normalizer.d.ts@1818
     */
    public native SyncAsync_UnionOfCompileTemplateMetadataAndPromiseOfCompileTemplateMetadata normalizeExternalStylesheets(CompileTemplateMetadata templateMeta);
    /** 
      * Std Signature : S(normalizeLoadedTemplate,568,,P(d567),P(d1),P(d1))
      * TE Signature : S(normalizeLoadedTemplate,P(d567),P(d1),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/directive_normalizer.d.ts@1678
     */
    public native CompileTemplateMetadata normalizeLoadedTemplate(PrenormalizedTemplateMetadata prenormData, String template, String templateAbsUrl);
    /** 
      * Std Signature : S(normalizeStylesheet,501,,P(d501))
      * TE Signature : S(normalizeStylesheet,P(d501))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/directive_normalizer.d.ts@2003
     */
    public native CompileStylesheetMetadata normalizeStylesheet(CompileStylesheetMetadata stylesheet);
    /** 
      * Std Signature : S(normalizeTemplate,U(-568,88<2>),,P(d567))
      * TE Signature : S(normalizeTemplate,P(d567))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/directive_normalizer.d.ts@1469
     */
    public native SyncAsync_UnionOfCompileTemplateMetadataAndPromiseOfCompileTemplateMetadata normalizeTemplate(PrenormalizedTemplateMetadata prenormData);
    /** 
      * Std Signature : S(normalizeTemplateOnly,U(-568,88<2>),,P(d567))
      * TE Signature : S(normalizeTemplateOnly,P(d567))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/directive_normalizer.d.ts@1572
     */
    public native SyncAsync_UnionOfCompileTemplateMetadataAndPromiseOfCompileTemplateMetadata normalizeTemplateOnly(PrenormalizedTemplateMetadata prenomData);
}

package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.ng.compiler.expression.parse.Parser;
import fr.lteconsulting.jsinterop.ng.compiler.i18n.I18NHtmlParser;
import fr.lteconsulting.jsinterop.ng.compiler.mlparser.InterpolationConfig;
import fr.lteconsulting.jsinterop.ng.compiler.mlparser.ParseTreeResult;
import fr.lteconsulting.jsinterop.ng.compiler.schema.ElementSchemaRegistry;
import fr.lteconsulting.jsinterop.ng.core.Console;
import fr.lteconsulting.jsinterop.ng.core.SchemaMetadata;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/template_parser/template_parser".TemplateParser
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/template_parser/template_parser.d.ts:1771
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler", name="TemplateParser")
public class TemplateParser
{

    /*
        Constructors
    */
    public TemplateParser(CompilerConfig _config, CompileReflector _reflector, Parser _exprParser, ElementSchemaRegistry _schemaRegistry, I18NHtmlParser _htmlParser, Console _console, Array<TemplateAstVisitor> transforms){
    }

    /*
        Properties
    */

    public Object _config;

    @JsProperty( name = "_config")
    public native Object get_config();

    @JsProperty( name = "_config")
    public native void set_config( Object value );

    public Object _console;

    @JsProperty( name = "_console")
    public native Object get_console();

    @JsProperty( name = "_console")
    public native void set_console( Object value );

    public Object _exprParser;

    @JsProperty( name = "_exprParser")
    public native Object get_exprParser();

    @JsProperty( name = "_exprParser")
    public native void set_exprParser( Object value );

    public Object _htmlParser;

    @JsProperty( name = "_htmlParser")
    public native Object get_htmlParser();

    @JsProperty( name = "_htmlParser")
    public native void set_htmlParser( Object value );

    public Object _reflector;

    @JsProperty( name = "_reflector")
    public native Object get_reflector();

    @JsProperty( name = "_reflector")
    public native void set_reflector( Object value );

    public Object _schemaRegistry;

    @JsProperty( name = "_schemaRegistry")
    public native Object get_schemaRegistry();

    @JsProperty( name = "_schemaRegistry")
    public native void set_schemaRegistry( Object value );

    public Array<TemplateAstVisitor> transforms;

    @JsProperty( name = "transforms")
    public native Array<TemplateAstVisitor> getTransforms();

    @JsProperty( name = "transforms")
    public native void setTransforms( Array<TemplateAstVisitor> value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(expandHtml,563,,P(d563))
      * TE Signature : S(expandHtml,P(d563))
      * 
     */
    public native ParseTreeResult expandHtml(ParseTreeResult htmlAstWithErrors);
    /** 
      * Std Signature : S(expandHtml,563,,P(d563),P(d27))
      * TE Signature : S(expandHtml,P(d563),P(d27))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/template_parser/template_parser.d.ts@2947
     */
    public native ParseTreeResult expandHtml(ParseTreeResult htmlAstWithErrors, Boolean forced /* optional */);
    /** 
      * Std Signature : S(getInterpolationConfig,546,,P(d496))
      * TE Signature : S(getInterpolationConfig,P(d496))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/template_parser/template_parser.d.ts@3034
     */
    public native InterpolationConfig getInterpolationConfig(CompileDirectiveMetadata component);
    /** 
      * Std Signature : S(parse,3,,P(d496),P(d1),P(d7<531>),P(d7<1221>),P(d7<815>),P(d1),P(d27))
      * TE Signature : S(parse,P(d496),P(d1),P(d7),P(d7),P(d7),P(d1),P(d27))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/template_parser/template_parser.d.ts@2213
     */
    public native Object parse(CompileDirectiveMetadata component, String template, Array<CompileDirectiveSummary> directives, Array<CompilePipeSummary> pipes, Array<SchemaMetadata> schemas, String templateUrl, Boolean preserveWhitespaces);
    /** 
      * Std Signature : S(tryParse,1227,,P(d496),P(d1),P(d7<531>),P(d7<1221>),P(d7<815>),P(d1),P(d27))
      * TE Signature : S(tryParse,P(d496),P(d1),P(d7),P(d7),P(d7),P(d1),P(d27))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/template_parser/template_parser.d.ts@2504
     */
    public native TemplateParseResult tryParse(CompileDirectiveMetadata component, String template, Array<CompileDirectiveSummary> directives, Array<CompilePipeSummary> pipes, Array<SchemaMetadata> schemas, String templateUrl, Boolean preserveWhitespaces);
    /** 
      * Std Signature : S(tryParseHtml,1227,,P(d563),P(d496),P(d7<531>),P(d7<1221>),P(d7<815>))
      * TE Signature : S(tryParseHtml,P(d563),P(d496),P(d7),P(d7),P(d7))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/template_parser/template_parser.d.ts@2740
     */
    public native TemplateParseResult tryParseHtml(ParseTreeResult htmlAstWithErrors, CompileDirectiveMetadata component, Array<CompileDirectiveSummary> directives, Array<CompilePipeSummary> pipes, Array<SchemaMetadata> schemas);
}

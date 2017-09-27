package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.Map;
import fr.lteconsulting.jsinterop.ng.compiler.expression.parse.ASTWithSource;
import fr.lteconsulting.jsinterop.ng.compiler.expression.parse.Parser;
import fr.lteconsulting.jsinterop.ng.compiler.mlparser.InterpolationConfig;
import fr.lteconsulting.jsinterop.ng.compiler.schema.ElementSchemaRegistry;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/compiler/src/template_parser/binding_parser".BindingParser
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/compiler/src/template_parser/binding_parser.d.ts:1246
  * 1 constructors
  * Parses bindings in templates and in the directive host area.
 */
@JsType(isNative=true, namespace="ng.compiler", name="BindingParser")
public class BindingParser
{

    /*
        Constructors
    */
    public BindingParser(Parser _exprParser, InterpolationConfig _interpolationConfig, ElementSchemaRegistry _schemaRegistry, Array<CompilePipeSummary> pipes, Array<ParseError> _targetErrors){
    }

    /*
        Properties
    */

    public Object _exprParser;

    @JsProperty( name = "_exprParser")
    public native Object get_exprParser();

    @JsProperty( name = "_exprParser")
    public native void set_exprParser( Object value );

    public Object _interpolationConfig;

    @JsProperty( name = "_interpolationConfig")
    public native Object get_interpolationConfig();

    @JsProperty( name = "_interpolationConfig")
    public native void set_interpolationConfig( Object value );

    public Object _schemaRegistry;

    @JsProperty( name = "_schemaRegistry")
    public native Object get_schemaRegistry();

    @JsProperty( name = "_schemaRegistry")
    public native void set_schemaRegistry( Object value );

    public Object _targetErrors;

    @JsProperty( name = "_targetErrors")
    public native Object get_targetErrors();

    @JsProperty( name = "_targetErrors")
    public native void set_targetErrors( Object value );

    public Object _usedPipes;

    @JsProperty( name = "_usedPipes")
    public native Object get_usedPipes();

    @JsProperty( name = "_usedPipes")
    public native void set_usedPipes( Object value );

    public Map<String, CompilePipeSummary> pipesByName;

    @JsProperty( name = "pipesByName")
    public native Map<String, CompilePipeSummary> getPipesByName();

    @JsProperty( name = "pipesByName")
    public native void setPipesByName( Map<String, CompilePipeSummary> value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(_checkPipes,3,,P(d3),P(d3))
      * TE Signature : S(_checkPipes,P(d3),P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/compiler/src/template_parser/binding_parser.d.ts@3723
     */
    public native Object _checkPipes(Object ast, Object sourceSpan);
    /** 
      * Std Signature : S(_parseAction,3,,P(d3),P(d3))
      * TE Signature : S(_parseAction,P(d3),P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/compiler/src/template_parser/binding_parser.d.ts@3560
     */
    public native Object _parseAction(Object value, Object sourceSpan);
    /** 
      * Std Signature : S(_parseAnimation,3,,P(d3),P(d3),P(d3),P(d3),P(d3))
      * TE Signature : S(_parseAnimation,P(d3),P(d3),P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/compiler/src/template_parser/binding_parser.d.ts@2980
     */
    public native Object _parseAnimation(Object name, Object expression, Object sourceSpan, Object targetMatchableAttrs, Object targetProps);
    /** 
      * Std Signature : S(_parseAnimationEvent,3,,P(d3),P(d3),P(d3),P(d3))
      * TE Signature : S(_parseAnimationEvent,P(d3),P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/compiler/src/template_parser/binding_parser.d.ts@3391
     */
    public native Object _parseAnimationEvent(Object name, Object expression, Object sourceSpan, Object targetEvents);
    /** 
      * Std Signature : S(_parseBinding,3,,P(d3),P(d3),P(d3))
      * TE Signature : S(_parseBinding,P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/compiler/src/template_parser/binding_parser.d.ts@3074
     */
    public native Object _parseBinding(Object value, Object isHostBinding, Object sourceSpan);
    /** 
      * Std Signature : S(_parseEvent,3,,P(d3),P(d3),P(d3),P(d3),P(d3))
      * TE Signature : S(_parseEvent,P(d3),P(d3),P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/compiler/src/template_parser/binding_parser.d.ts@3469
     */
    public native Object _parseEvent(Object name, Object expression, Object sourceSpan, Object targetMatchableAttrs, Object targetEvents);
    /** 
      * Std Signature : S(_parsePropertyAst,3,,P(d3),P(d3),P(d3),P(d3),P(d3))
      * TE Signature : S(_parsePropertyAst,P(d3),P(d3),P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/compiler/src/template_parser/binding_parser.d.ts@2891
     */
    public native Object _parsePropertyAst(Object name, Object ast, Object sourceSpan, Object targetMatchableAttrs, Object targetProps);
    /** 
      * Std Signature : S(_parseTemplateBindings,3,,P(d3),P(d3),P(d3))
      * TE Signature : S(_parseTemplateBindings,P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/compiler/src/template_parser/binding_parser.d.ts@2327
     */
    public native Object _parseTemplateBindings(Object prefixToken, Object value, Object sourceSpan);
    /** 
      * Std Signature : S(_reportError,3,,P(d3),P(d3))
      * TE Signature : S(_reportError,P(d3),P(d3))
      * 
     */
    public native Object _reportError(Object message, Object sourceSpan);
    /** 
      * Std Signature : S(_reportError,3,,P(d3),P(d3),P(d3))
      * TE Signature : S(_reportError,P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/compiler/src/template_parser/binding_parser.d.ts@3605
     */
    public native Object _reportError(Object message, Object sourceSpan, Object level /* optional */);
    /** 
      * Std Signature : S(_reportExpressionParserErrors,3,,P(d3),P(d3))
      * TE Signature : S(_reportExpressionParserErrors,P(d3),P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/compiler/src/template_parser/binding_parser.d.ts@3660
     */
    public native Object _reportExpressionParserErrors(Object errors, Object sourceSpan);
    /** 
      * Std Signature : S(_validatePropertyOrAttributeName,3,,P(d3),P(d3),P(d3))
      * TE Signature : S(_validatePropertyOrAttributeName,P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/compiler/src/template_parser/binding_parser.d.ts@3937
     */
    public native Object _validatePropertyOrAttributeName(Object propName, Object sourceSpan, Object isAttr);
    /** 
      * Std Signature : S(createDirectiveHostEventAsts,7<537>,,P(d531),P(d441))
      * TE Signature : S(createDirectiveHostEventAsts,P(d531),P(d441))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/compiler/src/template_parser/binding_parser.d.ts@1929
     */
    public native Array<BoundEventAst> createDirectiveHostEventAsts(CompileDirectiveSummary dirMeta, ParseSourceSpan sourceSpan);
    /** 
      * Std Signature : S(createDirectiveHostPropertyAsts,7<538>,,P(d531),P(d1),P(d441))
      * TE Signature : S(createDirectiveHostPropertyAsts,P(d531),P(d1),P(d441))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/compiler/src/template_parser/binding_parser.d.ts@1770
     */
    public native Array<BoundElementPropertyAst> createDirectiveHostPropertyAsts(CompileDirectiveSummary dirMeta, String elementSelector, ParseSourceSpan sourceSpan);
    /** 
      * Std Signature : S(createElementPropertyAst,538,,P(d1),P(d620))
      * TE Signature : S(createElementPropertyAst,P(d1),P(d620))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/compiler/src/template_parser/binding_parser.d.ts@3135
     */
    public native BoundElementPropertyAst createElementPropertyAst(String elementSelector, BoundProperty boundProp);
    /** 
      * Std Signature : S(getUsedPipes,7<1221>,,)
      * TE Signature : S(getUsedPipes,)
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/compiler/src/template_parser/binding_parser.d.ts@1728
     */
    public native Array<CompilePipeSummary> getUsedPipes();
    /** 
      * Std Signature : S(parseEvent,429,,P(d1),P(d1),P(d441),P(d7<2<1>>),P(d7<537>))
      * TE Signature : S(parseEvent,P(d1),P(d1),P(d441),P(d7),P(d7))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/compiler/src/template_parser/binding_parser.d.ts@3241
     */
    public native void parseEvent(String name, String expression, ParseSourceSpan sourceSpan, Array<Array<String>> targetMatchableAttrs, Array<BoundEventAst> targetEvents);
    /** 
      * Std Signature : S(parseInlineTemplateBinding,429,,P(d1),P(d1),P(d441),P(d7<2<1>>),P(d7<620>),P(d7<536>))
      * TE Signature : S(parseInlineTemplateBinding,P(d1),P(d1),P(d441),P(d7),P(d7),P(d7))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/compiler/src/template_parser/binding_parser.d.ts@2133
     */
    public native void parseInlineTemplateBinding(String prefixToken, String value, ParseSourceSpan sourceSpan, Array<Array<String>> targetMatchableAttrs, Array<BoundProperty> targetProps, Array<VariableAst> targetVars);
    /** 
      * Std Signature : S(parseInterpolation,526,,P(d1),P(d441))
      * TE Signature : S(parseInterpolation,P(d1),P(d441))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/compiler/src/template_parser/binding_parser.d.ts@2050
     */
    public native ASTWithSource parseInterpolation(String value, ParseSourceSpan sourceSpan);
    /** 
      * Std Signature : S(parseLiteralAttr,429,,P(d1),P(d1),P(d441),P(d7<2<1>>),P(d7<620>))
      * TE Signature : S(parseLiteralAttr,P(d1),P(d1),P(d441),P(d7),P(d7))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/compiler/src/template_parser/binding_parser.d.ts@2395
     */
    public native void parseLiteralAttr(String name, String value, ParseSourceSpan sourceSpan, Array<Array<String>> targetMatchableAttrs, Array<BoundProperty> targetProps);
    /** 
      * Std Signature : S(parsePropertyBinding,429,,P(d1),P(d1),P(d27),P(d441),P(d7<2<1>>),P(d7<620>))
      * TE Signature : S(parsePropertyBinding,P(d1),P(d1),P(d27),P(d441),P(d7),P(d7))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/compiler/src/template_parser/binding_parser.d.ts@2552
     */
    public native void parsePropertyBinding(String name, String expression, Boolean isHost, ParseSourceSpan sourceSpan, Array<Array<String>> targetMatchableAttrs, Array<BoundProperty> targetProps);
    /** 
      * Std Signature : S(parsePropertyInterpolation,27,,P(d1),P(d1),P(d441),P(d7<2<1>>),P(d7<620>))
      * TE Signature : S(parsePropertyInterpolation,P(d1),P(d1),P(d441),P(d7),P(d7))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/compiler/src/template_parser/binding_parser.d.ts@2728
     */
    public native Boolean parsePropertyInterpolation(String name, String value, ParseSourceSpan sourceSpan, Array<Array<String>> targetMatchableAttrs, Array<BoundProperty> targetProps);
}

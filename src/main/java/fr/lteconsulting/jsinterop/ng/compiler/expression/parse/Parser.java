package fr.lteconsulting.jsinterop.ng.compiler.expression.parse;

import fr.lteconsulting.jsinterop.ng.compiler.mlparser.InterpolationConfig;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/parser".Parser
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/parser.d.ts:658
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.expression.parse", name="Parser")
public class Parser
{

    /*
        Constructors
    */
    public Parser(Lexer _lexer){
    }

    /*
        Properties
    */

    public Object _lexer;

    @JsProperty( name = "_lexer")
    public native Object get_lexer();

    @JsProperty( name = "_lexer")
    public native void set_lexer( Object value );

    public Object errors;

    @JsProperty( name = "errors")
    public native Object getErrors();

    @JsProperty( name = "errors")
    public native void setErrors( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(_checkNoInterpolation,3,,P(d3),P(d3),P(d3))
      * TE Signature : S(_checkNoInterpolation,P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/parser.d.ts@1776
     */
    public native Object _checkNoInterpolation(Object input, Object location, Object interpolationConfig);
    /** 
      * Std Signature : S(_commentStart,3,,P(d3))
      * TE Signature : S(_commentStart,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/parser.d.ts@1742
     */
    public native Object _commentStart(Object input);
    /** 
      * Std Signature : S(_findInterpolationErrorColumn,3,,P(d3),P(d3),P(d3))
      * TE Signature : S(_findInterpolationErrorColumn,P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/parser.d.ts@1849
     */
    public native Object _findInterpolationErrorColumn(Object parts, Object partInErrIdx, Object interpolationConfig);
    /** 
      * Std Signature : S(_parseBindingAst,3,,P(d3),P(d3),P(d3))
      * TE Signature : S(_parseBindingAst,P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/parser.d.ts@1160
     */
    public native Object _parseBindingAst(Object input, Object location, Object interpolationConfig);
    /** 
      * Std Signature : S(_parseQuote,3,,P(d3),P(d3))
      * TE Signature : S(_parseQuote,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/parser.d.ts@1228
     */
    public native Object _parseQuote(Object input, Object location);
    /** 
      * Std Signature : S(_reportError,3,,P(d3),P(d3),P(d3))
      * TE Signature : S(_reportError,P(d3),P(d3),P(d3))
      * 
     */
    public native Object _reportError(Object message, Object input, Object errLocation);
    /** 
      * Std Signature : S(_reportError,3,,P(d3),P(d3),P(d3),P(d3))
      * TE Signature : S(_reportError,P(d3),P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/parser.d.ts@1091
     */
    public native Object _reportError(Object message, Object input, Object errLocation, Object ctxLocation /* optional */);
    /** 
      * Std Signature : S(_stripComments,3,,P(d3))
      * TE Signature : S(_stripComments,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/parser.d.ts@1707
     */
    public native Object _stripComments(Object input);
    /** 
      * Std Signature : S(parseAction,526,,P(d1),P(d3))
      * TE Signature : S(parseAction,P(d1),P(d3))
      * 
     */
    public native ASTWithSource parseAction(String input, Object location);
    /** 
      * Std Signature : S(parseAction,526,,P(d1),P(d3),P(d546))
      * TE Signature : S(parseAction,P(d1),P(d3),P(d546))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/parser.d.ts@765
     */
    public native ASTWithSource parseAction(String input, Object location, InterpolationConfig interpolationConfig /* optional */);
    /** 
      * Std Signature : S(parseBinding,526,,P(d1),P(d3))
      * TE Signature : S(parseBinding,P(d1),P(d3))
      * 
     */
    public native ASTWithSource parseBinding(String input, Object location);
    /** 
      * Std Signature : S(parseBinding,526,,P(d1),P(d3),P(d546))
      * TE Signature : S(parseBinding,P(d1),P(d3),P(d546))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/parser.d.ts@870
     */
    public native ASTWithSource parseBinding(String input, Object location, InterpolationConfig interpolationConfig /* optional */);
    /** 
      * Std Signature : S(parseInterpolation,526,,P(d1),P(d3))
      * TE Signature : S(parseInterpolation,P(d1),P(d3))
      * 
     */
    public native ASTWithSource parseInterpolation(String input, Object location);
    /** 
      * Std Signature : S(parseInterpolation,526,,P(d1),P(d3),P(d546))
      * TE Signature : S(parseInterpolation,P(d1),P(d3),P(d546))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/parser.d.ts@1383
     */
    public native ASTWithSource parseInterpolation(String input, Object location, InterpolationConfig interpolationConfig /* optional */);
    /** 
      * Std Signature : S(parseSimpleBinding,526,,P(d1),P(d1))
      * TE Signature : S(parseSimpleBinding,P(d1),P(d1))
      * 
     */
    public native ASTWithSource parseSimpleBinding(String input, String location);
    /** 
      * Std Signature : S(parseSimpleBinding,526,,P(d1),P(d1),P(d546))
      * TE Signature : S(parseSimpleBinding,P(d1),P(d1),P(d546))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/parser.d.ts@976
     */
    public native ASTWithSource parseSimpleBinding(String input, String location, InterpolationConfig interpolationConfig /* optional */);
    /** 
      * Std Signature : S(parseTemplateBindings,1224,,P(d1),P(d1),P(d3))
      * TE Signature : S(parseTemplateBindings,P(d1),P(d1),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/parser.d.ts@1270
     */
    public native TemplateBindingParseResult parseTemplateBindings(String prefixToken, String input, Object location);
    /** 
      * Std Signature : S(splitInterpolation,1225,,P(d1),P(d1))
      * TE Signature : S(splitInterpolation,P(d1),P(d1))
      * 
     */
    public native SplitInterpolation splitInterpolation(String input, String location);
    /** 
      * Std Signature : S(splitInterpolation,1225,,P(d1),P(d1),P(d546))
      * TE Signature : S(splitInterpolation,P(d1),P(d1),P(d546))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/parser.d.ts@1502
     */
    public native SplitInterpolation splitInterpolation(String input, String location, InterpolationConfig interpolationConfig /* optional */);
    /** 
      * Std Signature : S(wrapLiteralPrimitive,526,,P(d1),P(d3))
      * TE Signature : S(wrapLiteralPrimitive,P(d1),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/parser.d.ts@1629
     */
    public native ASTWithSource wrapLiteralPrimitive(String input, Object location);
}

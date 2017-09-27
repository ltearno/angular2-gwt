package fr.lteconsulting.jsinterop.ng.compiler.expression.parse;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/parser"._ParseAST
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/parser.d.ts:1931
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.expression.parse", name="_ParseAST")
public class _ParseAST
{

    /*
        Constructors
    */
    public _ParseAST(String input, Object location, Array<Token> tokens, Number inputLength, Boolean parseAction, Array<ParserError> errors, Number offset){
    }

    /*
        Properties
    */

    public Object errors;

    @JsProperty( name = "errors")
    public native Object getErrors();

    @JsProperty( name = "errors")
    public native void setErrors( Object value );

    public Number index;

    @JsProperty( name = "index")
    public native Number getIndex();

    @JsProperty( name = "index")
    public native void setIndex( Number value );

    public String input;

    @JsProperty( name = "input")
    public native String getInput();

    @JsProperty( name = "input")
    public native void setInput( String value );

    public Number inputIndex;

    @JsProperty( name = "inputIndex")
    public native Number getInputIndex();

    @JsProperty( name = "inputIndex")
    public native void setInputIndex( Number value );

    public Number inputLength;

    @JsProperty( name = "inputLength")
    public native Number getInputLength();

    @JsProperty( name = "inputLength")
    public native void setInputLength( Number value );

    public Object location;

    @JsProperty( name = "location")
    public native Object getLocation();

    @JsProperty( name = "location")
    public native void setLocation( Object value );

    public Token next;

    @JsProperty( name = "next")
    public native Token getNext();

    @JsProperty( name = "next")
    public native void setNext( Token value );

    public Object offset;

    @JsProperty( name = "offset")
    public native Object getOffset();

    @JsProperty( name = "offset")
    public native void setOffset( Object value );

    public Boolean parseAction;

    @JsProperty( name = "parseAction")
    public native Boolean getParseAction();

    @JsProperty( name = "parseAction")
    public native void setParseAction( Boolean value );

    public Object rbracesExpected;

    @JsProperty( name = "rbracesExpected")
    public native Object getRbracesExpected();

    @JsProperty( name = "rbracesExpected")
    public native void setRbracesExpected( Object value );

    public Object rbracketsExpected;

    @JsProperty( name = "rbracketsExpected")
    public native Object getRbracketsExpected();

    @JsProperty( name = "rbracketsExpected")
    public native void setRbracketsExpected( Object value );

    public Object rparensExpected;

    @JsProperty( name = "rparensExpected")
    public native Object getRparensExpected();

    @JsProperty( name = "rparensExpected")
    public native void setRparensExpected( Object value );

    public Array<Token> tokens;

    @JsProperty( name = "tokens")
    public native Array<Token> getTokens();

    @JsProperty( name = "tokens")
    public native void setTokens( Array<Token> value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(advance,429,,)
      * TE Signature : S(advance,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/parser.d.ts@2501
     */
    public native void advance();
    /** 
      * Std Signature : S(error,429,,P(d1))
      * TE Signature : S(error,P(d1))
      * 
     */
    public native void error(String message);
    /** 
      * Std Signature : S(error,429,,P(d1),P(d2))
      * TE Signature : S(error,P(d1),P(d2))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/parser.d.ts@3580
     */
    public native void error(String message, Number index /* optional */);
    /** 
      * Std Signature : S(expectCharacter,429,,P(d2))
      * TE Signature : S(expectCharacter,P(d2))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/parser.d.ts@2629
     */
    public native void expectCharacter(Number code);
    /** 
      * Std Signature : S(expectIdentifierOrKeyword,1,,)
      * TE Signature : S(expectIdentifierOrKeyword,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/parser.d.ts@2757
     */
    public native String expectIdentifierOrKeyword();
    /** 
      * Std Signature : S(expectIdentifierOrKeywordOrString,1,,)
      * TE Signature : S(expectIdentifierOrKeywordOrString,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/parser.d.ts@2798
     */
    public native String expectIdentifierOrKeywordOrString();
    /** 
      * Std Signature : S(expectOperator,429,,P(d1))
      * TE Signature : S(expectOperator,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/parser.d.ts@2713
     */
    public native void expectOperator(String operator);
    /** 
      * Std Signature : S(expectTemplateBindingKey,1,,)
      * TE Signature : S(expectTemplateBindingKey,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/parser.d.ts@3483
      * An identifier, a keyword, a string with an optional `-` inbetween.
     */
    public native String expectTemplateBindingKey();
    /** 
      * Std Signature : S(locationText,3,,)
      * TE Signature : S(locationText,)
      * 
     */
    public native Object locationText();
    /** 
      * Std Signature : S(locationText,3,,P(d3))
      * TE Signature : S(locationText,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/parser.d.ts@3637
     */
    public native Object locationText(Object index /* optional */);
    /** 
      * Std Signature : S(optionalCharacter,27,,P(d2))
      * TE Signature : S(optionalCharacter,P(d2))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/parser.d.ts@2522
     */
    public native Boolean optionalCharacter(Number code);
    /** 
      * Std Signature : S(optionalOperator,27,,P(d1))
      * TE Signature : S(optionalOperator,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/parser.d.ts@2670
     */
    public native Boolean optionalOperator(String op);
    /** 
      * Std Signature : S(parseAccessMemberOrMethodCall,504,,P(d504))
      * TE Signature : S(parseAccessMemberOrMethodCall,P(d504))
      * 
     */
    public native AST parseAccessMemberOrMethodCall(AST receiver);
    /** 
      * Std Signature : S(parseAccessMemberOrMethodCall,504,,P(d504),P(d27))
      * TE Signature : S(parseAccessMemberOrMethodCall,P(d504),P(d27))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/parser.d.ts@3279
     */
    public native AST parseAccessMemberOrMethodCall(AST receiver, Boolean isSafe /* optional */);
    /** 
      * Std Signature : S(parseAdditive,504,,)
      * TE Signature : S(parseAdditive,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/parser.d.ts@3058
     */
    public native AST parseAdditive();
    /** 
      * Std Signature : S(parseCallArguments,7<518>,,)
      * TE Signature : S(parseCallArguments,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/parser.d.ts@3352
     */
    public native Array<BindingPipe> parseCallArguments();
    /** 
      * Std Signature : S(parseCallChain,504,,)
      * TE Signature : S(parseCallChain,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/parser.d.ts@3140
     */
    public native AST parseCallChain();
    /** 
      * Std Signature : S(parseChain,504,,)
      * TE Signature : S(parseChain,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/parser.d.ts@2847
     */
    public native AST parseChain();
    /** 
      * Std Signature : S(parseConditional,504,,)
      * TE Signature : S(parseConditional,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/parser.d.ts@2920
     */
    public native AST parseConditional();
    /** 
      * Std Signature : S(parseEquality,504,,)
      * TE Signature : S(parseEquality,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/parser.d.ts@3004
     */
    public native AST parseEquality();
    /** 
      * Std Signature : S(parseExpression,504,,)
      * TE Signature : S(parseExpression,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/parser.d.ts@2892
     */
    public native AST parseExpression();
    /** 
      * Std Signature : S(parseExpressionList,7<504>,,P(d2))
      * TE Signature : S(parseExpressionList,P(d2))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/parser.d.ts@3192
     */
    public native Array<AST> parseExpressionList(Number terminator);
    /** 
      * Std Signature : S(parseLiteralMap,515,,)
      * TE Signature : S(parseLiteralMap,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/parser.d.ts@3244
     */
    public native LiteralMap parseLiteralMap();
    /** 
      * Std Signature : S(parseLogicalAnd,504,,)
      * TE Signature : S(parseLogicalAnd,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/parser.d.ts@2976
     */
    public native AST parseLogicalAnd();
    /** 
      * Std Signature : S(parseLogicalOr,504,,)
      * TE Signature : S(parseLogicalOr,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/parser.d.ts@2949
     */
    public native AST parseLogicalOr();
    /** 
      * Std Signature : S(parseMultiplicative,504,,)
      * TE Signature : S(parseMultiplicative,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/parser.d.ts@3084
     */
    public native AST parseMultiplicative();
    /** 
      * Std Signature : S(parsePipe,504,,)
      * TE Signature : S(parsePipe,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/parser.d.ts@2870
     */
    public native AST parsePipe();
    /** 
      * Std Signature : S(parsePrefix,504,,)
      * TE Signature : S(parsePrefix,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/parser.d.ts@3116
     */
    public native AST parsePrefix();
    /** 
      * Std Signature : S(parsePrimary,504,,)
      * TE Signature : S(parsePrimary,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/parser.d.ts@3167
     */
    public native AST parsePrimary();
    /** 
      * Std Signature : S(parseRelational,504,,)
      * TE Signature : S(parseRelational,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/parser.d.ts@3030
     */
    public native AST parseRelational();
    /** 
      * Std Signature : S(parseTemplateBindings,1224,,)
      * TE Signature : S(parseTemplateBindings,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/parser.d.ts@3523
     */
    public native TemplateBindingParseResult parseTemplateBindings();
    /** 
      * Std Signature : S(peek,854,,P(d2))
      * TE Signature : S(peek,P(d2))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/parser.d.ts@2373
     */
    public native Token peek(Number offset);
    /** 
      * Std Signature : S(peekKeywordAs,27,,)
      * TE Signature : S(peekKeywordAs,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/parser.d.ts@2599
     */
    public native Boolean peekKeywordAs();
    /** 
      * Std Signature : S(peekKeywordLet,27,,)
      * TE Signature : S(peekKeywordLet,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/parser.d.ts@2568
     */
    public native Boolean peekKeywordLet();
    /** 
      * Std Signature : S(skip,3,,)
      * TE Signature : S(skip,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/parser.d.ts@3671
     */
    public native Object skip();
    /** 
      * Std Signature : S(span,503,,P(d2))
      * TE Signature : S(span,P(d2))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/parser.d.ts@2465
     */
    public native ParseSpan span(Number start);
}

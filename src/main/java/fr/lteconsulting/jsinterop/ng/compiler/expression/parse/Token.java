package fr.lteconsulting.jsinterop.ng.compiler.expression.parse;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/lexer".Token
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/lexer.d.ts:222
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.expression.parse", name="Token")
public class Token
{

    /*
        Constructors
    */
    public Token(Number index, TokenType type, Number numValue, String strValue){
    }

    /*
        Properties
    */

    public Number index;

    @JsProperty( name = "index")
    public native Number getIndex();

    @JsProperty( name = "index")
    public native void setIndex( Number value );

    public Number numValue;

    @JsProperty( name = "numValue")
    public native Number getNumValue();

    @JsProperty( name = "numValue")
    public native void setNumValue( Number value );

    public String strValue;

    @JsProperty( name = "strValue")
    public native String getStrValue();

    @JsProperty( name = "strValue")
    public native void setStrValue( String value );

    public TokenType type;

    @JsProperty( name = "type")
    public native TokenType getType();

    @JsProperty( name = "type")
    public native void setType( TokenType value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(isCharacter,27,,P(d2))
      * TE Signature : S(isCharacter,P(d2))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/lexer.d.ts@425
     */
    public native Boolean isCharacter(Number code);
    /** 
      * Std Signature : S(isError,27,,)
      * TE Signature : S(isError,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/lexer.d.ts@826
     */
    public native Boolean isError();
    /** 
      * Std Signature : S(isIdentifier,27,,)
      * TE Signature : S(isIdentifier,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/lexer.d.ts@558
     */
    public native Boolean isIdentifier();
    /** 
      * Std Signature : S(isKeyword,27,,)
      * TE Signature : S(isKeyword,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/lexer.d.ts@587
     */
    public native Boolean isKeyword();
    /** 
      * Std Signature : S(isKeywordAs,27,,)
      * TE Signature : S(isKeywordAs,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/lexer.d.ts@642
     */
    public native Boolean isKeywordAs();
    /** 
      * Std Signature : S(isKeywordFalse,27,,)
      * TE Signature : S(isKeywordFalse,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/lexer.d.ts@765
     */
    public native Boolean isKeywordFalse();
    /** 
      * Std Signature : S(isKeywordLet,27,,)
      * TE Signature : S(isKeywordLet,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/lexer.d.ts@613
     */
    public native Boolean isKeywordLet();
    /** 
      * Std Signature : S(isKeywordNull,27,,)
      * TE Signature : S(isKeywordNull,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/lexer.d.ts@670
     */
    public native Boolean isKeywordNull();
    /** 
      * Std Signature : S(isKeywordThis,27,,)
      * TE Signature : S(isKeywordThis,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/lexer.d.ts@796
     */
    public native Boolean isKeywordThis();
    /** 
      * Std Signature : S(isKeywordTrue,27,,)
      * TE Signature : S(isKeywordTrue,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/lexer.d.ts@735
     */
    public native Boolean isKeywordTrue();
    /** 
      * Std Signature : S(isKeywordUndefined,27,,)
      * TE Signature : S(isKeywordUndefined,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/lexer.d.ts@700
     */
    public native Boolean isKeywordUndefined();
    /** 
      * Std Signature : S(isNumber,27,,)
      * TE Signature : S(isNumber,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/lexer.d.ts@465
     */
    public native Boolean isNumber();
    /** 
      * Std Signature : S(isOperator,27,,P(d1))
      * TE Signature : S(isOperator,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/lexer.d.ts@515
     */
    public native Boolean isOperator(String operater);
    /** 
      * Std Signature : S(isString,27,,)
      * TE Signature : S(isString,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/lexer.d.ts@490
     */
    public native Boolean isString();
    /** 
      * Std Signature : S(toNumber,2,,)
      * TE Signature : S(toNumber,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/lexer.d.ts@850
     */
    public native Number toNumber();
}

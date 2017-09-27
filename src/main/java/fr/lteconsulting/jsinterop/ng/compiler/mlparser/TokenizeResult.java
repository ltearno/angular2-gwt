package fr.lteconsulting.jsinterop.ng.compiler.mlparser;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/compiler/src/ml_parser/lexer".TokenizeResult
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/compiler/src/ml_parser/lexer.d.ts:1013
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.mlparser", name="TokenizeResult")
public class TokenizeResult
{

    /*
        Constructors
    */
    public TokenizeResult(Array<Token> tokens, Array<TokenError> errors){
    }

    /*
        Properties
    */

    public Array<TokenError> errors;

    @JsProperty( name = "errors")
    public native Array<TokenError> getErrors();

    @JsProperty( name = "errors")
    public native void setErrors( Array<TokenError> value );

    public Array<Token> tokens;

    @JsProperty( name = "tokens")
    public native Array<Token> getTokens();

    @JsProperty( name = "tokens")
    public native void setTokens( Array<Token> value );
}

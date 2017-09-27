package fr.lteconsulting.jsinterop.ng.compiler.mlparser;

import fr.lteconsulting.jsinterop.ng.compiler.ParseError;
import fr.lteconsulting.jsinterop.ng.compiler.ParseSourceSpan;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/compiler/src/ml_parser/lexer".TokenError
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/compiler/src/ml_parser/lexer.d.ts:852
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.mlparser", name="TokenError")
public class TokenError extends ParseError
{

    /*
        Constructors
    */
    public TokenError(String errorMsg, TokenType tokenType, ParseSourceSpan span){
        super(null, null, null);
    }

    /*
        Properties
    */

    public TokenType tokenType;

    @JsProperty( name = "tokenType")
    public native TokenType getTokenType();

    @JsProperty( name = "tokenType")
    public native void setTokenType( TokenType value );
}

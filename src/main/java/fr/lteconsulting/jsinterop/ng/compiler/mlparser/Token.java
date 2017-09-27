package fr.lteconsulting.jsinterop.ng.compiler.mlparser;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.ng.compiler.ParseSourceSpan;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/compiler/src/ml_parser/lexer".Token
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/compiler/src/ml_parser/lexer.d.ts:666
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.mlparser", name="Token")
public class Token
{

    /*
        Constructors
    */
    public Token(TokenType type, Array<String> parts, ParseSourceSpan sourceSpan){
    }

    /*
        Properties
    */

    public Array<String> parts;

    @JsProperty( name = "parts")
    public native Array<String> getParts();

    @JsProperty( name = "parts")
    public native void setParts( Array<String> value );

    public ParseSourceSpan sourceSpan;

    @JsProperty( name = "sourceSpan")
    public native ParseSourceSpan getSourceSpan();

    @JsProperty( name = "sourceSpan")
    public native void setSourceSpan( ParseSourceSpan value );

    public TokenType type;

    @JsProperty( name = "type")
    public native TokenType getType();

    @JsProperty( name = "type")
    public native void setType( TokenType value );
}

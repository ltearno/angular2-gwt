package fr.lteconsulting.jsinterop.ng.compiler;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/parse_util".ParseError
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/parse_util.d.ts:873
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler", name="ParseError")
public class ParseError
{

    /*
        Constructors
    */
    public ParseError(ParseSourceSpan span, String msg, ParseErrorLevel level){
    }

    /*
        Properties
    */

    public ParseErrorLevel level;

    @JsProperty( name = "level")
    public native ParseErrorLevel getLevel();

    @JsProperty( name = "level")
    public native void setLevel( ParseErrorLevel value );

    public String msg;

    @JsProperty( name = "msg")
    public native String getMsg();

    @JsProperty( name = "msg")
    public native void setMsg( String value );

    public ParseSourceSpan span;

    @JsProperty( name = "span")
    public native ParseSourceSpan getSpan();

    @JsProperty( name = "span")
    public native void setSpan( ParseSourceSpan value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(contextualMessage,1,,)
      * TE Signature : S(contextualMessage,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/parse_util.d.ts@1062
     */
    public native String contextualMessage();
}

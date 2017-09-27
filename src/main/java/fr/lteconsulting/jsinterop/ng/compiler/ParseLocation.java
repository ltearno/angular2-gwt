package fr.lteconsulting.jsinterop.ng.compiler;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/parse_util".ParseLocation
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/parse_util.d.ts:63
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler", name="ParseLocation")
public class ParseLocation
{

    /*
        Constructors
    */
    public ParseLocation(ParseSourceFile file, Number offset, Number line, Number col){
    }

    /*
        Properties
    */

    public Number col;

    @JsProperty( name = "col")
    public native Number getCol();

    @JsProperty( name = "col")
    public native void setCol( Number value );

    public ParseSourceFile file;

    @JsProperty( name = "file")
    public native ParseSourceFile getFile();

    @JsProperty( name = "file")
    public native void setFile( ParseSourceFile value );

    public Number line;

    @JsProperty( name = "line")
    public native Number getLine();

    @JsProperty( name = "line")
    public native void setLine( Number value );

    public Number offset;

    @JsProperty( name = "offset")
    public native Number getOffset();

    @JsProperty( name = "offset")
    public native void setOffset( Number value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(getContext,3,,P(d2),P(d2))
      * TE Signature : S(getContext,P(d2),P(d2))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/parse_util.d.ts@336
     */
    public native Object getContext(Number maxChars, Number maxLines);
    /** 
      * Std Signature : S(moveBy,440,,P(d2))
      * TE Signature : S(moveBy,P(d2))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/parse_util.d.ts@294
     */
    public native ParseLocation moveBy(Number delta);
}

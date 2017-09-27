package fr.lteconsulting.jsinterop.ng.compiler.expression.parse;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/ast".ParseSpan
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/ast.d.ts:415
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.expression.parse", name="ParseSpan")
public class ParseSpan
{

    /*
        Constructors
    */
    public ParseSpan(Number start, Number end){
    }

    /*
        Properties
    */

    public Number end;

    @JsProperty( name = "end")
    public native Number getEnd();

    @JsProperty( name = "end")
    public native void setEnd( Number value );

    public Number start;

    @JsProperty( name = "start")
    public native Number getStart();

    @JsProperty( name = "start")
    public native void setStart( Number value );
}

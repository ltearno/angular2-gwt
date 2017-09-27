package fr.lteconsulting.jsinterop.ng.compiler;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/parse_util".ParseSourceSpan
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/parse_util.d.ts:574
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler", name="ParseSourceSpan")
public class ParseSourceSpan
{

    /*
        Constructors
    */
    public ParseSourceSpan(ParseLocation start, ParseLocation end, String details){
    }

    /*
        Properties
    */

    public String details;

    @JsProperty( name = "details")
    public native String getDetails();

    @JsProperty( name = "details")
    public native void setDetails( String value );

    public ParseLocation end;

    @JsProperty( name = "end")
    public native ParseLocation getEnd();

    @JsProperty( name = "end")
    public native void setEnd( ParseLocation value );

    public ParseLocation start;

    @JsProperty( name = "start")
    public native ParseLocation getStart();

    @JsProperty( name = "start")
    public native void setStart( ParseLocation value );
}

package fr.lteconsulting.jsinterop.ng.compiler.mlparser;

import fr.lteconsulting.jsinterop.ng.compiler.ParseError;
import fr.lteconsulting.jsinterop.ng.compiler.ParseSourceSpan;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/ml_parser/parser".TreeError
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/ml_parser/parser.d.ts:396
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.mlparser", name="TreeError")
public class TreeError extends ParseError
{

    /*
        Constructors
    */
    public TreeError(String elementName, ParseSourceSpan span, String msg){
        super(null, null, null);
    }

    /*
        Static methods
    */
    /** 
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/ml_parser/parser.d.ts:485
     */
    @JsMethod(namespace="ng.compiler.mlparser.TreeError", name = "create")
    public static native TreeError create(String elementName, ParseSourceSpan span, String msg);

    /*
        Properties
    */

    public String elementName;

    @JsProperty( name = "elementName")
    public native String getElementName();

    @JsProperty( name = "elementName")
    public native void setElementName( String value );
}

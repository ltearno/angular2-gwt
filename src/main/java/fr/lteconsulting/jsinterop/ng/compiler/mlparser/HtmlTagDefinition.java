package fr.lteconsulting.jsinterop.ng.compiler.mlparser;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/ml_parser/html_tags".HtmlTagDefinition
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/ml_parser/html_tags.d.ts:258
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.mlparser", name="HtmlTagDefinition")
public class HtmlTagDefinition extends TagDefinition
{

    /*
        Constructors
    */
    public HtmlTagDefinition(Object __0){
    }

    /*
        Properties
    */

    public Object closedByChildren;

    @JsProperty( name = "closedByChildren")
    public native Object getClosedByChildren();

    @JsProperty( name = "closedByChildren")
    public native void setClosedByChildren( Object value );
}

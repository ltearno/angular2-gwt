package fr.lteconsulting.jsinterop.ng.compiler.mlparser;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.ng.compiler.ParseSourceSpan;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/ml_parser/ast".Element
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/ml_parser/ast.d.ts:1701
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.mlparser", name="Element")
public class Element extends Node
{

    /*
        Constructors
    */
    public Element(String name, Array<Attribute> attrs, Array<Node> children, ParseSourceSpan sourceSpan, ParseSourceSpan startSourceSpan, ParseSourceSpan endSourceSpan){
    }

    /*
        Properties
    */

    public Array<Attribute> attrs;

    @JsProperty( name = "attrs")
    public native Array<Attribute> getAttrs();

    @JsProperty( name = "attrs")
    public native void setAttrs( Array<Attribute> value );

    public Array<Node> children;

    @JsProperty( name = "children")
    public native Array<Node> getChildren();

    @JsProperty( name = "children")
    public native void setChildren( Array<Node> value );

    public ParseSourceSpan endSourceSpan;

    @JsProperty( name = "endSourceSpan")
    public native ParseSourceSpan getEndSourceSpan();

    @JsProperty( name = "endSourceSpan")
    public native void setEndSourceSpan( ParseSourceSpan value );

    public String name;

    @JsProperty( name = "name")
    public native String getName();

    @JsProperty( name = "name")
    public native void setName( String value );

    public ParseSourceSpan startSourceSpan;

    @JsProperty( name = "startSourceSpan")
    public native ParseSourceSpan getStartSourceSpan();

    @JsProperty( name = "startSourceSpan")
    public native void setStartSourceSpan( ParseSourceSpan value );
}

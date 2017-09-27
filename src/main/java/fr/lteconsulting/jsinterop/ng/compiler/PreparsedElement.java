package fr.lteconsulting.jsinterop.ng.compiler;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/compiler/src/template_parser/template_preparser".PreparsedElement
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/compiler/src/template_parser/template_preparser.d.ts:453
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler", name="PreparsedElement")
public class PreparsedElement
{

    /*
        Constructors
    */
    public PreparsedElement(PreparsedElementType type, String selectAttr, String hrefAttr, Boolean nonBindable, String projectAs){
    }

    /*
        Properties
    */

    public String hrefAttr;

    @JsProperty( name = "hrefAttr")
    public native String getHrefAttr();

    @JsProperty( name = "hrefAttr")
    public native void setHrefAttr( String value );

    public Boolean nonBindable;

    @JsProperty( name = "nonBindable")
    public native Boolean getNonBindable();

    @JsProperty( name = "nonBindable")
    public native void setNonBindable( Boolean value );

    public String projectAs;

    @JsProperty( name = "projectAs")
    public native String getProjectAs();

    @JsProperty( name = "projectAs")
    public native void setProjectAs( String value );

    public String selectAttr;

    @JsProperty( name = "selectAttr")
    public native String getSelectAttr();

    @JsProperty( name = "selectAttr")
    public native void setSelectAttr( String value );

    public PreparsedElementType type;

    @JsProperty( name = "type")
    public native PreparsedElementType getType();

    @JsProperty( name = "type")
    public native void setType( PreparsedElementType value );
}

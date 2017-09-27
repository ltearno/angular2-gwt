package fr.lteconsulting.jsinterop.ng.compiler.i18n;

import fr.lteconsulting.jsinterop.browser.AnonymousType817;
import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.ng.compiler.ParseSourceSpan;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/i18n/i18n_ast".TagPlaceholder
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/i18n/i18n_ast.d.ts:2061
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.i18n", name="TagPlaceholder")
public class TagPlaceholder extends Node
{

    /*
        Constructors
    */
    public TagPlaceholder(String tag, AnonymousType817 attrs, String startName, String closeName, Array<Node> children, Boolean isVoid, ParseSourceSpan sourceSpan){
    }

    /*
        Properties
    */

    public AnonymousType817 attrs;

    @JsProperty( name = "attrs")
    public native AnonymousType817 getAttrs();

    @JsProperty( name = "attrs")
    public native void setAttrs( AnonymousType817 value );

    public Array<Node> children;

    @JsProperty( name = "children")
    public native Array<Node> getChildren();

    @JsProperty( name = "children")
    public native void setChildren( Array<Node> value );

    public String closeName;

    @JsProperty( name = "closeName")
    public native String getCloseName();

    @JsProperty( name = "closeName")
    public native void setCloseName( String value );

    public Boolean isVoid;

    @JsProperty( name = "isVoid")
    public native Boolean getIsVoid();

    @JsProperty( name = "isVoid")
    public native void setIsVoid( Boolean value );

    public String startName;

    @JsProperty( name = "startName")
    public native String getStartName();

    @JsProperty( name = "startName")
    public native void setStartName( String value );

    public String tag;

    @JsProperty( name = "tag")
    public native String getTag();

    @JsProperty( name = "tag")
    public native void setTag( String value );
}

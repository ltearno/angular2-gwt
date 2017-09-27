package fr.lteconsulting.jsinterop.ng.compiler.i18n;

import fr.lteconsulting.jsinterop.browser.AnonymousType817;
import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/compiler/src/i18n/serializers/xml_helper".Tag
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/compiler/src/i18n/serializers/xml_helper.d.ts:876
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.i18n", name="Tag")
public class Tag extends Node
{

    /*
        Constructors
    */
    public Tag(String name, AnonymousType817 unescapedAttrs, Array<Node> children){
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

    public String name;

    @JsProperty( name = "name")
    public native String getName();

    @JsProperty( name = "name")
    public native void setName( String value );
}

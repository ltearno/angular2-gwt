package fr.lteconsulting.jsinterop.ng.compiler.i18n;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/compiler/src/i18n/serializers/xml_helper".Doctype
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/compiler/src/i18n/serializers/xml_helper.d.ts:707
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.i18n", name="Doctype")
public class Doctype extends Node
{

    /*
        Constructors
    */
    public Doctype(String rootTag, String dtd){
    }

    /*
        Properties
    */

    public String dtd;

    @JsProperty( name = "dtd")
    public native String getDtd();

    @JsProperty( name = "dtd")
    public native void setDtd( String value );

    public String rootTag;

    @JsProperty( name = "rootTag")
    public native String getRootTag();

    @JsProperty( name = "rootTag")
    public native void setRootTag( String value );
}

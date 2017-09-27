package fr.lteconsulting.jsinterop.ng.compiler.i18n;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/compiler/src/i18n/serializers/xml_helper".Text
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/compiler/src/i18n/serializers/xml_helper.d.ts:1150
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.i18n", name="Text")
public class Text extends Node
{

    /*
        Constructors
    */
    public Text(String unescapedValue){
    }

    /*
        Properties
    */

    public String value;

    @JsProperty( name = "value")
    public native String getValue();

    @JsProperty( name = "value")
    public native void setValue( String value );
}

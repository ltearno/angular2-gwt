package fr.lteconsulting.jsinterop.ng.compiler.i18n;

import fr.lteconsulting.jsinterop.browser.AnonymousType817;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/compiler/src/i18n/serializers/xml_helper".Declaration
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/compiler/src/i18n/serializers/xml_helper.d.ts:499
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.i18n", name="Declaration")
public class Declaration extends Node
{

    /*
        Constructors
    */
    public Declaration(AnonymousType817 unescapedAttrs){
    }

    /*
        Properties
    */

    public AnonymousType817 attrs;

    @JsProperty( name = "attrs")
    public native AnonymousType817 getAttrs();

    @JsProperty( name = "attrs")
    public native void setAttrs( AnonymousType817 value );
}

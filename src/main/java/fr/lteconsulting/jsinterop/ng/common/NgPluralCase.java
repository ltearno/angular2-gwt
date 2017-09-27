package fr.lteconsulting.jsinterop.ng.common;

import fr.lteconsulting.jsinterop.ng.core.TemplateRef;
import fr.lteconsulting.jsinterop.ng.core.ViewContainerRef;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/directives/ng_plural".NgPluralCase
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/directives/ng_plural.d.ts:1927
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.common", name="NgPluralCase")
public class NgPluralCase
{

    /*
        Constructors
    */
    public NgPluralCase(String value, TemplateRef<Object> template, ViewContainerRef viewContainer, NgPlural ngPlural){
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

package fr.lteconsulting.jsinterop.ng.compiler;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/compiler/src/shadow_css".CssRule
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/compiler/src/shadow_css.d.ts:1721
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler", name="CssRule")
public class CssRule
{

    /*
        Constructors
    */
    public CssRule(String selector, String content){
    }

    /*
        Properties
    */

    public String content;

    @JsProperty( name = "content")
    public native String getContent();

    @JsProperty( name = "content")
    public native void setContent( String value );

    public String selector;

    @JsProperty( name = "selector")
    public native String getSelector();

    @JsProperty( name = "selector")
    public native void setSelector( String value );
}

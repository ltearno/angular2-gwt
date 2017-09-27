package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: CSSPageRule
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:295286
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:295474
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="CSSPageRule")
public class CSSPageRule extends CSSRule
{

    /*
        Constructors
    */
    public CSSPageRule(){
    }

    /*
        Properties
    */

    public String pseudoClass;

    @JsProperty( name = "pseudoClass")
    public native String getPseudoClass();

    @JsProperty( name = "pseudoClass")
    public native void setPseudoClass( String value );

    public String selector;

    @JsProperty( name = "selector")
    public native String getSelector();

    @JsProperty( name = "selector")
    public native void setSelector( String value );

    public String selectorText;

    @JsProperty( name = "selectorText")
    public native String getSelectorText();

    @JsProperty( name = "selectorText")
    public native void setSelectorText( String value );

    public CSSStyleDeclaration style;

    @JsProperty( name = "style")
    public native CSSStyleDeclaration getStyle();

    @JsProperty( name = "style")
    public native void setStyle( CSSStyleDeclaration value );
}

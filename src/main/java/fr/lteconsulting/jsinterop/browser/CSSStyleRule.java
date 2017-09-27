package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: CSSStyleRule
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:309063
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:309219
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="CSSStyleRule")
public class CSSStyleRule extends CSSRule
{

    /*
        Constructors
    */
    public CSSStyleRule(){
    }

    /*
        Properties
    */

    public Boolean readOnly;

    @JsProperty( name = "readOnly")
    public native Boolean getReadOnly();

    @JsProperty( name = "readOnly")
    public native void setReadOnly( Boolean value );

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

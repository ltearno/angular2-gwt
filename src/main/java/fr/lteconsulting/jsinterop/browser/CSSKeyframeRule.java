package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: CSSKeyframeRule
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:294389
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:294511
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="CSSKeyframeRule")
public class CSSKeyframeRule extends CSSRule
{

    /*
        Constructors
    */
    public CSSKeyframeRule(){
    }

    /*
        Properties
    */

    public String keyText;

    @JsProperty( name = "keyText")
    public native String getKeyText();

    @JsProperty( name = "keyText")
    public native void setKeyText( String value );

    public CSSStyleDeclaration style;

    @JsProperty( name = "style")
    public native CSSStyleDeclaration getStyle();

    @JsProperty( name = "style")
    public native void setStyle( CSSStyleDeclaration value );
}

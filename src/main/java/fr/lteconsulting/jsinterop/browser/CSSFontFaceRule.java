package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: CSSFontFaceRule
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:293709
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:293810
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="CSSFontFaceRule")
public class CSSFontFaceRule extends CSSRule
{

    /*
        Constructors
    */
    public CSSFontFaceRule(){
    }

    /*
        Properties
    */

    public CSSStyleDeclaration style;

    @JsProperty( name = "style")
    public native CSSStyleDeclaration getStyle();

    @JsProperty( name = "style")
    public native void setStyle( CSSStyleDeclaration value );
}

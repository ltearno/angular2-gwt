package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: CSSImportRule
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:294158
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:294314
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="CSSImportRule")
public class CSSImportRule extends CSSRule
{

    /*
        Constructors
    */
    public CSSImportRule(){
    }

    /*
        Properties
    */

    public String href;

    @JsProperty( name = "href")
    public native String getHref();

    @JsProperty( name = "href")
    public native void setHref( String value );

    public MediaList media;

    @JsProperty( name = "media")
    public native MediaList getMedia();

    @JsProperty( name = "media")
    public native void setMedia( MediaList value );

    public CSSStyleSheet styleSheet;

    @JsProperty( name = "styleSheet")
    public native CSSStyleSheet getStyleSheet();

    @JsProperty( name = "styleSheet")
    public native void setStyleSheet( CSSStyleSheet value );
}

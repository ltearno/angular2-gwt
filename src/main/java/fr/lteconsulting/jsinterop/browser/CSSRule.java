package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: CSSRule
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:295543
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:296128
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="CSSRule")
public class CSSRule
{

    /*
        Constructors
    */
    public CSSRule(){
    }

    /*
        Static properties
    */

    @JsProperty(namespace="CSSRule", name="CHARSET_RULE")
    public static Number CHARSET_RULE;

    @JsProperty(namespace="CSSRule", name="FONT_FACE_RULE")
    public static Number FONT_FACE_RULE;

    @JsProperty(namespace="CSSRule", name="IMPORT_RULE")
    public static Number IMPORT_RULE;

    @JsProperty(namespace="CSSRule", name="KEYFRAMES_RULE")
    public static Number KEYFRAMES_RULE;

    @JsProperty(namespace="CSSRule", name="KEYFRAME_RULE")
    public static Number KEYFRAME_RULE;

    @JsProperty(namespace="CSSRule", name="MEDIA_RULE")
    public static Number MEDIA_RULE;

    @JsProperty(namespace="CSSRule", name="NAMESPACE_RULE")
    public static Number NAMESPACE_RULE;

    @JsProperty(namespace="CSSRule", name="PAGE_RULE")
    public static Number PAGE_RULE;

    @JsProperty(namespace="CSSRule", name="STYLE_RULE")
    public static Number STYLE_RULE;

    @JsProperty(namespace="CSSRule", name="SUPPORTS_RULE")
    public static Number SUPPORTS_RULE;

    @JsProperty(namespace="CSSRule", name="UNKNOWN_RULE")
    public static Number UNKNOWN_RULE;

    @JsProperty(namespace="CSSRule", name="VIEWPORT_RULE")
    public static Number VIEWPORT_RULE;

    /*
        Properties
    */

    public String cssText;

    @JsProperty( name = "cssText")
    public native String getCssText();

    @JsProperty( name = "cssText")
    public native void setCssText( String value );

    public CSSRule parentRule;

    @JsProperty( name = "parentRule")
    public native CSSRule getParentRule();

    @JsProperty( name = "parentRule")
    public native void setParentRule( CSSRule value );

    public CSSStyleSheet parentStyleSheet;

    @JsProperty( name = "parentStyleSheet")
    public native CSSStyleSheet getParentStyleSheet();

    @JsProperty( name = "parentStyleSheet")
    public native void setParentStyleSheet( CSSStyleSheet value );

    public Number type;

    @JsProperty( name = "type")
    public native Number getType();

    @JsProperty( name = "type")
    public native void setType( Number value );
}

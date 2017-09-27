package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: CSSMediaRule
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:294908
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:295005
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="CSSMediaRule")
public class CSSMediaRule extends CSSConditionRule
{

    /*
        Constructors
    */
    public CSSMediaRule(){
    }

    /*
        Properties
    */

    public MediaList media;

    @JsProperty( name = "media")
    public native MediaList getMedia();

    @JsProperty( name = "media")
    public native void setMedia( MediaList value );
}

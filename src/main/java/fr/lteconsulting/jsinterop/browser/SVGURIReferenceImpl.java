package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: SVGURIReference
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:735333
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGURIReference")
public class SVGURIReferenceImpl implements SVGURIReference
{

    /*
        Properties
    */

    public SVGAnimatedString href;

    @JsProperty( name = "href")
    public native SVGAnimatedString getHref();

    @JsProperty( name = "href")
    public native void setHref( SVGAnimatedString value );
}

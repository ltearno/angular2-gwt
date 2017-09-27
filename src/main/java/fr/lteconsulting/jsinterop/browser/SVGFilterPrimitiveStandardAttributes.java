package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: SVGFilterPrimitiveStandardAttributes
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:734748
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGFilterPrimitiveStandardAttributes")
public class SVGFilterPrimitiveStandardAttributes
{

    /*
        Properties
    */

    public SVGAnimatedLength height;

    @JsProperty( name = "height")
    public native SVGAnimatedLength getHeight();

    @JsProperty( name = "height")
    public native void setHeight( SVGAnimatedLength value );

    public SVGAnimatedString result;

    @JsProperty( name = "result")
    public native SVGAnimatedString getResult();

    @JsProperty( name = "result")
    public native void setResult( SVGAnimatedString value );

    public SVGAnimatedLength width;

    @JsProperty( name = "width")
    public native SVGAnimatedLength getWidth();

    @JsProperty( name = "width")
    public native void setWidth( SVGAnimatedLength value );

    public SVGAnimatedLength x;

    @JsProperty( name = "x")
    public native SVGAnimatedLength getX();

    @JsProperty( name = "x")
    public native void setX( SVGAnimatedLength value );

    public SVGAnimatedLength y;

    @JsProperty( name = "y")
    public native SVGAnimatedLength getY();

    @JsProperty( name = "y")
    public native void setY( SVGAnimatedLength value );
}

package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: SVGGraphicsElement
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:601004
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:601645
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface SVGGraphicsElement extends SVGElement, SVGTests
{

    /*
        Properties
    */

    @JsProperty( name = "farthestViewportElement")
    SVGElement getFarthestViewportElement();

    @JsProperty( name = "farthestViewportElement")
    void setFarthestViewportElement( SVGElement value );

    @JsProperty( name = "nearestViewportElement")
    SVGElement getNearestViewportElement();

    @JsProperty( name = "nearestViewportElement")
    void setNearestViewportElement( SVGElement value );

    @JsProperty( name = "transform")
    SVGAnimatedTransformList getTransform();

    @JsProperty( name = "transform")
    void setTransform( SVGAnimatedTransformList value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(getBBox,118,,)
      * TE Signature : S(getBBox,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@601219
     */
    SVGRect getBBox();
    /** 
      * Std Signature : S(getCTM,94,,)
      * TE Signature : S(getCTM,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@601243
     */
    SVGMatrix getCTM();
    /** 
      * Std Signature : S(getScreenCTM,94,,)
      * TE Signature : S(getScreenCTM,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@601268
     */
    SVGMatrix getScreenCTM();
    /** 
      * Std Signature : S(getTransformToElement,94,,P(d116))
      * TE Signature : S(getTransformToElement,P(d116))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@601299
     */
    SVGMatrix getTransformToElement(SVGElement element);
}

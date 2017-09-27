package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: SVGTests
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:735125
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface SVGTests
{

    /*
        Properties
    */

    @JsProperty( name = "requiredExtensions")
    SVGStringList getRequiredExtensions();

    @JsProperty( name = "requiredExtensions")
    void setRequiredExtensions( SVGStringList value );

    @JsProperty( name = "requiredFeatures")
    SVGStringList getRequiredFeatures();

    @JsProperty( name = "requiredFeatures")
    void setRequiredFeatures( SVGStringList value );

    @JsProperty( name = "systemLanguage")
    SVGStringList getSystemLanguage();

    @JsProperty( name = "systemLanguage")
    void setSystemLanguage( SVGStringList value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(hasExtension,27,,P(d1))
      * TE Signature : S(hasExtension,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@735290
     */
    Boolean hasExtension(String extension);
}

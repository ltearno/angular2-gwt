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
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGTests")
public class SVGTestsImpl implements SVGTests
{

    /*
        Properties
    */

    public SVGStringList requiredExtensions;

    @JsProperty( name = "requiredExtensions")
    public native SVGStringList getRequiredExtensions();

    @JsProperty( name = "requiredExtensions")
    public native void setRequiredExtensions( SVGStringList value );

    public SVGStringList requiredFeatures;

    @JsProperty( name = "requiredFeatures")
    public native SVGStringList getRequiredFeatures();

    @JsProperty( name = "requiredFeatures")
    public native void setRequiredFeatures( SVGStringList value );

    public SVGStringList systemLanguage;

    @JsProperty( name = "systemLanguage")
    public native SVGStringList getSystemLanguage();

    @JsProperty( name = "systemLanguage")
    public native void setSystemLanguage( SVGStringList value );

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
    public native Boolean hasExtension(String extension);
}

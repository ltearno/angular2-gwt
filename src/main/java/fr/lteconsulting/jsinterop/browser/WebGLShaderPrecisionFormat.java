package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: WebGLShaderPrecisionFormat
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:699314
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:699463
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="WebGLShaderPrecisionFormat")
public class WebGLShaderPrecisionFormat
{

    /*
        Constructors
    */
    public WebGLShaderPrecisionFormat(){
    }

    /*
        Properties
    */

    public Number precision;

    @JsProperty( name = "precision")
    public native Number getPrecision();

    @JsProperty( name = "precision")
    public native void setPrecision( Number value );

    public Number rangeMax;

    @JsProperty( name = "rangeMax")
    public native Number getRangeMax();

    @JsProperty( name = "rangeMax")
    public native void setRangeMax( Number value );

    public Number rangeMin;

    @JsProperty( name = "rangeMin")
    public native Number getRangeMin();

    @JsProperty( name = "rangeMin")
    public native void setRangeMin( Number value );
}

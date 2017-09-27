package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: WebGLContextAttributes
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:281529
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="WebGLContextAttributes")
public class WebGLContextAttributes
{

    /*
        Properties
    */

    public Boolean alpha;

    @JsProperty( name = "alpha")
    public native Boolean getAlpha();

    @JsProperty( name = "alpha")
    public native void setAlpha( Boolean value );

    public Boolean antialias;

    @JsProperty( name = "antialias")
    public native Boolean getAntialias();

    @JsProperty( name = "antialias")
    public native void setAntialias( Boolean value );

    public Boolean depth;

    @JsProperty( name = "depth")
    public native Boolean getDepth();

    @JsProperty( name = "depth")
    public native void setDepth( Boolean value );

    public Boolean failIfMajorPerformanceCaveat;

    @JsProperty( name = "failIfMajorPerformanceCaveat")
    public native Boolean getFailIfMajorPerformanceCaveat();

    @JsProperty( name = "failIfMajorPerformanceCaveat")
    public native void setFailIfMajorPerformanceCaveat( Boolean value );

    public Boolean premultipliedAlpha;

    @JsProperty( name = "premultipliedAlpha")
    public native Boolean getPremultipliedAlpha();

    @JsProperty( name = "premultipliedAlpha")
    public native void setPremultipliedAlpha( Boolean value );

    public Boolean preserveDrawingBuffer;

    @JsProperty( name = "preserveDrawingBuffer")
    public native Boolean getPreserveDrawingBuffer();

    @JsProperty( name = "preserveDrawingBuffer")
    public native void setPreserveDrawingBuffer( Boolean value );

    public Boolean stencil;

    @JsProperty( name = "stencil")
    public native Boolean getStencil();

    @JsProperty( name = "stencil")
    public native void setStencil( Boolean value );
}

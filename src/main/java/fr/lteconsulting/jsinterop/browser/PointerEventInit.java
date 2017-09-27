package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: PointerEventInit
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:272782
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="PointerEventInit")
public class PointerEventInit extends MouseEventInit
{

    /*
        Properties
    */

    public Number height;

    @JsProperty( name = "height")
    public native Number getHeight();

    @JsProperty( name = "height")
    public native void setHeight( Number value );

    public Boolean isPrimary;

    @JsProperty( name = "isPrimary")
    public native Boolean getIsPrimary();

    @JsProperty( name = "isPrimary")
    public native void setIsPrimary( Boolean value );

    public Number pointerId;

    @JsProperty( name = "pointerId")
    public native Number getPointerId();

    @JsProperty( name = "pointerId")
    public native void setPointerId( Number value );

    public String pointerType;

    @JsProperty( name = "pointerType")
    public native String getPointerType();

    @JsProperty( name = "pointerType")
    public native void setPointerType( String value );

    public Number pressure;

    @JsProperty( name = "pressure")
    public native Number getPressure();

    @JsProperty( name = "pressure")
    public native void setPressure( Number value );

    public Number tiltX;

    @JsProperty( name = "tiltX")
    public native Number getTiltX();

    @JsProperty( name = "tiltX")
    public native void setTiltX( Number value );

    public Number tiltY;

    @JsProperty( name = "tiltY")
    public native Number getTiltY();

    @JsProperty( name = "tiltY")
    public native void setTiltY( Number value );

    public Number width;

    @JsProperty( name = "width")
    public native Number getWidth();

    @JsProperty( name = "width")
    public native void setWidth( Number value );
}

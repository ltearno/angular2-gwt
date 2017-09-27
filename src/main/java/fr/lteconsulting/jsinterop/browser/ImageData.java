package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: ImageData
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:497029
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:497153
  * 2 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ImageData")
public class ImageData
{

    /*
        Constructors
    */
    public ImageData(Number width, Number height){
    }
    public ImageData(Uint8ClampedArray array, Number width, Number height){
    }

    /*
        Properties
    */

    public Uint8ClampedArray data;

    @JsProperty( name = "data")
    public native Uint8ClampedArray getData();

    @JsProperty( name = "data")
    public native void setData( Uint8ClampedArray value );

    public Number height;

    @JsProperty( name = "height")
    public native Number getHeight();

    @JsProperty( name = "height")
    public native void setHeight( Number value );

    public Number width;

    @JsProperty( name = "width")
    public native Number getWidth();

    @JsProperty( name = "width")
    public native void setWidth( Number value );
}

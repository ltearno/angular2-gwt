package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: ClientRect
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:315144
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:315314
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ClientRect")
public class ClientRect
{

    /*
        Constructors
    */
    public ClientRect(){
    }

    /*
        Properties
    */

    public Number bottom;

    @JsProperty( name = "bottom")
    public native Number getBottom();

    @JsProperty( name = "bottom")
    public native void setBottom( Number value );

    public Number height;

    @JsProperty( name = "height")
    public native Number getHeight();

    @JsProperty( name = "height")
    public native void setHeight( Number value );

    public Number left;

    @JsProperty( name = "left")
    public native Number getLeft();

    @JsProperty( name = "left")
    public native void setLeft( Number value );

    public Number right;

    @JsProperty( name = "right")
    public native Number getRight();

    @JsProperty( name = "right")
    public native void setRight( Number value );

    public Number top;

    @JsProperty( name = "top")
    public native Number getTop();

    @JsProperty( name = "top")
    public native void setTop( Number value );

    public Number width;

    @JsProperty( name = "width")
    public native Number getWidth();

    @JsProperty( name = "width")
    public native void setWidth( Number value );
}

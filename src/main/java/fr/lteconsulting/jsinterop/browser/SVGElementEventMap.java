package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: SVGElementEventMap
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:576071
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGElementEventMap")
public class SVGElementEventMap extends ElementEventMap
{

    /*
        Properties
    */

    public MouseEvent click;

    @JsProperty( name = "click")
    public native MouseEvent getClick();

    @JsProperty( name = "click")
    public native void setClick( MouseEvent value );

    public MouseEvent dblclick;

    @JsProperty( name = "dblclick")
    public native MouseEvent getDblclick();

    @JsProperty( name = "dblclick")
    public native void setDblclick( MouseEvent value );

    public FocusEvent focusin;

    @JsProperty( name = "focusin")
    public native FocusEvent getFocusin();

    @JsProperty( name = "focusin")
    public native void setFocusin( FocusEvent value );

    public FocusEvent focusout;

    @JsProperty( name = "focusout")
    public native FocusEvent getFocusout();

    @JsProperty( name = "focusout")
    public native void setFocusout( FocusEvent value );

    public Event load;

    @JsProperty( name = "load")
    public native Event getLoad();

    @JsProperty( name = "load")
    public native void setLoad( Event value );

    public MouseEvent mousedown;

    @JsProperty( name = "mousedown")
    public native MouseEvent getMousedown();

    @JsProperty( name = "mousedown")
    public native void setMousedown( MouseEvent value );

    public MouseEvent mousemove;

    @JsProperty( name = "mousemove")
    public native MouseEvent getMousemove();

    @JsProperty( name = "mousemove")
    public native void setMousemove( MouseEvent value );

    public MouseEvent mouseout;

    @JsProperty( name = "mouseout")
    public native MouseEvent getMouseout();

    @JsProperty( name = "mouseout")
    public native void setMouseout( MouseEvent value );

    public MouseEvent mouseover;

    @JsProperty( name = "mouseover")
    public native MouseEvent getMouseover();

    @JsProperty( name = "mouseover")
    public native void setMouseover( MouseEvent value );

    public MouseEvent mouseup;

    @JsProperty( name = "mouseup")
    public native MouseEvent getMouseup();

    @JsProperty( name = "mouseup")
    public native void setMouseup( MouseEvent value );
}

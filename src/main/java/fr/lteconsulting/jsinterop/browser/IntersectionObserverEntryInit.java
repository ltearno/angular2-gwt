package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: IntersectionObserverEntryInit
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:259475
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="IntersectionObserverEntryInit")
public class IntersectionObserverEntryInit
{

    /*
        Properties
    */

    public DOMRectInit boundingClientRect;

    @JsProperty( name = "boundingClientRect")
    public native DOMRectInit getBoundingClientRect();

    @JsProperty( name = "boundingClientRect")
    public native void setBoundingClientRect( DOMRectInit value );

    public DOMRectInit intersectionRect;

    @JsProperty( name = "intersectionRect")
    public native DOMRectInit getIntersectionRect();

    @JsProperty( name = "intersectionRect")
    public native void setIntersectionRect( DOMRectInit value );

    public DOMRectInit rootBounds;

    @JsProperty( name = "rootBounds")
    public native DOMRectInit getRootBounds();

    @JsProperty( name = "rootBounds")
    public native void setRootBounds( DOMRectInit value );

    public Element target;

    @JsProperty( name = "target")
    public native Element getTarget();

    @JsProperty( name = "target")
    public native void setTarget( Element value );

    public Number time;

    @JsProperty( name = "time")
    public native Number getTime();

    @JsProperty( name = "time")
    public native void setTime( Number value );
}

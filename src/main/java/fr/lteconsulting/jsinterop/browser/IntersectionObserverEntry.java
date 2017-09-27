package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: IntersectionObserverEntry
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:497790
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:498066
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="IntersectionObserverEntry")
public class IntersectionObserverEntry
{

    /*
        Constructors
    */
    public IntersectionObserverEntry(IntersectionObserverEntryInit intersectionObserverEntryInit){
    }

    /*
        Properties
    */

    public ClientRect boundingClientRect;

    @JsProperty( name = "boundingClientRect")
    public native ClientRect getBoundingClientRect();

    @JsProperty( name = "boundingClientRect")
    public native void setBoundingClientRect( ClientRect value );

    public Number intersectionRatio;

    @JsProperty( name = "intersectionRatio")
    public native Number getIntersectionRatio();

    @JsProperty( name = "intersectionRatio")
    public native void setIntersectionRatio( Number value );

    public ClientRect intersectionRect;

    @JsProperty( name = "intersectionRect")
    public native ClientRect getIntersectionRect();

    @JsProperty( name = "intersectionRect")
    public native void setIntersectionRect( ClientRect value );

    public ClientRect rootBounds;

    @JsProperty( name = "rootBounds")
    public native ClientRect getRootBounds();

    @JsProperty( name = "rootBounds")
    public native void setRootBounds( ClientRect value );

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

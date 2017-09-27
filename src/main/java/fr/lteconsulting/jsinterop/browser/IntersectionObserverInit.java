package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: IntersectionObserverInit
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:259665
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="IntersectionObserverInit")
public class IntersectionObserverInit
{

    /*
        Properties
    */

    public Element root;

    @JsProperty( name = "root")
    public native Element getRoot();

    @JsProperty( name = "root")
    public native void setRoot( Element value );

    public String rootMargin;

    @JsProperty( name = "rootMargin")
    public native String getRootMargin();

    @JsProperty( name = "rootMargin")
    public native void setRootMargin( String value );

    public UnionOfArrayOfNumberAndNumber threshold;

    @JsProperty( name = "threshold")
    public native UnionOfArrayOfNumberAndNumber getThreshold();

    @JsProperty( name = "threshold")
    public native void setThreshold( UnionOfArrayOfNumberAndNumber value );

    @JsOverlay
    public final void setThreshold( Array<Number> value ) { setThreshold(UnionOfArrayOfNumberAndNumber.ofArrayOfNumber( value )); }

    @JsOverlay
    public final void setThreshold( Number value ) { setThreshold(UnionOfArrayOfNumberAndNumber.ofNumber( value )); }
}

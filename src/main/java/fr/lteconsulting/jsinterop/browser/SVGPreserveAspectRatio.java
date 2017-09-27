package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: SVGPreserveAspectRatio
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:620996
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:621824
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGPreserveAspectRatio")
public class SVGPreserveAspectRatio
{

    /*
        Constructors
    */
    public SVGPreserveAspectRatio(){
    }

    /*
        Static properties
    */

    @JsProperty(namespace="SVGPreserveAspectRatio", name="SVG_MEETORSLICE_MEET")
    public static Number SVG_MEETORSLICE_MEET;

    @JsProperty(namespace="SVGPreserveAspectRatio", name="SVG_MEETORSLICE_SLICE")
    public static Number SVG_MEETORSLICE_SLICE;

    @JsProperty(namespace="SVGPreserveAspectRatio", name="SVG_MEETORSLICE_UNKNOWN")
    public static Number SVG_MEETORSLICE_UNKNOWN;

    @JsProperty(namespace="SVGPreserveAspectRatio", name="SVG_PRESERVEASPECTRATIO_NONE")
    public static Number SVG_PRESERVEASPECTRATIO_NONE;

    @JsProperty(namespace="SVGPreserveAspectRatio", name="SVG_PRESERVEASPECTRATIO_UNKNOWN")
    public static Number SVG_PRESERVEASPECTRATIO_UNKNOWN;

    @JsProperty(namespace="SVGPreserveAspectRatio", name="SVG_PRESERVEASPECTRATIO_XMAXYMAX")
    public static Number SVG_PRESERVEASPECTRATIO_XMAXYMAX;

    @JsProperty(namespace="SVGPreserveAspectRatio", name="SVG_PRESERVEASPECTRATIO_XMAXYMID")
    public static Number SVG_PRESERVEASPECTRATIO_XMAXYMID;

    @JsProperty(namespace="SVGPreserveAspectRatio", name="SVG_PRESERVEASPECTRATIO_XMAXYMIN")
    public static Number SVG_PRESERVEASPECTRATIO_XMAXYMIN;

    @JsProperty(namespace="SVGPreserveAspectRatio", name="SVG_PRESERVEASPECTRATIO_XMIDYMAX")
    public static Number SVG_PRESERVEASPECTRATIO_XMIDYMAX;

    @JsProperty(namespace="SVGPreserveAspectRatio", name="SVG_PRESERVEASPECTRATIO_XMIDYMID")
    public static Number SVG_PRESERVEASPECTRATIO_XMIDYMID;

    @JsProperty(namespace="SVGPreserveAspectRatio", name="SVG_PRESERVEASPECTRATIO_XMIDYMIN")
    public static Number SVG_PRESERVEASPECTRATIO_XMIDYMIN;

    @JsProperty(namespace="SVGPreserveAspectRatio", name="SVG_PRESERVEASPECTRATIO_XMINYMAX")
    public static Number SVG_PRESERVEASPECTRATIO_XMINYMAX;

    @JsProperty(namespace="SVGPreserveAspectRatio", name="SVG_PRESERVEASPECTRATIO_XMINYMID")
    public static Number SVG_PRESERVEASPECTRATIO_XMINYMID;

    @JsProperty(namespace="SVGPreserveAspectRatio", name="SVG_PRESERVEASPECTRATIO_XMINYMIN")
    public static Number SVG_PRESERVEASPECTRATIO_XMINYMIN;

    /*
        Properties
    */

    public Number align;

    @JsProperty( name = "align")
    public native Number getAlign();

    @JsProperty( name = "align")
    public native void setAlign( Number value );

    public Number meetOrSlice;

    @JsProperty( name = "meetOrSlice")
    public native Number getMeetOrSlice();

    @JsProperty( name = "meetOrSlice")
    public native void setMeetOrSlice( Number value );
}

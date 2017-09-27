package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: SVGPathSeg
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:611614
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:612679
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGPathSeg")
public class SVGPathSeg
{

    /*
        Constructors
    */
    public SVGPathSeg(){
    }

    /*
        Static properties
    */

    @JsProperty(namespace="SVGPathSeg", name="PATHSEG_ARC_ABS")
    public static Number PATHSEG_ARC_ABS;

    @JsProperty(namespace="SVGPathSeg", name="PATHSEG_ARC_REL")
    public static Number PATHSEG_ARC_REL;

    @JsProperty(namespace="SVGPathSeg", name="PATHSEG_CLOSEPATH")
    public static Number PATHSEG_CLOSEPATH;

    @JsProperty(namespace="SVGPathSeg", name="PATHSEG_CURVETO_CUBIC_ABS")
    public static Number PATHSEG_CURVETO_CUBIC_ABS;

    @JsProperty(namespace="SVGPathSeg", name="PATHSEG_CURVETO_CUBIC_REL")
    public static Number PATHSEG_CURVETO_CUBIC_REL;

    @JsProperty(namespace="SVGPathSeg", name="PATHSEG_CURVETO_CUBIC_SMOOTH_ABS")
    public static Number PATHSEG_CURVETO_CUBIC_SMOOTH_ABS;

    @JsProperty(namespace="SVGPathSeg", name="PATHSEG_CURVETO_CUBIC_SMOOTH_REL")
    public static Number PATHSEG_CURVETO_CUBIC_SMOOTH_REL;

    @JsProperty(namespace="SVGPathSeg", name="PATHSEG_CURVETO_QUADRATIC_ABS")
    public static Number PATHSEG_CURVETO_QUADRATIC_ABS;

    @JsProperty(namespace="SVGPathSeg", name="PATHSEG_CURVETO_QUADRATIC_REL")
    public static Number PATHSEG_CURVETO_QUADRATIC_REL;

    @JsProperty(namespace="SVGPathSeg", name="PATHSEG_CURVETO_QUADRATIC_SMOOTH_ABS")
    public static Number PATHSEG_CURVETO_QUADRATIC_SMOOTH_ABS;

    @JsProperty(namespace="SVGPathSeg", name="PATHSEG_CURVETO_QUADRATIC_SMOOTH_REL")
    public static Number PATHSEG_CURVETO_QUADRATIC_SMOOTH_REL;

    @JsProperty(namespace="SVGPathSeg", name="PATHSEG_LINETO_ABS")
    public static Number PATHSEG_LINETO_ABS;

    @JsProperty(namespace="SVGPathSeg", name="PATHSEG_LINETO_HORIZONTAL_ABS")
    public static Number PATHSEG_LINETO_HORIZONTAL_ABS;

    @JsProperty(namespace="SVGPathSeg", name="PATHSEG_LINETO_HORIZONTAL_REL")
    public static Number PATHSEG_LINETO_HORIZONTAL_REL;

    @JsProperty(namespace="SVGPathSeg", name="PATHSEG_LINETO_REL")
    public static Number PATHSEG_LINETO_REL;

    @JsProperty(namespace="SVGPathSeg", name="PATHSEG_LINETO_VERTICAL_ABS")
    public static Number PATHSEG_LINETO_VERTICAL_ABS;

    @JsProperty(namespace="SVGPathSeg", name="PATHSEG_LINETO_VERTICAL_REL")
    public static Number PATHSEG_LINETO_VERTICAL_REL;

    @JsProperty(namespace="SVGPathSeg", name="PATHSEG_MOVETO_ABS")
    public static Number PATHSEG_MOVETO_ABS;

    @JsProperty(namespace="SVGPathSeg", name="PATHSEG_MOVETO_REL")
    public static Number PATHSEG_MOVETO_REL;

    @JsProperty(namespace="SVGPathSeg", name="PATHSEG_UNKNOWN")
    public static Number PATHSEG_UNKNOWN;

    /*
        Properties
    */

    public Number pathSegType;

    @JsProperty( name = "pathSegType")
    public native Number getPathSegType();

    @JsProperty( name = "pathSegType")
    public native void setPathSegType( Number value );

    public String pathSegTypeAsLetter;

    @JsProperty( name = "pathSegTypeAsLetter")
    public native String getPathSegTypeAsLetter();

    @JsProperty( name = "pathSegTypeAsLetter")
    public native void setPathSegTypeAsLetter( String value );
}

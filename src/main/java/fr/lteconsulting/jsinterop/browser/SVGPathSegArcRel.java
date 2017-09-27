package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: SVGPathSegArcRel
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:613975
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:614171
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGPathSegArcRel")
public class SVGPathSegArcRel extends SVGPathSeg
{

    /*
        Constructors
    */
    public SVGPathSegArcRel(){
    }

    /*
        Properties
    */

    public Number angle;

    @JsProperty( name = "angle")
    public native Number getAngle();

    @JsProperty( name = "angle")
    public native void setAngle( Number value );

    public Boolean largeArcFlag;

    @JsProperty( name = "largeArcFlag")
    public native Boolean getLargeArcFlag();

    @JsProperty( name = "largeArcFlag")
    public native void setLargeArcFlag( Boolean value );

    public Number r1;

    @JsProperty( name = "r1")
    public native Number getR1();

    @JsProperty( name = "r1")
    public native void setR1( Number value );

    public Number r2;

    @JsProperty( name = "r2")
    public native Number getR2();

    @JsProperty( name = "r2")
    public native void setR2( Number value );

    public Boolean sweepFlag;

    @JsProperty( name = "sweepFlag")
    public native Boolean getSweepFlag();

    @JsProperty( name = "sweepFlag")
    public native void setSweepFlag( Boolean value );

    public Number x;

    @JsProperty( name = "x")
    public native Number getX();

    @JsProperty( name = "x")
    public native void setX( Number value );

    public Number y;

    @JsProperty( name = "y")
    public native Number getY();

    @JsProperty( name = "y")
    public native void setY( Number value );
}

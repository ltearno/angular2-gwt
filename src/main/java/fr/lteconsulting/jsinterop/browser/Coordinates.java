package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: Coordinates
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:318045
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:318335
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Coordinates")
public class Coordinates
{

    /*
        Constructors
    */
    public Coordinates(){
    }

    /*
        Properties
    */

    public Number accuracy;

    @JsProperty( name = "accuracy")
    public native Number getAccuracy();

    @JsProperty( name = "accuracy")
    public native void setAccuracy( Number value );

    public Number altitude;

    @JsProperty( name = "altitude")
    public native Number getAltitude();

    @JsProperty( name = "altitude")
    public native void setAltitude( Number value );

    public Number altitudeAccuracy;

    @JsProperty( name = "altitudeAccuracy")
    public native Number getAltitudeAccuracy();

    @JsProperty( name = "altitudeAccuracy")
    public native void setAltitudeAccuracy( Number value );

    public Number heading;

    @JsProperty( name = "heading")
    public native Number getHeading();

    @JsProperty( name = "heading")
    public native void setHeading( Number value );

    public Number latitude;

    @JsProperty( name = "latitude")
    public native Number getLatitude();

    @JsProperty( name = "latitude")
    public native void setLatitude( Number value );

    public Number longitude;

    @JsProperty( name = "longitude")
    public native Number getLongitude();

    @JsProperty( name = "longitude")
    public native void setLongitude( Number value );

    public Number speed;

    @JsProperty( name = "speed")
    public native Number getSpeed();

    @JsProperty( name = "speed")
    public native void setSpeed( Number value );
}

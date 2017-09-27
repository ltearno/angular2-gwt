package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: Position
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:551376
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:551479
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Position")
public class Position
{

    /*
        Constructors
    */
    public Position(){
    }

    /*
        Properties
    */

    public Coordinates coords;

    @JsProperty( name = "coords")
    public native Coordinates getCoords();

    @JsProperty( name = "coords")
    public native void setCoords( Coordinates value );

    public Number timestamp;

    @JsProperty( name = "timestamp")
    public native Number getTimestamp();

    @JsProperty( name = "timestamp")
    public native void setTimestamp( Number value );
}

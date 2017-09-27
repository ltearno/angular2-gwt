package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: OverflowEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:539690
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:539950
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="OverflowEvent")
public class OverflowEvent extends UIEvent
{

    /*
        Constructors
    */
    public OverflowEvent(){
        super(null, null);
    }

    /*
        Static properties
    */

    @JsProperty(namespace="OverflowEvent", name="BOTH")
    public static Number BOTH;

    @JsProperty(namespace="OverflowEvent", name="HORIZONTAL")
    public static Number HORIZONTAL;

    @JsProperty(namespace="OverflowEvent", name="VERTICAL")
    public static Number VERTICAL;

    /*
        Properties
    */

    public Boolean horizontalOverflow;

    @JsProperty( name = "horizontalOverflow")
    public native Boolean getHorizontalOverflow();

    @JsProperty( name = "horizontalOverflow")
    public native void setHorizontalOverflow( Boolean value );

    public Number orient;

    @JsProperty( name = "orient")
    public native Number getOrient();

    @JsProperty( name = "orient")
    public native void setOrient( Number value );

    public Boolean verticalOverflow;

    @JsProperty( name = "verticalOverflow")
    public native Boolean getVerticalOverflow();

    @JsProperty( name = "verticalOverflow")
    public native void setVerticalOverflow( Boolean value );
}

package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: SVGAngle
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:569409
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:569907
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGAngle")
public class SVGAngle
{

    /*
        Constructors
    */
    public SVGAngle(){
    }

    /*
        Static properties
    */

    @JsProperty(namespace="SVGAngle", name="SVG_ANGLETYPE_DEG")
    public static Number SVG_ANGLETYPE_DEG;

    @JsProperty(namespace="SVGAngle", name="SVG_ANGLETYPE_GRAD")
    public static Number SVG_ANGLETYPE_GRAD;

    @JsProperty(namespace="SVGAngle", name="SVG_ANGLETYPE_RAD")
    public static Number SVG_ANGLETYPE_RAD;

    @JsProperty(namespace="SVGAngle", name="SVG_ANGLETYPE_UNKNOWN")
    public static Number SVG_ANGLETYPE_UNKNOWN;

    @JsProperty(namespace="SVGAngle", name="SVG_ANGLETYPE_UNSPECIFIED")
    public static Number SVG_ANGLETYPE_UNSPECIFIED;

    /*
        Properties
    */

    public Number unitType;

    @JsProperty( name = "unitType")
    public native Number getUnitType();

    @JsProperty( name = "unitType")
    public native void setUnitType( Number value );

    public Number value;

    @JsProperty( name = "value")
    public native Number getValue();

    @JsProperty( name = "value")
    public native void setValue( Number value );

    public String valueAsString;

    @JsProperty( name = "valueAsString")
    public native String getValueAsString();

    @JsProperty( name = "valueAsString")
    public native void setValueAsString( String value );

    public Number valueInSpecifiedUnits;

    @JsProperty( name = "valueInSpecifiedUnits")
    public native Number getValueInSpecifiedUnits();

    @JsProperty( name = "valueInSpecifiedUnits")
    public native void setValueInSpecifiedUnits( Number value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(convertToSpecifiedUnits,289,,P(d2))
      * TE Signature : S(convertToSpecifiedUnits,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@569548
     */
    public native void convertToSpecifiedUnits(Number unitType);
    /** 
      * Std Signature : S(newValueSpecifiedUnits,289,,P(d2),P(d2))
      * TE Signature : S(newValueSpecifiedUnits,P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@569601
     */
    public native void newValueSpecifiedUnits(Number unitType, Number valueInSpecifiedUnits);
}

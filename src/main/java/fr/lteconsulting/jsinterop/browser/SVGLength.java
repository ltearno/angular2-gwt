package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: SVGLength
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:602393
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:603138
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGLength")
public class SVGLength
{

    /*
        Constructors
    */
    public SVGLength(){
    }

    /*
        Static properties
    */

    @JsProperty(namespace="SVGLength", name="SVG_LENGTHTYPE_CM")
    public static Number SVG_LENGTHTYPE_CM;

    @JsProperty(namespace="SVGLength", name="SVG_LENGTHTYPE_EMS")
    public static Number SVG_LENGTHTYPE_EMS;

    @JsProperty(namespace="SVGLength", name="SVG_LENGTHTYPE_EXS")
    public static Number SVG_LENGTHTYPE_EXS;

    @JsProperty(namespace="SVGLength", name="SVG_LENGTHTYPE_IN")
    public static Number SVG_LENGTHTYPE_IN;

    @JsProperty(namespace="SVGLength", name="SVG_LENGTHTYPE_MM")
    public static Number SVG_LENGTHTYPE_MM;

    @JsProperty(namespace="SVGLength", name="SVG_LENGTHTYPE_NUMBER")
    public static Number SVG_LENGTHTYPE_NUMBER;

    @JsProperty(namespace="SVGLength", name="SVG_LENGTHTYPE_PC")
    public static Number SVG_LENGTHTYPE_PC;

    @JsProperty(namespace="SVGLength", name="SVG_LENGTHTYPE_PERCENTAGE")
    public static Number SVG_LENGTHTYPE_PERCENTAGE;

    @JsProperty(namespace="SVGLength", name="SVG_LENGTHTYPE_PT")
    public static Number SVG_LENGTHTYPE_PT;

    @JsProperty(namespace="SVGLength", name="SVG_LENGTHTYPE_PX")
    public static Number SVG_LENGTHTYPE_PX;

    @JsProperty(namespace="SVGLength", name="SVG_LENGTHTYPE_UNKNOWN")
    public static Number SVG_LENGTHTYPE_UNKNOWN;

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
      * apis/browser-api/tsd/lib.es6.d.ts@602533
     */
    public native void convertToSpecifiedUnits(Number unitType);
    /** 
      * Std Signature : S(newValueSpecifiedUnits,289,,P(d2),P(d2))
      * TE Signature : S(newValueSpecifiedUnits,P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@602586
     */
    public native void newValueSpecifiedUnits(Number unitType, Number valueInSpecifiedUnits);
}

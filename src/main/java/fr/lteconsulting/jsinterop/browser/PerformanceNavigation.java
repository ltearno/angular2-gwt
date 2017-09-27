package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: PerformanceNavigation
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:545594
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:545872
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="PerformanceNavigation")
public class PerformanceNavigation
{

    /*
        Constructors
    */
    public PerformanceNavigation(){
    }

    /*
        Static properties
    */

    @JsProperty(namespace="PerformanceNavigation", name="TYPE_BACK_FORWARD")
    public static Number TYPE_BACK_FORWARD;

    @JsProperty(namespace="PerformanceNavigation", name="TYPE_NAVIGATE")
    public static Number TYPE_NAVIGATE;

    @JsProperty(namespace="PerformanceNavigation", name="TYPE_RELOAD")
    public static Number TYPE_RELOAD;

    @JsProperty(namespace="PerformanceNavigation", name="TYPE_RESERVED")
    public static Number TYPE_RESERVED;

    /*
        Properties
    */

    public Number redirectCount;

    @JsProperty( name = "redirectCount")
    public native Number getRedirectCount();

    @JsProperty( name = "redirectCount")
    public native void setRedirectCount( Number value );

    public Number type;

    @JsProperty( name = "type")
    public native Number getType();

    @JsProperty( name = "type")
    public native void setType( Number value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(toJSON,3,,)
      * TE Signature : S(toJSON,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@545697
     */
    public native Object toJSON();
}

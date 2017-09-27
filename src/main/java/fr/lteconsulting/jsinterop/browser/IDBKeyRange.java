package fr.lteconsulting.jsinterop.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: IDBKeyRange
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:492707
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:492863
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="IDBKeyRange")
public class IDBKeyRange
{

    /*
        Constructors
    */
    public IDBKeyRange(){
    }

    /*
        Static properties
    */

    @JsProperty(namespace="IDBKeyRange", name="only")
    public static Function1<Object, IDBKeyRange> only;

    /*
        Static methods
    */
    /** 
      * source : apis/browser-api/tsd/lib.es6.d.ts:492935
     */
    @JsMethod(namespace="IDBKeyRange", name = "bound")
    public static native IDBKeyRange bound(Object lower, Object upper, Boolean lowerOpen /* optional */, Boolean upperOpen /* optional */);
    /** 
      * source : apis/browser-api/tsd/lib.es6.d.ts:493025
     */
    @JsMethod(namespace="IDBKeyRange", name = "lowerBound")
    public static native IDBKeyRange lowerBound(Object lower, Boolean open /* optional */);
    /** 
      * source : apis/browser-api/tsd/lib.es6.d.ts:493117
     */
    @JsMethod(namespace="IDBKeyRange", name = "upperBound")
    public static native IDBKeyRange upperBound(Object upper, Boolean open /* optional */);

    /*
        Properties
    */

    public Object lower;

    @JsProperty( name = "lower")
    public native Object getLower();

    @JsProperty( name = "lower")
    public native void setLower( Object value );

    public Boolean lowerOpen;

    @JsProperty( name = "lowerOpen")
    public native Boolean getLowerOpen();

    @JsProperty( name = "lowerOpen")
    public native void setLowerOpen( Boolean value );

    public Object upper;

    @JsProperty( name = "upper")
    public native Object getUpper();

    @JsProperty( name = "upper")
    public native void setUpper( Object value );

    public Boolean upperOpen;

    @JsProperty( name = "upperOpen")
    public native Boolean getUpperOpen();

    @JsProperty( name = "upperOpen")
    public native void setUpperOpen( Boolean value );
}

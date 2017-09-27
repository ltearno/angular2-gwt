package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: FocusNavigationEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:375819
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:376081
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="FocusNavigationEvent")
public class FocusNavigationEvent extends Event
{

    /*
        Constructors
    */
    public FocusNavigationEvent(String type, FocusNavigationEventInit eventInitDict){
        super(null, null);
    }

    /*
        Properties
    */

    public String navigationReason;

    @JsProperty( name = "navigationReason")
    public native String getNavigationReason();

    @JsProperty( name = "navigationReason")
    public native void setNavigationReason( String value );

    public Number originHeight;

    @JsProperty( name = "originHeight")
    public native Number getOriginHeight();

    @JsProperty( name = "originHeight")
    public native void setOriginHeight( Number value );

    public Number originLeft;

    @JsProperty( name = "originLeft")
    public native Number getOriginLeft();

    @JsProperty( name = "originLeft")
    public native void setOriginLeft( Number value );

    public Number originTop;

    @JsProperty( name = "originTop")
    public native Number getOriginTop();

    @JsProperty( name = "originTop")
    public native void setOriginTop( Number value );

    public Number originWidth;

    @JsProperty( name = "originWidth")
    public native Number getOriginWidth();

    @JsProperty( name = "originWidth")
    public native void setOriginWidth( Number value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(requestFocus,289,,)
      * TE Signature : S(requestFocus,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@376045
     */
    public native void requestFocus();
}

package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: NavigationCompletedEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:529622
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:529769
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="NavigationCompletedEvent")
public class NavigationCompletedEvent extends NavigationEvent
{

    /*
        Constructors
    */
    public NavigationCompletedEvent(){
    }

    /*
        Properties
    */

    public Boolean isSuccess;

    @JsProperty( name = "isSuccess")
    public native Boolean getIsSuccess();

    @JsProperty( name = "isSuccess")
    public native void setIsSuccess( Boolean value );

    public Number webErrorStatus;

    @JsProperty( name = "webErrorStatus")
    public native Number getWebErrorStatus();

    @JsProperty( name = "webErrorStatus")
    public native void setWebErrorStatus( Number value );
}

package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: NavigationEventWithReferrer
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:530042
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:530152
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="NavigationEventWithReferrer")
public class NavigationEventWithReferrer extends NavigationEvent
{

    /*
        Constructors
    */
    public NavigationEventWithReferrer(){
    }

    /*
        Properties
    */

    public String referer;

    @JsProperty( name = "referer")
    public native String getReferer();

    @JsProperty( name = "referer")
    public native void setReferer( String value );
}

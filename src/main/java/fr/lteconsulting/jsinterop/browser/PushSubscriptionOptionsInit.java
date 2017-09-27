package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: PushSubscriptionOptionsInit
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:273320
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="PushSubscriptionOptionsInit")
public class PushSubscriptionOptionsInit
{

    /*
        Properties
    */

    public Object applicationServerKey;

    @JsProperty( name = "applicationServerKey")
    public native Object getApplicationServerKey();

    @JsProperty( name = "applicationServerKey")
    public native void setApplicationServerKey( Object value );

    public Boolean userVisibleOnly;

    @JsProperty( name = "userVisibleOnly")
    public native Boolean getUserVisibleOnly();

    @JsProperty( name = "userVisibleOnly")
    public native void setUserVisibleOnly( Boolean value );
}

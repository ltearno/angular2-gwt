package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: PushSubscriptionOptions
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:553227
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:553373
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="PushSubscriptionOptions")
public class PushSubscriptionOptions
{

    /*
        Constructors
    */
    public PushSubscriptionOptions(){
    }

    /*
        Properties
    */

    public ArrayBuffer applicationServerKey;

    @JsProperty( name = "applicationServerKey")
    public native ArrayBuffer getApplicationServerKey();

    @JsProperty( name = "applicationServerKey")
    public native void setApplicationServerKey( ArrayBuffer value );

    public Boolean userVisibleOnly;

    @JsProperty( name = "userVisibleOnly")
    public native Boolean getUserVisibleOnly();

    @JsProperty( name = "userVisibleOnly")
    public native void setUserVisibleOnly( Boolean value );
}

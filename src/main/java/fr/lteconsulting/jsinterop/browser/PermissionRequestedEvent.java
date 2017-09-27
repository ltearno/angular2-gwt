package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: PermissionRequestedEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:548996
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:549114
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="PermissionRequestedEvent")
public class PermissionRequestedEvent extends Event
{

    /*
        Constructors
    */
    public PermissionRequestedEvent(){
        super(null, null);
    }

    /*
        Properties
    */

    public PermissionRequest permissionRequest;

    @JsProperty( name = "permissionRequest")
    public native PermissionRequest getPermissionRequest();

    @JsProperty( name = "permissionRequest")
    public native void setPermissionRequest( PermissionRequest value );
}

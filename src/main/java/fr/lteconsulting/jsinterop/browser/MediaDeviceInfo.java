package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MediaDeviceInfo
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:516243
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:516403
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MediaDeviceInfo")
public class MediaDeviceInfo
{

    /*
        Constructors
    */
    public MediaDeviceInfo(){
    }

    /*
        Properties
    */

    public String deviceId;

    @JsProperty( name = "deviceId")
    public native String getDeviceId();

    @JsProperty( name = "deviceId")
    public native void setDeviceId( String value );

    public String groupId;

    @JsProperty( name = "groupId")
    public native String getGroupId();

    @JsProperty( name = "groupId")
    public native void setGroupId( String value );

    public String kind;

    @JsProperty( name = "kind")
    public native String getKind();

    @JsProperty( name = "kind")
    public native void setKind( String value );

    public String label;

    @JsProperty( name = "label")
    public native String getLabel();

    @JsProperty( name = "label")
    public native void setLabel( String value );
}

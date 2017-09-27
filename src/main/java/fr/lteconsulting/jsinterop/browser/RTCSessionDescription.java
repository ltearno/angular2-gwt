package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RTCSessionDescription
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:564593
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:564711
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCSessionDescription")
public class RTCSessionDescription
{

    /*
        Constructors
    */
    public RTCSessionDescription(RTCSessionDescriptionInit descriptionInitDict){
    }

    /*
        Properties
    */

    public String sdp;

    @JsProperty( name = "sdp")
    public native String getSdp();

    @JsProperty( name = "sdp")
    public native void setSdp( String value );

    public String type;

    @JsProperty( name = "type")
    public native String getType();

    @JsProperty( name = "type")
    public native void setType( String value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(toJSON,3,,)
      * TE Signature : S(toJSON,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@564682
     */
    public native Object toJSON();
}

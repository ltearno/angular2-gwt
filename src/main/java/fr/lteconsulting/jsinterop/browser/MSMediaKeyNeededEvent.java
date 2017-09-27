package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MSMediaKeyNeededEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:511127
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:511233
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSMediaKeyNeededEvent")
public class MSMediaKeyNeededEvent extends Event
{

    /*
        Constructors
    */
    public MSMediaKeyNeededEvent(){
        super(null, null);
    }

    /*
        Properties
    */

    public Uint8Array initData;

    @JsProperty( name = "initData")
    public native Uint8Array getInitData();

    @JsProperty( name = "initData")
    public native void setInitData( Uint8Array value );
}

package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RTCSsrcConflictEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:565657
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:565747
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCSsrcConflictEvent")
public class RTCSsrcConflictEvent extends Event
{

    /*
        Constructors
    */
    public RTCSsrcConflictEvent(){
        super(null, null);
    }

    /*
        Properties
    */

    public Number ssrc;

    @JsProperty( name = "ssrc")
    public native Number getSsrc();

    @JsProperty( name = "ssrc")
    public native void setSsrc( Number value );
}

package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MSInputMethodContextEventMap
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:507674
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSInputMethodContextEventMap")
public class MSInputMethodContextEventMap
{

    /*
        Properties
    */

    public Event MSCandidateWindowHide;

    @JsProperty( name = "MSCandidateWindowHide")
    public native Event getMSCandidateWindowHide();

    @JsProperty( name = "MSCandidateWindowHide")
    public native void setMSCandidateWindowHide( Event value );

    public Event MSCandidateWindowShow;

    @JsProperty( name = "MSCandidateWindowShow")
    public native Event getMSCandidateWindowShow();

    @JsProperty( name = "MSCandidateWindowShow")
    public native void setMSCandidateWindowShow( Event value );

    public Event MSCandidateWindowUpdate;

    @JsProperty( name = "MSCandidateWindowUpdate")
    public native Event getMSCandidateWindowUpdate();

    @JsProperty( name = "MSCandidateWindowUpdate")
    public native void setMSCandidateWindowUpdate( Event value );
}

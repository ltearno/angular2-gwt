package fr.lteconsulting.jsinterop.ng.platformBrowser;

import fr.lteconsulting.jsinterop.browser.Function;
import fr.lteconsulting.prebuilt.Action2;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/events/hammer_gestures".HammerInstance
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/events/hammer_gestures.d.ts:534
  * 
 */
@JsType(isNative=true, namespace="ng.platformBrowser", name="HammerInstance")
public class HammerInstance
{

    /*
        Properties
    */

    public Action2<String, Function> on;

    @JsProperty( name = "on")
    public native Action2<String, Function> getOn();

    @JsProperty( name = "on")
    public native void setOn( Action2<String, Function> value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(off,429,,P(d1))
      * TE Signature : S(off,P(d1))
      * 
     */
    public native void off(String eventName);
    /** 
      * Std Signature : S(off,429,,P(d1),P(d205))
      * TE Signature : S(off,P(d1),P(d205))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/events/hammer_gestures.d.ts@627
     */
    public native void off(String eventName, Function callback /* optional */);
}

package fr.lteconsulting.jsinterop.ng.platformBrowser;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/events/hammer_gestures".HammerGesturesPlugin
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/events/hammer_gestures.d.ts:881
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.platformBrowser", name="HammerGesturesPlugin")
public class HammerGesturesPlugin extends EventManagerPlugin
{

    /*
        Constructors
    */
    public HammerGesturesPlugin(Object doc, HammerGestureConfig _config){
        super(null);
    }

    /*
        Properties
    */

    public Object _config;

    @JsProperty( name = "_config")
    public native Object get_config();

    @JsProperty( name = "_config")
    public native void set_config( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(isCustomEvent,27,,P(d1))
      * TE Signature : S(isCustomEvent,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/events/hammer_gestures.d.ts@1169
     */
    public native Boolean isCustomEvent(String eventName);
}

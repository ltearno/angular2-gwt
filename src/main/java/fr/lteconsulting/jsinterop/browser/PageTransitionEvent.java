package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: PageTransitionEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:540116
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:540211
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="PageTransitionEvent")
public class PageTransitionEvent extends Event
{

    /*
        Constructors
    */
    public PageTransitionEvent(){
        super(null, null);
    }

    /*
        Properties
    */

    public Boolean persisted;

    @JsProperty( name = "persisted")
    public native Boolean getPersisted();

    @JsProperty( name = "persisted")
    public native void setPersisted( Boolean value );
}

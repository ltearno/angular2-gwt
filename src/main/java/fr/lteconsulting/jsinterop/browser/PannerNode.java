package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: PannerNode
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:540304
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:540745
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="PannerNode")
public class PannerNode extends AudioNode
{

    /*
        Constructors
    */
    public PannerNode(){
    }

    /*
        Properties
    */

    public Number coneInnerAngle;

    @JsProperty( name = "coneInnerAngle")
    public native Number getConeInnerAngle();

    @JsProperty( name = "coneInnerAngle")
    public native void setConeInnerAngle( Number value );

    public Number coneOuterAngle;

    @JsProperty( name = "coneOuterAngle")
    public native Number getConeOuterAngle();

    @JsProperty( name = "coneOuterAngle")
    public native void setConeOuterAngle( Number value );

    public Number coneOuterGain;

    @JsProperty( name = "coneOuterGain")
    public native Number getConeOuterGain();

    @JsProperty( name = "coneOuterGain")
    public native void setConeOuterGain( Number value );

    public String distanceModel;

    @JsProperty( name = "distanceModel")
    public native String getDistanceModel();

    @JsProperty( name = "distanceModel")
    public native void setDistanceModel( String value );

    public Number maxDistance;

    @JsProperty( name = "maxDistance")
    public native Number getMaxDistance();

    @JsProperty( name = "maxDistance")
    public native void setMaxDistance( Number value );

    public String panningModel;

    @JsProperty( name = "panningModel")
    public native String getPanningModel();

    @JsProperty( name = "panningModel")
    public native void setPanningModel( String value );

    public Number refDistance;

    @JsProperty( name = "refDistance")
    public native Number getRefDistance();

    @JsProperty( name = "refDistance")
    public native void setRefDistance( Number value );

    public Number rolloffFactor;

    @JsProperty( name = "rolloffFactor")
    public native Number getRolloffFactor();

    @JsProperty( name = "rolloffFactor")
    public native void setRolloffFactor( Number value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(addEventListener,289,,P(d1))
      * TE Signature : S(addEventListener,P(d1))
      * 
     */
    public native void addEventListener(String type);
    /** 
      * Std Signature : S(addEventListener,289,,P(d1),P(d138))
      * TE Signature : S(addEventListener,P(d1),P(d138))
      * 
     */
    public native void addEventListener(String type, EventListenerObject listener /* optional */);
    /** 
      * Std Signature : S(addEventListener,289,,P(d1),P(d138),P(d27))
      * TE Signature : S(addEventListener,P(d1),P(d138),P(d27))
      * 
     */
    public native void addEventListener(String type, EventListenerObject listener /* optional */, Boolean useCapture /* optional */);
    /** 
      * Std Signature : S(addEventListener,289,,P(d1),P(dF--S(?,289,,P(d77))------)))
      * TE Signature : S(addEventListener,P(d1),P(dF--S(?,P(d77))------)))
      * 
     */
    public native void addEventListener(String type, EventListener listener /* optional */);
    /** 
      * Std Signature : S(addEventListener,289,,P(d1),P(dF--S(?,289,,P(d77))------)),P(d27))
      * TE Signature : S(addEventListener,P(d1),P(dF--S(?,P(d77))------)),P(d27))
      * 
     */
    public native void addEventListener(String type, EventListener listener /* optional */, Boolean useCapture /* optional */);
    /** 
      * Std Signature : S(addEventListener,289,,P(d1),P(dU(-F--S(?,289,,P(d77))------),138)))
      * TE Signature : S(addEventListener,P(d1),P(dU(-F--S(?,P(d77))------),138)))
      * 
     */
    public native void addEventListener(String type, EventListenerOrEventListenerObject_UnionOfEventListenerAndEventListenerObject listener /* optional */);
    /** 
      * Std Signature : S(addEventListener,289,,P(d1),P(dU(-F--S(?,289,,P(d77))------),138)),P(d27))
      * TE Signature : S(addEventListener,P(d1),P(dU(-F--S(?,P(d77))------),138)),P(d27))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void addEventListener(String type, EventListenerOrEventListenerObject_UnionOfEventListenerAndEventListenerObject listener /* optional */, Boolean useCapture /* optional */);
    /** 
      * Std Signature : S(dispatchEvent,27,,P(d77))
      * TE Signature : S(dispatchEvent,P(d77))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Boolean dispatchEvent(Event evt);
    /** 
      * Std Signature : S(removeEventListener,289,,P(d1))
      * TE Signature : S(removeEventListener,P(d1))
      * 
     */
    public native void removeEventListener(String type);
    /** 
      * Std Signature : S(removeEventListener,289,,P(d1),P(d138))
      * TE Signature : S(removeEventListener,P(d1),P(d138))
      * 
     */
    public native void removeEventListener(String type, EventListenerObject listener /* optional */);
    /** 
      * Std Signature : S(removeEventListener,289,,P(d1),P(d138),P(d27))
      * TE Signature : S(removeEventListener,P(d1),P(d138),P(d27))
      * 
     */
    public native void removeEventListener(String type, EventListenerObject listener /* optional */, Boolean useCapture /* optional */);
    /** 
      * Std Signature : S(removeEventListener,289,,P(d1),P(dF--S(?,289,,P(d77))------)))
      * TE Signature : S(removeEventListener,P(d1),P(dF--S(?,P(d77))------)))
      * 
     */
    public native void removeEventListener(String type, EventListener listener /* optional */);
    /** 
      * Std Signature : S(removeEventListener,289,,P(d1),P(dF--S(?,289,,P(d77))------)),P(d27))
      * TE Signature : S(removeEventListener,P(d1),P(dF--S(?,P(d77))------)),P(d27))
      * 
     */
    public native void removeEventListener(String type, EventListener listener /* optional */, Boolean useCapture /* optional */);
    /** 
      * Std Signature : S(removeEventListener,289,,P(d1),P(dU(-F--S(?,289,,P(d77))------),138)))
      * TE Signature : S(removeEventListener,P(d1),P(dU(-F--S(?,P(d77))------),138)))
      * 
     */
    public native void removeEventListener(String type, EventListenerOrEventListenerObject_UnionOfEventListenerAndEventListenerObject listener /* optional */);
    /** 
      * Std Signature : S(removeEventListener,289,,P(d1),P(dU(-F--S(?,289,,P(d77))------),138)),P(d27))
      * TE Signature : S(removeEventListener,P(d1),P(dU(-F--S(?,P(d77))------),138)),P(d27))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void removeEventListener(String type, EventListenerOrEventListenerObject_UnionOfEventListenerAndEventListenerObject listener /* optional */, Boolean useCapture /* optional */);
    /** 
      * Std Signature : S(setOrientation,289,,P(d2),P(d2),P(d2))
      * TE Signature : S(setOrientation,P(d2),P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@540564
     */
    public native void setOrientation(Number x, Number y, Number z);
    /** 
      * Std Signature : S(setPosition,289,,P(d2),P(d2),P(d2))
      * TE Signature : S(setPosition,P(d2),P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@540623
     */
    public native void setPosition(Number x, Number y, Number z);
    /** 
      * Std Signature : S(setVelocity,289,,P(d2),P(d2),P(d2))
      * TE Signature : S(setVelocity,P(d2),P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@540679
     */
    public native void setVelocity(Number x, Number y, Number z);
}

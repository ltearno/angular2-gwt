package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: AudioDestinationNode
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:289113
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:289218
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="AudioDestinationNode")
public class AudioDestinationNode extends AudioNode
{

    /*
        Constructors
    */
    public AudioDestinationNode(){
    }

    /*
        Properties
    */

    public Number maxChannelCount;

    @JsProperty( name = "maxChannelCount")
    public native Number getMaxChannelCount();

    @JsProperty( name = "maxChannelCount")
    public native void setMaxChannelCount( Number value );

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
}

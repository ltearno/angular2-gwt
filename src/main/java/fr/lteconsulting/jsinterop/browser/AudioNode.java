package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: AudioNode
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:289694
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:290217
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="AudioNode")
public class AudioNode implements EventTarget
{

    /*
        Constructors
    */
    public AudioNode(){
    }

    /*
        Properties
    */

    public Number channelCount;

    @JsProperty( name = "channelCount")
    public native Number getChannelCount();

    @JsProperty( name = "channelCount")
    public native void setChannelCount( Number value );

    public String channelCountMode;

    @JsProperty( name = "channelCountMode")
    public native String getChannelCountMode();

    @JsProperty( name = "channelCountMode")
    public native void setChannelCountMode( String value );

    public String channelInterpretation;

    @JsProperty( name = "channelInterpretation")
    public native String getChannelInterpretation();

    @JsProperty( name = "channelInterpretation")
    public native void setChannelInterpretation( String value );

    public AudioContext context;

    @JsProperty( name = "context")
    public native AudioContext getContext();

    @JsProperty( name = "context")
    public native void setContext( AudioContext value );

    public Number numberOfInputs;

    @JsProperty( name = "numberOfInputs")
    public native Number getNumberOfInputs();

    @JsProperty( name = "numberOfInputs")
    public native void setNumberOfInputs( Number value );

    public Number numberOfOutputs;

    @JsProperty( name = "numberOfOutputs")
    public native Number getNumberOfOutputs();

    @JsProperty( name = "numberOfOutputs")
    public native void setNumberOfOutputs( Number value );

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
      * Std Signature : S(connect,220,,P(d220))
      * TE Signature : S(connect,P(d220))
      * 
     */
    public native AudioNode connect(AudioNode destination);
    /** 
      * Std Signature : S(connect,220,,P(d220),P(d2))
      * TE Signature : S(connect,P(d220),P(d2))
      * 
     */
    public native AudioNode connect(AudioNode destination, Number output /* optional */);
    /** 
      * Std Signature : S(connect,220,,P(d220),P(d2),P(d2))
      * TE Signature : S(connect,P(d220),P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@289944
     */
    public native AudioNode connect(AudioNode destination, Number output /* optional */, Number input /* optional */);
    /** 
      * Std Signature : S(disconnect,289,,)
      * TE Signature : S(disconnect,)
      * 
     */
    public native void disconnect();
    /** 
      * Std Signature : S(disconnect,289,,P(d2))
      * TE Signature : S(disconnect,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@290025
     */
    public native void disconnect(Number output /* optional */);
    /** 
      * Std Signature : S(disconnect,289,,P(d220))
      * TE Signature : S(disconnect,P(d220))
      * 
     */
    public native void disconnect(AudioNode destination);
    /** 
      * Std Signature : S(disconnect,289,,P(d220),P(d2))
      * TE Signature : S(disconnect,P(d220),P(d2))
      * 
     */
    public native void disconnect(AudioNode destination, Number output /* optional */);
    /** 
      * Std Signature : S(disconnect,289,,P(d220),P(d2),P(d2))
      * TE Signature : S(disconnect,P(d220),P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@290064
      * VERSION 1
     */
    public native void disconnect(AudioNode destination, Number output /* optional */, Number input /* optional */);
    /** 
      * Std Signature : S(disconnect,289,,P(d221))
      * TE Signature : S(disconnect,P(d221))
      * 
     */
    public native void disconnect(AudioParam destination);
    /** 
      * Std Signature : S(disconnect,289,,P(d221),P(d2))
      * TE Signature : S(disconnect,P(d221),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@290143
      * VERSION 2
     */
    public native void disconnect(AudioParam destination, Number output /* optional */);
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

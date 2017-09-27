package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: AnalyserNode
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:282774
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:283191
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="AnalyserNode")
public class AnalyserNode extends AudioNode
{

    /*
        Constructors
    */
    public AnalyserNode(){
    }

    /*
        Properties
    */

    public Number fftSize;

    @JsProperty( name = "fftSize")
    public native Number getFftSize();

    @JsProperty( name = "fftSize")
    public native void setFftSize( Number value );

    public Number frequencyBinCount;

    @JsProperty( name = "frequencyBinCount")
    public native Number getFrequencyBinCount();

    @JsProperty( name = "frequencyBinCount")
    public native void setFrequencyBinCount( Number value );

    public Number maxDecibels;

    @JsProperty( name = "maxDecibels")
    public native Number getMaxDecibels();

    @JsProperty( name = "maxDecibels")
    public native void setMaxDecibels( Number value );

    public Number minDecibels;

    @JsProperty( name = "minDecibels")
    public native Number getMinDecibels();

    @JsProperty( name = "minDecibels")
    public native void setMinDecibels( Number value );

    public Number smoothingTimeConstant;

    @JsProperty( name = "smoothingTimeConstant")
    public native Number getSmoothingTimeConstant();

    @JsProperty( name = "smoothingTimeConstant")
    public native void setSmoothingTimeConstant( Number value );

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
      * Std Signature : S(getByteFrequencyData,289,,P(d29))
      * TE Signature : S(getByteFrequencyData,P(d29))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@282969
     */
    public native void getByteFrequencyData(Uint8Array array);
    /** 
      * Std Signature : S(getByteTimeDomainData,289,,P(d29))
      * TE Signature : S(getByteTimeDomainData,P(d29))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@283020
     */
    public native void getByteTimeDomainData(Uint8Array array);
    /** 
      * Std Signature : S(getFloatFrequencyData,289,,P(d35))
      * TE Signature : S(getFloatFrequencyData,P(d35))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@283072
     */
    public native void getFloatFrequencyData(Float32Array array);
    /** 
      * Std Signature : S(getFloatTimeDomainData,289,,P(d35))
      * TE Signature : S(getFloatTimeDomainData,P(d35))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@283126
     */
    public native void getFloatTimeDomainData(Float32Array array);
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

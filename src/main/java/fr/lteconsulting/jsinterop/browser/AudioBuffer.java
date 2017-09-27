package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: AudioBuffer
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:285533
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:285953
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="AudioBuffer")
public class AudioBuffer
{

    /*
        Constructors
    */
    public AudioBuffer(){
    }

    /*
        Properties
    */

    public Number duration;

    @JsProperty( name = "duration")
    public native Number getDuration();

    @JsProperty( name = "duration")
    public native void setDuration( Number value );

    public Number length;

    @JsProperty( name = "length")
    public native Number getLength();

    @JsProperty( name = "length")
    public native void setLength( Number value );

    public Number numberOfChannels;

    @JsProperty( name = "numberOfChannels")
    public native Number getNumberOfChannels();

    @JsProperty( name = "numberOfChannels")
    public native void setNumberOfChannels( Number value );

    public Number sampleRate;

    @JsProperty( name = "sampleRate")
    public native Number getSampleRate();

    @JsProperty( name = "sampleRate")
    public native void setSampleRate( Number value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(copyFromChannel,289,,P(d35),P(d2))
      * TE Signature : S(copyFromChannel,P(d35),P(d2))
      * 
     */
    public native void copyFromChannel(Float32Array destination, Number channelNumber);
    /** 
      * Std Signature : S(copyFromChannel,289,,P(d35),P(d2),P(d2))
      * TE Signature : S(copyFromChannel,P(d35),P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@285695
     */
    public native void copyFromChannel(Float32Array destination, Number channelNumber, Number startInChannel /* optional */);
    /** 
      * Std Signature : S(copyToChannel,289,,P(d35),P(d2))
      * TE Signature : S(copyToChannel,P(d35),P(d2))
      * 
     */
    public native void copyToChannel(Float32Array source, Number channelNumber);
    /** 
      * Std Signature : S(copyToChannel,289,,P(d35),P(d2),P(d2))
      * TE Signature : S(copyToChannel,P(d35),P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@285797
     */
    public native void copyToChannel(Float32Array source, Number channelNumber, Number startInChannel /* optional */);
    /** 
      * Std Signature : S(getChannelData,35,,P(d2))
      * TE Signature : S(getChannelData,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@285892
     */
    public native Float32Array getChannelData(Number channel);
}

package fr.lteconsulting.jsinterop.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: AudioContextBase
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:286978
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="AudioContextBase")
public class AudioContextBase implements EventTarget
{

    /*
        Constructors
    */
    public AudioContextBase(){
    }

    /*
        Properties
    */

    public Number currentTime;

    @JsProperty( name = "currentTime")
    public native Number getCurrentTime();

    @JsProperty( name = "currentTime")
    public native void setCurrentTime( Number value );

    public AudioDestinationNode destination;

    @JsProperty( name = "destination")
    public native AudioDestinationNode getDestination();

    @JsProperty( name = "destination")
    public native void setDestination( AudioDestinationNode value );

    public AudioListener listener;

    @JsProperty( name = "listener")
    public native AudioListener getListener();

    @JsProperty( name = "listener")
    public native void setListener( AudioListener value );

    public Function1<Event, Object> onstatechange;

    @JsProperty( name = "onstatechange")
    public native Function1<Event, Object> getOnstatechange();

    @JsProperty( name = "onstatechange")
    public native void setOnstatechange( Function1<Event, Object> value );

    public Number sampleRate;

    @JsProperty( name = "sampleRate")
    public native Number getSampleRate();

    @JsProperty( name = "sampleRate")
    public native void setSampleRate( Number value );

    public String state;

    @JsProperty( name = "state")
    public native String getState();

    @JsProperty( name = "state")
    public native void setState( String value );

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
      * Std Signature : S(close,88<369>,,)
      * TE Signature : S(close,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@287273
     */
    public native Promise<Void> close();
    /** 
      * Std Signature : S(createAnalyser,523,,)
      * TE Signature : S(createAnalyser,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@287301
     */
    public native AnalyserNode createAnalyser();
    /** 
      * Std Signature : S(createBiquadFilter,524,,)
      * TE Signature : S(createBiquadFilter,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@287337
     */
    public native BiquadFilterNode createBiquadFilter();
    /** 
      * Std Signature : S(createBuffer,218,,P(d2),P(d2),P(d2))
      * TE Signature : S(createBuffer,P(d2),P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@287381
     */
    public native AudioBuffer createBuffer(Number numberOfChannels, Number length, Number sampleRate);
    /** 
      * Std Signature : S(createBufferSource,525,,)
      * TE Signature : S(createBufferSource,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@287474
     */
    public native AudioBufferSourceNode createBufferSource();
    /** 
      * Std Signature : S(createChannelMerger,526,,)
      * TE Signature : S(createChannelMerger,)
      * 
     */
    public native ChannelMergerNode createChannelMerger();
    /** 
      * Std Signature : S(createChannelMerger,526,,P(d2))
      * TE Signature : S(createChannelMerger,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@287523
     */
    public native ChannelMergerNode createChannelMerger(Number numberOfInputs /* optional */);
    /** 
      * Std Signature : S(createChannelSplitter,527,,)
      * TE Signature : S(createChannelSplitter,)
      * 
     */
    public native ChannelSplitterNode createChannelSplitter();
    /** 
      * Std Signature : S(createChannelSplitter,527,,P(d2))
      * TE Signature : S(createChannelSplitter,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@287592
     */
    public native ChannelSplitterNode createChannelSplitter(Number numberOfOutputs /* optional */);
    /** 
      * Std Signature : S(createConvolver,528,,)
      * TE Signature : S(createConvolver,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@287666
     */
    public native ConvolverNode createConvolver();
    /** 
      * Std Signature : S(createDelay,529,,)
      * TE Signature : S(createDelay,)
      * 
     */
    public native DelayNode createDelay();
    /** 
      * Std Signature : S(createDelay,529,,P(d2))
      * TE Signature : S(createDelay,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@287704
     */
    public native DelayNode createDelay(Number maxDelayTime /* optional */);
    /** 
      * Std Signature : S(createDynamicsCompressor,530,,)
      * TE Signature : S(createDynamicsCompressor,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@287755
     */
    public native DynamicsCompressorNode createDynamicsCompressor();
    /** 
      * Std Signature : S(createGain,531,,)
      * TE Signature : S(createGain,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@287811
     */
    public native GainNode createGain();
    /** 
      * Std Signature : S(createIIRFilter,532,,P(d7<2>),P(d7<2>))
      * TE Signature : S(createIIRFilter,P(d7),P(d7))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@287839
     */
    public native IIRFilterNode createIIRFilter(Array<Number> feedforward, Array<Number> feedback);
    /** 
      * Std Signature : S(createMediaElementSource,533,,P(d214))
      * TE Signature : S(createMediaElementSource,P(d214))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@287918
     */
    public native MediaElementAudioSourceNode createMediaElementSource(HTMLMediaElement mediaElement);
    /** 
      * Std Signature : S(createMediaStreamSource,534,,P(d79))
      * TE Signature : S(createMediaStreamSource,P(d79))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@288009
     */
    public native MediaStreamAudioSourceNode createMediaStreamSource(MediaStream mediaStream);
    /** 
      * Std Signature : S(createOscillator,535,,)
      * TE Signature : S(createOscillator,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@288092
     */
    public native OscillatorNode createOscillator();
    /** 
      * Std Signature : S(createPanner,536,,)
      * TE Signature : S(createPanner,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@288132
     */
    public native PannerNode createPanner();
    /** 
      * Std Signature : S(createPeriodicWave,215,,P(d35),P(d35))
      * TE Signature : S(createPeriodicWave,P(d35),P(d35))
      * 
     */
    public native PeriodicWave createPeriodicWave(Float32Array real, Float32Array imag);
    /** 
      * Std Signature : S(createPeriodicWave,215,,P(d35),P(d35),P(d216))
      * TE Signature : S(createPeriodicWave,P(d35),P(d35),P(d216))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@288164
     */
    public native PeriodicWave createPeriodicWave(Float32Array real, Float32Array imag, PeriodicWaveConstraints constraints /* optional */);
    /** 
      * Std Signature : S(createScriptProcessor,537,,)
      * TE Signature : S(createScriptProcessor,)
      * 
     */
    public native ScriptProcessorNode createScriptProcessor();
    /** 
      * Std Signature : S(createScriptProcessor,537,,P(d2))
      * TE Signature : S(createScriptProcessor,P(d2))
      * 
     */
    public native ScriptProcessorNode createScriptProcessor(Number bufferSize /* optional */);
    /** 
      * Std Signature : S(createScriptProcessor,537,,P(d2),P(d2))
      * TE Signature : S(createScriptProcessor,P(d2),P(d2))
      * 
     */
    public native ScriptProcessorNode createScriptProcessor(Number bufferSize /* optional */, Number numberOfInputChannels /* optional */);
    /** 
      * Std Signature : S(createScriptProcessor,537,,P(d2),P(d2),P(d2))
      * TE Signature : S(createScriptProcessor,P(d2),P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@288281
     */
    public native ScriptProcessorNode createScriptProcessor(Number bufferSize /* optional */, Number numberOfInputChannels /* optional */, Number numberOfOutputChannels /* optional */);
    /** 
      * Std Signature : S(createStereoPanner,538,,)
      * TE Signature : S(createStereoPanner,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@288415
     */
    public native StereoPannerNode createStereoPanner();
    /** 
      * Std Signature : S(createWaveShaper,539,,)
      * TE Signature : S(createWaveShaper,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@288459
     */
    public native WaveShaperNode createWaveShaper();
    /** 
      * Std Signature : S(decodeAudioData,88<218>,,P(d26))
      * TE Signature : S(decodeAudioData,P(d26))
      * 
     */
    public native Promise<AudioBuffer> decodeAudioData(ArrayBuffer audioData);
    /** 
      * Std Signature : S(decodeAudioData,88<218>,,P(d26),P(dF--S(?,289,,P(d218))------)))
      * TE Signature : S(decodeAudioData,P(d26),P(dF--S(?,P(d218))------)))
      * 
     */
    public native Promise<AudioBuffer> decodeAudioData(ArrayBuffer audioData, DecodeSuccessCallback successCallback /* optional */);
    /** 
      * Std Signature : S(decodeAudioData,88<218>,,P(d26),P(dF--S(?,289,,P(d218))------)),P(dF--S(?,289,,P(d219))------)))
      * TE Signature : S(decodeAudioData,P(d26),P(dF--S(?,P(d218))------)),P(dF--S(?,P(d219))------)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@288499
     */
    public native Promise<AudioBuffer> decodeAudioData(ArrayBuffer audioData, DecodeSuccessCallback successCallback /* optional */, DecodeErrorCallback errorCallback /* optional */);
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
      * Std Signature : S(resume,88<369>,,)
      * TE Signature : S(resume,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@288644
     */
    public native Promise<Void> resume();
}

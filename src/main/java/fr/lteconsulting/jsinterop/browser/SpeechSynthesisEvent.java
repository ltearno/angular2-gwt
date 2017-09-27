package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: SpeechSynthesisEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:646150
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:646363
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SpeechSynthesisEvent")
public class SpeechSynthesisEvent extends Event
{

    /*
        Constructors
    */
    public SpeechSynthesisEvent(String type, SpeechSynthesisEventInit eventInitDict){
        super(null, null);
    }

    /*
        Properties
    */

    public Number charIndex;

    @JsProperty( name = "charIndex")
    public native Number getCharIndex();

    @JsProperty( name = "charIndex")
    public native void setCharIndex( Number value );

    public Number elapsedTime;

    @JsProperty( name = "elapsedTime")
    public native Number getElapsedTime();

    @JsProperty( name = "elapsedTime")
    public native void setElapsedTime( Number value );

    public String name;

    @JsProperty( name = "name")
    public native String getName();

    @JsProperty( name = "name")
    public native void setName( String value );

    public SpeechSynthesisUtterance utterance;

    @JsProperty( name = "utterance")
    public native SpeechSynthesisUtterance getUtterance();

    @JsProperty( name = "utterance")
    public native void setUtterance( SpeechSynthesisUtterance value );
}

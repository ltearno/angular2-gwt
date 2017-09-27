package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: SpeechSynthesisVoice
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:647789
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:647990
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SpeechSynthesisVoice")
public class SpeechSynthesisVoice
{

    /*
        Constructors
    */
    public SpeechSynthesisVoice(){
    }

    /*
        Properties
    */

    @JsProperty(name="default")
    public Boolean default_;

    @JsProperty( name = "default")
    public native Boolean getDefault_();

    @JsProperty( name = "default")
    public native void setDefault_( Boolean value );

    public String lang;

    @JsProperty( name = "lang")
    public native String getLang();

    @JsProperty( name = "lang")
    public native void setLang( String value );

    public Boolean localService;

    @JsProperty( name = "localService")
    public native Boolean getLocalService();

    @JsProperty( name = "localService")
    public native void setLocalService( Boolean value );

    public String name;

    @JsProperty( name = "name")
    public native String getName();

    @JsProperty( name = "name")
    public native void setName( String value );

    public String voiceURI;

    @JsProperty( name = "voiceURI")
    public native String getVoiceURI();

    @JsProperty( name = "voiceURI")
    public native void setVoiceURI( String value );
}

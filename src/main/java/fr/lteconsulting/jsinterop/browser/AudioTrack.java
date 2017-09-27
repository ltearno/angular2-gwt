package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: AudioTrack
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:291173
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:291368
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="AudioTrack")
public class AudioTrack
{

    /*
        Constructors
    */
    public AudioTrack(){
    }

    /*
        Properties
    */

    public Boolean enabled;

    @JsProperty( name = "enabled")
    public native Boolean getEnabled();

    @JsProperty( name = "enabled")
    public native void setEnabled( Boolean value );

    public String id;

    @JsProperty( name = "id")
    public native String getId();

    @JsProperty( name = "id")
    public native void setId( String value );

    public String kind;

    @JsProperty( name = "kind")
    public native String getKind();

    @JsProperty( name = "kind")
    public native void setKind( String value );

    public String label;

    @JsProperty( name = "label")
    public native String getLabel();

    @JsProperty( name = "label")
    public native void setLabel( String value );

    public String language;

    @JsProperty( name = "language")
    public native String getLanguage();

    @JsProperty( name = "language")
    public native void setLanguage( String value );

    public SourceBuffer sourceBuffer;

    @JsProperty( name = "sourceBuffer")
    public native SourceBuffer getSourceBuffer();

    @JsProperty( name = "sourceBuffer")
    public native void setSourceBuffer( SourceBuffer value );
}

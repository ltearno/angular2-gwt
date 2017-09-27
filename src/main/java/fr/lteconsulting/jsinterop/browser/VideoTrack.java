package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: VideoTrack
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:662062
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:662258
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="VideoTrack")
public class VideoTrack
{

    /*
        Constructors
    */
    public VideoTrack(){
    }

    /*
        Properties
    */

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

    public Boolean selected;

    @JsProperty( name = "selected")
    public native Boolean getSelected();

    @JsProperty( name = "selected")
    public native void setSelected( Boolean value );

    public SourceBuffer sourceBuffer;

    @JsProperty( name = "sourceBuffer")
    public native SourceBuffer getSourceBuffer();

    @JsProperty( name = "sourceBuffer")
    public native void setSourceBuffer( SourceBuffer value );
}

package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RTCRTPStreamStats
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:276406
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCRTPStreamStats")
public class RTCRTPStreamStats extends RTCStats
{

    /*
        Properties
    */

    public String associateStatsId;

    @JsProperty( name = "associateStatsId")
    public native String getAssociateStatsId();

    @JsProperty( name = "associateStatsId")
    public native void setAssociateStatsId( String value );

    public String codecId;

    @JsProperty( name = "codecId")
    public native String getCodecId();

    @JsProperty( name = "codecId")
    public native void setCodecId( String value );

    public Number firCount;

    @JsProperty( name = "firCount")
    public native Number getFirCount();

    @JsProperty( name = "firCount")
    public native void setFirCount( Number value );

    public Boolean isRemote;

    @JsProperty( name = "isRemote")
    public native Boolean getIsRemote();

    @JsProperty( name = "isRemote")
    public native void setIsRemote( Boolean value );

    public String mediaTrackId;

    @JsProperty( name = "mediaTrackId")
    public native String getMediaTrackId();

    @JsProperty( name = "mediaTrackId")
    public native void setMediaTrackId( String value );

    public Number nackCount;

    @JsProperty( name = "nackCount")
    public native Number getNackCount();

    @JsProperty( name = "nackCount")
    public native void setNackCount( Number value );

    public Number pliCount;

    @JsProperty( name = "pliCount")
    public native Number getPliCount();

    @JsProperty( name = "pliCount")
    public native void setPliCount( Number value );

    public Number sliCount;

    @JsProperty( name = "sliCount")
    public native Number getSliCount();

    @JsProperty( name = "sliCount")
    public native void setSliCount( Number value );

    public String ssrc;

    @JsProperty( name = "ssrc")
    public native String getSsrc();

    @JsProperty( name = "ssrc")
    public native void setSsrc( String value );

    public String transportId;

    @JsProperty( name = "transportId")
    public native String getTransportId();

    @JsProperty( name = "transportId")
    public native void setTransportId( String value );
}

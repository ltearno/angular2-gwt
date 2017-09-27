package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MSVideoResolutionDistribution
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:267515
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSVideoResolutionDistribution")
public class MSVideoResolutionDistribution
{

    /*
        Properties
    */

    public Number cifQuality;

    @JsProperty( name = "cifQuality")
    public native Number getCifQuality();

    @JsProperty( name = "cifQuality")
    public native void setCifQuality( Number value );

    public Number h1080Quality;

    @JsProperty( name = "h1080Quality")
    public native Number getH1080Quality();

    @JsProperty( name = "h1080Quality")
    public native void setH1080Quality( Number value );

    public Number h1440Quality;

    @JsProperty( name = "h1440Quality")
    public native Number getH1440Quality();

    @JsProperty( name = "h1440Quality")
    public native void setH1440Quality( Number value );

    public Number h2160Quality;

    @JsProperty( name = "h2160Quality")
    public native Number getH2160Quality();

    @JsProperty( name = "h2160Quality")
    public native void setH2160Quality( Number value );

    public Number h720Quality;

    @JsProperty( name = "h720Quality")
    public native Number getH720Quality();

    @JsProperty( name = "h720Quality")
    public native void setH720Quality( Number value );

    public Number vgaQuality;

    @JsProperty( name = "vgaQuality")
    public native Number getVgaQuality();

    @JsProperty( name = "vgaQuality")
    public native void setVgaQuality( Number value );
}

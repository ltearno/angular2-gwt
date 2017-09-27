package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: StoreExceptionsInformation
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:280931
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="StoreExceptionsInformation")
public class StoreExceptionsInformation extends ExceptionInformation
{

    /*
        Properties
    */

    public String detailURI;

    @JsProperty( name = "detailURI")
    public native String getDetailURI();

    @JsProperty( name = "detailURI")
    public native void setDetailURI( String value );

    public String explanationString;

    @JsProperty( name = "explanationString")
    public native String getExplanationString();

    @JsProperty( name = "explanationString")
    public native void setExplanationString( String value );

    public String siteName;

    @JsProperty( name = "siteName")
    public native String getSiteName();

    @JsProperty( name = "siteName")
    public native void setSiteName( String value );
}

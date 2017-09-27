package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: Intl.DateTimeFormatOptions
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:190493
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="DateTimeFormatOptions")
public class DateTimeFormatOptions
{

    /*
        Properties
    */

    public String day;

    @JsProperty( name = "day")
    public native String getDay();

    @JsProperty( name = "day")
    public native void setDay( String value );

    public String era;

    @JsProperty( name = "era")
    public native String getEra();

    @JsProperty( name = "era")
    public native void setEra( String value );

    public String formatMatcher;

    @JsProperty( name = "formatMatcher")
    public native String getFormatMatcher();

    @JsProperty( name = "formatMatcher")
    public native void setFormatMatcher( String value );

    public String hour;

    @JsProperty( name = "hour")
    public native String getHour();

    @JsProperty( name = "hour")
    public native void setHour( String value );

    public Boolean hour12;

    @JsProperty( name = "hour12")
    public native Boolean getHour12();

    @JsProperty( name = "hour12")
    public native void setHour12( Boolean value );

    public String localeMatcher;

    @JsProperty( name = "localeMatcher")
    public native String getLocaleMatcher();

    @JsProperty( name = "localeMatcher")
    public native void setLocaleMatcher( String value );

    public String minute;

    @JsProperty( name = "minute")
    public native String getMinute();

    @JsProperty( name = "minute")
    public native void setMinute( String value );

    public String month;

    @JsProperty( name = "month")
    public native String getMonth();

    @JsProperty( name = "month")
    public native void setMonth( String value );

    public String second;

    @JsProperty( name = "second")
    public native String getSecond();

    @JsProperty( name = "second")
    public native void setSecond( String value );

    public String timeZone;

    @JsProperty( name = "timeZone")
    public native String getTimeZone();

    @JsProperty( name = "timeZone")
    public native void setTimeZone( String value );

    public String timeZoneName;

    @JsProperty( name = "timeZoneName")
    public native String getTimeZoneName();

    @JsProperty( name = "timeZoneName")
    public native void setTimeZoneName( String value );

    public String weekday;

    @JsProperty( name = "weekday")
    public native String getWeekday();

    @JsProperty( name = "weekday")
    public native void setWeekday( String value );

    public String year;

    @JsProperty( name = "year")
    public native String getYear();

    @JsProperty( name = "year")
    public native void setYear( String value );
}

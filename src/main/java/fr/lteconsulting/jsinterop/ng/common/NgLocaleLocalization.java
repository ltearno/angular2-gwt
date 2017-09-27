package fr.lteconsulting.jsinterop.ng.common;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/localization".NgLocaleLocalization
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/localization.d.ts:125
  * 1 constructors
  * Returns the plural case based on the locale
 */
@JsType(isNative=true, namespace="ng.common", name="NgLocaleLocalization")
public class NgLocaleLocalization extends NgLocalization
{

    /*
        Constructors
    */
    public NgLocaleLocalization(String locale){
    }

    /*
        Properties
    */

    public String locale;

    @JsProperty( name = "locale")
    public native String getLocale();

    @JsProperty( name = "locale")
    public native void setLocale( String value );
}

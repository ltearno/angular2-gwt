package fr.lteconsulting.jsinterop.ng.common;

import fr.lteconsulting.jsinterop.browser.Date;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/common/src/pipes/intl".DateFormatter
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/common/src/pipes/intl.d.ts:624
  * 
 */
@JsType(isNative=true, namespace="ng.common", name="DateFormatter")
public class DateFormatter
{

    /*
        Static methods
    */
    /** 
      * source : apis/angular4-api/tsd/@angular/common/src/pipes/intl.d.ts:666
     */
    @JsMethod(namespace="ng.common.DateFormatter", name = "format")
    public static native String format(Date date, String locale, String pattern);
}

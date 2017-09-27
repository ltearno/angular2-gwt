package fr.lteconsulting.jsinterop.ng.common;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/common/src/pipes/intl".NumberFormatter
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/common/src/pipes/intl.d.ts:296
  * 
 */
@JsType(isNative=true, namespace="ng.common", name="NumberFormatter")
public class NumberFormatter
{

    /*
        Static methods
    */
    /** 
      * source : apis/angular4-api/tsd/@angular/common/src/pipes/intl.d.ts:340
     */
    @JsMethod(namespace="ng.common.NumberFormatter", name = "format")
    public static native String format(Number num, String locale, NumberFormatStyle style, Object opts /* optional */);
}

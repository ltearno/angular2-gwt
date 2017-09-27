package fr.lteconsulting.jsinterop.ng.common;

import fr.lteconsulting.jsinterop.ng.core.PipeTransform;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/pipes/case_conversion_pipes".UpperCasePipe
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/pipes/case_conversion_pipes.d.ts:641

  * Transforms text to uppercase.
 */
@JsType(isNative=true, namespace="ng.common", name="UpperCasePipe")
public class UpperCasePipe extends PipeTransform
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(transform,1,,P(d1))
      * TE Signature : S(transform,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/pipes/case_conversion_pipes.d.ts@763
     */
    public native String transform(String value);
}

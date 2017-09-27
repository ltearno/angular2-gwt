package fr.lteconsulting.jsinterop.ng.common;

import fr.lteconsulting.jsinterop.ng.core.PipeTransform;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/pipes/case_conversion_pipes".LowerCasePipe
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/pipes/case_conversion_pipes.d.ts:249

  * Transforms text to lowercase.
  * 
  * {@example  common/pipes/ts/lowerupper_pipe.ts region='LowerUpperPipe' }
 */
@JsType(isNative=true, namespace="ng.common", name="LowerCasePipe")
public class LowerCasePipe extends PipeTransform
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
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/pipes/case_conversion_pipes.d.ts@449
     */
    public native String transform(String value);
}

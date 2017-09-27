package fr.lteconsulting.jsinterop.ng.common;

import fr.lteconsulting.jsinterop.ng.core.ChangeDetectorRef;
import fr.lteconsulting.jsinterop.ng.core.OnDestroy;
import fr.lteconsulting.jsinterop.ng.core.PipeTransform;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/pipes/async_pipe".AsyncPipe
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/pipes/async_pipe.d.ts:325
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.common", name="AsyncPipe")
public class AsyncPipe extends PipeTransform implements OnDestroy
{

    /*
        Constructors
    */
    public AsyncPipe(ChangeDetectorRef _ref){
    }

    /*
        Methods
    */
    /** 
      * Std Signature : S(ngOnDestroy,429,,)
      * TE Signature : S(ngOnDestroy,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void ngOnDestroy();
}

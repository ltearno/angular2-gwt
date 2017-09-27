package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/view_ref".InternalViewRef
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/view_ref.d.ts:2267
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface InternalViewRef extends ViewRef
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(attachToAppRef,429,,P(d375))
      * TE Signature : S(attachToAppRef,P(d375))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/view_ref.d.ts@2353
     */
    void attachToAppRef(ApplicationRef appRef);
    /** 
      * Std Signature : S(detachFromAppRef,429,,)
      * TE Signature : S(detachFromAppRef,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/view_ref.d.ts@2323
     */
    void detachFromAppRef();
}

package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.browser.Function;
import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/view_ref".ViewRef
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/view_ref.d.ts:332
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface ViewRef extends ChangeDetectorRef
{

    /*
        Properties
    */

    @JsProperty( name = "destroyed")
    Boolean getDestroyed();

    @JsProperty( name = "destroyed")
    void setDestroyed( Boolean value );

    @JsProperty( name = "onDestroy")
    Function1<Function, Object> getOnDestroy();

    @JsProperty( name = "onDestroy")
    void setOnDestroy( Function1<Function, Object> value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(destroy,429,,)
      * TE Signature : S(destroy,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/view_ref.d.ts@514
      * Destroys the view and all of the data structures associated with it.
     */
    void destroy();
}

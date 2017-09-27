package fr.lteconsulting.jsinterop.ng.router;

import fr.lteconsulting.jsinterop.rxjs.Observable;
import fr.lteconsulting.prebuilt.Function;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router_preloader".PreloadingStrategy
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router_preloader.d.ts:393
  * 
 */
@JsType(isNative=true, namespace="ng.router", name="PreloadingStrategy")
public class PreloadingStrategy
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(preload,357<3>,,P(d677),P(dFR--S(?,3,,)------)<357<3>>))
      * TE Signature : S(preload,P(d677),P(dF--S(?,)------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router_preloader.d.ts@524
     */
    public native Observable<Object> preload(Route route, Function<Observable<Object>> fn);
}

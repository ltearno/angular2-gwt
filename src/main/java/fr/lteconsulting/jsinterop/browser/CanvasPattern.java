package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: CanvasPattern
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:311407
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:311492
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="CanvasPattern")
public class CanvasPattern
{

    /*
        Constructors
    */
    public CanvasPattern(){
    }

    /*
        Methods
    */
    /** 
      * Std Signature : S(setTransform,289,,P(d94))
      * TE Signature : S(setTransform,P(d94))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@311439
     */
    public native void setTransform(SVGMatrix matrix);
}

package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: CanvasGradient
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:311231
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:311329
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="CanvasGradient")
public class CanvasGradient
{

    /*
        Constructors
    */
    public CanvasGradient(){
    }

    /*
        Methods
    */
    /** 
      * Std Signature : S(addColorStop,289,,P(d2),P(d1))
      * TE Signature : S(addColorStop,P(d2),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@311264
     */
    public native void addColorStop(Number offset, String color);
}

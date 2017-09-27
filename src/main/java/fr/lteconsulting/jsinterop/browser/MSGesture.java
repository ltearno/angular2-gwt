package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MSGesture
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:504109
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:504227
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSGesture")
public class MSGesture
{

    /*
        Constructors
    */
    public MSGesture(){
    }

    /*
        Properties
    */

    public Element target;

    @JsProperty( name = "target")
    public native Element getTarget();

    @JsProperty( name = "target")
    public native void setTarget( Element value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(addPointer,289,,P(d2))
      * TE Signature : S(addPointer,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@504158
     */
    public native void addPointer(Number pointerId);
    /** 
      * Std Signature : S(stop,289,,)
      * TE Signature : S(stop,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@504199
     */
    public native void stop();
}

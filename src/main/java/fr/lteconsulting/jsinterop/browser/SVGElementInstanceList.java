package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: SVGElementInstanceList
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:578072
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:578197
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGElementInstanceList")
public class SVGElementInstanceList
{

    /*
        Constructors
    */
    public SVGElementInstanceList(){
    }

    /*
        Properties
    */

    public Number length;

    @JsProperty( name = "length")
    public native Number getLength();

    @JsProperty( name = "length")
    public native void setLength( Number value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(item,457,,P(d2))
      * TE Signature : S(item,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@578142
     */
    public native SVGElementInstance item(Number index);
}

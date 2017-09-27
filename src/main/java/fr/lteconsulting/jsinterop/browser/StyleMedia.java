package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: StyleMedia
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:648909
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:649021
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="StyleMedia")
public class StyleMedia
{

    /*
        Constructors
    */
    public StyleMedia(){
    }

    /*
        Properties
    */

    public String type;

    @JsProperty( name = "type")
    public native String getType();

    @JsProperty( name = "type")
    public native void setType( String value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(matchMedium,27,,P(d1))
      * TE Signature : S(matchMedium,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@648965
     */
    public native Boolean matchMedium(String mediaquery);
}

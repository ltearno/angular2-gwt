package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MediaQueryList
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:520137
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:520356
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MediaQueryList")
public class MediaQueryList
{

    /*
        Constructors
    */
    public MediaQueryList(){
    }

    /*
        Properties
    */

    public Boolean matches;

    @JsProperty( name = "matches")
    public native Boolean getMatches();

    @JsProperty( name = "matches")
    public native void setMatches( Boolean value );

    public String media;

    @JsProperty( name = "media")
    public native String getMedia();

    @JsProperty( name = "media")
    public native void setMedia( String value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(addListener,289,,P(dF--S(?,289,,P(d208))------)))
      * TE Signature : S(addListener,P(dF--S(?,P(d208))------)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@520229
     */
    public native void addListener(MediaQueryListListener listener);
    /** 
      * Std Signature : S(removeListener,289,,P(dF--S(?,289,,P(d208))------)))
      * TE Signature : S(removeListener,P(dF--S(?,P(d208))------)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@520286
     */
    public native void removeListener(MediaQueryListListener listener);
}

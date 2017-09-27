package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: AudioListener
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:289314
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:289619
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="AudioListener")
public class AudioListener
{

    /*
        Constructors
    */
    public AudioListener(){
    }

    /*
        Properties
    */

    public Number dopplerFactor;

    @JsProperty( name = "dopplerFactor")
    public native Number getDopplerFactor();

    @JsProperty( name = "dopplerFactor")
    public native void setDopplerFactor( Number value );

    public Number speedOfSound;

    @JsProperty( name = "speedOfSound")
    public native Number getSpeedOfSound();

    @JsProperty( name = "speedOfSound")
    public native void setSpeedOfSound( Number value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(setOrientation,289,,P(d2),P(d2),P(d2),P(d2),P(d2),P(d2))
      * TE Signature : S(setOrientation,P(d2),P(d2),P(d2),P(d2),P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@289399
     */
    public native void setOrientation(Number x, Number y, Number z, Number xUp, Number yUp, Number zUp);
    /** 
      * Std Signature : S(setPosition,289,,P(d2),P(d2),P(d2))
      * TE Signature : S(setPosition,P(d2),P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@289497
     */
    public native void setPosition(Number x, Number y, Number z);
    /** 
      * Std Signature : S(setVelocity,289,,P(d2),P(d2),P(d2))
      * TE Signature : S(setVelocity,P(d2),P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@289553
     */
    public native void setVelocity(Number x, Number y, Number z);
}

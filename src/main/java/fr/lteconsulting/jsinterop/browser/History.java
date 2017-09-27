package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: History
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:489538
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:489878
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="History")
public class History
{

    /*
        Constructors
    */
    public History(){
    }

    /*
        Properties
    */

    public Number length;

    @JsProperty( name = "length")
    public native Number getLength();

    @JsProperty( name = "length")
    public native void setLength( Number value );

    public String scrollRestoration;

    @JsProperty( name = "scrollRestoration")
    public native String getScrollRestoration();

    @JsProperty( name = "scrollRestoration")
    public native void setScrollRestoration( String value );

    public Object state;

    @JsProperty( name = "state")
    public native Object getState();

    @JsProperty( name = "state")
    public native void setState( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(back,289,,)
      * TE Signature : S(back,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@489660
     */
    public native void back();
    /** 
      * Std Signature : S(forward,289,,)
      * TE Signature : S(forward,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@489678
     */
    public native void forward();
    /** 
      * Std Signature : S(go,289,,)
      * TE Signature : S(go,)
      * 
     */
    public native void go();
    /** 
      * Std Signature : S(go,289,,P(d2))
      * TE Signature : S(go,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@489699
     */
    public native void go(Number delta /* optional */);
    /** 
      * Std Signature : S(pushState,289,,P(d3),P(d1))
      * TE Signature : S(pushState,P(d3),P(d1))
      * 
     */
    public native void pushState(Object data, String title);
    /** 
      * Std Signature : S(pushState,289,,P(d3),P(d1),P(d1))
      * TE Signature : S(pushState,P(d3),P(d1),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@489729
     */
    public native void pushState(Object data, String title, String url /* optional */);
    /** 
      * Std Signature : S(replaceState,289,,P(d3),P(d1))
      * TE Signature : S(replaceState,P(d3),P(d1))
      * 
     */
    public native void replaceState(Object data, String title);
    /** 
      * Std Signature : S(replaceState,289,,P(d3),P(d1),P(d1))
      * TE Signature : S(replaceState,P(d3),P(d1),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@489797
     */
    public native void replaceState(Object data, String title, String url /* optional */);
}

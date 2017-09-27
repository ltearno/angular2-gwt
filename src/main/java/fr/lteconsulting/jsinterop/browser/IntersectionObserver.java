package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: IntersectionObserver
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:497322
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:497620
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="IntersectionObserver")
public class IntersectionObserver
{

    /*
        Constructors
    */
    public IntersectionObserver(IntersectionObserverCallback callback, IntersectionObserverInit options){
    }

    /*
        Properties
    */

    public Element root;

    @JsProperty( name = "root")
    public native Element getRoot();

    @JsProperty( name = "root")
    public native void setRoot( Element value );

    public String rootMargin;

    @JsProperty( name = "rootMargin")
    public native String getRootMargin();

    @JsProperty( name = "rootMargin")
    public native void setRootMargin( String value );

    public Array<Number> thresholds;

    @JsProperty( name = "thresholds")
    public native Array<Number> getThresholds();

    @JsProperty( name = "thresholds")
    public native void setThresholds( Array<Number> value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(disconnect,289,,)
      * TE Signature : S(disconnect,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@497464
     */
    public native void disconnect();
    /** 
      * Std Signature : S(observe,289,,P(d49))
      * TE Signature : S(observe,P(d49))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@497488
     */
    public native void observe(Element target);
    /** 
      * Std Signature : S(takeRecords,7<557>,,)
      * TE Signature : S(takeRecords,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@497524
     */
    public native Array<IntersectionObserverEntry> takeRecords();
    /** 
      * Std Signature : S(unobserve,289,,P(d49))
      * TE Signature : S(unobserve,P(d49))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@497572
     */
    public native void unobserve(Element target);
}

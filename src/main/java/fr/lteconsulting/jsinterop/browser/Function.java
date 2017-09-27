package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: Function
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:8924
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:10635
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:198510
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:247968
  * 1 constructors
  * Creates a new function.
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Function")
public class Function
{

    /*
        Constructors
    */
    public Function(String args){
    }

    /*
        Properties
    */

    public Object arguments;

    @JsProperty( name = "arguments")
    public native Object getArguments();

    @JsProperty( name = "arguments")
    public native void setArguments( Object value );

    public Function caller;

    @JsProperty( name = "caller")
    public native Function getCaller();

    @JsProperty( name = "caller")
    public native void setCaller( Function value );

    public Number length;

    @JsProperty( name = "length")
    public native Number getLength();

    @JsProperty( name = "length")
    public native void setLength( Number value );

    /** 
      * Returns the name of the function. Function names are read-only and can not be changed.
     */
    public String name;

    @JsProperty( name = "name")
    public native String getName();

    @JsProperty( name = "name")
    public native void setName( String value );

    public Object prototype;

    @JsProperty( name = "prototype")
    public native Object getPrototype();

    @JsProperty( name = "prototype")
    public native void setPrototype( Object value );

    /*
        Methods
    */
    // skipped method __@hasInstance
    /** 
      * Std Signature : S(apply,3,,)
      * TE Signature : S(apply,)
      * 
     */
    public native Object apply();
    /** 
      * Std Signature : S(apply,3,,P(d3))
      * TE Signature : S(apply,P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@9300
      * Calls the function, substituting the specified object for the this value of the function, and the specified array for the arguments of the function.
     */
    public native Object apply(Object argArray /* optional */);
    /** 
      * Std Signature : S(bind,3,,)
      * TE Signature : S(bind,)
      * 
     */
    public native Object bind();
    /** 
      * Std Signature : S(bind,3,,P(D3))
      * TE Signature : S(bind,P(D3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@10097
      * For a given function, creates a bound function that has the same body as the original function.
      * The this object of the bound function is associated with the specified object, and has the specified initial parameters.
     */
    public native Object bind(Object... argArray);
    /** 
      * Std Signature : S(call,3,,)
      * TE Signature : S(call,)
      * 
     */
    public native Object call();
    /** 
      * Std Signature : S(call,3,,P(D3))
      * TE Signature : S(call,P(D3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@9609
      * Calls a method of an object, substituting another object for the current object.
     */
    public native Object call(Object... argArray);
}

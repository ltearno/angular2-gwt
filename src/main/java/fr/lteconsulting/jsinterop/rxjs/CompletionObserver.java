package fr.lteconsulting.jsinterop.rxjs;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/Observer".CompletionObserver
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/Observer.d.ts:296
  * 
 */
@JsType(isNative=true, namespace="rxjs", name="CompletionObserver")
public class CompletionObserver<T>
{

    /*
        Properties
    */

    public Boolean closed;

    @JsProperty( name = "closed")
    public native Boolean getClosed();

    @JsProperty( name = "closed")
    public native void setClosed( Boolean value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(complete,429,,)
      * TE Signature : S(complete,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/Observer.d.ts@437
     */
    public native void complete();
    /** 
      * Std Signature : S(error,429,,P(d3))
      * TE Signature : S(error,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/Observer.d.ts@403
     */
    public native void error(Object err);
    /** 
      * Std Signature : S(next,429,,P(dT-))
      * TE Signature : S(next,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/Observer.d.ts@371
     */
    public native void next(T value);
}

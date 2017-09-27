package fr.lteconsulting.jsinterop.rxjs;

import fr.lteconsulting.prebuilt.Action;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/rxjs/util/AnimationFrame".RequestAnimationFrameDefinition
  * flags: 32768
  * declared in: apis/angular4-api/tsd/rxjs/util/AnimationFrame.d.ts:0
  * 1 constructors
 */
@JsType(isNative=true, namespace="rxjs", name="RequestAnimationFrameDefinition")
public class RequestAnimationFrameDefinition
{

    /*
        Constructors
    */
    public RequestAnimationFrameDefinition(Object root){
    }

    /*
        Methods
    */
    /** 
      * Std Signature : S(cancelAnimationFrame,429,,P(d2))
      * TE Signature : S(cancelAnimationFrame,P(d2))
      * 
     */
    /** 
      * apis/angular4-api/tsd/rxjs/util/AnimationFrame.d.ts@81
     */
    public native void cancelAnimationFrame(Number handle);
    /** 
      * Std Signature : S(requestAnimationFrame,2,,P(dF--S(?,429,,)------)))
      * TE Signature : S(requestAnimationFrame,P(dF--S(?,)------)))
      * 
     */
    /** 
      * apis/angular4-api/tsd/rxjs/util/AnimationFrame.d.ts@134
     */
    public native Number requestAnimationFrame(Action cb);
}

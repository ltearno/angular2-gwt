package fr.lteconsulting.jsinterop.rxjs;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/zip".ZipOperator
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/zip.d.ts:5430
  * 1 constructors
 */
@JsType(isNative=true, namespace="rxjs", name="ZipOperator")
public class ZipOperator<T, R> extends Operator<T, R>
{

    /*
        Constructors
    */
    public ZipOperator(Function1<Object, R> project){
    }

    /*
        Methods
    */
    /** 
      * Std Signature : S(project,R-,,)
      * TE Signature : S(project,)
      * 
     */
    public native R project();
    /** 
      * Std Signature : S(project,R-,,P(D3))
      * TE Signature : S(project,P(D3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/zip.d.ts@5511
     */
    public native R project(Object... values);
}

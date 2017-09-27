package fr.lteconsulting.jsinterop.rxjs;

import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/observable/dom/AjaxObservable".AjaxCreationMethod
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/observable/dom/AjaxObservable.d.ts:531
  * 
 */
@JsType(isNative=true, namespace="rxjs", name="AjaxCreationMethod")
public class AjaxCreationMethod
{
    /** SKIPPED CALL SIGNATURE ! */

    /*
        Methods
    */
    /** 
      * Std Signature : S(delete,357<821>,,P(d1))
      * TE Signature : S(delete,P(d1))
      * 
     */
    public native Observable<AjaxResponse> delete(String url);
    /** 
      * Std Signature : S(delete,357<821>,,P(d1),P(d3))
      * TE Signature : S(delete,P(d1),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/observable/dom/AjaxObservable.d.ts@945
     */
    public native Observable<AjaxResponse> delete(String url, Object headers /* optional */);
    /** 
      * Std Signature : S(get,357<821>,,P(d1))
      * TE Signature : S(get,P(d1))
      * 
     */
    public native Observable<AjaxResponse> get(String url);
    /** 
      * Std Signature : S(get,357<821>,,P(d1),P(d3))
      * TE Signature : S(get,P(d1),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/observable/dom/AjaxObservable.d.ts@642
     */
    public native Observable<AjaxResponse> get(String url, Object headers /* optional */);
    /** 
      * Std Signature : S(getJSON,357<T->,T-,P(d1))
      * TE Signature : S(getJSON,P(d1))
      * 
     */
    public native <T> Observable<T> getJSON(String url);
    /** 
      * Std Signature : S(getJSON,357<T->,T-,P(d1),P(d3))
      * TE Signature : S(getJSON,P(d1),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/observable/dom/AjaxObservable.d.ts@1014
     */
    public native <T> Observable<T> getJSON(String url, Object headers /* optional */);
    /** 
      * Std Signature : S(patch,357<821>,,P(d1))
      * TE Signature : S(patch,P(d1))
      * 
     */
    public native Observable<AjaxResponse> patch(String url);
    /** 
      * Std Signature : S(patch,357<821>,,P(d1),P(d3))
      * TE Signature : S(patch,P(d1),P(d3))
      * 
     */
    public native Observable<AjaxResponse> patch(String url, Object body /* optional */);
    /** 
      * Std Signature : S(patch,357<821>,,P(d1),P(d3),P(d3))
      * TE Signature : S(patch,P(d1),P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/observable/dom/AjaxObservable.d.ts@865
     */
    public native Observable<AjaxResponse> patch(String url, Object body /* optional */, Object headers /* optional */);
    /** 
      * Std Signature : S(post,357<821>,,P(d1))
      * TE Signature : S(post,P(d1))
      * 
     */
    public native Observable<AjaxResponse> post(String url);
    /** 
      * Std Signature : S(post,357<821>,,P(d1),P(d3))
      * TE Signature : S(post,P(d1),P(d3))
      * 
     */
    public native Observable<AjaxResponse> post(String url, Object body /* optional */);
    /** 
      * Std Signature : S(post,357<821>,,P(d1),P(d3),P(d3))
      * TE Signature : S(post,P(d1),P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/observable/dom/AjaxObservable.d.ts@708
     */
    public native Observable<AjaxResponse> post(String url, Object body /* optional */, Object headers /* optional */);
    /** 
      * Std Signature : S(put,357<821>,,P(d1))
      * TE Signature : S(put,P(d1))
      * 
     */
    public native Observable<AjaxResponse> put(String url);
    /** 
      * Std Signature : S(put,357<821>,,P(d1),P(d3))
      * TE Signature : S(put,P(d1),P(d3))
      * 
     */
    public native Observable<AjaxResponse> put(String url, Object body /* optional */);
    /** 
      * Std Signature : S(put,357<821>,,P(d1),P(d3),P(d3))
      * TE Signature : S(put,P(d1),P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/observable/dom/AjaxObservable.d.ts@787
     */
    public native Observable<AjaxResponse> put(String url, Object body /* optional */, Object headers /* optional */);
}

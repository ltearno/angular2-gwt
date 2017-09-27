package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: IDBFactory
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:491861
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:492054
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="IDBFactory")
public class IDBFactory
{

    /*
        Constructors
    */
    public IDBFactory(){
    }

    /*
        Methods
    */
    /** 
      * Std Signature : S(cmp,2,,P(d3),P(d3))
      * TE Signature : S(cmp,P(d3),P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@491890
     */
    public native Number cmp(Object first, Object second);
    /** 
      * Std Signature : S(deleteDatabase,463,,P(d1))
      * TE Signature : S(deleteDatabase,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@491932
     */
    public native IDBOpenDBRequest deleteDatabase(String name);
    /** 
      * Std Signature : S(open,463,,P(d1))
      * TE Signature : S(open,P(d1))
      * 
     */
    public native IDBOpenDBRequest open(String name);
    /** 
      * Std Signature : S(open,463,,P(d1),P(d2))
      * TE Signature : S(open,P(d1),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@491984
     */
    public native IDBOpenDBRequest open(String name, Number version /* optional */);
}

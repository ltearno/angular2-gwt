package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.browser.UnionOfPromiseOfStringAndString;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/resource_loader".ResourceLoader
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/resource_loader.d.ts:0

  * An interface for retrieving documents by URL that the compiler uses
  * to load templates.
 */
@JsType(isNative=true, namespace="ng.compiler", name="ResourceLoader")
public class ResourceLoader
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(get,U(-88<1>,4),,P(d1))
      * TE Signature : S(get,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/resource_loader.d.ts@346
     */
    public native UnionOfPromiseOfStringAndString get(String url);
}

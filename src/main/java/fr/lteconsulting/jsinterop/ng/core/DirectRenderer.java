package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api".DirectRenderer
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api.d.ts:1131
  * 
 */
@JsType(isNative=true, namespace="ng.core", name="DirectRenderer")
public class DirectRenderer
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(appendChild,429,,P(d3),P(d3))
      * TE Signature : S(appendChild,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api.d.ts@1251
     */
    public native void appendChild(Object node, Object parent);
    /** 
      * Std Signature : S(insertBefore,429,,P(d3),P(d3))
      * TE Signature : S(insertBefore,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api.d.ts@1298
     */
    public native void insertBefore(Object node, Object refNode);
    /** 
      * Std Signature : S(nextSibling,3,,P(d3))
      * TE Signature : S(nextSibling,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api.d.ts@1347
     */
    public native Object nextSibling(Object node);
    /** 
      * Std Signature : S(parentElement,3,,P(d3))
      * TE Signature : S(parentElement,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api.d.ts@1380
     */
    public native Object parentElement(Object node);
    /** 
      * Std Signature : S(remove,429,,P(d3))
      * TE Signature : S(remove,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api.d.ts@1222
     */
    public native void remove(Object node);
}

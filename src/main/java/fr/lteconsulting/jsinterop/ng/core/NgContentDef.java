package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types".NgContentDef
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts:8487
  * 
 */
@JsType(isNative=true, namespace="ng.core", name="NgContentDef")
public class NgContentDef
{

    /*
        Properties
    */

    /** 
      * this index is checked against NodeDef.ngContentIndex to find the nodes
      * that are matched by this ng-content.
      * Note that a NodeDef with an ng-content can be reprojected, i.e.
      * have a ngContentIndex on its own.
     */
    public Number index;

    @JsProperty( name = "index")
    public native Number getIndex();

    @JsProperty( name = "index")
    public native void setIndex( Number value );
}

package fr.lteconsulting.jsinterop.ng.router;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router_state".RouterStateSnapshot
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router_state.d.ts:5541
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.router", name="RouterStateSnapshot")
public class RouterStateSnapshot extends Tree<ActivatedRouteSnapshot>
{

    /*
        Constructors
    */
    public RouterStateSnapshot(TreeNode<ActivatedRouteSnapshot> root){
        super(null);
    }

    /*
        Properties
    */

    /** 
      * The url from which this snapshot was created 
     */
    public String url;

    @JsProperty( name = "url")
    public native String getUrl();

    @JsProperty( name = "url")
    public native void setUrl( String value );
}

package fr.lteconsulting.jsinterop.ng.router;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router_state".RouterState
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router_state.d.ts:458
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.router", name="RouterState")
public class RouterState extends Tree<ActivatedRoute>
{

    /*
        Constructors
    */
    public RouterState(TreeNode<ActivatedRoute> root){
        super(null);
    }

    /*
        Properties
    */

    /** 
      * The current snapshot of the router state 
     */
    public RouterStateSnapshot snapshot;

    @JsProperty( name = "snapshot")
    public native RouterStateSnapshot getSnapshot();

    @JsProperty( name = "snapshot")
    public native void setSnapshot( RouterStateSnapshot value );
}

package fr.lteconsulting.jsinterop.ng.router;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/utils/tree".Tree
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/utils/tree.d.ts:0
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.router", name="Tree")
public class Tree<T>
{

    /*
        Constructors
    */
    public Tree(TreeNode<T> root){
    }

    /*
        Properties
    */

    public T root;

    @JsProperty( name = "root")
    public native T getRoot();

    @JsProperty( name = "root")
    public native void setRoot( T value );
}

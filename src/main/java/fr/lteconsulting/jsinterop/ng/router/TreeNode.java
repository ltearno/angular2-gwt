package fr.lteconsulting.jsinterop.ng.router;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/utils/tree".TreeNode
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/utils/tree.d.ts:293
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.router", name="TreeNode")
public class TreeNode<T>
{

    /*
        Constructors
    */
    public TreeNode(T value, Array<TreeNode<T>> children){
    }

    /*
        Properties
    */

    public Array<TreeNode<T>> children;

    @JsProperty( name = "children")
    public native Array<TreeNode<T>> getChildren();

    @JsProperty( name = "children")
    public native void setChildren( Array<TreeNode<T>> value );

    public T value;

    @JsProperty( name = "value")
    public native T getValue();

    @JsProperty( name = "value")
    public native void setValue( T value );
}

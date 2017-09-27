package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * base type: NodeList
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:535455
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:535579
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:784601
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="NodeList")
public class NodeList
{

    /*
        Constructors
    */
    public NodeList(){
    }

    @JsOverlay
    public final void setByIndex(int index, Node value) {
        Js.asArrayLike(this).setAt(index, value);
    }

    @JsOverlay
    public final Node getByIndex(int index) {
        return (Node) Js.asArrayLike(this).getAt(index);
    }

    /*
        Properties
    */

    public Number length;

    @JsProperty( name = "length")
    public native Number getLength();

    @JsProperty( name = "length")
    public native void setLength( Number value );

    /*
        Methods
    */
    // skipped method __@iterator
    /** 
      * Std Signature : S(item,86,,P(d2))
      * TE Signature : S(item,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@535511
     */
    public native Node item(Number index);
}

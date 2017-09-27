package fr.lteconsulting.jsinterop.ng.compiler.i18n;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.ng.compiler.ParseSourceSpan;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/i18n/i18n_ast".Container
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/i18n/i18n_ast.d.ts:1468
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.i18n", name="Container")
public class Container extends Node
{

    /*
        Constructors
    */
    public Container(Array<Node> children, ParseSourceSpan sourceSpan){
    }

    /*
        Properties
    */

    public Array<Node> children;

    @JsProperty( name = "children")
    public native Array<Node> getChildren();

    @JsProperty( name = "children")
    public native void setChildren( Array<Node> value );
}

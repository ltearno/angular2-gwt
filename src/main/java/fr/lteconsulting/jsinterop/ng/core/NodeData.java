package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types".NodeData
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts:9764

  * Node instance data.
  * 
  * We have a separate type per NodeType to save memory
  * (TextData | ElementData | ProviderData | PureExpressionData | QueryList<any>)
  * 
  * To keep our code monomorphic,
  * we prohibit using `NodeData` directly but enforce the use of accessors (`asElementData`, ...).
  * This way, no usage site can get a `NodeData` from view.nodes and then use it for different
  * purposes.
 */
@JsType(isNative=true, namespace="ng.core", name="NodeData")
public class NodeData
{

    /*
        Properties
    */

    public Object ___brand;

    @JsProperty( name = "___brand")
    public native Object get___brand();

    @JsProperty( name = "___brand")
    public native void set___brand( Object value );
}

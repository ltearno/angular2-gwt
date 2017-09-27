package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types".PureExpressionData
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts:11542

  * Data for an instantiated NodeType.PureExpression.
  * 
  * Attention: Adding fields to this is performance sensitive!
 */
@JsType(isNative=true, namespace="ng.core", name="PureExpressionData")
public class PureExpressionData
{

    /*
        Properties
    */

    public Object value;

    @JsProperty( name = "value")
    public native Object getValue();

    @JsProperty( name = "value")
    public native void setValue( Object value );
}

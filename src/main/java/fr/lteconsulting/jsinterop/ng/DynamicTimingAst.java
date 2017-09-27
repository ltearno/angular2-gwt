package fr.lteconsulting.jsinterop.ng;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_ast".DynamicTimingAst
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_ast.d.ts:4368
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng", name="DynamicTimingAst")
public class DynamicTimingAst extends TimingAst
{

    /*
        Constructors
    */
    public DynamicTimingAst(String value){
        super(null, null, null);
    }

    /*
        Properties
    */

    public String value;

    @JsProperty( name = "value")
    public native String getValue();

    @JsProperty( name = "value")
    public native void setValue( String value );
}

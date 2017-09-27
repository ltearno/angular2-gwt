package fr.lteconsulting.jsinterop.ng;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_ast".QueryAst
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_ast.d.ts:3577
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng", name="QueryAst")
public class QueryAst extends Ast
{

    /*
        Constructors
    */
    public QueryAst(String selector, Number limit, Boolean optional, Boolean includeSelf, Ast animation){
    }

    /*
        Properties
    */

    public Ast animation;

    @JsProperty( name = "animation")
    public native Ast getAnimation();

    @JsProperty( name = "animation")
    public native void setAnimation( Ast value );

    public Boolean includeSelf;

    @JsProperty( name = "includeSelf")
    public native Boolean getIncludeSelf();

    @JsProperty( name = "includeSelf")
    public native void setIncludeSelf( Boolean value );

    public Number limit;

    @JsProperty( name = "limit")
    public native Number getLimit();

    @JsProperty( name = "limit")
    public native void setLimit( Number value );

    public Boolean optional;

    @JsProperty( name = "optional")
    public native Boolean getOptional();

    @JsProperty( name = "optional")
    public native void setOptional( Boolean value );

    public String originalSelector;

    @JsProperty( name = "originalSelector")
    public native String getOriginalSelector();

    @JsProperty( name = "originalSelector")
    public native void setOriginalSelector( String value );

    public String selector;

    @JsProperty( name = "selector")
    public native String getSelector();

    @JsProperty( name = "selector")
    public native void setSelector( String value );
}

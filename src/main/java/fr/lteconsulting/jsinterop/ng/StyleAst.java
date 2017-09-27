package fr.lteconsulting.jsinterop.ng;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_ast".StyleAst
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_ast.d.ts:2619
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng", name="StyleAst")
public class StyleAst extends Ast
{

    /*
        Constructors
    */
    public StyleAst(Array<UnionOfStringAndThetaStyleData> styles, String easing, Number offset){
    }

    /*
        Properties
    */

    public Boolean containsDynamicStyles;

    @JsProperty( name = "containsDynamicStyles")
    public native Boolean getContainsDynamicStyles();

    @JsProperty( name = "containsDynamicStyles")
    public native void setContainsDynamicStyles( Boolean value );

    public String easing;

    @JsProperty( name = "easing")
    public native String getEasing();

    @JsProperty( name = "easing")
    public native void setEasing( String value );

    public Boolean isEmptyStep;

    @JsProperty( name = "isEmptyStep")
    public native Boolean getIsEmptyStep();

    @JsProperty( name = "isEmptyStep")
    public native void setIsEmptyStep( Boolean value );

    public Number offset;

    @JsProperty( name = "offset")
    public native Number getOffset();

    @JsProperty( name = "offset")
    public native void setOffset( Number value );

    public Array<UnionOfStringAndThetaStyleData> styles;

    @JsProperty( name = "styles")
    public native Array<UnionOfStringAndThetaStyleData> getStyles();

    @JsProperty( name = "styles")
    public native void setStyles( Array<UnionOfStringAndThetaStyleData> value );
}

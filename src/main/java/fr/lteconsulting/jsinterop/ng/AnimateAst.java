package fr.lteconsulting.jsinterop.ng;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_ast".AnimateAst
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_ast.d.ts:2391
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng", name="AnimateAst")
public class AnimateAst extends Ast
{

    /*
        Constructors
    */
    public AnimateAst(TimingAst timings, UnionOfKeyframesAstAndStyleAst style){
    }

    /*
        Properties
    */

    public UnionOfKeyframesAstAndStyleAst style;

    @JsProperty( name = "style")
    public native UnionOfKeyframesAstAndStyleAst getStyle();

    @JsProperty( name = "style")
    public native void setStyle( UnionOfKeyframesAstAndStyleAst value );

    @JsOverlay
    public final void setStyle( KeyframesAst value ) { setStyle(UnionOfKeyframesAstAndStyleAst.ofKeyframesAst( value )); }

    @JsOverlay
    public final void setStyle( StyleAst value ) { setStyle(UnionOfKeyframesAstAndStyleAst.ofStyleAst( value )); }

    public TimingAst timings;

    @JsProperty( name = "timings")
    public native TimingAst getTimings();

    @JsProperty( name = "timings")
    public native void setTimings( TimingAst value );
}

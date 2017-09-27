package fr.lteconsulting.jsinterop.ng;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public abstract class UnionOfKeyframesAstAndStyleAst extends Ast  {
    @JsOverlay
    public final KeyframesAst asKeyframesAst() {
        return Js.uncheckedCast( this );
    }
    
    @JsOverlay
    public static  UnionOfKeyframesAstAndStyleAst ofKeyframesAst(KeyframesAst value) {
        return Js.uncheckedCast( value );
    }
    
    @JsOverlay
    public final StyleAst asStyleAst() {
        return Js.uncheckedCast( this );
    }
    
    @JsOverlay
    public static  UnionOfKeyframesAstAndStyleAst ofStyleAst(StyleAst value) {
        return Js.uncheckedCast( value );
    }
    
}

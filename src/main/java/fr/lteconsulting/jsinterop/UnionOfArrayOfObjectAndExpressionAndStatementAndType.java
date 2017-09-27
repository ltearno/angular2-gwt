package fr.lteconsulting.jsinterop;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.ng.compiler.output.Expression;
import fr.lteconsulting.jsinterop.ng.compiler.output.Statement;
import fr.lteconsulting.jsinterop.ng.compiler.output.Type;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface UnionOfArrayOfObjectAndExpressionAndStatementAndType  {
    @JsOverlay
    default Array<Object> asArrayOfObject() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfArrayOfObjectAndExpressionAndStatementAndType ofArrayOfObject(Array<Object> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Expression asExpression() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfArrayOfObjectAndExpressionAndStatementAndType ofExpression(Expression value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Statement asStatement() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfArrayOfObjectAndExpressionAndStatementAndType ofStatement(Statement value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Type asType() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfArrayOfObjectAndExpressionAndStatementAndType ofType(Type value) {
        return Js.cast( value );
    }
    
}

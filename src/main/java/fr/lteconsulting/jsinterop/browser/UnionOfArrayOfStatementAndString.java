package fr.lteconsulting.jsinterop.browser;

import fr.lteconsulting.jsinterop.ng.compiler.output.Statement;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface UnionOfArrayOfStatementAndString  {
    @JsOverlay
    default Array<Statement> asArrayOfStatement() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfArrayOfStatementAndString ofArrayOfStatement(Array<Statement> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default String asString() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfArrayOfStatementAndString ofString(String value) {
        return Js.cast( value );
    }
    
}

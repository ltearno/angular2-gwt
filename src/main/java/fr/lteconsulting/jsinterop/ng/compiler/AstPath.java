package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/ast_path".AstPath
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/ast_path.d.ts:0
  * 1 constructors
  * A path is an ordered set of elements. Typically a path is to  a
  * particular offset in a source file. The head of the list is the top
  * most node. The tail is the node that contains the offset directly.
  * 
  * For example, the expresion `a + b + c` might have an ast that looks
  * like:
  *      +
  *     / \
  *    a   +
  *       / \
  *      b   c
  * 
  * The path to the node at offset 9 would be `['+' at 1-10, '+' at 7-10,
  * 'c' at 9-10]` and the path the node at offset 1 would be
  * `['+' at 1-10, 'a' at 1-2]`.
 */
@JsType(isNative=true, namespace="ng.compiler", name="AstPath")
public class AstPath<T>
{

    /*
        Constructors
    */
    public AstPath(Array<T> path, Number position){
    }

    /*
        Properties
    */

    public Boolean empty;

    @JsProperty( name = "empty")
    public native Boolean getEmpty();

    @JsProperty( name = "empty")
    public native void setEmpty( Boolean value );

    public T head;

    @JsProperty( name = "head")
    public native T getHead();

    @JsProperty( name = "head")
    public native void setHead( T value );

    public Object path;

    @JsProperty( name = "path")
    public native Object getPath();

    @JsProperty( name = "path")
    public native void setPath( Object value );

    public Number position;

    @JsProperty( name = "position")
    public native Number getPosition();

    @JsProperty( name = "position")
    public native void setPosition( Number value );

    public T tail;

    @JsProperty( name = "tail")
    public native T getTail();

    @JsProperty( name = "tail")
    public native void setTail( T value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(childOf,T-,,P(dT-))
      * TE Signature : S(childOf,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/ast_path.d.ts@997
     */
    public native T childOf(T node);
    /** 
      * Std Signature : S(first,N-,N-,P(d3))
      * TE Signature : S(first,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/ast_path.d.ts@1034
     */
    public native <N> N first(Object ctor);
    /** 
      * Std Signature : S(parentOf,T-,,P(dT-))
      * TE Signature : S(parentOf,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/ast_path.d.ts@947
     */
    public native T parentOf(T node);
    /** 
      * Std Signature : S(pop,T-,,)
      * TE Signature : S(pop,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/ast_path.d.ts@1146
     */
    public native T pop();
    /** 
      * Std Signature : S(push,429,,P(dT-))
      * TE Signature : S(push,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/ast_path.d.ts@1121
     */
    public native void push(T node);
}

package fr.lteconsulting.jsinterop.ng.compiler.output;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.ng.compiler.ParseSourceSpan;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast".ClassStmt
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts:15546
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.output", name="ClassStmt")
public class ClassStmt extends Statement
{

    /*
        Constructors
    */
    public ClassStmt(String name, Expression parent, Array<ClassField> fields, Array<ClassGetter> getters, ClassMethod constructorMethod, Array<ClassMethod> methods, Array<StmtModifier> modifiers, ParseSourceSpan sourceSpan){
        super(null, null);
    }

    /*
        Properties
    */

    public ClassMethod constructorMethod;

    @JsProperty( name = "constructorMethod")
    public native ClassMethod getConstructorMethod();

    @JsProperty( name = "constructorMethod")
    public native void setConstructorMethod( ClassMethod value );

    public Array<ClassField> fields;

    @JsProperty( name = "fields")
    public native Array<ClassField> getFields();

    @JsProperty( name = "fields")
    public native void setFields( Array<ClassField> value );

    public Array<ClassGetter> getters;

    @JsProperty( name = "getters")
    public native Array<ClassGetter> getGetters();

    @JsProperty( name = "getters")
    public native void setGetters( Array<ClassGetter> value );

    public Array<ClassMethod> methods;

    @JsProperty( name = "methods")
    public native Array<ClassMethod> getMethods();

    @JsProperty( name = "methods")
    public native void setMethods( Array<ClassMethod> value );

    public String name;

    @JsProperty( name = "name")
    public native String getName();

    @JsProperty( name = "name")
    public native void setName( String value );

    public Expression parent;

    @JsProperty( name = "parent")
    public native Expression getParent();

    @JsProperty( name = "parent")
    public native void setParent( Expression value );
}

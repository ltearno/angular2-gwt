package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.ng.compiler.expression.parse.ASTWithSource;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/compiler/src/template_parser/binding_parser".BoundProperty
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/compiler/src/template_parser/binding_parser.d.ts:875
  * 1 constructors
  * Represents a parsed property.
 */
@JsType(isNative=true, namespace="ng.compiler", name="BoundProperty")
public class BoundProperty
{

    /*
        Constructors
    */
    public BoundProperty(String name, ASTWithSource expression, BoundPropertyType type, ParseSourceSpan sourceSpan){
    }

    /*
        Properties
    */

    public ASTWithSource expression;

    @JsProperty( name = "expression")
    public native ASTWithSource getExpression();

    @JsProperty( name = "expression")
    public native void setExpression( ASTWithSource value );

    public Boolean isAnimation;

    @JsProperty( name = "isAnimation")
    public native Boolean getIsAnimation();

    @JsProperty( name = "isAnimation")
    public native void setIsAnimation( Boolean value );

    public Boolean isLiteral;

    @JsProperty( name = "isLiteral")
    public native Boolean getIsLiteral();

    @JsProperty( name = "isLiteral")
    public native void setIsLiteral( Boolean value );

    public String name;

    @JsProperty( name = "name")
    public native String getName();

    @JsProperty( name = "name")
    public native void setName( String value );

    public ParseSourceSpan sourceSpan;

    @JsProperty( name = "sourceSpan")
    public native ParseSourceSpan getSourceSpan();

    @JsProperty( name = "sourceSpan")
    public native void setSourceSpan( ParseSourceSpan value );

    public BoundPropertyType type;

    @JsProperty( name = "type")
    public native BoundPropertyType getType();

    @JsProperty( name = "type")
    public native void setType( BoundPropertyType value );
}

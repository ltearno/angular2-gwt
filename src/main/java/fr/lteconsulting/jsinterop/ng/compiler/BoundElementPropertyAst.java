package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.ng.compiler.expression.parse.AST;
import fr.lteconsulting.jsinterop.ng.core.SecurityContext;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/template_parser/template_ast".BoundElementPropertyAst
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/template_parser/template_ast.d.ts:1879
  * 1 constructors
  * A binding for an element property (e.g. `[property]="expression"`) or an animation trigger (e.g.
  * `[@trigger]="stateExp"`)
 */
@JsType(isNative=true, namespace="ng.compiler", name="BoundElementPropertyAst")
public class BoundElementPropertyAst extends TemplateAst
{

    /*
        Constructors
    */
    public BoundElementPropertyAst(String name, PropertyBindingType type, SecurityContext securityContext, AST value, String unit, ParseSourceSpan sourceSpan){
    }

    /*
        Properties
    */

    public Boolean isAnimation;

    @JsProperty( name = "isAnimation")
    public native Boolean getIsAnimation();

    @JsProperty( name = "isAnimation")
    public native void setIsAnimation( Boolean value );

    public String name;

    @JsProperty( name = "name")
    public native String getName();

    @JsProperty( name = "name")
    public native void setName( String value );

    public SecurityContext securityContext;

    @JsProperty( name = "securityContext")
    public native SecurityContext getSecurityContext();

    @JsProperty( name = "securityContext")
    public native void setSecurityContext( SecurityContext value );

    public PropertyBindingType type;

    @JsProperty( name = "type")
    public native PropertyBindingType getType();

    @JsProperty( name = "type")
    public native void setType( PropertyBindingType value );

    public String unit;

    @JsProperty( name = "unit")
    public native String getUnit();

    @JsProperty( name = "unit")
    public native void setUnit( String value );

    public AST value;

    @JsProperty( name = "value")
    public native AST getValue();

    @JsProperty( name = "value")
    public native void setValue( AST value );
}

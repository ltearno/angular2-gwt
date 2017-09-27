package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.ng.compiler.expression.parse.AST;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/template_parser/template_ast".BoundEventAst
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/template_parser/template_ast.d.ts:2496
  * 1 constructors
  * A binding for an element event (e.g. `(event)="handler()"`) or an animation trigger event (e.g.
  * `(@trigger.phase)="callback($event)"`).
 */
@JsType(isNative=true, namespace="ng.compiler", name="BoundEventAst")
public class BoundEventAst extends TemplateAst
{

    /*
        Constructors
    */
    public BoundEventAst(String name, String target, String phase, AST handler, ParseSourceSpan sourceSpan){
    }

    /*
        Static methods
    */
    /** 
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/template_parser/template_ast.d.ts:2833
     */
    @JsMethod(namespace="ng.compiler.BoundEventAst", name = "calcFullName")
    public static native String calcFullName(String name, String target, String phase);

    /*
        Properties
    */

    public String fullName;

    @JsProperty( name = "fullName")
    public native String getFullName();

    @JsProperty( name = "fullName")
    public native void setFullName( String value );

    public AST handler;

    @JsProperty( name = "handler")
    public native AST getHandler();

    @JsProperty( name = "handler")
    public native void setHandler( AST value );

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

    public String phase;

    @JsProperty( name = "phase")
    public native String getPhase();

    @JsProperty( name = "phase")
    public native void setPhase( String value );

    public String target;

    @JsProperty( name = "target")
    public native String getTarget();

    @JsProperty( name = "target")
    public native void setTarget( String value );
}

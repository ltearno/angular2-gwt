package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.ng.core.Directive;
import fr.lteconsulting.jsinterop.ng.core.Type;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/directive_resolver".DirectiveResolver
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/directive_resolver.d.ts:307
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler", name="DirectiveResolver")
public class DirectiveResolver
{

    /*
        Constructors
    */
    public DirectiveResolver(CompileReflector _reflector){
    }

    /*
        Properties
    */

    public Object _reflector;

    @JsProperty( name = "_reflector")
    public native Object get_reflector();

    @JsProperty( name = "_reflector")
    public native void set_reflector( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(_dedupeBindings,3,,P(d3))
      * TE Signature : S(_dedupeBindings,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/directive_resolver.d.ts@828
     */
    public native Object _dedupeBindings(Object bindings);
    /** 
      * Std Signature : S(_extractPublicName,3,,P(d3))
      * TE Signature : S(_extractPublicName,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/directive_resolver.d.ts@791
     */
    public native Object _extractPublicName(Object def);
    /** 
      * Std Signature : S(_merge,3,,P(d3),P(d3),P(d3),P(d3),P(d3),P(d3))
      * TE Signature : S(_merge,P(d3),P(d3),P(d3),P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/directive_resolver.d.ts@867
     */
    public native Object _merge(Object directive, Object inputs, Object outputs, Object host, Object queries, Object directiveType);
    /** 
      * Std Signature : S(_mergeWithPropertyMetadata,3,,P(d3),P(d3),P(d3))
      * TE Signature : S(_mergeWithPropertyMetadata,P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/directive_resolver.d.ts@714
     */
    public native Object _mergeWithPropertyMetadata(Object dm, Object propertyMetadata, Object directiveType);
    /** 
      * Std Signature : S(isDirective,27,,P(d329<3>))
      * TE Signature : S(isDirective,P(d329))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/directive_resolver.d.ts@424
     */
    public native Boolean isDirective(Type<Object> type);
    /** 
      * Std Signature : S(resolve,343,,P(d329<3>))
      * TE Signature : S(resolve,P(d329))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/directive_resolver.d.ts@535
      * Return {@link Directive} for a given `Type`.
     */
    public native Directive resolve(Type<Object> type);
    /** 
      * Std Signature : S(resolve,343,,P(d329<3>),P(d27))
      * TE Signature : S(resolve,P(d329),P(d27))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/directive_resolver.d.ts@576
      * Return {@link Directive} for a given `Type`.
      * VERSION 1
     */
    public native Directive resolve(Type<Object> type, Boolean throwIfNotFound);
}

package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.ng.core.Pipe;
import fr.lteconsulting.jsinterop.ng.core.Type;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/pipe_resolver".PipeResolver
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/pipe_resolver.d.ts:302
  * 1 constructors
  * Resolve a `Type` for {@link Pipe}.
  * 
  * This interface can be overridden by the application developer to create custom behavior.
  * 
  * See {@link Compiler}
 */
@JsType(isNative=true, namespace="ng.compiler", name="PipeResolver")
public class PipeResolver
{

    /*
        Constructors
    */
    public PipeResolver(CompileReflector _reflector){
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
      * Std Signature : S(isPipe,27,,P(d329<3>))
      * TE Signature : S(isPipe,P(d329))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/pipe_resolver.d.ts@582
     */
    public native Boolean isPipe(Type<Object> type);
    /** 
      * Std Signature : S(resolve,345,,P(d329<3>))
      * TE Signature : S(resolve,P(d329))
      * 
     */
    public native Pipe resolve(Type<Object> type);
    /** 
      * Std Signature : S(resolve,345,,P(d329<3>),P(d27))
      * TE Signature : S(resolve,P(d329),P(d27))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/pipe_resolver.d.ts@683
      * Return {@link Pipe} for a given `Type`.
     */
    public native Pipe resolve(Type<Object> type, Boolean throwIfNotFound /* optional */);
}

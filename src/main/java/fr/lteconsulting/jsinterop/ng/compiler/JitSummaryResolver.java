package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.ng.core.Type;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/summary_resolver".JitSummaryResolver
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/summary_resolver.d.ts:775
  * 
 */
@JsType(isNative=true, namespace="ng.compiler", name="JitSummaryResolver")
public class JitSummaryResolver extends SummaryResolver<Type<Object>>
{

    /*
        Properties
    */

    public Object _summaries;

    @JsProperty( name = "_summaries")
    public native Object get_summaries();

    @JsProperty( name = "_summaries")
    public native void set_summaries( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(getImportAs,329<3>,,P(d329<3>))
      * TE Signature : S(getImportAs,P(d329))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/summary_resolver.d.ts@1105
     */
    public native Type<Object> getImportAs(Type<Object> reference);
    /** 
      * Std Signature : S(resolveSummary,569<329<3>>,,P(d329<3>))
      * TE Signature : S(resolveSummary,P(d329))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/summary_resolver.d.ts@987
     */
    public native Summary<Type<Object>> resolveSummary(Type<Object> reference);
}

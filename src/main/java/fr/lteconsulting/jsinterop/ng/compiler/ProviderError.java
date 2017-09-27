package fr.lteconsulting.jsinterop.ng.compiler;

import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/compiler/src/provider_analyzer".ProviderError
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/compiler/src/provider_analyzer.d.ts:564
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler", name="ProviderError")
public class ProviderError extends ParseError
{

    /*
        Constructors
    */
    public ProviderError(String message, ParseSourceSpan span){
        super(null, null, null);
    }
}

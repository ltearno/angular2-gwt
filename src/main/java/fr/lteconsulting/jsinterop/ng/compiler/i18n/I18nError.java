package fr.lteconsulting.jsinterop.ng.compiler.i18n;

import fr.lteconsulting.jsinterop.ng.compiler.ParseError;
import fr.lteconsulting.jsinterop.ng.compiler.ParseSourceSpan;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/i18n/parse_util".I18nError
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/i18n/parse_util.d.ts:263
  * 1 constructors
  * An i18n error.
 */
@JsType(isNative=true, namespace="ng.compiler.i18n", name="I18nError")
public class I18nError extends ParseError
{

    /*
        Constructors
    */
    public I18nError(ParseSourceSpan span, String msg){
        super(null, null, null);
    }
}

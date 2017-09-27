package fr.lteconsulting.jsinterop.ng.compiler.i18n;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/compiler/src/i18n/extractor_merger".ExtractionResult
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/compiler/src/i18n/extractor_merger.d.ts:984
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.i18n", name="ExtractionResult")
public class ExtractionResult
{

    /*
        Constructors
    */
    public ExtractionResult(Array<Message> messages, Array<I18nError> errors){
    }

    /*
        Properties
    */

    public Array<I18nError> errors;

    @JsProperty( name = "errors")
    public native Array<I18nError> getErrors();

    @JsProperty( name = "errors")
    public native void setErrors( Array<I18nError> value );

    public Array<Message> messages;

    @JsProperty( name = "messages")
    public native Array<Message> getMessages();

    @JsProperty( name = "messages")
    public native void setMessages( Array<Message> value );
}

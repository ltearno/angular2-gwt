package fr.lteconsulting.jsinterop.ng.platformBrowser;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/security/dom_sanitization_service".DomSanitizerImpl
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/security/dom_sanitization_service.d.ts:5317
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.platformBrowser", name="DomSanitizerImpl")
public class DomSanitizerImpl extends DomSanitizer
{

    /*
        Constructors
    */
    public DomSanitizerImpl(Object _doc){
    }

    /*
        Properties
    */

    public Object _doc;

    @JsProperty( name = "_doc")
    public native Object get_doc();

    @JsProperty( name = "_doc")
    public native void set_doc( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(checkNotSafeValue,3,,P(d3),P(d3))
      * TE Signature : S(checkNotSafeValue,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/security/dom_sanitization_service.d.ts@5514
     */
    public native Object checkNotSafeValue(Object value, Object expectedType);
}

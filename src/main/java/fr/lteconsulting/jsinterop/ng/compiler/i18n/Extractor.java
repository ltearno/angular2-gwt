package fr.lteconsulting.jsinterop.ng.compiler.i18n;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.Promise;
import fr.lteconsulting.jsinterop.ng.compiler.CompileMetadataResolver;
import fr.lteconsulting.jsinterop.ng.compiler.aot.StaticSymbolResolver;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/i18n/extractor".Extractor
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/i18n/extractor.d.ts:689
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.i18n", name="Extractor")
public class Extractor
{

    /*
        Constructors
    */
    public Extractor(ExtractorHost host, StaticSymbolResolver staticSymbolResolver, MessageBundle messageBundle, CompileMetadataResolver metadataResolver){
    }

    /*
        Static methods
    */
    /** 
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/i18n/extractor.d.ts:1056
     */
    @JsMethod(namespace="ng.compiler.i18n.Extractor", name = "create")
    public static native Object create(ExtractorHost host, String locale);

    /*
        Properties
    */

    public ExtractorHost host;

    @JsProperty( name = "host")
    public native ExtractorHost getHost();

    @JsProperty( name = "host")
    public native void setHost( ExtractorHost value );

    public Object messageBundle;

    @JsProperty( name = "messageBundle")
    public native Object getMessageBundle();

    @JsProperty( name = "messageBundle")
    public native void setMessageBundle( Object value );

    public Object metadataResolver;

    @JsProperty( name = "metadataResolver")
    public native Object getMetadataResolver();

    @JsProperty( name = "metadataResolver")
    public native void setMetadataResolver( Object value );

    public Object staticSymbolResolver;

    @JsProperty( name = "staticSymbolResolver")
    public native Object getStaticSymbolResolver();

    @JsProperty( name = "staticSymbolResolver")
    public native void setStaticSymbolResolver( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(extract,88<606>,,P(d7<1>))
      * TE Signature : S(extract,P(d7))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/i18n/extractor.d.ts@998
     */
    public native Promise<MessageBundle> extract(Array<String> rootFiles);
}

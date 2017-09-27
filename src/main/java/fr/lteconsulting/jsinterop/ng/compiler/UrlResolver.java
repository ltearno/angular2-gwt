package fr.lteconsulting.jsinterop.ng.compiler;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/url_resolver".UrlResolver
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/url_resolver.d.ts:656
  * 1 constructors
  * Used by the {@link Compiler} when resolving HTML and CSS template URLs.
  * 
  * This class can be overridden by the application developer to create custom behavior.
  * 
  * See {@link Compiler}
  * 
  * ## Example
  * 
  * {@example compiler/ts/url_resolver/url_resolver.ts region='url_resolver'}
 */
@JsType(isNative=true, namespace="ng.compiler", name="UrlResolver")
public class UrlResolver
{

    /*
        Constructors
    */
    public UrlResolver(String _packagePrefix){
    }

    /*
        Properties
    */

    public Object _packagePrefix;

    @JsProperty( name = "_packagePrefix")
    public native Object get_packagePrefix();

    @JsProperty( name = "_packagePrefix")
    public native void set_packagePrefix( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(resolve,1,,P(d1),P(d1))
      * TE Signature : S(resolve,P(d1),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/url_resolver.d.ts@1770
      * Resolves the `url` given the `baseUrl`:
      * - when the `url` is null, the `baseUrl` is returned,
      * - if `url` is relative ('path/to/here', './path/to/here'), the resolved url is a combination of
      * `baseUrl` and `url`,
      * - if `url` is absolute (it has a scheme: 'http://', 'https://' or start with '/'), the `url` is
      * returned as is (ignoring the `baseUrl`)
     */
    public native String resolve(String baseUrl, String url);
}

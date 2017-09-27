package fr.lteconsulting.jsinterop.ng.platformBrowser;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.HTMLMetaElement;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/meta".Meta
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/meta.d.ts:322
  * 1 constructors
  * A service that can be used to get and add meta tags.
 */
@JsType(isNative=true, namespace="ng.platformBrowser", name="Meta")
public class Meta
{

    /*
        Constructors
    */
    public Meta(Object _doc){
    }

    /*
        Properties
    */

    public Object _doc;

    @JsProperty( name = "_doc")
    public native Object get_doc();

    @JsProperty( name = "_doc")
    public native void set_doc( Object value );

    public Object _dom;

    @JsProperty( name = "_dom")
    public native Object get_dom();

    @JsProperty( name = "_dom")
    public native void set_dom( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(_containsAttributes,3,,P(d3),P(d3))
      * TE Signature : S(_containsAttributes,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/meta.d.ts@1087
     */
    public native Object _containsAttributes(Object tag, Object elem);
    /** 
      * Std Signature : S(_getOrCreateElement,3,,P(d3))
      * TE Signature : S(_getOrCreateElement,P(d3))
      * 
     */
    public native Object _getOrCreateElement(Object meta);
    /** 
      * Std Signature : S(_getOrCreateElement,3,,P(d3),P(d3))
      * TE Signature : S(_getOrCreateElement,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/meta.d.ts@951
     */
    public native Object _getOrCreateElement(Object meta, Object forceCreation /* optional */);
    /** 
      * Std Signature : S(_parseSelector,3,,P(d3))
      * TE Signature : S(_parseSelector,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/meta.d.ts@1054
     */
    public native Object _parseSelector(Object tag);
    /** 
      * Std Signature : S(_setMetaElementAttributes,3,,P(d3),P(d3))
      * TE Signature : S(_setMetaElementAttributes,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/meta.d.ts@1006
     */
    public native Object _setMetaElementAttributes(Object tag, Object el);
    /** 
      * Std Signature : S(addTags,7<667>,,P(d7))
      * TE Signature : S(addTags,P(d7))
      * 
     */
    public native Array<HTMLMetaElement> addTags(Array tags);
    /** 
      * Std Signature : S(addTags,7<667>,,P(d7),P(d27))
      * TE Signature : S(addTags,P(d7),P(d27))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/meta.d.ts@585
     */
    public native Array<HTMLMetaElement> addTags(Array tags, Boolean forceCreation /* optional */);
    /** 
      * Std Signature : S(getTag,667,,P(d1))
      * TE Signature : S(getTag,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/meta.d.ts@666
     */
    public native HTMLMetaElement getTag(String attrSelector);
    /** 
      * Std Signature : S(getTags,7<667>,,P(d1))
      * TE Signature : S(getTags,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/meta.d.ts@724
     */
    public native Array<HTMLMetaElement> getTags(String attrSelector);
    /** 
      * Std Signature : S(removeTag,429,,P(d1))
      * TE Signature : S(removeTag,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/meta.d.ts@857
     */
    public native void removeTag(String attrSelector);
    /** 
      * Std Signature : S(removeTagElement,429,,P(d667))
      * TE Signature : S(removeTagElement,P(d667))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/meta.d.ts@900
     */
    public native void removeTagElement(HTMLMetaElement meta);
}

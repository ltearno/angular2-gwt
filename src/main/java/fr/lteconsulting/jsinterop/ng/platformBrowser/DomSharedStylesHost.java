package fr.lteconsulting.jsinterop.ng.platformBrowser;

import fr.lteconsulting.jsinterop.browser.Node;
import fr.lteconsulting.jsinterop.ng.core.OnDestroy;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/shared_styles_host".DomSharedStylesHost
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/shared_styles_host.d.ts:405
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.platformBrowser", name="DomSharedStylesHost")
public class DomSharedStylesHost extends SharedStylesHost implements OnDestroy
{

    /*
        Constructors
    */
    public DomSharedStylesHost(Object _doc){
    }

    /*
        Properties
    */

    public Object _doc;

    @JsProperty( name = "_doc")
    public native Object get_doc();

    @JsProperty( name = "_doc")
    public native void set_doc( Object value );

    public Object _hostNodes;

    @JsProperty( name = "_hostNodes")
    public native Object get_hostNodes();

    @JsProperty( name = "_hostNodes")
    public native void set_hostNodes( Object value );

    public Object _styleNodes;

    @JsProperty( name = "_styleNodes")
    public native Object get_styleNodes();

    @JsProperty( name = "_styleNodes")
    public native void set_styleNodes( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(_addStylesToHost,3,,P(d3),P(d3))
      * TE Signature : S(_addStylesToHost,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/shared_styles_host.d.ts@594
     */
    public native Object _addStylesToHost(Object styles, Object host);
    /** 
      * Std Signature : S(addHost,429,,P(d86))
      * TE Signature : S(addHost,P(d86))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/shared_styles_host.d.ts@638
     */
    public native void addHost(Node hostNode);
    /** 
      * Std Signature : S(ngOnDestroy,429,,)
      * TE Signature : S(ngOnDestroy,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void ngOnDestroy();
    /** 
      * Std Signature : S(removeHost,429,,P(d86))
      * TE Signature : S(removeHost,P(d86))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/shared_styles_host.d.ts@673
     */
    public native void removeHost(Node hostNode);
}

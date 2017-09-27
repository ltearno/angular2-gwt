package fr.lteconsulting.jsinterop.ng.platformBrowser;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.HTMLAnchorElement;
import fr.lteconsulting.jsinterop.browser.HTMLElement;
import fr.lteconsulting.jsinterop.browser.Node;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/generic_browser_adapter".GenericBrowserDomAdapter
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/generic_browser_adapter.d.ts:251
  * 1 constructors
  * Provides DOM operations in any browser environment.
 */
@JsType(isNative=true, namespace="ng.platformBrowser", name="GenericBrowserDomAdapter")
public class GenericBrowserDomAdapter extends DomAdapter
{

    /*
        Constructors
    */
    public GenericBrowserDomAdapter(){
    }

    /*
        Properties
    */

    public Object _animationPrefix;

    @JsProperty( name = "_animationPrefix")
    public native Object get_animationPrefix();

    @JsProperty( name = "_animationPrefix")
    public native void set_animationPrefix( Object value );

    public Object _transitionEnd;

    @JsProperty( name = "_transitionEnd")
    public native Object get_transitionEnd();

    @JsProperty( name = "_transitionEnd")
    public native void set_transitionEnd( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(getDistributedNodes,7<86>,,P(d240))
      * TE Signature : S(getDistributedNodes,P(d240))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/generic_browser_adapter.d.ts@584
     */
    public native Array<Node> getDistributedNodes(HTMLElement el);
    /** 
      * Std Signature : S(resolveAndSetHref,429,,P(d671),P(d1),P(d1))
      * TE Signature : S(resolveAndSetHref,P(d671),P(d1),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/generic_browser_adapter.d.ts@634
     */
    public native void resolveAndSetHref(HTMLAnchorElement el, String baseUrl, String href);
}

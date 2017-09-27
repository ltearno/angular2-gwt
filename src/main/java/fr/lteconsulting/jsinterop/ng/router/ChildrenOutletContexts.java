package fr.lteconsulting.jsinterop.ng.router;

import fr.lteconsulting.jsinterop.browser.Map;
import fr.lteconsulting.prebuilt.Action1;
import fr.lteconsulting.prebuilt.Action2;
import fr.lteconsulting.prebuilt.Function;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router_outlet_context".ChildrenOutletContexts
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router_outlet_context.d.ts:697

  * Store contextual information about the children (= nested) {@link RouterOutlet}
 */
@JsType(isNative=true, namespace="ng.router", name="ChildrenOutletContexts")
public class ChildrenOutletContexts
{

    /*
        Properties
    */

    public Object contexts;

    @JsProperty( name = "contexts")
    public native Object getContexts();

    @JsProperty( name = "contexts")
    public native void setContexts( Object value );

    /** 
      * Called when a `RouterOutlet` directive is instantiated 
     */
    public Action2<String, RouterOutlet> onChildOutletCreated;

    @JsProperty( name = "onChildOutletCreated")
    public native Action2<String, RouterOutlet> getOnChildOutletCreated();

    @JsProperty( name = "onChildOutletCreated")
    public native void setOnChildOutletCreated( Action2<String, RouterOutlet> value );

    /** 
      * Called when a `RouterOutlet` directive is destroyed.
      * We need to keep the context as the outlet could be destroyed inside a NgIf and might be
      * re-created later.
     */
    public Action1<String> onChildOutletDestroyed;

    @JsProperty( name = "onChildOutletDestroyed")
    public native Action1<String> getOnChildOutletDestroyed();

    @JsProperty( name = "onChildOutletDestroyed")
    public native void setOnChildOutletDestroyed( Action1<String> value );

    /** 
      * Called when the corresponding route is deactivated during navigation.
      * Because the component get destroyed, all children outlet are destroyed.
     */
    public Function<Map<String, OutletContext>> onOutletDeactivated;

    @JsProperty( name = "onOutletDeactivated")
    public native Function<Map<String, OutletContext>> getOnOutletDeactivated();

    @JsProperty( name = "onOutletDeactivated")
    public native void setOnOutletDeactivated( Function<Map<String, OutletContext>> value );

    public Action1<Map<String, OutletContext>> onOutletReAttached;

    @JsProperty( name = "onOutletReAttached")
    public native Action1<Map<String, OutletContext>> getOnOutletReAttached();

    @JsProperty( name = "onOutletReAttached")
    public native void setOnOutletReAttached( Action1<Map<String, OutletContext>> value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(getContext,1253,,P(d1))
      * TE Signature : S(getContext,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router_outlet_context.d.ts@1616
     */
    public native OutletContext getContext(String childName);
    /** 
      * Std Signature : S(getOrCreateContext,1253,,P(d1))
      * TE Signature : S(getOrCreateContext,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router_outlet_context.d.ts@1558
     */
    public native OutletContext getOrCreateContext(String childName);
}

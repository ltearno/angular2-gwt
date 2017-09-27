package fr.lteconsulting.jsinterop.ng.router;

import fr.lteconsulting.jsinterop.ng.core.ComponentFactoryResolver;
import fr.lteconsulting.jsinterop.ng.core.ComponentRef;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router_outlet_context".OutletContext
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router_outlet_context.d.ts:382

  * Store contextual information about a {@link RouterOutlet}
 */
@JsType(isNative=true, namespace="ng.router", name="OutletContext")
public class OutletContext
{

    /*
        Properties
    */

    public ComponentRef<Object> attachRef;

    @JsProperty( name = "attachRef")
    public native ComponentRef<Object> getAttachRef();

    @JsProperty( name = "attachRef")
    public native void setAttachRef( ComponentRef<Object> value );

    public ChildrenOutletContexts children;

    @JsProperty( name = "children")
    public native ChildrenOutletContexts getChildren();

    @JsProperty( name = "children")
    public native void setChildren( ChildrenOutletContexts value );

    public RouterOutlet outlet;

    @JsProperty( name = "outlet")
    public native RouterOutlet getOutlet();

    @JsProperty( name = "outlet")
    public native void setOutlet( RouterOutlet value );

    public ComponentFactoryResolver resolver;

    @JsProperty( name = "resolver")
    public native ComponentFactoryResolver getResolver();

    @JsProperty( name = "resolver")
    public native void setResolver( ComponentFactoryResolver value );

    public ActivatedRoute route;

    @JsProperty( name = "route")
    public native ActivatedRoute getRoute();

    @JsProperty( name = "route")
    public native void setRoute( ActivatedRoute value );
}

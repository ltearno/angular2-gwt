package fr.lteconsulting.jsinterop.ng.router;

import fr.lteconsulting.jsinterop.browser.AnonymousType717;
import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.LoadChildren_UnionOfFunctionOfUnionOfNgModuleFactoryOfObjectAndObservableOfTypeOfObjectAndPromiseOfTypeOfObjectAndTypeOfObjectAndString;
import fr.lteconsulting.jsinterop.ng.core.Type;
import fr.lteconsulting.prebuilt.Function;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/config".Route
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/config.d.ts:10004

  * See {@link Routes} for more details.
 */
@JsType(isNative=true, namespace="ng.router", name="Route")
public class Route
{

    /*
        Properties
    */

    public Array<Object> canActivate;

    @JsProperty( name = "canActivate")
    public native Array<Object> getCanActivate();

    @JsProperty( name = "canActivate")
    public native void setCanActivate( Array<Object> value );

    public Array<Object> canActivateChild;

    @JsProperty( name = "canActivateChild")
    public native Array<Object> getCanActivateChild();

    @JsProperty( name = "canActivateChild")
    public native void setCanActivateChild( Array<Object> value );

    public Array<Object> canDeactivate;

    @JsProperty( name = "canDeactivate")
    public native Array<Object> getCanDeactivate();

    @JsProperty( name = "canDeactivate")
    public native void setCanDeactivate( Array<Object> value );

    public Array<Object> canLoad;

    @JsProperty( name = "canLoad")
    public native Array<Object> getCanLoad();

    @JsProperty( name = "canLoad")
    public native void setCanLoad( Array<Object> value );

    public Array<Route> children;

    @JsProperty( name = "children")
    public native Array<Route> getChildren();

    @JsProperty( name = "children")
    public native void setChildren( Array<Route> value );

    public Type<Object> component;

    @JsProperty( name = "component")
    public native Type<Object> getComponent();

    @JsProperty( name = "component")
    public native void setComponent( Type<Object> value );

    public AnonymousType717 data;

    @JsProperty( name = "data")
    public native AnonymousType717 getData();

    @JsProperty( name = "data")
    public native void setData( AnonymousType717 value );

    public LoadChildren_UnionOfFunctionOfUnionOfNgModuleFactoryOfObjectAndObservableOfTypeOfObjectAndPromiseOfTypeOfObjectAndTypeOfObjectAndString loadChildren;

    @JsProperty( name = "loadChildren")
    public native LoadChildren_UnionOfFunctionOfUnionOfNgModuleFactoryOfObjectAndObservableOfTypeOfObjectAndPromiseOfTypeOfObjectAndTypeOfObjectAndString getLoadChildren();

    @JsProperty( name = "loadChildren")
    public native void setLoadChildren( LoadChildren_UnionOfFunctionOfUnionOfNgModuleFactoryOfObjectAndObservableOfTypeOfObjectAndPromiseOfTypeOfObjectAndTypeOfObjectAndString value );

    @JsOverlay
    // public final void setLoadChildren( Function<UnionOfNgModuleFactoryOfObjectAndObservableOfTypeOfObjectAndPromiseOfTypeOfObjectAndTypeOfObject> value ) { setLoadChildren(LoadChildren_UnionOfFunctionOfUnionOfNgModuleFactoryOfObjectAndObservableOfTypeOfObjectAndPromiseOfTypeOfObjectAndTypeOfObjectAndString.ofFunctionOfUnionOfNgModuleFactoryOfObjectAndObservableOfTypeOfObjectAndPromiseOfTypeOfObjectAndTypeOfObject( value )); }
    public final void setLoadChildren( Function<Object> value ) { setLoadChildren(LoadChildren_UnionOfFunctionOfUnionOfNgModuleFactoryOfObjectAndObservableOfTypeOfObjectAndPromiseOfTypeOfObjectAndTypeOfObjectAndString.ofFunctionOfUnionOfNgModuleFactoryOfObjectAndObservableOfTypeOfObjectAndPromiseOfTypeOfObjectAndTypeOfObject( value )); }

    @JsOverlay
    public final void setLoadChildren( String value ) { setLoadChildren(LoadChildren_UnionOfFunctionOfUnionOfNgModuleFactoryOfObjectAndObservableOfTypeOfObjectAndPromiseOfTypeOfObjectAndTypeOfObjectAndString.ofString( value )); }

    public String outlet;

    @JsProperty( name = "outlet")
    public native String getOutlet();

    @JsProperty( name = "outlet")
    public native void setOutlet( String value );

    public String path;

    @JsProperty( name = "path")
    public native String getPath();

    @JsProperty( name = "path")
    public native void setPath( String value );

    public String pathMatch;

    @JsProperty( name = "pathMatch")
    public native String getPathMatch();

    @JsProperty( name = "pathMatch")
    public native void setPathMatch( String value );

    public String redirectTo;

    @JsProperty( name = "redirectTo")
    public native String getRedirectTo();

    @JsProperty( name = "redirectTo")
    public native void setRedirectTo( String value );

    public AnonymousType717 resolve;

    @JsProperty( name = "resolve")
    public native AnonymousType717 getResolve();

    @JsProperty( name = "resolve")
    public native void setResolve( AnonymousType717 value );

    public String runGuardsAndResolvers;

    @JsProperty( name = "runGuardsAndResolvers")
    public native String getRunGuardsAndResolvers();

    @JsProperty( name = "runGuardsAndResolvers")
    public native void setRunGuardsAndResolvers( String value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(matcher,3,,P(d7<679>),P(d676),P(d677))
      * TE Signature : S(matcher,P(d7),P(d676),P(d677))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/config.d.ts@8728
     */
    public native Object matcher(Array<UrlSegment> segments, UrlSegmentGroup group, Route route);
}

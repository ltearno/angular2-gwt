package fr.lteconsulting.jsinterop.ng.router;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * aliased in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/events.d.ts:6329
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface Event_UnionOfSeveralGuards {
    @JsOverlay
    default GuardsCheckEnd asGuardsCheckEnd() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static Event_UnionOfSeveralGuards ofGuardsCheckEnd(GuardsCheckEnd value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default GuardsCheckStart asGuardsCheckStart() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static Event_UnionOfSeveralGuards ofGuardsCheckStart(GuardsCheckStart value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default NavigationCancel asNavigationCancel() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static Event_UnionOfSeveralGuards ofNavigationCancel(NavigationCancel value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default NavigationEnd asNavigationEnd() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static Event_UnionOfSeveralGuards ofNavigationEnd(NavigationEnd value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default NavigationError asNavigationError() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static Event_UnionOfSeveralGuards ofNavigationError(NavigationError value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default NavigationStart asNavigationStart() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static Event_UnionOfSeveralGuards ofNavigationStart(NavigationStart value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default ResolveEnd asResolveEnd() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static Event_UnionOfSeveralGuards ofResolveEnd(ResolveEnd value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default ResolveStart asResolveStart() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static Event_UnionOfSeveralGuards ofResolveStart(ResolveStart value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default RouteConfigLoadEnd asRouteConfigLoadEnd() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static Event_UnionOfSeveralGuards ofRouteConfigLoadEnd(RouteConfigLoadEnd value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default RouteConfigLoadStart asRouteConfigLoadStart() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static Event_UnionOfSeveralGuards ofRouteConfigLoadStart(RouteConfigLoadStart value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default RoutesRecognized asRoutesRecognized() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static Event_UnionOfSeveralGuards ofRoutesRecognized(RoutesRecognized value) {
        return Js.cast( value );
    }
    
}

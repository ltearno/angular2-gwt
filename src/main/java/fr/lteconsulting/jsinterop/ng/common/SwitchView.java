package fr.lteconsulting.jsinterop.ng.common;

import fr.lteconsulting.jsinterop.ng.core.TemplateRef;
import fr.lteconsulting.jsinterop.ng.core.ViewContainerRef;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/directives/ng_switch".SwitchView
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/directives/ng_switch.d.ts:274
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.common", name="SwitchView")
public class SwitchView
{

    /*
        Constructors
    */
    public SwitchView(ViewContainerRef _viewContainerRef, TemplateRef<Object> _templateRef){
    }

    /*
        Properties
    */

    public Object _created;

    @JsProperty( name = "_created")
    public native Object get_created();

    @JsProperty( name = "_created")
    public native void set_created( Object value );

    public Object _templateRef;

    @JsProperty( name = "_templateRef")
    public native Object get_templateRef();

    @JsProperty( name = "_templateRef")
    public native void set_templateRef( Object value );

    public Object _viewContainerRef;

    @JsProperty( name = "_viewContainerRef")
    public native Object get_viewContainerRef();

    @JsProperty( name = "_viewContainerRef")
    public native void set_viewContainerRef( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(create,429,,)
      * TE Signature : S(create,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/directives/ng_switch.d.ts@481
     */
    public native void create();
    /** 
      * Std Signature : S(destroy,429,,)
      * TE Signature : S(destroy,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/directives/ng_switch.d.ts@501
     */
    public native void destroy();
    /** 
      * Std Signature : S(enforceState,429,,P(d27))
      * TE Signature : S(enforceState,P(d27))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/directives/ng_switch.d.ts@522
     */
    public native void enforceState(Boolean created);
}

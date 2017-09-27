package fr.lteconsulting.jsinterop.ng.common;

import fr.lteconsulting.jsinterop.ng.core.OnChanges;
import fr.lteconsulting.jsinterop.ng.core.SimpleChanges;
import fr.lteconsulting.jsinterop.ng.core.TemplateRef;
import fr.lteconsulting.jsinterop.ng.core.ViewContainerRef;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/directives/ng_template_outlet".NgTemplateOutlet
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/directives/ng_template_outlet.d.ts:291
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.common", name="NgTemplateOutlet")
public class NgTemplateOutlet implements OnChanges
{

    /*
        Constructors
    */
    public NgTemplateOutlet(ViewContainerRef _viewContainerRef){
    }

    /*
        Properties
    */

    public Object _viewContainerRef;

    @JsProperty( name = "_viewContainerRef")
    public native Object get_viewContainerRef();

    @JsProperty( name = "_viewContainerRef")
    public native void set_viewContainerRef( Object value );

    public Object _viewRef;

    @JsProperty( name = "_viewRef")
    public native Object get_viewRef();

    @JsProperty( name = "_viewRef")
    public native void set_viewRef( Object value );

    public Object ngOutletContext;

    @JsProperty( name = "ngOutletContext")
    public native Object getNgOutletContext();

    @JsProperty( name = "ngOutletContext")
    public native void setNgOutletContext( Object value );

    public TemplateRef<Object> ngTemplateOutlet;

    @JsProperty( name = "ngTemplateOutlet")
    public native TemplateRef<Object> getNgTemplateOutlet();

    @JsProperty( name = "ngTemplateOutlet")
    public native void setNgTemplateOutlet( TemplateRef<Object> value );

    public Object ngTemplateOutletContext;

    @JsProperty( name = "ngTemplateOutletContext")
    public native Object getNgTemplateOutletContext();

    @JsProperty( name = "ngTemplateOutletContext")
    public native void setNgTemplateOutletContext( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(ngOnChanges,429,,P(d346))
      * TE Signature : S(ngOnChanges,P(d346))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void ngOnChanges(SimpleChanges changes);
}

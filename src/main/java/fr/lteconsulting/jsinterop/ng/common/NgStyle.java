package fr.lteconsulting.jsinterop.ng.common;

import fr.lteconsulting.jsinterop.browser.AnonymousType817;
import fr.lteconsulting.jsinterop.ng.core.DoCheck;
import fr.lteconsulting.jsinterop.ng.core.ElementRef;
import fr.lteconsulting.jsinterop.ng.core.KeyValueDiffers;
import fr.lteconsulting.jsinterop.ng.core.Renderer;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/directives/ng_style".NgStyle
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/directives/ng_style.d.ts:282
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.common", name="NgStyle")
public class NgStyle extends DoCheck
{

    /*
        Constructors
    */
    public NgStyle(KeyValueDiffers _differs, ElementRef _ngEl, Renderer _renderer){
    }

    /*
        Properties
    */

    public Object _differ;

    @JsProperty( name = "_differ")
    public native Object get_differ();

    @JsProperty( name = "_differ")
    public native void set_differ( Object value );

    public Object _differs;

    @JsProperty( name = "_differs")
    public native Object get_differs();

    @JsProperty( name = "_differs")
    public native void set_differs( Object value );

    public Object _ngEl;

    @JsProperty( name = "_ngEl")
    public native Object get_ngEl();

    @JsProperty( name = "_ngEl")
    public native void set_ngEl( Object value );

    public Object _ngStyle;

    @JsProperty( name = "_ngStyle")
    public native Object get_ngStyle();

    @JsProperty( name = "_ngStyle")
    public native void set_ngStyle( Object value );

    public Object _renderer;

    @JsProperty( name = "_renderer")
    public native Object get_renderer();

    @JsProperty( name = "_renderer")
    public native void set_renderer( Object value );

    public AnonymousType817 ngStyle;

    @JsProperty( name = "ngStyle")
    public native AnonymousType817 getNgStyle();

    @JsProperty( name = "ngStyle")
    public native void setNgStyle( AnonymousType817 value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(_applyChanges,3,,P(d3))
      * TE Signature : S(_applyChanges,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/directives/ng_style.d.ts@1220
     */
    public native Object _applyChanges(Object changes);
    /** 
      * Std Signature : S(_setStyle,3,,P(d3),P(d3))
      * TE Signature : S(_setStyle,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/directives/ng_style.d.ts@1256
     */
    public native Object _setStyle(Object nameAndUnit, Object value);
}

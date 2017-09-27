package fr.lteconsulting.jsinterop.ng.common;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/directives/ng_plural".NgPlural
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/directives/ng_plural.d.ts:357
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.common", name="NgPlural")
public class NgPlural
{

    /*
        Constructors
    */
    public NgPlural(NgLocalization _localization){
    }

    /*
        Properties
    */

    public Object _activeView;

    @JsProperty( name = "_activeView")
    public native Object get_activeView();

    @JsProperty( name = "_activeView")
    public native void set_activeView( Object value );

    public Object _caseViews;

    @JsProperty( name = "_caseViews")
    public native Object get_caseViews();

    @JsProperty( name = "_caseViews")
    public native void set_caseViews( Object value );

    public Object _localization;

    @JsProperty( name = "_localization")
    public native Object get_localization();

    @JsProperty( name = "_localization")
    public native void set_localization( Object value );

    public Object _switchValue;

    @JsProperty( name = "_switchValue")
    public native Object get_switchValue();

    @JsProperty( name = "_switchValue")
    public native void set_switchValue( Object value );

    public Number ngPlural;

    @JsProperty( name = "ngPlural")
    public native Number getNgPlural();

    @JsProperty( name = "ngPlural")
    public native void setNgPlural( Number value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(_activateView,3,,P(d3))
      * TE Signature : S(_activateView,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/directives/ng_plural.d.ts@1897
     */
    public native Object _activateView(Object view);
    /** 
      * Std Signature : S(_clearViews,3,,)
      * TE Signature : S(_clearViews,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/directives/ng_plural.d.ts@1870
     */
    public native Object _clearViews();
    /** 
      * Std Signature : S(_updateView,3,,)
      * TE Signature : S(_updateView,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/directives/ng_plural.d.ts@1843
     */
    public native Object _updateView();
    /** 
      * Std Signature : S(addCase,429,,P(d1),P(d427))
      * TE Signature : S(addCase,P(d1),P(d427))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/directives/ng_plural.d.ts@1785
     */
    public native void addCase(String value, SwitchView switchView);
}

package fr.lteconsulting.jsinterop.ng.common;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/directives/ng_switch".NgSwitch
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/directives/ng_switch.d.ts:561
  * 
 */
@JsType(isNative=true, namespace="ng.common", name="NgSwitch")
public class NgSwitch
{

    /*
        Properties
    */

    public Object _caseCount;

    @JsProperty( name = "_caseCount")
    public native Object get_caseCount();

    @JsProperty( name = "_caseCount")
    public native void set_caseCount( Object value );

    public Object _defaultUsed;

    @JsProperty( name = "_defaultUsed")
    public native Object get_defaultUsed();

    @JsProperty( name = "_defaultUsed")
    public native void set_defaultUsed( Object value );

    public Object _defaultViews;

    @JsProperty( name = "_defaultViews")
    public native Object get_defaultViews();

    @JsProperty( name = "_defaultViews")
    public native void set_defaultViews( Object value );

    public Object _lastCaseCheckIndex;

    @JsProperty( name = "_lastCaseCheckIndex")
    public native Object get_lastCaseCheckIndex();

    @JsProperty( name = "_lastCaseCheckIndex")
    public native void set_lastCaseCheckIndex( Object value );

    public Object _lastCasesMatched;

    @JsProperty( name = "_lastCasesMatched")
    public native Object get_lastCasesMatched();

    @JsProperty( name = "_lastCasesMatched")
    public native void set_lastCasesMatched( Object value );

    public Object _ngSwitch;

    @JsProperty( name = "_ngSwitch")
    public native Object get_ngSwitch();

    @JsProperty( name = "_ngSwitch")
    public native void set_ngSwitch( Object value );

    public Object ngSwitch;

    @JsProperty( name = "ngSwitch")
    public native Object getNgSwitch();

    @JsProperty( name = "ngSwitch")
    public native void setNgSwitch( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(_updateDefaultCases,3,,P(d3))
      * TE Signature : S(_updateDefaultCases,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/directives/ng_switch.d.ts@2406
     */
    public native Object _updateDefaultCases(Object useDefault);
}

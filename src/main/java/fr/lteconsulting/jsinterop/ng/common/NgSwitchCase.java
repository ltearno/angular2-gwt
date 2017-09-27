package fr.lteconsulting.jsinterop.ng.common;

import fr.lteconsulting.jsinterop.ng.core.DoCheck;
import fr.lteconsulting.jsinterop.ng.core.TemplateRef;
import fr.lteconsulting.jsinterop.ng.core.ViewContainerRef;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/directives/ng_switch".NgSwitchCase
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/directives/ng_switch.d.ts:2448
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.common", name="NgSwitchCase")
public class NgSwitchCase extends DoCheck
{

    /*
        Constructors
    */
    public NgSwitchCase(ViewContainerRef viewContainer, TemplateRef<Object> templateRef, NgSwitch ngSwitch){
    }

    /*
        Properties
    */

    public Object _view;

    @JsProperty( name = "_view")
    public native Object get_view();

    @JsProperty( name = "_view")
    public native void set_view( Object value );

    public Object ngSwitch;

    @JsProperty( name = "ngSwitch")
    public native Object getNgSwitch();

    @JsProperty( name = "ngSwitch")
    public native void setNgSwitch( Object value );

    public Object ngSwitchCase;

    @JsProperty( name = "ngSwitchCase")
    public native Object getNgSwitchCase();

    @JsProperty( name = "ngSwitchCase")
    public native void setNgSwitchCase( Object value );
}

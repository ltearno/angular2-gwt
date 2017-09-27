package fr.lteconsulting.jsinterop.ng.forms;

import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/directives/ng_control_status".NgControlStatus
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/directives/ng_control_status.d.ts:830
  * 1 constructors
  * Directive automatically applied to Angular form controls that sets CSS classes
  * based on control status. The following classes are applied as the properties
  * become true:
  * 
  * * ng-valid
  * * ng-invalid
  * * ng-pending
  * * ng-pristine
  * * ng-dirty
  * * ng-untouched
  * * ng-touched
 */
@JsType(isNative=true, namespace="ng.forms", name="NgControlStatus")
public class NgControlStatus extends AbstractControlStatus
{

    /*
        Constructors
    */
    public NgControlStatus(NgControl cd){
        super(null);
    }
}

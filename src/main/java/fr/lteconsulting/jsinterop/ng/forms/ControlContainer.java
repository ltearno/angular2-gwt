package fr.lteconsulting.jsinterop.ng.forms;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/directives/control_container".ControlContainer
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/directives/control_container.d.ts:316

  * A directive that contains multiple {@link NgControl}s.
  * 
  * Only used by the forms module.
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface ControlContainer extends AbstractControlDirective
{

    /*
        Properties
    */

    /** 
      * Get the form to which this container belongs.
     */
    @JsProperty( name = "formDirective")
    Form getFormDirective();

    @JsProperty( name = "formDirective")
    void setFormDirective( Form value );

    @JsProperty( name = "name")
    String getName();

    @JsProperty( name = "name")
    void setName( String value );
}

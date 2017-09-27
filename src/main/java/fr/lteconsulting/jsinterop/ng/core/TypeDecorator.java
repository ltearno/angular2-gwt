package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/util/decorators".TypeDecorator
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/util/decorators.d.ts:1068

  * An interface implemented by all Angular type decorators, which allows them to be used as ES7
  * decorators as well as
  * Angular DSL syntax.
  * 
  * DSL syntax:
  * 
  * ```
  * var MyClass = ng
  *    .Component({...})
  *    .Class({...});
  * ```
  * 
  * ES7 syntax:
  * 
  * ```
 */
@JsType(isNative=true, namespace="ng.core", name="TypeDecorator")
public class TypeDecorator
{
    /** SKIPPED CALL SIGNATURE ! */
    /** SKIPPED CALL SIGNATURE ! */

    /*
        Properties
    */

    /** 
      * Storage for the accumulated annotations so far used by the DSL syntax.
      * 
      * Used by {@link Class} to annotate the generated class.
     */
    public Array<Object> annotations;

    @JsProperty( name = "annotations")
    public native Array<Object> getAnnotations();

    @JsProperty( name = "annotations")
    public native void setAnnotations( Array<Object> value );
}

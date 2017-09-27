package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/pipe_transform".PipeTransform
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/pipe_transform.d.ts:0

  * To create a Pipe, you must implement this interface.
  * 
  * Angular invokes the `transform` method with the value of a binding
  * as the first argument, and any parameters as the second argument in list form.
  * 
  * ## Syntax
  * 
  * `value | pipeName[:arg0[:arg1...]]`
  * 
  * ### Example ([live demo](http://plnkr.co/edit/f5oyIked9M2cKzvZNKHV?p=preview))
  * 
  * The `RepeatPipe` below repeats the value as many times as indicated by the first argument:
  * 
  * ```
  * import {Pipe, PipeTransform} from '@angular/core';
 */
@JsType(isNative=true, namespace="ng.core", name="PipeTransform")
public class PipeTransform
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(transform,3,,P(d3))
      * TE Signature : S(transform,P(d3))
      * 
     */
    public native Object transform(Object value);
    /** 
      * Std Signature : S(transform,3,,P(d3),P(D3))
      * TE Signature : S(transform,P(d3),P(D3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/pipe_transform.d.ts@1031
     */
    public native Object transform(Object value, Object... args);
}

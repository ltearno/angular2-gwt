package fr.lteconsulting.jsinterop.ng.forms;

import fr.lteconsulting.jsinterop.UnionOfArrayOfAsyncValidatorFnAndAsyncValidatorFn;
import fr.lteconsulting.jsinterop.UnionOfArrayOfValidatorFnAndValidatorFn;
import fr.lteconsulting.jsinterop.browser.AnonymousType717;
import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/form_builder".FormBuilder
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/form_builder.d.ts:133
  * 
 */
@JsType(isNative=true, namespace="ng.forms", name="FormBuilder")
public class FormBuilder
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(array,627,,P(d7<3>))
      * TE Signature : S(array,P(d7))
      * 
     */
    public native FormArray array(Array<Object> controlsConfig);
    /** 
      * Std Signature : S(array,627,,P(d7<3>),P(dF--S(?,C(----3----),,P(d626))------)))
      * TE Signature : S(array,P(d7),P(dF--S(?,P(d626))------)))
      * 
     */
    public native FormArray array(Array<Object> controlsConfig, ValidatorFn validator /* optional */);
    /** 
      * Std Signature : S(array,627,,P(d7<3>),P(dF--S(?,C(----3----),,P(d626))------)),P(dF--S(?,U(-357<C(----3----)>,88<5>),,P(d626))------)))
      * TE Signature : S(array,P(d7),P(dF--S(?,P(d626))------)),P(dF--S(?,P(d626))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/form_builder.d.ts@1743
      * Construct a {@link FormArray} from the given `controlsConfig` array of
      * configuration, with the given optional `validator` and `asyncValidator`.
     */
    public native FormArray array(Array<Object> controlsConfig, ValidatorFn validator /* optional */, AsyncValidatorFn asyncValidator /* optional */);
    /** 
      * Std Signature : S(control,645,,P(d3))
      * TE Signature : S(control,P(d3))
      * 
     */
    public native FormControl control(Object formState);
    /** 
      * Std Signature : S(control,645,,P(d3),P(d7<F--S(?,C(----3----),,P(d626))------)>))
      * TE Signature : S(control,P(d3),P(d7))
      * 
     */
    public native FormControl control(Object formState, Array<ValidatorFn> validator /* optional */);
    /** 
      * Std Signature : S(control,645,,P(d3),P(d7<F--S(?,C(----3----),,P(d626))------)>),P(d7<F--S(?,U(-357<C(----3----)>,88<7>),,P(d626))------)>))
      * TE Signature : S(control,P(d3),P(d7),P(d7))
      * 
     */
    public native FormControl control(Object formState, Array<ValidatorFn> validator /* optional */, Array<AsyncValidatorFn> asyncValidator /* optional */);
    /** 
      * Std Signature : S(control,645,,P(d3),P(d7<F--S(?,C(----3----),,P(d626))------)>),P(dF--S(?,U(-357<C(----3----)>,88<5>),,P(d626))------)))
      * TE Signature : S(control,P(d3),P(d7),P(dF--S(?,P(d626))------)))
      * 
     */
    public native FormControl control(Object formState, Array<ValidatorFn> validator /* optional */, AsyncValidatorFn asyncValidator /* optional */);
    /** 
      * Std Signature : S(control,645,,P(d3),P(dF--S(?,C(----3----),,P(d626))------)))
      * TE Signature : S(control,P(d3),P(dF--S(?,P(d626))------)))
      * 
     */
    public native FormControl control(Object formState, ValidatorFn validator /* optional */);
    /** 
      * Std Signature : S(control,645,,P(d3),P(dF--S(?,C(----3----),,P(d626))------)),P(d7<F--S(?,U(-357<C(----3----)>,88<7>),,P(d626))------)>))
      * TE Signature : S(control,P(d3),P(dF--S(?,P(d626))------)),P(d7))
      * 
     */
    public native FormControl control(Object formState, ValidatorFn validator /* optional */, Array<AsyncValidatorFn> asyncValidator /* optional */);
    /** 
      * Std Signature : S(control,645,,P(d3),P(dF--S(?,C(----3----),,P(d626))------)),P(dF--S(?,U(-357<C(----3----)>,88<5>),,P(d626))------)))
      * TE Signature : S(control,P(d3),P(dF--S(?,P(d626))------)),P(dF--S(?,P(d626))------)))
      * 
     */
    public native FormControl control(Object formState, ValidatorFn validator /* optional */, AsyncValidatorFn asyncValidator /* optional */);
    /** 
      * Std Signature : S(control,645,,P(d3),P(dU(-7<F--S(?,C(----3----),,P(d626))------)>,4)))
      * TE Signature : S(control,P(d3),P(dU(-7,F--S(?,P(d626))------))))
      * 
     */
    public native FormControl control(Object formState, UnionOfArrayOfValidatorFnAndValidatorFn validator /* optional */);
    /** 
      * Std Signature : S(control,645,,P(d3),P(dU(-7<F--S(?,C(----3----),,P(d626))------)>,4)),P(dU(-7<F--S(?,U(-357<C(----3----)>,88<8>),,P(d626))------)>,4)))
      * TE Signature : S(control,P(d3),P(dU(-7,F--S(?,P(d626))------))),P(dU(-7,F--S(?,P(d626))------))))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/form_builder.d.ts@1413
      * Construct a new {@link FormControl} with the given `formState`,`validator`, and
      * `asyncValidator`.
      * 
      * `formState` can either be a standalone value for the form control or an object
      * that contains both a value and a disabled status.
     */
    public native FormControl control(Object formState, UnionOfArrayOfValidatorFnAndValidatorFn validator /* optional */, UnionOfArrayOfAsyncValidatorFnAndAsyncValidatorFn asyncValidator /* optional */);
    /** 
      * Std Signature : S(group,628,,P(dC(----3----)))
      * TE Signature : S(group,P(dC(----3----)))
      * 
     */
    public native FormGroup group(AnonymousType717 controlsConfig);
    /** 
      * Std Signature : S(group,628,,P(dC(----3----)),P(dC(----3----)))
      * TE Signature : S(group,P(dC(----3----)),P(dC(----3----)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/form_builder.d.ts@1001
      * Construct a new {@link FormGroup} with the given map of configuration.
      * Valid keys for the `extra` parameter map are `validator` and `asyncValidator`.
      * 
      * See the {@link FormGroup} constructor for more details.
     */
    public native FormGroup group(AnonymousType717 controlsConfig, AnonymousType717 extra /* optional */);
}

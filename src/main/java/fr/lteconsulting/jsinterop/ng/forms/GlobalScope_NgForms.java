package fr.lteconsulting.jsinterop.ng.forms;

import fr.lteconsulting.jsinterop.Provider_UnionOfArrayOfObjectAndClassProviderAndExistingProviderAndFactoryProviderAndTypeProviderAndValueProvider;
import fr.lteconsulting.jsinterop.UnionOfFunctionAndValidator;
import fr.lteconsulting.jsinterop.browser.AnonymousType717;
import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.ng.core.InjectionToken;
import fr.lteconsulting.jsinterop.ng.core.Type;
import fr.lteconsulting.jsinterop.ng.core.Version;
import fr.lteconsulting.jsinterop.rxjs.Observable;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 

  * Wrapper class for all global definition of ng.forms (java fr.lteconsulting.jsinterop.ng.forms) package
 */
@JsType(isNative=true, namespace="ng", name="forms")
public class GlobalScope_NgForms
{

    /*
        Static properties
    */

    @JsProperty(namespace="ng.forms", name="REQUIRED_VALIDATOR")
    public static Provider_UnionOfArrayOfObjectAndClassProviderAndExistingProviderAndFactoryProviderAndTypeProviderAndValueProvider REQUIRED_VALIDATOR;

    @JsProperty(namespace="ng.forms", name="CHECKBOX_REQUIRED_VALIDATOR")
    public static Provider_UnionOfArrayOfObjectAndClassProviderAndExistingProviderAndFactoryProviderAndTypeProviderAndValueProvider CHECKBOX_REQUIRED_VALIDATOR;

    @JsProperty(namespace="ng.forms", name="NG_VALUE_ACCESSOR")
    public static InjectionToken<ControlValueAccessor> NG_VALUE_ACCESSOR;

    @JsProperty(namespace="ng.forms", name="COMPOSITION_BUFFER_MODE")
    public static InjectionToken<Boolean> COMPOSITION_BUFFER_MODE;

    @JsProperty(namespace="ng.forms", name="ngControlStatusHost")
    public static Object ngControlStatusHost;

    @JsProperty(namespace="ng.forms", name="SELECT_VALUE_ACCESSOR")
    public static Provider_UnionOfArrayOfObjectAndClassProviderAndExistingProviderAndFactoryProviderAndTypeProviderAndValueProvider SELECT_VALUE_ACCESSOR;

    @JsProperty(namespace="ng.forms", name="SELECT_MULTIPLE_VALUE_ACCESSOR")
    public static Provider_UnionOfArrayOfObjectAndClassProviderAndExistingProviderAndFactoryProviderAndTypeProviderAndValueProvider SELECT_MULTIPLE_VALUE_ACCESSOR;

    @JsProperty(namespace="ng.forms", name="NG_VALIDATORS")
    public static InjectionToken<Array<UnionOfFunctionAndValidator>> NG_VALIDATORS;

    @JsProperty(namespace="ng.forms", name="NG_ASYNC_VALIDATORS")
    public static InjectionToken<Array<UnionOfFunctionAndValidator>> NG_ASYNC_VALIDATORS;

    @JsProperty(namespace="ng.forms", name="VERSION")
    public static Version VERSION;

    @JsProperty(namespace="ng.forms", name="RANGE_VALUE_ACCESSOR")
    public static Provider_UnionOfArrayOfObjectAndClassProviderAndExistingProviderAndFactoryProviderAndTypeProviderAndValueProvider RANGE_VALUE_ACCESSOR;

    @JsProperty(namespace="ng.forms", name="SHARED_FORM_DIRECTIVES")
    public static Array<Type<Object>> SHARED_FORM_DIRECTIVES;

    @JsProperty(namespace="ng.forms", name="TEMPLATE_DRIVEN_DIRECTIVES")
    public static Array<Type<Object>> TEMPLATE_DRIVEN_DIRECTIVES;

    @JsProperty(namespace="ng.forms", name="REACTIVE_DRIVEN_DIRECTIVES")
    public static Array<Type<Object>> REACTIVE_DRIVEN_DIRECTIVES;

    @JsProperty(namespace="ng.forms", name="FormErrorExamples")
    public static Object FormErrorExamples;

    /*
        Static methods
    */
    @JsMethod(namespace="ng.forms", name = "toObservable")
    public static native Observable<Object> toObservable(Object r);
    @JsMethod(namespace="ng.forms", name = "normalizeValidator")
    public static native ValidatorFn normalizeValidator(UnionOfValidatorAndValidatorFn validator);
    @JsMethod(namespace="ng.forms", name = "normalizeAsyncValidator")
    public static native AsyncValidatorFn normalizeAsyncValidator(UnionOfAsyncValidatorAndAsyncValidatorFn validator);
    @JsMethod(namespace="ng.forms", name = "controlPath")
    public static native Array<String> controlPath(String name, ControlContainer parent);
    @JsMethod(namespace="ng.forms", name = "setUpControl")
    public static native void setUpControl(FormControl control, NgControl dir);
    @JsMethod(namespace="ng.forms", name = "cleanUpControl")
    public static native void cleanUpControl(FormControl control, NgControl dir);
    @JsMethod(namespace="ng.forms", name = "setUpFormContainer")
    public static native void setUpFormContainer(UnionOfFormArrayAndFormGroup control, UnionOfAbstractFormGroupDirectiveAndFormArrayName dir);
    @JsMethod(namespace="ng.forms", name = "composeValidators")
    public static native ValidatorFn composeValidators(Array<UnionOfFunctionAndValidator> validators);
    @JsMethod(namespace="ng.forms", name = "composeAsyncValidators")
    public static native AsyncValidatorFn composeAsyncValidators(Array<UnionOfFunctionAndValidator> validators);
    @JsMethod(namespace="ng.forms", name = "isPropertyUpdated")
    public static native Boolean isPropertyUpdated(AnonymousType717 changes, Object viewModel);
    @JsMethod(namespace="ng.forms", name = "isBuiltInAccessor")
    public static native Boolean isBuiltInAccessor(ControlValueAccessor valueAccessor);
    @JsMethod(namespace="ng.forms", name = "selectValueAccessor")
    public static native ControlValueAccessor selectValueAccessor(NgControl dir, Array<ControlValueAccessor> valueAccessors);
}

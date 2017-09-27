package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/compiler/src/provider_analyzer".ProviderViewContext
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/compiler/src/provider_analyzer.d.ts:765
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler", name="ProviderViewContext")
public class ProviderViewContext
{

    /*
        Constructors
    */
    public ProviderViewContext(CompileReflector reflector, CompileDirectiveMetadata component){
    }

    /*
        Properties
    */

    public CompileDirectiveMetadata component;

    @JsProperty( name = "component")
    public native CompileDirectiveMetadata getComponent();

    @JsProperty( name = "component")
    public native void setComponent( CompileDirectiveMetadata value );

    public Array<ProviderError> errors;

    @JsProperty( name = "errors")
    public native Array<ProviderError> getErrors();

    @JsProperty( name = "errors")
    public native void setErrors( Array<ProviderError> value );

    public CompileReflector reflector;

    @JsProperty( name = "reflector")
    public native CompileReflector getReflector();

    @JsProperty( name = "reflector")
    public native void setReflector( CompileReflector value );
}

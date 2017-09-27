package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.ng.core.ViewEncapsulation;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_metadata".CompileTemplateSummary
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_metadata.d.ts:5543

  * Summary Metadata regarding compilation of a template.
 */
@JsType(isNative=true, namespace="ng.compiler", name="CompileTemplateSummary")
public class CompileTemplateSummary
{

    /*
        Properties
    */

    public Array<String> animations;

    @JsProperty( name = "animations")
    public native Array<String> getAnimations();

    @JsProperty( name = "animations")
    public native void setAnimations( Array<String> value );

    public ViewEncapsulation encapsulation;

    @JsProperty( name = "encapsulation")
    public native ViewEncapsulation getEncapsulation();

    @JsProperty( name = "encapsulation")
    public native void setEncapsulation( ViewEncapsulation value );

    public Array<String> ngContentSelectors;

    @JsProperty( name = "ngContentSelectors")
    public native Array<String> getNgContentSelectors();

    @JsProperty( name = "ngContentSelectors")
    public native void setNgContentSelectors( Array<String> value );
}

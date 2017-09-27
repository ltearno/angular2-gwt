package fr.lteconsulting.jsinterop.ng.compiler.jit;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.ng.core.CompilerFactory;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/jit/compiler_factory".JitCompilerFactory
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/jit/compiler_factory.d.ts:522
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.jit", name="JitCompilerFactory")
public class JitCompilerFactory extends CompilerFactory
{

    /*
        Constructors
    */
    public JitCompilerFactory(Array<Object> defaultOptions){
    }

    /*
        Properties
    */

    public Object _defaultOptions;

    @JsProperty( name = "_defaultOptions")
    public native Object get_defaultOptions();

    @JsProperty( name = "_defaultOptions")
    public native void set_defaultOptions( Object value );
}

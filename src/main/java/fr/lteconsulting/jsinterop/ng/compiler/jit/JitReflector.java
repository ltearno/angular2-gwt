package fr.lteconsulting.jsinterop.ng.compiler.jit;

import fr.lteconsulting.jsinterop.ng.compiler.CompileReflector;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/jit/jit_reflector".JitReflector
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/jit/jit_reflector.d.ts:345
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.jit", name="JitReflector")
public class JitReflector extends CompileReflector
{

    /*
        Constructors
    */
    public JitReflector(){
    }

    /*
        Properties
    */

    public Object reflectionCapabilities;

    @JsProperty( name = "reflectionCapabilities")
    public native Object getReflectionCapabilities();

    @JsProperty( name = "reflectionCapabilities")
    public native void setReflectionCapabilities( Object value );
}

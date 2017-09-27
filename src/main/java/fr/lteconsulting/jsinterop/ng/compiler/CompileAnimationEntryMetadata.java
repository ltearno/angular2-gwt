package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_metadata".CompileAnimationEntryMetadata
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_metadata.d.ts:441
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler", name="CompileAnimationEntryMetadata")
public class CompileAnimationEntryMetadata
{

    /*
        Constructors
    */
    public CompileAnimationEntryMetadata(String name, Array<CompileAnimationStateMetadata> definitions){
    }

    /*
        Properties
    */

    public Array<CompileAnimationStateMetadata> definitions;

    @JsProperty( name = "definitions")
    public native Array<CompileAnimationStateMetadata> getDefinitions();

    @JsProperty( name = "definitions")
    public native void setDefinitions( Array<CompileAnimationStateMetadata> value );

    public String name;

    @JsProperty( name = "name")
    public native String getName();

    @JsProperty( name = "name")
    public native void setName( String value );
}

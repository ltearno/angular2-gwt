package fr.lteconsulting.jsinterop.ng.compiler.i18n;

import fr.lteconsulting.jsinterop.ng.compiler.ParseSourceSpan;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/i18n/i18n_ast".IcuPlaceholder
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/i18n/i18n_ast.d.ts:2778
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.i18n", name="IcuPlaceholder")
public class IcuPlaceholder extends Node
{

    /*
        Constructors
    */
    public IcuPlaceholder(Icu value, String name, ParseSourceSpan sourceSpan){
    }

    /*
        Properties
    */

    public String name;

    @JsProperty( name = "name")
    public native String getName();

    @JsProperty( name = "name")
    public native void setName( String value );

    public Icu value;

    @JsProperty( name = "value")
    public native Icu getValue();

    @JsProperty( name = "value")
    public native void setValue( Icu value );
}

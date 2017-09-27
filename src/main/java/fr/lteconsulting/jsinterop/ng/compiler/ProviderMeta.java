package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.Function;
import fr.lteconsulting.jsinterop.ng.core.Type;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_metadata".ProviderMeta
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_metadata.d.ts:15177
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler", name="ProviderMeta")
public class ProviderMeta
{

    /*
        Constructors
    */
    public ProviderMeta(Object token, Object __1){
    }

    /*
        Properties
    */

    public Array<Object> dependencies;

    @JsProperty( name = "dependencies")
    public native Array<Object> getDependencies();

    @JsProperty( name = "dependencies")
    public native void setDependencies( Array<Object> value );

    public Boolean multi;

    @JsProperty( name = "multi")
    public native Boolean getMulti();

    @JsProperty( name = "multi")
    public native void setMulti( Boolean value );

    public Object token;

    @JsProperty( name = "token")
    public native Object getToken();

    @JsProperty( name = "token")
    public native void setToken( Object value );

    public Type<Object> useClass;

    @JsProperty( name = "useClass")
    public native Type<Object> getUseClass();

    @JsProperty( name = "useClass")
    public native void setUseClass( Type<Object> value );

    public Object useExisting;

    @JsProperty( name = "useExisting")
    public native Object getUseExisting();

    @JsProperty( name = "useExisting")
    public native void setUseExisting( Object value );

    public Function useFactory;

    @JsProperty( name = "useFactory")
    public native Function getUseFactory();

    @JsProperty( name = "useFactory")
    public native void setUseFactory( Function value );

    public Object useValue;

    @JsProperty( name = "useValue")
    public native Object getUseValue();

    @JsProperty( name = "useValue")
    public native void setUseValue( Object value );
}

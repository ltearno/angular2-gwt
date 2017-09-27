package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/di/injection_token".OpaqueToken
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/di/injection_token.d.ts:0
  * 1 constructors
  * Creates a token that can be used in a DI Provider.
  * 
  * ### Example ([live demo](http://plnkr.co/edit/Ys9ezXpj2Mnoy3Uc8KBp?p=preview))
  * 
  * ```typescript
  * var t = new OpaqueToken("value");
  * 
  * var injector = Injector.resolveAndCreate([
  *    {provide: t, useValue: "bindingValue"}
  * ]);
  * 
  * expect(injector.get(t)).toEqual("bindingValue");
  * ```
  * 
  * Using an `OpaqueToken` is preferable to using strings as tokens because of possible collisions
  * caused by multiple providers using the same string as two different tokens.
  * 
  * Using an `OpaqueToken` is preferable to using an `Object` as tokens because it provides better
  * error messages.
 */
@JsType(isNative=true, namespace="ng.core", name="OpaqueToken")
public class OpaqueToken
{

    /*
        Constructors
    */
    public OpaqueToken(String _desc){
    }

    /*
        Properties
    */

    public String _desc;

    @JsProperty( name = "_desc")
    public native String get_desc();

    @JsProperty( name = "_desc")
    public native void set_desc( String value );
}

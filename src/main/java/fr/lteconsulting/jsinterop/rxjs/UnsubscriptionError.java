package fr.lteconsulting.jsinterop.rxjs;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.Error;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/util/UnsubscriptionError".UnsubscriptionError
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/util/UnsubscriptionError.d.ts:0
  * 1 constructors
  * An error thrown when one or more errors have occurred during the
  * `unsubscribe` of a {@link Subscription}.
 */
@JsType(isNative=true, namespace="rxjs", name="UnsubscriptionError")
public class UnsubscriptionError extends Error
{

    /*
        Constructors
    */
    public UnsubscriptionError(Array<Object> errors){
        super(null);
    }

    /*
        Properties
    */

    public Array<Object> errors;

    @JsProperty( name = "errors")
    public native Array<Object> getErrors();

    @JsProperty( name = "errors")
    public native void setErrors( Array<Object> value );

    public String message;

    @JsProperty( name = "message")
    public native String getMessage();

    @JsProperty( name = "message")
    public native void setMessage( String value );

    public String name;

    @JsProperty( name = "name")
    public native String getName();

    @JsProperty( name = "name")
    public native void setName( String value );

    public String stack;

    @JsProperty( name = "stack")
    public native String getStack();

    @JsProperty( name = "stack")
    public native void setStack( String value );
}

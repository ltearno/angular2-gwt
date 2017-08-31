package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsType;

/**
 * JsInterop for QueryList.
 *
 * @param <T> type of object used
 */
@JsType( isNative = true, namespace = "ng.core" )
public class QueryList<T>
{

    public native void forEach( Callback<T> callback );

    @JsFunction
    @FunctionalInterface
    public interface Callback<T>
    {
        void execute( T value );
    }

}

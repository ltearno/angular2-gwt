package fr.lteconsulting.angular2gwt.client.interop.angular.rxjs;

import jsinterop.annotations.JsFunction;

@JsFunction
@FunctionalInterface
public interface MapFunction<T, U>
{
	U map( T input );
}

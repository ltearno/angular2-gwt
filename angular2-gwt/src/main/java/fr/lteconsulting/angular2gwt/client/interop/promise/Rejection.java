package fr.lteconsulting.angular2gwt.client.interop.promise;

import jsinterop.annotations.JsFunction;

@FunctionalInterface
@JsFunction
public interface Rejection<T>
{
	void rejected( T error );
}
